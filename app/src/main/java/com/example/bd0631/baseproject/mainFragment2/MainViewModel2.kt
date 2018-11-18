package com.example.bd0631.baseproject.mainFragment2

import android.arch.lifecycle.MutableLiveData
import com.example.bd0631.baseproject.data.local.BaseRepository
import com.example.bd0631.baseproject.data.remote.Post
import com.example.bd0631.baseproject.data.remote.PostApi
import com.example.bd0631.baseproject.base.BaseViewModel
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class MainViewModel2 @Inject constructor(
    val repo: BaseRepository,
    val postApi: PostApi
) : BaseViewModel() {

  val isLoading = MutableLiveData<Boolean>()
  val post = MutableLiveData<Post>()

  fun onTextClick() {
    postApi.getPosts()
        .subscribeOn(Schedulers.newThread())
        .observeOn(AndroidSchedulers.mainThread())
        .subscribe(object : Observer<Post> {
          override fun onComplete() {
          }

          override fun onSubscribe(d: Disposable) {
          }

          override fun onNext(t: Post) {
            post.value = t
          }

          override fun onError(e: Throwable) {
          }
        })

    isLoading.value = true
  }
}