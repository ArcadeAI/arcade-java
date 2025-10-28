// File generated from our OpenAPI spec by Stainless.

package com.arcade_engine.api.services.blocking.tools

import com.arcade_engine.api.TestServerExtension
import com.arcade_engine.api.client.okhttp.ArcadeOkHttpClient
import com.arcade_engine.api.models.ToolScheduledGetParams
import com.arcade_engine.api.models.ToolScheduledListParams
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
