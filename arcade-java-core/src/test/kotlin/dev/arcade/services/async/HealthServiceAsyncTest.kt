// File generated from our OpenAPI spec by Stainless.

package dev.arcade.services.async

import dev.arcade.TestServerExtension
import dev.arcade.client.okhttp.ArcadeOkHttpClientAsync
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class HealthServiceAsyncTest {

    @Test
    fun check() {
        val client =
            ArcadeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val healthServiceAsync = client.health()

        val healthSchemaFuture = healthServiceAsync.check()

        val healthSchema = healthSchemaFuture.get()
        healthSchema.validate()
    }
}
