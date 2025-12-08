// File generated from our OpenAPI spec by Stainless.

package dev.arcade.services.blocking.admin

import dev.arcade.TestServerExtension
import dev.arcade.client.okhttp.ArcadeOkHttpClient
import dev.arcade.models.AdminSecretDeleteParams
import dev.arcade.models.AdminSecretListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class SecretServiceTest {

    @Test
    fun callList() {
        val client =
            ArcadeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val secretService = client.admin().secrets()
        val adminSecretListResponse = secretService.list(AdminSecretListParams.builder().build())
        println(adminSecretListResponse)
        adminSecretListResponse.validate()
    }

    @Test
    fun callDelete() {
        val client =
            ArcadeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val secretService = client.admin().secrets()
        secretService.delete(AdminSecretDeleteParams.builder().secretId("secret_id").build())
    }
}
