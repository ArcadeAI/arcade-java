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
class ExecuteToolRequest
@JsonCreator
private constructor(
    @JsonProperty("tool_name")
    @ExcludeMissing
    private val toolName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("input") @ExcludeMissing private val input: JsonField<Input> = JsonMissing.of(),
    @JsonProperty("run_at") @ExcludeMissing private val runAt: JsonField<String> = JsonMissing.of(),
    @JsonProperty("tool_version")
    @ExcludeMissing
    private val toolVersion: JsonField<String> = JsonMissing.of(),
    @JsonProperty("user_id")
    @ExcludeMissing
    private val userId: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun toolName(): String = toolName.getRequired("tool_name")

    /** JSON input to the tool, if any */
    fun input(): Optional<Input> = Optional.ofNullable(input.getNullable("input"))

    /**
     * The time at which the tool should be run (optional). If not provided, the tool is run
     * immediately
     */
    fun runAt(): Optional<String> = Optional.ofNullable(runAt.getNullable("run_at"))

    /** The tool version to use (optional). If not provided, any version is used */
    fun toolVersion(): Optional<String> =
        Optional.ofNullable(toolVersion.getNullable("tool_version"))

    fun userId(): Optional<String> = Optional.ofNullable(userId.getNullable("user_id"))

    @JsonProperty("tool_name") @ExcludeMissing fun _toolName(): JsonField<String> = toolName

    /** JSON input to the tool, if any */
    @JsonProperty("input") @ExcludeMissing fun _input(): JsonField<Input> = input

    /**
     * The time at which the tool should be run (optional). If not provided, the tool is run
     * immediately
     */
    @JsonProperty("run_at") @ExcludeMissing fun _runAt(): JsonField<String> = runAt

    /** The tool version to use (optional). If not provided, any version is used */
    @JsonProperty("tool_version")
    @ExcludeMissing
    fun _toolVersion(): JsonField<String> = toolVersion

    @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ExecuteToolRequest = apply {
        if (validated) {
            return@apply
        }

        toolName()
        input().ifPresent { it.validate() }
        runAt()
        toolVersion()
        userId()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExecuteToolRequest]. */
    class Builder internal constructor() {

        private var toolName: JsonField<String>? = null
        private var input: JsonField<Input> = JsonMissing.of()
        private var runAt: JsonField<String> = JsonMissing.of()
        private var toolVersion: JsonField<String> = JsonMissing.of()
        private var userId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(executeToolRequest: ExecuteToolRequest) = apply {
            toolName = executeToolRequest.toolName
            input = executeToolRequest.input
            runAt = executeToolRequest.runAt
            toolVersion = executeToolRequest.toolVersion
            userId = executeToolRequest.userId
            additionalProperties = executeToolRequest.additionalProperties.toMutableMap()
        }

        fun toolName(toolName: String) = toolName(JsonField.of(toolName))

        fun toolName(toolName: JsonField<String>) = apply { this.toolName = toolName }

        /** JSON input to the tool, if any */
        fun input(input: Input) = input(JsonField.of(input))

        /** JSON input to the tool, if any */
        fun input(input: JsonField<Input>) = apply { this.input = input }

        /**
         * The time at which the tool should be run (optional). If not provided, the tool is run
         * immediately
         */
        fun runAt(runAt: String) = runAt(JsonField.of(runAt))

        /**
         * The time at which the tool should be run (optional). If not provided, the tool is run
         * immediately
         */
        fun runAt(runAt: JsonField<String>) = apply { this.runAt = runAt }

        /** The tool version to use (optional). If not provided, any version is used */
        fun toolVersion(toolVersion: String) = toolVersion(JsonField.of(toolVersion))

        /** The tool version to use (optional). If not provided, any version is used */
        fun toolVersion(toolVersion: JsonField<String>) = apply { this.toolVersion = toolVersion }

        fun userId(userId: String) = userId(JsonField.of(userId))

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

        fun build(): ExecuteToolRequest =
            ExecuteToolRequest(
                checkRequired("toolName", toolName),
                input,
                runAt,
                toolVersion,
                userId,
                additionalProperties.toImmutable(),
            )
    }

    /** JSON input to the tool, if any */
    @NoAutoDetect
    class Input
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Input = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
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

            fun build(): Input = Input(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Input && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Input{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExecuteToolRequest && toolName == other.toolName && input == other.input && runAt == other.runAt && toolVersion == other.toolVersion && userId == other.userId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(toolName, input, runAt, toolVersion, userId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExecuteToolRequest{toolName=$toolName, input=$input, runAt=$runAt, toolVersion=$toolVersion, userId=$userId, additionalProperties=$additionalProperties}"
}
