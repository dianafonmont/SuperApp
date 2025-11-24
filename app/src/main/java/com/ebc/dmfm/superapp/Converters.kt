package com.ebc.dmfm.superapp

import androidx.room.TypeConverter
import java.util.Date

class Converters {
    @TypeConverter
    fun fromTimestamp(value: Long?): Date? {
        return value?.let{
            Date(it) //es el nombre default
        }

    }

    @TypeConverter
    fun dateToTimestamp(date: Date?): Long?{
        return date?.time
    }
}