package com.example.bd0631.baseproject.secondScreen

import android.support.v4.app.Fragment
import com.example.bd0631.baseproject.R
import com.example.bd0631.baseproject.base.BaseActivity

class SecondActivity: BaseActivity() {

  override val layoutId = R.layout.second_activity

  override fun getFragment(): Fragment {
    return SecondFragment.newInstance(intent.getStringExtra("TEST"))
  }
}