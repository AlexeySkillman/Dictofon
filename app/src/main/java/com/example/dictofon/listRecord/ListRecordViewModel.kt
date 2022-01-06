package com.example.dictofon.listRecord

import androidx.lifecycle.ViewModel
import com.example.dictofon.database.RecordDatabaseDao

class ListRecordViewModel (
    dataSource: RecordDatabaseDao
) : ViewModel() {

    val database = dataSource
    val records = database.getAllRecords()
}