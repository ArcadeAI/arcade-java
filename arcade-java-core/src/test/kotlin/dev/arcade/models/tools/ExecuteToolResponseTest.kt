// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models.tools

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.arcade.core.JsonValue
import dev.arcade.core.jsonMapper
import dev.arcade.models.AuthorizationContext
import dev.arcade.models.AuthorizationResponse
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExecuteToolResponseTest {

    @Test
    fun create() {
        val executeToolResponse =
            ExecuteToolResponse.builder()
                .id("id")
                .duration(0.0)
                .executionId("execution_id")
                .executionType("execution_type")
                .finishedAt("finished_at")
                .output(
                    ExecuteToolResponse.Output.builder()
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
                            ExecuteToolResponse.Output.Error.builder()
                                .canRetry(true)
                                .kind(ExecuteToolResponse.Output.Error.Kind.TOOLKIT_LOAD_FAILED)
                                .message("message")
                                .additionalPromptContent("additional_prompt_content")
                                .developerMessage("developer_message")
                                .extra(
                                    ExecuteToolResponse.Output.Error.Extra.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .retryAfterMs(0L)
                                .stacktrace("stacktrace")
                                .statusCode(0L)
                                .build()
                        )
                        .addLog(
                            ExecuteToolResponse.Output.Log.builder()
                                .level("level")
                                .message("message")
                                .subtype("subtype")
                                .build()
                        )
                        .value(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .runAt("run_at")
                .status("status")
                .success(true)
                .build()

        assertThat(executeToolResponse.id()).contains("id")
        assertThat(executeToolResponse.duration()).contains(0.0)
        assertThat(executeToolResponse.executionId()).contains("execution_id")
        assertThat(executeToolResponse.executionType()).contains("execution_type")
        assertThat(executeToolResponse.finishedAt()).contains("finished_at")
        assertThat(executeToolResponse.output())
            .contains(
                ExecuteToolResponse.Output.builder()
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
                        ExecuteToolResponse.Output.Error.builder()
                            .canRetry(true)
                            .kind(ExecuteToolResponse.Output.Error.Kind.TOOLKIT_LOAD_FAILED)
                            .message("message")
                            .additionalPromptContent("additional_prompt_content")
                            .developerMessage("developer_message")
                            .extra(
                                ExecuteToolResponse.Output.Error.Extra.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .retryAfterMs(0L)
                            .stacktrace("stacktrace")
                            .statusCode(0L)
                            .build()
                    )
                    .addLog(
                        ExecuteToolResponse.Output.Log.builder()
                            .level("level")
                            .message("message")
                            .subtype("subtype")
                            .build()
                    )
                    .value(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        assertThat(executeToolResponse.runAt()).contains("run_at")
        assertThat(executeToolResponse.status()).contains("status")
        assertThat(executeToolResponse.success()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val executeToolResponse =
            ExecuteToolResponse.builder()
                .id("id")
                .duration(0.0)
                .executionId("execution_id")
                .executionType("execution_type")
                .finishedAt("finished_at")
                .output(
                    ExecuteToolResponse.Output.builder()
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
                            ExecuteToolResponse.Output.Error.builder()
                                .canRetry(true)
                                .kind(ExecuteToolResponse.Output.Error.Kind.TOOLKIT_LOAD_FAILED)
                                .message("message")
                                .additionalPromptContent("additional_prompt_content")
                                .developerMessage("developer_message")
                                .extra(
                                    ExecuteToolResponse.Output.Error.Extra.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .retryAfterMs(0L)
                                .stacktrace("stacktrace")
                                .statusCode(0L)
                                .build()
                        )
                        .addLog(
                            ExecuteToolResponse.Output.Log.builder()
                                .level("level")
                                .message("message")
                                .subtype("subtype")
                                .build()
                        )
                        .value(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .runAt("run_at")
                .status("status")
                .success(true)
                .build()

        val roundtrippedExecuteToolResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(executeToolResponse),
                jacksonTypeRef<ExecuteToolResponse>(),
            )

        assertThat(roundtrippedExecuteToolResponse).isEqualTo(executeToolResponse)
    }
}
