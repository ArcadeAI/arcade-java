// File generated from our OpenAPI spec by Stainless.

package com.arcade_engine.api.models

import com.arcade_engine.api.core.ExcludeMissing
import com.arcade_engine.api.core.JsonField
import com.arcade_engine.api.core.JsonMissing
import com.arcade_engine.api.core.JsonValue
import com.arcade_engine.api.core.NoAutoDetect
import com.arcade_engine.api.core.immutableEmptyMap
import com.arcade_engine.api.core.toImmutable
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class AdminAuthProviderListResponse
@JsonCreator
private constructor(
    @JsonProperty("items")
    @ExcludeMissing
    private val items: JsonField<List<AuthProviderResponse>> = JsonMissing.of(),
    @JsonProperty("limit") @ExcludeMissing private val limit: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("offset") @ExcludeMissing private val offset: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("page_count")
    @ExcludeMissing
    private val pageCount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("total_count")
    @ExcludeMissing
    private val totalCount: JsonField<Long> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun items(): Optional<List<AuthProviderResponse>> =
        Optional.ofNullable(items.getNullable("items"))

    fun limit(): Optional<Long> = Optional.ofNullable(limit.getNullable("limit"))

    fun offset(): Optional<Long> = Optional.ofNullable(offset.getNullable("offset"))

    fun pageCount(): Optional<Long> = Optional.ofNullable(pageCount.getNullable("page_count"))

    fun totalCount(): Optional<Long> = Optional.ofNullable(totalCount.getNullable("total_count"))

    @JsonProperty("items")
    @ExcludeMissing
    fun _items(): JsonField<List<AuthProviderResponse>> = items

    @JsonProperty("limit") @ExcludeMissing fun _limit(): JsonField<Long> = limit

    @JsonProperty("offset") @ExcludeMissing fun _offset(): JsonField<Long> = offset

    @JsonProperty("page_count") @ExcludeMissing fun _pageCount(): JsonField<Long> = pageCount

    @JsonProperty("total_count") @ExcludeMissing fun _totalCount(): JsonField<Long> = totalCount

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): AdminAuthProviderListResponse = apply {
        if (validated) {
            return@apply
        }

        items().ifPresent { it.forEach { it.validate() } }
        limit()
        offset()
        pageCount()
        totalCount()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AdminAuthProviderListResponse]. */
    class Builder internal constructor() {

        private var items: JsonField<MutableList<AuthProviderResponse>>? = null
        private var limit: JsonField<Long> = JsonMissing.of()
        private var offset: JsonField<Long> = JsonMissing.of()
        private var pageCount: JsonField<Long> = JsonMissing.of()
        private var totalCount: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(adminAuthProviderListResponse: AdminAuthProviderListResponse) = apply {
            items = adminAuthProviderListResponse.items.map { it.toMutableList() }
            limit = adminAuthProviderListResponse.limit
            offset = adminAuthProviderListResponse.offset
            pageCount = adminAuthProviderListResponse.pageCount
            totalCount = adminAuthProviderListResponse.totalCount
            additionalProperties = adminAuthProviderListResponse.additionalProperties.toMutableMap()
        }

        fun items(items: List<AuthProviderResponse>) = items(JsonField.of(items))

        fun items(items: JsonField<List<AuthProviderResponse>>) = apply {
            this.items = items.map { it.toMutableList() }
        }

        fun addItem(item: AuthProviderResponse) = apply {
            items =
                (items ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(item)
                }
        }

        fun limit(limit: Long) = limit(JsonField.of(limit))

        fun limit(limit: JsonField<Long>) = apply { this.limit = limit }

        fun offset(offset: Long) = offset(JsonField.of(offset))

        fun offset(offset: JsonField<Long>) = apply { this.offset = offset }

        fun pageCount(pageCount: Long) = pageCount(JsonField.of(pageCount))

        fun pageCount(pageCount: JsonField<Long>) = apply { this.pageCount = pageCount }

        fun totalCount(totalCount: Long) = totalCount(JsonField.of(totalCount))

        fun totalCount(totalCount: JsonField<Long>) = apply { this.totalCount = totalCount }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        fun build(): AdminAuthProviderListResponse =
            AdminAuthProviderListResponse(
                (items ?: JsonMissing.of()).map { it.toImmutable() },
                limit,
                offset,
                pageCount,
                totalCount,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AdminAuthProviderListResponse && items == other.items && limit == other.limit && offset == other.offset && pageCount == other.pageCount && totalCount == other.totalCount && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(items, limit, offset, pageCount, totalCount, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AdminAuthProviderListResponse{items=$items, limit=$limit, offset=$offset, pageCount=$pageCount, totalCount=$totalCount, additionalProperties=$additionalProperties}"
}
