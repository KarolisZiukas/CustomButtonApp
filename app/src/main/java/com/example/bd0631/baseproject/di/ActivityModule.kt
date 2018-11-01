package com.example.bd0631.baseproject.di

import com.example.bd0631.baseproject.mainFragment2.MainActivity
import com.example.bd0631.baseproject.mainFragment2.MainActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {

  @ActivityScoped
  @ContributesAndroidInjector(modules =  [(MainActivityModule::class)])
  abstract fun mainActivity(): MainActivity

}