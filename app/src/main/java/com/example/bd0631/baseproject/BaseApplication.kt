package com.example.bd0631.baseproject

import android.app.Application
import android.arch.persistence.room.Room
import com.example.bd0631.baseproject.Database.*
import com.example.bd0631.baseproject.Modules.ViewModelModule
import com.example.bd0631.baseproject.mainFragment2.MainViewModel2
import org.koin.android.ext.android.startKoin
import org.koin.android.ext.koin.androidApplication
import org.koin.android.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

class BaseApplication: Application() {

  private val appModule = listOf(BaseRepositoryModule, ViewModelModule)

  override fun onCreate() {
    super.onCreate()
    startKoin(this, appModule)
  }
}