//package com.petukhova.mobile_auth
//
//import retrofit2.Response
//import retrofit2.http.Body
//import retrofit2.http.POST
//
//// Данные для аутентификации
//data class AuthRequestParams(val username: String, val password: String) {
//
//    // Токен для идентификации последующих запросов
//    data class Token(val token: String)
//    interface API {
//        // URL запроса (без учета основного адреса)
//        @POST("api/v1/authentication")
//        suspend fun authenticate(@Body authRequestParams: AuthRequestParams): Response
//    }
//}