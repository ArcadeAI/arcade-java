// File generated from our OpenAPI spec by Stainless.

package dev.arcade.services.blocking

import dev.arcade.TestServerExtension
import dev.arcade.client.okhttp.ArcadeOkHttpClient
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class HealthServiceTest {

    @Test
    fun check() {
        val client =
            ArcadeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val healthService = client.health()

        val healthSchema = healthService.check()

        healthSchema.validate()
    }
}
