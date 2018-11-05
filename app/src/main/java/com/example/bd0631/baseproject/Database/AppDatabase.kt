package com.example.bd0631.baseproject.Database

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase

@Database(entities = [(BaseModel::class)], version = 1)
abstract class AppDatabase: RoomDatabase() {

  abstract fun baseDao(): BaseDao

}
