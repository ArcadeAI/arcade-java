// File generated from our OpenAPI spec by Stainless.

package dev.arcade.services.async

import dev.arcade.core.ClientOptions
import dev.arcade.core.RequestOptions
import dev.arcade.core.http.HttpResponseFor
import dev.arcade.models.health.HealthCheckParams
import dev.arcade.models.health.HealthSchema
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface HealthServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): HealthServiceAsync

    /** Check if Arcade Engine is healthy */
    fun check(): CompletableFuture<HealthSchema> = check(HealthCheckParams.none())

    /** @see check */
    fun check(
        params: HealthCheckParams = HealthCheckParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HealthSchema>

    /** @see check */
    fun check(
        params: HealthCheckParams = HealthCheckParams.none()
    ): CompletableFuture<HealthSchema> = check(params, RequestOptions.none())

    /** @see check */
    fun check(requestOptions: RequestOptions): CompletableFuture<HealthSchema> =
        check(HealthCheckParams.none(), requestOptions)

    /**
     * A view of [HealthServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): HealthServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/health`, but is otherwise the same as
         * [HealthServiceAsync.check].
         */
        fun check(): CompletableFuture<HttpResponseFor<HealthSchema>> =
            check(HealthCheckParams.none())

        /** @see check */
        fun check(
            params: HealthCheckParams = HealthCheckParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<HealthSchema>>

        /** @see check */
        fun check(
            params: HealthCheckParams = HealthCheckParams.none()
        ): CompletableFuture<HttpResponseFor<HealthSchema>> = check(params, RequestOptions.none())

        /** @see check */
        fun check(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<HealthSchema>> =
            check(HealthCheckParams.none(), requestOptions)
    }
}
