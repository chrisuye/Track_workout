package com.christian.seyoum.workout

import android.content.Context
import androidx.room.Room

class Repo(context: Context):IRepo {

    private var temp: MutableList<User> = mutableListOf()

    var location: Int

    private val db:AppDatabase

    init {
        db = Room.databaseBuilder(
            context,
            AppDatabase::class.java, "database-name"
        ).allowMainThreadQueries()
            .build()

        location = 0
        temp = db.userDao().getAll()

    }

    override fun edit(user: User) {
        db.userDao().replace(user)
        temp.clear()

        when(location){
            0 ->{
                temp = db.userDao().getAll()
            }
            1 ->{
                for (n in db.userDao().getAll()){
                    if (n.category == 0){
                        temp.add(n)
                    }
                }
            }
            2 ->{
                for (n in db.userDao().getAll()){
                    if (n.category == 1){
                        temp.add(n)
                    }
                }
            }
            3 ->{
                for (n in db.userDao().getAll()){
                    if (n.category == 2){
                        temp.add(n)
                    }
                }
            }
            4 ->{
                for (n in db.userDao().getAll()){
                    if (n.category == 3){
                        temp.add(n)
                    }
                }
            }
            5 ->{
                for (n in db.userDao().getAll()){
                    if (n.category == 4){
                        temp.add(n)
                    }
                }
            }
            6 ->{
                for (n in db.userDao().getAll()){
                    if (n.category == 5){
                        temp.add(n)
                    }
                }
            }
            7 ->{
                for (n in db.userDao().getAll()){
                    if (n.category == 6){
                        temp.add(n)
                    }
                }
            }
        }
    }
    override fun size(): Int {
        return temp.size
    }

    override fun workouts(): MutableList<User> {
        return temp
    }

    override fun add(user: User) {
        db.userDao().insertAll(user)
        temp.clear()
        when(location){
            0 ->{
                temp = db.userDao().getAll()
            }
            1 ->{
                for (n in db.userDao().getAll()){
                    if (n.category == 0){
                        temp.add(n)
                    }
                }
            }
            2 ->{
                for (n in db.userDao().getAll()){
                    if (n.category == 1){
                        temp.add(n)
                    }
                }
            }
            3 ->{
                for (n in db.userDao().getAll()){
                    if (n.category == 2){
                        temp.add(n)
                    }
                }
            }
            4 ->{
                for (n in db.userDao().getAll()){
                    if (n.category == 3){
                        temp.add(n)
                    }
                }
            }
            5 ->{
                for (n in db.userDao().getAll()){
                    if (n.category == 4){
                        temp.add(n)
                    }
                }
            }
            6 ->{
                for (n in db.userDao().getAll()){
                    if (n.category == 5){
                        temp.add(n)
                    }
                }
            }
            7 ->{
                for (n in db.userDao().getAll()){
                    if (n.category == 6){
                        temp.add(n)
                    }
                }
            }
        }
    }

    override fun delete(user: User) {
        db.userDao().delete(user)
        temp.clear()

        when(location){
            0 ->{
                temp = db.userDao().getAll()
            }
            1 ->{
                for (n in db.userDao().getAll()){
                    if (n.category == 0){
                        temp.add(n)
                    }
                }
            }
            2 ->{
                for (n in db.userDao().getAll()){
                    if (n.category == 1){
                        temp.add(n)
                    }
                }
            }
            3 ->{
                for (n in db.userDao().getAll()){
                    if (n.category == 2){
                        temp.add(n)
                    }
                }
            }
            4 ->{
                for (n in db.userDao().getAll()){
                    if (n.category == 3){
                        temp.add(n)
                    }
                }
            }
            5 ->{
                for (n in db.userDao().getAll()){
                    if (n.category == 4){
                        temp.add(n)
                    }
                }
            }
            6 ->{
                for (n in db.userDao().getAll()){
                    if (n.category == 5){
                        temp.add(n)
                    }
                }
            }
            7 ->{
                for (n in db.userDao().getAll()){
                    if (n.category == 6){
                        temp.add(n)
                    }
                }
            }
        }
    }

    override fun all() {
        location = 0
        temp.clear()
        temp = db.userDao().getAll()
    }

    override fun abs() {
        location = 1
        temp.clear()

        for (n in db.userDao().getAll()){
            if (n.category == 0){
                temp.add(n)
            }
        }
    }

    override fun arms() {
        location = 2
        temp.clear()

        for (n in db.userDao().getAll()){
            if (n.category == 1){
                temp.add(n)
            }
        }
    }

    override fun back() {
        location = 3
        temp.clear()

        for (n in db.userDao().getAll()){
            if (n.category == 2){
                temp.add(n)
            }
        }
    }

    override fun calves() {
        location = 4
        temp.clear()

        for (n in db.userDao().getAll()){
            if (n.category == 3){
                temp.add(n)
            }
        }
    }

    override fun chest() {
        location = 5
        temp.clear()

        for (n in db.userDao().getAll()){
            if (n.category == 4){
                temp.add(n)
            }
        }
    }

    override fun legs() {
        location = 6
        temp.clear()

        for (n in db.userDao().getAll()){
            if (n.category == 5){
                temp.add(n)
            }
        }
    }

    override fun shoulders() {
        location = 7
        temp.clear()

        for (n in db.userDao().getAll()){
            if (n.category == 6){
                temp.add(n)
            }
        }
    }
}