package com.example.bd0631.baseproject.data.local

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.example.bd0631.baseproject.data.BaseModel

@Database(entities = [(BaseModel::class)], version = 1)
abstract class AppDatabase: RoomDatabase() {

  abstract fun baseDao(): BaseDao

}
