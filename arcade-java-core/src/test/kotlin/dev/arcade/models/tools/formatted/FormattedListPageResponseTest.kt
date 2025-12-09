// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models.tools.formatted

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.arcade.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FormattedListPageResponseTest {

    @Test
    fun create() {
        val formattedListPageResponse =
            FormattedListPageResponse.builder()
                .addItem(FormattedListResponse.builder().build())
                .limit(0L)
                .offset(0L)
                .pageCount(0L)
                .totalCount(0L)
                .build()

        assertThat(formattedListPageResponse.items().getOrNull())
            .containsExactly(FormattedListResponse.builder().build())
        assertThat(formattedListPageResponse.limit()).contains(0L)
        assertThat(formattedListPageResponse.offset()).contains(0L)
        assertThat(formattedListPageResponse.pageCount()).contains(0L)
        assertThat(formattedListPageResponse.totalCount()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val formattedListPageResponse =
            FormattedListPageResponse.builder()
                .addItem(FormattedListResponse.builder().build())
                .limit(0L)
                .offset(0L)
                .pageCount(0L)
                .totalCount(0L)
                .build()

        val roundtrippedFormattedListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(formattedListPageResponse),
                jacksonTypeRef<FormattedListPageResponse>(),
            )

        assertThat(roundtrippedFormattedListPageResponse).isEqualTo(formattedListPageResponse)
    }
}
