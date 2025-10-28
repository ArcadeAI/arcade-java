// File generated from our OpenAPI spec by Stainless.

package com.arcade_engine.api.models

import com.arcade_engine.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class WorkerUpdateParamsTest {

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

    @Test
    fun getPathParam() {
        val params =
            WorkerUpdateParams.builder()
                .id("id")
                .updateWorkerRequest(UpdateWorkerRequest.builder().build())
                .build()
        assertThat(params).isNotNull
        // path param "id"
        assertThat(params.getPathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
