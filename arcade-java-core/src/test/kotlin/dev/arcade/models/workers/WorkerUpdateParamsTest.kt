// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models.workers

import dev.arcade.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WorkerUpdateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun pathParams() {
        val params =
            WorkerUpdateParams.builder()
                .id("id")
                .updateWorkerRequest(UpdateWorkerRequest.builder().build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            WorkerUpdateParams.builder()
                .id("id")
                .updateWorkerRequest(UpdateWorkerRequest.builder().build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(UpdateWorkerRequest.builder().build())
    }
}
