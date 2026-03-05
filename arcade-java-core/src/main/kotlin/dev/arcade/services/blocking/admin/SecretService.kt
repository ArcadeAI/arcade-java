// File generated from our OpenAPI spec by Stainless.

package dev.arcade.services.blocking.admin

import com.google.errorprone.annotations.MustBeClosed
import dev.arcade.core.ClientOptions
import dev.arcade.core.RequestOptions
import dev.arcade.core.http.HttpResponse
import dev.arcade.core.http.HttpResponseFor
import dev.arcade.models.admin.secrets.SecretCreateParams
import dev.arcade.models.admin.secrets.SecretDeleteParams
import dev.arcade.models.admin.secrets.SecretListParams
import dev.arcade.models.admin.secrets.SecretListResponse
import dev.arcade.models.admin.secrets.SecretResponse
import java.util.function.Consumer

interface SecretService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SecretService

    /** Create or update a secret */
    fun create(secretKey: String, params: SecretCreateParams): SecretResponse =
        create(secretKey, params, RequestOptions.none())

    /** @see create */
    fun create(
        secretKey: String,
        params: SecretCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SecretResponse = create(params.toBuilder().secretKey(secretKey).build(), requestOptions)

    /** @see create */
    fun create(params: SecretCreateParams): SecretResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SecretCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SecretResponse

    /** List all secrets that are visible to the caller */
    fun list(): SecretListResponse = list(SecretListParams.none())

    /** @see list */
    fun list(
        params: SecretListParams = SecretListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SecretListResponse

    /** @see list */
    fun list(params: SecretListParams = SecretListParams.none()): SecretListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): SecretListResponse =
        list(SecretListParams.none(), requestOptions)

    /** Delete a secret by its ID */
    fun delete(secretId: String) = delete(secretId, SecretDeleteParams.none())

    /** @see delete */
    fun delete(
        secretId: String,
        params: SecretDeleteParams = SecretDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().secretId(secretId).build(), requestOptions)

    /** @see delete */
    fun delete(secretId: String, params: SecretDeleteParams = SecretDeleteParams.none()) =
        delete(secretId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: SecretDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: SecretDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(secretId: String, requestOptions: RequestOptions) =
        delete(secretId, SecretDeleteParams.none(), requestOptions)

    /** A view of [SecretService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SecretService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/admin/secrets/{secret_key}`, but is otherwise
         * the same as [SecretService.create].
         */
        @MustBeClosed
        fun create(secretKey: String, params: SecretCreateParams): HttpResponseFor<SecretResponse> =
            create(secretKey, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            secretKey: String,
            params: SecretCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SecretResponse> =
            create(params.toBuilder().secretKey(secretKey).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: SecretCreateParams): HttpResponseFor<SecretResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: SecretCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SecretResponse>

        /**
         * Returns a raw HTTP response for `get /v1/admin/secrets`, but is otherwise the same as
         * [SecretService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<SecretListResponse> = list(SecretListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: SecretListParams = SecretListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SecretListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: SecretListParams = SecretListParams.none()
        ): HttpResponseFor<SecretListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<SecretListResponse> =
            list(SecretListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/admin/secrets/{secret_id}`, but is otherwise
         * the same as [SecretService.delete].
         */
        @MustBeClosed
        fun delete(secretId: String): HttpResponse = delete(secretId, SecretDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            secretId: String,
            params: SecretDeleteParams = SecretDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().secretId(secretId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            secretId: String,
            params: SecretDeleteParams = SecretDeleteParams.none(),
        ): HttpResponse = delete(secretId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: SecretDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: SecretDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(secretId: String, requestOptions: RequestOptions): HttpResponse =
            delete(secretId, SecretDeleteParams.none(), requestOptions)
    }
}
