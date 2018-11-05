package com.example.bd0631.baseproject.Database

import android.arch.lifecycle.LiveData

interface BaseRepository {

  fun getAllEntities(): LiveData<List<BaseModel>>

}