package com.example.bd0631.baseproject.mainFragment2

import com.example.bd0631.baseproject.R
import com.example.bd0631.baseproject.base.BaseActivity

class MainActivity: BaseActivity() {

  override val layoutId = R.layout.main_activity

  override fun getFragment() = MainFragment.newInstance()
}
