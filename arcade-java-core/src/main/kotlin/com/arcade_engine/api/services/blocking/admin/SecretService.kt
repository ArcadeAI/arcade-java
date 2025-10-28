// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.arcade_engine.api.services.blocking.admin

import com.arcade_engine.api.core.RequestOptions
import com.arcade_engine.api.models.AdminSecretDeleteParams
import com.arcade_engine.api.models.AdminSecretListParams
import com.arcade_engine.api.models.AdminSecretListResponse

interface SecretService {

    /** List all secrets that are visible to the caller */
    @JvmOverloads
    fun list(
        params: AdminSecretListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AdminSecretListResponse

    /** Delete a secret by its ID */
    @JvmOverloads
    fun delete(
        params: AdminSecretDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )
}
