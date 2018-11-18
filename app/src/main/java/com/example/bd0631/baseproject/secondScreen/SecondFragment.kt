package com.example.bd0631.baseproject.secondScreen

import android.os.Bundle
import com.example.bd0631.baseproject.R
import com.example.bd0631.baseproject.base.BaseFragment
import com.example.bd0631.baseproject.databinding.SecondFragmentBinding

class SecondFragment : BaseFragment<SecondFragmentBinding, SecondViewModel>() {

  override val layoutId = R.layout.second_fragment
  override val viewModelClass = SecondViewModel::class

  companion object {
    fun newInstance(test: String): SecondFragment {
      return SecondFragment()
          .apply {
            this.arguments = Bundle().apply {
              putString("TESTss", test)
            }
          }
    }
  }
}
