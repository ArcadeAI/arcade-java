// File generated from our OpenAPI spec by Stainless.

package org.arcadeai.api.services.blocking

import org.arcadeai.api.TestServerExtension
import org.arcadeai.api.client.okhttp.ArcadeOkHttpClient
import org.arcadeai.api.models.HealthCheckParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class HealthServiceTest {

    @Test
    fun callCheck() {
        val client =
            ArcadeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val healthService = client.health()
        val healthSchema = healthService.check(HealthCheckParams.builder().build())
        println(healthSchema)
        healthSchema.validate()
    }
}
