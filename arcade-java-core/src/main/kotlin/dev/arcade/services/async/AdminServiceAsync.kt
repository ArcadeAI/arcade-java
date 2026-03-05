// File generated from our OpenAPI spec by Stainless.

package dev.arcade.services.async

import dev.arcade.core.ClientOptions
import dev.arcade.services.async.admin.AuthProviderServiceAsync
import dev.arcade.services.async.admin.SecretServiceAsync
import dev.arcade.services.async.admin.UserConnectionServiceAsync
import java.util.function.Consumer

interface AdminServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AdminServiceAsync

    fun userConnections(): UserConnectionServiceAsync

    fun authProviders(): AuthProviderServiceAsync

    fun secrets(): SecretServiceAsync

    /** A view of [AdminServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AdminServiceAsync.WithRawResponse

        fun userConnections(): UserConnectionServiceAsync.WithRawResponse

        fun authProviders(): AuthProviderServiceAsync.WithRawResponse

        fun secrets(): SecretServiceAsync.WithRawResponse
    }
}
