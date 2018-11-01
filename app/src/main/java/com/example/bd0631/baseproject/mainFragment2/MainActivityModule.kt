package com.example.bd0631.baseproject.mainFragment2

import com.example.bd0631.baseproject.di.FragmentScoped
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class MainActivityModule {

  @FragmentScoped
  @ContributesAndroidInjector
  abstract fun mainFragment2(): MainFragment2

}