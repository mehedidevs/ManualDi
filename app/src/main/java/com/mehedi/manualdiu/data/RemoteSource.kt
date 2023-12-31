/*
package com.mehedi.manualdiu.data

import com.mehedi.manualdiu.data.models.login.RequestLogin
import com.mehedi.manualdiu.data.models.register.RequestRegister
import com.mehedi.manualdiu.data.models.register.ResponseRegister
import com.mehedi.manualdiu.data.models.token.RequestToken
import com.mehedi.manualdiu.data.models.token.ResponseToken
import com.mehedi.manualdiu.network.ApiService
import retrofit2.Response
import javax.inject.Inject

class RemoteSource @Inject constructor(private val service: ApiService) {


    suspend fun loginUser(requestLogin: RequestLogin) = service.loginUser(requestLogin)
    suspend fun register(request: RequestRegister) = service.register(request)
    suspend fun profile(): Response<ResponseRegister> = service.profile()
    suspend fun refreshToken(requestToken: RequestToken): Response<ResponseToken> =
        service.refreshToken(requestToken)


}*/
