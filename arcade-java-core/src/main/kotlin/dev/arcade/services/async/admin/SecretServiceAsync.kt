// File generated from our OpenAPI spec by Stainless.

package dev.arcade.services.async.admin

import dev.arcade.core.ClientOptions
import dev.arcade.core.RequestOptions
import dev.arcade.core.http.HttpResponse
import dev.arcade.core.http.HttpResponseFor
import dev.arcade.models.admin.secrets.SecretCreateParams
import dev.arcade.models.admin.secrets.SecretDeleteParams
import dev.arcade.models.admin.secrets.SecretListParams
import dev.arcade.models.admin.secrets.SecretListResponse
import dev.arcade.models.admin.secrets.SecretResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SecretServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SecretServiceAsync

    /** Create or update a secret */
    fun create(secretKey: String, params: SecretCreateParams): CompletableFuture<SecretResponse> =
        create(secretKey, params, RequestOptions.none())

    /** @see create */
    fun create(
        secretKey: String,
        params: SecretCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SecretResponse> =
        create(params.toBuilder().secretKey(secretKey).build(), requestOptions)

    /** @see create */
    fun create(params: SecretCreateParams): CompletableFuture<SecretResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SecretCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SecretResponse>

    /** List all secrets that are visible to the caller */
    fun list(): CompletableFuture<SecretListResponse> = list(SecretListParams.none())

    /** @see list */
    fun list(
        params: SecretListParams = SecretListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SecretListResponse>

    /** @see list */
    fun list(
        params: SecretListParams = SecretListParams.none()
    ): CompletableFuture<SecretListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<SecretListResponse> =
        list(SecretListParams.none(), requestOptions)

    /** Delete a secret by its ID */
    fun delete(secretId: String): CompletableFuture<Void?> =
        delete(secretId, SecretDeleteParams.none())

    /** @see delete */
    fun delete(
        secretId: String,
        params: SecretDeleteParams = SecretDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().secretId(secretId).build(), requestOptions)

    /** @see delete */
    fun delete(
        secretId: String,
        params: SecretDeleteParams = SecretDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(secretId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: SecretDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: SecretDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(secretId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(secretId, SecretDeleteParams.none(), requestOptions)

    /**
     * A view of [SecretServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SecretServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/admin/secrets/{secret_key}`, but is otherwise
         * the same as [SecretServiceAsync.create].
         */
        fun create(
            secretKey: String,
            params: SecretCreateParams,
        ): CompletableFuture<HttpResponseFor<SecretResponse>> =
            create(secretKey, params, RequestOptions.none())

        /** @see create */
        fun create(
            secretKey: String,
            params: SecretCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SecretResponse>> =
            create(params.toBuilder().secretKey(secretKey).build(), requestOptions)

        /** @see create */
        fun create(params: SecretCreateParams): CompletableFuture<HttpResponseFor<SecretResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: SecretCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SecretResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/admin/secrets`, but is otherwise the same as
         * [SecretServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<SecretListResponse>> =
            list(SecretListParams.none())

        /** @see list */
        fun list(
            params: SecretListParams = SecretListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SecretListResponse>>

        /** @see list */
        fun list(
            params: SecretListParams = SecretListParams.none()
        ): CompletableFuture<HttpResponseFor<SecretListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SecretListResponse>> =
            list(SecretListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/admin/secrets/{secret_id}`, but is otherwise
         * the same as [SecretServiceAsync.delete].
         */
        fun delete(secretId: String): CompletableFuture<HttpResponse> =
            delete(secretId, SecretDeleteParams.none())

        /** @see delete */
        fun delete(
            secretId: String,
            params: SecretDeleteParams = SecretDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().secretId(secretId).build(), requestOptions)

        /** @see delete */
        fun delete(
            secretId: String,
            params: SecretDeleteParams = SecretDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(secretId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: SecretDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: SecretDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            secretId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(secretId, SecretDeleteParams.none(), requestOptions)
    }
}
