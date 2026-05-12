// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models.workers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.arcade.core.JsonValue
import dev.arcade.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UpdateWorkerRequestTest {

    @Test
    fun create() {
        val updateWorkerRequest =
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

        assertThat(updateWorkerRequest.enabled()).contains(true)
        assertThat(updateWorkerRequest.http())
            .contains(
                UpdateWorkerRequest.Http.builder()
                    .retry(0L)
                    .secret("secret")
                    .timeout(0L)
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
                    .timeout(0L)
                    .uri("uri")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val updateWorkerRequest =
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

        val roundtrippedUpdateWorkerRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(updateWorkerRequest),
                jacksonTypeRef<UpdateWorkerRequest>(),
            )

        assertThat(roundtrippedUpdateWorkerRequest).isEqualTo(updateWorkerRequest)
    }
}
