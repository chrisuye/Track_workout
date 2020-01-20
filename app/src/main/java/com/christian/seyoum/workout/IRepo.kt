package com.christian.seyoum.workout

interface IRepo {

    fun size():Int
    fun workouts():MutableList<User>
    fun add(user: User)
    fun delete(user: User)
    fun all()
    fun abs()
    fun arms()
    fun back()
    fun calves()
    fun chest()
    fun legs()
    fun shoulders()
    fun edit(user: User)
}