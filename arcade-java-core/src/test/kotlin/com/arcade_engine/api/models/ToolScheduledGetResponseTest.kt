// File generated from our OpenAPI spec by Stainless.

package com.arcade_engine.api.models

import com.arcade_engine.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ToolScheduledGetResponseTest {

    @Test
    fun createToolScheduledGetResponse() {
        val toolScheduledGetResponse =
            ToolScheduledGetResponse.builder()
                .id("id")
                .addAttempt(
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
                                                        .putAdditionalProperty(
                                                            "foo",
                                                            JsonValue.from("bar"),
                                                        )
                                                        .build()
                                                )
                                                .build()
                                        )
                                        .providerId("provider_id")
                                        .addScope("string")
                                        .status(AuthorizationResponse.Status.NOT_STARTED)
                                        .url("url")
                                        .userId("user_id")
                                        .build()
                                )
                                .error(
                                    ToolExecutionAttempt.Output.Error.builder()
                                        .canRetry(true)
                                        .kind(
                                            ToolExecutionAttempt.Output.Error.Kind
                                                .TOOLKIT_LOAD_FAILED
                                        )
                                        .message("message")
                                        .additionalPromptContent("additional_prompt_content")
                                        .developerMessage("developer_message")
                                        .extra(
                                            ToolExecutionAttempt.Output.Error.Extra.builder()
                                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                                .build()
                                        )
                                        .retryAfterMs(0L)
                                        .stacktrace("stacktrace")
                                        .statusCode(0L)
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
                )
                .createdAt("created_at")
                .executionStatus("execution_status")
                .executionType("execution_type")
                .finishedAt("finished_at")
                .input(
                    ToolScheduledGetResponse.Input.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .runAt("run_at")
                .startedAt("started_at")
                .toolName("tool_name")
                .toolkitName("toolkit_name")
                .toolkitVersion("toolkit_version")
                .updatedAt("updated_at")
                .userId("user_id")
                .build()
        assertThat(toolScheduledGetResponse).isNotNull
        assertThat(toolScheduledGetResponse.id()).contains("id")
        assertThat(toolScheduledGetResponse.attempts().get())
            .containsExactly(
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
                                                    .putAdditionalProperty(
                                                        "foo",
                                                        JsonValue.from("bar"),
                                                    )
                                                    .build()
                                            )
                                            .build()
                                    )
                                    .providerId("provider_id")
                                    .addScope("string")
                                    .status(AuthorizationResponse.Status.NOT_STARTED)
                                    .url("url")
                                    .userId("user_id")
                                    .build()
                            )
                            .error(
                                ToolExecutionAttempt.Output.Error.builder()
                                    .canRetry(true)
                                    .kind(
                                        ToolExecutionAttempt.Output.Error.Kind.TOOLKIT_LOAD_FAILED
                                    )
                                    .message("message")
                                    .additionalPromptContent("additional_prompt_content")
                                    .developerMessage("developer_message")
                                    .extra(
                                        ToolExecutionAttempt.Output.Error.Extra.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                                            .build()
                                    )
                                    .retryAfterMs(0L)
                                    .stacktrace("stacktrace")
                                    .statusCode(0L)
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
            )
        assertThat(toolScheduledGetResponse.createdAt()).contains("created_at")
        assertThat(toolScheduledGetResponse.executionStatus()).contains("execution_status")
        assertThat(toolScheduledGetResponse.executionType()).contains("execution_type")
        assertThat(toolScheduledGetResponse.finishedAt()).contains("finished_at")
        assertThat(toolScheduledGetResponse.input())
            .contains(
                ToolScheduledGetResponse.Input.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(toolScheduledGetResponse.runAt()).contains("run_at")
        assertThat(toolScheduledGetResponse.startedAt()).contains("started_at")
        assertThat(toolScheduledGetResponse.toolName()).contains("tool_name")
        assertThat(toolScheduledGetResponse.toolkitName()).contains("toolkit_name")
        assertThat(toolScheduledGetResponse.toolkitVersion()).contains("toolkit_version")
        assertThat(toolScheduledGetResponse.updatedAt()).contains("updated_at")
        assertThat(toolScheduledGetResponse.userId()).contains("user_id")
    }
}
