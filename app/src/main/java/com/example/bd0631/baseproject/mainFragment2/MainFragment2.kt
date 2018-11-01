package com.example.bd0631.baseproject.mainFragment2

import android.arch.lifecycle.Observer
import android.util.Log
import com.example.bd0631.baseproject.R
import com.example.bd0631.baseproject.base.BaseFragment
import com.example.bd0631.baseproject.databinding.MainFragmentBinding
import javax.inject.Inject

class MainFragment2 @Inject constructor():
    BaseFragment<MainFragmentBinding, MainViewModel2>()
{

  override val layoutId: Int  = R.layout.main_fragment
  override val viewModelClass = MainViewModel2::class.java

  companion object {
    fun newInstance() = MainFragment2()
  }

  override fun onObserve(viewModel: MainViewModel2) {
    super.onObserve(viewModel)
    viewModel.isLoading.observe(this, Observer {
      Log.d("Observed", "Observed")
    })
  }
}