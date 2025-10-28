// File generated from our OpenAPI spec by Stainless.

package com.arcade_engine.api.services.blocking.admin

import com.arcade_engine.api.TestServerExtension
import com.arcade_engine.api.client.okhttp.ArcadeOkHttpClient
import com.arcade_engine.api.models.AdminUserConnectionDeleteParams
import com.arcade_engine.api.models.AdminUserConnectionListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class UserConnectionServiceTest {

    @Test
    fun callList() {
        val client =
            ArcadeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userConnectionService = client.admin().userConnections()
        val schemasOffsetPageSchemasUserAuthProviderConnectionResponse =
            userConnectionService.list(AdminUserConnectionListParams.builder().build())
        println(schemasOffsetPageSchemasUserAuthProviderConnectionResponse)
        schemasOffsetPageSchemasUserAuthProviderConnectionResponse.items().forEach { it.validate() }
    }

    @Test
    fun callDelete() {
        val client =
            ArcadeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userConnectionService = client.admin().userConnections()
        userConnectionService.delete(AdminUserConnectionDeleteParams.builder().id("id").build())
    }
}
