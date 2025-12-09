// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models.admin.userconnections

import dev.arcade.core.AutoPagerAsync
import dev.arcade.core.PageAsync
import dev.arcade.core.checkRequired
import dev.arcade.services.async.admin.UserConnectionServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see UserConnectionServiceAsync.list */
class UserConnectionListPageAsync
private constructor(
    private val service: UserConnectionServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: UserConnectionListParams,
    private val response: UserConnectionListPageResponse,
) : PageAsync<UserConnectionResponse> {

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
        val totalCount = totalCount().getOrDefault(Long.MAX_VALUE)
        return offset + items().size < totalCount
    }

    fun nextPageParams(): UserConnectionListParams {
        val offset = offset().getOrDefault(0)
        return params.toBuilder().offset(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<UserConnectionListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<UserConnectionResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): UserConnectionListParams = params

    /** The response that this page was parsed from. */
    fun response(): UserConnectionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [UserConnectionListPageAsync].
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

    /** A builder for [UserConnectionListPageAsync]. */
    class Builder internal constructor() {

        private var service: UserConnectionServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: UserConnectionListParams? = null
        private var response: UserConnectionListPageResponse? = null

        @JvmSynthetic
        internal fun from(userConnectionListPageAsync: UserConnectionListPageAsync) = apply {
            service = userConnectionListPageAsync.service
            streamHandlerExecutor = userConnectionListPageAsync.streamHandlerExecutor
            params = userConnectionListPageAsync.params
            response = userConnectionListPageAsync.response
        }

        fun service(service: UserConnectionServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: UserConnectionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: UserConnectionListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [UserConnectionListPageAsync].
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
        fun build(): UserConnectionListPageAsync =
            UserConnectionListPageAsync(
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

        return other is UserConnectionListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "UserConnectionListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
