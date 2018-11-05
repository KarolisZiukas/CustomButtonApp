package com.example.bd0631.baseproject.mainFragment2

import android.arch.lifecycle.MutableLiveData
import com.example.bd0631.baseproject.Database.BaseRepository
import com.example.bd0631.baseproject.base.BaseViewModel
import javax.inject.Inject

class MainViewModel2 @Inject constructor(): BaseViewModel() {

  val isLoading = MutableLiveData<Boolean>()

}