// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.arcade_engine.api.services.async.tools

import com.arcade_engine.api.core.RequestOptions
import com.arcade_engine.api.models.ToolScheduledGetParams
import com.arcade_engine.api.models.ToolScheduledGetResponse
import com.arcade_engine.api.models.ToolScheduledListPageAsync
import com.arcade_engine.api.models.ToolScheduledListParams
import java.util.concurrent.CompletableFuture

interface ScheduledServiceAsync {

    /** Returns a page of scheduled tool executions */
    @JvmOverloads
    fun list(
        params: ToolScheduledListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ToolScheduledListPageAsync>

    /** Returns the details for a specific scheduled tool execution */
    @JvmOverloads
    fun get(
        params: ToolScheduledGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ToolScheduledGetResponse>
}
