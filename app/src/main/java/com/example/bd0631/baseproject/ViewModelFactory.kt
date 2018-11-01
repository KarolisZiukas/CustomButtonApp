package com.example.bd0631.baseproject

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import dagger.Lazy

class ViewModelFactory<T : ViewModel> (
    private val viewModel: Lazy<T>
): ViewModelProvider.Factory {

  override fun <T : ViewModel?> create(modelClass: Class<T>): T = viewModel.get() as T
}