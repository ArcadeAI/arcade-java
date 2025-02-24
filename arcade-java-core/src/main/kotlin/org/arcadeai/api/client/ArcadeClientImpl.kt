// File generated from our OpenAPI spec by Stainless.

package org.arcadeai.api.client

import org.arcadeai.api.core.ClientOptions
import org.arcadeai.api.core.getPackageVersion
import org.arcadeai.api.services.blocking.AuthService
import org.arcadeai.api.services.blocking.AuthServiceImpl
import org.arcadeai.api.services.blocking.ChatService
import org.arcadeai.api.services.blocking.ChatServiceImpl
import org.arcadeai.api.services.blocking.HealthService
import org.arcadeai.api.services.blocking.HealthServiceImpl
import org.arcadeai.api.services.blocking.ToolService
import org.arcadeai.api.services.blocking.ToolServiceImpl

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

    private val auth: AuthService by lazy { AuthServiceImpl(clientOptionsWithUserAgent) }

    private val health: HealthService by lazy { HealthServiceImpl(clientOptionsWithUserAgent) }

    private val chat: ChatService by lazy { ChatServiceImpl(clientOptionsWithUserAgent) }

    private val tools: ToolService by lazy { ToolServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): ArcadeClientAsync = async

    override fun auth(): AuthService = auth

    override fun health(): HealthService = health

    override fun chat(): ChatService = chat

    override fun tools(): ToolService = tools

    override fun close() = clientOptions.httpClient.close()
}
