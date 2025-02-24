// File generated from our OpenAPI spec by Stainless.

package org.arcadeai.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Objects
import java.util.Optional
import org.arcadeai.api.core.ExcludeMissing
import org.arcadeai.api.core.JsonField
import org.arcadeai.api.core.JsonMissing
import org.arcadeai.api.core.JsonValue
import org.arcadeai.api.core.NoAutoDetect
import org.arcadeai.api.core.immutableEmptyMap
import org.arcadeai.api.core.toImmutable

@NoAutoDetect
class ChatResponse
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("choices")
    @ExcludeMissing
    private val choices: JsonField<List<Choice>> = JsonMissing.of(),
    @JsonProperty("created")
    @ExcludeMissing
    private val created: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("model") @ExcludeMissing private val model: JsonField<String> = JsonMissing.of(),
    @JsonProperty("object")
    @ExcludeMissing
    private val object_: JsonField<String> = JsonMissing.of(),
    @JsonProperty("system_fingerprint")
    @ExcludeMissing
    private val systemFingerprint: JsonField<String> = JsonMissing.of(),
    @JsonProperty("usage") @ExcludeMissing private val usage: JsonField<Usage> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): Optional<String> = Optional.ofNullable(id.getNullable("id"))

    fun choices(): Optional<List<Choice>> = Optional.ofNullable(choices.getNullable("choices"))

    fun created(): Optional<Long> = Optional.ofNullable(created.getNullable("created"))

    fun model(): Optional<String> = Optional.ofNullable(model.getNullable("model"))

    fun object_(): Optional<String> = Optional.ofNullable(object_.getNullable("object"))

    fun systemFingerprint(): Optional<String> =
        Optional.ofNullable(systemFingerprint.getNullable("system_fingerprint"))

    fun usage(): Optional<Usage> = Optional.ofNullable(usage.getNullable("usage"))

    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    @JsonProperty("choices") @ExcludeMissing fun _choices(): JsonField<List<Choice>> = choices

    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<Long> = created

    @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

    @JsonProperty("object") @ExcludeMissing fun _object_(): JsonField<String> = object_

    @JsonProperty("system_fingerprint")
    @ExcludeMissing
    fun _systemFingerprint(): JsonField<String> = systemFingerprint

    @JsonProperty("usage") @ExcludeMissing fun _usage(): JsonField<Usage> = usage

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ChatResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        choices().ifPresent { it.forEach { it.validate() } }
        created()
        model()
        object_()
        systemFingerprint()
        usage().ifPresent { it.validate() }
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ChatResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var choices: JsonField<MutableList<Choice>>? = null
        private var created: JsonField<Long> = JsonMissing.of()
        private var model: JsonField<String> = JsonMissing.of()
        private var object_: JsonField<String> = JsonMissing.of()
        private var systemFingerprint: JsonField<String> = JsonMissing.of()
        private var usage: JsonField<Usage> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(chatResponse: ChatResponse) = apply {
            id = chatResponse.id
            choices = chatResponse.choices.map { it.toMutableList() }
            created = chatResponse.created
            model = chatResponse.model
            object_ = chatResponse.object_
            systemFingerprint = chatResponse.systemFingerprint
            usage = chatResponse.usage
            additionalProperties = chatResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        fun choices(choices: List<Choice>) = choices(JsonField.of(choices))

        fun choices(choices: JsonField<List<Choice>>) = apply {
            this.choices = choices.map { it.toMutableList() }
        }

        fun addChoice(choice: Choice) = apply {
            choices =
                (choices ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(choice)
                }
        }

        fun created(created: Long) = created(JsonField.of(created))

        fun created(created: JsonField<Long>) = apply { this.created = created }

        fun model(model: String) = model(JsonField.of(model))

        fun model(model: JsonField<String>) = apply { this.model = model }

        fun object_(object_: String) = object_(JsonField.of(object_))

        fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

        fun systemFingerprint(systemFingerprint: String) =
            systemFingerprint(JsonField.of(systemFingerprint))

        fun systemFingerprint(systemFingerprint: JsonField<String>) = apply {
            this.systemFingerprint = systemFingerprint
        }

        fun usage(usage: Usage) = usage(JsonField.of(usage))

        fun usage(usage: JsonField<Usage>) = apply { this.usage = usage }

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

        fun build(): ChatResponse =
            ChatResponse(
                id,
                (choices ?: JsonMissing.of()).map { it.toImmutable() },
                created,
                model,
                object_,
                systemFingerprint,
                usage,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ChatResponse && id == other.id && choices == other.choices && created == other.created && model == other.model && object_ == other.object_ && systemFingerprint == other.systemFingerprint && usage == other.usage && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, choices, created, model, object_, systemFingerprint, usage, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ChatResponse{id=$id, choices=$choices, created=$created, model=$model, object_=$object_, systemFingerprint=$systemFingerprint, usage=$usage, additionalProperties=$additionalProperties}"
}
