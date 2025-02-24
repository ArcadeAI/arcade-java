// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package org.arcadeai.api.services.async

import java.util.concurrent.CompletableFuture
import org.arcadeai.api.core.RequestOptions
import org.arcadeai.api.models.HealthCheckParams
import org.arcadeai.api.models.HealthSchema

interface HealthServiceAsync {

    /** Check if Arcade Engine is healthy */
    @JvmOverloads
    fun check(
        params: HealthCheckParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HealthSchema>
}
