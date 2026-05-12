// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models.workers

import dev.arcade.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WorkerCreateParamsTest {

    @Test
    fun create() {
        WorkerCreateParams.builder()
            .createWorkerRequest(
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
            .build()
    }

    @Test
    fun body() {
        val params =
            WorkerCreateParams.builder()
                .createWorkerRequest(
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
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            WorkerCreateParams.builder()
                .createWorkerRequest(CreateWorkerRequest.builder().id("id").build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(CreateWorkerRequest.builder().id("id").build())
    }
}
