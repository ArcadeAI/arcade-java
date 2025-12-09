// File generated from our OpenAPI spec by Stainless.

package dev.arcade.services.async.chat

import dev.arcade.core.ClientOptions
import dev.arcade.core.RequestOptions
import dev.arcade.core.http.HttpResponseFor
import dev.arcade.models.chat.ChatRequest
import dev.arcade.models.chat.ChatResponse
import dev.arcade.models.chat.completions.CompletionCreateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CompletionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CompletionServiceAsync

    /** Interact with language models via OpenAI's chat completions API */
    fun create(params: CompletionCreateParams): CompletableFuture<ChatResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CompletionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChatResponse>

    /** @see create */
    fun create(
        chatRequest: ChatRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChatResponse> =
        create(CompletionCreateParams.builder().chatRequest(chatRequest).build(), requestOptions)

    /** @see create */
    fun create(chatRequest: ChatRequest): CompletableFuture<ChatResponse> =
        create(chatRequest, RequestOptions.none())

    /**
     * A view of [CompletionServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CompletionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/chat/completions`, but is otherwise the same as
         * [CompletionServiceAsync.create].
         */
        fun create(
            params: CompletionCreateParams
        ): CompletableFuture<HttpResponseFor<ChatResponse>> = create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: CompletionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChatResponse>>

        /** @see create */
        fun create(
            chatRequest: ChatRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChatResponse>> =
            create(
                CompletionCreateParams.builder().chatRequest(chatRequest).build(),
                requestOptions,
            )

        /** @see create */
        fun create(chatRequest: ChatRequest): CompletableFuture<HttpResponseFor<ChatResponse>> =
            create(chatRequest, RequestOptions.none())
    }
}
