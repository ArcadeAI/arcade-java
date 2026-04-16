// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models.tools

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.arcade.core.Enum
import dev.arcade.core.ExcludeMissing
import dev.arcade.core.JsonArray
import dev.arcade.core.JsonField
import dev.arcade.core.JsonMissing
import dev.arcade.core.JsonObject
import dev.arcade.core.JsonValue
import dev.arcade.core.checkKnown
import dev.arcade.core.checkRequired
import dev.arcade.core.toImmutable
import dev.arcade.errors.ArcadeInvalidDataException
import dev.arcade.models.AuthorizationResponse
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ExecuteToolResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val duration: JsonField<Double>,
    private val executionId: JsonField<String>,
    private val executionType: JsonField<String>,
    private val finishedAt: JsonField<String>,
    private val output: JsonField<Output>,
    private val runAt: JsonField<String>,
    private val status: JsonField<String>,
    private val success: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("duration") @ExcludeMissing duration: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("execution_id")
        @ExcludeMissing
        executionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("execution_type")
        @ExcludeMissing
        executionType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("finished_at")
        @ExcludeMissing
        finishedAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("output") @ExcludeMissing output: JsonField<Output> = JsonMissing.of(),
        @JsonProperty("run_at") @ExcludeMissing runAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
        @JsonProperty("success") @ExcludeMissing success: JsonField<Boolean> = JsonMissing.of(),
    ) : this(
        id,
        duration,
        executionId,
        executionType,
        finishedAt,
        output,
        runAt,
        status,
        success,
        mutableMapOf(),
    )

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun duration(): Optional<Double> = duration.getOptional("duration")

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun executionId(): Optional<String> = executionId.getOptional("execution_id")

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun executionType(): Optional<String> = executionType.getOptional("execution_type")

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun finishedAt(): Optional<String> = finishedAt.getOptional("finished_at")

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun output(): Optional<Output> = output.getOptional("output")

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun runAt(): Optional<String> = runAt.getOptional("run_at")

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<String> = status.getOptional("status")

    /**
     * Whether the request was successful. For immediately-executed requests, this will be true if
     * the tool call succeeded. For scheduled requests, this will be true if the request was
     * scheduled successfully.
     *
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun success(): Optional<Boolean> = success.getOptional("success")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [duration].
     *
     * Unlike [duration], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("duration") @ExcludeMissing fun _duration(): JsonField<Double> = duration

    /**
     * Returns the raw JSON value of [executionId].
     *
     * Unlike [executionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("execution_id")
    @ExcludeMissing
    fun _executionId(): JsonField<String> = executionId

    /**
     * Returns the raw JSON value of [executionType].
     *
     * Unlike [executionType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("execution_type")
    @ExcludeMissing
    fun _executionType(): JsonField<String> = executionType

    /**
     * Returns the raw JSON value of [finishedAt].
     *
     * Unlike [finishedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("finished_at") @ExcludeMissing fun _finishedAt(): JsonField<String> = finishedAt

    /**
     * Returns the raw JSON value of [output].
     *
     * Unlike [output], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("output") @ExcludeMissing fun _output(): JsonField<Output> = output

    /**
     * Returns the raw JSON value of [runAt].
     *
     * Unlike [runAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("run_at") @ExcludeMissing fun _runAt(): JsonField<String> = runAt

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

    /**
     * Returns the raw JSON value of [success].
     *
     * Unlike [success], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("success") @ExcludeMissing fun _success(): JsonField<Boolean> = success

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [ExecuteToolResponse]. */
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

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun duration(duration: Double) = duration(JsonField.of(duration))

        /**
         * Sets [Builder.duration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.duration] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun duration(duration: JsonField<Double>) = apply { this.duration = duration }

        fun executionId(executionId: String) = executionId(JsonField.of(executionId))

        /**
         * Sets [Builder.executionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.executionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun executionId(executionId: JsonField<String>) = apply { this.executionId = executionId }

        fun executionType(executionType: String) = executionType(JsonField.of(executionType))

        /**
         * Sets [Builder.executionType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.executionType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun executionType(executionType: JsonField<String>) = apply {
            this.executionType = executionType
        }

        fun finishedAt(finishedAt: String) = finishedAt(JsonField.of(finishedAt))

        /**
         * Sets [Builder.finishedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.finishedAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun finishedAt(finishedAt: JsonField<String>) = apply { this.finishedAt = finishedAt }

        fun output(output: Output) = output(JsonField.of(output))

        /**
         * Sets [Builder.output] to an arbitrary JSON value.
         *
         * You should usually call [Builder.output] with a well-typed [Output] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun output(output: JsonField<Output>) = apply { this.output = output }

        fun runAt(runAt: String) = runAt(JsonField.of(runAt))

        /**
         * Sets [Builder.runAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.runAt] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun runAt(runAt: JsonField<String>) = apply { this.runAt = runAt }

        fun status(status: String) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<String>) = apply { this.status = status }

        /**
         * Whether the request was successful. For immediately-executed requests, this will be true
         * if the tool call succeeded. For scheduled requests, this will be true if the request was
         * scheduled successfully.
         */
        fun success(success: Boolean) = success(JsonField.of(success))

        /**
         * Sets [Builder.success] to an arbitrary JSON value.
         *
         * You should usually call [Builder.success] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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

        /**
         * Returns an immutable instance of [ExecuteToolResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
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
                additionalProperties.toMutableMap(),
            )
    }

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

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: ArcadeInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (duration.asKnown().isPresent) 1 else 0) +
            (if (executionId.asKnown().isPresent) 1 else 0) +
            (if (executionType.asKnown().isPresent) 1 else 0) +
            (if (finishedAt.asKnown().isPresent) 1 else 0) +
            (output.asKnown().getOrNull()?.validity() ?: 0) +
            (if (runAt.asKnown().isPresent) 1 else 0) +
            (if (status.asKnown().isPresent) 1 else 0) +
            (if (success.asKnown().isPresent) 1 else 0)

    class Output
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val authorization: JsonField<AuthorizationResponse>,
        private val error: JsonField<Error>,
        private val logs: JsonField<List<Log>>,
        private val value: JsonValue,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("authorization")
            @ExcludeMissing
            authorization: JsonField<AuthorizationResponse> = JsonMissing.of(),
            @JsonProperty("error") @ExcludeMissing error: JsonField<Error> = JsonMissing.of(),
            @JsonProperty("logs") @ExcludeMissing logs: JsonField<List<Log>> = JsonMissing.of(),
            @JsonProperty("value") @ExcludeMissing value: JsonValue = JsonMissing.of(),
        ) : this(authorization, error, logs, value, mutableMapOf())

        /**
         * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun authorization(): Optional<AuthorizationResponse> =
            authorization.getOptional("authorization")

        /**
         * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun error(): Optional<Error> = error.getOptional("error")

        /**
         * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun logs(): Optional<List<Log>> = logs.getOptional("logs")

        /**
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```java
         * MyClass myObject = output.value().convert(MyClass.class);
         * ```
         */
        @JsonProperty("value") @ExcludeMissing fun _value(): JsonValue = value

        // -------------------------------------------------------------------------
        // Start of manually added code
        // -------------------------------------------------------------------------

        /**
         * Returns an [Optional] containing the output value as a `Map<String, JsonValue>`, or an
         * empty [Optional] if the value is not a JSON object.
         *
         * Example usage:
         * ```java
         * Map<String, JsonValue> result = response.output()
         *     .flatMap(Output::valueAsObject)
         *     .orElse(Map.of());
         * ```
         */
        fun valueAsObject(): Optional<Map<String, JsonValue>> =
            when (value) {
                is JsonObject -> Optional.of(value.values)
                else -> Optional.empty()
            }

        /**
         * Returns the output value as a `Map<String, JsonValue>`, or an empty map if the value is
         * not a JSON object.
         *
         * Example usage:
         * ```java
         * Map<String, JsonValue> result = output.valueAsObjectOrEmpty();
         * ```
         */
        fun valueAsObjectOrEmpty(): Map<String, JsonValue> =
            when (value) {
                is JsonObject -> value.values
                else -> emptyMap()
            }

        /**
         * Returns an [Optional] containing the output value as a `List<JsonValue>`, or an empty
         * [Optional] if the value is not a JSON array.
         *
         * Example usage:
         * ```java
         * List<JsonValue> items = response.output()
         *     .flatMap(Output::valueAsArray)
         *     .orElse(List.of());
         * ```
         */
        fun valueAsArray(): Optional<List<JsonValue>> =
            when (value) {
                is JsonArray -> Optional.of(value.values)
                else -> Optional.empty()
            }

        /**
         * Returns the output value as a `List<JsonValue>`, or an empty list if the value is not a
         * JSON array.
         *
         * Example usage:
         * ```java
         * List<JsonValue> items = output.valueAsArrayOrEmpty();
         * ```
         */
        fun valueAsArrayOrEmpty(): List<JsonValue> =
            when (value) {
                is JsonArray -> value.values
                else -> emptyList()
            }

        // -------------------------------------------------------------------------
        // End of manually added code
        // -------------------------------------------------------------------------

        /**
         * Returns the raw JSON value of [authorization].
         *
         * Unlike [authorization], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("authorization")
        @ExcludeMissing
        fun _authorization(): JsonField<AuthorizationResponse> = authorization

        /**
         * Returns the raw JSON value of [error].
         *
         * Unlike [error], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<Error> = error

        /**
         * Returns the raw JSON value of [logs].
         *
         * Unlike [logs], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("logs") @ExcludeMissing fun _logs(): JsonField<List<Log>> = logs

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Output]. */
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

            /**
             * Sets [Builder.authorization] to an arbitrary JSON value.
             *
             * You should usually call [Builder.authorization] with a well-typed
             * [AuthorizationResponse] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun authorization(authorization: JsonField<AuthorizationResponse>) = apply {
                this.authorization = authorization
            }

            fun error(error: Error) = error(JsonField.of(error))

            /**
             * Sets [Builder.error] to an arbitrary JSON value.
             *
             * You should usually call [Builder.error] with a well-typed [Error] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun error(error: JsonField<Error>) = apply { this.error = error }

            fun logs(logs: List<Log>) = logs(JsonField.of(logs))

            /**
             * Sets [Builder.logs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.logs] with a well-typed `List<Log>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun logs(logs: JsonField<List<Log>>) = apply {
                this.logs = logs.map { it.toMutableList() }
            }

            /**
             * Adds a single [Log] to [logs].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addLog(log: Log) = apply {
                logs =
                    (logs ?: JsonField.of(mutableListOf())).also { checkKnown("logs", it).add(log) }
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

            /**
             * Returns an immutable instance of [Output].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Output =
                Output(
                    authorization,
                    error,
                    (logs ?: JsonMissing.of()).map { it.toImmutable() },
                    value,
                    additionalProperties.toMutableMap(),
                )
        }

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

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: ArcadeInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (authorization.asKnown().getOrNull()?.validity() ?: 0) +
                (error.asKnown().getOrNull()?.validity() ?: 0) +
                (logs.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        class Error
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val canRetry: JsonField<Boolean>,
            private val kind: JsonField<Kind>,
            private val message: JsonField<String>,
            private val additionalPromptContent: JsonField<String>,
            private val developerMessage: JsonField<String>,
            private val extra: JsonField<Extra>,
            private val retryAfterMs: JsonField<Long>,
            private val stacktrace: JsonField<String>,
            private val statusCode: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("can_retry")
                @ExcludeMissing
                canRetry: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("kind") @ExcludeMissing kind: JsonField<Kind> = JsonMissing.of(),
                @JsonProperty("message")
                @ExcludeMissing
                message: JsonField<String> = JsonMissing.of(),
                @JsonProperty("additional_prompt_content")
                @ExcludeMissing
                additionalPromptContent: JsonField<String> = JsonMissing.of(),
                @JsonProperty("developer_message")
                @ExcludeMissing
                developerMessage: JsonField<String> = JsonMissing.of(),
                @JsonProperty("extra") @ExcludeMissing extra: JsonField<Extra> = JsonMissing.of(),
                @JsonProperty("retry_after_ms")
                @ExcludeMissing
                retryAfterMs: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("stacktrace")
                @ExcludeMissing
                stacktrace: JsonField<String> = JsonMissing.of(),
                @JsonProperty("status_code")
                @ExcludeMissing
                statusCode: JsonField<Long> = JsonMissing.of(),
            ) : this(
                canRetry,
                kind,
                message,
                additionalPromptContent,
                developerMessage,
                extra,
                retryAfterMs,
                stacktrace,
                statusCode,
                mutableMapOf(),
            )

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun canRetry(): Boolean = canRetry.getRequired("can_retry")

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun kind(): Kind = kind.getRequired("kind")

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun message(): String = message.getRequired("message")

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun additionalPromptContent(): Optional<String> =
                additionalPromptContent.getOptional("additional_prompt_content")

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun developerMessage(): Optional<String> =
                developerMessage.getOptional("developer_message")

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun extra(): Optional<Extra> = extra.getOptional("extra")

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun retryAfterMs(): Optional<Long> = retryAfterMs.getOptional("retry_after_ms")

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun stacktrace(): Optional<String> = stacktrace.getOptional("stacktrace")

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun statusCode(): Optional<Long> = statusCode.getOptional("status_code")

            /**
             * Returns the raw JSON value of [canRetry].
             *
             * Unlike [canRetry], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("can_retry")
            @ExcludeMissing
            fun _canRetry(): JsonField<Boolean> = canRetry

            /**
             * Returns the raw JSON value of [kind].
             *
             * Unlike [kind], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("kind") @ExcludeMissing fun _kind(): JsonField<Kind> = kind

            /**
             * Returns the raw JSON value of [message].
             *
             * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

            /**
             * Returns the raw JSON value of [additionalPromptContent].
             *
             * Unlike [additionalPromptContent], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("additional_prompt_content")
            @ExcludeMissing
            fun _additionalPromptContent(): JsonField<String> = additionalPromptContent

            /**
             * Returns the raw JSON value of [developerMessage].
             *
             * Unlike [developerMessage], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("developer_message")
            @ExcludeMissing
            fun _developerMessage(): JsonField<String> = developerMessage

            /**
             * Returns the raw JSON value of [extra].
             *
             * Unlike [extra], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("extra") @ExcludeMissing fun _extra(): JsonField<Extra> = extra

            /**
             * Returns the raw JSON value of [retryAfterMs].
             *
             * Unlike [retryAfterMs], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("retry_after_ms")
            @ExcludeMissing
            fun _retryAfterMs(): JsonField<Long> = retryAfterMs

            /**
             * Returns the raw JSON value of [stacktrace].
             *
             * Unlike [stacktrace], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("stacktrace")
            @ExcludeMissing
            fun _stacktrace(): JsonField<String> = stacktrace

            /**
             * Returns the raw JSON value of [statusCode].
             *
             * Unlike [statusCode], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("status_code")
            @ExcludeMissing
            fun _statusCode(): JsonField<Long> = statusCode

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [Error].
                 *
                 * The following fields are required:
                 * ```java
                 * .canRetry()
                 * .kind()
                 * .message()
                 * ```
                 */
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

                /**
                 * Sets [Builder.canRetry] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.canRetry] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun canRetry(canRetry: JsonField<Boolean>) = apply { this.canRetry = canRetry }

                fun kind(kind: Kind) = kind(JsonField.of(kind))

                /**
                 * Sets [Builder.kind] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.kind] with a well-typed [Kind] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun kind(kind: JsonField<Kind>) = apply { this.kind = kind }

                fun message(message: String) = message(JsonField.of(message))

                /**
                 * Sets [Builder.message] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.message] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun message(message: JsonField<String>) = apply { this.message = message }

                fun additionalPromptContent(additionalPromptContent: String) =
                    additionalPromptContent(JsonField.of(additionalPromptContent))

                /**
                 * Sets [Builder.additionalPromptContent] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.additionalPromptContent] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun additionalPromptContent(additionalPromptContent: JsonField<String>) = apply {
                    this.additionalPromptContent = additionalPromptContent
                }

                fun developerMessage(developerMessage: String) =
                    developerMessage(JsonField.of(developerMessage))

                /**
                 * Sets [Builder.developerMessage] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.developerMessage] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun developerMessage(developerMessage: JsonField<String>) = apply {
                    this.developerMessage = developerMessage
                }

                fun extra(extra: Extra) = extra(JsonField.of(extra))

                /**
                 * Sets [Builder.extra] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.extra] with a well-typed [Extra] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun extra(extra: JsonField<Extra>) = apply { this.extra = extra }

                fun retryAfterMs(retryAfterMs: Long) = retryAfterMs(JsonField.of(retryAfterMs))

                /**
                 * Sets [Builder.retryAfterMs] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.retryAfterMs] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun retryAfterMs(retryAfterMs: JsonField<Long>) = apply {
                    this.retryAfterMs = retryAfterMs
                }

                fun stacktrace(stacktrace: String) = stacktrace(JsonField.of(stacktrace))

                /**
                 * Sets [Builder.stacktrace] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.stacktrace] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun stacktrace(stacktrace: JsonField<String>) = apply {
                    this.stacktrace = stacktrace
                }

                fun statusCode(statusCode: Long) = statusCode(JsonField.of(statusCode))

                /**
                 * Sets [Builder.statusCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.statusCode] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
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

                /**
                 * Returns an immutable instance of [Error].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .canRetry()
                 * .kind()
                 * .message()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
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
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Error = apply {
                if (validated) {
                    return@apply
                }

                canRetry()
                kind().validate()
                message()
                additionalPromptContent()
                developerMessage()
                extra().ifPresent { it.validate() }
                retryAfterMs()
                stacktrace()
                statusCode()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: ArcadeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (canRetry.asKnown().isPresent) 1 else 0) +
                    (kind.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (message.asKnown().isPresent) 1 else 0) +
                    (if (additionalPromptContent.asKnown().isPresent) 1 else 0) +
                    (if (developerMessage.asKnown().isPresent) 1 else 0) +
                    (extra.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (retryAfterMs.asKnown().isPresent) 1 else 0) +
                    (if (stacktrace.asKnown().isPresent) 1 else 0) +
                    (if (statusCode.asKnown().isPresent) 1 else 0)

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

                    @JvmField val CONTEXT_CHECK_FAILED = of("CONTEXT_CHECK_FAILED")

                    @JvmField val CONTEXT_DENIED = of("CONTEXT_DENIED")

                    @JvmField val UPSTREAM_RUNTIME_BAD_REQUEST = of("UPSTREAM_RUNTIME_BAD_REQUEST")

                    @JvmField val UPSTREAM_RUNTIME_AUTH_ERROR = of("UPSTREAM_RUNTIME_AUTH_ERROR")

                    @JvmField val UPSTREAM_RUNTIME_NOT_FOUND = of("UPSTREAM_RUNTIME_NOT_FOUND")

                    @JvmField
                    val UPSTREAM_RUNTIME_VALIDATION_ERROR = of("UPSTREAM_RUNTIME_VALIDATION_ERROR")

                    @JvmField val UPSTREAM_RUNTIME_RATE_LIMIT = of("UPSTREAM_RUNTIME_RATE_LIMIT")

                    @JvmField
                    val UPSTREAM_RUNTIME_SERVER_ERROR = of("UPSTREAM_RUNTIME_SERVER_ERROR")

                    @JvmField val UPSTREAM_RUNTIME_UNMAPPED = of("UPSTREAM_RUNTIME_UNMAPPED")

                    @JvmField
                    val NETWORK_TRANSPORT_RUNTIME_TIMEOUT = of("NETWORK_TRANSPORT_RUNTIME_TIMEOUT")

                    @JvmField
                    val NETWORK_TRANSPORT_RUNTIME_UNREACHABLE =
                        of("NETWORK_TRANSPORT_RUNTIME_UNREACHABLE")

                    @JvmField
                    val NETWORK_TRANSPORT_RUNTIME_UNMAPPED =
                        of("NETWORK_TRANSPORT_RUNTIME_UNMAPPED")

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
                    CONTEXT_CHECK_FAILED,
                    CONTEXT_DENIED,
                    UPSTREAM_RUNTIME_BAD_REQUEST,
                    UPSTREAM_RUNTIME_AUTH_ERROR,
                    UPSTREAM_RUNTIME_NOT_FOUND,
                    UPSTREAM_RUNTIME_VALIDATION_ERROR,
                    UPSTREAM_RUNTIME_RATE_LIMIT,
                    UPSTREAM_RUNTIME_SERVER_ERROR,
                    UPSTREAM_RUNTIME_UNMAPPED,
                    NETWORK_TRANSPORT_RUNTIME_TIMEOUT,
                    NETWORK_TRANSPORT_RUNTIME_UNREACHABLE,
                    NETWORK_TRANSPORT_RUNTIME_UNMAPPED,
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
                    CONTEXT_CHECK_FAILED,
                    CONTEXT_DENIED,
                    UPSTREAM_RUNTIME_BAD_REQUEST,
                    UPSTREAM_RUNTIME_AUTH_ERROR,
                    UPSTREAM_RUNTIME_NOT_FOUND,
                    UPSTREAM_RUNTIME_VALIDATION_ERROR,
                    UPSTREAM_RUNTIME_RATE_LIMIT,
                    UPSTREAM_RUNTIME_SERVER_ERROR,
                    UPSTREAM_RUNTIME_UNMAPPED,
                    NETWORK_TRANSPORT_RUNTIME_TIMEOUT,
                    NETWORK_TRANSPORT_RUNTIME_UNREACHABLE,
                    NETWORK_TRANSPORT_RUNTIME_UNMAPPED,
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
                        CONTEXT_CHECK_FAILED -> Value.CONTEXT_CHECK_FAILED
                        CONTEXT_DENIED -> Value.CONTEXT_DENIED
                        UPSTREAM_RUNTIME_BAD_REQUEST -> Value.UPSTREAM_RUNTIME_BAD_REQUEST
                        UPSTREAM_RUNTIME_AUTH_ERROR -> Value.UPSTREAM_RUNTIME_AUTH_ERROR
                        UPSTREAM_RUNTIME_NOT_FOUND -> Value.UPSTREAM_RUNTIME_NOT_FOUND
                        UPSTREAM_RUNTIME_VALIDATION_ERROR -> Value.UPSTREAM_RUNTIME_VALIDATION_ERROR
                        UPSTREAM_RUNTIME_RATE_LIMIT -> Value.UPSTREAM_RUNTIME_RATE_LIMIT
                        UPSTREAM_RUNTIME_SERVER_ERROR -> Value.UPSTREAM_RUNTIME_SERVER_ERROR
                        UPSTREAM_RUNTIME_UNMAPPED -> Value.UPSTREAM_RUNTIME_UNMAPPED
                        NETWORK_TRANSPORT_RUNTIME_TIMEOUT -> Value.NETWORK_TRANSPORT_RUNTIME_TIMEOUT
                        NETWORK_TRANSPORT_RUNTIME_UNREACHABLE ->
                            Value.NETWORK_TRANSPORT_RUNTIME_UNREACHABLE
                        NETWORK_TRANSPORT_RUNTIME_UNMAPPED ->
                            Value.NETWORK_TRANSPORT_RUNTIME_UNMAPPED
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
                        CONTEXT_CHECK_FAILED -> Known.CONTEXT_CHECK_FAILED
                        CONTEXT_DENIED -> Known.CONTEXT_DENIED
                        UPSTREAM_RUNTIME_BAD_REQUEST -> Known.UPSTREAM_RUNTIME_BAD_REQUEST
                        UPSTREAM_RUNTIME_AUTH_ERROR -> Known.UPSTREAM_RUNTIME_AUTH_ERROR
                        UPSTREAM_RUNTIME_NOT_FOUND -> Known.UPSTREAM_RUNTIME_NOT_FOUND
                        UPSTREAM_RUNTIME_VALIDATION_ERROR -> Known.UPSTREAM_RUNTIME_VALIDATION_ERROR
                        UPSTREAM_RUNTIME_RATE_LIMIT -> Known.UPSTREAM_RUNTIME_RATE_LIMIT
                        UPSTREAM_RUNTIME_SERVER_ERROR -> Known.UPSTREAM_RUNTIME_SERVER_ERROR
                        UPSTREAM_RUNTIME_UNMAPPED -> Known.UPSTREAM_RUNTIME_UNMAPPED
                        NETWORK_TRANSPORT_RUNTIME_TIMEOUT -> Known.NETWORK_TRANSPORT_RUNTIME_TIMEOUT
                        NETWORK_TRANSPORT_RUNTIME_UNREACHABLE ->
                            Known.NETWORK_TRANSPORT_RUNTIME_UNREACHABLE
                        NETWORK_TRANSPORT_RUNTIME_UNMAPPED ->
                            Known.NETWORK_TRANSPORT_RUNTIME_UNMAPPED
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

                private var validated: Boolean = false

                fun validate(): Kind = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: ArcadeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Kind && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class Extra
            @JsonCreator
            private constructor(
                @com.fasterxml.jackson.annotation.JsonValue
                private val additionalProperties: Map<String, JsonValue>
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [Extra]. */
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

                    /**
                     * Returns an immutable instance of [Extra].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Extra = Extra(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): Extra = apply {
                    if (validated) {
                        return@apply
                    }

                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: ArcadeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Extra && additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "Extra{additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Error &&
                    canRetry == other.canRetry &&
                    kind == other.kind &&
                    message == other.message &&
                    additionalPromptContent == other.additionalPromptContent &&
                    developerMessage == other.developerMessage &&
                    extra == other.extra &&
                    retryAfterMs == other.retryAfterMs &&
                    stacktrace == other.stacktrace &&
                    statusCode == other.statusCode &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    canRetry,
                    kind,
                    message,
                    additionalPromptContent,
                    developerMessage,
                    extra,
                    retryAfterMs,
                    stacktrace,
                    statusCode,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Error{canRetry=$canRetry, kind=$kind, message=$message, additionalPromptContent=$additionalPromptContent, developerMessage=$developerMessage, extra=$extra, retryAfterMs=$retryAfterMs, stacktrace=$stacktrace, statusCode=$statusCode, additionalProperties=$additionalProperties}"
        }

        class Log
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val level: JsonField<String>,
            private val message: JsonField<String>,
            private val subtype: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("level") @ExcludeMissing level: JsonField<String> = JsonMissing.of(),
                @JsonProperty("message")
                @ExcludeMissing
                message: JsonField<String> = JsonMissing.of(),
                @JsonProperty("subtype")
                @ExcludeMissing
                subtype: JsonField<String> = JsonMissing.of(),
            ) : this(level, message, subtype, mutableMapOf())

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun level(): String = level.getRequired("level")

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun message(): String = message.getRequired("message")

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun subtype(): Optional<String> = subtype.getOptional("subtype")

            /**
             * Returns the raw JSON value of [level].
             *
             * Unlike [level], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("level") @ExcludeMissing fun _level(): JsonField<String> = level

            /**
             * Returns the raw JSON value of [message].
             *
             * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

            /**
             * Returns the raw JSON value of [subtype].
             *
             * Unlike [subtype], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("subtype") @ExcludeMissing fun _subtype(): JsonField<String> = subtype

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [Log].
                 *
                 * The following fields are required:
                 * ```java
                 * .level()
                 * .message()
                 * ```
                 */
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

                /**
                 * Sets [Builder.level] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.level] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun level(level: JsonField<String>) = apply { this.level = level }

                fun message(message: String) = message(JsonField.of(message))

                /**
                 * Sets [Builder.message] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.message] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun message(message: JsonField<String>) = apply { this.message = message }

                fun subtype(subtype: String) = subtype(JsonField.of(subtype))

                /**
                 * Sets [Builder.subtype] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.subtype] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
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

                /**
                 * Returns an immutable instance of [Log].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .level()
                 * .message()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Log =
                    Log(
                        checkRequired("level", level),
                        checkRequired("message", message),
                        subtype,
                        additionalProperties.toMutableMap(),
                    )
            }

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

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: ArcadeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (level.asKnown().isPresent) 1 else 0) +
                    (if (message.asKnown().isPresent) 1 else 0) +
                    (if (subtype.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Log &&
                    level == other.level &&
                    message == other.message &&
                    subtype == other.subtype &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(level, message, subtype, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Log{level=$level, message=$message, subtype=$subtype, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Output &&
                authorization == other.authorization &&
                error == other.error &&
                logs == other.logs &&
                value == other.value &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(authorization, error, logs, value, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Output{authorization=$authorization, error=$error, logs=$logs, value=$value, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExecuteToolResponse &&
            id == other.id &&
            duration == other.duration &&
            executionId == other.executionId &&
            executionType == other.executionType &&
            finishedAt == other.finishedAt &&
            output == other.output &&
            runAt == other.runAt &&
            status == other.status &&
            success == other.success &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            duration,
            executionId,
            executionType,
            finishedAt,
            output,
            runAt,
            status,
            success,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExecuteToolResponse{id=$id, duration=$duration, executionId=$executionId, executionType=$executionType, finishedAt=$finishedAt, output=$output, runAt=$runAt, status=$status, success=$success, additionalProperties=$additionalProperties}"
}
