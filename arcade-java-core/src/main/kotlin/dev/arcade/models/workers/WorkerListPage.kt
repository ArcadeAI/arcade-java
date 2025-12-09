// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models.workers

import dev.arcade.core.AutoPager
import dev.arcade.core.Page
import dev.arcade.core.checkRequired
import dev.arcade.services.blocking.WorkerService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see WorkerService.list */
class WorkerListPage
private constructor(
    private val service: WorkerService,
    private val params: WorkerListParams,
    private val response: WorkerListPageResponse,
) : Page<WorkerResponse> {

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
        val totalCount = totalCount().getOrDefault(Long.MAX_VALUE)
        return offset + items().size < totalCount
    }

    fun nextPageParams(): WorkerListParams {
        val offset = offset().getOrDefault(0)
        return params.toBuilder().offset(offset + items().size).build()
    }

    override fun nextPage(): WorkerListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<WorkerResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): WorkerListParams = params

    /** The response that this page was parsed from. */
    fun response(): WorkerListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [WorkerListPage].
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

    /** A builder for [WorkerListPage]. */
    class Builder internal constructor() {

        private var service: WorkerService? = null
        private var params: WorkerListParams? = null
        private var response: WorkerListPageResponse? = null

        @JvmSynthetic
        internal fun from(workerListPage: WorkerListPage) = apply {
            service = workerListPage.service
            params = workerListPage.params
            response = workerListPage.response
        }

        fun service(service: WorkerService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: WorkerListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: WorkerListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [WorkerListPage].
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
        fun build(): WorkerListPage =
            WorkerListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WorkerListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "WorkerListPage{service=$service, params=$params, response=$response}"
}
