// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models.tools

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.arcade.core.ExcludeMissing
import dev.arcade.core.JsonField
import dev.arcade.core.JsonMissing
import dev.arcade.core.JsonValue
import dev.arcade.core.checkRequired
import dev.arcade.core.toImmutable
import dev.arcade.errors.ArcadeInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ExecuteToolRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val toolName: JsonField<String>,
    private val includeErrorStacktrace: JsonField<Boolean>,
    private val input: JsonField<Input>,
    private val runAt: JsonField<String>,
    private val toolVersion: JsonField<String>,
    private val userId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("tool_name") @ExcludeMissing toolName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("include_error_stacktrace")
        @ExcludeMissing
        includeErrorStacktrace: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("input") @ExcludeMissing input: JsonField<Input> = JsonMissing.of(),
        @JsonProperty("run_at") @ExcludeMissing runAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tool_version")
        @ExcludeMissing
        toolVersion: JsonField<String> = JsonMissing.of(),
        @JsonProperty("user_id") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
    ) : this(toolName, includeErrorStacktrace, input, runAt, toolVersion, userId, mutableMapOf())

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun toolName(): String = toolName.getRequired("tool_name")

    /**
     * Whether to include the error stacktrace in the response. If not provided, the error
     * stacktrace is not included.
     *
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun includeErrorStacktrace(): Optional<Boolean> =
        includeErrorStacktrace.getOptional("include_error_stacktrace")

    /**
     * JSON input to the tool, if any
     *
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun input(): Optional<Input> = input.getOptional("input")

    /**
     * The time at which the tool should be run (optional). If not provided, the tool is run
     * immediately. Format ISO 8601: YYYY-MM-DDTHH:MM:SS
     *
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun runAt(): Optional<String> = runAt.getOptional("run_at")

    /**
     * The tool version to use (optional). If not provided, any version is used
     *
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun toolVersion(): Optional<String> = toolVersion.getOptional("tool_version")

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userId(): Optional<String> = userId.getOptional("user_id")

    /**
     * Returns the raw JSON value of [toolName].
     *
     * Unlike [toolName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tool_name") @ExcludeMissing fun _toolName(): JsonField<String> = toolName

    /**
     * Returns the raw JSON value of [includeErrorStacktrace].
     *
     * Unlike [includeErrorStacktrace], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("include_error_stacktrace")
    @ExcludeMissing
    fun _includeErrorStacktrace(): JsonField<Boolean> = includeErrorStacktrace

    /**
     * Returns the raw JSON value of [input].
     *
     * Unlike [input], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("input") @ExcludeMissing fun _input(): JsonField<Input> = input

    /**
     * Returns the raw JSON value of [runAt].
     *
     * Unlike [runAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("run_at") @ExcludeMissing fun _runAt(): JsonField<String> = runAt

    /**
     * Returns the raw JSON value of [toolVersion].
     *
     * Unlike [toolVersion], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tool_version")
    @ExcludeMissing
    fun _toolVersion(): JsonField<String> = toolVersion

    /**
     * Returns the raw JSON value of [userId].
     *
     * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

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
         * Returns a mutable builder for constructing an instance of [ExecuteToolRequest].
         *
         * The following fields are required:
         * ```java
         * .toolName()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExecuteToolRequest]. */
    class Builder internal constructor() {

        private var toolName: JsonField<String>? = null
        private var includeErrorStacktrace: JsonField<Boolean> = JsonMissing.of()
        private var input: JsonField<Input> = JsonMissing.of()
        private var runAt: JsonField<String> = JsonMissing.of()
        private var toolVersion: JsonField<String> = JsonMissing.of()
        private var userId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(executeToolRequest: ExecuteToolRequest) = apply {
            toolName = executeToolRequest.toolName
            includeErrorStacktrace = executeToolRequest.includeErrorStacktrace
            input = executeToolRequest.input
            runAt = executeToolRequest.runAt
            toolVersion = executeToolRequest.toolVersion
            userId = executeToolRequest.userId
            additionalProperties = executeToolRequest.additionalProperties.toMutableMap()
        }

        fun toolName(toolName: String) = toolName(JsonField.of(toolName))

        /**
         * Sets [Builder.toolName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.toolName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun toolName(toolName: JsonField<String>) = apply { this.toolName = toolName }

        /**
         * Whether to include the error stacktrace in the response. If not provided, the error
         * stacktrace is not included.
         */
        fun includeErrorStacktrace(includeErrorStacktrace: Boolean) =
            includeErrorStacktrace(JsonField.of(includeErrorStacktrace))

        /**
         * Sets [Builder.includeErrorStacktrace] to an arbitrary JSON value.
         *
         * You should usually call [Builder.includeErrorStacktrace] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun includeErrorStacktrace(includeErrorStacktrace: JsonField<Boolean>) = apply {
            this.includeErrorStacktrace = includeErrorStacktrace
        }

        /** JSON input to the tool, if any */
        fun input(input: Input) = input(JsonField.of(input))

        /** JSON input to the tool, if any */
        fun input(input: Map<String, Any?>) = input(Input.from(input))

        /**
         * Sets [Builder.input] to an arbitrary JSON value.
         *
         * You should usually call [Builder.input] with a well-typed [Input] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun input(input: JsonField<Input>) = apply { this.input = input }

        /**
         * The time at which the tool should be run (optional). If not provided, the tool is run
         * immediately. Format ISO 8601: YYYY-MM-DDTHH:MM:SS
         */
        fun runAt(runAt: String) = runAt(JsonField.of(runAt))

        /**
         * Sets [Builder.runAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.runAt] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun runAt(runAt: JsonField<String>) = apply { this.runAt = runAt }

        /** The tool version to use (optional). If not provided, any version is used */
        fun toolVersion(toolVersion: String) = toolVersion(JsonField.of(toolVersion))

        /**
         * Sets [Builder.toolVersion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.toolVersion] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun toolVersion(toolVersion: JsonField<String>) = apply { this.toolVersion = toolVersion }

        fun userId(userId: String) = userId(JsonField.of(userId))

        /**
         * Sets [Builder.userId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun userId(userId: JsonField<String>) = apply { this.userId = userId }

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
         * Returns an immutable instance of [ExecuteToolRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .toolName()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExecuteToolRequest =
            ExecuteToolRequest(
                checkRequired("toolName", toolName),
                includeErrorStacktrace,
                input,
                runAt,
                toolVersion,
                userId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ExecuteToolRequest = apply {
        if (validated) {
            return@apply
        }

        toolName()
        includeErrorStacktrace()
        input().ifPresent { it.validate() }
        runAt()
        toolVersion()
        userId()
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
        (if (toolName.asKnown().isPresent) 1 else 0) +
            (if (includeErrorStacktrace.asKnown().isPresent) 1 else 0) +
            (input.asKnown().getOrNull()?.validity() ?: 0) +
            (if (runAt.asKnown().isPresent) 1 else 0) +
            (if (toolVersion.asKnown().isPresent) 1 else 0) +
            (if (userId.asKnown().isPresent) 1 else 0)

    /** JSON input to the tool, if any */
    class Input
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

            /** Returns a mutable builder for constructing an instance of [Input]. */
            @JvmStatic fun builder() = Builder()

            /** Converts a Map of input objects to an [Input] Map<String, JsonValue>. */
            @JvmStatic
            fun from(input: Map<String, Any?>) =
                Input(input.mapValues { (_, value) -> JsonValue.from(value) })
        }

        /** A builder for [Input]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(input: Input) = apply {
                additionalProperties = input.additionalProperties.toMutableMap()
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

            /**
             * Returns an immutable instance of [Input].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Input = Input(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Input = apply {
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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Input && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Input{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExecuteToolRequest &&
            toolName == other.toolName &&
            includeErrorStacktrace == other.includeErrorStacktrace &&
            input == other.input &&
            runAt == other.runAt &&
            toolVersion == other.toolVersion &&
            userId == other.userId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            toolName,
            includeErrorStacktrace,
            input,
            runAt,
            toolVersion,
            userId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExecuteToolRequest{toolName=$toolName, includeErrorStacktrace=$includeErrorStacktrace, input=$input, runAt=$runAt, toolVersion=$toolVersion, userId=$userId, additionalProperties=$additionalProperties}"
}
