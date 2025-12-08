// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package dev.arcade.services.async

import dev.arcade.core.RequestOptions
import dev.arcade.models.HealthCheckParams
import dev.arcade.models.HealthSchema
import java.util.concurrent.CompletableFuture

interface HealthServiceAsync {

    /** Check if Arcade Engine is healthy */
    @JvmOverloads
    fun check(
        params: HealthCheckParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HealthSchema>
}
