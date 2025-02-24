// File generated from our OpenAPI spec by Stainless.

package org.arcadeai.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Objects
import java.util.Optional
import org.arcadeai.api.core.ExcludeMissing
import org.arcadeai.api.core.JsonField
import org.arcadeai.api.core.JsonMissing
import org.arcadeai.api.core.JsonValue
import org.arcadeai.api.core.NoAutoDetect
import org.arcadeai.api.core.checkRequired
import org.arcadeai.api.core.immutableEmptyMap
import org.arcadeai.api.core.toImmutable

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
            @JsonProperty("message")
            @ExcludeMissing
            private val message: JsonField<String> = JsonMissing.of(),
            @JsonProperty("additional_prompt_content")
            @ExcludeMissing
            private val additionalPromptContent: JsonField<String> = JsonMissing.of(),
            @JsonProperty("can_retry")
            @ExcludeMissing
            private val canRetry: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("developer_message")
            @ExcludeMissing
            private val developerMessage: JsonField<String> = JsonMissing.of(),
            @JsonProperty("retry_after_ms")
            @ExcludeMissing
            private val retryAfterMs: JsonField<Long> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun message(): String = message.getRequired("message")

            fun additionalPromptContent(): Optional<String> =
                Optional.ofNullable(
                    additionalPromptContent.getNullable("additional_prompt_content")
                )

            fun canRetry(): Optional<Boolean> =
                Optional.ofNullable(canRetry.getNullable("can_retry"))

            fun developerMessage(): Optional<String> =
                Optional.ofNullable(developerMessage.getNullable("developer_message"))

            fun retryAfterMs(): Optional<Long> =
                Optional.ofNullable(retryAfterMs.getNullable("retry_after_ms"))

            @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

            @JsonProperty("additional_prompt_content")
            @ExcludeMissing
            fun _additionalPromptContent(): JsonField<String> = additionalPromptContent

            @JsonProperty("can_retry")
            @ExcludeMissing
            fun _canRetry(): JsonField<Boolean> = canRetry

            @JsonProperty("developer_message")
            @ExcludeMissing
            fun _developerMessage(): JsonField<String> = developerMessage

            @JsonProperty("retry_after_ms")
            @ExcludeMissing
            fun _retryAfterMs(): JsonField<Long> = retryAfterMs

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Error = apply {
                if (validated) {
                    return@apply
                }

                message()
                additionalPromptContent()
                canRetry()
                developerMessage()
                retryAfterMs()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Error]. */
            class Builder internal constructor() {

                private var message: JsonField<String>? = null
                private var additionalPromptContent: JsonField<String> = JsonMissing.of()
                private var canRetry: JsonField<Boolean> = JsonMissing.of()
                private var developerMessage: JsonField<String> = JsonMissing.of()
                private var retryAfterMs: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(error: Error) = apply {
                    message = error.message
                    additionalPromptContent = error.additionalPromptContent
                    canRetry = error.canRetry
                    developerMessage = error.developerMessage
                    retryAfterMs = error.retryAfterMs
                    additionalProperties = error.additionalProperties.toMutableMap()
                }

                fun message(message: String) = message(JsonField.of(message))

                fun message(message: JsonField<String>) = apply { this.message = message }

                fun additionalPromptContent(additionalPromptContent: String) =
                    additionalPromptContent(JsonField.of(additionalPromptContent))

                fun additionalPromptContent(additionalPromptContent: JsonField<String>) = apply {
                    this.additionalPromptContent = additionalPromptContent
                }

                fun canRetry(canRetry: Boolean) = canRetry(JsonField.of(canRetry))

                fun canRetry(canRetry: JsonField<Boolean>) = apply { this.canRetry = canRetry }

                fun developerMessage(developerMessage: String) =
                    developerMessage(JsonField.of(developerMessage))

                fun developerMessage(developerMessage: JsonField<String>) = apply {
                    this.developerMessage = developerMessage
                }

                fun retryAfterMs(retryAfterMs: Long) = retryAfterMs(JsonField.of(retryAfterMs))

                fun retryAfterMs(retryAfterMs: JsonField<Long>) = apply {
                    this.retryAfterMs = retryAfterMs
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

                fun build(): Error =
                    Error(
                        checkRequired("message", message),
                        additionalPromptContent,
                        canRetry,
                        developerMessage,
                        retryAfterMs,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Error && message == other.message && additionalPromptContent == other.additionalPromptContent && canRetry == other.canRetry && developerMessage == other.developerMessage && retryAfterMs == other.retryAfterMs && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(message, additionalPromptContent, canRetry, developerMessage, retryAfterMs, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Error{message=$message, additionalPromptContent=$additionalPromptContent, canRetry=$canRetry, developerMessage=$developerMessage, retryAfterMs=$retryAfterMs, additionalProperties=$additionalProperties}"
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
