// File generated from our OpenAPI spec by Stainless.

package dev.arcade.services.blocking.admin

import com.google.errorprone.annotations.MustBeClosed
import dev.arcade.core.ClientOptions
import dev.arcade.core.RequestOptions
import dev.arcade.core.http.HttpResponse
import dev.arcade.core.http.HttpResponseFor
import dev.arcade.models.admin.userconnections.UserConnectionDeleteParams
import dev.arcade.models.admin.userconnections.UserConnectionListPage
import dev.arcade.models.admin.userconnections.UserConnectionListParams
import java.util.function.Consumer

interface UserConnectionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserConnectionService

    /** List all auth connections */
    fun list(): UserConnectionListPage = list(UserConnectionListParams.none())

    /** @see list */
    fun list(
        params: UserConnectionListParams = UserConnectionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserConnectionListPage

    /** @see list */
    fun list(
        params: UserConnectionListParams = UserConnectionListParams.none()
    ): UserConnectionListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): UserConnectionListPage =
        list(UserConnectionListParams.none(), requestOptions)

    /** Delete a user/auth provider connection */
    fun delete(id: String) = delete(id, UserConnectionDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: UserConnectionDeleteParams = UserConnectionDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(id: String, params: UserConnectionDeleteParams = UserConnectionDeleteParams.none()) =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: UserConnectionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: UserConnectionDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, UserConnectionDeleteParams.none(), requestOptions)

    /**
     * A view of [UserConnectionService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UserConnectionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/admin/user_connections`, but is otherwise the
         * same as [UserConnectionService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<UserConnectionListPage> = list(UserConnectionListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: UserConnectionListParams = UserConnectionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserConnectionListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: UserConnectionListParams = UserConnectionListParams.none()
        ): HttpResponseFor<UserConnectionListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<UserConnectionListPage> =
            list(UserConnectionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/admin/user_connections/{id}`, but is
         * otherwise the same as [UserConnectionService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponse = delete(id, UserConnectionDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: UserConnectionDeleteParams = UserConnectionDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: UserConnectionDeleteParams = UserConnectionDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: UserConnectionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: UserConnectionDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, UserConnectionDeleteParams.none(), requestOptions)
    }
}
