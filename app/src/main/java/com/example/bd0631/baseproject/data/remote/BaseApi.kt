package com.example.bd0631.baseproject.data.remote

import io.reactivex.Observable
import retrofit2.http.GET

interface PostApi {
  @GET("/posts/1")
  fun getPosts(): Observable<Post>
}