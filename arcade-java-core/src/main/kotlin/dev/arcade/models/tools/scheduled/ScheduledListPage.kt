// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models.tools.scheduled

import dev.arcade.core.AutoPager
import dev.arcade.core.Page
import dev.arcade.core.checkRequired
import dev.arcade.models.tools.ToolExecution
import dev.arcade.services.blocking.tools.ScheduledService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see ScheduledService.list */
class ScheduledListPage
private constructor(
    private val service: ScheduledService,
    private val params: ScheduledListParams,
    private val response: ScheduledListPageResponse,
) : Page<ToolExecution> {

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
        val totalCount = totalCount().getOrDefault(Long.MAX_VALUE)
        return offset + items().size < totalCount
    }

    fun nextPageParams(): ScheduledListParams {
        val offset = offset().getOrDefault(0)
        return params.toBuilder().offset(offset + items().size).build()
    }

    override fun nextPage(): ScheduledListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<ToolExecution> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ScheduledListParams = params

    /** The response that this page was parsed from. */
    fun response(): ScheduledListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ScheduledListPage].
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

    /** A builder for [ScheduledListPage]. */
    class Builder internal constructor() {

        private var service: ScheduledService? = null
        private var params: ScheduledListParams? = null
        private var response: ScheduledListPageResponse? = null

        @JvmSynthetic
        internal fun from(scheduledListPage: ScheduledListPage) = apply {
            service = scheduledListPage.service
            params = scheduledListPage.params
            response = scheduledListPage.response
        }

        fun service(service: ScheduledService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ScheduledListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ScheduledListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ScheduledListPage].
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
        fun build(): ScheduledListPage =
            ScheduledListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ScheduledListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "ScheduledListPage{service=$service, params=$params, response=$response}"
}
