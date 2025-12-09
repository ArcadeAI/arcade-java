// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models.tools.scheduled

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.arcade.core.JsonValue
import dev.arcade.core.jsonMapper
import dev.arcade.models.AuthorizationContext
import dev.arcade.models.AuthorizationResponse
import dev.arcade.models.tools.ToolExecutionAttempt
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScheduledGetResponseTest {

    @Test
    fun create() {
        val scheduledGetResponse =
            ScheduledGetResponse.builder()
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
                    ScheduledGetResponse.Input.builder()
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

        assertThat(scheduledGetResponse.id()).contains("id")
        assertThat(scheduledGetResponse.attempts().getOrNull())
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
        assertThat(scheduledGetResponse.createdAt()).contains("created_at")
        assertThat(scheduledGetResponse.executionStatus()).contains("execution_status")
        assertThat(scheduledGetResponse.executionType()).contains("execution_type")
        assertThat(scheduledGetResponse.finishedAt()).contains("finished_at")
        assertThat(scheduledGetResponse.input())
            .contains(
                ScheduledGetResponse.Input.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(scheduledGetResponse.runAt()).contains("run_at")
        assertThat(scheduledGetResponse.startedAt()).contains("started_at")
        assertThat(scheduledGetResponse.toolName()).contains("tool_name")
        assertThat(scheduledGetResponse.toolkitName()).contains("toolkit_name")
        assertThat(scheduledGetResponse.toolkitVersion()).contains("toolkit_version")
        assertThat(scheduledGetResponse.updatedAt()).contains("updated_at")
        assertThat(scheduledGetResponse.userId()).contains("user_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val scheduledGetResponse =
            ScheduledGetResponse.builder()
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
                    ScheduledGetResponse.Input.builder()
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

        val roundtrippedScheduledGetResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(scheduledGetResponse),
                jacksonTypeRef<ScheduledGetResponse>(),
            )

        assertThat(roundtrippedScheduledGetResponse).isEqualTo(scheduledGetResponse)
    }
}
