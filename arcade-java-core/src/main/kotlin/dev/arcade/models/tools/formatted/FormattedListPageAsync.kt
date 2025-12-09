// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models.tools.formatted

import dev.arcade.core.AutoPagerAsync
import dev.arcade.core.PageAsync
import dev.arcade.core.checkRequired
import dev.arcade.services.async.tools.FormattedServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see FormattedServiceAsync.list */
class FormattedListPageAsync
private constructor(
    private val service: FormattedServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: FormattedListParams,
    private val response: FormattedListPageResponse,
) : PageAsync<FormattedListResponse> {

    /**
     * Delegates to [FormattedListPageResponse], but gracefully handles missing data.
     *
     * @see FormattedListPageResponse.items
     */
    override fun items(): List<FormattedListResponse> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [FormattedListPageResponse], but gracefully handles missing data.
     *
     * @see FormattedListPageResponse.totalCount
     */
    fun totalCount(): Optional<Long> = response._totalCount().getOptional("total_count")

    /**
     * Delegates to [FormattedListPageResponse], but gracefully handles missing data.
     *
     * @see FormattedListPageResponse.offset
     */
    fun offset(): Optional<Long> = response._offset().getOptional("offset")

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val offset = offset().getOrDefault(0)
        val totalCount = totalCount().getOrDefault(Long.MAX_VALUE)
        return offset + items().size < totalCount
    }

    fun nextPageParams(): FormattedListParams {
        val offset = offset().getOrDefault(0)
        return params.toBuilder().offset(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<FormattedListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<FormattedListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): FormattedListParams = params

    /** The response that this page was parsed from. */
    fun response(): FormattedListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [FormattedListPageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FormattedListPageAsync]. */
    class Builder internal constructor() {

        private var service: FormattedServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: FormattedListParams? = null
        private var response: FormattedListPageResponse? = null

        @JvmSynthetic
        internal fun from(formattedListPageAsync: FormattedListPageAsync) = apply {
            service = formattedListPageAsync.service
            streamHandlerExecutor = formattedListPageAsync.streamHandlerExecutor
            params = formattedListPageAsync.params
            response = formattedListPageAsync.response
        }

        fun service(service: FormattedServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: FormattedListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: FormattedListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [FormattedListPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FormattedListPageAsync =
            FormattedListPageAsync(
                checkRequired("service", service),
                checkRequired("streamHandlerExecutor", streamHandlerExecutor),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FormattedListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "FormattedListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
