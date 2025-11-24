package com.ebc.dmfm.superapp.db.models



import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "notes")
data class Note (
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null,

    @ColumnInfo(name = "text")
    var text: String,

    @ColumnInfo(name = "update")
    var update: Date
)