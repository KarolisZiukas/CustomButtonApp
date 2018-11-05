package com.example.bd0631.baseproject.Database

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.Dao
import android.arch.persistence.room.Query

@Dao
interface BaseDao {

  @Query("SELECT * FROM BaseApplication")
  fun getAllEnitities(): LiveData<List<BaseModel>>

}