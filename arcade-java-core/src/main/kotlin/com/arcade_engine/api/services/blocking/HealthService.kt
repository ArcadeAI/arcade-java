// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.arcade_engine.api.services.blocking

import com.arcade_engine.api.core.RequestOptions
import com.arcade_engine.api.models.HealthCheckParams
import com.arcade_engine.api.models.HealthSchema

interface HealthService {

    /** Check if Arcade Engine is healthy */
    @JvmOverloads
    fun check(
        params: HealthCheckParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HealthSchema
}
