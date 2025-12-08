// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models

import dev.arcade.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ToolFormattedListParamsTest {

    @Test
    fun create() {
        ToolFormattedListParams.builder()
            .format("format")
            .includeAllVersions(true)
            .limit(0L)
            .offset(0L)
            .toolkit("toolkit")
            .userId("user_id")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ToolFormattedListParams.builder()
                .format("format")
                .includeAllVersions(true)
                .limit(0L)
                .offset(0L)
                .toolkit("toolkit")
                .userId("user_id")
                .build()
        val expected = QueryParams.builder()
        expected.put("format", "format")
        expected.put("include_all_versions", "true")
        expected.put("limit", "0")
        expected.put("offset", "0")
        expected.put("toolkit", "toolkit")
        expected.put("user_id", "user_id")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ToolFormattedListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
