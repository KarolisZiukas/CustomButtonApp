package com.example.bd0631.baseproject.base

abstract class BaseRecyclerViewItem {

  internal abstract fun layoutId(): Int

  internal abstract fun bindItems(holder: BindingHolder, position: Int)
}