// File generated from our OpenAPI spec by Stainless.

package dev.arcade.services.blocking.admin

import dev.arcade.TestServerExtension
import dev.arcade.client.okhttp.ArcadeOkHttpClient
import dev.arcade.models.admin.secrets.SecretCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SecretServiceTest {

    @Test
    fun create() {
        val client =
            ArcadeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val secretService = client.admin().secrets()

        val secretResponse =
            secretService.create(
                SecretCreateParams.builder()
                    .secretKey("secret_key")
                    .value("value")
                    .description("description")
                    .build()
            )

        secretResponse.validate()
    }

    @Test
    fun list() {
        val client =
            ArcadeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val secretService = client.admin().secrets()

        val secrets = secretService.list()

        secrets.validate()
    }

    @Test
    fun delete() {
        val client =
            ArcadeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val secretService = client.admin().secrets()

        secretService.delete("secret_id")
    }
}
