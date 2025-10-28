// File generated from our OpenAPI spec by Stainless.

package com.arcade_engine.api.models

import com.arcade_engine.api.core.ExcludeMissing
import com.arcade_engine.api.core.JsonField
import com.arcade_engine.api.core.JsonMissing
import com.arcade_engine.api.core.JsonValue
import com.arcade_engine.api.core.NoAutoDetect
import com.arcade_engine.api.core.immutableEmptyMap
import com.arcade_engine.api.core.toImmutable
import com.arcade_engine.api.services.blocking.tools.ScheduledService
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport

/** Returns a page of scheduled tool executions */
class ToolScheduledListPage
private constructor(
    private val scheduledService: ScheduledService,
    private val params: ToolScheduledListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun items(): List<ToolExecution> = response().items()

    fun totalCount(): Optional<Long> = response().totalCount()

    fun offset(): Optional<Long> = response().offset()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ToolScheduledListPage && scheduledService == other.scheduledService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(scheduledService, params, response) /* spotless:on */

    override fun toString() =
        "ToolScheduledListPage{scheduledService=$scheduledService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        return offset().orElse(0) + items().count() < totalCount().orElse(Long.MAX_VALUE)
    }

    fun getNextPageParams(): Optional<ToolScheduledListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            ToolScheduledListParams.builder()
                .from(params)
                .offset(offset().orElse(0) + items().count())
                .build()
        )
    }

    fun getNextPage(): Optional<ToolScheduledListPage> {
        return getNextPageParams().map { scheduledService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            scheduledService: ScheduledService,
            params: ToolScheduledListParams,
            response: Response,
        ) = ToolScheduledListPage(scheduledService, params, response)
    }

    @NoAutoDetect
    class Response
    @JsonCreator
    constructor(
        @JsonProperty("items") private val items: JsonField<List<ToolExecution>> = JsonMissing.of(),
        @JsonProperty("total_count") private val totalCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("offset") private val offset: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun items(): List<ToolExecution> = items.getNullable("items") ?: listOf()

        fun totalCount(): Optional<Long> =
            Optional.ofNullable(totalCount.getNullable("total_count"))

        fun offset(): Optional<Long> = Optional.ofNullable(offset.getNullable("offset"))

        @JsonProperty("items")
        fun _items(): Optional<JsonField<List<ToolExecution>>> = Optional.ofNullable(items)

        @JsonProperty("total_count")
        fun _totalCount(): Optional<JsonField<Long>> = Optional.ofNullable(totalCount)

        @JsonProperty("offset")
        fun _offset(): Optional<JsonField<Long>> = Optional.ofNullable(offset)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Response = apply {
            if (validated) {
                return@apply
            }

            items().map { it.validate() }
            totalCount()
            offset()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Response && items == other.items && totalCount == other.totalCount && offset == other.offset && additionalProperties == other.additionalProperties /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(items, totalCount, offset, additionalProperties) /* spotless:on */

        override fun toString() =
            "Response{items=$items, totalCount=$totalCount, offset=$offset, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var items: JsonField<List<ToolExecution>> = JsonMissing.of()
            private var totalCount: JsonField<Long> = JsonMissing.of()
            private var offset: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(page: Response) = apply {
                this.items = page.items
                this.totalCount = page.totalCount
                this.offset = page.offset
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun items(items: List<ToolExecution>) = items(JsonField.of(items))

            fun items(items: JsonField<List<ToolExecution>>) = apply { this.items = items }

            fun totalCount(totalCount: Long) = totalCount(JsonField.of(totalCount))

            fun totalCount(totalCount: JsonField<Long>) = apply { this.totalCount = totalCount }

            fun offset(offset: Long) = offset(JsonField.of(offset))

            fun offset(offset: JsonField<Long>) = apply { this.offset = offset }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun build() = Response(items, totalCount, offset, additionalProperties.toImmutable())
        }
    }

    class AutoPager(private val firstPage: ToolScheduledListPage) : Iterable<ToolExecution> {

        override fun iterator(): Iterator<ToolExecution> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.items().size) {
                    yield(page.items()[index++])
                }
                page = page.getNextPage().orElse(null) ?: break
                index = 0
            }
        }

        fun stream(): Stream<ToolExecution> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
