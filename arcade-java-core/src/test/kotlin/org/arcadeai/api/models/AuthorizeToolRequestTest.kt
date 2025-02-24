// File generated from our OpenAPI spec by Stainless.

package org.arcadeai.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AuthorizeToolRequestTest {

    @Test
    fun createAuthorizeToolRequest() {
        val authorizeToolRequest =
            AuthorizeToolRequest.builder()
                .toolName("tool_name")
                .toolVersion("tool_version")
                .userId("user_id")
                .build()
        assertThat(authorizeToolRequest).isNotNull
        assertThat(authorizeToolRequest.toolName()).isEqualTo("tool_name")
        assertThat(authorizeToolRequest.toolVersion()).contains("tool_version")
        assertThat(authorizeToolRequest.userId()).contains("user_id")
    }
}
