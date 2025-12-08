// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models

import dev.arcade.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class WorkerResponseTest {

    @Test
    fun createWorkerResponse() {
        val workerResponse =
            WorkerResponse.builder()
                .id("id")
                .binding(
                    WorkerResponse.Binding.builder()
                        .id("id")
                        .type(WorkerResponse.Binding.Type.STATIC)
                        .build()
                )
                .enabled(true)
                .http(
                    WorkerResponse.Http.builder()
                        .retry(0L)
                        .secret(
                            WorkerResponse.Http.Secret.builder()
                                .binding(WorkerResponse.Http.Secret.Binding.STATIC)
                                .editable(true)
                                .exists(true)
                                .hint("hint")
                                .value("value")
                                .build()
                        )
                        .timeout(0L)
                        .uri("uri")
                        .build()
                )
                .managed(true)
                .mcp(
                    WorkerResponse.Mcp.builder()
                        .headers(
                            WorkerResponse.Mcp.Headers.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .oauth2(
                            WorkerResponse.Mcp.Oauth2.builder()
                                .authorizationUrl("authorization_url")
                                .clientId("client_id")
                                .clientSecret(
                                    WorkerResponse.Mcp.Oauth2.ClientSecret.builder()
                                        .binding(
                                            WorkerResponse.Mcp.Oauth2.ClientSecret.Binding.STATIC
                                        )
                                        .editable(true)
                                        .exists(true)
                                        .hint("hint")
                                        .value("value")
                                        .build()
                                )
                                .redirectUri("redirect_uri")
                                .build()
                        )
                        .retry(0L)
                        .secrets(
                            WorkerResponse.Mcp.Secrets.builder()
                                .putAdditionalProperty(
                                    "foo",
                                    JsonValue.from(
                                        mapOf(
                                            "binding" to "static",
                                            "editable" to true,
                                            "exists" to true,
                                            "hint" to "hint",
                                            "value" to "value",
                                        )
                                    ),
                                )
                                .build()
                        )
                        .timeout(0L)
                        .uri("uri")
                        .build()
                )
                .requirements(
                    WorkerResponse.Requirements.builder()
                        .authorization(
                            WorkerResponse.Requirements.Authorization.builder()
                                .met(true)
                                .oauth2(
                                    WorkerResponse.Requirements.Authorization.Oauth2.builder()
                                        .met(true)
                                        .build()
                                )
                                .build()
                        )
                        .met(true)
                        .build()
                )
                .type(WorkerResponse.Type.HTTP)
                .build()
        assertThat(workerResponse).isNotNull
        assertThat(workerResponse.id()).contains("id")
        assertThat(workerResponse.binding())
            .contains(
                WorkerResponse.Binding.builder()
                    .id("id")
                    .type(WorkerResponse.Binding.Type.STATIC)
                    .build()
            )
        assertThat(workerResponse.enabled()).contains(true)
        assertThat(workerResponse.http())
            .contains(
                WorkerResponse.Http.builder()
                    .retry(0L)
                    .secret(
                        WorkerResponse.Http.Secret.builder()
                            .binding(WorkerResponse.Http.Secret.Binding.STATIC)
                            .editable(true)
                            .exists(true)
                            .hint("hint")
                            .value("value")
                            .build()
                    )
                    .timeout(0L)
                    .uri("uri")
                    .build()
            )
        assertThat(workerResponse.managed()).contains(true)
        assertThat(workerResponse.mcp())
            .contains(
                WorkerResponse.Mcp.builder()
                    .headers(
                        WorkerResponse.Mcp.Headers.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .oauth2(
                        WorkerResponse.Mcp.Oauth2.builder()
                            .authorizationUrl("authorization_url")
                            .clientId("client_id")
                            .clientSecret(
                                WorkerResponse.Mcp.Oauth2.ClientSecret.builder()
                                    .binding(WorkerResponse.Mcp.Oauth2.ClientSecret.Binding.STATIC)
                                    .editable(true)
                                    .exists(true)
                                    .hint("hint")
                                    .value("value")
                                    .build()
                            )
                            .redirectUri("redirect_uri")
                            .build()
                    )
                    .retry(0L)
                    .secrets(
                        WorkerResponse.Mcp.Secrets.builder()
                            .putAdditionalProperty(
                                "foo",
                                JsonValue.from(
                                    mapOf(
                                        "binding" to "static",
                                        "editable" to true,
                                        "exists" to true,
                                        "hint" to "hint",
                                        "value" to "value",
                                    )
                                ),
                            )
                            .build()
                    )
                    .timeout(0L)
                    .uri("uri")
                    .build()
            )
        assertThat(workerResponse.requirements())
            .contains(
                WorkerResponse.Requirements.builder()
                    .authorization(
                        WorkerResponse.Requirements.Authorization.builder()
                            .met(true)
                            .oauth2(
                                WorkerResponse.Requirements.Authorization.Oauth2.builder()
                                    .met(true)
                                    .build()
                            )
                            .build()
                    )
                    .met(true)
                    .build()
            )
        assertThat(workerResponse.type()).contains(WorkerResponse.Type.HTTP)
    }
}
