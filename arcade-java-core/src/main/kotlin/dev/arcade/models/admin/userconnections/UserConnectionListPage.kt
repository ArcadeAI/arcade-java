// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models.admin.userconnections

import dev.arcade.core.AutoPager
import dev.arcade.core.Page
import dev.arcade.core.checkRequired
import dev.arcade.services.blocking.admin.UserConnectionService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see UserConnectionService.list */
class UserConnectionListPage
private constructor(
    private val service: UserConnectionService,
    private val params: UserConnectionListParams,
    private val response: UserConnectionListPageResponse,
) : Page<UserConnectionResponse> {

    /**
     * Delegates to [UserConnectionListPageResponse], but gracefully handles missing data.
     *
     * @see UserConnectionListPageResponse.items
     */
    override fun items(): List<UserConnectionResponse> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [UserConnectionListPageResponse], but gracefully handles missing data.
     *
     * @see UserConnectionListPageResponse.totalCount
     */
    fun totalCount(): Optional<Long> = response._totalCount().getOptional("total_count")

    /**
     * Delegates to [UserConnectionListPageResponse], but gracefully handles missing data.
     *
     * @see UserConnectionListPageResponse.offset
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

    fun nextPageParams(): UserConnectionListParams {
        val offset = offset().getOrDefault(0)
        return params.toBuilder().offset(offset + items().size).build()
    }

    override fun nextPage(): UserConnectionListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<UserConnectionResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): UserConnectionListParams = params

    /** The response that this page was parsed from. */
    fun response(): UserConnectionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [UserConnectionListPage].
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

    /** A builder for [UserConnectionListPage]. */
    class Builder internal constructor() {

        private var service: UserConnectionService? = null
        private var params: UserConnectionListParams? = null
        private var response: UserConnectionListPageResponse? = null

        @JvmSynthetic
        internal fun from(userConnectionListPage: UserConnectionListPage) = apply {
            service = userConnectionListPage.service
            params = userConnectionListPage.params
            response = userConnectionListPage.response
        }

        fun service(service: UserConnectionService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: UserConnectionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: UserConnectionListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [UserConnectionListPage].
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
        fun build(): UserConnectionListPage =
            UserConnectionListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UserConnectionListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "UserConnectionListPage{service=$service, params=$params, response=$response}"
}
