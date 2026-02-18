// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models.workers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.arcade.core.JsonValue
import dev.arcade.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WorkerListPageResponseTest {

    @Test
    fun create() {
        val workerListPageResponse =
            WorkerListPageResponse.builder()
                .addItem(
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
                                                    WorkerResponse.Mcp.Oauth2.ClientSecret.Binding
                                                        .STATIC
                                                )
                                                .editable(true)
                                                .exists(true)
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
                                            WorkerResponse.Requirements.Authorization.Oauth2
                                                .builder()
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
                )
                .limit(0L)
                .offset(0L)
                .pageCount(0L)
                .totalCount(0L)
                .build()

        assertThat(workerListPageResponse.items().getOrNull())
            .containsExactly(
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
                                                WorkerResponse.Mcp.Oauth2.ClientSecret.Binding
                                                    .STATIC
                                            )
                                            .editable(true)
                                            .exists(true)
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
            )
        assertThat(workerListPageResponse.limit()).contains(0L)
        assertThat(workerListPageResponse.offset()).contains(0L)
        assertThat(workerListPageResponse.pageCount()).contains(0L)
        assertThat(workerListPageResponse.totalCount()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val workerListPageResponse =
            WorkerListPageResponse.builder()
                .addItem(
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
                                                    WorkerResponse.Mcp.Oauth2.ClientSecret.Binding
                                                        .STATIC
                                                )
                                                .editable(true)
                                                .exists(true)
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
                                            WorkerResponse.Requirements.Authorization.Oauth2
                                                .builder()
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
                )
                .limit(0L)
                .offset(0L)
                .pageCount(0L)
                .totalCount(0L)
                .build()

        val roundtrippedWorkerListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(workerListPageResponse),
                jacksonTypeRef<WorkerListPageResponse>(),
            )

        assertThat(roundtrippedWorkerListPageResponse).isEqualTo(workerListPageResponse)
    }
}
