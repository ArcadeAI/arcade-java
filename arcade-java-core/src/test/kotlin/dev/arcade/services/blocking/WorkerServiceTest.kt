// File generated from our OpenAPI spec by Stainless.

package dev.arcade.services.blocking

import dev.arcade.TestServerExtension
import dev.arcade.client.okhttp.ArcadeOkHttpClient
import dev.arcade.core.JsonValue
import dev.arcade.models.workers.CreateWorkerRequest
import dev.arcade.models.workers.UpdateWorkerRequest
import dev.arcade.models.workers.WorkerUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class WorkerServiceTest {

    @Test
    fun create() {
        val client =
            ArcadeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val workerService = client.workers()

        val workerResponse =
            workerService.create(
                CreateWorkerRequest.builder()
                    .id("id")
                    .enabled(true)
                    .http(
                        CreateWorkerRequest.Http.builder()
                            .retry(0L)
                            .secret("secret")
                            .timeout(1L)
                            .uri("uri")
                            .build()
                    )
                    .mcp(
                        CreateWorkerRequest.Mcp.builder()
                            .retry(0L)
                            .timeout(1L)
                            .uri("uri")
                            .headers(
                                CreateWorkerRequest.Mcp.Headers.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .oauth2(
                                CreateWorkerRequest.Mcp.Oauth2.builder()
                                    .authorizationUrl("authorization_url")
                                    .clientId("client_id")
                                    .clientSecret("client_secret")
                                    .externalId("external_id")
                                    .build()
                            )
                            .secrets(
                                CreateWorkerRequest.Mcp.Secrets.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .build()
                    )
                    .type("type")
                    .build()
            )

        workerResponse.validate()
    }

    @Test
    fun update() {
        val client =
            ArcadeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val workerService = client.workers()

        val workerResponse =
            workerService.update(
                WorkerUpdateParams.builder()
                    .id("id")
                    .updateWorkerRequest(
                        UpdateWorkerRequest.builder()
                            .enabled(true)
                            .http(
                                UpdateWorkerRequest.Http.builder()
                                    .retry(0L)
                                    .secret("secret")
                                    .timeout(1L)
                                    .uri("uri")
                                    .build()
                            )
                            .mcp(
                                UpdateWorkerRequest.Mcp.builder()
                                    .headers(
                                        UpdateWorkerRequest.Mcp.Headers.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .oauth2(
                                        UpdateWorkerRequest.Mcp.Oauth2.builder()
                                            .authorizationUrl("authorization_url")
                                            .clientId("client_id")
                                            .clientSecret("client_secret")
                                            .build()
                                    )
                                    .retry(0L)
                                    .secrets(
                                        UpdateWorkerRequest.Mcp.Secrets.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .timeout(1L)
                                    .uri("uri")
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        workerResponse.validate()
    }

    @Test
    fun list() {
        val client =
            ArcadeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val workerService = client.workers()

        val page = workerService.list()

        page.response().validate()
    }

    @Test
    fun delete() {
        val client =
            ArcadeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val workerService = client.workers()

        workerService.delete("id")
    }

    @Test
    fun get() {
        val client =
            ArcadeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val workerService = client.workers()

        val workerResponse = workerService.get("id")

        workerResponse.validate()
    }

    @Test
    fun health() {
        val client =
            ArcadeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val workerService = client.workers()

        val workerHealthResponse = workerService.health("id")

        workerHealthResponse.validate()
    }

    @Test
    fun tools() {
        val client =
            ArcadeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val workerService = client.workers()

        val page = workerService.tools("id")

        page.response().validate()
    }
}
