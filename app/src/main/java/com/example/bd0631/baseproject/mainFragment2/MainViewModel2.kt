package com.example.bd0631.baseproject.mainFragment2

import android.arch.lifecycle.MutableLiveData
import android.util.Log
import com.example.bd0631.baseproject.Database.BaseRepository
import com.example.bd0631.baseproject.base.BaseViewModel
import javax.inject.Inject

class MainViewModel2 @Inject constructor(val repo: BaseRepository) : BaseViewModel() {

  val isLoading = MutableLiveData<Boolean>()

  fun onTextClick() {
    Log.d("REPO DYZEL", "REPO DYZEL")
    isLoading.value = false
  }

  fun doSomethingFunny() {
    Log.d("REPO DYZEL", "REPO DYZEL")
    isLoading.value = false
  }
}