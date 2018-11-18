package com.example.bd0631.baseproject

import android.app.Application
import com.example.bd0631.baseproject.data.*
import com.example.bd0631.baseproject.data.remote.NetModule
import com.example.bd0631.baseproject.Modules.ViewModelModule
import org.koin.android.ext.android.startKoin

class BaseApplication: Application() {

  private val appModule = listOf(BaseRepositoryModule, ViewModelModule, NetModule)

  override fun onCreate() {
    super.onCreate()
    startKoin(this, appModule)
  }
}