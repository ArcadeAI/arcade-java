// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.arcade_engine.api.services.async.admin

import com.arcade_engine.api.core.RequestOptions
import com.arcade_engine.api.models.AdminAuthProviderCreateParams
import com.arcade_engine.api.models.AdminAuthProviderDeleteParams
import com.arcade_engine.api.models.AdminAuthProviderGetParams
import com.arcade_engine.api.models.AdminAuthProviderListParams
import com.arcade_engine.api.models.AdminAuthProviderListResponse
import com.arcade_engine.api.models.AdminAuthProviderPatchParams
import com.arcade_engine.api.models.AuthProviderResponse
import java.util.concurrent.CompletableFuture

interface AuthProviderServiceAsync {

    /** Create a new auth provider */
    @JvmOverloads
    fun create(
        params: AdminAuthProviderCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AuthProviderResponse>

    /** List a page of auth providers that are available to the caller */
    @JvmOverloads
    fun list(
        params: AdminAuthProviderListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AdminAuthProviderListResponse>

    /** Delete a specific auth provider */
    @JvmOverloads
    fun delete(
        params: AdminAuthProviderDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AuthProviderResponse>

    /** Get the details of a specific auth provider */
    @JvmOverloads
    fun get(
        params: AdminAuthProviderGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AuthProviderResponse>

    /** Patch an existing auth provider */
    @JvmOverloads
    fun patch(
        params: AdminAuthProviderPatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AuthProviderResponse>
}
