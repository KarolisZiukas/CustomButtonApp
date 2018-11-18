package com.example.bd0631.baseproject.data.local

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.Dao
import android.arch.persistence.room.Query
import com.example.bd0631.baseproject.data.BaseModel

@Dao
interface BaseDao {

  @Query("SELECT * FROM BaseApplication")
  fun getAllEnitities(): LiveData<List<BaseModel>>

}