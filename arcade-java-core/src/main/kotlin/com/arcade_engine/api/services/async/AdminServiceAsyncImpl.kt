// File generated from our OpenAPI spec by Stainless.

package com.arcade_engine.api.services.async

import com.arcade_engine.api.core.ClientOptions
import com.arcade_engine.api.services.async.admin.AuthProviderServiceAsync
import com.arcade_engine.api.services.async.admin.AuthProviderServiceAsyncImpl
import com.arcade_engine.api.services.async.admin.SecretServiceAsync
import com.arcade_engine.api.services.async.admin.SecretServiceAsyncImpl
import com.arcade_engine.api.services.async.admin.UserConnectionServiceAsync
import com.arcade_engine.api.services.async.admin.UserConnectionServiceAsyncImpl

class AdminServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AdminServiceAsync {

    private val userConnections: UserConnectionServiceAsync by lazy {
        UserConnectionServiceAsyncImpl(clientOptions)
    }

    private val authProviders: AuthProviderServiceAsync by lazy {
        AuthProviderServiceAsyncImpl(clientOptions)
    }

    private val secrets: SecretServiceAsync by lazy { SecretServiceAsyncImpl(clientOptions) }

    override fun userConnections(): UserConnectionServiceAsync = userConnections

    override fun authProviders(): AuthProviderServiceAsync = authProviders

    override fun secrets(): SecretServiceAsync = secrets
}
