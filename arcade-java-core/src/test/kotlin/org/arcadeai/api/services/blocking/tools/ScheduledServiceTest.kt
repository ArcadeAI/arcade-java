// File generated from our OpenAPI spec by Stainless.

package org.arcadeai.api.services.blocking.tools

import org.arcadeai.api.TestServerExtension
import org.arcadeai.api.client.okhttp.ArcadeOkHttpClient
import org.arcadeai.api.models.ToolScheduledGetParams
import org.arcadeai.api.models.ToolScheduledListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ScheduledServiceTest {

    @Test
    fun callList() {
        val client =
            ArcadeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val scheduledService = client.tools().scheduled()
        val schemasOffsetPageSchemasToolExecutionListResponse =
            scheduledService.list(ToolScheduledListParams.builder().build())
        println(schemasOffsetPageSchemasToolExecutionListResponse)
        schemasOffsetPageSchemasToolExecutionListResponse.items().forEach { it.validate() }
    }

    @Test
    fun callGet() {
        val client =
            ArcadeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val scheduledService = client.tools().scheduled()
        val toolScheduledGetResponse =
            scheduledService.get(ToolScheduledGetParams.builder().id("id").build())
        println(toolScheduledGetResponse)
        toolScheduledGetResponse.validate()
    }
}
