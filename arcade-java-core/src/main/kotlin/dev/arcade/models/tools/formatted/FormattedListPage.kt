// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models.tools.formatted

import dev.arcade.core.AutoPager
import dev.arcade.core.Page
import dev.arcade.core.checkRequired
import dev.arcade.services.blocking.tools.FormattedService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see FormattedService.list */
class FormattedListPage
private constructor(
    private val service: FormattedService,
    private val params: FormattedListParams,
    private val response: FormattedListPageResponse,
) : Page<FormattedListResponse> {

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
        val totalCount = totalCount().getOrNull()
        return totalCount == null || offset + items().size < totalCount
    }

    fun nextPageParams(): FormattedListParams {
        val offset = offset().getOrDefault(0)
        return params.toBuilder().offset(offset + items().size).build()
    }

    override fun nextPage(): FormattedListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<FormattedListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): FormattedListParams = params

    /** The response that this page was parsed from. */
    fun response(): FormattedListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [FormattedListPage].
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

    /** A builder for [FormattedListPage]. */
    class Builder internal constructor() {

        private var service: FormattedService? = null
        private var params: FormattedListParams? = null
        private var response: FormattedListPageResponse? = null

        @JvmSynthetic
        internal fun from(formattedListPage: FormattedListPage) = apply {
            service = formattedListPage.service
            params = formattedListPage.params
            response = formattedListPage.response
        }

        fun service(service: FormattedService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: FormattedListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: FormattedListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [FormattedListPage].
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
        fun build(): FormattedListPage =
            FormattedListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FormattedListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "FormattedListPage{service=$service, params=$params, response=$response}"
}
