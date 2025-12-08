// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.arcade.core.ExcludeMissing
import dev.arcade.core.JsonField
import dev.arcade.core.JsonMissing
import dev.arcade.core.JsonValue
import dev.arcade.core.NoAutoDetect
import dev.arcade.core.immutableEmptyMap
import dev.arcade.core.toImmutable
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class ToolScheduledGetResponse
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("attempts")
    @ExcludeMissing
    private val attempts: JsonField<List<ToolExecutionAttempt>> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<String> = JsonMissing.of(),
    @JsonProperty("execution_status")
    @ExcludeMissing
    private val executionStatus: JsonField<String> = JsonMissing.of(),
    @JsonProperty("execution_type")
    @ExcludeMissing
    private val executionType: JsonField<String> = JsonMissing.of(),
    @JsonProperty("finished_at")
    @ExcludeMissing
    private val finishedAt: JsonField<String> = JsonMissing.of(),
    @JsonProperty("input") @ExcludeMissing private val input: JsonField<Input> = JsonMissing.of(),
    @JsonProperty("run_at") @ExcludeMissing private val runAt: JsonField<String> = JsonMissing.of(),
    @JsonProperty("started_at")
    @ExcludeMissing
    private val startedAt: JsonField<String> = JsonMissing.of(),
    @JsonProperty("tool_name")
    @ExcludeMissing
    private val toolName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("toolkit_name")
    @ExcludeMissing
    private val toolkitName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("toolkit_version")
    @ExcludeMissing
    private val toolkitVersion: JsonField<String> = JsonMissing.of(),
    @JsonProperty("updated_at")
    @ExcludeMissing
    private val updatedAt: JsonField<String> = JsonMissing.of(),
    @JsonProperty("user_id")
    @ExcludeMissing
    private val userId: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): Optional<String> = Optional.ofNullable(id.getNullable("id"))

    fun attempts(): Optional<List<ToolExecutionAttempt>> =
        Optional.ofNullable(attempts.getNullable("attempts"))

    fun createdAt(): Optional<String> = Optional.ofNullable(createdAt.getNullable("created_at"))

    fun executionStatus(): Optional<String> =
        Optional.ofNullable(executionStatus.getNullable("execution_status"))

    fun executionType(): Optional<String> =
        Optional.ofNullable(executionType.getNullable("execution_type"))

    fun finishedAt(): Optional<String> = Optional.ofNullable(finishedAt.getNullable("finished_at"))

    fun input(): Optional<Input> = Optional.ofNullable(input.getNullable("input"))

    fun runAt(): Optional<String> = Optional.ofNullable(runAt.getNullable("run_at"))

    fun startedAt(): Optional<String> = Optional.ofNullable(startedAt.getNullable("started_at"))

    fun toolName(): Optional<String> = Optional.ofNullable(toolName.getNullable("tool_name"))

    fun toolkitName(): Optional<String> =
        Optional.ofNullable(toolkitName.getNullable("toolkit_name"))

    fun toolkitVersion(): Optional<String> =
        Optional.ofNullable(toolkitVersion.getNullable("toolkit_version"))

    fun updatedAt(): Optional<String> = Optional.ofNullable(updatedAt.getNullable("updated_at"))

    fun userId(): Optional<String> = Optional.ofNullable(userId.getNullable("user_id"))

    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    @JsonProperty("attempts")
    @ExcludeMissing
    fun _attempts(): JsonField<List<ToolExecutionAttempt>> = attempts

    @JsonProperty("created_at") @ExcludeMissing fun _createdAt(): JsonField<String> = createdAt

    @JsonProperty("execution_status")
    @ExcludeMissing
    fun _executionStatus(): JsonField<String> = executionStatus

    @JsonProperty("execution_type")
    @ExcludeMissing
    fun _executionType(): JsonField<String> = executionType

    @JsonProperty("finished_at") @ExcludeMissing fun _finishedAt(): JsonField<String> = finishedAt

    @JsonProperty("input") @ExcludeMissing fun _input(): JsonField<Input> = input

    @JsonProperty("run_at") @ExcludeMissing fun _runAt(): JsonField<String> = runAt

    @JsonProperty("started_at") @ExcludeMissing fun _startedAt(): JsonField<String> = startedAt

    @JsonProperty("tool_name") @ExcludeMissing fun _toolName(): JsonField<String> = toolName

    @JsonProperty("toolkit_name")
    @ExcludeMissing
    fun _toolkitName(): JsonField<String> = toolkitName

    @JsonProperty("toolkit_version")
    @ExcludeMissing
    fun _toolkitVersion(): JsonField<String> = toolkitVersion

    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt(): JsonField<String> = updatedAt

    @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ToolScheduledGetResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        attempts().ifPresent { it.forEach { it.validate() } }
        createdAt()
        executionStatus()
        executionType()
        finishedAt()
        input().ifPresent { it.validate() }
        runAt()
        startedAt()
        toolName()
        toolkitName()
        toolkitVersion()
        updatedAt()
        userId()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ToolScheduledGetResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var attempts: JsonField<MutableList<ToolExecutionAttempt>>? = null
        private var createdAt: JsonField<String> = JsonMissing.of()
        private var executionStatus: JsonField<String> = JsonMissing.of()
        private var executionType: JsonField<String> = JsonMissing.of()
        private var finishedAt: JsonField<String> = JsonMissing.of()
        private var input: JsonField<Input> = JsonMissing.of()
        private var runAt: JsonField<String> = JsonMissing.of()
        private var startedAt: JsonField<String> = JsonMissing.of()
        private var toolName: JsonField<String> = JsonMissing.of()
        private var toolkitName: JsonField<String> = JsonMissing.of()
        private var toolkitVersion: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<String> = JsonMissing.of()
        private var userId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(toolScheduledGetResponse: ToolScheduledGetResponse) = apply {
            id = toolScheduledGetResponse.id
            attempts = toolScheduledGetResponse.attempts.map { it.toMutableList() }
            createdAt = toolScheduledGetResponse.createdAt
            executionStatus = toolScheduledGetResponse.executionStatus
            executionType = toolScheduledGetResponse.executionType
            finishedAt = toolScheduledGetResponse.finishedAt
            input = toolScheduledGetResponse.input
            runAt = toolScheduledGetResponse.runAt
            startedAt = toolScheduledGetResponse.startedAt
            toolName = toolScheduledGetResponse.toolName
            toolkitName = toolScheduledGetResponse.toolkitName
            toolkitVersion = toolScheduledGetResponse.toolkitVersion
            updatedAt = toolScheduledGetResponse.updatedAt
            userId = toolScheduledGetResponse.userId
            additionalProperties = toolScheduledGetResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        fun attempts(attempts: List<ToolExecutionAttempt>) = attempts(JsonField.of(attempts))

        fun attempts(attempts: JsonField<List<ToolExecutionAttempt>>) = apply {
            this.attempts = attempts.map { it.toMutableList() }
        }

        fun addAttempt(attempt: ToolExecutionAttempt) = apply {
            attempts =
                (attempts ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(attempt)
                }
        }

        fun createdAt(createdAt: String) = createdAt(JsonField.of(createdAt))

        fun createdAt(createdAt: JsonField<String>) = apply { this.createdAt = createdAt }

        fun executionStatus(executionStatus: String) =
            executionStatus(JsonField.of(executionStatus))

        fun executionStatus(executionStatus: JsonField<String>) = apply {
            this.executionStatus = executionStatus
        }

        fun executionType(executionType: String) = executionType(JsonField.of(executionType))

        fun executionType(executionType: JsonField<String>) = apply {
            this.executionType = executionType
        }

        fun finishedAt(finishedAt: String) = finishedAt(JsonField.of(finishedAt))

        fun finishedAt(finishedAt: JsonField<String>) = apply { this.finishedAt = finishedAt }

        fun input(input: Input) = input(JsonField.of(input))

        fun input(input: JsonField<Input>) = apply { this.input = input }

        fun runAt(runAt: String) = runAt(JsonField.of(runAt))

        fun runAt(runAt: JsonField<String>) = apply { this.runAt = runAt }

        fun startedAt(startedAt: String) = startedAt(JsonField.of(startedAt))

        fun startedAt(startedAt: JsonField<String>) = apply { this.startedAt = startedAt }

        fun toolName(toolName: String) = toolName(JsonField.of(toolName))

        fun toolName(toolName: JsonField<String>) = apply { this.toolName = toolName }

        fun toolkitName(toolkitName: String) = toolkitName(JsonField.of(toolkitName))

        fun toolkitName(toolkitName: JsonField<String>) = apply { this.toolkitName = toolkitName }

        fun toolkitVersion(toolkitVersion: String) = toolkitVersion(JsonField.of(toolkitVersion))

        fun toolkitVersion(toolkitVersion: JsonField<String>) = apply {
            this.toolkitVersion = toolkitVersion
        }

        fun updatedAt(updatedAt: String) = updatedAt(JsonField.of(updatedAt))

        fun updatedAt(updatedAt: JsonField<String>) = apply { this.updatedAt = updatedAt }

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

        fun build(): ToolScheduledGetResponse =
            ToolScheduledGetResponse(
                id,
                (attempts ?: JsonMissing.of()).map { it.toImmutable() },
                createdAt,
                executionStatus,
                executionType,
                finishedAt,
                input,
                runAt,
                startedAt,
                toolName,
                toolkitName,
                toolkitVersion,
                updatedAt,
                userId,
                additionalProperties.toImmutable(),
            )
    }

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

        return /* spotless:off */ other is ToolScheduledGetResponse && id == other.id && attempts == other.attempts && createdAt == other.createdAt && executionStatus == other.executionStatus && executionType == other.executionType && finishedAt == other.finishedAt && input == other.input && runAt == other.runAt && startedAt == other.startedAt && toolName == other.toolName && toolkitName == other.toolkitName && toolkitVersion == other.toolkitVersion && updatedAt == other.updatedAt && userId == other.userId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, attempts, createdAt, executionStatus, executionType, finishedAt, input, runAt, startedAt, toolName, toolkitName, toolkitVersion, updatedAt, userId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ToolScheduledGetResponse{id=$id, attempts=$attempts, createdAt=$createdAt, executionStatus=$executionStatus, executionType=$executionType, finishedAt=$finishedAt, input=$input, runAt=$runAt, startedAt=$startedAt, toolName=$toolName, toolkitName=$toolkitName, toolkitVersion=$toolkitVersion, updatedAt=$updatedAt, userId=$userId, additionalProperties=$additionalProperties}"
}
