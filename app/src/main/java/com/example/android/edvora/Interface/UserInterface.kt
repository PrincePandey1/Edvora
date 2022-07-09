package com.example.android.edvora.Interface

import com.example.android.edvora.DataClass.RideItem
import okhttp3.internal.Internal.instance
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import retrofit2.http.GET


const val BASE_URL = "https://assessment.api.vweb.app/"


interface UserInterface {
    @GET("user")
    fun getData(): Call<List<RideItem>>
}

object Interface{
    var UserInstance: UserInterface
    init{
            val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
           UserInstance = retrofit.create(UserInterface::class.)
        }
}

