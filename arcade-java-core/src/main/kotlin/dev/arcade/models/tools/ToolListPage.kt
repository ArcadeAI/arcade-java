// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models.tools

import dev.arcade.core.AutoPager
import dev.arcade.core.Page
import dev.arcade.core.checkRequired
import dev.arcade.services.blocking.ToolService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see ToolService.list */
class ToolListPage
private constructor(
    private val service: ToolService,
    private val params: ToolListParams,
    private val response: ToolListPageResponse,
) : Page<ToolDefinition> {

    /**
     * Delegates to [ToolListPageResponse], but gracefully handles missing data.
     *
     * @see ToolListPageResponse.items
     */
    override fun items(): List<ToolDefinition> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [ToolListPageResponse], but gracefully handles missing data.
     *
     * @see ToolListPageResponse.totalCount
     */
    fun totalCount(): Optional<Long> = response._totalCount().getOptional("total_count")

    /**
     * Delegates to [ToolListPageResponse], but gracefully handles missing data.
     *
     * @see ToolListPageResponse.offset
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

    fun nextPageParams(): ToolListParams {
        val offset = offset().getOrDefault(0)
        return params.toBuilder().offset(offset + items().size).build()
    }

    override fun nextPage(): ToolListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<ToolDefinition> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ToolListParams = params

    /** The response that this page was parsed from. */
    fun response(): ToolListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ToolListPage].
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

    /** A builder for [ToolListPage]. */
    class Builder internal constructor() {

        private var service: ToolService? = null
        private var params: ToolListParams? = null
        private var response: ToolListPageResponse? = null

        @JvmSynthetic
        internal fun from(toolListPage: ToolListPage) = apply {
            service = toolListPage.service
            params = toolListPage.params
            response = toolListPage.response
        }

        fun service(service: ToolService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ToolListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ToolListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ToolListPage].
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
        fun build(): ToolListPage =
            ToolListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ToolListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "ToolListPage{service=$service, params=$params, response=$response}"
}
