package com.example.bd0631.baseproject.base

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.koin.android.viewmodel.ext.android.viewModelByClass
import kotlin.reflect.KClass


abstract class BaseFragment<T : ViewDataBinding, U : BaseViewModel> : Fragment() {

  abstract val layoutId: Int
  abstract val viewModelClass: KClass<U>

  private lateinit var databinding: T

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
      savedInstanceState: Bundle?): View? {
    databinding = DataBindingUtil.inflate(inflater, layoutId, container, false)
    databinding.setLifecycleOwner(this)
    return databinding.root
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    val viewModel by viewModelByClass(viewModelClass)
    onObserve(viewModel)
    super.onCreate(savedInstanceState)
  }

  protected open fun onObserve(viewModel: U) {
  }
}