// File generated from our OpenAPI spec by Stainless.

package dev.arcade.services.blocking.admin

import dev.arcade.TestServerExtension
import dev.arcade.client.okhttp.ArcadeOkHttpClient
import dev.arcade.models.AdminUserConnectionDeleteParams
import dev.arcade.models.AdminUserConnectionListParams
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
