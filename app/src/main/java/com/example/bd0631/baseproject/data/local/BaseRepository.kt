package com.example.bd0631.baseproject.data.local

import android.arch.lifecycle.LiveData
import com.example.bd0631.baseproject.data.BaseModel

interface BaseRepository {

  fun getAllEntities(): LiveData<List<BaseModel>>

}