// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models.tools

import com.fasterxml.jackson.annotation.JsonCreator
import dev.arcade.core.Enum
import dev.arcade.core.JsonField
import dev.arcade.core.Params
import dev.arcade.core.http.Headers
import dev.arcade.core.http.QueryParams
import dev.arcade.core.toImmutable
import dev.arcade.errors.ArcadeInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Returns a page of tools from the engine configuration, optionally filtered by toolkit and/or
 * metadata
 */
class ToolListParams
private constructor(
    private val filter: String?,
    private val includeAllVersions: Boolean?,
    private val includeFormat: List<IncludeFormat>?,
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

    /** Include all versions of each tool */
    fun includeAllVersions(): Optional<Boolean> = Optional.ofNullable(includeAllVersions)

    /** Comma separated tool formats that will be included in the response. */
    fun includeFormat(): Optional<List<IncludeFormat>> = Optional.ofNullable(includeFormat)

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

        @JvmStatic fun none(): ToolListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [ToolListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ToolListParams]. */
    class Builder internal constructor() {

        private var filter: String? = null
        private var includeAllVersions: Boolean? = null
        private var includeFormat: MutableList<IncludeFormat>? = null
        private var limit: Long? = null
        private var offset: Long? = null
        private var toolkit: String? = null
        private var userId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(toolListParams: ToolListParams) = apply {
            filter = toolListParams.filter
            includeAllVersions = toolListParams.includeAllVersions
            includeFormat = toolListParams.includeFormat?.toMutableList()
            limit = toolListParams.limit
            offset = toolListParams.offset
            toolkit = toolListParams.toolkit
            userId = toolListParams.userId
            additionalHeaders = toolListParams.additionalHeaders.toBuilder()
            additionalQueryParams = toolListParams.additionalQueryParams.toBuilder()
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

        /** Comma separated tool formats that will be included in the response. */
        fun includeFormat(includeFormat: List<IncludeFormat>?) = apply {
            this.includeFormat = includeFormat?.toMutableList()
        }

        /** Alias for calling [Builder.includeFormat] with `includeFormat.orElse(null)`. */
        fun includeFormat(includeFormat: Optional<List<IncludeFormat>>) =
            includeFormat(includeFormat.getOrNull())

        /**
         * Adds a single [IncludeFormat] to [Builder.includeFormat].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addIncludeFormat(includeFormat: IncludeFormat) = apply {
            this.includeFormat =
                (this.includeFormat ?: mutableListOf()).apply { add(includeFormat) }
        }

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
         * Returns an immutable instance of [ToolListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ToolListParams =
            ToolListParams(
                filter,
                includeAllVersions,
                includeFormat?.toImmutable(),
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
                includeAllVersions?.let { put("include_all_versions", it.toString()) }
                includeFormat?.let { put("include_format", it.joinToString(",") { it.toString() }) }
                limit?.let { put("limit", it.toString()) }
                offset?.let { put("offset", it.toString()) }
                toolkit?.let { put("toolkit", it) }
                userId?.let { put("user_id", it) }
                putAll(additionalQueryParams)
            }
            .build()

    class IncludeFormat @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ARCADE = of("arcade")

            @JvmField val OPENAI = of("openai")

            @JvmField val ANTHROPIC = of("anthropic")

            @JvmStatic fun of(value: String) = IncludeFormat(JsonField.of(value))
        }

        /** An enum containing [IncludeFormat]'s known values. */
        enum class Known {
            ARCADE,
            OPENAI,
            ANTHROPIC,
        }

        /**
         * An enum containing [IncludeFormat]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [IncludeFormat] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ARCADE,
            OPENAI,
            ANTHROPIC,
            /**
             * An enum member indicating that [IncludeFormat] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                ARCADE -> Value.ARCADE
                OPENAI -> Value.OPENAI
                ANTHROPIC -> Value.ANTHROPIC
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws ArcadeInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                ARCADE -> Known.ARCADE
                OPENAI -> Known.OPENAI
                ANTHROPIC -> Known.ANTHROPIC
                else -> throw ArcadeInvalidDataException("Unknown IncludeFormat: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws ArcadeInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { ArcadeInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): IncludeFormat = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: ArcadeInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is IncludeFormat && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ToolListParams &&
            filter == other.filter &&
            includeAllVersions == other.includeAllVersions &&
            includeFormat == other.includeFormat &&
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
            includeAllVersions,
            includeFormat,
            limit,
            offset,
            toolkit,
            userId,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "ToolListParams{filter=$filter, includeAllVersions=$includeAllVersions, includeFormat=$includeFormat, limit=$limit, offset=$offset, toolkit=$toolkit, userId=$userId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
