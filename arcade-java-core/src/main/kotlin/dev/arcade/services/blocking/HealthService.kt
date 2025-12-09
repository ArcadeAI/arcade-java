// File generated from our OpenAPI spec by Stainless.

package dev.arcade.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import dev.arcade.core.ClientOptions
import dev.arcade.core.RequestOptions
import dev.arcade.core.http.HttpResponseFor
import dev.arcade.models.health.HealthCheckParams
import dev.arcade.models.health.HealthSchema
import java.util.function.Consumer

interface HealthService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): HealthService

    /** Check if Arcade Engine is healthy */
    fun check(): HealthSchema = check(HealthCheckParams.none())

    /** @see check */
    fun check(
        params: HealthCheckParams = HealthCheckParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HealthSchema

    /** @see check */
    fun check(params: HealthCheckParams = HealthCheckParams.none()): HealthSchema =
        check(params, RequestOptions.none())

    /** @see check */
    fun check(requestOptions: RequestOptions): HealthSchema =
        check(HealthCheckParams.none(), requestOptions)

    /** A view of [HealthService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): HealthService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/health`, but is otherwise the same as
         * [HealthService.check].
         */
        @MustBeClosed fun check(): HttpResponseFor<HealthSchema> = check(HealthCheckParams.none())

        /** @see check */
        @MustBeClosed
        fun check(
            params: HealthCheckParams = HealthCheckParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HealthSchema>

        /** @see check */
        @MustBeClosed
        fun check(
            params: HealthCheckParams = HealthCheckParams.none()
        ): HttpResponseFor<HealthSchema> = check(params, RequestOptions.none())

        /** @see check */
        @MustBeClosed
        fun check(requestOptions: RequestOptions): HttpResponseFor<HealthSchema> =
            check(HealthCheckParams.none(), requestOptions)
    }
}
