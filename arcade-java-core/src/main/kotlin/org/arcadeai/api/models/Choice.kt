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
class Choice
@JsonCreator
private constructor(
    @JsonProperty("finish_reason")
    @ExcludeMissing
    private val finishReason: JsonField<String> = JsonMissing.of(),
    @JsonProperty("index") @ExcludeMissing private val index: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("logprobs") @ExcludeMissing private val logprobs: JsonValue = JsonMissing.of(),
    @JsonProperty("message")
    @ExcludeMissing
    private val message: JsonField<ChatMessage> = JsonMissing.of(),
    @JsonProperty("tool_authorizations")
    @ExcludeMissing
    private val toolAuthorizations: JsonField<List<AuthorizationResponse>> = JsonMissing.of(),
    @JsonProperty("tool_messages")
    @ExcludeMissing
    private val toolMessages: JsonField<List<ChatMessage>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun finishReason(): Optional<String> =
        Optional.ofNullable(finishReason.getNullable("finish_reason"))

    fun index(): Optional<Long> = Optional.ofNullable(index.getNullable("index"))

    @JsonProperty("logprobs") @ExcludeMissing fun _logprobs(): JsonValue = logprobs

    fun message(): Optional<ChatMessage> = Optional.ofNullable(message.getNullable("message"))

    fun toolAuthorizations(): Optional<List<AuthorizationResponse>> =
        Optional.ofNullable(toolAuthorizations.getNullable("tool_authorizations"))

    fun toolMessages(): Optional<List<ChatMessage>> =
        Optional.ofNullable(toolMessages.getNullable("tool_messages"))

    @JsonProperty("finish_reason")
    @ExcludeMissing
    fun _finishReason(): JsonField<String> = finishReason

    @JsonProperty("index") @ExcludeMissing fun _index(): JsonField<Long> = index

    @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<ChatMessage> = message

    @JsonProperty("tool_authorizations")
    @ExcludeMissing
    fun _toolAuthorizations(): JsonField<List<AuthorizationResponse>> = toolAuthorizations

    @JsonProperty("tool_messages")
    @ExcludeMissing
    fun _toolMessages(): JsonField<List<ChatMessage>> = toolMessages

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Choice = apply {
        if (validated) {
            return@apply
        }

        finishReason()
        index()
        message().ifPresent { it.validate() }
        toolAuthorizations().ifPresent { it.forEach { it.validate() } }
        toolMessages().ifPresent { it.forEach { it.validate() } }
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Choice]. */
    class Builder internal constructor() {

        private var finishReason: JsonField<String> = JsonMissing.of()
        private var index: JsonField<Long> = JsonMissing.of()
        private var logprobs: JsonValue = JsonMissing.of()
        private var message: JsonField<ChatMessage> = JsonMissing.of()
        private var toolAuthorizations: JsonField<MutableList<AuthorizationResponse>>? = null
        private var toolMessages: JsonField<MutableList<ChatMessage>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(choice: Choice) = apply {
            finishReason = choice.finishReason
            index = choice.index
            logprobs = choice.logprobs
            message = choice.message
            toolAuthorizations = choice.toolAuthorizations.map { it.toMutableList() }
            toolMessages = choice.toolMessages.map { it.toMutableList() }
            additionalProperties = choice.additionalProperties.toMutableMap()
        }

        fun finishReason(finishReason: String) = finishReason(JsonField.of(finishReason))

        fun finishReason(finishReason: JsonField<String>) = apply {
            this.finishReason = finishReason
        }

        fun index(index: Long) = index(JsonField.of(index))

        fun index(index: JsonField<Long>) = apply { this.index = index }

        fun logprobs(logprobs: JsonValue) = apply { this.logprobs = logprobs }

        fun message(message: ChatMessage) = message(JsonField.of(message))

        fun message(message: JsonField<ChatMessage>) = apply { this.message = message }

        fun toolAuthorizations(toolAuthorizations: List<AuthorizationResponse>) =
            toolAuthorizations(JsonField.of(toolAuthorizations))

        fun toolAuthorizations(toolAuthorizations: JsonField<List<AuthorizationResponse>>) = apply {
            this.toolAuthorizations = toolAuthorizations.map { it.toMutableList() }
        }

        fun addToolAuthorization(toolAuthorization: AuthorizationResponse) = apply {
            toolAuthorizations =
                (toolAuthorizations ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(toolAuthorization)
                }
        }

        fun toolMessages(toolMessages: List<ChatMessage>) = toolMessages(JsonField.of(toolMessages))

        fun toolMessages(toolMessages: JsonField<List<ChatMessage>>) = apply {
            this.toolMessages = toolMessages.map { it.toMutableList() }
        }

        fun addToolMessage(toolMessage: ChatMessage) = apply {
            toolMessages =
                (toolMessages ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(toolMessage)
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

        fun build(): Choice =
            Choice(
                finishReason,
                index,
                logprobs,
                message,
                (toolAuthorizations ?: JsonMissing.of()).map { it.toImmutable() },
                (toolMessages ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Choice && finishReason == other.finishReason && index == other.index && logprobs == other.logprobs && message == other.message && toolAuthorizations == other.toolAuthorizations && toolMessages == other.toolMessages && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(finishReason, index, logprobs, message, toolAuthorizations, toolMessages, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Choice{finishReason=$finishReason, index=$index, logprobs=$logprobs, message=$message, toolAuthorizations=$toolAuthorizations, toolMessages=$toolMessages, additionalProperties=$additionalProperties}"
}
