// File generated from our OpenAPI spec by Stainless.

package dev.arcade.services.blocking

import dev.arcade.core.ClientOptions
import dev.arcade.services.blocking.admin.AuthProviderService
import dev.arcade.services.blocking.admin.AuthProviderServiceImpl
import dev.arcade.services.blocking.admin.SecretService
import dev.arcade.services.blocking.admin.SecretServiceImpl
import dev.arcade.services.blocking.admin.UserConnectionService
import dev.arcade.services.blocking.admin.UserConnectionServiceImpl
import java.util.function.Consumer

class AdminServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AdminService {

    private val withRawResponse: AdminService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val userConnections: UserConnectionService by lazy {
        UserConnectionServiceImpl(clientOptions)
    }

    private val authProviders: AuthProviderService by lazy {
        AuthProviderServiceImpl(clientOptions)
    }

    private val secrets: SecretService by lazy { SecretServiceImpl(clientOptions) }

    override fun withRawResponse(): AdminService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AdminService =
        AdminServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun userConnections(): UserConnectionService = userConnections

    override fun authProviders(): AuthProviderService = authProviders

    override fun secrets(): SecretService = secrets

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AdminService.WithRawResponse {

        private val userConnections: UserConnectionService.WithRawResponse by lazy {
            UserConnectionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val authProviders: AuthProviderService.WithRawResponse by lazy {
            AuthProviderServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val secrets: SecretService.WithRawResponse by lazy {
            SecretServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AdminService.WithRawResponse =
            AdminServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun userConnections(): UserConnectionService.WithRawResponse = userConnections

        override fun authProviders(): AuthProviderService.WithRawResponse = authProviders

        override fun secrets(): SecretService.WithRawResponse = secrets
    }
}
