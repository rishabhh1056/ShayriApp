package com.example.shayriapp

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date
@Entity(tableName = "shayari_table")
data class DataEntry(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    val id:Int? = null,
    @ColumnInfo(name = "Date")
    val date: Date?=null,
    @ColumnInfo(name = "shayari")
    val shayari:String? = null )
