// File generated from our OpenAPI spec by Stainless.

package com.arcade_engine.api.services.blocking.admin

import com.arcade_engine.api.TestServerExtension
import com.arcade_engine.api.client.okhttp.ArcadeOkHttpClient
import com.arcade_engine.api.models.AdminSecretDeleteParams
import com.arcade_engine.api.models.AdminSecretListParams
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
