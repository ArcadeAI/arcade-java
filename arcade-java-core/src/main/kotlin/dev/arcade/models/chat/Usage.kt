// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models.chat

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

class Usage
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val completionTokens: JsonField<Long>,
    private val promptTokens: JsonField<Long>,
    private val totalTokens: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("completion_tokens")
        @ExcludeMissing
        completionTokens: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("prompt_tokens")
        @ExcludeMissing
        promptTokens: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("total_tokens")
        @ExcludeMissing
        totalTokens: JsonField<Long> = JsonMissing.of(),
    ) : this(completionTokens, promptTokens, totalTokens, mutableMapOf())

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun completionTokens(): Optional<Long> = completionTokens.getOptional("completion_tokens")

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun promptTokens(): Optional<Long> = promptTokens.getOptional("prompt_tokens")

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalTokens(): Optional<Long> = totalTokens.getOptional("total_tokens")

    /**
     * Returns the raw JSON value of [completionTokens].
     *
     * Unlike [completionTokens], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("completion_tokens")
    @ExcludeMissing
    fun _completionTokens(): JsonField<Long> = completionTokens

    /**
     * Returns the raw JSON value of [promptTokens].
     *
     * Unlike [promptTokens], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("prompt_tokens")
    @ExcludeMissing
    fun _promptTokens(): JsonField<Long> = promptTokens

    /**
     * Returns the raw JSON value of [totalTokens].
     *
     * Unlike [totalTokens], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total_tokens") @ExcludeMissing fun _totalTokens(): JsonField<Long> = totalTokens

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

        /** Returns a mutable builder for constructing an instance of [Usage]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Usage]. */
    class Builder internal constructor() {

        private var completionTokens: JsonField<Long> = JsonMissing.of()
        private var promptTokens: JsonField<Long> = JsonMissing.of()
        private var totalTokens: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(usage: Usage) = apply {
            completionTokens = usage.completionTokens
            promptTokens = usage.promptTokens
            totalTokens = usage.totalTokens
            additionalProperties = usage.additionalProperties.toMutableMap()
        }

        fun completionTokens(completionTokens: Long) =
            completionTokens(JsonField.of(completionTokens))

        /**
         * Sets [Builder.completionTokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.completionTokens] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun completionTokens(completionTokens: JsonField<Long>) = apply {
            this.completionTokens = completionTokens
        }

        fun promptTokens(promptTokens: Long) = promptTokens(JsonField.of(promptTokens))

        /**
         * Sets [Builder.promptTokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.promptTokens] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun promptTokens(promptTokens: JsonField<Long>) = apply { this.promptTokens = promptTokens }

        fun totalTokens(totalTokens: Long) = totalTokens(JsonField.of(totalTokens))

        /**
         * Sets [Builder.totalTokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalTokens] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun totalTokens(totalTokens: JsonField<Long>) = apply { this.totalTokens = totalTokens }

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
         * Returns an immutable instance of [Usage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): Usage =
            Usage(completionTokens, promptTokens, totalTokens, additionalProperties.toMutableMap())
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
    fun validate(): Usage = apply {
        if (validated) {
            return@apply
        }

        completionTokens()
        promptTokens()
        totalTokens()
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
        (if (completionTokens.asKnown().isPresent) 1 else 0) +
            (if (promptTokens.asKnown().isPresent) 1 else 0) +
            (if (totalTokens.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Usage &&
            completionTokens == other.completionTokens &&
            promptTokens == other.promptTokens &&
            totalTokens == other.totalTokens &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(completionTokens, promptTokens, totalTokens, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Usage{completionTokens=$completionTokens, promptTokens=$promptTokens, totalTokens=$totalTokens, additionalProperties=$additionalProperties}"
}
