// File generated from our OpenAPI spec by Stainless.

package com.arcade_engine.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SecretResponseTest {

    @Test
    fun createSecretResponse() {
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
                .hint("hint")
                .key("key")
                .lastAccessedAt("last_accessed_at")
                .updatedAt("updated_at")
                .build()
        assertThat(secretResponse).isNotNull
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
        assertThat(secretResponse.hint()).contains("hint")
        assertThat(secretResponse.key()).contains("key")
        assertThat(secretResponse.lastAccessedAt()).contains("last_accessed_at")
        assertThat(secretResponse.updatedAt()).contains("updated_at")
    }
}
