package com.example.bd0631.baseproject.Database

import android.arch.persistence.room.Room
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module.module

val BaseRepositoryModule = module {

  single {
    Room.databaseBuilder(androidApplication(), AppDatabase::class.java, "base-db")
        .build()
  }

  single {
    get<AppDatabase>().baseDao()
  }

  single { BaseRepositoryImpl(get()) as BaseRepository }

}