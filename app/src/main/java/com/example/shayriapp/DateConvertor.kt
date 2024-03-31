package com.example.shayriapp

import java.util.Date

class DateConvertor {

    public fun toTimestamp(date:Date):Long?{
        return date.time
    }

    public fun toDate(long:Long):Date{
        return long.let { Date(it) }
    }
}