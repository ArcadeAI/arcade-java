// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package dev.arcade.services.async

import dev.arcade.core.RequestOptions
import dev.arcade.models.AuthorizationResponse
import dev.arcade.models.ExecuteToolResponse
import dev.arcade.models.ToolAuthorizeParams
import dev.arcade.models.ToolDefinition
import dev.arcade.models.ToolExecuteParams
import dev.arcade.models.ToolGetParams
import dev.arcade.models.ToolListPageAsync
import dev.arcade.models.ToolListParams
import dev.arcade.services.async.tools.FormattedServiceAsync
import dev.arcade.services.async.tools.ScheduledServiceAsync
import java.util.concurrent.CompletableFuture

interface ToolServiceAsync {

    fun scheduled(): ScheduledServiceAsync

    fun formatted(): FormattedServiceAsync

    /** Returns a page of tools from the engine configuration, optionally filtered by toolkit */
    @JvmOverloads
    fun list(
        params: ToolListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ToolListPageAsync>

    /** Authorizes a user for a specific tool by name */
    @JvmOverloads
    fun authorize(
        params: ToolAuthorizeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AuthorizationResponse>

    /** Executes a tool by name and arguments */
    @JvmOverloads
    fun execute(
        params: ToolExecuteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExecuteToolResponse>

    /** Returns the arcade tool specification for a specific tool */
    @JvmOverloads
    fun get(
        params: ToolGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ToolDefinition>
}
