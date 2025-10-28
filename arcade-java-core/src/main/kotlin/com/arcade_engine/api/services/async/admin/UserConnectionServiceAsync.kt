// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.arcade_engine.api.services.async.admin

import com.arcade_engine.api.core.RequestOptions
import com.arcade_engine.api.models.AdminUserConnectionDeleteParams
import com.arcade_engine.api.models.AdminUserConnectionListPageAsync
import com.arcade_engine.api.models.AdminUserConnectionListParams
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
