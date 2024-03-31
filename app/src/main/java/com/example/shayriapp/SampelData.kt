package com.example.shayriapp

import java.util.Calendar
import java.util.Date
import java.util.GregorianCalendar

object SampelData {

    val data1 = "this is data 1 "
    val data2 = "this data 2"

    fun getDate(diff:Int): Date
    {
     val calendar = GregorianCalendar()
        calendar.add(Calendar.MILLISECOND,diff)
        return calendar.time
    }

    val data: List<DataEntry>

        get()
        {
            val tempList:MutableList<DataEntry> = ArrayList()
            tempList.add(DataEntry(1, getDate(45), data1))
            tempList.add(DataEntry(2, getDate(46), data2))
          return tempList
        }
}