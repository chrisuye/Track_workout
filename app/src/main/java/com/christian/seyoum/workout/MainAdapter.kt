package com.christian.seyoum.workout

import android.app.AlertDialog
import android.content.DialogInterface
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.workout.view.*

class MainAdapter (val controller:IControl): RecyclerView.Adapter<CustomViewHolder>(){
    override fun getItemCount(): Int {
        return controller.getCount()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val layoutInflater = LayoutInflater.from(parent?.context).inflate(R.layout.workout, parent, false)
        val viewHolder = CustomViewHolder(layoutInflater)

        layoutInflater.setOnClickListener {
            val position = viewHolder.adapterPosition

            val user = controller.workoutTemp.workouts()[position]
            val idx = position
            controller.launchEdit(idx, user)

        }

        layoutInflater.setOnLongClickListener {
            val position = viewHolder.adapterPosition
            val dialogBuilder = AlertDialog.Builder(layoutInflater.context)
            val user = controller.workoutTemp.workouts()[position]


            dialogBuilder.setMessage("Do you want to delete?")

                .setCancelable(false)

                .setPositiveButton("Proceed", DialogInterface.OnClickListener {
                        dialog, id -> controller.delete(user)
                    this.notifyItemRemoved(position)
                })

                .setNegativeButton("Cancel", DialogInterface.OnClickListener {
                        dialog, id -> dialog.cancel()
                })


            val alert = dialogBuilder.create()

            alert.setTitle(controller.workoutTemp.workouts()[position].name)

            alert.show()

            return@setOnLongClickListener true
        }


        return viewHolder
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val user = controller.workoutTemp.workouts()[position]

        holder.BindTodo(user)
    }

}

class CustomViewHolder(view: View): RecyclerView.ViewHolder(view) {

    fun BindTodo(user: User?) {
        itemView.workout_view.text = user?.name.toString()
        itemView.weight_view.text = "Weight "+user?.weight.toString()
        itemView.set_view.text = "Sets "+user?.set.toString()
        itemView.rep_view.text = "Reps "+user?.rep.toString()
        itemView.date_view.text = user?.date.toString()

        when(user?.category){
            0 -> itemView.category_view.text = "Abs"
            1 -> itemView.category_view.text = "Arms"
            2 -> itemView.category_view.text = "Back"
            3 -> itemView.category_view.text = "Calves"
            4 -> itemView.category_view.text = "Chest"
            5 -> itemView.category_view.text = "Legs"
            6 -> itemView.category_view.text = "Shoulders"
        }
    }
}
