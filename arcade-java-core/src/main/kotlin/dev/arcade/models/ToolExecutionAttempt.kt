// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.arcade.core.Enum
import dev.arcade.core.ExcludeMissing
import dev.arcade.core.JsonField
import dev.arcade.core.JsonMissing
import dev.arcade.core.JsonValue
import dev.arcade.core.NoAutoDetect
import dev.arcade.core.checkRequired
import dev.arcade.core.immutableEmptyMap
import dev.arcade.core.toImmutable
import dev.arcade.errors.ArcadeInvalidDataException
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class ToolExecutionAttempt
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("finished_at")
    @ExcludeMissing
    private val finishedAt: JsonField<String> = JsonMissing.of(),
    @JsonProperty("output")
    @ExcludeMissing
    private val output: JsonField<Output> = JsonMissing.of(),
    @JsonProperty("started_at")
    @ExcludeMissing
    private val startedAt: JsonField<String> = JsonMissing.of(),
    @JsonProperty("success")
    @ExcludeMissing
    private val success: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("system_error_message")
    @ExcludeMissing
    private val systemErrorMessage: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): Optional<String> = Optional.ofNullable(id.getNullable("id"))

    fun finishedAt(): Optional<String> = Optional.ofNullable(finishedAt.getNullable("finished_at"))

    fun output(): Optional<Output> = Optional.ofNullable(output.getNullable("output"))

    fun startedAt(): Optional<String> = Optional.ofNullable(startedAt.getNullable("started_at"))

    fun success(): Optional<Boolean> = Optional.ofNullable(success.getNullable("success"))

    fun systemErrorMessage(): Optional<String> =
        Optional.ofNullable(systemErrorMessage.getNullable("system_error_message"))

    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    @JsonProperty("finished_at") @ExcludeMissing fun _finishedAt(): JsonField<String> = finishedAt

    @JsonProperty("output") @ExcludeMissing fun _output(): JsonField<Output> = output

    @JsonProperty("started_at") @ExcludeMissing fun _startedAt(): JsonField<String> = startedAt

    @JsonProperty("success") @ExcludeMissing fun _success(): JsonField<Boolean> = success

    @JsonProperty("system_error_message")
    @ExcludeMissing
    fun _systemErrorMessage(): JsonField<String> = systemErrorMessage

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ToolExecutionAttempt = apply {
        if (validated) {
            return@apply
        }

        id()
        finishedAt()
        output().ifPresent { it.validate() }
        startedAt()
        success()
        systemErrorMessage()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ToolExecutionAttempt]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var finishedAt: JsonField<String> = JsonMissing.of()
        private var output: JsonField<Output> = JsonMissing.of()
        private var startedAt: JsonField<String> = JsonMissing.of()
        private var success: JsonField<Boolean> = JsonMissing.of()
        private var systemErrorMessage: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(toolExecutionAttempt: ToolExecutionAttempt) = apply {
            id = toolExecutionAttempt.id
            finishedAt = toolExecutionAttempt.finishedAt
            output = toolExecutionAttempt.output
            startedAt = toolExecutionAttempt.startedAt
            success = toolExecutionAttempt.success
            systemErrorMessage = toolExecutionAttempt.systemErrorMessage
            additionalProperties = toolExecutionAttempt.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        fun finishedAt(finishedAt: String) = finishedAt(JsonField.of(finishedAt))

        fun finishedAt(finishedAt: JsonField<String>) = apply { this.finishedAt = finishedAt }

        fun output(output: Output) = output(JsonField.of(output))

        fun output(output: JsonField<Output>) = apply { this.output = output }

        fun startedAt(startedAt: String) = startedAt(JsonField.of(startedAt))

        fun startedAt(startedAt: JsonField<String>) = apply { this.startedAt = startedAt }

        fun success(success: Boolean) = success(JsonField.of(success))

        fun success(success: JsonField<Boolean>) = apply { this.success = success }

        fun systemErrorMessage(systemErrorMessage: String) =
            systemErrorMessage(JsonField.of(systemErrorMessage))

        fun systemErrorMessage(systemErrorMessage: JsonField<String>) = apply {
            this.systemErrorMessage = systemErrorMessage
        }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        fun build(): ToolExecutionAttempt =
            ToolExecutionAttempt(
                id,
                finishedAt,
                output,
                startedAt,
                success,
                systemErrorMessage,
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class Output
    @JsonCreator
    private constructor(
        @JsonProperty("authorization")
        @ExcludeMissing
        private val authorization: JsonField<AuthorizationResponse> = JsonMissing.of(),
        @JsonProperty("error")
        @ExcludeMissing
        private val error: JsonField<Error> = JsonMissing.of(),
        @JsonProperty("logs")
        @ExcludeMissing
        private val logs: JsonField<List<Log>> = JsonMissing.of(),
        @JsonProperty("value") @ExcludeMissing private val value: JsonValue = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun authorization(): Optional<AuthorizationResponse> =
            Optional.ofNullable(authorization.getNullable("authorization"))

        fun error(): Optional<Error> = Optional.ofNullable(error.getNullable("error"))

        fun logs(): Optional<List<Log>> = Optional.ofNullable(logs.getNullable("logs"))

        @JsonProperty("value") @ExcludeMissing fun _value(): JsonValue = value

        @JsonProperty("authorization")
        @ExcludeMissing
        fun _authorization(): JsonField<AuthorizationResponse> = authorization

        @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<Error> = error

        @JsonProperty("logs") @ExcludeMissing fun _logs(): JsonField<List<Log>> = logs

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Output = apply {
            if (validated) {
                return@apply
            }

            authorization().ifPresent { it.validate() }
            error().ifPresent { it.validate() }
            logs().ifPresent { it.forEach { it.validate() } }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Output]. */
        class Builder internal constructor() {

            private var authorization: JsonField<AuthorizationResponse> = JsonMissing.of()
            private var error: JsonField<Error> = JsonMissing.of()
            private var logs: JsonField<MutableList<Log>>? = null
            private var value: JsonValue = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(output: Output) = apply {
                authorization = output.authorization
                error = output.error
                logs = output.logs.map { it.toMutableList() }
                value = output.value
                additionalProperties = output.additionalProperties.toMutableMap()
            }

            fun authorization(authorization: AuthorizationResponse) =
                authorization(JsonField.of(authorization))

            fun authorization(authorization: JsonField<AuthorizationResponse>) = apply {
                this.authorization = authorization
            }

            fun error(error: Error) = error(JsonField.of(error))

            fun error(error: JsonField<Error>) = apply { this.error = error }

            fun logs(logs: List<Log>) = logs(JsonField.of(logs))

            fun logs(logs: JsonField<List<Log>>) = apply {
                this.logs = logs.map { it.toMutableList() }
            }

            fun addLog(log: Log) = apply {
                logs =
                    (logs ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(log)
                    }
            }

            fun value(value: JsonValue) = apply { this.value = value }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): Output =
                Output(
                    authorization,
                    error,
                    (logs ?: JsonMissing.of()).map { it.toImmutable() },
                    value,
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class Error
        @JsonCreator
        private constructor(
            @JsonProperty("can_retry")
            @ExcludeMissing
            private val canRetry: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("kind")
            @ExcludeMissing
            private val kind: JsonField<Kind> = JsonMissing.of(),
            @JsonProperty("message")
            @ExcludeMissing
            private val message: JsonField<String> = JsonMissing.of(),
            @JsonProperty("additional_prompt_content")
            @ExcludeMissing
            private val additionalPromptContent: JsonField<String> = JsonMissing.of(),
            @JsonProperty("developer_message")
            @ExcludeMissing
            private val developerMessage: JsonField<String> = JsonMissing.of(),
            @JsonProperty("extra")
            @ExcludeMissing
            private val extra: JsonField<Extra> = JsonMissing.of(),
            @JsonProperty("retry_after_ms")
            @ExcludeMissing
            private val retryAfterMs: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("stacktrace")
            @ExcludeMissing
            private val stacktrace: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status_code")
            @ExcludeMissing
            private val statusCode: JsonField<Long> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun canRetry(): Boolean = canRetry.getRequired("can_retry")

            fun kind(): Kind = kind.getRequired("kind")

            fun message(): String = message.getRequired("message")

            fun additionalPromptContent(): Optional<String> =
                Optional.ofNullable(
                    additionalPromptContent.getNullable("additional_prompt_content")
                )

            fun developerMessage(): Optional<String> =
                Optional.ofNullable(developerMessage.getNullable("developer_message"))

            fun extra(): Optional<Extra> = Optional.ofNullable(extra.getNullable("extra"))

            fun retryAfterMs(): Optional<Long> =
                Optional.ofNullable(retryAfterMs.getNullable("retry_after_ms"))

            fun stacktrace(): Optional<String> =
                Optional.ofNullable(stacktrace.getNullable("stacktrace"))

            fun statusCode(): Optional<Long> =
                Optional.ofNullable(statusCode.getNullable("status_code"))

            @JsonProperty("can_retry")
            @ExcludeMissing
            fun _canRetry(): JsonField<Boolean> = canRetry

            @JsonProperty("kind") @ExcludeMissing fun _kind(): JsonField<Kind> = kind

            @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

            @JsonProperty("additional_prompt_content")
            @ExcludeMissing
            fun _additionalPromptContent(): JsonField<String> = additionalPromptContent

            @JsonProperty("developer_message")
            @ExcludeMissing
            fun _developerMessage(): JsonField<String> = developerMessage

            @JsonProperty("extra") @ExcludeMissing fun _extra(): JsonField<Extra> = extra

            @JsonProperty("retry_after_ms")
            @ExcludeMissing
            fun _retryAfterMs(): JsonField<Long> = retryAfterMs

            @JsonProperty("stacktrace")
            @ExcludeMissing
            fun _stacktrace(): JsonField<String> = stacktrace

            @JsonProperty("status_code")
            @ExcludeMissing
            fun _statusCode(): JsonField<Long> = statusCode

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Error = apply {
                if (validated) {
                    return@apply
                }

                canRetry()
                kind()
                message()
                additionalPromptContent()
                developerMessage()
                extra().ifPresent { it.validate() }
                retryAfterMs()
                stacktrace()
                statusCode()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Error]. */
            class Builder internal constructor() {

                private var canRetry: JsonField<Boolean>? = null
                private var kind: JsonField<Kind>? = null
                private var message: JsonField<String>? = null
                private var additionalPromptContent: JsonField<String> = JsonMissing.of()
                private var developerMessage: JsonField<String> = JsonMissing.of()
                private var extra: JsonField<Extra> = JsonMissing.of()
                private var retryAfterMs: JsonField<Long> = JsonMissing.of()
                private var stacktrace: JsonField<String> = JsonMissing.of()
                private var statusCode: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(error: Error) = apply {
                    canRetry = error.canRetry
                    kind = error.kind
                    message = error.message
                    additionalPromptContent = error.additionalPromptContent
                    developerMessage = error.developerMessage
                    extra = error.extra
                    retryAfterMs = error.retryAfterMs
                    stacktrace = error.stacktrace
                    statusCode = error.statusCode
                    additionalProperties = error.additionalProperties.toMutableMap()
                }

                fun canRetry(canRetry: Boolean) = canRetry(JsonField.of(canRetry))

                fun canRetry(canRetry: JsonField<Boolean>) = apply { this.canRetry = canRetry }

                fun kind(kind: Kind) = kind(JsonField.of(kind))

                fun kind(kind: JsonField<Kind>) = apply { this.kind = kind }

                fun message(message: String) = message(JsonField.of(message))

                fun message(message: JsonField<String>) = apply { this.message = message }

                fun additionalPromptContent(additionalPromptContent: String) =
                    additionalPromptContent(JsonField.of(additionalPromptContent))

                fun additionalPromptContent(additionalPromptContent: JsonField<String>) = apply {
                    this.additionalPromptContent = additionalPromptContent
                }

                fun developerMessage(developerMessage: String) =
                    developerMessage(JsonField.of(developerMessage))

                fun developerMessage(developerMessage: JsonField<String>) = apply {
                    this.developerMessage = developerMessage
                }

                fun extra(extra: Extra) = extra(JsonField.of(extra))

                fun extra(extra: JsonField<Extra>) = apply { this.extra = extra }

                fun retryAfterMs(retryAfterMs: Long) = retryAfterMs(JsonField.of(retryAfterMs))

                fun retryAfterMs(retryAfterMs: JsonField<Long>) = apply {
                    this.retryAfterMs = retryAfterMs
                }

                fun stacktrace(stacktrace: String) = stacktrace(JsonField.of(stacktrace))

                fun stacktrace(stacktrace: JsonField<String>) = apply {
                    this.stacktrace = stacktrace
                }

                fun statusCode(statusCode: Long) = statusCode(JsonField.of(statusCode))

                fun statusCode(statusCode: JsonField<Long>) = apply { this.statusCode = statusCode }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): Error =
                    Error(
                        checkRequired("canRetry", canRetry),
                        checkRequired("kind", kind),
                        checkRequired("message", message),
                        additionalPromptContent,
                        developerMessage,
                        extra,
                        retryAfterMs,
                        stacktrace,
                        statusCode,
                        additionalProperties.toImmutable(),
                    )
            }

            class Kind @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val TOOLKIT_LOAD_FAILED = of("TOOLKIT_LOAD_FAILED")

                    @JvmField
                    val TOOL_DEFINITION_BAD_DEFINITION = of("TOOL_DEFINITION_BAD_DEFINITION")

                    @JvmField
                    val TOOL_DEFINITION_BAD_INPUT_SCHEMA = of("TOOL_DEFINITION_BAD_INPUT_SCHEMA")

                    @JvmField
                    val TOOL_DEFINITION_BAD_OUTPUT_SCHEMA = of("TOOL_DEFINITION_BAD_OUTPUT_SCHEMA")

                    @JvmField val TOOL_REQUIREMENTS_NOT_MET = of("TOOL_REQUIREMENTS_NOT_MET")

                    @JvmField val TOOL_RUNTIME_BAD_INPUT_VALUE = of("TOOL_RUNTIME_BAD_INPUT_VALUE")

                    @JvmField
                    val TOOL_RUNTIME_BAD_OUTPUT_VALUE = of("TOOL_RUNTIME_BAD_OUTPUT_VALUE")

                    @JvmField val TOOL_RUNTIME_RETRY = of("TOOL_RUNTIME_RETRY")

                    @JvmField
                    val TOOL_RUNTIME_CONTEXT_REQUIRED = of("TOOL_RUNTIME_CONTEXT_REQUIRED")

                    @JvmField val TOOL_RUNTIME_FATAL = of("TOOL_RUNTIME_FATAL")

                    @JvmField val UPSTREAM_RUNTIME_BAD_REQUEST = of("UPSTREAM_RUNTIME_BAD_REQUEST")

                    @JvmField val UPSTREAM_RUNTIME_AUTH_ERROR = of("UPSTREAM_RUNTIME_AUTH_ERROR")

                    @JvmField val UPSTREAM_RUNTIME_NOT_FOUND = of("UPSTREAM_RUNTIME_NOT_FOUND")

                    @JvmField
                    val UPSTREAM_RUNTIME_VALIDATION_ERROR = of("UPSTREAM_RUNTIME_VALIDATION_ERROR")

                    @JvmField val UPSTREAM_RUNTIME_RATE_LIMIT = of("UPSTREAM_RUNTIME_RATE_LIMIT")

                    @JvmField
                    val UPSTREAM_RUNTIME_SERVER_ERROR = of("UPSTREAM_RUNTIME_SERVER_ERROR")

                    @JvmField val UPSTREAM_RUNTIME_UNMAPPED = of("UPSTREAM_RUNTIME_UNMAPPED")

                    @JvmField val UNKNOWN = of("UNKNOWN")

                    @JvmStatic fun of(value: String) = Kind(JsonField.of(value))
                }

                /** An enum containing [Kind]'s known values. */
                enum class Known {
                    TOOLKIT_LOAD_FAILED,
                    TOOL_DEFINITION_BAD_DEFINITION,
                    TOOL_DEFINITION_BAD_INPUT_SCHEMA,
                    TOOL_DEFINITION_BAD_OUTPUT_SCHEMA,
                    TOOL_REQUIREMENTS_NOT_MET,
                    TOOL_RUNTIME_BAD_INPUT_VALUE,
                    TOOL_RUNTIME_BAD_OUTPUT_VALUE,
                    TOOL_RUNTIME_RETRY,
                    TOOL_RUNTIME_CONTEXT_REQUIRED,
                    TOOL_RUNTIME_FATAL,
                    UPSTREAM_RUNTIME_BAD_REQUEST,
                    UPSTREAM_RUNTIME_AUTH_ERROR,
                    UPSTREAM_RUNTIME_NOT_FOUND,
                    UPSTREAM_RUNTIME_VALIDATION_ERROR,
                    UPSTREAM_RUNTIME_RATE_LIMIT,
                    UPSTREAM_RUNTIME_SERVER_ERROR,
                    UPSTREAM_RUNTIME_UNMAPPED,
                    UNKNOWN,
                }

                /**
                 * An enum containing [Kind]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Kind] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    TOOLKIT_LOAD_FAILED,
                    TOOL_DEFINITION_BAD_DEFINITION,
                    TOOL_DEFINITION_BAD_INPUT_SCHEMA,
                    TOOL_DEFINITION_BAD_OUTPUT_SCHEMA,
                    TOOL_REQUIREMENTS_NOT_MET,
                    TOOL_RUNTIME_BAD_INPUT_VALUE,
                    TOOL_RUNTIME_BAD_OUTPUT_VALUE,
                    TOOL_RUNTIME_RETRY,
                    TOOL_RUNTIME_CONTEXT_REQUIRED,
                    TOOL_RUNTIME_FATAL,
                    UPSTREAM_RUNTIME_BAD_REQUEST,
                    UPSTREAM_RUNTIME_AUTH_ERROR,
                    UPSTREAM_RUNTIME_NOT_FOUND,
                    UPSTREAM_RUNTIME_VALIDATION_ERROR,
                    UPSTREAM_RUNTIME_RATE_LIMIT,
                    UPSTREAM_RUNTIME_SERVER_ERROR,
                    UPSTREAM_RUNTIME_UNMAPPED,
                    UNKNOWN,
                    /**
                     * An enum member indicating that [Kind] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        TOOLKIT_LOAD_FAILED -> Value.TOOLKIT_LOAD_FAILED
                        TOOL_DEFINITION_BAD_DEFINITION -> Value.TOOL_DEFINITION_BAD_DEFINITION
                        TOOL_DEFINITION_BAD_INPUT_SCHEMA -> Value.TOOL_DEFINITION_BAD_INPUT_SCHEMA
                        TOOL_DEFINITION_BAD_OUTPUT_SCHEMA -> Value.TOOL_DEFINITION_BAD_OUTPUT_SCHEMA
                        TOOL_REQUIREMENTS_NOT_MET -> Value.TOOL_REQUIREMENTS_NOT_MET
                        TOOL_RUNTIME_BAD_INPUT_VALUE -> Value.TOOL_RUNTIME_BAD_INPUT_VALUE
                        TOOL_RUNTIME_BAD_OUTPUT_VALUE -> Value.TOOL_RUNTIME_BAD_OUTPUT_VALUE
                        TOOL_RUNTIME_RETRY -> Value.TOOL_RUNTIME_RETRY
                        TOOL_RUNTIME_CONTEXT_REQUIRED -> Value.TOOL_RUNTIME_CONTEXT_REQUIRED
                        TOOL_RUNTIME_FATAL -> Value.TOOL_RUNTIME_FATAL
                        UPSTREAM_RUNTIME_BAD_REQUEST -> Value.UPSTREAM_RUNTIME_BAD_REQUEST
                        UPSTREAM_RUNTIME_AUTH_ERROR -> Value.UPSTREAM_RUNTIME_AUTH_ERROR
                        UPSTREAM_RUNTIME_NOT_FOUND -> Value.UPSTREAM_RUNTIME_NOT_FOUND
                        UPSTREAM_RUNTIME_VALIDATION_ERROR -> Value.UPSTREAM_RUNTIME_VALIDATION_ERROR
                        UPSTREAM_RUNTIME_RATE_LIMIT -> Value.UPSTREAM_RUNTIME_RATE_LIMIT
                        UPSTREAM_RUNTIME_SERVER_ERROR -> Value.UPSTREAM_RUNTIME_SERVER_ERROR
                        UPSTREAM_RUNTIME_UNMAPPED -> Value.UPSTREAM_RUNTIME_UNMAPPED
                        UNKNOWN -> Value.UNKNOWN
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws ArcadeInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        TOOLKIT_LOAD_FAILED -> Known.TOOLKIT_LOAD_FAILED
                        TOOL_DEFINITION_BAD_DEFINITION -> Known.TOOL_DEFINITION_BAD_DEFINITION
                        TOOL_DEFINITION_BAD_INPUT_SCHEMA -> Known.TOOL_DEFINITION_BAD_INPUT_SCHEMA
                        TOOL_DEFINITION_BAD_OUTPUT_SCHEMA -> Known.TOOL_DEFINITION_BAD_OUTPUT_SCHEMA
                        TOOL_REQUIREMENTS_NOT_MET -> Known.TOOL_REQUIREMENTS_NOT_MET
                        TOOL_RUNTIME_BAD_INPUT_VALUE -> Known.TOOL_RUNTIME_BAD_INPUT_VALUE
                        TOOL_RUNTIME_BAD_OUTPUT_VALUE -> Known.TOOL_RUNTIME_BAD_OUTPUT_VALUE
                        TOOL_RUNTIME_RETRY -> Known.TOOL_RUNTIME_RETRY
                        TOOL_RUNTIME_CONTEXT_REQUIRED -> Known.TOOL_RUNTIME_CONTEXT_REQUIRED
                        TOOL_RUNTIME_FATAL -> Known.TOOL_RUNTIME_FATAL
                        UPSTREAM_RUNTIME_BAD_REQUEST -> Known.UPSTREAM_RUNTIME_BAD_REQUEST
                        UPSTREAM_RUNTIME_AUTH_ERROR -> Known.UPSTREAM_RUNTIME_AUTH_ERROR
                        UPSTREAM_RUNTIME_NOT_FOUND -> Known.UPSTREAM_RUNTIME_NOT_FOUND
                        UPSTREAM_RUNTIME_VALIDATION_ERROR -> Known.UPSTREAM_RUNTIME_VALIDATION_ERROR
                        UPSTREAM_RUNTIME_RATE_LIMIT -> Known.UPSTREAM_RUNTIME_RATE_LIMIT
                        UPSTREAM_RUNTIME_SERVER_ERROR -> Known.UPSTREAM_RUNTIME_SERVER_ERROR
                        UPSTREAM_RUNTIME_UNMAPPED -> Known.UPSTREAM_RUNTIME_UNMAPPED
                        UNKNOWN -> Known.UNKNOWN
                        else -> throw ArcadeInvalidDataException("Unknown Kind: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws ArcadeInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        ArcadeInvalidDataException("Value is not a String")
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Kind && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            @NoAutoDetect
            class Extra
            @JsonCreator
            private constructor(
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Extra = apply {
                    if (validated) {
                        return@apply
                    }

                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Extra]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(extra: Extra) = apply {
                        additionalProperties = extra.additionalProperties.toMutableMap()
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    fun build(): Extra = Extra(additionalProperties.toImmutable())
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Extra && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() = "Extra{additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Error && canRetry == other.canRetry && kind == other.kind && message == other.message && additionalPromptContent == other.additionalPromptContent && developerMessage == other.developerMessage && extra == other.extra && retryAfterMs == other.retryAfterMs && stacktrace == other.stacktrace && statusCode == other.statusCode && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(canRetry, kind, message, additionalPromptContent, developerMessage, extra, retryAfterMs, stacktrace, statusCode, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Error{canRetry=$canRetry, kind=$kind, message=$message, additionalPromptContent=$additionalPromptContent, developerMessage=$developerMessage, extra=$extra, retryAfterMs=$retryAfterMs, stacktrace=$stacktrace, statusCode=$statusCode, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class Log
        @JsonCreator
        private constructor(
            @JsonProperty("level")
            @ExcludeMissing
            private val level: JsonField<String> = JsonMissing.of(),
            @JsonProperty("message")
            @ExcludeMissing
            private val message: JsonField<String> = JsonMissing.of(),
            @JsonProperty("subtype")
            @ExcludeMissing
            private val subtype: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun level(): String = level.getRequired("level")

            fun message(): String = message.getRequired("message")

            fun subtype(): Optional<String> = Optional.ofNullable(subtype.getNullable("subtype"))

            @JsonProperty("level") @ExcludeMissing fun _level(): JsonField<String> = level

            @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

            @JsonProperty("subtype") @ExcludeMissing fun _subtype(): JsonField<String> = subtype

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Log = apply {
                if (validated) {
                    return@apply
                }

                level()
                message()
                subtype()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Log]. */
            class Builder internal constructor() {

                private var level: JsonField<String>? = null
                private var message: JsonField<String>? = null
                private var subtype: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(log: Log) = apply {
                    level = log.level
                    message = log.message
                    subtype = log.subtype
                    additionalProperties = log.additionalProperties.toMutableMap()
                }

                fun level(level: String) = level(JsonField.of(level))

                fun level(level: JsonField<String>) = apply { this.level = level }

                fun message(message: String) = message(JsonField.of(message))

                fun message(message: JsonField<String>) = apply { this.message = message }

                fun subtype(subtype: String) = subtype(JsonField.of(subtype))

                fun subtype(subtype: JsonField<String>) = apply { this.subtype = subtype }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): Log =
                    Log(
                        checkRequired("level", level),
                        checkRequired("message", message),
                        subtype,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Log && level == other.level && message == other.message && subtype == other.subtype && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(level, message, subtype, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Log{level=$level, message=$message, subtype=$subtype, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Output && authorization == other.authorization && error == other.error && logs == other.logs && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(authorization, error, logs, value, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Output{authorization=$authorization, error=$error, logs=$logs, value=$value, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ToolExecutionAttempt && id == other.id && finishedAt == other.finishedAt && output == other.output && startedAt == other.startedAt && success == other.success && systemErrorMessage == other.systemErrorMessage && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, finishedAt, output, startedAt, success, systemErrorMessage, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ToolExecutionAttempt{id=$id, finishedAt=$finishedAt, output=$output, startedAt=$startedAt, success=$success, systemErrorMessage=$systemErrorMessage, additionalProperties=$additionalProperties}"
}
