// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package dev.arcade.services.blocking.tools

import dev.arcade.core.RequestOptions
import dev.arcade.models.ToolFormattedGetParams
import dev.arcade.models.ToolFormattedGetResponse
import dev.arcade.models.ToolFormattedListPage
import dev.arcade.models.ToolFormattedListParams

interface FormattedService {

    /**
     * Returns a page of tools from the engine configuration, optionally filtered by toolkit,
     * formatted for a specific provider
     */
    @JvmOverloads
    fun list(
        params: ToolFormattedListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ToolFormattedListPage

    /** Returns the formatted tool specification for a specific tool, given a provider */
    @JvmOverloads
    fun get(
        params: ToolFormattedGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ToolFormattedGetResponse
}
