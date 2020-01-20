package com.christian.seyoum.workout

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), IControl {

    override fun editUser(user: User) {
        workoutTemp.edit(user)
    }

    override fun launchAdd() {
        val intent = Intent(this, AddWork::class.java)
        startActivityForResult(intent, ADD_REQUEST_CODE)
    }

    override fun launchEdit(idx: Int, user: User) {
        val intent = Intent(this, EditWork::class.java)
        val todostring = Gson().toJson(user)
        intent.putExtra("User",todostring)
        intent.putExtra("Idx", idx)
        intent.putExtra("Id", workoutTemp.workouts()[idx].uid)
        startActivityForResult(intent, EDIT_REQUEST_CODE)
    }

    override fun add(user: User) {
        workoutTemp.add(user)
    }

    override fun getWorkouts(): MutableList<User> {
        return workoutTemp.workouts()
    }

    override fun getCount(): Int {
        return workoutTemp.size()
    }

    override fun delete(user: User) {
        workoutTemp.delete(user)
    }

    override fun getall() {
        workoutTemp.all()
    }

    override fun getabs() {
        workoutTemp.abs()
    }

    override fun getarms() {
        workoutTemp.arms()
    }

    override fun getback() {
        workoutTemp.back()
    }

    override fun getcalves() {
        workoutTemp.calves()
    }

    override fun getchest() {
        workoutTemp.chest()
    }

    override fun getlegs() {
        workoutTemp.legs()
    }

    override fun getshoulders() {
        workoutTemp.shoulders()
    }

    override lateinit var workoutTemp: IRepo

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycle_fram.layoutManager = LinearLayoutManager(this)
        recycle_fram.adapter = MainAdapter(this)

        workoutTemp = Repo(this)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId){

            R.id.add_drop -> {
                launchAdd()
                return true
            }
            R.id.all_drop -> {
                getall()
                recycle_fram.adapter?.notifyDataSetChanged()
                Toast.makeText(this,"Showing All",Toast.LENGTH_SHORT).show()
                return true
            }

            R.id.abs_drop -> {

                getabs()
                recycle_fram.adapter?.notifyDataSetChanged()
                Toast.makeText(this,"Showing Abs",Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.arms_drop -> {
                getarms()
                recycle_fram.adapter?.notifyDataSetChanged()
                Toast.makeText(this,"Showing Arms",Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.back_drop -> {
                getback()
                recycle_fram.adapter?.notifyDataSetChanged()
                Toast.makeText(this,"Showing Back",Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.calves_drop -> {
                getcalves()
                recycle_fram.adapter?.notifyDataSetChanged()
                Toast.makeText(this,"Showing Calves",Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.chest_drop -> {
                getchest()
                recycle_fram.adapter?.notifyDataSetChanged()
                Toast.makeText(this,"Showing Chest",Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.legs_drop -> {
                getlegs()
                recycle_fram.adapter?.notifyDataSetChanged()
                Toast.makeText(this,"Showing Legs",Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.shoulders_drop -> {
                getshoulders()
                recycle_fram.adapter?.notifyDataSetChanged()
                Toast.makeText(this,"Showing Shoulders",Toast.LENGTH_SHORT).show()
                return true
            }



            else -> return super.onOptionsItemSelected(item)
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        when(resultCode){
            Activity.RESULT_OK -> {
                when(requestCode){
                    ADD_REQUEST_CODE -> {
                        val json = data?.getStringExtra(AddWork.TODO_EXTRA_KEY)
                        if (json != null){
                            val user = Gson().fromJson<User>(json,User::class.java)
                            workoutTemp.add(user)
                            recycle_fram.adapter?.notifyItemInserted(workoutTemp.size())
                            Toast.makeText(this,"ADDED", Toast.LENGTH_SHORT).show()
                        }

                    }
                    EDIT_REQUEST_CODE -> {
                        val json = data?.getStringExtra(EditWork.TODOE_EXTRA_KEY)
                        val idx = data?.getIntExtra(EditWork.POSITION_KEY,1)
                        if (json != null && idx != null){
                            val user = Gson().fromJson<User>(json,User::class.java)
                            editUser(user)
                            recycle_fram.adapter?.notifyDataSetChanged()
                        }

                    }
                }

            }
            Activity.RESULT_CANCELED -> {
                Toast.makeText(this,"No change", Toast.LENGTH_SHORT).show()
            }
        }
    }

    companion object{
        val ADD_REQUEST_CODE = 1
        val EDIT_REQUEST_CODE = 2
    }


}
