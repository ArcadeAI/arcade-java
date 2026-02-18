// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models.admin.secrets

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.arcade.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SecretResponseTest {

    @Test
    fun create() {
        val secretResponse =
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

        assertThat(secretResponse.id()).contains("id")
        assertThat(secretResponse.binding())
            .contains(
                SecretResponse.Binding.builder()
                    .id("id")
                    .type(SecretResponse.Binding.Type.STATIC)
                    .build()
            )
        assertThat(secretResponse.createdAt()).contains("created_at")
        assertThat(secretResponse.description()).contains("description")
        assertThat(secretResponse.key()).contains("key")
        assertThat(secretResponse.lastAccessedAt()).contains("last_accessed_at")
        assertThat(secretResponse.updatedAt()).contains("updated_at")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val secretResponse =
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

        val roundtrippedSecretResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(secretResponse),
                jacksonTypeRef<SecretResponse>(),
            )

        assertThat(roundtrippedSecretResponse).isEqualTo(secretResponse)
    }
}
