// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models.tools

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.arcade.core.JsonValue
import dev.arcade.core.jsonMapper
import dev.arcade.models.AuthorizationContext
import dev.arcade.models.AuthorizationResponse
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ToolExecutionAttemptTest {

    @Test
    fun create() {
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
                                .status(AuthorizationResponse.Status.NOT_STARTED)
                                .url("url")
                                .userId("user_id")
                                .build()
                        )
                        .error(
                            ToolExecutionAttempt.Output.Error.builder()
                                .canRetry(true)
                                .kind(ToolExecutionAttempt.Output.Error.Kind.TOOLKIT_LOAD_FAILED)
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
                            .status(AuthorizationResponse.Status.NOT_STARTED)
                            .url("url")
                            .userId("user_id")
                            .build()
                    )
                    .error(
                        ToolExecutionAttempt.Output.Error.builder()
                            .canRetry(true)
                            .kind(ToolExecutionAttempt.Output.Error.Kind.TOOLKIT_LOAD_FAILED)
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
        assertThat(toolExecutionAttempt.startedAt()).contains("started_at")
        assertThat(toolExecutionAttempt.success()).contains(true)
        assertThat(toolExecutionAttempt.systemErrorMessage()).contains("system_error_message")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
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
                                .status(AuthorizationResponse.Status.NOT_STARTED)
                                .url("url")
                                .userId("user_id")
                                .build()
                        )
                        .error(
                            ToolExecutionAttempt.Output.Error.builder()
                                .canRetry(true)
                                .kind(ToolExecutionAttempt.Output.Error.Kind.TOOLKIT_LOAD_FAILED)
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

        val roundtrippedToolExecutionAttempt =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(toolExecutionAttempt),
                jacksonTypeRef<ToolExecutionAttempt>(),
            )

        assertThat(roundtrippedToolExecutionAttempt).isEqualTo(toolExecutionAttempt)
    }
}
