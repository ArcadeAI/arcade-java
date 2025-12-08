// File generated from our OpenAPI spec by Stainless.

package dev.arcade.services.blocking

import dev.arcade.TestServerExtension
import dev.arcade.client.okhttp.ArcadeOkHttpClient
import dev.arcade.core.JsonValue
import dev.arcade.models.CreateWorkerRequest
import dev.arcade.models.UpdateWorkerRequest
import dev.arcade.models.WorkerCreateParams
import dev.arcade.models.WorkerDeleteParams
import dev.arcade.models.WorkerGetParams
import dev.arcade.models.WorkerHealthParams
import dev.arcade.models.WorkerListParams
import dev.arcade.models.WorkerToolsParams
import dev.arcade.models.WorkerUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class WorkerServiceTest {

    @Test
    fun callCreate() {
        val client =
            ArcadeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val workerService = client.workers()
        val workerResponse =
            workerService.create(
                WorkerCreateParams.builder()
                    .createWorkerRequest(
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
                    .build()
            )
        println(workerResponse)
        workerResponse.validate()
    }

    @Test
    fun callUpdate() {
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
        println(workerResponse)
        workerResponse.validate()
    }

    @Test
    fun callList() {
        val client =
            ArcadeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val workerService = client.workers()
        val schemasOffsetPageSchemasWorkerResponse =
            workerService.list(WorkerListParams.builder().build())
        println(schemasOffsetPageSchemasWorkerResponse)
        schemasOffsetPageSchemasWorkerResponse.items().forEach { it.validate() }
    }

    @Test
    fun callDelete() {
        val client =
            ArcadeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val workerService = client.workers()
        workerService.delete(WorkerDeleteParams.builder().id("id").build())
    }

    @Test
    fun callGet() {
        val client =
            ArcadeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val workerService = client.workers()
        val workerResponse = workerService.get(WorkerGetParams.builder().id("id").build())
        println(workerResponse)
        workerResponse.validate()
    }

    @Test
    fun callHealth() {
        val client =
            ArcadeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val workerService = client.workers()
        val workerHealthResponse =
            workerService.health(WorkerHealthParams.builder().id("id").build())
        println(workerHealthResponse)
        workerHealthResponse.validate()
    }

    @Test
    fun callTools() {
        val client =
            ArcadeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val workerService = client.workers()
        val schemasOffsetPageSchemasToolResponse =
            workerService.tools(WorkerToolsParams.builder().id("id").build())
        println(schemasOffsetPageSchemasToolResponse)
        schemasOffsetPageSchemasToolResponse.items().forEach { it.validate() }
    }
}
