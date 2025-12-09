// File generated from our OpenAPI spec by Stainless.

package dev.arcade.services.async

import dev.arcade.core.ClientOptions
import dev.arcade.services.async.admin.AuthProviderServiceAsync
import dev.arcade.services.async.admin.AuthProviderServiceAsyncImpl
import dev.arcade.services.async.admin.SecretServiceAsync
import dev.arcade.services.async.admin.SecretServiceAsyncImpl
import dev.arcade.services.async.admin.UserConnectionServiceAsync
import dev.arcade.services.async.admin.UserConnectionServiceAsyncImpl
import java.util.function.Consumer

class AdminServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AdminServiceAsync {

    private val withRawResponse: AdminServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val userConnections: UserConnectionServiceAsync by lazy {
        UserConnectionServiceAsyncImpl(clientOptions)
    }

    private val authProviders: AuthProviderServiceAsync by lazy {
        AuthProviderServiceAsyncImpl(clientOptions)
    }

    private val secrets: SecretServiceAsync by lazy { SecretServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): AdminServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AdminServiceAsync =
        AdminServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun userConnections(): UserConnectionServiceAsync = userConnections

    override fun authProviders(): AuthProviderServiceAsync = authProviders

    override fun secrets(): SecretServiceAsync = secrets

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AdminServiceAsync.WithRawResponse {

        private val userConnections: UserConnectionServiceAsync.WithRawResponse by lazy {
            UserConnectionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val authProviders: AuthProviderServiceAsync.WithRawResponse by lazy {
            AuthProviderServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val secrets: SecretServiceAsync.WithRawResponse by lazy {
            SecretServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AdminServiceAsync.WithRawResponse =
            AdminServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun userConnections(): UserConnectionServiceAsync.WithRawResponse = userConnections

        override fun authProviders(): AuthProviderServiceAsync.WithRawResponse = authProviders

        override fun secrets(): SecretServiceAsync.WithRawResponse = secrets
    }
}
