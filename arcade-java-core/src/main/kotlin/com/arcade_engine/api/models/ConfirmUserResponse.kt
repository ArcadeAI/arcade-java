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
class ConfirmUserResponse
@JsonCreator
private constructor(
    @JsonProperty("auth_id")
    @ExcludeMissing
    private val authId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("next_uri")
    @ExcludeMissing
    private val nextUri: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun authId(): String = authId.getRequired("auth_id")

    fun nextUri(): Optional<String> = Optional.ofNullable(nextUri.getNullable("next_uri"))

    @JsonProperty("auth_id") @ExcludeMissing fun _authId(): JsonField<String> = authId

    @JsonProperty("next_uri") @ExcludeMissing fun _nextUri(): JsonField<String> = nextUri

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ConfirmUserResponse = apply {
        if (validated) {
            return@apply
        }

        authId()
        nextUri()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ConfirmUserResponse]. */
    class Builder internal constructor() {

        private var authId: JsonField<String>? = null
        private var nextUri: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(confirmUserResponse: ConfirmUserResponse) = apply {
            authId = confirmUserResponse.authId
            nextUri = confirmUserResponse.nextUri
            additionalProperties = confirmUserResponse.additionalProperties.toMutableMap()
        }

        fun authId(authId: String) = authId(JsonField.of(authId))

        fun authId(authId: JsonField<String>) = apply { this.authId = authId }

        fun nextUri(nextUri: String) = nextUri(JsonField.of(nextUri))

        fun nextUri(nextUri: JsonField<String>) = apply { this.nextUri = nextUri }

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

        fun build(): ConfirmUserResponse =
            ConfirmUserResponse(
                checkRequired("authId", authId),
                nextUri,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ConfirmUserResponse && authId == other.authId && nextUri == other.nextUri && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(authId, nextUri, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ConfirmUserResponse{authId=$authId, nextUri=$nextUri, additionalProperties=$additionalProperties}"
}
