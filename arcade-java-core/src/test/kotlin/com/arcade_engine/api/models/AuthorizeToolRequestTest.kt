// File generated from our OpenAPI spec by Stainless.

package com.arcade_engine.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AuthorizeToolRequestTest {

    @Test
    fun createAuthorizeToolRequest() {
        val authorizeToolRequest =
            AuthorizeToolRequest.builder()
                .toolName("tool_name")
                .nextUri("next_uri")
                .toolVersion("tool_version")
                .userId("user_id")
                .build()
        assertThat(authorizeToolRequest).isNotNull
        assertThat(authorizeToolRequest.toolName()).isEqualTo("tool_name")
        assertThat(authorizeToolRequest.nextUri()).contains("next_uri")
        assertThat(authorizeToolRequest.toolVersion()).contains("tool_version")
        assertThat(authorizeToolRequest.userId()).contains("user_id")
    }
}
