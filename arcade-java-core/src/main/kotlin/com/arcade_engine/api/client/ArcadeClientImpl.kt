// File generated from our OpenAPI spec by Stainless.

package com.arcade_engine.api.client

import com.arcade_engine.api.core.ClientOptions
import com.arcade_engine.api.core.getPackageVersion
import com.arcade_engine.api.services.blocking.AdminService
import com.arcade_engine.api.services.blocking.AdminServiceImpl
import com.arcade_engine.api.services.blocking.AuthService
import com.arcade_engine.api.services.blocking.AuthServiceImpl
import com.arcade_engine.api.services.blocking.ChatService
import com.arcade_engine.api.services.blocking.ChatServiceImpl
import com.arcade_engine.api.services.blocking.HealthService
import com.arcade_engine.api.services.blocking.HealthServiceImpl
import com.arcade_engine.api.services.blocking.ToolService
import com.arcade_engine.api.services.blocking.ToolServiceImpl
import com.arcade_engine.api.services.blocking.WorkerService
import com.arcade_engine.api.services.blocking.WorkerServiceImpl

class ArcadeClientImpl(private val clientOptions: ClientOptions) : ArcadeClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: ArcadeClientAsync by lazy { ArcadeClientAsyncImpl(clientOptions) }

    private val admin: AdminService by lazy { AdminServiceImpl(clientOptionsWithUserAgent) }

    private val auth: AuthService by lazy { AuthServiceImpl(clientOptionsWithUserAgent) }

    private val health: HealthService by lazy { HealthServiceImpl(clientOptionsWithUserAgent) }

    private val chat: ChatService by lazy { ChatServiceImpl(clientOptionsWithUserAgent) }

    private val tools: ToolService by lazy { ToolServiceImpl(clientOptionsWithUserAgent) }

    private val workers: WorkerService by lazy { WorkerServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): ArcadeClientAsync = async

    override fun admin(): AdminService = admin

    override fun auth(): AuthService = auth

    override fun health(): HealthService = health

    override fun chat(): ChatService = chat

    override fun tools(): ToolService = tools

    override fun workers(): WorkerService = workers

    override fun close() = clientOptions.httpClient.close()
}
