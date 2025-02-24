// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package org.arcadeai.api.services.blocking.tools

import org.arcadeai.api.core.RequestOptions
import org.arcadeai.api.models.ToolScheduledGetParams
import org.arcadeai.api.models.ToolScheduledGetResponse
import org.arcadeai.api.models.ToolScheduledListPage
import org.arcadeai.api.models.ToolScheduledListParams

interface ScheduledService {

    /** Returns a page of scheduled tool executions */
    @JvmOverloads
    fun list(
        params: ToolScheduledListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ToolScheduledListPage

    /** Returns the details for a specific scheduled tool execution */
    @JvmOverloads
    fun get(
        params: ToolScheduledGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ToolScheduledGetResponse
}
