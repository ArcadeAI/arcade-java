// File generated from our OpenAPI spec by Stainless.

package org.arcadeai.api.models

import java.util.Objects
import java.util.Optional
import org.arcadeai.api.core.NoAutoDetect
import org.arcadeai.api.core.Params
import org.arcadeai.api.core.http.Headers
import org.arcadeai.api.core.http.QueryParams

/** Returns a page of tools from the engine configuration, optionally filtered by toolkit */
class ToolListParams
private constructor(
    private val limit: Long?,
    private val offset: Long?,
    private val toolkit: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Number of items to return (default: 25, max: 100) */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /** Offset from the start of the list (default: 0) */
    fun offset(): Optional<Long> = Optional.ofNullable(offset)

    /** Toolkit name */
    fun toolkit(): Optional<String> = Optional.ofNullable(toolkit)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.limit?.let { queryParams.put("limit", listOf(it.toString())) }
        this.offset?.let { queryParams.put("offset", listOf(it.toString())) }
        this.toolkit?.let { queryParams.put("toolkit", listOf(it.toString())) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ToolListParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var limit: Long? = null
        private var offset: Long? = null
        private var toolkit: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(toolListParams: ToolListParams) = apply {
            limit = toolListParams.limit
            offset = toolListParams.offset
            toolkit = toolListParams.toolkit
            additionalHeaders = toolListParams.additionalHeaders.toBuilder()
            additionalQueryParams = toolListParams.additionalQueryParams.toBuilder()
        }

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

        /** Toolkit name */
        fun toolkit(toolkit: String?) = apply { this.toolkit = toolkit }

        /** Toolkit name */
        fun toolkit(toolkit: Optional<String>) = toolkit(toolkit.orElse(null))

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

        fun build(): ToolListParams =
            ToolListParams(
                limit,
                offset,
                toolkit,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ToolListParams && limit == other.limit && offset == other.offset && toolkit == other.toolkit && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(limit, offset, toolkit, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ToolListParams{limit=$limit, offset=$offset, toolkit=$toolkit, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
