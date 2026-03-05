// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models.admin.secrets

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.arcade.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SecretListResponseTest {

    @Test
    fun create() {
        val secretListResponse =
            SecretListResponse.builder()
                .addItem(
                    SecretResponse.builder()
                        .id("id")
                        .binding(
                            SecretResponse.Binding.builder()
                                .id("id")
                                .type(SecretResponse.Binding.Type.STATIC)
                                .build()
                        )
                        .createdAt("created_at")
                        .description("description")
                        .key("key")
                        .lastAccessedAt("last_accessed_at")
                        .updatedAt("updated_at")
                        .build()
                )
                .limit(0L)
                .offset(0L)
                .pageCount(0L)
                .totalCount(0L)
                .build()

        assertThat(secretListResponse.items().getOrNull())
            .containsExactly(
                SecretResponse.builder()
                    .id("id")
                    .binding(
                        SecretResponse.Binding.builder()
                            .id("id")
                            .type(SecretResponse.Binding.Type.STATIC)
                            .build()
                    )
                    .createdAt("created_at")
                    .description("description")
                    .key("key")
                    .lastAccessedAt("last_accessed_at")
                    .updatedAt("updated_at")
                    .build()
            )
        assertThat(secretListResponse.limit()).contains(0L)
        assertThat(secretListResponse.offset()).contains(0L)
        assertThat(secretListResponse.pageCount()).contains(0L)
        assertThat(secretListResponse.totalCount()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val secretListResponse =
            SecretListResponse.builder()
                .addItem(
                    SecretResponse.builder()
                        .id("id")
                        .binding(
                            SecretResponse.Binding.builder()
                                .id("id")
                                .type(SecretResponse.Binding.Type.STATIC)
                                .build()
                        )
                        .createdAt("created_at")
                        .description("description")
                        .key("key")
                        .lastAccessedAt("last_accessed_at")
                        .updatedAt("updated_at")
                        .build()
                )
                .limit(0L)
                .offset(0L)
                .pageCount(0L)
                .totalCount(0L)
                .build()

        val roundtrippedSecretListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(secretListResponse),
                jacksonTypeRef<SecretListResponse>(),
            )

        assertThat(roundtrippedSecretListResponse).isEqualTo(secretListResponse)
    }
}
