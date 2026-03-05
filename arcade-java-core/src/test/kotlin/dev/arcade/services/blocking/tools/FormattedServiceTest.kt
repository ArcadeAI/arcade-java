// File generated from our OpenAPI spec by Stainless.

package dev.arcade.services.blocking.tools

import dev.arcade.TestServerExtension
import dev.arcade.client.okhttp.ArcadeOkHttpClient
import dev.arcade.models.tools.formatted.FormattedGetParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class FormattedServiceTest {

    @Test
    fun list() {
        val client =
            ArcadeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val formattedService = client.tools().formatted()

        val page = formattedService.list()

        page.response().validate()
    }

    @Test
    fun get() {
        val client =
            ArcadeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val formattedService = client.tools().formatted()

        val formatted =
            formattedService.get(
                FormattedGetParams.builder().name("name").format("format").userId("user_id").build()
            )

        formatted.validate()
    }
}
