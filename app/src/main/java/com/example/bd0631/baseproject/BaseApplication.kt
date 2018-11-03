package com.example.bd0631.baseproject

import android.app.Application
import com.example.bd0631.baseproject.mainFragment2.MainViewModel2
import org.koin.android.ext.android.startKoin
import org.koin.android.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

class BaseApplication: Application() {

  private val appModule = module {
    viewModel { MainViewModel2()}
  }

  override fun onCreate() {
    super.onCreate()
    startKoin(this, listOf(appModule))
  }


}