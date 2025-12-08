// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package dev.arcade.services.blocking

import dev.arcade.core.RequestOptions
import dev.arcade.models.WorkerCreateParams
import dev.arcade.models.WorkerDeleteParams
import dev.arcade.models.WorkerGetParams
import dev.arcade.models.WorkerHealthParams
import dev.arcade.models.WorkerHealthResponse
import dev.arcade.models.WorkerListPage
import dev.arcade.models.WorkerListParams
import dev.arcade.models.WorkerResponse
import dev.arcade.models.WorkerToolsPage
import dev.arcade.models.WorkerToolsParams
import dev.arcade.models.WorkerUpdateParams

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
