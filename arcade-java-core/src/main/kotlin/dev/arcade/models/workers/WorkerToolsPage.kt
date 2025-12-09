// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models.workers

import dev.arcade.core.AutoPager
import dev.arcade.core.Page
import dev.arcade.core.checkRequired
import dev.arcade.models.tools.ToolDefinition
import dev.arcade.services.blocking.WorkerService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see WorkerService.tools */
class WorkerToolsPage
private constructor(
    private val service: WorkerService,
    private val params: WorkerToolsParams,
    private val response: WorkerToolsPageResponse,
) : Page<ToolDefinition> {

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

    override fun nextPage(): WorkerToolsPage = service.tools(nextPageParams())

    fun autoPager(): AutoPager<ToolDefinition> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): WorkerToolsParams = params

    /** The response that this page was parsed from. */
    fun response(): WorkerToolsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [WorkerToolsPage].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WorkerToolsPage]. */
    class Builder internal constructor() {

        private var service: WorkerService? = null
        private var params: WorkerToolsParams? = null
        private var response: WorkerToolsPageResponse? = null

        @JvmSynthetic
        internal fun from(workerToolsPage: WorkerToolsPage) = apply {
            service = workerToolsPage.service
            params = workerToolsPage.params
            response = workerToolsPage.response
        }

        fun service(service: WorkerService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: WorkerToolsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: WorkerToolsPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [WorkerToolsPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): WorkerToolsPage =
            WorkerToolsPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WorkerToolsPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "WorkerToolsPage{service=$service, params=$params, response=$response}"
}
