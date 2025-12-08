// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package dev.arcade.services.blocking.tools

import dev.arcade.core.RequestOptions
import dev.arcade.models.ToolScheduledGetParams
import dev.arcade.models.ToolScheduledGetResponse
import dev.arcade.models.ToolScheduledListPage
import dev.arcade.models.ToolScheduledListParams

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
