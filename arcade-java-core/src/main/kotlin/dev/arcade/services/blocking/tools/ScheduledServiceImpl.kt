// File generated from our OpenAPI spec by Stainless.

package dev.arcade.services.blocking.tools

import dev.arcade.core.ClientOptions
import java.util.function.Consumer

class ScheduledServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ScheduledService {

    private val withRawResponse: ScheduledService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ScheduledService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ScheduledService =
        ScheduledServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ScheduledService.WithRawResponse {

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ScheduledService.WithRawResponse =
            ScheduledServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )
    }
}
