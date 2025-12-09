// File generated from our OpenAPI spec by Stainless.

package dev.arcade.services.async.admin

import dev.arcade.core.ClientOptions
import dev.arcade.core.RequestOptions
import dev.arcade.core.http.HttpResponseFor
import dev.arcade.models.admin.authproviders.AuthProviderCreateParams
import dev.arcade.models.admin.authproviders.AuthProviderCreateRequest
import dev.arcade.models.admin.authproviders.AuthProviderDeleteParams
import dev.arcade.models.admin.authproviders.AuthProviderGetParams
import dev.arcade.models.admin.authproviders.AuthProviderListParams
import dev.arcade.models.admin.authproviders.AuthProviderListResponse
import dev.arcade.models.admin.authproviders.AuthProviderPatchParams
import dev.arcade.models.admin.authproviders.AuthProviderResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AuthProviderServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AuthProviderServiceAsync

    /** Create a new auth provider */
    fun create(params: AuthProviderCreateParams): CompletableFuture<AuthProviderResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AuthProviderCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AuthProviderResponse>

    /** @see create */
    fun create(
        authProviderCreateRequest: AuthProviderCreateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AuthProviderResponse> =
        create(
            AuthProviderCreateParams.builder()
                .authProviderCreateRequest(authProviderCreateRequest)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        authProviderCreateRequest: AuthProviderCreateRequest
    ): CompletableFuture<AuthProviderResponse> =
        create(authProviderCreateRequest, RequestOptions.none())

    /** List a page of auth providers that are available to the caller */
    fun list(): CompletableFuture<AuthProviderListResponse> = list(AuthProviderListParams.none())

    /** @see list */
    fun list(
        params: AuthProviderListParams = AuthProviderListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AuthProviderListResponse>

    /** @see list */
    fun list(
        params: AuthProviderListParams = AuthProviderListParams.none()
    ): CompletableFuture<AuthProviderListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<AuthProviderListResponse> =
        list(AuthProviderListParams.none(), requestOptions)

    /** Delete a specific auth provider */
    fun delete(id: String): CompletableFuture<AuthProviderResponse> =
        delete(id, AuthProviderDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: AuthProviderDeleteParams = AuthProviderDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AuthProviderResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: AuthProviderDeleteParams = AuthProviderDeleteParams.none(),
    ): CompletableFuture<AuthProviderResponse> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AuthProviderDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AuthProviderResponse>

    /** @see delete */
    fun delete(params: AuthProviderDeleteParams): CompletableFuture<AuthProviderResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AuthProviderResponse> =
        delete(id, AuthProviderDeleteParams.none(), requestOptions)

    /** Get the details of a specific auth provider */
    fun get(id: String): CompletableFuture<AuthProviderResponse> =
        get(id, AuthProviderGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: AuthProviderGetParams = AuthProviderGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AuthProviderResponse> =
        get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: AuthProviderGetParams = AuthProviderGetParams.none(),
    ): CompletableFuture<AuthProviderResponse> = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: AuthProviderGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AuthProviderResponse>

    /** @see get */
    fun get(params: AuthProviderGetParams): CompletableFuture<AuthProviderResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<AuthProviderResponse> =
        get(id, AuthProviderGetParams.none(), requestOptions)

    /** Patch an existing auth provider */
    fun patch(
        pathId: String,
        params: AuthProviderPatchParams,
    ): CompletableFuture<AuthProviderResponse> = patch(pathId, params, RequestOptions.none())

    /** @see patch */
    fun patch(
        pathId: String,
        params: AuthProviderPatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AuthProviderResponse> =
        patch(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see patch */
    fun patch(params: AuthProviderPatchParams): CompletableFuture<AuthProviderResponse> =
        patch(params, RequestOptions.none())

    /** @see patch */
    fun patch(
        params: AuthProviderPatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AuthProviderResponse>

    /**
     * A view of [AuthProviderServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AuthProviderServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/admin/auth_providers`, but is otherwise the
         * same as [AuthProviderServiceAsync.create].
         */
        fun create(
            params: AuthProviderCreateParams
        ): CompletableFuture<HttpResponseFor<AuthProviderResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: AuthProviderCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AuthProviderResponse>>

        /** @see create */
        fun create(
            authProviderCreateRequest: AuthProviderCreateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AuthProviderResponse>> =
            create(
                AuthProviderCreateParams.builder()
                    .authProviderCreateRequest(authProviderCreateRequest)
                    .build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            authProviderCreateRequest: AuthProviderCreateRequest
        ): CompletableFuture<HttpResponseFor<AuthProviderResponse>> =
            create(authProviderCreateRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /v1/admin/auth_providers`, but is otherwise the same
         * as [AuthProviderServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<AuthProviderListResponse>> =
            list(AuthProviderListParams.none())

        /** @see list */
        fun list(
            params: AuthProviderListParams = AuthProviderListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AuthProviderListResponse>>

        /** @see list */
        fun list(
            params: AuthProviderListParams = AuthProviderListParams.none()
        ): CompletableFuture<HttpResponseFor<AuthProviderListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AuthProviderListResponse>> =
            list(AuthProviderListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/admin/auth_providers/{id}`, but is otherwise
         * the same as [AuthProviderServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<AuthProviderResponse>> =
            delete(id, AuthProviderDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: AuthProviderDeleteParams = AuthProviderDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AuthProviderResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: AuthProviderDeleteParams = AuthProviderDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<AuthProviderResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: AuthProviderDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AuthProviderResponse>>

        /** @see delete */
        fun delete(
            params: AuthProviderDeleteParams
        ): CompletableFuture<HttpResponseFor<AuthProviderResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AuthProviderResponse>> =
            delete(id, AuthProviderDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/admin/auth_providers/{id}`, but is otherwise the
         * same as [AuthProviderServiceAsync.get].
         */
        fun get(id: String): CompletableFuture<HttpResponseFor<AuthProviderResponse>> =
            get(id, AuthProviderGetParams.none())

        /** @see get */
        fun get(
            id: String,
            params: AuthProviderGetParams = AuthProviderGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AuthProviderResponse>> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        fun get(
            id: String,
            params: AuthProviderGetParams = AuthProviderGetParams.none(),
        ): CompletableFuture<HttpResponseFor<AuthProviderResponse>> =
            get(id, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: AuthProviderGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AuthProviderResponse>>

        /** @see get */
        fun get(
            params: AuthProviderGetParams
        ): CompletableFuture<HttpResponseFor<AuthProviderResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AuthProviderResponse>> =
            get(id, AuthProviderGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/admin/auth_providers/{id}`, but is otherwise
         * the same as [AuthProviderServiceAsync.patch].
         */
        fun patch(
            pathId: String,
            params: AuthProviderPatchParams,
        ): CompletableFuture<HttpResponseFor<AuthProviderResponse>> =
            patch(pathId, params, RequestOptions.none())

        /** @see patch */
        fun patch(
            pathId: String,
            params: AuthProviderPatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AuthProviderResponse>> =
            patch(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see patch */
        fun patch(
            params: AuthProviderPatchParams
        ): CompletableFuture<HttpResponseFor<AuthProviderResponse>> =
            patch(params, RequestOptions.none())

        /** @see patch */
        fun patch(
            params: AuthProviderPatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AuthProviderResponse>>
    }
}
