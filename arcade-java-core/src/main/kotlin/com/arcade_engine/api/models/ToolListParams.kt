// File generated from our OpenAPI spec by Stainless.

package com.arcade_engine.api.models

import com.arcade_engine.api.core.Enum
import com.arcade_engine.api.core.JsonField
import com.arcade_engine.api.core.NoAutoDetect
import com.arcade_engine.api.core.Params
import com.arcade_engine.api.core.http.Headers
import com.arcade_engine.api.core.http.QueryParams
import com.arcade_engine.api.core.toImmutable
import com.arcade_engine.api.errors.ArcadeInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator
import java.util.Objects
import java.util.Optional

/** Returns a page of tools from the engine configuration, optionally filtered by toolkit */
class ToolListParams
private constructor(
    private val includeFormat: List<IncludeFormat>?,
    private val limit: Long?,
    private val offset: Long?,
    private val toolkit: String?,
    private val userId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

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

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.includeFormat?.let {
            queryParams.put("include_format", listOf(it.joinToString(separator = ",")))
        }
        this.limit?.let { queryParams.put("limit", listOf(it.toString())) }
        this.offset?.let { queryParams.put("offset", listOf(it.toString())) }
        this.toolkit?.let { queryParams.put("toolkit", listOf(it.toString())) }
        this.userId?.let { queryParams.put("user_id", listOf(it.toString())) }
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

        private var includeFormat: MutableList<IncludeFormat>? = null
        private var limit: Long? = null
        private var offset: Long? = null
        private var toolkit: String? = null
        private var userId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(toolListParams: ToolListParams) = apply {
            includeFormat = toolListParams.includeFormat?.toMutableList()
            limit = toolListParams.limit
            offset = toolListParams.offset
            toolkit = toolListParams.toolkit
            userId = toolListParams.userId
            additionalHeaders = toolListParams.additionalHeaders.toBuilder()
            additionalQueryParams = toolListParams.additionalQueryParams.toBuilder()
        }

        /** Comma separated tool formats that will be included in the response. */
        fun includeFormat(includeFormat: List<IncludeFormat>?) = apply {
            this.includeFormat = includeFormat?.toMutableList()
        }

        /** Comma separated tool formats that will be included in the response. */
        fun includeFormat(includeFormat: Optional<List<IncludeFormat>>) =
            includeFormat(includeFormat.orElse(null))

        /** Comma separated tool formats that will be included in the response. */
        fun addIncludeFormat(includeFormat: IncludeFormat) = apply {
            this.includeFormat =
                (this.includeFormat ?: mutableListOf()).apply { add(includeFormat) }
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

        /** User ID */
        fun userId(userId: String?) = apply { this.userId = userId }

        /** User ID */
        fun userId(userId: Optional<String>) = userId(userId.orElse(null))

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
                includeFormat?.toImmutable(),
                limit,
                offset,
                toolkit,
                userId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is IncludeFormat && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ToolListParams && includeFormat == other.includeFormat && limit == other.limit && offset == other.offset && toolkit == other.toolkit && userId == other.userId && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(includeFormat, limit, offset, toolkit, userId, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ToolListParams{includeFormat=$includeFormat, limit=$limit, offset=$offset, toolkit=$toolkit, userId=$userId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
