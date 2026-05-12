// File generated from our OpenAPI spec by Stainless.

package dev.arcade.services.async

import dev.arcade.TestServerExtension
import dev.arcade.client.okhttp.ArcadeOkHttpClientAsync
import dev.arcade.core.JsonValue
import dev.arcade.models.workers.CreateWorkerRequest
import dev.arcade.models.workers.UpdateWorkerRequest
import dev.arcade.models.workers.WorkerUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class WorkerServiceAsyncTest {

    @Test
    fun create() {
        val client =
            ArcadeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val workerServiceAsync = client.workers()

        val workerResponseFuture =
            workerServiceAsync.create(
                CreateWorkerRequest.builder()
                    .id("id")
                    .enabled(true)
                    .http(
                        CreateWorkerRequest.Http.builder()
                            .retry(0L)
                            .secret("secret")
                            .timeout(0L)
                            .uri("uri")
                            .build()
                    )
                    .mcp(
                        CreateWorkerRequest.Mcp.builder()
                            .retry(0L)
                            .timeout(0L)
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

        val workerResponse = workerResponseFuture.get()
        workerResponse.validate()
    }

    @Test
    fun update() {
        val client =
            ArcadeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val workerServiceAsync = client.workers()

        val workerResponseFuture =
            workerServiceAsync.update(
                WorkerUpdateParams.builder()
                    .id("id")
                    .updateWorkerRequest(
                        UpdateWorkerRequest.builder()
                            .enabled(true)
                            .http(
                                UpdateWorkerRequest.Http.builder()
                                    .retry(0L)
                                    .secret("secret")
                                    .timeout(0L)
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
                                    .timeout(0L)
                                    .uri("uri")
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        val workerResponse = workerResponseFuture.get()
        workerResponse.validate()
    }

    @Test
    fun list() {
        val client =
            ArcadeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val workerServiceAsync = client.workers()

        val pageFuture = workerServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun delete() {
        val client =
            ArcadeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val workerServiceAsync = client.workers()

        val future = workerServiceAsync.delete("id")

        val response = future.get()
    }

    @Test
    fun get() {
        val client =
            ArcadeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val workerServiceAsync = client.workers()

        val workerResponseFuture = workerServiceAsync.get("id")

        val workerResponse = workerResponseFuture.get()
        workerResponse.validate()
    }

    @Test
    fun health() {
        val client =
            ArcadeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val workerServiceAsync = client.workers()

        val workerHealthResponseFuture = workerServiceAsync.health("id")

        val workerHealthResponse = workerHealthResponseFuture.get()
        workerHealthResponse.validate()
    }

    @Test
    fun tools() {
        val client =
            ArcadeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val workerServiceAsync = client.workers()

        val pageFuture = workerServiceAsync.tools("id")

        val page = pageFuture.get()
        page.response().validate()
    }
}
