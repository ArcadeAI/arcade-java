// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models.tools.formatted

import dev.arcade.core.Params
import dev.arcade.core.http.Headers
import dev.arcade.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Returns a page of tools from the engine configuration, optionally filtered by toolkit, formatted
 * for a specific provider
 */
class FormattedListParams
private constructor(
    private val filter: String?,
    private val format: String?,
    private val includeAllVersions: Boolean?,
    private val limit: Long?,
    private val offset: Long?,
    private val toolkit: String?,
    private val userId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * JSON metadata filter. Array fields (service_domains, operations): shorthand array or object
     * with any_of/all_of/none_of operators (case-insensitive). Boolean fields: read_only,
     * destructive, idempotent, open_world. Extras: case-sensitive key-value subset match.
     */
    fun filter(): Optional<String> = Optional.ofNullable(filter)

    /** Provider format */
    fun format(): Optional<String> = Optional.ofNullable(format)

    /** Include all versions of each tool */
    fun includeAllVersions(): Optional<Boolean> = Optional.ofNullable(includeAllVersions)

    /** Number of items to return (default: 25, max: 100) */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /** Offset from the start of the list (default: 0) */
    fun offset(): Optional<Long> = Optional.ofNullable(offset)

    /** Toolkit name */
    fun toolkit(): Optional<String> = Optional.ofNullable(toolkit)

    /** User ID */
    fun userId(): Optional<String> = Optional.ofNullable(userId)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): FormattedListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [FormattedListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FormattedListParams]. */
    class Builder internal constructor() {

        private var filter: String? = null
        private var format: String? = null
        private var includeAllVersions: Boolean? = null
        private var limit: Long? = null
        private var offset: Long? = null
        private var toolkit: String? = null
        private var userId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(formattedListParams: FormattedListParams) = apply {
            filter = formattedListParams.filter
            format = formattedListParams.format
            includeAllVersions = formattedListParams.includeAllVersions
            limit = formattedListParams.limit
            offset = formattedListParams.offset
            toolkit = formattedListParams.toolkit
            userId = formattedListParams.userId
            additionalHeaders = formattedListParams.additionalHeaders.toBuilder()
            additionalQueryParams = formattedListParams.additionalQueryParams.toBuilder()
        }

        /**
         * JSON metadata filter. Array fields (service_domains, operations): shorthand array or
         * object with any_of/all_of/none_of operators (case-insensitive). Boolean fields:
         * read_only, destructive, idempotent, open_world. Extras: case-sensitive key-value subset
         * match.
         */
        fun filter(filter: String?) = apply { this.filter = filter }

        /** Alias for calling [Builder.filter] with `filter.orElse(null)`. */
        fun filter(filter: Optional<String>) = filter(filter.getOrNull())

        /** Provider format */
        fun format(format: String?) = apply { this.format = format }

        /** Alias for calling [Builder.format] with `format.orElse(null)`. */
        fun format(format: Optional<String>) = format(format.getOrNull())

        /** Include all versions of each tool */
        fun includeAllVersions(includeAllVersions: Boolean?) = apply {
            this.includeAllVersions = includeAllVersions
        }

        /**
         * Alias for [Builder.includeAllVersions].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun includeAllVersions(includeAllVersions: Boolean) =
            includeAllVersions(includeAllVersions as Boolean?)

        /**
         * Alias for calling [Builder.includeAllVersions] with `includeAllVersions.orElse(null)`.
         */
        fun includeAllVersions(includeAllVersions: Optional<Boolean>) =
            includeAllVersions(includeAllVersions.getOrNull())

        /** Number of items to return (default: 25, max: 100) */
        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Long>) = limit(limit.getOrNull())

        /** Offset from the start of the list (default: 0) */
        fun offset(offset: Long?) = apply { this.offset = offset }

        /**
         * Alias for [Builder.offset].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun offset(offset: Long) = offset(offset as Long?)

        /** Alias for calling [Builder.offset] with `offset.orElse(null)`. */
        fun offset(offset: Optional<Long>) = offset(offset.getOrNull())

        /** Toolkit name */
        fun toolkit(toolkit: String?) = apply { this.toolkit = toolkit }

        /** Alias for calling [Builder.toolkit] with `toolkit.orElse(null)`. */
        fun toolkit(toolkit: Optional<String>) = toolkit(toolkit.getOrNull())

        /** User ID */
        fun userId(userId: String?) = apply { this.userId = userId }

        /** Alias for calling [Builder.userId] with `userId.orElse(null)`. */
        fun userId(userId: Optional<String>) = userId(userId.getOrNull())

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

        /**
         * Returns an immutable instance of [FormattedListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): FormattedListParams =
            FormattedListParams(
                filter,
                format,
                includeAllVersions,
                limit,
                offset,
                toolkit,
                userId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                filter?.let { put("filter", it) }
                format?.let { put("format", it) }
                includeAllVersions?.let { put("include_all_versions", it.toString()) }
                limit?.let { put("limit", it.toString()) }
                offset?.let { put("offset", it.toString()) }
                toolkit?.let { put("toolkit", it) }
                userId?.let { put("user_id", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FormattedListParams &&
            filter == other.filter &&
            format == other.format &&
            includeAllVersions == other.includeAllVersions &&
            limit == other.limit &&
            offset == other.offset &&
            toolkit == other.toolkit &&
            userId == other.userId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            filter,
            format,
            includeAllVersions,
            limit,
            offset,
            toolkit,
            userId,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "FormattedListParams{filter=$filter, format=$format, includeAllVersions=$includeAllVersions, limit=$limit, offset=$offset, toolkit=$toolkit, userId=$userId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
