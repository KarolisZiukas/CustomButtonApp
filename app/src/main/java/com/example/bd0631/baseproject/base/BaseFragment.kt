package com.example.bd0631.baseproject.base

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.bd0631.baseproject.BR
import org.koin.android.ext.android.inject
import org.koin.android.viewmodel.ext.android.getViewModelByClass
import org.koin.android.viewmodel.ext.android.viewModel
import org.koin.android.viewmodel.ext.android.viewModelByClass
import kotlin.reflect.KClass


abstract class BaseFragment<T : ViewDataBinding, U : BaseViewModel> : Fragment() {

  abstract val layoutId: Int
  abstract val viewModelClass: KClass<U>

  protected open val viewModel: U by lazy { viewModelByClass(viewModelClass).value }

  private lateinit var databinding: T

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
      savedInstanceState: Bundle?): View? {
    databinding = DataBindingUtil.inflate(inflater, layoutId, container, false)
    databinding.setVariable(BR.viewModel, viewModel)
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