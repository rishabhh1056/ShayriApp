package com.example.shayriapp

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverter
import androidx.room.TypeConverters
import java.time.Instant


@Database(entities = [DataEntry::class],
    version = 1,
    exportSchema = true
)

@TypeConverters(DateConvertor::class)
abstract class shayariDatabase :RoomDatabase() {

    abstract fun getShayariDao():shayariDao

    private var Instant:shayariDatabase? = null

    fun getDatabase(context: Context):shayariDatabase
    {
        if (Instant != null)
        {

            synchronized(this)
            {
                Instant = Room.databaseBuilder(context.applicationContext, shayariDatabase::class.java, "shayari_Database").build()
            }
        }
        return Instant!!
    }
}