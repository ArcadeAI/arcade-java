// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models

import dev.arcade.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class UpdateWorkerRequestTest {

    @Test
    fun createUpdateWorkerRequest() {
        val updateWorkerRequest =
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
        assertThat(updateWorkerRequest).isNotNull
        assertThat(updateWorkerRequest.enabled()).contains(true)
        assertThat(updateWorkerRequest.http())
            .contains(
                UpdateWorkerRequest.Http.builder()
                    .retry(0L)
                    .secret("secret")
                    .timeout(1L)
                    .uri("uri")
                    .build()
            )
        assertThat(updateWorkerRequest.mcp())
            .contains(
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
    }
}
