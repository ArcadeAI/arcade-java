// File generated from our OpenAPI spec by Stainless.

package dev.arcade.errors

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import dev.arcade.core.ExcludeMissing
import dev.arcade.core.JsonValue
import dev.arcade.core.NoAutoDetect
import dev.arcade.core.immutableEmptyMap
import dev.arcade.core.toImmutable
import java.util.Objects

@NoAutoDetect
class ArcadeError
@JsonCreator
private constructor(
    @JsonAnyGetter
    @ExcludeMissing
    @JsonAnySetter
    @get:JvmName("additionalProperties")
    val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
) {

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ArcadeError]. */
    class Builder internal constructor() {

        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(arcadeError: ArcadeError) = apply {
            additionalProperties = arcadeError.additionalProperties.toMutableMap()
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

        fun build(): ArcadeError = ArcadeError(additionalProperties.toImmutable())
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ArcadeError && additionalProperties == other.additionalProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */

    override fun toString() = "ArcadeError{additionalProperties=$additionalProperties}"
}
