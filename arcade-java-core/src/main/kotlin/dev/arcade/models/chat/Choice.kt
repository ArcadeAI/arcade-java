// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models.chat

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.arcade.core.ExcludeMissing
import dev.arcade.core.JsonField
import dev.arcade.core.JsonMissing
import dev.arcade.core.JsonValue
import dev.arcade.core.checkKnown
import dev.arcade.core.toImmutable
import dev.arcade.errors.ArcadeInvalidDataException
import dev.arcade.models.AuthorizationResponse
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class Choice
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val finishReason: JsonField<String>,
    private val index: JsonField<Long>,
    private val logprobs: JsonValue,
    private val message: JsonField<ChatMessage>,
    private val toolAuthorizations: JsonField<List<AuthorizationResponse>>,
    private val toolMessages: JsonField<List<ChatMessage>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("finish_reason")
        @ExcludeMissing
        finishReason: JsonField<String> = JsonMissing.of(),
        @JsonProperty("index") @ExcludeMissing index: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("logprobs") @ExcludeMissing logprobs: JsonValue = JsonMissing.of(),
        @JsonProperty("message") @ExcludeMissing message: JsonField<ChatMessage> = JsonMissing.of(),
        @JsonProperty("tool_authorizations")
        @ExcludeMissing
        toolAuthorizations: JsonField<List<AuthorizationResponse>> = JsonMissing.of(),
        @JsonProperty("tool_messages")
        @ExcludeMissing
        toolMessages: JsonField<List<ChatMessage>> = JsonMissing.of(),
    ) : this(
        finishReason,
        index,
        logprobs,
        message,
        toolAuthorizations,
        toolMessages,
        mutableMapOf(),
    )

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun finishReason(): Optional<String> = finishReason.getOptional("finish_reason")

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun index(): Optional<Long> = index.getOptional("index")

    /**
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = choice.logprobs().convert(MyClass.class);
     * ```
     */
    @JsonProperty("logprobs") @ExcludeMissing fun _logprobs(): JsonValue = logprobs

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun message(): Optional<ChatMessage> = message.getOptional("message")

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun toolAuthorizations(): Optional<List<AuthorizationResponse>> =
        toolAuthorizations.getOptional("tool_authorizations")

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun toolMessages(): Optional<List<ChatMessage>> = toolMessages.getOptional("tool_messages")

    /**
     * Returns the raw JSON value of [finishReason].
     *
     * Unlike [finishReason], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("finish_reason")
    @ExcludeMissing
    fun _finishReason(): JsonField<String> = finishReason

    /**
     * Returns the raw JSON value of [index].
     *
     * Unlike [index], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("index") @ExcludeMissing fun _index(): JsonField<Long> = index

    /**
     * Returns the raw JSON value of [message].
     *
     * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<ChatMessage> = message

    /**
     * Returns the raw JSON value of [toolAuthorizations].
     *
     * Unlike [toolAuthorizations], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("tool_authorizations")
    @ExcludeMissing
    fun _toolAuthorizations(): JsonField<List<AuthorizationResponse>> = toolAuthorizations

    /**
     * Returns the raw JSON value of [toolMessages].
     *
     * Unlike [toolMessages], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tool_messages")
    @ExcludeMissing
    fun _toolMessages(): JsonField<List<ChatMessage>> = toolMessages

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

        /** Returns a mutable builder for constructing an instance of [Choice]. */
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

        /**
         * Sets [Builder.finishReason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.finishReason] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun finishReason(finishReason: JsonField<String>) = apply {
            this.finishReason = finishReason
        }

        fun index(index: Long) = index(JsonField.of(index))

        /**
         * Sets [Builder.index] to an arbitrary JSON value.
         *
         * You should usually call [Builder.index] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun index(index: JsonField<Long>) = apply { this.index = index }

        fun logprobs(logprobs: JsonValue) = apply { this.logprobs = logprobs }

        fun message(message: ChatMessage) = message(JsonField.of(message))

        /**
         * Sets [Builder.message] to an arbitrary JSON value.
         *
         * You should usually call [Builder.message] with a well-typed [ChatMessage] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun message(message: JsonField<ChatMessage>) = apply { this.message = message }

        fun toolAuthorizations(toolAuthorizations: List<AuthorizationResponse>) =
            toolAuthorizations(JsonField.of(toolAuthorizations))

        /**
         * Sets [Builder.toolAuthorizations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.toolAuthorizations] with a well-typed
         * `List<AuthorizationResponse>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun toolAuthorizations(toolAuthorizations: JsonField<List<AuthorizationResponse>>) = apply {
            this.toolAuthorizations = toolAuthorizations.map { it.toMutableList() }
        }

        /**
         * Adds a single [AuthorizationResponse] to [toolAuthorizations].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addToolAuthorization(toolAuthorization: AuthorizationResponse) = apply {
            toolAuthorizations =
                (toolAuthorizations ?: JsonField.of(mutableListOf())).also {
                    checkKnown("toolAuthorizations", it).add(toolAuthorization)
                }
        }

        fun toolMessages(toolMessages: List<ChatMessage>) = toolMessages(JsonField.of(toolMessages))

        /**
         * Sets [Builder.toolMessages] to an arbitrary JSON value.
         *
         * You should usually call [Builder.toolMessages] with a well-typed `List<ChatMessage>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun toolMessages(toolMessages: JsonField<List<ChatMessage>>) = apply {
            this.toolMessages = toolMessages.map { it.toMutableList() }
        }

        /**
         * Adds a single [ChatMessage] to [toolMessages].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addToolMessage(toolMessage: ChatMessage) = apply {
            toolMessages =
                (toolMessages ?: JsonField.of(mutableListOf())).also {
                    checkKnown("toolMessages", it).add(toolMessage)
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
         * Returns an immutable instance of [Choice].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): Choice =
            Choice(
                finishReason,
                index,
                logprobs,
                message,
                (toolAuthorizations ?: JsonMissing.of()).map { it.toImmutable() },
                (toolMessages ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

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
        (if (finishReason.asKnown().isPresent) 1 else 0) +
            (if (index.asKnown().isPresent) 1 else 0) +
            (message.asKnown().getOrNull()?.validity() ?: 0) +
            (toolAuthorizations.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (toolMessages.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Choice &&
            finishReason == other.finishReason &&
            index == other.index &&
            logprobs == other.logprobs &&
            message == other.message &&
            toolAuthorizations == other.toolAuthorizations &&
            toolMessages == other.toolMessages &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            finishReason,
            index,
            logprobs,
            message,
            toolAuthorizations,
            toolMessages,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Choice{finishReason=$finishReason, index=$index, logprobs=$logprobs, message=$message, toolAuthorizations=$toolAuthorizations, toolMessages=$toolMessages, additionalProperties=$additionalProperties}"
}
