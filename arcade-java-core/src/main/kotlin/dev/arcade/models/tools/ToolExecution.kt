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
import dev.arcade.errors.ArcadeInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

class ToolExecution
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<String>,
    private val executionStatus: JsonField<String>,
    private val executionType: JsonField<String>,
    private val finishedAt: JsonField<String>,
    private val runAt: JsonField<String>,
    private val startedAt: JsonField<String>,
    private val toolName: JsonField<String>,
    private val toolkitName: JsonField<String>,
    private val toolkitVersion: JsonField<String>,
    private val updatedAt: JsonField<String>,
    private val userId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at") @ExcludeMissing createdAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("execution_status")
        @ExcludeMissing
        executionStatus: JsonField<String> = JsonMissing.of(),
        @JsonProperty("execution_type")
        @ExcludeMissing
        executionType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("finished_at")
        @ExcludeMissing
        finishedAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("run_at") @ExcludeMissing runAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("started_at") @ExcludeMissing startedAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tool_name") @ExcludeMissing toolName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("toolkit_name")
        @ExcludeMissing
        toolkitName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("toolkit_version")
        @ExcludeMissing
        toolkitVersion: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at") @ExcludeMissing updatedAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("user_id") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        executionStatus,
        executionType,
        finishedAt,
        runAt,
        startedAt,
        toolName,
        toolkitName,
        toolkitVersion,
        updatedAt,
        userId,
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
    fun createdAt(): Optional<String> = createdAt.getOptional("created_at")

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun executionStatus(): Optional<String> = executionStatus.getOptional("execution_status")

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
    fun runAt(): Optional<String> = runAt.getOptional("run_at")

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startedAt(): Optional<String> = startedAt.getOptional("started_at")

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun toolName(): Optional<String> = toolName.getOptional("tool_name")

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun toolkitName(): Optional<String> = toolkitName.getOptional("toolkit_name")

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun toolkitVersion(): Optional<String> = toolkitVersion.getOptional("toolkit_version")

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<String> = updatedAt.getOptional("updated_at")

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userId(): Optional<String> = userId.getOptional("user_id")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt(): JsonField<String> = createdAt

    /**
     * Returns the raw JSON value of [executionStatus].
     *
     * Unlike [executionStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("execution_status")
    @ExcludeMissing
    fun _executionStatus(): JsonField<String> = executionStatus

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
     * Returns the raw JSON value of [runAt].
     *
     * Unlike [runAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("run_at") @ExcludeMissing fun _runAt(): JsonField<String> = runAt

    /**
     * Returns the raw JSON value of [startedAt].
     *
     * Unlike [startedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("started_at") @ExcludeMissing fun _startedAt(): JsonField<String> = startedAt

    /**
     * Returns the raw JSON value of [toolName].
     *
     * Unlike [toolName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tool_name") @ExcludeMissing fun _toolName(): JsonField<String> = toolName

    /**
     * Returns the raw JSON value of [toolkitName].
     *
     * Unlike [toolkitName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("toolkit_name")
    @ExcludeMissing
    fun _toolkitName(): JsonField<String> = toolkitName

    /**
     * Returns the raw JSON value of [toolkitVersion].
     *
     * Unlike [toolkitVersion], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("toolkit_version")
    @ExcludeMissing
    fun _toolkitVersion(): JsonField<String> = toolkitVersion

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt(): JsonField<String> = updatedAt

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

        /** Returns a mutable builder for constructing an instance of [ToolExecution]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ToolExecution]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<String> = JsonMissing.of()
        private var executionStatus: JsonField<String> = JsonMissing.of()
        private var executionType: JsonField<String> = JsonMissing.of()
        private var finishedAt: JsonField<String> = JsonMissing.of()
        private var runAt: JsonField<String> = JsonMissing.of()
        private var startedAt: JsonField<String> = JsonMissing.of()
        private var toolName: JsonField<String> = JsonMissing.of()
        private var toolkitName: JsonField<String> = JsonMissing.of()
        private var toolkitVersion: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<String> = JsonMissing.of()
        private var userId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(toolExecution: ToolExecution) = apply {
            id = toolExecution.id
            createdAt = toolExecution.createdAt
            executionStatus = toolExecution.executionStatus
            executionType = toolExecution.executionType
            finishedAt = toolExecution.finishedAt
            runAt = toolExecution.runAt
            startedAt = toolExecution.startedAt
            toolName = toolExecution.toolName
            toolkitName = toolExecution.toolkitName
            toolkitVersion = toolExecution.toolkitVersion
            updatedAt = toolExecution.updatedAt
            userId = toolExecution.userId
            additionalProperties = toolExecution.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun createdAt(createdAt: String) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdAt(createdAt: JsonField<String>) = apply { this.createdAt = createdAt }

        fun executionStatus(executionStatus: String) =
            executionStatus(JsonField.of(executionStatus))

        /**
         * Sets [Builder.executionStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.executionStatus] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun executionStatus(executionStatus: JsonField<String>) = apply {
            this.executionStatus = executionStatus
        }

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

        fun runAt(runAt: String) = runAt(JsonField.of(runAt))

        /**
         * Sets [Builder.runAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.runAt] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun runAt(runAt: JsonField<String>) = apply { this.runAt = runAt }

        fun startedAt(startedAt: String) = startedAt(JsonField.of(startedAt))

        /**
         * Sets [Builder.startedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startedAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun startedAt(startedAt: JsonField<String>) = apply { this.startedAt = startedAt }

        fun toolName(toolName: String) = toolName(JsonField.of(toolName))

        /**
         * Sets [Builder.toolName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.toolName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun toolName(toolName: JsonField<String>) = apply { this.toolName = toolName }

        fun toolkitName(toolkitName: String) = toolkitName(JsonField.of(toolkitName))

        /**
         * Sets [Builder.toolkitName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.toolkitName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun toolkitName(toolkitName: JsonField<String>) = apply { this.toolkitName = toolkitName }

        fun toolkitVersion(toolkitVersion: String) = toolkitVersion(JsonField.of(toolkitVersion))

        /**
         * Sets [Builder.toolkitVersion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.toolkitVersion] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun toolkitVersion(toolkitVersion: JsonField<String>) = apply {
            this.toolkitVersion = toolkitVersion
        }

        fun updatedAt(updatedAt: String) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun updatedAt(updatedAt: JsonField<String>) = apply { this.updatedAt = updatedAt }

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
         * Returns an immutable instance of [ToolExecution].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ToolExecution =
            ToolExecution(
                id,
                createdAt,
                executionStatus,
                executionType,
                finishedAt,
                runAt,
                startedAt,
                toolName,
                toolkitName,
                toolkitVersion,
                updatedAt,
                userId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws ArcadeInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): ToolExecution = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        executionStatus()
        executionType()
        finishedAt()
        runAt()
        startedAt()
        toolName()
        toolkitName()
        toolkitVersion()
        updatedAt()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (executionStatus.asKnown().isPresent) 1 else 0) +
            (if (executionType.asKnown().isPresent) 1 else 0) +
            (if (finishedAt.asKnown().isPresent) 1 else 0) +
            (if (runAt.asKnown().isPresent) 1 else 0) +
            (if (startedAt.asKnown().isPresent) 1 else 0) +
            (if (toolName.asKnown().isPresent) 1 else 0) +
            (if (toolkitName.asKnown().isPresent) 1 else 0) +
            (if (toolkitVersion.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (userId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ToolExecution &&
            id == other.id &&
            createdAt == other.createdAt &&
            executionStatus == other.executionStatus &&
            executionType == other.executionType &&
            finishedAt == other.finishedAt &&
            runAt == other.runAt &&
            startedAt == other.startedAt &&
            toolName == other.toolName &&
            toolkitName == other.toolkitName &&
            toolkitVersion == other.toolkitVersion &&
            updatedAt == other.updatedAt &&
            userId == other.userId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            executionStatus,
            executionType,
            finishedAt,
            runAt,
            startedAt,
            toolName,
            toolkitName,
            toolkitVersion,
            updatedAt,
            userId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ToolExecution{id=$id, createdAt=$createdAt, executionStatus=$executionStatus, executionType=$executionType, finishedAt=$finishedAt, runAt=$runAt, startedAt=$startedAt, toolName=$toolName, toolkitName=$toolkitName, toolkitVersion=$toolkitVersion, updatedAt=$updatedAt, userId=$userId, additionalProperties=$additionalProperties}"
}
