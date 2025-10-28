// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.arcade_engine.api.services.blocking

import com.arcade_engine.api.core.RequestOptions
import com.arcade_engine.api.models.WorkerCreateParams
import com.arcade_engine.api.models.WorkerDeleteParams
import com.arcade_engine.api.models.WorkerGetParams
import com.arcade_engine.api.models.WorkerHealthParams
import com.arcade_engine.api.models.WorkerHealthResponse
import com.arcade_engine.api.models.WorkerListPage
import com.arcade_engine.api.models.WorkerListParams
import com.arcade_engine.api.models.WorkerResponse
import com.arcade_engine.api.models.WorkerToolsPage
import com.arcade_engine.api.models.WorkerToolsParams
import com.arcade_engine.api.models.WorkerUpdateParams

interface WorkerService {

    /** Create a worker */
    @JvmOverloads
    fun create(
        params: WorkerCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WorkerResponse

    /** Update a worker */
    @JvmOverloads
    fun update(
        params: WorkerUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WorkerResponse

    /** List all workers with their definitions */
    @JvmOverloads
    fun list(
        params: WorkerListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WorkerListPage

    /** Delete a worker */
    @JvmOverloads
    fun delete(params: WorkerDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Get a worker by ID */
    @JvmOverloads
    fun get(
        params: WorkerGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WorkerResponse

    /** Get the health of a worker */
    @JvmOverloads
    fun health(
        params: WorkerHealthParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WorkerHealthResponse

    /** Returns a page of tools */
    @JvmOverloads
    fun tools(
        params: WorkerToolsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WorkerToolsPage
}
