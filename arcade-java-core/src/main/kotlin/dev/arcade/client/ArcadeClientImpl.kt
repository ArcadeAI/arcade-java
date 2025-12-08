// File generated from our OpenAPI spec by Stainless.

package dev.arcade.client

import dev.arcade.core.ClientOptions
import dev.arcade.core.getPackageVersion
import dev.arcade.services.blocking.AdminService
import dev.arcade.services.blocking.AdminServiceImpl
import dev.arcade.services.blocking.AuthService
import dev.arcade.services.blocking.AuthServiceImpl
import dev.arcade.services.blocking.ChatService
import dev.arcade.services.blocking.ChatServiceImpl
import dev.arcade.services.blocking.HealthService
import dev.arcade.services.blocking.HealthServiceImpl
import dev.arcade.services.blocking.ToolService
import dev.arcade.services.blocking.ToolServiceImpl
import dev.arcade.services.blocking.WorkerService
import dev.arcade.services.blocking.WorkerServiceImpl

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
