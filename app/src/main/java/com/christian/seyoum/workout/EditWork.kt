package com.christian.seyoum.workout

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_edit_work.*
import java.text.SimpleDateFormat
import java.util.*

class EditWork : AppCompatActivity(), View.OnClickListener {

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.edit_btn ->{
                when(category_edit.checkedRadioButtonId){
                    R.id.abs_edit -> {
                        val names = name_edit.text.toString()
                        val weights = weight_edit.text.toString()
                        val sets = set_edit.text.toString()
                        val reps = rep_edit.text.toString()
                        if (names.isEmpty() || weights.isEmpty() || sets.isEmpty() || reps.isEmpty()){
                            Toast.makeText(this,"Missing Title or Content", Toast.LENGTH_SHORT).show()
                        }
                        else {
                            val intent = Intent()
                            val today = Calendar.getInstance()
                            val date = SimpleDateFormat("MMMM d Y").format(today.time)
                            val name = name_edit.text.toString()
                            val weight = weight_edit.text.toString().toInt()
                            val set = set_edit.text.toString().toInt()
                            val rep = rep_edit.text.toString().toInt()
                            val note = note_edit.text.toString()
                            val idx = intent.getIntExtra("Idx",-1)
                            val id = intent.getIntExtra("Id",-1)

                            val user = User(id, 0, name, weight, set, rep, note, date)
                            val json = Gson().toJson(user)
                            intent.putExtra(TODOE_EXTRA_KEY, json)
                            intent.putExtra(POSITION_KEY, idx)
                            setResult(Activity.RESULT_OK, intent)
                            finish()
                        }

                    }
                    R.id.arms_edit -> {
                        val names = name_edit.text.toString()
                        val weights = weight_edit.text.toString()
                        val sets = set_edit.text.toString()
                        val reps = rep_edit.text.toString()
                        if (names.isEmpty() || weights.isEmpty() || sets.isEmpty() || reps.isEmpty()){
                            Toast.makeText(this,"Missing Title or Content", Toast.LENGTH_SHORT).show()
                        }
                        else {
                            val intent = Intent()
                            val today = Calendar.getInstance()
                            val date = SimpleDateFormat("MMMM d Y").format(today.time)
                            val name = name_edit.text.toString()
                            val weight = weight_edit.text.toString().toInt()
                            val set = set_edit.text.toString().toInt()
                            val rep = rep_edit.text.toString().toInt()
                            val note = note_edit.text.toString()
                            val idx = intent.getIntExtra("Idx",-1)
                            val id = intent.getIntExtra("Id",-1)

                            val user = User(id, 1, name, weight, set, rep, note, date)
                            val json = Gson().toJson(user)
                            intent.putExtra(TODOE_EXTRA_KEY, json)
                            intent.putExtra(POSITION_KEY, idx)
                            setResult(Activity.RESULT_OK, intent)
                            finish()
                        }

                    }
                    R.id.back_edit -> {
                        val names = name_edit.text.toString()
                        val weights = weight_edit.text.toString()
                        val sets = set_edit.text.toString()
                        val reps = rep_edit.text.toString()
                        if (names.isEmpty() || weights.isEmpty() || sets.isEmpty() || reps.isEmpty()){
                            Toast.makeText(this,"Missing Title or Content", Toast.LENGTH_SHORT).show()
                        }
                        else {
                            val intent = Intent()
                            val today = Calendar.getInstance()
                            val date = SimpleDateFormat("MMMM d Y").format(today.time)
                            val name = name_edit.text.toString()
                            val weight = weight_edit.text.toString().toInt()
                            val set = set_edit.text.toString().toInt()
                            val rep = rep_edit.text.toString().toInt()
                            val note = note_edit.text.toString()
                            val idx = intent.getIntExtra("Idx",-1)
                            val id = intent.getIntExtra("Id",-1)

                            val user = User(id, 2, name, weight, set, rep, note, date)
                            val json = Gson().toJson(user)
                            intent.putExtra(TODOE_EXTRA_KEY, json)
                            intent.putExtra(POSITION_KEY, idx)
                            setResult(Activity.RESULT_OK, intent)
                            finish()
                        }

                    }
                    R.id.calves_edit -> {
                        val names = name_edit.text.toString()
                        val weights = weight_edit.text.toString()
                        val sets = set_edit.text.toString()
                        val reps = rep_edit.text.toString()
                        if (names.isEmpty() || weights.isEmpty() || sets.isEmpty() || reps.isEmpty()){
                            Toast.makeText(this,"Missing Title or Content", Toast.LENGTH_SHORT).show()
                        }
                        else {
                            val intent = Intent()
                            val today = Calendar.getInstance()
                            val date = SimpleDateFormat("MMMM d Y").format(today.time)
                            val name = name_edit.text.toString()
                            val weight = weight_edit.text.toString().toInt()
                            val set = set_edit.text.toString().toInt()
                            val rep = rep_edit.text.toString().toInt()
                            val note = note_edit.text.toString()
                            val idx = intent.getIntExtra("Idx",-1)
                            val id = intent.getIntExtra("Id",-1)

                            val user = User(id, 3, name, weight, set, rep, note, date)
                            val json = Gson().toJson(user)
                            intent.putExtra(TODOE_EXTRA_KEY, json)
                            intent.putExtra(POSITION_KEY, idx)
                            setResult(Activity.RESULT_OK, intent)
                            finish()
                        }

                    }
                    R.id.chest_edit -> {
                        val names = name_edit.text.toString()
                        val weights = weight_edit.text.toString()
                        val sets = set_edit.text.toString()
                        val reps = rep_edit.text.toString()
                        if (names.isEmpty() || weights.isEmpty() || sets.isEmpty() || reps.isEmpty()){
                            Toast.makeText(this,"Missing Title or Content", Toast.LENGTH_SHORT).show()
                        }
                        else {
                            val intent = Intent()
                            val today = Calendar.getInstance()
                            val date = SimpleDateFormat("MMMM d Y").format(today.time)
                            val name = name_edit.text.toString()
                            val weight = weight_edit.text.toString().toInt()
                            val set = set_edit.text.toString().toInt()
                            val rep = rep_edit.text.toString().toInt()
                            val note = note_edit.text.toString()
                            val idx = intent.getIntExtra("Idx",-1)
                            val id = intent.getIntExtra("Id",-1)

                            val user = User(id, 4, name, weight, set, rep, note, date)
                            val json = Gson().toJson(user)
                            intent.putExtra(TODOE_EXTRA_KEY, json)
                            intent.putExtra(POSITION_KEY, idx)
                            setResult(Activity.RESULT_OK, intent)
                            finish()
                        }

                    }
                    R.id.legs_edit -> {
                        val names = name_edit.text.toString()
                        val weights = weight_edit.text.toString()
                        val sets = set_edit.text.toString()
                        val reps = rep_edit.text.toString()
                        if (names.isEmpty() || weights.isEmpty() || sets.isEmpty() || reps.isEmpty()){
                            Toast.makeText(this,"Missing Title or Content", Toast.LENGTH_SHORT).show()
                        }
                        else {
                            val intent = Intent()
                            val today = Calendar.getInstance()
                            val date = SimpleDateFormat("MMMM d Y").format(today.time)
                            val name = name_edit.text.toString()
                            val weight = weight_edit.text.toString().toInt()
                            val set = set_edit.text.toString().toInt()
                            val rep = rep_edit.text.toString().toInt()
                            val note = note_edit.text.toString()
                            val idx = intent.getIntExtra("Idx",-1)
                            val id = intent.getIntExtra("Id",-1)

                            val user = User(id, 5, name, weight, set, rep, note, date)
                            val json = Gson().toJson(user)
                            intent.putExtra(TODOE_EXTRA_KEY, json)
                            intent.putExtra(POSITION_KEY, idx)
                            setResult(Activity.RESULT_OK, intent)
                            finish()
                        }

                    }
                    R.id.shoulders_edit -> {
                        val names = name_edit.text.toString()
                        val weights = weight_edit.text.toString()
                        val sets = set_edit.text.toString()
                        val reps = rep_edit.text.toString()
                        if (names.isEmpty() || weights.isEmpty() || sets.isEmpty() || reps.isEmpty()){
                            Toast.makeText(this,"Missing Title or Content", Toast.LENGTH_SHORT).show()
                        }
                        else {
                            val intent = Intent()
                            val today = Calendar.getInstance()
                            val date = SimpleDateFormat("MMMM d Y").format(today.time)
                            val name = name_edit.text.toString()
                            val weight = weight_edit.text.toString().toInt()
                            val set = set_edit.text.toString().toInt()
                            val rep = rep_edit.text.toString().toInt()
                            val note = note_edit.text.toString()
                            val idx = intent.getIntExtra("Idx",-1)
                            val id = intent.getIntExtra("Id",-1)

                            val user = User(id, 6, name, weight, set, rep, note, date)
                            val json = Gson().toJson(user)
                            intent.putExtra(TODOE_EXTRA_KEY, json)
                            intent.putExtra(POSITION_KEY, idx)
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
        setContentView(R.layout.activity_edit_work)

        val json = intent.getStringExtra("User")

        val user = Gson().fromJson<User>(json, User::class.java)


        name_edit.setText(user.name)
        weight_edit.setText(user.weight.toString())
        set_edit.setText(user.set.toString())
        rep_edit.setText(user.rep.toString())
        note_edit.setText(user.note)
        when(user.category){
            0 -> abs_edit.isChecked = true
            1 -> arms_edit.isChecked = true
            2 -> back_edit.isChecked = true
            3 -> calves_edit.isChecked = true
            4 -> chest_edit.isChecked = true
            5 -> legs_edit.isChecked = true
            6 -> shoulders_edit.isChecked = true
        }



        edit_btn.setOnClickListener(this)
    }

    companion object{
        val TODOE_EXTRA_KEY = "Todo"
        val POSITION_KEY = "idx"
    }


}
