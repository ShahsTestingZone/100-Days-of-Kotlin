/*
 * Copyright 2019, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.example.android.marsrealestate.network

import retrofit2.Call
import retrofit2.Retrofit
//import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.GET
import com.squareup.moshi.Moshi
import  com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.Query

enum class MarsApiFilter(val value: String) {
    SHOW_RENT("rent"),
    SHOW_BUY("buy"),
    SHOW_ALL("all")
}


private const val BASE_URL = "https://android-kotlin-fun-mars-server.appspot.com/"

//Moshi Builder to create moshi instance
private val moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()


//use a Retrofit builder to create a Retrofit object
private val retrofit = Retrofit.Builder()
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .baseUrl(BASE_URL)
    .build()

//Define an interface that defines how Retrofit talks to the web server using HTTP requests
interface MarsApiService {
    @GET("realestate")
    suspend fun getProperties( @Query("filter") type: String): List<MarsProperty> // return list of the data class which store the JSON objects
//    fun getProperties(): Cal<List<MarsProperty>> - old code - update to above to make code cleaner in viewmodel
}

// define a public object called MarsApi to initialize the Retrofit service. This is a standard Kotlin code pattern to use when creating a service object.

object MarsApi {
    val retrofitService : MarsApiService by lazy {
        retrofit.create(MarsApiService::class.java) }
}


/*The Retrofit create() method creates the Retrofit service itself with the MarsApiService interface. Because this call is
* computationally expensive, you lazily initialize the Retrofit service. And since the app only needs one Retrofit service instance,
* you expose the service to the rest of the app using a public object called MarsApi. Now once all the setup is done,
* each time your app calls MarsApi.retrofitService, it will get a singleton Retrofit object that implements MarsApiService.
*/
