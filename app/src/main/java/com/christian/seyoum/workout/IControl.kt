package com.christian.seyoum.workout

interface IControl {

    fun add(user: User)
    fun getWorkouts():MutableList<User>
    fun getCount():Int
    fun delete(user: User)
    fun getall()
    fun getabs()
    fun getarms()
    fun getback()
    fun getcalves()
    fun getchest()
    fun getlegs()
    fun getshoulders()
    fun launchEdit(idx:Int, user: User)
    fun launchAdd()
    fun editUser(user: User)

    val workoutTemp:IRepo

}