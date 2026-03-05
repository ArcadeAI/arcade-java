// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models.tools.scheduled

import dev.arcade.core.AutoPagerAsync
import dev.arcade.core.PageAsync
import dev.arcade.core.checkRequired
import dev.arcade.models.tools.ToolExecution
import dev.arcade.services.async.tools.ScheduledServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see ScheduledServiceAsync.list */
class ScheduledListPageAsync
private constructor(
    private val service: ScheduledServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ScheduledListParams,
    private val response: ScheduledListPageResponse,
) : PageAsync<ToolExecution> {

    /**
     * Delegates to [ScheduledListPageResponse], but gracefully handles missing data.
     *
     * @see ScheduledListPageResponse.items
     */
    override fun items(): List<ToolExecution> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [ScheduledListPageResponse], but gracefully handles missing data.
     *
     * @see ScheduledListPageResponse.totalCount
     */
    fun totalCount(): Optional<Long> = response._totalCount().getOptional("total_count")

    /**
     * Delegates to [ScheduledListPageResponse], but gracefully handles missing data.
     *
     * @see ScheduledListPageResponse.offset
     */
    fun offset(): Optional<Long> = response._offset().getOptional("offset")

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val offset = offset().getOrDefault(0)
        val totalCount = totalCount().getOrNull()
        return totalCount == null || offset + items().size < totalCount
    }

    fun nextPageParams(): ScheduledListParams {
        val offset = offset().getOrDefault(0)
        return params.toBuilder().offset(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<ScheduledListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<ToolExecution> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ScheduledListParams = params

    /** The response that this page was parsed from. */
    fun response(): ScheduledListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ScheduledListPageAsync].
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

    /** A builder for [ScheduledListPageAsync]. */
    class Builder internal constructor() {

        private var service: ScheduledServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ScheduledListParams? = null
        private var response: ScheduledListPageResponse? = null

        @JvmSynthetic
        internal fun from(scheduledListPageAsync: ScheduledListPageAsync) = apply {
            service = scheduledListPageAsync.service
            streamHandlerExecutor = scheduledListPageAsync.streamHandlerExecutor
            params = scheduledListPageAsync.params
            response = scheduledListPageAsync.response
        }

        fun service(service: ScheduledServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ScheduledListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ScheduledListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ScheduledListPageAsync].
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
        fun build(): ScheduledListPageAsync =
            ScheduledListPageAsync(
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

        return other is ScheduledListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "ScheduledListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
