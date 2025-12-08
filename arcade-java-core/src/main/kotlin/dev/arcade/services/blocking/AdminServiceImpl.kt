// File generated from our OpenAPI spec by Stainless.

package dev.arcade.services.blocking

import dev.arcade.core.ClientOptions
import dev.arcade.services.blocking.admin.AuthProviderService
import dev.arcade.services.blocking.admin.AuthProviderServiceImpl
import dev.arcade.services.blocking.admin.SecretService
import dev.arcade.services.blocking.admin.SecretServiceImpl
import dev.arcade.services.blocking.admin.UserConnectionService
import dev.arcade.services.blocking.admin.UserConnectionServiceImpl

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
