// File generated from our OpenAPI spec by Stainless.

package org.arcadeai.api.models

import org.arcadeai.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ToolExecuteParamsTest {

    @Test
    fun create() {
        ToolExecuteParams.builder()
            .executeToolRequest(
                ExecuteToolRequest.builder()
                    .toolName("tool_name")
                    .input(
                        ExecuteToolRequest.Input.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .runAt("run_at")
                    .toolVersion("tool_version")
                    .userId("user_id")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            ToolExecuteParams.builder()
                .executeToolRequest(
                    ExecuteToolRequest.builder()
                        .toolName("tool_name")
                        .input(
                            ExecuteToolRequest.Input.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .runAt("run_at")
                        .toolVersion("tool_version")
                        .userId("user_id")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                ExecuteToolRequest.builder()
                    .toolName("tool_name")
                    .input(
                        ExecuteToolRequest.Input.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .runAt("run_at")
                    .toolVersion("tool_version")
                    .userId("user_id")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ToolExecuteParams.builder()
                .executeToolRequest(ExecuteToolRequest.builder().toolName("tool_name").build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(ExecuteToolRequest.builder().toolName("tool_name").build())
    }
}
