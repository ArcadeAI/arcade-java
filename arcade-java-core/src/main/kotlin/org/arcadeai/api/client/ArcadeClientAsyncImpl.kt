// File generated from our OpenAPI spec by Stainless.

package org.arcadeai.api.client

import org.arcadeai.api.core.ClientOptions
import org.arcadeai.api.core.getPackageVersion
import org.arcadeai.api.services.async.AuthServiceAsync
import org.arcadeai.api.services.async.AuthServiceAsyncImpl
import org.arcadeai.api.services.async.ChatServiceAsync
import org.arcadeai.api.services.async.ChatServiceAsyncImpl
import org.arcadeai.api.services.async.HealthServiceAsync
import org.arcadeai.api.services.async.HealthServiceAsyncImpl
import org.arcadeai.api.services.async.ToolServiceAsync
import org.arcadeai.api.services.async.ToolServiceAsyncImpl

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

    private val auth: AuthServiceAsync by lazy { AuthServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val health: HealthServiceAsync by lazy {
        HealthServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val chat: ChatServiceAsync by lazy { ChatServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val tools: ToolServiceAsync by lazy { ToolServiceAsyncImpl(clientOptionsWithUserAgent) }

    override fun sync(): ArcadeClient = sync

    override fun auth(): AuthServiceAsync = auth

    override fun health(): HealthServiceAsync = health

    override fun chat(): ChatServiceAsync = chat

    override fun tools(): ToolServiceAsync = tools

    override fun close() = clientOptions.httpClient.close()
}
