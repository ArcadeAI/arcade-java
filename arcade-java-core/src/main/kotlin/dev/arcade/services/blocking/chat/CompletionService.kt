// File generated from our OpenAPI spec by Stainless.

package dev.arcade.services.blocking.chat

import com.google.errorprone.annotations.MustBeClosed
import dev.arcade.core.ClientOptions
import dev.arcade.core.RequestOptions
import dev.arcade.core.http.HttpResponseFor
import dev.arcade.models.chat.ChatRequest
import dev.arcade.models.chat.ChatResponse
import dev.arcade.models.chat.completions.CompletionCreateParams
import java.util.function.Consumer

interface CompletionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CompletionService

    /** Interact with language models via OpenAI's chat completions API */
    fun create(params: CompletionCreateParams): ChatResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CompletionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChatResponse

    /** @see create */
    fun create(
        chatRequest: ChatRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChatResponse =
        create(CompletionCreateParams.builder().chatRequest(chatRequest).build(), requestOptions)

    /** @see create */
    fun create(chatRequest: ChatRequest): ChatResponse = create(chatRequest, RequestOptions.none())

    /** A view of [CompletionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CompletionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/chat/completions`, but is otherwise the same as
         * [CompletionService.create].
         */
        @MustBeClosed
        fun create(params: CompletionCreateParams): HttpResponseFor<ChatResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: CompletionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChatResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            chatRequest: ChatRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChatResponse> =
            create(
                CompletionCreateParams.builder().chatRequest(chatRequest).build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(chatRequest: ChatRequest): HttpResponseFor<ChatResponse> =
            create(chatRequest, RequestOptions.none())
    }
}
