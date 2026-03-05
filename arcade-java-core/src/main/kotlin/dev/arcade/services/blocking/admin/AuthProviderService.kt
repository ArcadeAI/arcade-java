// File generated from our OpenAPI spec by Stainless.

package dev.arcade.services.blocking.admin

import com.google.errorprone.annotations.MustBeClosed
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
import java.util.function.Consumer

interface AuthProviderService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AuthProviderService

    /** Create a new auth provider */
    fun create(params: AuthProviderCreateParams): AuthProviderResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AuthProviderCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthProviderResponse

    /** @see create */
    fun create(
        authProviderCreateRequest: AuthProviderCreateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthProviderResponse =
        create(
            AuthProviderCreateParams.builder()
                .authProviderCreateRequest(authProviderCreateRequest)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(authProviderCreateRequest: AuthProviderCreateRequest): AuthProviderResponse =
        create(authProviderCreateRequest, RequestOptions.none())

    /** List a page of auth providers that are available to the caller */
    fun list(): AuthProviderListResponse = list(AuthProviderListParams.none())

    /** @see list */
    fun list(
        params: AuthProviderListParams = AuthProviderListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthProviderListResponse

    /** @see list */
    fun list(
        params: AuthProviderListParams = AuthProviderListParams.none()
    ): AuthProviderListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): AuthProviderListResponse =
        list(AuthProviderListParams.none(), requestOptions)

    /** Delete a specific auth provider */
    fun delete(id: String): AuthProviderResponse = delete(id, AuthProviderDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: AuthProviderDeleteParams = AuthProviderDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthProviderResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: AuthProviderDeleteParams = AuthProviderDeleteParams.none(),
    ): AuthProviderResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AuthProviderDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthProviderResponse

    /** @see delete */
    fun delete(params: AuthProviderDeleteParams): AuthProviderResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): AuthProviderResponse =
        delete(id, AuthProviderDeleteParams.none(), requestOptions)

    /** Get the details of a specific auth provider */
    fun get(id: String): AuthProviderResponse = get(id, AuthProviderGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: AuthProviderGetParams = AuthProviderGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthProviderResponse = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: AuthProviderGetParams = AuthProviderGetParams.none(),
    ): AuthProviderResponse = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: AuthProviderGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthProviderResponse

    /** @see get */
    fun get(params: AuthProviderGetParams): AuthProviderResponse =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): AuthProviderResponse =
        get(id, AuthProviderGetParams.none(), requestOptions)

    /** Patch an existing auth provider */
    fun patch(pathId: String, params: AuthProviderPatchParams): AuthProviderResponse =
        patch(pathId, params, RequestOptions.none())

    /** @see patch */
    fun patch(
        pathId: String,
        params: AuthProviderPatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthProviderResponse = patch(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see patch */
    fun patch(params: AuthProviderPatchParams): AuthProviderResponse =
        patch(params, RequestOptions.none())

    /** @see patch */
    fun patch(
        params: AuthProviderPatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthProviderResponse

    /**
     * A view of [AuthProviderService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AuthProviderService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/admin/auth_providers`, but is otherwise the
         * same as [AuthProviderService.create].
         */
        @MustBeClosed
        fun create(params: AuthProviderCreateParams): HttpResponseFor<AuthProviderResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: AuthProviderCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthProviderResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            authProviderCreateRequest: AuthProviderCreateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthProviderResponse> =
            create(
                AuthProviderCreateParams.builder()
                    .authProviderCreateRequest(authProviderCreateRequest)
                    .build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            authProviderCreateRequest: AuthProviderCreateRequest
        ): HttpResponseFor<AuthProviderResponse> =
            create(authProviderCreateRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /v1/admin/auth_providers`, but is otherwise the same
         * as [AuthProviderService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<AuthProviderListResponse> = list(AuthProviderListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: AuthProviderListParams = AuthProviderListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthProviderListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: AuthProviderListParams = AuthProviderListParams.none()
        ): HttpResponseFor<AuthProviderListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AuthProviderListResponse> =
            list(AuthProviderListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/admin/auth_providers/{id}`, but is otherwise
         * the same as [AuthProviderService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<AuthProviderResponse> =
            delete(id, AuthProviderDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: AuthProviderDeleteParams = AuthProviderDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthProviderResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: AuthProviderDeleteParams = AuthProviderDeleteParams.none(),
        ): HttpResponseFor<AuthProviderResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: AuthProviderDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthProviderResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: AuthProviderDeleteParams): HttpResponseFor<AuthProviderResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AuthProviderResponse> =
            delete(id, AuthProviderDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/admin/auth_providers/{id}`, but is otherwise the
         * same as [AuthProviderService.get].
         */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<AuthProviderResponse> =
            get(id, AuthProviderGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: AuthProviderGetParams = AuthProviderGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthProviderResponse> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: AuthProviderGetParams = AuthProviderGetParams.none(),
        ): HttpResponseFor<AuthProviderResponse> = get(id, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: AuthProviderGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthProviderResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: AuthProviderGetParams): HttpResponseFor<AuthProviderResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(id: String, requestOptions: RequestOptions): HttpResponseFor<AuthProviderResponse> =
            get(id, AuthProviderGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/admin/auth_providers/{id}`, but is otherwise
         * the same as [AuthProviderService.patch].
         */
        @MustBeClosed
        fun patch(
            pathId: String,
            params: AuthProviderPatchParams,
        ): HttpResponseFor<AuthProviderResponse> = patch(pathId, params, RequestOptions.none())

        /** @see patch */
        @MustBeClosed
        fun patch(
            pathId: String,
            params: AuthProviderPatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthProviderResponse> =
            patch(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see patch */
        @MustBeClosed
        fun patch(params: AuthProviderPatchParams): HttpResponseFor<AuthProviderResponse> =
            patch(params, RequestOptions.none())

        /** @see patch */
        @MustBeClosed
        fun patch(
            params: AuthProviderPatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthProviderResponse>
    }
}
