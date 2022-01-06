package com.example.dictofon.database

//class Recordingitem {
//}

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "recording_table")
data class RecordingItem(
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0L, // changing on var was val
    @ColumnInfo(name = "name")
    var name: String = "",
    @ColumnInfo(name = "filePath")
    var filePath: String = "",
    @ColumnInfo(name = "length")
    var length: Long = 0L,
    @ColumnInfo(name = "time")
    var time: Long = 0L
)