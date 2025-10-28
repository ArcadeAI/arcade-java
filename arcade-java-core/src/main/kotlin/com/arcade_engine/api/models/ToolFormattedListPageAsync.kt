// File generated from our OpenAPI spec by Stainless.

package com.arcade_engine.api.models

import com.arcade_engine.api.core.ExcludeMissing
import com.arcade_engine.api.core.JsonField
import com.arcade_engine.api.core.JsonMissing
import com.arcade_engine.api.core.JsonValue
import com.arcade_engine.api.core.NoAutoDetect
import com.arcade_engine.api.core.immutableEmptyMap
import com.arcade_engine.api.core.toImmutable
import com.arcade_engine.api.services.async.tools.FormattedServiceAsync
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

/**
 * Returns a page of tools from the engine configuration, optionally filtered by toolkit, formatted
 * for a specific provider
 */
class ToolFormattedListPageAsync
private constructor(
    private val formattedService: FormattedServiceAsync,
    private val params: ToolFormattedListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun items(): List<ToolFormattedListResponse> = response().items()

    fun totalCount(): Optional<Long> = response().totalCount()

    fun offset(): Optional<Long> = response().offset()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ToolFormattedListPageAsync && formattedService == other.formattedService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(formattedService, params, response) /* spotless:on */

    override fun toString() =
        "ToolFormattedListPageAsync{formattedService=$formattedService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        return offset().orElse(0) + items().count() < totalCount().orElse(Long.MAX_VALUE)
    }

    fun getNextPageParams(): Optional<ToolFormattedListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            ToolFormattedListParams.builder()
                .from(params)
                .offset(offset().orElse(0) + items().count())
                .build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<ToolFormattedListPageAsync>> {
        return getNextPageParams()
            .map { formattedService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            formattedService: FormattedServiceAsync,
            params: ToolFormattedListParams,
            response: Response,
        ) = ToolFormattedListPageAsync(formattedService, params, response)
    }

    @NoAutoDetect
    class Response
    @JsonCreator
    constructor(
        @JsonProperty("items")
        private val items: JsonField<List<ToolFormattedListResponse>> = JsonMissing.of(),
        @JsonProperty("total_count") private val totalCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("offset") private val offset: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun items(): List<ToolFormattedListResponse> = items.getNullable("items") ?: listOf()

        fun totalCount(): Optional<Long> =
            Optional.ofNullable(totalCount.getNullable("total_count"))

        fun offset(): Optional<Long> = Optional.ofNullable(offset.getNullable("offset"))

        @JsonProperty("items")
        fun _items(): Optional<JsonField<List<ToolFormattedListResponse>>> =
            Optional.ofNullable(items)

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

            private var items: JsonField<List<ToolFormattedListResponse>> = JsonMissing.of()
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

            fun items(items: List<ToolFormattedListResponse>) = items(JsonField.of(items))

            fun items(items: JsonField<List<ToolFormattedListResponse>>) = apply {
                this.items = items
            }

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

    class AutoPager(private val firstPage: ToolFormattedListPageAsync) {

        fun forEach(
            action: Predicate<ToolFormattedListResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<ToolFormattedListPageAsync>>.forEach(
                action: (ToolFormattedListResponse) -> Boolean,
                executor: Executor,
            ): CompletableFuture<Void> =
                thenComposeAsync(
                    { page ->
                        page
                            .filter { it.items().all(action) }
                            .map { it.getNextPage().forEach(action, executor) }
                            .orElseGet { CompletableFuture.completedFuture(null) }
                    },
                    executor,
                )
            return CompletableFuture.completedFuture(Optional.of(firstPage))
                .forEach(action::test, executor)
        }

        fun toList(executor: Executor): CompletableFuture<List<ToolFormattedListResponse>> {
            val values = mutableListOf<ToolFormattedListResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
