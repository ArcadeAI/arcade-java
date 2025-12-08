// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AdminSecretListResponseTest {

    @Test
    fun createAdminSecretListResponse() {
        val adminSecretListResponse =
            AdminSecretListResponse.builder()
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
                        .hint("hint")
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
        assertThat(adminSecretListResponse).isNotNull
        assertThat(adminSecretListResponse.items().get())
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
                    .hint("hint")
                    .key("key")
                    .lastAccessedAt("last_accessed_at")
                    .updatedAt("updated_at")
                    .build()
            )
        assertThat(adminSecretListResponse.limit()).contains(0L)
        assertThat(adminSecretListResponse.offset()).contains(0L)
        assertThat(adminSecretListResponse.pageCount()).contains(0L)
        assertThat(adminSecretListResponse.totalCount()).contains(0L)
    }
}
