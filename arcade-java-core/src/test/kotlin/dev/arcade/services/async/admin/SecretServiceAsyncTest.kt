// File generated from our OpenAPI spec by Stainless.

package dev.arcade.services.async.admin

import dev.arcade.TestServerExtension
import dev.arcade.client.okhttp.ArcadeOkHttpClientAsync
import dev.arcade.models.admin.secrets.SecretCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SecretServiceAsyncTest {

    @Test
    fun create() {
        val client =
            ArcadeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val secretServiceAsync = client.admin().secrets()

        val secretResponseFuture =
            secretServiceAsync.create(
                SecretCreateParams.builder()
                    .secretKey("secret_key")
                    .value("value")
                    .description("description")
                    .build()
            )

        val secretResponse = secretResponseFuture.get()
        secretResponse.validate()
    }

    @Test
    fun list() {
        val client =
            ArcadeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val secretServiceAsync = client.admin().secrets()

        val secretsFuture = secretServiceAsync.list()

        val secrets = secretsFuture.get()
        secrets.validate()
    }

    @Test
    fun delete() {
        val client =
            ArcadeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val secretServiceAsync = client.admin().secrets()

        val future = secretServiceAsync.delete("secret_id")

        val response = future.get()
    }
}
