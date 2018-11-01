package com.example.bd0631.baseproject.di

import android.app.Application
import com.example.bd0631.baseproject.BaseApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component (modules =  [
  (ActivityModule::class),
  (AndroidSupportInjectionModule::class) ])
interface AppComponent: AndroidInjector<BaseApplication> {

  @Component.Builder
  interface Builder {

    @BindsInstance
    fun application(application: Application): AppComponent.Builder

    fun build(): AppComponent
  }
}