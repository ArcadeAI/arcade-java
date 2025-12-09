// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models.auth

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.arcade.core.ExcludeMissing
import dev.arcade.core.JsonField
import dev.arcade.core.JsonMissing
import dev.arcade.core.JsonValue
import dev.arcade.core.checkRequired
import dev.arcade.errors.ArcadeInvalidDataException
import java.util.Collections
import java.util.Objects

class ConfirmUserRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val flowId: JsonField<String>,
    private val userId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("flow_id") @ExcludeMissing flowId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("user_id") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
    ) : this(flowId, userId, mutableMapOf())

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun flowId(): String = flowId.getRequired("flow_id")

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun userId(): String = userId.getRequired("user_id")

    /**
     * Returns the raw JSON value of [flowId].
     *
     * Unlike [flowId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("flow_id") @ExcludeMissing fun _flowId(): JsonField<String> = flowId

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
         * Returns a mutable builder for constructing an instance of [ConfirmUserRequest].
         *
         * The following fields are required:
         * ```java
         * .flowId()
         * .userId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ConfirmUserRequest]. */
    class Builder internal constructor() {

        private var flowId: JsonField<String>? = null
        private var userId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(confirmUserRequest: ConfirmUserRequest) = apply {
            flowId = confirmUserRequest.flowId
            userId = confirmUserRequest.userId
            additionalProperties = confirmUserRequest.additionalProperties.toMutableMap()
        }

        fun flowId(flowId: String) = flowId(JsonField.of(flowId))

        /**
         * Sets [Builder.flowId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.flowId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun flowId(flowId: JsonField<String>) = apply { this.flowId = flowId }

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
         * Returns an immutable instance of [ConfirmUserRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .flowId()
         * .userId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ConfirmUserRequest =
            ConfirmUserRequest(
                checkRequired("flowId", flowId),
                checkRequired("userId", userId),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ConfirmUserRequest = apply {
        if (validated) {
            return@apply
        }

        flowId()
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
        (if (flowId.asKnown().isPresent) 1 else 0) + (if (userId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ConfirmUserRequest &&
            flowId == other.flowId &&
            userId == other.userId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(flowId, userId, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ConfirmUserRequest{flowId=$flowId, userId=$userId, additionalProperties=$additionalProperties}"
}
