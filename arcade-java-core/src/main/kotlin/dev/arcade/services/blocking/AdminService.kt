// File generated from our OpenAPI spec by Stainless.

package dev.arcade.services.blocking

import dev.arcade.core.ClientOptions
import dev.arcade.services.blocking.admin.AuthProviderService
import dev.arcade.services.blocking.admin.SecretService
import dev.arcade.services.blocking.admin.UserConnectionService
import java.util.function.Consumer

interface AdminService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AdminService

    fun userConnections(): UserConnectionService

    fun authProviders(): AuthProviderService

    fun secrets(): SecretService

    /** A view of [AdminService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AdminService.WithRawResponse

        fun userConnections(): UserConnectionService.WithRawResponse

        fun authProviders(): AuthProviderService.WithRawResponse

        fun secrets(): SecretService.WithRawResponse
    }
}
