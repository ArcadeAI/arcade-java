// File generated from our OpenAPI spec by Stainless.

package com.arcade_engine.api.models

import com.arcade_engine.api.core.ExcludeMissing
import com.arcade_engine.api.core.JsonField
import com.arcade_engine.api.core.JsonMissing
import com.arcade_engine.api.core.JsonValue
import com.arcade_engine.api.core.NoAutoDetect
import com.arcade_engine.api.core.immutableEmptyMap
import com.arcade_engine.api.core.toImmutable
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class WorkerHealthResponse
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("enabled")
    @ExcludeMissing
    private val enabled: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("healthy")
    @ExcludeMissing
    private val healthy: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("message")
    @ExcludeMissing
    private val message: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): Optional<String> = Optional.ofNullable(id.getNullable("id"))

    fun enabled(): Optional<Boolean> = Optional.ofNullable(enabled.getNullable("enabled"))

    fun healthy(): Optional<Boolean> = Optional.ofNullable(healthy.getNullable("healthy"))

    fun message(): Optional<String> = Optional.ofNullable(message.getNullable("message"))

    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    @JsonProperty("enabled") @ExcludeMissing fun _enabled(): JsonField<Boolean> = enabled

    @JsonProperty("healthy") @ExcludeMissing fun _healthy(): JsonField<Boolean> = healthy

    @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): WorkerHealthResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        enabled()
        healthy()
        message()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WorkerHealthResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var enabled: JsonField<Boolean> = JsonMissing.of()
        private var healthy: JsonField<Boolean> = JsonMissing.of()
        private var message: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(workerHealthResponse: WorkerHealthResponse) = apply {
            id = workerHealthResponse.id
            enabled = workerHealthResponse.enabled
            healthy = workerHealthResponse.healthy
            message = workerHealthResponse.message
            additionalProperties = workerHealthResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        fun enabled(enabled: Boolean) = enabled(JsonField.of(enabled))

        fun enabled(enabled: JsonField<Boolean>) = apply { this.enabled = enabled }

        fun healthy(healthy: Boolean) = healthy(JsonField.of(healthy))

        fun healthy(healthy: JsonField<Boolean>) = apply { this.healthy = healthy }

        fun message(message: String) = message(JsonField.of(message))

        fun message(message: JsonField<String>) = apply { this.message = message }

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

        fun build(): WorkerHealthResponse =
            WorkerHealthResponse(id, enabled, healthy, message, additionalProperties.toImmutable())
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is WorkerHealthResponse && id == other.id && enabled == other.enabled && healthy == other.healthy && message == other.message && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, enabled, healthy, message, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "WorkerHealthResponse{id=$id, enabled=$enabled, healthy=$healthy, message=$message, additionalProperties=$additionalProperties}"
}
