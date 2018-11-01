package com.example.bd0631.baseproject.base

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.bd0631.baseproject.ViewModelFactory
import dagger.android.support.DaggerFragment
import javax.inject.Inject

abstract class BaseFragment<T : ViewDataBinding, U : BaseViewModel> : DaggerFragment() {

  @Inject
  lateinit var factory: ViewModelFactory<U>

  protected open val viewModel: U by lazy {
    ViewModelProviders.of(this, factory).get(viewModelClass)
  }

  abstract val layoutId: Int
  abstract val viewModelClass: Class<U>

  private lateinit var databinding: T

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
      savedInstanceState: Bundle?): View? {
    databinding = DataBindingUtil.inflate(inflater, layoutId, container, false)
    databinding.setLifecycleOwner(this)
    return databinding.root
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    onObserve(viewModel)
    super.onCreate(savedInstanceState)
  }

  protected open fun onObserve(viewModel: U) {
  }


}