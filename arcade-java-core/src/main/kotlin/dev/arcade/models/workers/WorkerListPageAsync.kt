// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models.workers

import dev.arcade.core.AutoPagerAsync
import dev.arcade.core.PageAsync
import dev.arcade.core.checkRequired
import dev.arcade.services.async.WorkerServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see WorkerServiceAsync.list */
class WorkerListPageAsync
private constructor(
    private val service: WorkerServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: WorkerListParams,
    private val response: WorkerListPageResponse,
) : PageAsync<WorkerResponse> {

    /**
     * Delegates to [WorkerListPageResponse], but gracefully handles missing data.
     *
     * @see WorkerListPageResponse.items
     */
    override fun items(): List<WorkerResponse> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [WorkerListPageResponse], but gracefully handles missing data.
     *
     * @see WorkerListPageResponse.totalCount
     */
    fun totalCount(): Optional<Long> = response._totalCount().getOptional("total_count")

    /**
     * Delegates to [WorkerListPageResponse], but gracefully handles missing data.
     *
     * @see WorkerListPageResponse.offset
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

    fun nextPageParams(): WorkerListParams {
        val offset = offset().getOrDefault(0)
        return params.toBuilder().offset(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<WorkerListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<WorkerResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): WorkerListParams = params

    /** The response that this page was parsed from. */
    fun response(): WorkerListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [WorkerListPageAsync].
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

    /** A builder for [WorkerListPageAsync]. */
    class Builder internal constructor() {

        private var service: WorkerServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: WorkerListParams? = null
        private var response: WorkerListPageResponse? = null

        @JvmSynthetic
        internal fun from(workerListPageAsync: WorkerListPageAsync) = apply {
            service = workerListPageAsync.service
            streamHandlerExecutor = workerListPageAsync.streamHandlerExecutor
            params = workerListPageAsync.params
            response = workerListPageAsync.response
        }

        fun service(service: WorkerServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: WorkerListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: WorkerListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [WorkerListPageAsync].
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
        fun build(): WorkerListPageAsync =
            WorkerListPageAsync(
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

        return other is WorkerListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "WorkerListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
