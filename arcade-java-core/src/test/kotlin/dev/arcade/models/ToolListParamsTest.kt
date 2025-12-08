// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models

import dev.arcade.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ToolListParamsTest {

    @Test
    fun create() {
        ToolListParams.builder()
            .includeAllVersions(true)
            .addIncludeFormat(ToolListParams.IncludeFormat.ARCADE)
            .limit(0L)
            .offset(0L)
            .toolkit("toolkit")
            .userId("user_id")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ToolListParams.builder()
                .includeAllVersions(true)
                .addIncludeFormat(ToolListParams.IncludeFormat.ARCADE)
                .limit(0L)
                .offset(0L)
                .toolkit("toolkit")
                .userId("user_id")
                .build()
        val expected = QueryParams.builder()
        expected.put("include_all_versions", "true")
        expected.put("include_format", ToolListParams.IncludeFormat.ARCADE.toString())
        expected.put("limit", "0")
        expected.put("offset", "0")
        expected.put("toolkit", "toolkit")
        expected.put("user_id", "user_id")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ToolListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
