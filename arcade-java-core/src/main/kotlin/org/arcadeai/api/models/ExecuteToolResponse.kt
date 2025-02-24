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
class ExecuteToolResponse
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("duration")
    @ExcludeMissing
    private val duration: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("execution_id")
    @ExcludeMissing
    private val executionId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("execution_type")
    @ExcludeMissing
    private val executionType: JsonField<String> = JsonMissing.of(),
    @JsonProperty("finished_at")
    @ExcludeMissing
    private val finishedAt: JsonField<String> = JsonMissing.of(),
    @JsonProperty("output")
    @ExcludeMissing
    private val output: JsonField<Output> = JsonMissing.of(),
    @JsonProperty("run_at") @ExcludeMissing private val runAt: JsonField<String> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<String> = JsonMissing.of(),
    @JsonProperty("success")
    @ExcludeMissing
    private val success: JsonField<Boolean> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): Optional<String> = Optional.ofNullable(id.getNullable("id"))

    fun duration(): Optional<Double> = Optional.ofNullable(duration.getNullable("duration"))

    fun executionId(): Optional<String> =
        Optional.ofNullable(executionId.getNullable("execution_id"))

    fun executionType(): Optional<String> =
        Optional.ofNullable(executionType.getNullable("execution_type"))

    fun finishedAt(): Optional<String> = Optional.ofNullable(finishedAt.getNullable("finished_at"))

    fun output(): Optional<Output> = Optional.ofNullable(output.getNullable("output"))

    fun runAt(): Optional<String> = Optional.ofNullable(runAt.getNullable("run_at"))

    fun status(): Optional<String> = Optional.ofNullable(status.getNullable("status"))

    /**
     * Whether the request was successful. For immediately-executed requests, this will be true if
     * the tool call succeeded. For scheduled requests, this will be true if the request was
     * scheduled successfully.
     */
    fun success(): Optional<Boolean> = Optional.ofNullable(success.getNullable("success"))

    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    @JsonProperty("duration") @ExcludeMissing fun _duration(): JsonField<Double> = duration

    @JsonProperty("execution_id")
    @ExcludeMissing
    fun _executionId(): JsonField<String> = executionId

    @JsonProperty("execution_type")
    @ExcludeMissing
    fun _executionType(): JsonField<String> = executionType

    @JsonProperty("finished_at") @ExcludeMissing fun _finishedAt(): JsonField<String> = finishedAt

    @JsonProperty("output") @ExcludeMissing fun _output(): JsonField<Output> = output

    @JsonProperty("run_at") @ExcludeMissing fun _runAt(): JsonField<String> = runAt

    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

    /**
     * Whether the request was successful. For immediately-executed requests, this will be true if
     * the tool call succeeded. For scheduled requests, this will be true if the request was
     * scheduled successfully.
     */
    @JsonProperty("success") @ExcludeMissing fun _success(): JsonField<Boolean> = success

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ExecuteToolResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        duration()
        executionId()
        executionType()
        finishedAt()
        output().ifPresent { it.validate() }
        runAt()
        status()
        success()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExecuteToolResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var duration: JsonField<Double> = JsonMissing.of()
        private var executionId: JsonField<String> = JsonMissing.of()
        private var executionType: JsonField<String> = JsonMissing.of()
        private var finishedAt: JsonField<String> = JsonMissing.of()
        private var output: JsonField<Output> = JsonMissing.of()
        private var runAt: JsonField<String> = JsonMissing.of()
        private var status: JsonField<String> = JsonMissing.of()
        private var success: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(executeToolResponse: ExecuteToolResponse) = apply {
            id = executeToolResponse.id
            duration = executeToolResponse.duration
            executionId = executeToolResponse.executionId
            executionType = executeToolResponse.executionType
            finishedAt = executeToolResponse.finishedAt
            output = executeToolResponse.output
            runAt = executeToolResponse.runAt
            status = executeToolResponse.status
            success = executeToolResponse.success
            additionalProperties = executeToolResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        fun duration(duration: Double) = duration(JsonField.of(duration))

        fun duration(duration: JsonField<Double>) = apply { this.duration = duration }

        fun executionId(executionId: String) = executionId(JsonField.of(executionId))

        fun executionId(executionId: JsonField<String>) = apply { this.executionId = executionId }

        fun executionType(executionType: String) = executionType(JsonField.of(executionType))

        fun executionType(executionType: JsonField<String>) = apply {
            this.executionType = executionType
        }

        fun finishedAt(finishedAt: String) = finishedAt(JsonField.of(finishedAt))

        fun finishedAt(finishedAt: JsonField<String>) = apply { this.finishedAt = finishedAt }

        fun output(output: Output) = output(JsonField.of(output))

        fun output(output: JsonField<Output>) = apply { this.output = output }

        fun runAt(runAt: String) = runAt(JsonField.of(runAt))

        fun runAt(runAt: JsonField<String>) = apply { this.runAt = runAt }

        fun status(status: String) = status(JsonField.of(status))

        fun status(status: JsonField<String>) = apply { this.status = status }

        /**
         * Whether the request was successful. For immediately-executed requests, this will be true
         * if the tool call succeeded. For scheduled requests, this will be true if the request was
         * scheduled successfully.
         */
        fun success(success: Boolean) = success(JsonField.of(success))

        /**
         * Whether the request was successful. For immediately-executed requests, this will be true
         * if the tool call succeeded. For scheduled requests, this will be true if the request was
         * scheduled successfully.
         */
        fun success(success: JsonField<Boolean>) = apply { this.success = success }

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

        fun build(): ExecuteToolResponse =
            ExecuteToolResponse(
                id,
                duration,
                executionId,
                executionType,
                finishedAt,
                output,
                runAt,
                status,
                success,
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

        return /* spotless:off */ other is ExecuteToolResponse && id == other.id && duration == other.duration && executionId == other.executionId && executionType == other.executionType && finishedAt == other.finishedAt && output == other.output && runAt == other.runAt && status == other.status && success == other.success && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, duration, executionId, executionType, finishedAt, output, runAt, status, success, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExecuteToolResponse{id=$id, duration=$duration, executionId=$executionId, executionType=$executionType, finishedAt=$finishedAt, output=$output, runAt=$runAt, status=$status, success=$success, additionalProperties=$additionalProperties}"
}
