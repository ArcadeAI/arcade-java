// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models.health

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

class HealthSchema
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val healthy: JsonField<Boolean>,
    private val reason: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("healthy") @ExcludeMissing healthy: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("reason") @ExcludeMissing reason: JsonField<String> = JsonMissing.of(),
    ) : this(healthy, reason, mutableMapOf())

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun healthy(): Optional<Boolean> = healthy.getOptional("healthy")

    /**
     * Optional: explains why unhealthy
     *
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reason(): Optional<String> = reason.getOptional("reason")

    /**
     * Returns the raw JSON value of [healthy].
     *
     * Unlike [healthy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("healthy") @ExcludeMissing fun _healthy(): JsonField<Boolean> = healthy

    /**
     * Returns the raw JSON value of [reason].
     *
     * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

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

        /** Returns a mutable builder for constructing an instance of [HealthSchema]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [HealthSchema]. */
    class Builder internal constructor() {

        private var healthy: JsonField<Boolean> = JsonMissing.of()
        private var reason: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(healthSchema: HealthSchema) = apply {
            healthy = healthSchema.healthy
            reason = healthSchema.reason
            additionalProperties = healthSchema.additionalProperties.toMutableMap()
        }

        fun healthy(healthy: Boolean) = healthy(JsonField.of(healthy))

        /**
         * Sets [Builder.healthy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.healthy] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun healthy(healthy: JsonField<Boolean>) = apply { this.healthy = healthy }

        /** Optional: explains why unhealthy */
        fun reason(reason: String) = reason(JsonField.of(reason))

        /**
         * Sets [Builder.reason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reason] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun reason(reason: JsonField<String>) = apply { this.reason = reason }

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
         * Returns an immutable instance of [HealthSchema].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): HealthSchema =
            HealthSchema(healthy, reason, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): HealthSchema = apply {
        if (validated) {
            return@apply
        }

        healthy()
        reason()
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
        (if (healthy.asKnown().isPresent) 1 else 0) + (if (reason.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is HealthSchema &&
            healthy == other.healthy &&
            reason == other.reason &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(healthy, reason, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "HealthSchema{healthy=$healthy, reason=$reason, additionalProperties=$additionalProperties}"
}
