// File generated from our OpenAPI spec by Stainless.

package org.arcadeai.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ToolAuthorizeParamsTest {

    @Test
    fun create() {
        ToolAuthorizeParams.builder()
            .authorizeToolRequest(
                AuthorizeToolRequest.builder()
                    .toolName("tool_name")
                    .toolVersion("tool_version")
                    .userId("user_id")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            ToolAuthorizeParams.builder()
                .authorizeToolRequest(
                    AuthorizeToolRequest.builder()
                        .toolName("tool_name")
                        .toolVersion("tool_version")
                        .userId("user_id")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                AuthorizeToolRequest.builder()
                    .toolName("tool_name")
                    .toolVersion("tool_version")
                    .userId("user_id")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ToolAuthorizeParams.builder()
                .authorizeToolRequest(AuthorizeToolRequest.builder().toolName("tool_name").build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(AuthorizeToolRequest.builder().toolName("tool_name").build())
    }
}
