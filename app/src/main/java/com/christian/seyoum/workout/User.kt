package com.christian.seyoum.workout

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(
    @PrimaryKey(autoGenerate = true)
    val uid: Int? = null,
    @ColumnInfo(name = "category_name")
    val category: Int? = null,
    @ColumnInfo(name = "first_name")
    val name: String? = null,
    @ColumnInfo(name = "weight_name")
    val weight: Int? = null,
    @ColumnInfo(name = "set_name")
    val set: Int? = null,
    @ColumnInfo(name = "rep_name")
    val rep: Int? = null,
    @ColumnInfo(name = "note_name")
    val note: String? = null,
    @ColumnInfo(name = "date_name")
    val date: String? = null
)