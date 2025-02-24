// File generated from our OpenAPI spec by Stainless.

package org.arcadeai.api.models

import org.arcadeai.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ToolExecutionAttemptTest {

    @Test
    fun createToolExecutionAttempt() {
        val toolExecutionAttempt =
            ToolExecutionAttempt.builder()
                .id("id")
                .finishedAt("finished_at")
                .output(
                    ToolExecutionAttempt.Output.builder()
                        .authorization(
                            AuthorizationResponse.builder()
                                .id("id")
                                .context(
                                    AuthorizationContext.builder()
                                        .token("token")
                                        .userInfo(
                                            AuthorizationContext.UserInfo.builder()
                                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                                .build()
                                        )
                                        .build()
                                )
                                .providerId("provider_id")
                                .addScope("string")
                                .status(AuthorizationResponse.Status.PENDING)
                                .url("url")
                                .userId("user_id")
                                .build()
                        )
                        .error(
                            ToolExecutionAttempt.Output.Error.builder()
                                .message("message")
                                .additionalPromptContent("additional_prompt_content")
                                .canRetry(true)
                                .developerMessage("developer_message")
                                .retryAfterMs(0L)
                                .build()
                        )
                        .addLog(
                            ToolExecutionAttempt.Output.Log.builder()
                                .level("level")
                                .message("message")
                                .subtype("subtype")
                                .build()
                        )
                        .value(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .startedAt("started_at")
                .success(true)
                .systemErrorMessage("system_error_message")
                .build()
        assertThat(toolExecutionAttempt).isNotNull
        assertThat(toolExecutionAttempt.id()).contains("id")
        assertThat(toolExecutionAttempt.finishedAt()).contains("finished_at")
        assertThat(toolExecutionAttempt.output())
            .contains(
                ToolExecutionAttempt.Output.builder()
                    .authorization(
                        AuthorizationResponse.builder()
                            .id("id")
                            .context(
                                AuthorizationContext.builder()
                                    .token("token")
                                    .userInfo(
                                        AuthorizationContext.UserInfo.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                                            .build()
                                    )
                                    .build()
                            )
                            .providerId("provider_id")
                            .addScope("string")
                            .status(AuthorizationResponse.Status.PENDING)
                            .url("url")
                            .userId("user_id")
                            .build()
                    )
                    .error(
                        ToolExecutionAttempt.Output.Error.builder()
                            .message("message")
                            .additionalPromptContent("additional_prompt_content")
                            .canRetry(true)
                            .developerMessage("developer_message")
                            .retryAfterMs(0L)
                            .build()
                    )
                    .addLog(
                        ToolExecutionAttempt.Output.Log.builder()
                            .level("level")
                            .message("message")
                            .subtype("subtype")
                            .build()
                    )
                    .value(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        assertThat(toolExecutionAttempt.startedAt()).contains("started_at")
        assertThat(toolExecutionAttempt.success()).contains(true)
        assertThat(toolExecutionAttempt.systemErrorMessage()).contains("system_error_message")
    }
}
