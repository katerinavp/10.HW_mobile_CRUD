//package com.petukhova.mobile_auth
//
//import retrofit2.Retrofit
//import retrofit2.converter.gson.GsonConverterFactory
//
//object Repository {
//    // Ленивое создание Retrofit экземпляра
//    private val retrofit: Retrofit by lazy {
//        Retrofit.Builder()
//            .baseUrl("https://ncraftmedia.herokuapp.com")
//            .addConverterFactory(GsonConverterFactory.create())
//            .build()
//    }
//    // Ленивое создание API
//    private val API: AuthRequestParams.API by lazy {
//        retrofit.create(
//           // ru.netology.ncraftmedia.authorization.api.API::class.java
//        )
//    }
//    suspend fun authenticate(login: String, password: String) =
//        API.authenticate(
//            AuthRequestParams(login, password)
//        )
//
//
//}