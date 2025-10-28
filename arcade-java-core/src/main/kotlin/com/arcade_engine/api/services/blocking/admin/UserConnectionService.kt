// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.arcade_engine.api.services.blocking.admin

import com.arcade_engine.api.core.RequestOptions
import com.arcade_engine.api.models.AdminUserConnectionDeleteParams
import com.arcade_engine.api.models.AdminUserConnectionListPage
import com.arcade_engine.api.models.AdminUserConnectionListParams

interface UserConnectionService {

    /** List all auth connections */
    @JvmOverloads
    fun list(
        params: AdminUserConnectionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AdminUserConnectionListPage

    /** Delete a user/auth provider connection */
    @JvmOverloads
    fun delete(
        params: AdminUserConnectionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )
}
