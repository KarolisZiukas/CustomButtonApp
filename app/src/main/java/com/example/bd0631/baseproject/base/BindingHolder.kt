package com.example.bd0631.baseproject.base

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView
import android.view.View

class BindingHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

  val binding: ViewDataBinding = DataBindingUtil.bind(itemView)!!

}