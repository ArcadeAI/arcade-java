// File generated from our OpenAPI spec by Stainless.

package org.arcadeai.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Objects
import java.util.Optional
import org.arcadeai.api.core.Enum
import org.arcadeai.api.core.ExcludeMissing
import org.arcadeai.api.core.JsonField
import org.arcadeai.api.core.JsonMissing
import org.arcadeai.api.core.JsonValue
import org.arcadeai.api.core.NoAutoDetect
import org.arcadeai.api.core.immutableEmptyMap
import org.arcadeai.api.core.toImmutable
import org.arcadeai.api.errors.ArcadeInvalidDataException

@NoAutoDetect
class ChatRequest
@JsonCreator
private constructor(
    @JsonProperty("frequency_penalty")
    @ExcludeMissing
    private val frequencyPenalty: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("logit_bias")
    @ExcludeMissing
    private val logitBias: JsonField<LogitBias> = JsonMissing.of(),
    @JsonProperty("logprobs")
    @ExcludeMissing
    private val logprobs: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("max_tokens")
    @ExcludeMissing
    private val maxTokens: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("messages")
    @ExcludeMissing
    private val messages: JsonField<List<ChatMessage>> = JsonMissing.of(),
    @JsonProperty("model") @ExcludeMissing private val model: JsonField<String> = JsonMissing.of(),
    @JsonProperty("n") @ExcludeMissing private val n: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("parallel_tool_calls")
    @ExcludeMissing
    private val parallelToolCalls: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("presence_penalty")
    @ExcludeMissing
    private val presencePenalty: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("response_format")
    @ExcludeMissing
    private val responseFormat: JsonField<ResponseFormat> = JsonMissing.of(),
    @JsonProperty("seed") @ExcludeMissing private val seed: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("stop")
    @ExcludeMissing
    private val stop: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("stream")
    @ExcludeMissing
    private val stream: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("stream_options")
    @ExcludeMissing
    private val streamOptions: JsonField<StreamOptions> = JsonMissing.of(),
    @JsonProperty("temperature")
    @ExcludeMissing
    private val temperature: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("tool_choice")
    @ExcludeMissing
    private val toolChoice: JsonValue = JsonMissing.of(),
    @JsonProperty("tools") @ExcludeMissing private val tools: JsonValue = JsonMissing.of(),
    @JsonProperty("top_logprobs")
    @ExcludeMissing
    private val topLogprobs: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("top_p") @ExcludeMissing private val topP: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("user") @ExcludeMissing private val user: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun frequencyPenalty(): Optional<Double> =
        Optional.ofNullable(frequencyPenalty.getNullable("frequency_penalty"))

    /**
     * LogitBias is must be a token id string (specified by their token ID in the tokenizer), not a
     * word string. incorrect: `"logit_bias":{"You": 6}`, correct: `"logit_bias":{"1639": 6}` refs:
     * https://platform.openai.com/docs/api-reference/chat/create#chat/create-logit_bias
     */
    fun logitBias(): Optional<LogitBias> = Optional.ofNullable(logitBias.getNullable("logit_bias"))

    /**
     * LogProbs indicates whether to return log probabilities of the output tokens or not. If true,
     * returns the log probabilities of each output token returned in the content of message. This
     * option is currently not available on the gpt-4-vision-preview model.
     */
    fun logprobs(): Optional<Boolean> = Optional.ofNullable(logprobs.getNullable("logprobs"))

    fun maxTokens(): Optional<Long> = Optional.ofNullable(maxTokens.getNullable("max_tokens"))

    fun messages(): Optional<List<ChatMessage>> =
        Optional.ofNullable(messages.getNullable("messages"))

    fun model(): Optional<String> = Optional.ofNullable(model.getNullable("model"))

    fun n(): Optional<Long> = Optional.ofNullable(n.getNullable("n"))

    /** Disable the default behavior of parallel tool calls by setting it: false. */
    fun parallelToolCalls(): Optional<Boolean> =
        Optional.ofNullable(parallelToolCalls.getNullable("parallel_tool_calls"))

    fun presencePenalty(): Optional<Double> =
        Optional.ofNullable(presencePenalty.getNullable("presence_penalty"))

    fun responseFormat(): Optional<ResponseFormat> =
        Optional.ofNullable(responseFormat.getNullable("response_format"))

    fun seed(): Optional<Long> = Optional.ofNullable(seed.getNullable("seed"))

    fun stop(): Optional<List<String>> = Optional.ofNullable(stop.getNullable("stop"))

    fun stream(): Optional<Boolean> = Optional.ofNullable(stream.getNullable("stream"))

    /** Options for streaming response. Only set this when you set stream: true. */
    fun streamOptions(): Optional<StreamOptions> =
        Optional.ofNullable(streamOptions.getNullable("stream_options"))

    fun temperature(): Optional<Double> =
        Optional.ofNullable(temperature.getNullable("temperature"))

    /** This can be either a string or an ToolChoice object. */
    @JsonProperty("tool_choice") @ExcludeMissing fun _toolChoice(): JsonValue = toolChoice

    @JsonProperty("tools") @ExcludeMissing fun _tools(): JsonValue = tools

    /**
     * TopLogProbs is an integer between 0 and 5 specifying the number of most likely tokens to
     * return at each token position, each with an associated log probability. logprobs must be set
     * to true if this parameter is used.
     */
    fun topLogprobs(): Optional<Long> = Optional.ofNullable(topLogprobs.getNullable("top_logprobs"))

    fun topP(): Optional<Double> = Optional.ofNullable(topP.getNullable("top_p"))

    fun user(): Optional<String> = Optional.ofNullable(user.getNullable("user"))

    @JsonProperty("frequency_penalty")
    @ExcludeMissing
    fun _frequencyPenalty(): JsonField<Double> = frequencyPenalty

    /**
     * LogitBias is must be a token id string (specified by their token ID in the tokenizer), not a
     * word string. incorrect: `"logit_bias":{"You": 6}`, correct: `"logit_bias":{"1639": 6}` refs:
     * https://platform.openai.com/docs/api-reference/chat/create#chat/create-logit_bias
     */
    @JsonProperty("logit_bias") @ExcludeMissing fun _logitBias(): JsonField<LogitBias> = logitBias

    /**
     * LogProbs indicates whether to return log probabilities of the output tokens or not. If true,
     * returns the log probabilities of each output token returned in the content of message. This
     * option is currently not available on the gpt-4-vision-preview model.
     */
    @JsonProperty("logprobs") @ExcludeMissing fun _logprobs(): JsonField<Boolean> = logprobs

    @JsonProperty("max_tokens") @ExcludeMissing fun _maxTokens(): JsonField<Long> = maxTokens

    @JsonProperty("messages")
    @ExcludeMissing
    fun _messages(): JsonField<List<ChatMessage>> = messages

    @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

    @JsonProperty("n") @ExcludeMissing fun _n(): JsonField<Long> = n

    /** Disable the default behavior of parallel tool calls by setting it: false. */
    @JsonProperty("parallel_tool_calls")
    @ExcludeMissing
    fun _parallelToolCalls(): JsonField<Boolean> = parallelToolCalls

    @JsonProperty("presence_penalty")
    @ExcludeMissing
    fun _presencePenalty(): JsonField<Double> = presencePenalty

    @JsonProperty("response_format")
    @ExcludeMissing
    fun _responseFormat(): JsonField<ResponseFormat> = responseFormat

    @JsonProperty("seed") @ExcludeMissing fun _seed(): JsonField<Long> = seed

    @JsonProperty("stop") @ExcludeMissing fun _stop(): JsonField<List<String>> = stop

    @JsonProperty("stream") @ExcludeMissing fun _stream(): JsonField<Boolean> = stream

    /** Options for streaming response. Only set this when you set stream: true. */
    @JsonProperty("stream_options")
    @ExcludeMissing
    fun _streamOptions(): JsonField<StreamOptions> = streamOptions

    @JsonProperty("temperature") @ExcludeMissing fun _temperature(): JsonField<Double> = temperature

    /**
     * TopLogProbs is an integer between 0 and 5 specifying the number of most likely tokens to
     * return at each token position, each with an associated log probability. logprobs must be set
     * to true if this parameter is used.
     */
    @JsonProperty("top_logprobs") @ExcludeMissing fun _topLogprobs(): JsonField<Long> = topLogprobs

    @JsonProperty("top_p") @ExcludeMissing fun _topP(): JsonField<Double> = topP

    @JsonProperty("user") @ExcludeMissing fun _user(): JsonField<String> = user

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ChatRequest = apply {
        if (validated) {
            return@apply
        }

        frequencyPenalty()
        logitBias().ifPresent { it.validate() }
        logprobs()
        maxTokens()
        messages().ifPresent { it.forEach { it.validate() } }
        model()
        n()
        parallelToolCalls()
        presencePenalty()
        responseFormat().ifPresent { it.validate() }
        seed()
        stop()
        stream()
        streamOptions().ifPresent { it.validate() }
        temperature()
        topLogprobs()
        topP()
        user()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ChatRequest]. */
    class Builder internal constructor() {

        private var frequencyPenalty: JsonField<Double> = JsonMissing.of()
        private var logitBias: JsonField<LogitBias> = JsonMissing.of()
        private var logprobs: JsonField<Boolean> = JsonMissing.of()
        private var maxTokens: JsonField<Long> = JsonMissing.of()
        private var messages: JsonField<MutableList<ChatMessage>>? = null
        private var model: JsonField<String> = JsonMissing.of()
        private var n: JsonField<Long> = JsonMissing.of()
        private var parallelToolCalls: JsonField<Boolean> = JsonMissing.of()
        private var presencePenalty: JsonField<Double> = JsonMissing.of()
        private var responseFormat: JsonField<ResponseFormat> = JsonMissing.of()
        private var seed: JsonField<Long> = JsonMissing.of()
        private var stop: JsonField<MutableList<String>>? = null
        private var stream: JsonField<Boolean> = JsonMissing.of()
        private var streamOptions: JsonField<StreamOptions> = JsonMissing.of()
        private var temperature: JsonField<Double> = JsonMissing.of()
        private var toolChoice: JsonValue = JsonMissing.of()
        private var tools: JsonValue = JsonMissing.of()
        private var topLogprobs: JsonField<Long> = JsonMissing.of()
        private var topP: JsonField<Double> = JsonMissing.of()
        private var user: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(chatRequest: ChatRequest) = apply {
            frequencyPenalty = chatRequest.frequencyPenalty
            logitBias = chatRequest.logitBias
            logprobs = chatRequest.logprobs
            maxTokens = chatRequest.maxTokens
            messages = chatRequest.messages.map { it.toMutableList() }
            model = chatRequest.model
            n = chatRequest.n
            parallelToolCalls = chatRequest.parallelToolCalls
            presencePenalty = chatRequest.presencePenalty
            responseFormat = chatRequest.responseFormat
            seed = chatRequest.seed
            stop = chatRequest.stop.map { it.toMutableList() }
            stream = chatRequest.stream
            streamOptions = chatRequest.streamOptions
            temperature = chatRequest.temperature
            toolChoice = chatRequest.toolChoice
            tools = chatRequest.tools
            topLogprobs = chatRequest.topLogprobs
            topP = chatRequest.topP
            user = chatRequest.user
            additionalProperties = chatRequest.additionalProperties.toMutableMap()
        }

        fun frequencyPenalty(frequencyPenalty: Double) =
            frequencyPenalty(JsonField.of(frequencyPenalty))

        fun frequencyPenalty(frequencyPenalty: JsonField<Double>) = apply {
            this.frequencyPenalty = frequencyPenalty
        }

        /**
         * LogitBias is must be a token id string (specified by their token ID in the tokenizer),
         * not a word string. incorrect: `"logit_bias":{"You": 6}`, correct: `"logit_bias":{"1639":
         * 6}` refs:
         * https://platform.openai.com/docs/api-reference/chat/create#chat/create-logit_bias
         */
        fun logitBias(logitBias: LogitBias) = logitBias(JsonField.of(logitBias))

        /**
         * LogitBias is must be a token id string (specified by their token ID in the tokenizer),
         * not a word string. incorrect: `"logit_bias":{"You": 6}`, correct: `"logit_bias":{"1639":
         * 6}` refs:
         * https://platform.openai.com/docs/api-reference/chat/create#chat/create-logit_bias
         */
        fun logitBias(logitBias: JsonField<LogitBias>) = apply { this.logitBias = logitBias }

        /**
         * LogProbs indicates whether to return log probabilities of the output tokens or not. If
         * true, returns the log probabilities of each output token returned in the content of
         * message. This option is currently not available on the gpt-4-vision-preview model.
         */
        fun logprobs(logprobs: Boolean) = logprobs(JsonField.of(logprobs))

        /**
         * LogProbs indicates whether to return log probabilities of the output tokens or not. If
         * true, returns the log probabilities of each output token returned in the content of
         * message. This option is currently not available on the gpt-4-vision-preview model.
         */
        fun logprobs(logprobs: JsonField<Boolean>) = apply { this.logprobs = logprobs }

        fun maxTokens(maxTokens: Long) = maxTokens(JsonField.of(maxTokens))

        fun maxTokens(maxTokens: JsonField<Long>) = apply { this.maxTokens = maxTokens }

        fun messages(messages: List<ChatMessage>) = messages(JsonField.of(messages))

        fun messages(messages: JsonField<List<ChatMessage>>) = apply {
            this.messages = messages.map { it.toMutableList() }
        }

        fun addMessage(message: ChatMessage) = apply {
            messages =
                (messages ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(message)
                }
        }

        fun model(model: String) = model(JsonField.of(model))

        fun model(model: JsonField<String>) = apply { this.model = model }

        fun n(n: Long) = n(JsonField.of(n))

        fun n(n: JsonField<Long>) = apply { this.n = n }

        /** Disable the default behavior of parallel tool calls by setting it: false. */
        fun parallelToolCalls(parallelToolCalls: Boolean) =
            parallelToolCalls(JsonField.of(parallelToolCalls))

        /** Disable the default behavior of parallel tool calls by setting it: false. */
        fun parallelToolCalls(parallelToolCalls: JsonField<Boolean>) = apply {
            this.parallelToolCalls = parallelToolCalls
        }

        fun presencePenalty(presencePenalty: Double) =
            presencePenalty(JsonField.of(presencePenalty))

        fun presencePenalty(presencePenalty: JsonField<Double>) = apply {
            this.presencePenalty = presencePenalty
        }

        fun responseFormat(responseFormat: ResponseFormat) =
            responseFormat(JsonField.of(responseFormat))

        fun responseFormat(responseFormat: JsonField<ResponseFormat>) = apply {
            this.responseFormat = responseFormat
        }

        fun seed(seed: Long) = seed(JsonField.of(seed))

        fun seed(seed: JsonField<Long>) = apply { this.seed = seed }

        fun stop(stop: List<String>) = stop(JsonField.of(stop))

        fun stop(stop: JsonField<List<String>>) = apply {
            this.stop = stop.map { it.toMutableList() }
        }

        fun addStop(stop: String) = apply {
            this.stop =
                (this.stop ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(stop)
                }
        }

        fun stream(stream: Boolean) = stream(JsonField.of(stream))

        fun stream(stream: JsonField<Boolean>) = apply { this.stream = stream }

        /** Options for streaming response. Only set this when you set stream: true. */
        fun streamOptions(streamOptions: StreamOptions) = streamOptions(JsonField.of(streamOptions))

        /** Options for streaming response. Only set this when you set stream: true. */
        fun streamOptions(streamOptions: JsonField<StreamOptions>) = apply {
            this.streamOptions = streamOptions
        }

        fun temperature(temperature: Double) = temperature(JsonField.of(temperature))

        fun temperature(temperature: JsonField<Double>) = apply { this.temperature = temperature }

        /** This can be either a string or an ToolChoice object. */
        fun toolChoice(toolChoice: JsonValue) = apply { this.toolChoice = toolChoice }

        fun tools(tools: JsonValue) = apply { this.tools = tools }

        /**
         * TopLogProbs is an integer between 0 and 5 specifying the number of most likely tokens to
         * return at each token position, each with an associated log probability. logprobs must be
         * set to true if this parameter is used.
         */
        fun topLogprobs(topLogprobs: Long) = topLogprobs(JsonField.of(topLogprobs))

        /**
         * TopLogProbs is an integer between 0 and 5 specifying the number of most likely tokens to
         * return at each token position, each with an associated log probability. logprobs must be
         * set to true if this parameter is used.
         */
        fun topLogprobs(topLogprobs: JsonField<Long>) = apply { this.topLogprobs = topLogprobs }

        fun topP(topP: Double) = topP(JsonField.of(topP))

        fun topP(topP: JsonField<Double>) = apply { this.topP = topP }

        fun user(user: String) = user(JsonField.of(user))

        fun user(user: JsonField<String>) = apply { this.user = user }

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

        fun build(): ChatRequest =
            ChatRequest(
                frequencyPenalty,
                logitBias,
                logprobs,
                maxTokens,
                (messages ?: JsonMissing.of()).map { it.toImmutable() },
                model,
                n,
                parallelToolCalls,
                presencePenalty,
                responseFormat,
                seed,
                (stop ?: JsonMissing.of()).map { it.toImmutable() },
                stream,
                streamOptions,
                temperature,
                toolChoice,
                tools,
                topLogprobs,
                topP,
                user,
                additionalProperties.toImmutable(),
            )
    }

    /**
     * LogitBias is must be a token id string (specified by their token ID in the tokenizer), not a
     * word string. incorrect: `"logit_bias":{"You": 6}`, correct: `"logit_bias":{"1639": 6}` refs:
     * https://platform.openai.com/docs/api-reference/chat/create#chat/create-logit_bias
     */
    @NoAutoDetect
    class LogitBias
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): LogitBias = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [LogitBias]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(logitBias: LogitBias) = apply {
                additionalProperties = logitBias.additionalProperties.toMutableMap()
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

            fun build(): LogitBias = LogitBias(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LogitBias && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "LogitBias{additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class ResponseFormat
    @JsonCreator
    private constructor(
        @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun type(): Optional<Type> = Optional.ofNullable(type.getNullable("type"))

        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ResponseFormat = apply {
            if (validated) {
                return@apply
            }

            type()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ResponseFormat]. */
        class Builder internal constructor() {

            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(responseFormat: ResponseFormat) = apply {
                type = responseFormat.type
                additionalProperties = responseFormat.additionalProperties.toMutableMap()
            }

            fun type(type: Type) = type(JsonField.of(type))

            fun type(type: JsonField<Type>) = apply { this.type = type }

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

            fun build(): ResponseFormat = ResponseFormat(type, additionalProperties.toImmutable())
        }

        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val JSON_OBJECT = of("json_object")

                @JvmField val TEXT = of("text")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                JSON_OBJECT,
                TEXT,
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                JSON_OBJECT,
                TEXT,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    JSON_OBJECT -> Value.JSON_OBJECT
                    TEXT -> Value.TEXT
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws ArcadeInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    JSON_OBJECT -> Known.JSON_OBJECT
                    TEXT -> Known.TEXT
                    else -> throw ArcadeInvalidDataException("Unknown Type: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws ArcadeInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    ArcadeInvalidDataException("Value is not a String")
                }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Type && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ResponseFormat && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ResponseFormat{type=$type, additionalProperties=$additionalProperties}"
    }

    /** Options for streaming response. Only set this when you set stream: true. */
    @NoAutoDetect
    class StreamOptions
    @JsonCreator
    private constructor(
        @JsonProperty("include_usage")
        @ExcludeMissing
        private val includeUsage: JsonField<Boolean> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * If set, an additional chunk will be streamed before the data: [DONE] message. The usage
         * field on this chunk shows the token usage statistics for the entire request, and the
         * choices field will always be an empty array. All other chunks will also include a usage
         * field, but with a null value.
         */
        fun includeUsage(): Optional<Boolean> =
            Optional.ofNullable(includeUsage.getNullable("include_usage"))

        /**
         * If set, an additional chunk will be streamed before the data: [DONE] message. The usage
         * field on this chunk shows the token usage statistics for the entire request, and the
         * choices field will always be an empty array. All other chunks will also include a usage
         * field, but with a null value.
         */
        @JsonProperty("include_usage")
        @ExcludeMissing
        fun _includeUsage(): JsonField<Boolean> = includeUsage

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): StreamOptions = apply {
            if (validated) {
                return@apply
            }

            includeUsage()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [StreamOptions]. */
        class Builder internal constructor() {

            private var includeUsage: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(streamOptions: StreamOptions) = apply {
                includeUsage = streamOptions.includeUsage
                additionalProperties = streamOptions.additionalProperties.toMutableMap()
            }

            /**
             * If set, an additional chunk will be streamed before the data: [DONE] message. The
             * usage field on this chunk shows the token usage statistics for the entire request,
             * and the choices field will always be an empty array. All other chunks will also
             * include a usage field, but with a null value.
             */
            fun includeUsage(includeUsage: Boolean) = includeUsage(JsonField.of(includeUsage))

            /**
             * If set, an additional chunk will be streamed before the data: [DONE] message. The
             * usage field on this chunk shows the token usage statistics for the entire request,
             * and the choices field will always be an empty array. All other chunks will also
             * include a usage field, but with a null value.
             */
            fun includeUsage(includeUsage: JsonField<Boolean>) = apply {
                this.includeUsage = includeUsage
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

            fun build(): StreamOptions =
                StreamOptions(includeUsage, additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is StreamOptions && includeUsage == other.includeUsage && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(includeUsage, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "StreamOptions{includeUsage=$includeUsage, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ChatRequest && frequencyPenalty == other.frequencyPenalty && logitBias == other.logitBias && logprobs == other.logprobs && maxTokens == other.maxTokens && messages == other.messages && model == other.model && n == other.n && parallelToolCalls == other.parallelToolCalls && presencePenalty == other.presencePenalty && responseFormat == other.responseFormat && seed == other.seed && stop == other.stop && stream == other.stream && streamOptions == other.streamOptions && temperature == other.temperature && toolChoice == other.toolChoice && tools == other.tools && topLogprobs == other.topLogprobs && topP == other.topP && user == other.user && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(frequencyPenalty, logitBias, logprobs, maxTokens, messages, model, n, parallelToolCalls, presencePenalty, responseFormat, seed, stop, stream, streamOptions, temperature, toolChoice, tools, topLogprobs, topP, user, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ChatRequest{frequencyPenalty=$frequencyPenalty, logitBias=$logitBias, logprobs=$logprobs, maxTokens=$maxTokens, messages=$messages, model=$model, n=$n, parallelToolCalls=$parallelToolCalls, presencePenalty=$presencePenalty, responseFormat=$responseFormat, seed=$seed, stop=$stop, stream=$stream, streamOptions=$streamOptions, temperature=$temperature, toolChoice=$toolChoice, tools=$tools, topLogprobs=$topLogprobs, topP=$topP, user=$user, additionalProperties=$additionalProperties}"
}
