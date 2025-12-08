// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models

import dev.arcade.core.NoAutoDetect
import dev.arcade.core.Params
import dev.arcade.core.checkRequired
import dev.arcade.core.http.Headers
import dev.arcade.core.http.QueryParams
import java.util.Objects
import java.util.Optional

/** Returns a page of tools */
class WorkerToolsParams
private constructor(
    private val id: String,
    private val limit: Long?,
    private val offset: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): String = id

    /** Number of items to return (default: 25, max: 100) */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /** Offset from the start of the list (default: 0) */
    fun offset(): Optional<Long> = Optional.ofNullable(offset)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.limit?.let { queryParams.put("limit", listOf(it.toString())) }
        this.offset?.let { queryParams.put("offset", listOf(it.toString())) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> id
            else -> ""
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WorkerToolsParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var id: String? = null
        private var limit: Long? = null
        private var offset: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(workerToolsParams: WorkerToolsParams) = apply {
            id = workerToolsParams.id
            limit = workerToolsParams.limit
            offset = workerToolsParams.offset
            additionalHeaders = workerToolsParams.additionalHeaders.toBuilder()
            additionalQueryParams = workerToolsParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String) = apply { this.id = id }

        /** Number of items to return (default: 25, max: 100) */
        fun limit(limit: Long?) = apply { this.limit = limit }

        /** Number of items to return (default: 25, max: 100) */
        fun limit(limit: Long) = limit(limit as Long?)

        /** Number of items to return (default: 25, max: 100) */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun limit(limit: Optional<Long>) = limit(limit.orElse(null) as Long?)

        /** Offset from the start of the list (default: 0) */
        fun offset(offset: Long?) = apply { this.offset = offset }

        /** Offset from the start of the list (default: 0) */
        fun offset(offset: Long) = offset(offset as Long?)

        /** Offset from the start of the list (default: 0) */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun offset(offset: Optional<Long>) = offset(offset.orElse(null) as Long?)

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun build(): WorkerToolsParams =
            WorkerToolsParams(
                checkRequired("id", id),
                limit,
                offset,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is WorkerToolsParams && id == other.id && limit == other.limit && offset == other.offset && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(id, limit, offset, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "WorkerToolsParams{id=$id, limit=$limit, offset=$offset, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
