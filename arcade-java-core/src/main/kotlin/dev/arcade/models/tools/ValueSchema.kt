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
    private val description: JsonField<String>,
    private val enum_: JsonField<List<String>>,
    private val innerProperties: JsonValue,
    private val innerRequiredKeys: JsonField<List<String>>,
    private val innerValType: JsonField<String>,
    private val items: JsonField<ValueSchema>,
    private val nullable: JsonField<Boolean>,
    private val properties: JsonValue,
    private val requiredKeys: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("val_type") @ExcludeMissing valType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("enum") @ExcludeMissing enum_: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("inner_properties")
        @ExcludeMissing
        innerProperties: JsonValue = JsonMissing.of(),
        @JsonProperty("inner_required_keys")
        @ExcludeMissing
        innerRequiredKeys: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("inner_val_type")
        @ExcludeMissing
        innerValType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("items") @ExcludeMissing items: JsonField<ValueSchema> = JsonMissing.of(),
        @JsonProperty("nullable") @ExcludeMissing nullable: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("properties") @ExcludeMissing properties: JsonValue = JsonMissing.of(),
        @JsonProperty("required_keys")
        @ExcludeMissing
        requiredKeys: JsonField<List<String>> = JsonMissing.of(),
    ) : this(
        valType,
        description,
        enum_,
        innerProperties,
        innerRequiredKeys,
        innerValType,
        items,
        nullable,
        properties,
        requiredKeys,
        mutableMapOf(),
    )

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun valType(): String = valType.getRequired("val_type")

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enum_(): Optional<List<String>> = enum_.getOptional("enum")

    /**
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = valueSchema.innerProperties().convert(MyClass.class);
     * ```
     */
    @JsonProperty("inner_properties")
    @ExcludeMissing
    fun _innerProperties(): JsonValue = innerProperties

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun innerRequiredKeys(): Optional<List<String>> =
        innerRequiredKeys.getOptional("inner_required_keys")

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun innerValType(): Optional<String> = innerValType.getOptional("inner_val_type")

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun items(): Optional<ValueSchema> = items.getOptional("items")

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun nullable(): Optional<Boolean> = nullable.getOptional("nullable")

    /**
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = valueSchema.properties().convert(MyClass.class);
     * ```
     */
    @JsonProperty("properties") @ExcludeMissing fun _properties(): JsonValue = properties

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun requiredKeys(): Optional<List<String>> = requiredKeys.getOptional("required_keys")

    /**
     * Returns the raw JSON value of [valType].
     *
     * Unlike [valType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("val_type") @ExcludeMissing fun _valType(): JsonField<String> = valType

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [enum_].
     *
     * Unlike [enum_], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("enum") @ExcludeMissing fun _enum_(): JsonField<List<String>> = enum_

    /**
     * Returns the raw JSON value of [innerRequiredKeys].
     *
     * Unlike [innerRequiredKeys], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("inner_required_keys")
    @ExcludeMissing
    fun _innerRequiredKeys(): JsonField<List<String>> = innerRequiredKeys

    /**
     * Returns the raw JSON value of [innerValType].
     *
     * Unlike [innerValType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("inner_val_type")
    @ExcludeMissing
    fun _innerValType(): JsonField<String> = innerValType

    /**
     * Returns the raw JSON value of [items].
     *
     * Unlike [items], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("items") @ExcludeMissing fun _items(): JsonField<ValueSchema> = items

    /**
     * Returns the raw JSON value of [nullable].
     *
     * Unlike [nullable], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("nullable") @ExcludeMissing fun _nullable(): JsonField<Boolean> = nullable

    /**
     * Returns the raw JSON value of [requiredKeys].
     *
     * Unlike [requiredKeys], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("required_keys")
    @ExcludeMissing
    fun _requiredKeys(): JsonField<List<String>> = requiredKeys

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
        private var description: JsonField<String> = JsonMissing.of()
        private var enum_: JsonField<MutableList<String>>? = null
        private var innerProperties: JsonValue = JsonMissing.of()
        private var innerRequiredKeys: JsonField<MutableList<String>>? = null
        private var innerValType: JsonField<String> = JsonMissing.of()
        private var items: JsonField<ValueSchema> = JsonMissing.of()
        private var nullable: JsonField<Boolean> = JsonMissing.of()
        private var properties: JsonValue = JsonMissing.of()
        private var requiredKeys: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(valueSchema: ValueSchema) = apply {
            valType = valueSchema.valType
            description = valueSchema.description
            enum_ = valueSchema.enum_.map { it.toMutableList() }
            innerProperties = valueSchema.innerProperties
            innerRequiredKeys = valueSchema.innerRequiredKeys.map { it.toMutableList() }
            innerValType = valueSchema.innerValType
            items = valueSchema.items
            nullable = valueSchema.nullable
            properties = valueSchema.properties
            requiredKeys = valueSchema.requiredKeys.map { it.toMutableList() }
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

        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

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

        fun innerProperties(innerProperties: JsonValue) = apply {
            this.innerProperties = innerProperties
        }

        fun innerRequiredKeys(innerRequiredKeys: List<String>) =
            innerRequiredKeys(JsonField.of(innerRequiredKeys))

        /**
         * Sets [Builder.innerRequiredKeys] to an arbitrary JSON value.
         *
         * You should usually call [Builder.innerRequiredKeys] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun innerRequiredKeys(innerRequiredKeys: JsonField<List<String>>) = apply {
            this.innerRequiredKeys = innerRequiredKeys.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [innerRequiredKeys].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addInnerRequiredKey(innerRequiredKey: String) = apply {
            innerRequiredKeys =
                (innerRequiredKeys ?: JsonField.of(mutableListOf())).also {
                    checkKnown("innerRequiredKeys", it).add(innerRequiredKey)
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

        fun items(items: ValueSchema) = items(JsonField.of(items))

        /**
         * Sets [Builder.items] to an arbitrary JSON value.
         *
         * You should usually call [Builder.items] with a well-typed [ValueSchema] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun items(items: JsonField<ValueSchema>) = apply { this.items = items }

        fun nullable(nullable: Boolean) = nullable(JsonField.of(nullable))

        /**
         * Sets [Builder.nullable] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nullable] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun nullable(nullable: JsonField<Boolean>) = apply { this.nullable = nullable }

        fun properties(properties: JsonValue) = apply { this.properties = properties }

        fun requiredKeys(requiredKeys: List<String>) = requiredKeys(JsonField.of(requiredKeys))

        /**
         * Sets [Builder.requiredKeys] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requiredKeys] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun requiredKeys(requiredKeys: JsonField<List<String>>) = apply {
            this.requiredKeys = requiredKeys.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [requiredKeys].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRequiredKey(requiredKey: String) = apply {
            requiredKeys =
                (requiredKeys ?: JsonField.of(mutableListOf())).also {
                    checkKnown("requiredKeys", it).add(requiredKey)
                }
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
                description,
                (enum_ ?: JsonMissing.of()).map { it.toImmutable() },
                innerProperties,
                (innerRequiredKeys ?: JsonMissing.of()).map { it.toImmutable() },
                innerValType,
                items,
                nullable,
                properties,
                (requiredKeys ?: JsonMissing.of()).map { it.toImmutable() },
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
    fun validate(): ValueSchema = apply {
        if (validated) {
            return@apply
        }

        valType()
        description()
        enum_()
        innerRequiredKeys()
        innerValType()
        items().ifPresent { it.validate() }
        nullable()
        requiredKeys()
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
            (if (description.asKnown().isPresent) 1 else 0) +
            (enum_.asKnown().getOrNull()?.size ?: 0) +
            (innerRequiredKeys.asKnown().getOrNull()?.size ?: 0) +
            (if (innerValType.asKnown().isPresent) 1 else 0) +
            (items.asKnown().getOrNull()?.validity() ?: 0) +
            (if (nullable.asKnown().isPresent) 1 else 0) +
            (requiredKeys.asKnown().getOrNull()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ValueSchema &&
            valType == other.valType &&
            description == other.description &&
            enum_ == other.enum_ &&
            innerProperties == other.innerProperties &&
            innerRequiredKeys == other.innerRequiredKeys &&
            innerValType == other.innerValType &&
            items == other.items &&
            nullable == other.nullable &&
            properties == other.properties &&
            requiredKeys == other.requiredKeys &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            valType,
            description,
            enum_,
            innerProperties,
            innerRequiredKeys,
            innerValType,
            items,
            nullable,
            properties,
            requiredKeys,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ValueSchema{valType=$valType, description=$description, enum_=$enum_, innerProperties=$innerProperties, innerRequiredKeys=$innerRequiredKeys, innerValType=$innerValType, items=$items, nullable=$nullable, properties=$properties, requiredKeys=$requiredKeys, additionalProperties=$additionalProperties}"
}
