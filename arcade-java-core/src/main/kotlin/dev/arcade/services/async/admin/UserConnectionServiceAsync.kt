// File generated from our OpenAPI spec by Stainless.

package dev.arcade.services.async.admin

import dev.arcade.core.ClientOptions
import dev.arcade.core.RequestOptions
import dev.arcade.core.http.HttpResponse
import dev.arcade.core.http.HttpResponseFor
import dev.arcade.models.admin.userconnections.UserConnectionDeleteParams
import dev.arcade.models.admin.userconnections.UserConnectionListPageAsync
import dev.arcade.models.admin.userconnections.UserConnectionListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface UserConnectionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserConnectionServiceAsync

    /** List all auth connections */
    fun list(): CompletableFuture<UserConnectionListPageAsync> =
        list(UserConnectionListParams.none())

    /** @see list */
    fun list(
        params: UserConnectionListParams = UserConnectionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UserConnectionListPageAsync>

    /** @see list */
    fun list(
        params: UserConnectionListParams = UserConnectionListParams.none()
    ): CompletableFuture<UserConnectionListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<UserConnectionListPageAsync> =
        list(UserConnectionListParams.none(), requestOptions)

    /** Delete a user/auth provider connection */
    fun delete(id: String): CompletableFuture<Void?> = delete(id, UserConnectionDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: UserConnectionDeleteParams = UserConnectionDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: UserConnectionDeleteParams = UserConnectionDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: UserConnectionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: UserConnectionDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, UserConnectionDeleteParams.none(), requestOptions)

    /**
     * A view of [UserConnectionServiceAsync] that provides access to raw HTTP responses for each
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
        ): UserConnectionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/admin/user_connections`, but is otherwise the
         * same as [UserConnectionServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<UserConnectionListPageAsync>> =
            list(UserConnectionListParams.none())

        /** @see list */
        fun list(
            params: UserConnectionListParams = UserConnectionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UserConnectionListPageAsync>>

        /** @see list */
        fun list(
            params: UserConnectionListParams = UserConnectionListParams.none()
        ): CompletableFuture<HttpResponseFor<UserConnectionListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<UserConnectionListPageAsync>> =
            list(UserConnectionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/admin/user_connections/{id}`, but is
         * otherwise the same as [UserConnectionServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, UserConnectionDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: UserConnectionDeleteParams = UserConnectionDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: UserConnectionDeleteParams = UserConnectionDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: UserConnectionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: UserConnectionDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, UserConnectionDeleteParams.none(), requestOptions)
    }
}
