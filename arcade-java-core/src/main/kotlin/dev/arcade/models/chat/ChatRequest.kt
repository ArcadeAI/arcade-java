// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models.chat

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.arcade.core.Enum
import dev.arcade.core.ExcludeMissing
import dev.arcade.core.JsonField
import dev.arcade.core.JsonMissing
import dev.arcade.core.JsonValue
import dev.arcade.core.checkKnown
import dev.arcade.core.toImmutable
import dev.arcade.errors.ArcadeInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ChatRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val frequencyPenalty: JsonField<Double>,
    private val logitBias: JsonField<LogitBias>,
    private val logprobs: JsonField<Boolean>,
    private val maxTokens: JsonField<Long>,
    private val messages: JsonField<List<ChatMessage>>,
    private val model: JsonField<String>,
    private val n: JsonField<Long>,
    private val parallelToolCalls: JsonField<Boolean>,
    private val presencePenalty: JsonField<Double>,
    private val responseFormat: JsonField<ResponseFormat>,
    private val seed: JsonField<Long>,
    private val stop: JsonField<List<String>>,
    private val stream: JsonField<Boolean>,
    private val streamOptions: JsonField<StreamOptions>,
    private val temperature: JsonField<Double>,
    private val toolChoice: JsonValue,
    private val tools: JsonValue,
    private val topLogprobs: JsonField<Long>,
    private val topP: JsonField<Double>,
    private val user: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("frequency_penalty")
        @ExcludeMissing
        frequencyPenalty: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("logit_bias")
        @ExcludeMissing
        logitBias: JsonField<LogitBias> = JsonMissing.of(),
        @JsonProperty("logprobs") @ExcludeMissing logprobs: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("max_tokens") @ExcludeMissing maxTokens: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("messages")
        @ExcludeMissing
        messages: JsonField<List<ChatMessage>> = JsonMissing.of(),
        @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
        @JsonProperty("n") @ExcludeMissing n: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("parallel_tool_calls")
        @ExcludeMissing
        parallelToolCalls: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("presence_penalty")
        @ExcludeMissing
        presencePenalty: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("response_format")
        @ExcludeMissing
        responseFormat: JsonField<ResponseFormat> = JsonMissing.of(),
        @JsonProperty("seed") @ExcludeMissing seed: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("stop") @ExcludeMissing stop: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("stream") @ExcludeMissing stream: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("stream_options")
        @ExcludeMissing
        streamOptions: JsonField<StreamOptions> = JsonMissing.of(),
        @JsonProperty("temperature")
        @ExcludeMissing
        temperature: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("tool_choice") @ExcludeMissing toolChoice: JsonValue = JsonMissing.of(),
        @JsonProperty("tools") @ExcludeMissing tools: JsonValue = JsonMissing.of(),
        @JsonProperty("top_logprobs")
        @ExcludeMissing
        topLogprobs: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("top_p") @ExcludeMissing topP: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("user") @ExcludeMissing user: JsonField<String> = JsonMissing.of(),
    ) : this(
        frequencyPenalty,
        logitBias,
        logprobs,
        maxTokens,
        messages,
        model,
        n,
        parallelToolCalls,
        presencePenalty,
        responseFormat,
        seed,
        stop,
        stream,
        streamOptions,
        temperature,
        toolChoice,
        tools,
        topLogprobs,
        topP,
        user,
        mutableMapOf(),
    )

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun frequencyPenalty(): Optional<Double> = frequencyPenalty.getOptional("frequency_penalty")

    /**
     * LogitBias is must be a token id string (specified by their token ID in the tokenizer), not a
     * word string. incorrect: `"logit_bias":{"You": 6}`, correct: `"logit_bias":{"1639": 6}` refs:
     * https://platform.openai.com/docs/api-reference/chat/create#chat/create-logit_bias
     *
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun logitBias(): Optional<LogitBias> = logitBias.getOptional("logit_bias")

    /**
     * LogProbs indicates whether to return log probabilities of the output tokens or not. If true,
     * returns the log probabilities of each output token returned in the content of message. This
     * option is currently not available on the gpt-4-vision-preview model.
     *
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun logprobs(): Optional<Boolean> = logprobs.getOptional("logprobs")

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxTokens(): Optional<Long> = maxTokens.getOptional("max_tokens")

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun messages(): Optional<List<ChatMessage>> = messages.getOptional("messages")

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun model(): Optional<String> = model.getOptional("model")

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun n(): Optional<Long> = n.getOptional("n")

    /**
     * Disable the default behavior of parallel tool calls by setting it: false.
     *
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun parallelToolCalls(): Optional<Boolean> =
        parallelToolCalls.getOptional("parallel_tool_calls")

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun presencePenalty(): Optional<Double> = presencePenalty.getOptional("presence_penalty")

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun responseFormat(): Optional<ResponseFormat> = responseFormat.getOptional("response_format")

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun seed(): Optional<Long> = seed.getOptional("seed")

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun stop(): Optional<List<String>> = stop.getOptional("stop")

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun stream(): Optional<Boolean> = stream.getOptional("stream")

    /**
     * Options for streaming response. Only set this when you set stream: true.
     *
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun streamOptions(): Optional<StreamOptions> = streamOptions.getOptional("stream_options")

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun temperature(): Optional<Double> = temperature.getOptional("temperature")

    /**
     * This can be either a string or an ToolChoice object.
     *
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = chatRequest.toolChoice().convert(MyClass.class);
     * ```
     */
    @JsonProperty("tool_choice") @ExcludeMissing fun _toolChoice(): JsonValue = toolChoice

    /**
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = chatRequest.tools().convert(MyClass.class);
     * ```
     */
    @JsonProperty("tools") @ExcludeMissing fun _tools(): JsonValue = tools

    /**
     * TopLogProbs is an integer between 0 and 5 specifying the number of most likely tokens to
     * return at each token position, each with an associated log probability. logprobs must be set
     * to true if this parameter is used.
     *
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun topLogprobs(): Optional<Long> = topLogprobs.getOptional("top_logprobs")

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun topP(): Optional<Double> = topP.getOptional("top_p")

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun user(): Optional<String> = user.getOptional("user")

    /**
     * Returns the raw JSON value of [frequencyPenalty].
     *
     * Unlike [frequencyPenalty], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("frequency_penalty")
    @ExcludeMissing
    fun _frequencyPenalty(): JsonField<Double> = frequencyPenalty

    /**
     * Returns the raw JSON value of [logitBias].
     *
     * Unlike [logitBias], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("logit_bias") @ExcludeMissing fun _logitBias(): JsonField<LogitBias> = logitBias

    /**
     * Returns the raw JSON value of [logprobs].
     *
     * Unlike [logprobs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("logprobs") @ExcludeMissing fun _logprobs(): JsonField<Boolean> = logprobs

    /**
     * Returns the raw JSON value of [maxTokens].
     *
     * Unlike [maxTokens], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("max_tokens") @ExcludeMissing fun _maxTokens(): JsonField<Long> = maxTokens

    /**
     * Returns the raw JSON value of [messages].
     *
     * Unlike [messages], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("messages")
    @ExcludeMissing
    fun _messages(): JsonField<List<ChatMessage>> = messages

    /**
     * Returns the raw JSON value of [model].
     *
     * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

    /**
     * Returns the raw JSON value of [n].
     *
     * Unlike [n], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("n") @ExcludeMissing fun _n(): JsonField<Long> = n

    /**
     * Returns the raw JSON value of [parallelToolCalls].
     *
     * Unlike [parallelToolCalls], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("parallel_tool_calls")
    @ExcludeMissing
    fun _parallelToolCalls(): JsonField<Boolean> = parallelToolCalls

    /**
     * Returns the raw JSON value of [presencePenalty].
     *
     * Unlike [presencePenalty], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("presence_penalty")
    @ExcludeMissing
    fun _presencePenalty(): JsonField<Double> = presencePenalty

    /**
     * Returns the raw JSON value of [responseFormat].
     *
     * Unlike [responseFormat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("response_format")
    @ExcludeMissing
    fun _responseFormat(): JsonField<ResponseFormat> = responseFormat

    /**
     * Returns the raw JSON value of [seed].
     *
     * Unlike [seed], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("seed") @ExcludeMissing fun _seed(): JsonField<Long> = seed

    /**
     * Returns the raw JSON value of [stop].
     *
     * Unlike [stop], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("stop") @ExcludeMissing fun _stop(): JsonField<List<String>> = stop

    /**
     * Returns the raw JSON value of [stream].
     *
     * Unlike [stream], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("stream") @ExcludeMissing fun _stream(): JsonField<Boolean> = stream

    /**
     * Returns the raw JSON value of [streamOptions].
     *
     * Unlike [streamOptions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("stream_options")
    @ExcludeMissing
    fun _streamOptions(): JsonField<StreamOptions> = streamOptions

    /**
     * Returns the raw JSON value of [temperature].
     *
     * Unlike [temperature], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("temperature") @ExcludeMissing fun _temperature(): JsonField<Double> = temperature

    /**
     * Returns the raw JSON value of [topLogprobs].
     *
     * Unlike [topLogprobs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("top_logprobs") @ExcludeMissing fun _topLogprobs(): JsonField<Long> = topLogprobs

    /**
     * Returns the raw JSON value of [topP].
     *
     * Unlike [topP], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("top_p") @ExcludeMissing fun _topP(): JsonField<Double> = topP

    /**
     * Returns the raw JSON value of [user].
     *
     * Unlike [user], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user") @ExcludeMissing fun _user(): JsonField<String> = user

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

        /** Returns a mutable builder for constructing an instance of [ChatRequest]. */
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

        /**
         * Sets [Builder.frequencyPenalty] to an arbitrary JSON value.
         *
         * You should usually call [Builder.frequencyPenalty] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
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
         * Sets [Builder.logitBias] to an arbitrary JSON value.
         *
         * You should usually call [Builder.logitBias] with a well-typed [LogitBias] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun logitBias(logitBias: JsonField<LogitBias>) = apply { this.logitBias = logitBias }

        /**
         * LogProbs indicates whether to return log probabilities of the output tokens or not. If
         * true, returns the log probabilities of each output token returned in the content of
         * message. This option is currently not available on the gpt-4-vision-preview model.
         */
        fun logprobs(logprobs: Boolean) = logprobs(JsonField.of(logprobs))

        /**
         * Sets [Builder.logprobs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.logprobs] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun logprobs(logprobs: JsonField<Boolean>) = apply { this.logprobs = logprobs }

        fun maxTokens(maxTokens: Long) = maxTokens(JsonField.of(maxTokens))

        /**
         * Sets [Builder.maxTokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxTokens] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun maxTokens(maxTokens: JsonField<Long>) = apply { this.maxTokens = maxTokens }

        fun messages(messages: List<ChatMessage>) = messages(JsonField.of(messages))

        /**
         * Sets [Builder.messages] to an arbitrary JSON value.
         *
         * You should usually call [Builder.messages] with a well-typed `List<ChatMessage>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun messages(messages: JsonField<List<ChatMessage>>) = apply {
            this.messages = messages.map { it.toMutableList() }
        }

        /**
         * Adds a single [ChatMessage] to [messages].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMessage(message: ChatMessage) = apply {
            messages =
                (messages ?: JsonField.of(mutableListOf())).also {
                    checkKnown("messages", it).add(message)
                }
        }

        fun model(model: String) = model(JsonField.of(model))

        /**
         * Sets [Builder.model] to an arbitrary JSON value.
         *
         * You should usually call [Builder.model] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun model(model: JsonField<String>) = apply { this.model = model }

        fun n(n: Long) = n(JsonField.of(n))

        /**
         * Sets [Builder.n] to an arbitrary JSON value.
         *
         * You should usually call [Builder.n] with a well-typed [Long] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun n(n: JsonField<Long>) = apply { this.n = n }

        /** Disable the default behavior of parallel tool calls by setting it: false. */
        fun parallelToolCalls(parallelToolCalls: Boolean) =
            parallelToolCalls(JsonField.of(parallelToolCalls))

        /**
         * Sets [Builder.parallelToolCalls] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parallelToolCalls] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun parallelToolCalls(parallelToolCalls: JsonField<Boolean>) = apply {
            this.parallelToolCalls = parallelToolCalls
        }

        fun presencePenalty(presencePenalty: Double) =
            presencePenalty(JsonField.of(presencePenalty))

        /**
         * Sets [Builder.presencePenalty] to an arbitrary JSON value.
         *
         * You should usually call [Builder.presencePenalty] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun presencePenalty(presencePenalty: JsonField<Double>) = apply {
            this.presencePenalty = presencePenalty
        }

        fun responseFormat(responseFormat: ResponseFormat) =
            responseFormat(JsonField.of(responseFormat))

        /**
         * Sets [Builder.responseFormat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.responseFormat] with a well-typed [ResponseFormat] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun responseFormat(responseFormat: JsonField<ResponseFormat>) = apply {
            this.responseFormat = responseFormat
        }

        fun seed(seed: Long) = seed(JsonField.of(seed))

        /**
         * Sets [Builder.seed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.seed] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun seed(seed: JsonField<Long>) = apply { this.seed = seed }

        fun stop(stop: List<String>) = stop(JsonField.of(stop))

        /**
         * Sets [Builder.stop] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stop] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun stop(stop: JsonField<List<String>>) = apply {
            this.stop = stop.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.stop].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addStop(stop: String) = apply {
            this.stop =
                (this.stop ?: JsonField.of(mutableListOf())).also {
                    checkKnown("stop", it).add(stop)
                }
        }

        fun stream(stream: Boolean) = stream(JsonField.of(stream))

        /**
         * Sets [Builder.stream] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stream] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun stream(stream: JsonField<Boolean>) = apply { this.stream = stream }

        /** Options for streaming response. Only set this when you set stream: true. */
        fun streamOptions(streamOptions: StreamOptions) = streamOptions(JsonField.of(streamOptions))

        /**
         * Sets [Builder.streamOptions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.streamOptions] with a well-typed [StreamOptions] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun streamOptions(streamOptions: JsonField<StreamOptions>) = apply {
            this.streamOptions = streamOptions
        }

        fun temperature(temperature: Double) = temperature(JsonField.of(temperature))

        /**
         * Sets [Builder.temperature] to an arbitrary JSON value.
         *
         * You should usually call [Builder.temperature] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
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
         * Sets [Builder.topLogprobs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.topLogprobs] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun topLogprobs(topLogprobs: JsonField<Long>) = apply { this.topLogprobs = topLogprobs }

        fun topP(topP: Double) = topP(JsonField.of(topP))

        /**
         * Sets [Builder.topP] to an arbitrary JSON value.
         *
         * You should usually call [Builder.topP] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun topP(topP: JsonField<Double>) = apply { this.topP = topP }

        fun user(user: String) = user(JsonField.of(user))

        /**
         * Sets [Builder.user] to an arbitrary JSON value.
         *
         * You should usually call [Builder.user] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
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

        /**
         * Returns an immutable instance of [ChatRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
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
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws ArcadeInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
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
        (if (frequencyPenalty.asKnown().isPresent) 1 else 0) +
            (logitBias.asKnown().getOrNull()?.validity() ?: 0) +
            (if (logprobs.asKnown().isPresent) 1 else 0) +
            (if (maxTokens.asKnown().isPresent) 1 else 0) +
            (messages.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (model.asKnown().isPresent) 1 else 0) +
            (if (n.asKnown().isPresent) 1 else 0) +
            (if (parallelToolCalls.asKnown().isPresent) 1 else 0) +
            (if (presencePenalty.asKnown().isPresent) 1 else 0) +
            (responseFormat.asKnown().getOrNull()?.validity() ?: 0) +
            (if (seed.asKnown().isPresent) 1 else 0) +
            (stop.asKnown().getOrNull()?.size ?: 0) +
            (if (stream.asKnown().isPresent) 1 else 0) +
            (streamOptions.asKnown().getOrNull()?.validity() ?: 0) +
            (if (temperature.asKnown().isPresent) 1 else 0) +
            (if (topLogprobs.asKnown().isPresent) 1 else 0) +
            (if (topP.asKnown().isPresent) 1 else 0) +
            (if (user.asKnown().isPresent) 1 else 0)

    /**
     * LogitBias is must be a token id string (specified by their token ID in the tokenizer), not a
     * word string. incorrect: `"logit_bias":{"You": 6}`, correct: `"logit_bias":{"1639": 6}` refs:
     * https://platform.openai.com/docs/api-reference/chat/create#chat/create-logit_bias
     */
    class LogitBias
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [LogitBias]. */
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

            /**
             * Returns an immutable instance of [LogitBias].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): LogitBias = LogitBias(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws ArcadeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): LogitBias = apply {
            if (validated) {
                return@apply
            }

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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is LogitBias && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "LogitBias{additionalProperties=$additionalProperties}"
    }

    class ResponseFormat
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val type: JsonField<Type>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of()
        ) : this(type, mutableMapOf())

        /**
         * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun type(): Optional<Type> = type.getOptional("type")

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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

            /** Returns a mutable builder for constructing an instance of [ResponseFormat]. */
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

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
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

            /**
             * Returns an immutable instance of [ResponseFormat].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ResponseFormat = ResponseFormat(type, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws ArcadeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): ResponseFormat = apply {
            if (validated) {
                return@apply
            }

            type().ifPresent { it.validate() }
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = (type.asKnown().getOrNull()?.validity() ?: 0)

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

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws ArcadeInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Type = apply {
                if (validated) {
                    return@apply
                }

                known()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ResponseFormat &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(type, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ResponseFormat{type=$type, additionalProperties=$additionalProperties}"
    }

    /** Options for streaming response. Only set this when you set stream: true. */
    class StreamOptions
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val includeUsage: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("include_usage")
            @ExcludeMissing
            includeUsage: JsonField<Boolean> = JsonMissing.of()
        ) : this(includeUsage, mutableMapOf())

        /**
         * If set, an additional chunk will be streamed before the data: [DONE] message. The usage
         * field on this chunk shows the token usage statistics for the entire request, and the
         * choices field will always be an empty array. All other chunks will also include a usage
         * field, but with a null value.
         *
         * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun includeUsage(): Optional<Boolean> = includeUsage.getOptional("include_usage")

        /**
         * Returns the raw JSON value of [includeUsage].
         *
         * Unlike [includeUsage], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("include_usage")
        @ExcludeMissing
        fun _includeUsage(): JsonField<Boolean> = includeUsage

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

            /** Returns a mutable builder for constructing an instance of [StreamOptions]. */
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
             * Sets [Builder.includeUsage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.includeUsage] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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

            /**
             * Returns an immutable instance of [StreamOptions].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): StreamOptions =
                StreamOptions(includeUsage, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws ArcadeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): StreamOptions = apply {
            if (validated) {
                return@apply
            }

            includeUsage()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int = (if (includeUsage.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is StreamOptions &&
                includeUsage == other.includeUsage &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(includeUsage, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "StreamOptions{includeUsage=$includeUsage, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ChatRequest &&
            frequencyPenalty == other.frequencyPenalty &&
            logitBias == other.logitBias &&
            logprobs == other.logprobs &&
            maxTokens == other.maxTokens &&
            messages == other.messages &&
            model == other.model &&
            n == other.n &&
            parallelToolCalls == other.parallelToolCalls &&
            presencePenalty == other.presencePenalty &&
            responseFormat == other.responseFormat &&
            seed == other.seed &&
            stop == other.stop &&
            stream == other.stream &&
            streamOptions == other.streamOptions &&
            temperature == other.temperature &&
            toolChoice == other.toolChoice &&
            tools == other.tools &&
            topLogprobs == other.topLogprobs &&
            topP == other.topP &&
            user == other.user &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            frequencyPenalty,
            logitBias,
            logprobs,
            maxTokens,
            messages,
            model,
            n,
            parallelToolCalls,
            presencePenalty,
            responseFormat,
            seed,
            stop,
            stream,
            streamOptions,
            temperature,
            toolChoice,
            tools,
            topLogprobs,
            topP,
            user,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ChatRequest{frequencyPenalty=$frequencyPenalty, logitBias=$logitBias, logprobs=$logprobs, maxTokens=$maxTokens, messages=$messages, model=$model, n=$n, parallelToolCalls=$parallelToolCalls, presencePenalty=$presencePenalty, responseFormat=$responseFormat, seed=$seed, stop=$stop, stream=$stream, streamOptions=$streamOptions, temperature=$temperature, toolChoice=$toolChoice, tools=$tools, topLogprobs=$topLogprobs, topP=$topP, user=$user, additionalProperties=$additionalProperties}"
}
