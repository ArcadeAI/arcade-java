// File generated from our OpenAPI spec by Stainless.

package com.arcade_engine.api.services.blocking

import com.arcade_engine.api.core.ClientOptions
import com.arcade_engine.api.services.blocking.admin.AuthProviderService
import com.arcade_engine.api.services.blocking.admin.AuthProviderServiceImpl
import com.arcade_engine.api.services.blocking.admin.SecretService
import com.arcade_engine.api.services.blocking.admin.SecretServiceImpl
import com.arcade_engine.api.services.blocking.admin.UserConnectionService
import com.arcade_engine.api.services.blocking.admin.UserConnectionServiceImpl

class AdminServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AdminService {

    private val userConnections: UserConnectionService by lazy {
        UserConnectionServiceImpl(clientOptions)
    }

    private val authProviders: AuthProviderService by lazy {
        AuthProviderServiceImpl(clientOptions)
    }

    private val secrets: SecretService by lazy { SecretServiceImpl(clientOptions) }

    override fun userConnections(): UserConnectionService = userConnections

    override fun authProviders(): AuthProviderService = authProviders

    override fun secrets(): SecretService = secrets
}
