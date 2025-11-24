package com.ebc.dmfm.superapp

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.ebc.dmfm.superapp.db.models.Note

@Dao //Data Access Object
interface NotesDao {
    @Insert
    fun insert(note: Note)
    @Update
    fun update(note: Note)
    @Query("DELETE FROM notes wHERE id = :id")
    fun delete(id: Int)
    @Query("SELECT * FROM notes")
    fun all() : LiveData<List<Note>>
    @Query("SELECT * FROM notes WHERE id = :id")
    fun findById(id: Int) : Note
}