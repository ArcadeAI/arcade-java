// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models.workers

import dev.arcade.core.AutoPagerAsync
import dev.arcade.core.PageAsync
import dev.arcade.core.checkRequired
import dev.arcade.models.tools.ToolDefinition
import dev.arcade.services.async.WorkerServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see WorkerServiceAsync.tools */
class WorkerToolsPageAsync
private constructor(
    private val service: WorkerServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: WorkerToolsParams,
    private val response: WorkerToolsPageResponse,
) : PageAsync<ToolDefinition> {

    /**
     * Delegates to [WorkerToolsPageResponse], but gracefully handles missing data.
     *
     * @see WorkerToolsPageResponse.items
     */
    override fun items(): List<ToolDefinition> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [WorkerToolsPageResponse], but gracefully handles missing data.
     *
     * @see WorkerToolsPageResponse.totalCount
     */
    fun totalCount(): Optional<Long> = response._totalCount().getOptional("total_count")

    /**
     * Delegates to [WorkerToolsPageResponse], but gracefully handles missing data.
     *
     * @see WorkerToolsPageResponse.offset
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

    fun nextPageParams(): WorkerToolsParams {
        val offset = offset().getOrDefault(0)
        return params.toBuilder().offset(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<WorkerToolsPageAsync> =
        service.tools(nextPageParams())

    fun autoPager(): AutoPagerAsync<ToolDefinition> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): WorkerToolsParams = params

    /** The response that this page was parsed from. */
    fun response(): WorkerToolsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [WorkerToolsPageAsync].
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

    /** A builder for [WorkerToolsPageAsync]. */
    class Builder internal constructor() {

        private var service: WorkerServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: WorkerToolsParams? = null
        private var response: WorkerToolsPageResponse? = null

        @JvmSynthetic
        internal fun from(workerToolsPageAsync: WorkerToolsPageAsync) = apply {
            service = workerToolsPageAsync.service
            streamHandlerExecutor = workerToolsPageAsync.streamHandlerExecutor
            params = workerToolsPageAsync.params
            response = workerToolsPageAsync.response
        }

        fun service(service: WorkerServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: WorkerToolsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: WorkerToolsPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [WorkerToolsPageAsync].
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
        fun build(): WorkerToolsPageAsync =
            WorkerToolsPageAsync(
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

        return other is WorkerToolsPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "WorkerToolsPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
