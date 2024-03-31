package com.example.shayriapp

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update

@Dao
interface  shayariDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertShayari( dataEntry: DataEntry)

    @Delete
    suspend fun deleteShayari(dataEntry: DataEntry)

    @Update
    suspend fun updateShayari(dataEntry: DataEntry)


    @Query("SELECT * FROM SHAYARI_TABLE ORDER BY Date DESC")
    fun getAllShayari():List<DataEntry>
}