package com.example.bd0631.baseproject.Modules

import com.example.bd0631.baseproject.mainFragment2.MainViewModel2
import com.example.bd0631.baseproject.secondScreen.SecondViewModel
import org.koin.android.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

val ViewModelModule = module {

  viewModel { MainViewModel2(get(), get()) }

  viewModel { SecondViewModel() }

}