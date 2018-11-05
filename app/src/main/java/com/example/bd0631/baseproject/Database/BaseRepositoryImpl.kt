package com.example.bd0631.baseproject.Database

import android.arch.lifecycle.LiveData
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class BaseRepositoryImpl @Inject constructor(private val baseDao: BaseDao): BaseRepository {

  override fun getAllEntities(): LiveData<List<BaseModel>> {
    return baseDao.getAllEnitities()
  }
}