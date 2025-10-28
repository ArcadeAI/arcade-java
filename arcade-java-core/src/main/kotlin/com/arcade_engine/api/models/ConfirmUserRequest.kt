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

@NoAutoDetect
class ConfirmUserRequest
@JsonCreator
private constructor(
    @JsonProperty("flow_id")
    @ExcludeMissing
    private val flowId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("user_id")
    @ExcludeMissing
    private val userId: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun flowId(): String = flowId.getRequired("flow_id")

    fun userId(): String = userId.getRequired("user_id")

    @JsonProperty("flow_id") @ExcludeMissing fun _flowId(): JsonField<String> = flowId

    @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ConfirmUserRequest = apply {
        if (validated) {
            return@apply
        }

        flowId()
        userId()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

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

        fun flowId(flowId: JsonField<String>) = apply { this.flowId = flowId }

        fun userId(userId: String) = userId(JsonField.of(userId))

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

        fun build(): ConfirmUserRequest =
            ConfirmUserRequest(
                checkRequired("flowId", flowId),
                checkRequired("userId", userId),
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ConfirmUserRequest && flowId == other.flowId && userId == other.userId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(flowId, userId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ConfirmUserRequest{flowId=$flowId, userId=$userId, additionalProperties=$additionalProperties}"
}
