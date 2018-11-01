package com.example.bd0631.baseproject

import android.app.Activity
import com.example.bd0631.baseproject.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject



class BaseApplication: DaggerApplication(), HasActivityInjector {

  @Inject
  lateinit var dispatchingActivityInjector: DispatchingAndroidInjector<Activity>

  override fun applicationInjector(): AndroidInjector<out DaggerApplication>? {
    return DaggerAppComponent.builder().application(this).build()
  }

  override fun activityInjector(): DispatchingAndroidInjector<Activity> {
    return dispatchingActivityInjector
  }


}