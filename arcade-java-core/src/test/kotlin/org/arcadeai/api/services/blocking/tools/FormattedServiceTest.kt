// File generated from our OpenAPI spec by Stainless.

package org.arcadeai.api.services.blocking.tools

import org.arcadeai.api.TestServerExtension
import org.arcadeai.api.client.okhttp.ArcadeOkHttpClient
import org.arcadeai.api.models.ToolFormattedGetParams
import org.arcadeai.api.models.ToolFormattedListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class FormattedServiceTest {

    @Test
    fun callList() {
        val client =
            ArcadeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val formattedService = client.tools().formatted()
        val schemasOffsetPageAny = formattedService.list(ToolFormattedListParams.builder().build())
        println(schemasOffsetPageAny)
        schemasOffsetPageAny.items().forEach { it.validate() }
    }

    @Test
    fun callGet() {
        val client =
            ArcadeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val formattedService = client.tools().formatted()
        val toolFormattedGetResponse =
            formattedService.get(
                ToolFormattedGetParams.builder().name("name").format("format").build()
            )
        println(toolFormattedGetResponse)
    }
}
