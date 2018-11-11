package com.example.bd0631.baseproject.secondScreen

import android.os.Bundle
import android.view.View
import com.example.bd0631.baseproject.R
import com.example.bd0631.baseproject.base.BaseFragment
import com.example.bd0631.baseproject.databinding.SecondFragmentBinding
import kotlinx.android.synthetic.main.second_fragment.*

class SecondFragment : BaseFragment<SecondFragmentBinding, SecondViewModel>() {

  override val layoutId = R.layout.second_fragment
  override val viewModelClass = SecondViewModel::class

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    val testText = arguments?.getString("TEST")
    if (testText != null) {
      tv_text_message.text = testText
    }
  }


  companion object {
    fun newInstance(test: String): SecondFragment {
      return SecondFragment()
          .apply {
            this.arguments = Bundle().apply {
              putString("TEST", test)
            }
          }
    }
  }
}
