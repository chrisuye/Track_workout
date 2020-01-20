package com.christian.seyoum.workout

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_add_work.*
import java.text.SimpleDateFormat
import java.util.*

class AddWork : AppCompatActivity(), View.OnClickListener {

    override fun onClick(view: View?) {
        when(view?.id){
            R.id.save_btn -> {

                when(catogory_in.checkedRadioButtonId){
                    R.id.abs_in -> {
                        val names = name_in.text.toString()
                        val weights = weight_in.text.toString()
                        val sets = set_in.text.toString()
                        val reps = rep_in.text.toString()
                        if (names.isEmpty() || weights.isEmpty() || sets.isEmpty() || reps.isEmpty()){
                            Toast.makeText(this,"Missing Title or Content", Toast.LENGTH_SHORT).show()
                        }
                        else{
                            val intent = Intent()
                            val today = Calendar.getInstance()
                            val date = SimpleDateFormat("MMMM d Y").format(today.time)
                            val name = name_in.text.toString()
                            val weight = weight_in.text.toString().toInt()
                            val set = set_in.text.toString().toInt()
                            val rep = rep_in.text.toString().toInt()
                            val note = note_in.text.toString()

                            val user = User(null,0,name,weight,set,rep,note,date)
                            val json = Gson().toJson(user)
                            intent.putExtra(TODO_EXTRA_KEY, json)
                            setResult(Activity.RESULT_OK, intent)
                            finish()
                        }

                    }
                    R.id.arms_in -> {
                        val names = name_in.text.toString()
                        val weights = weight_in.text.toString()
                        val sets = set_in.text.toString()
                        val reps = rep_in.text.toString()
                        if (names.isEmpty() || weights.isEmpty() || sets.isEmpty() || reps.isEmpty()){
                            Toast.makeText(this,"Missing Title or Content", Toast.LENGTH_SHORT).show()
                        }
                        else{
                            val intent = Intent()
                            val today = Calendar.getInstance()
                            val date = SimpleDateFormat("MMMM d Y").format(today.time)
                            val name = name_in.text.toString()
                            val weight = weight_in.text.toString().toInt()
                            val set = set_in.text.toString().toInt()
                            val rep = rep_in.text.toString().toInt()
                            val note = note_in.text.toString()

                            val user = User(null,1,name,weight,set,rep,note,date)
                            val json = Gson().toJson(user)
                            intent.putExtra(TODO_EXTRA_KEY, json)
                            setResult(Activity.RESULT_OK, intent)
                            finish()
                        }

                    }
                    R.id.back_in -> {
                        val names = name_in.text.toString()
                        val weights = weight_in.text.toString()
                        val sets = set_in.text.toString()
                        val reps = rep_in.text.toString()
                        if (names.isEmpty() || weights.isEmpty() || sets.isEmpty() || reps.isEmpty()){
                            Toast.makeText(this,"Missing Title or Content", Toast.LENGTH_SHORT).show()
                        }
                        else{
                            val intent = Intent()
                            val today = Calendar.getInstance()
                            val date = SimpleDateFormat("MMMM d Y").format(today.time)
                            val name = name_in.text.toString()
                            val weight = weight_in.text.toString().toInt()
                            val set = set_in.text.toString().toInt()
                            val rep = rep_in.text.toString().toInt()
                            val note = note_in.text.toString()

                            val user = User(null,2,name,weight,set,rep,note,date)
                            val json = Gson().toJson(user)
                            intent.putExtra(TODO_EXTRA_KEY, json)
                            setResult(Activity.RESULT_OK, intent)
                            finish()
                        }

                    }
                    R.id.calves_in -> {
                        val names = name_in.text.toString()
                        val weights = weight_in.text.toString()
                        val sets = set_in.text.toString()
                        val reps = rep_in.text.toString()
                        if (names.isEmpty() || weights.isEmpty() || sets.isEmpty() || reps.isEmpty()){
                            Toast.makeText(this,"Missing Title or Content", Toast.LENGTH_SHORT).show()
                        }
                        else{
                            val intent = Intent()
                            val today = Calendar.getInstance()
                            val date = SimpleDateFormat("MMMM d Y").format(today.time)
                            val name = name_in.text.toString()
                            val weight = weight_in.text.toString().toInt()
                            val set = set_in.text.toString().toInt()
                            val rep = rep_in.text.toString().toInt()
                            val note = note_in.text.toString()

                            val user = User(null,3,name,weight,set,rep,note,date)
                            val json = Gson().toJson(user)
                            intent.putExtra(TODO_EXTRA_KEY, json)
                            setResult(Activity.RESULT_OK, intent)
                            finish()
                        }

                    }
                    R.id.chest_in -> {
                        val names = name_in.text.toString()
                        val weights = weight_in.text.toString()
                        val sets = set_in.text.toString()
                        val reps = rep_in.text.toString()
                        if (names.isEmpty() || weights.isEmpty() || sets.isEmpty() || reps.isEmpty()){
                            Toast.makeText(this,"Missing Title or Content", Toast.LENGTH_SHORT).show()
                        }
                        else{
                            val intent = Intent()
                            val today = Calendar.getInstance()
                            val date = SimpleDateFormat("MMMM d Y").format(today.time)
                            val name = name_in.text.toString()
                            val weight = weight_in.text.toString().toInt()
                            val set = set_in.text.toString().toInt()
                            val rep = rep_in.text.toString().toInt()
                            val note = note_in.text.toString()

                            val user = User(null,4,name,weight,set,rep,note,date)
                            val json = Gson().toJson(user)
                            intent.putExtra(TODO_EXTRA_KEY, json)
                            setResult(Activity.RESULT_OK, intent)
                            finish()
                        }

                    }
                    R.id.legs_in ->{
                        val names = name_in.text.toString()
                        val weights = weight_in.text.toString()
                        val sets = set_in.text.toString()
                        val reps = rep_in.text.toString()
                        if (names.isEmpty() || weights.isEmpty() || sets.isEmpty() || reps.isEmpty()){
                            Toast.makeText(this,"Missing Title or Content", Toast.LENGTH_SHORT).show()
                        }
                        else{
                            val intent = Intent()
                            val today = Calendar.getInstance()
                            val date = SimpleDateFormat("MMMM d Y").format(today.time)
                            val name = name_in.text.toString()
                            val weight = weight_in.text.toString().toInt()
                            val set = set_in.text.toString().toInt()
                            val rep = rep_in.text.toString().toInt()
                            val note = note_in.text.toString()

                            val user = User(null,5,name,weight,set,rep,note,date)
                            val json = Gson().toJson(user)
                            intent.putExtra(TODO_EXTRA_KEY, json)
                            setResult(Activity.RESULT_OK, intent)
                            finish()
                        }

                    }
                    R.id.shoulders_in -> {
                        val names = name_in.text.toString()
                        val weights = weight_in.text.toString()
                        val sets = set_in.text.toString()
                        val reps = rep_in.text.toString()
                        if (names.isEmpty() || weights.isEmpty() || sets.isEmpty() || reps.isEmpty()){
                            Toast.makeText(this,"Missing Title or Content", Toast.LENGTH_SHORT).show()
                        }
                        else{
                            val intent = Intent()
                            val today = Calendar.getInstance()
                            val date = SimpleDateFormat("MMMM d Y").format(today.time)
                            val name = name_in.text.toString()
                            val weight = weight_in.text.toString().toInt()
                            val set = set_in.text.toString().toInt()
                            val rep = rep_in.text.toString().toInt()
                            val note = note_in.text.toString()

                            val user = User(null,6,name,weight,set,rep,note,date)
                            val json = Gson().toJson(user)
                            intent.putExtra(TODO_EXTRA_KEY, json)
                            setResult(Activity.RESULT_OK, intent)
                            finish()
                        }

                    }
                    else -> Toast.makeText(this, "need to pick a category", Toast.LENGTH_SHORT).show()
                }


            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_work)

        save_btn.setOnClickListener(this)
    }

    companion object{
        val TODO_EXTRA_KEY = "Todo"
    }
}
