// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package org.arcadeai.api.services.blocking

import org.arcadeai.api.core.RequestOptions
import org.arcadeai.api.models.AuthorizationResponse
import org.arcadeai.api.models.ExecuteToolResponse
import org.arcadeai.api.models.ToolAuthorizeParams
import org.arcadeai.api.models.ToolDefinition
import org.arcadeai.api.models.ToolExecuteParams
import org.arcadeai.api.models.ToolGetParams
import org.arcadeai.api.models.ToolListPage
import org.arcadeai.api.models.ToolListParams
import org.arcadeai.api.services.blocking.tools.FormattedService
import org.arcadeai.api.services.blocking.tools.ScheduledService

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
