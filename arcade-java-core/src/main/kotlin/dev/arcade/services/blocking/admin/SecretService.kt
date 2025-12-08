// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package dev.arcade.services.blocking.admin

import dev.arcade.core.RequestOptions
import dev.arcade.models.AdminSecretDeleteParams
import dev.arcade.models.AdminSecretListParams
import dev.arcade.models.AdminSecretListResponse

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
