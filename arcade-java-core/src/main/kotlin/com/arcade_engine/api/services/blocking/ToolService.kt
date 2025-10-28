// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.arcade_engine.api.services.blocking

import com.arcade_engine.api.core.RequestOptions
import com.arcade_engine.api.models.AuthorizationResponse
import com.arcade_engine.api.models.ExecuteToolResponse
import com.arcade_engine.api.models.ToolAuthorizeParams
import com.arcade_engine.api.models.ToolDefinition
import com.arcade_engine.api.models.ToolExecuteParams
import com.arcade_engine.api.models.ToolGetParams
import com.arcade_engine.api.models.ToolListPage
import com.arcade_engine.api.models.ToolListParams
import com.arcade_engine.api.services.blocking.tools.FormattedService
import com.arcade_engine.api.services.blocking.tools.ScheduledService

interface ToolService {

    fun scheduled(): ScheduledService

    fun formatted(): FormattedService

    /** Returns a page of tools from the engine configuration, optionally filtered by toolkit */
    @JvmOverloads
    fun list(
        params: ToolListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ToolListPage

    /** Authorizes a user for a specific tool by name */
    @JvmOverloads
    fun authorize(
        params: ToolAuthorizeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthorizationResponse

    /** Executes a tool by name and arguments */
    @JvmOverloads
    fun execute(
        params: ToolExecuteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExecuteToolResponse

    /** Returns the arcade tool specification for a specific tool */
    @JvmOverloads
    fun get(
        params: ToolGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ToolDefinition
}
