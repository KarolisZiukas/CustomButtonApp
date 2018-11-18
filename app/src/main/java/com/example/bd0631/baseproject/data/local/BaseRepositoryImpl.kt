package com.example.bd0631.baseproject.data.local

import android.arch.lifecycle.LiveData
import com.example.bd0631.baseproject.data.BaseModel
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class BaseRepositoryImpl @Inject constructor(private val baseDao: BaseDao): BaseRepository {

  override fun getAllEntities(): LiveData<List<BaseModel>> {
    return baseDao.getAllEnitities()
  }
}