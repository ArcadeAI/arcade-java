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
import dev.arcade.core.checkKnown
import dev.arcade.core.checkRequired
import dev.arcade.core.toImmutable
import dev.arcade.errors.ArcadeInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ValueSchema
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val valType: JsonField<String>,
    private val enum_: JsonField<List<String>>,
    private val innerValType: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("val_type") @ExcludeMissing valType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("enum") @ExcludeMissing enum_: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("inner_val_type")
        @ExcludeMissing
        innerValType: JsonField<String> = JsonMissing.of(),
    ) : this(valType, enum_, innerValType, mutableMapOf())

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun valType(): String = valType.getRequired("val_type")

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enum_(): Optional<List<String>> = enum_.getOptional("enum")

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun innerValType(): Optional<String> = innerValType.getOptional("inner_val_type")

    /**
     * Returns the raw JSON value of [valType].
     *
     * Unlike [valType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("val_type") @ExcludeMissing fun _valType(): JsonField<String> = valType

    /**
     * Returns the raw JSON value of [enum_].
     *
     * Unlike [enum_], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("enum") @ExcludeMissing fun _enum_(): JsonField<List<String>> = enum_

    /**
     * Returns the raw JSON value of [innerValType].
     *
     * Unlike [innerValType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("inner_val_type")
    @ExcludeMissing
    fun _innerValType(): JsonField<String> = innerValType

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
         * Returns a mutable builder for constructing an instance of [ValueSchema].
         *
         * The following fields are required:
         * ```java
         * .valType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ValueSchema]. */
    class Builder internal constructor() {

        private var valType: JsonField<String>? = null
        private var enum_: JsonField<MutableList<String>>? = null
        private var innerValType: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(valueSchema: ValueSchema) = apply {
            valType = valueSchema.valType
            enum_ = valueSchema.enum_.map { it.toMutableList() }
            innerValType = valueSchema.innerValType
            additionalProperties = valueSchema.additionalProperties.toMutableMap()
        }

        fun valType(valType: String) = valType(JsonField.of(valType))

        /**
         * Sets [Builder.valType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.valType] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun valType(valType: JsonField<String>) = apply { this.valType = valType }

        fun enum_(enum_: List<String>) = enum_(JsonField.of(enum_))

        /**
         * Sets [Builder.enum_] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enum_] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun enum_(enum_: JsonField<List<String>>) = apply {
            this.enum_ = enum_.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.enum_].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEnum(enum_: String) = apply {
            this.enum_ =
                (this.enum_ ?: JsonField.of(mutableListOf())).also {
                    checkKnown("enum_", it).add(enum_)
                }
        }

        fun innerValType(innerValType: String) = innerValType(JsonField.of(innerValType))

        /**
         * Sets [Builder.innerValType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.innerValType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun innerValType(innerValType: JsonField<String>) = apply {
            this.innerValType = innerValType
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
         * Returns an immutable instance of [ValueSchema].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .valType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ValueSchema =
            ValueSchema(
                checkRequired("valType", valType),
                (enum_ ?: JsonMissing.of()).map { it.toImmutable() },
                innerValType,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ValueSchema = apply {
        if (validated) {
            return@apply
        }

        valType()
        enum_()
        innerValType()
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
        (if (valType.asKnown().isPresent) 1 else 0) +
            (enum_.asKnown().getOrNull()?.size ?: 0) +
            (if (innerValType.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ValueSchema &&
            valType == other.valType &&
            enum_ == other.enum_ &&
            innerValType == other.innerValType &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(valType, enum_, innerValType, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ValueSchema{valType=$valType, enum_=$enum_, innerValType=$innerValType, additionalProperties=$additionalProperties}"
}
