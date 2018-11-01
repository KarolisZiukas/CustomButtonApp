package com.example.bd0631.baseproject.mainFragment2

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.bd0631.baseproject.R
import dagger.android.AndroidInjection

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    AndroidInjection.inject(this)
    super.onCreate(savedInstanceState)
    setContentView(R.layout.main_activity)
    if (savedInstanceState == null) {
      supportFragmentManager.beginTransaction()
          .replace(R.id.container, MainFragment2.newInstance())
          .commit()
    }
  }

}
