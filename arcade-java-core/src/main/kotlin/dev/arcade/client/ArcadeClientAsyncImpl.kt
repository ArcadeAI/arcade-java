// File generated from our OpenAPI spec by Stainless.

package dev.arcade.client

import dev.arcade.core.ClientOptions
import dev.arcade.core.getPackageVersion
import dev.arcade.services.async.AdminServiceAsync
import dev.arcade.services.async.AdminServiceAsyncImpl
import dev.arcade.services.async.AuthServiceAsync
import dev.arcade.services.async.AuthServiceAsyncImpl
import dev.arcade.services.async.ChatServiceAsync
import dev.arcade.services.async.ChatServiceAsyncImpl
import dev.arcade.services.async.HealthServiceAsync
import dev.arcade.services.async.HealthServiceAsyncImpl
import dev.arcade.services.async.ToolServiceAsync
import dev.arcade.services.async.ToolServiceAsyncImpl
import dev.arcade.services.async.WorkerServiceAsync
import dev.arcade.services.async.WorkerServiceAsyncImpl

class ArcadeClientAsyncImpl(private val clientOptions: ClientOptions) : ArcadeClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: ArcadeClient by lazy { ArcadeClientImpl(clientOptions) }

    private val admin: AdminServiceAsync by lazy {
        AdminServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val auth: AuthServiceAsync by lazy { AuthServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val health: HealthServiceAsync by lazy {
        HealthServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val chat: ChatServiceAsync by lazy { ChatServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val tools: ToolServiceAsync by lazy { ToolServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val workers: WorkerServiceAsync by lazy {
        WorkerServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    override fun sync(): ArcadeClient = sync

    override fun admin(): AdminServiceAsync = admin

    override fun auth(): AuthServiceAsync = auth

    override fun health(): HealthServiceAsync = health

    override fun chat(): ChatServiceAsync = chat

    override fun tools(): ToolServiceAsync = tools

    override fun workers(): WorkerServiceAsync = workers

    override fun close() = clientOptions.httpClient.close()
}
