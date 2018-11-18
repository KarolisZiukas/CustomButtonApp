package com.example.bd0631.baseproject.mainFragment2

import android.arch.lifecycle.MutableLiveData
import com.example.bd0631.baseproject.base.BaseViewModel
import com.example.bd0631.baseproject.data.local.BaseRepository
import com.example.bd0631.baseproject.data.remote.Post
import com.example.bd0631.baseproject.data.remote.PostApi
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.rxkotlin.subscribeBy
import javax.inject.Inject

class MainViewModel2 @Inject constructor(
    val repo: BaseRepository,
    val postApi: PostApi
) : BaseViewModel() {

  val isLoading = MutableLiveData<Boolean>()
  val post = MutableLiveData<Post>()

  fun onTextClick() {
    isLoading.value = true
    postApi.getPosts()
        .observeOn(AndroidSchedulers.mainThread())
        .doFinally { isLoading.value = false }
        .subscribeBy(
            onNext = {
              post.value = it
            }

        )

  }
}