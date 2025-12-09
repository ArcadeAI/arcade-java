// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models.tools

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.arcade.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuthorizeToolRequestTest {

    @Test
    fun create() {
        val authorizeToolRequest =
            AuthorizeToolRequest.builder()
                .toolName("tool_name")
                .nextUri("next_uri")
                .toolVersion("tool_version")
                .userId("user_id")
                .build()

        assertThat(authorizeToolRequest.toolName()).isEqualTo("tool_name")
        assertThat(authorizeToolRequest.nextUri()).contains("next_uri")
        assertThat(authorizeToolRequest.toolVersion()).contains("tool_version")
        assertThat(authorizeToolRequest.userId()).contains("user_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val authorizeToolRequest =
            AuthorizeToolRequest.builder()
                .toolName("tool_name")
                .nextUri("next_uri")
                .toolVersion("tool_version")
                .userId("user_id")
                .build()

        val roundtrippedAuthorizeToolRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(authorizeToolRequest),
                jacksonTypeRef<AuthorizeToolRequest>(),
            )

        assertThat(roundtrippedAuthorizeToolRequest).isEqualTo(authorizeToolRequest)
    }
}
