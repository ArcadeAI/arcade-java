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
class Error
@JsonCreator
private constructor(
    @JsonProperty("message")
    @ExcludeMissing
    private val message: JsonField<String> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun message(): Optional<String> = Optional.ofNullable(message.getNullable("message"))

    fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

    @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Error = apply {
        if (validated) {
            return@apply
        }

        message()
        name()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Error]. */
    class Builder internal constructor() {

        private var message: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(error: Error) = apply {
            message = error.message
            name = error.name
            additionalProperties = error.additionalProperties.toMutableMap()
        }

        fun message(message: String) = message(JsonField.of(message))

        fun message(message: JsonField<String>) = apply { this.message = message }

        fun name(name: String) = name(JsonField.of(name))

        fun name(name: JsonField<String>) = apply { this.name = name }

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

        fun build(): Error = Error(message, name, additionalProperties.toImmutable())
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Error && message == other.message && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(message, name, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Error{message=$message, name=$name, additionalProperties=$additionalProperties}"
}
