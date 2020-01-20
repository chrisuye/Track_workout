package com.christian.seyoum.workout

import androidx.room.*

@Dao
interface UserDao {
    @Query("SELECT * FROM user")
    fun getAll(): MutableList<User>

    @Query("SELECT * FROM user WHERE uid IN (:userIds)")
    fun loadAllByIds(userIds: IntArray): MutableList<User>

//    @Query("SELECT * FROM table WHERE first_name LIKE :first AND " +
//            "last_name LIKE :last LIMIT 1")
//    fun findByName(first: String, last: String): User

    @Insert
    fun insertAll(vararg user: User)

    @Delete
    fun delete(user: User)

    @Update
    fun replace(vararg user: User)
}