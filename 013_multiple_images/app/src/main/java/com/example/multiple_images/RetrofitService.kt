package com.example.multiple_images

import okhttp3.MultipartBody
import okhttp3.RequestBody
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part

interface RetrofitService {

    @POST("/test/test")
    fun test() : Call<ResponseBody>

    @Multipart
    @POST("/post/img")
    fun uploadImage(
        @Part image: MultipartBody.Part,
        @Part("email") email: RequestBody,
        @Part("name") name: RequestBody
    ): Call<ResponseBody>

    @Multipart
    @POST("/post/imgs")
    fun uploadImages(
        @Part images: List<MultipartBody.Part>,
        @Part("email") email: RequestBody,
        @Part("name") name: RequestBody
    ): Call<ResponseBody>
}