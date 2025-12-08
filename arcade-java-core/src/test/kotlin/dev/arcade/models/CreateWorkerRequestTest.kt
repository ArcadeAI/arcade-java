// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models

import dev.arcade.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CreateWorkerRequestTest {

    @Test
    fun createCreateWorkerRequest() {
        val createWorkerRequest =
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
        assertThat(createWorkerRequest).isNotNull
        assertThat(createWorkerRequest.id()).isEqualTo("id")
        assertThat(createWorkerRequest.enabled()).contains(true)
        assertThat(createWorkerRequest.http())
            .contains(
                CreateWorkerRequest.Http.builder()
                    .retry(0L)
                    .secret("secret")
                    .timeout(1L)
                    .uri("uri")
                    .build()
            )
        assertThat(createWorkerRequest.mcp())
            .contains(
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
        assertThat(createWorkerRequest.type()).contains("type")
    }
}
