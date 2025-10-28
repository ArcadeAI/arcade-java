// File generated from our OpenAPI spec by Stainless.

package com.arcade_engine.api.models

import com.arcade_engine.api.core.ExcludeMissing
import com.arcade_engine.api.core.JsonField
import com.arcade_engine.api.core.JsonMissing
import com.arcade_engine.api.core.JsonValue
import com.arcade_engine.api.core.NoAutoDetect
import com.arcade_engine.api.core.checkRequired
import com.arcade_engine.api.core.immutableEmptyMap
import com.arcade_engine.api.core.toImmutable
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class ValueSchema
@JsonCreator
private constructor(
    @JsonProperty("val_type")
    @ExcludeMissing
    private val valType: JsonField<String> = JsonMissing.of(),
    @JsonProperty("enum")
    @ExcludeMissing
    private val enum_: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("inner_val_type")
    @ExcludeMissing
    private val innerValType: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun valType(): String = valType.getRequired("val_type")

    fun enum_(): Optional<List<String>> = Optional.ofNullable(enum_.getNullable("enum"))

    fun innerValType(): Optional<String> =
        Optional.ofNullable(innerValType.getNullable("inner_val_type"))

    @JsonProperty("val_type") @ExcludeMissing fun _valType(): JsonField<String> = valType

    @JsonProperty("enum") @ExcludeMissing fun _enum_(): JsonField<List<String>> = enum_

    @JsonProperty("inner_val_type")
    @ExcludeMissing
    fun _innerValType(): JsonField<String> = innerValType

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

    fun toBuilder() = Builder().from(this)

    companion object {

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

        fun valType(valType: JsonField<String>) = apply { this.valType = valType }

        fun enum_(enum_: List<String>) = enum_(JsonField.of(enum_))

        fun enum_(enum_: JsonField<List<String>>) = apply {
            this.enum_ = enum_.map { it.toMutableList() }
        }

        fun addEnum(enum_: String) = apply {
            this.enum_ =
                (this.enum_ ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(enum_)
                }
        }

        fun innerValType(innerValType: String) = innerValType(JsonField.of(innerValType))

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

        fun build(): ValueSchema =
            ValueSchema(
                checkRequired("valType", valType),
                (enum_ ?: JsonMissing.of()).map { it.toImmutable() },
                innerValType,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ValueSchema && valType == other.valType && enum_ == other.enum_ && innerValType == other.innerValType && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(valType, enum_, innerValType, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ValueSchema{valType=$valType, enum_=$enum_, innerValType=$innerValType, additionalProperties=$additionalProperties}"
}
