// File generated from our OpenAPI spec by Stainless.

package dev.arcade.services.async.tools

import dev.arcade.TestServerExtension
import dev.arcade.client.okhttp.ArcadeOkHttpClientAsync
import dev.arcade.models.tools.formatted.FormattedGetParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class FormattedServiceAsyncTest {

    @Test
    fun list() {
        val client =
            ArcadeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val formattedServiceAsync = client.tools().formatted()

        val pageFuture = formattedServiceAsync.list()

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
        val formattedServiceAsync = client.tools().formatted()

        val formattedFuture =
            formattedServiceAsync.get(
                FormattedGetParams.builder().name("name").format("format").userId("user_id").build()
            )

        val formatted = formattedFuture.get()
        formatted.validate()
    }
}
