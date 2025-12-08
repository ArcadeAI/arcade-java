// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package dev.arcade.services.async.admin

import dev.arcade.core.RequestOptions
import dev.arcade.models.AdminUserConnectionDeleteParams
import dev.arcade.models.AdminUserConnectionListPageAsync
import dev.arcade.models.AdminUserConnectionListParams
import java.util.concurrent.CompletableFuture

interface UserConnectionServiceAsync {

    /** List all auth connections */
    @JvmOverloads
    fun list(
        params: AdminUserConnectionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AdminUserConnectionListPageAsync>

    /** Delete a user/auth provider connection */
    @JvmOverloads
    fun delete(
        params: AdminUserConnectionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>
}
