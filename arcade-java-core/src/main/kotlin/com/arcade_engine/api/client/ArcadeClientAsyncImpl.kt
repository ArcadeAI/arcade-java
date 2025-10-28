// File generated from our OpenAPI spec by Stainless.

package com.arcade_engine.api.client

import com.arcade_engine.api.core.ClientOptions
import com.arcade_engine.api.core.getPackageVersion
import com.arcade_engine.api.services.async.AdminServiceAsync
import com.arcade_engine.api.services.async.AdminServiceAsyncImpl
import com.arcade_engine.api.services.async.AuthServiceAsync
import com.arcade_engine.api.services.async.AuthServiceAsyncImpl
import com.arcade_engine.api.services.async.ChatServiceAsync
import com.arcade_engine.api.services.async.ChatServiceAsyncImpl
import com.arcade_engine.api.services.async.HealthServiceAsync
import com.arcade_engine.api.services.async.HealthServiceAsyncImpl
import com.arcade_engine.api.services.async.ToolServiceAsync
import com.arcade_engine.api.services.async.ToolServiceAsyncImpl
import com.arcade_engine.api.services.async.WorkerServiceAsync
import com.arcade_engine.api.services.async.WorkerServiceAsyncImpl

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
