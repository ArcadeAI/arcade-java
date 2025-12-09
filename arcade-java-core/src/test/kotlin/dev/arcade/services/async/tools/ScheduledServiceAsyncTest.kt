// File generated from our OpenAPI spec by Stainless.

package dev.arcade.services.async.tools

import dev.arcade.TestServerExtension
import dev.arcade.client.okhttp.ArcadeOkHttpClientAsync
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ScheduledServiceAsyncTest {

    @Test
    fun list() {
        val client =
            ArcadeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val scheduledServiceAsync = client.tools().scheduled()

        val pageFuture = scheduledServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun get() {
        val client =
            ArcadeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val scheduledServiceAsync = client.tools().scheduled()

        val scheduledFuture = scheduledServiceAsync.get("id")

        val scheduled = scheduledFuture.get()
        scheduled.validate()
    }
}
