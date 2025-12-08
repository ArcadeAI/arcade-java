// File generated from our OpenAPI spec by Stainless.

package dev.arcade.services.async

import dev.arcade.core.ClientOptions
import dev.arcade.services.async.admin.AuthProviderServiceAsync
import dev.arcade.services.async.admin.AuthProviderServiceAsyncImpl
import dev.arcade.services.async.admin.SecretServiceAsync
import dev.arcade.services.async.admin.SecretServiceAsyncImpl
import dev.arcade.services.async.admin.UserConnectionServiceAsync
import dev.arcade.services.async.admin.UserConnectionServiceAsyncImpl

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
