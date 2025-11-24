package com.ebc.dmfm.superapp

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.ebc.dmfm.superapp.db.models.Note


@Database(entities = [(Note::class)], version = 1, exportSchema = false)
abstract class NotesDatabase : RoomDatabase(){

    abstract fun notesDao() : NotesDao

    companion object {
        private var INSTANCE: NotesDatabase? = null

        fun getInstance(context: Context) : NotesDatabase {
            synchronized(this) {
                var instance = this.INSTANCE

                if(instance == null){
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        NotesDatabase::class.java,
                        ""
                    )
                        .fallbackToDestructiveMigration()
                        .build()

                    this.INSTANCE = instance
                    return instance
                } else {
                    return instance
                }
            }
        }
    }
}