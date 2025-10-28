// File generated from our OpenAPI spec by Stainless.

package com.arcade_engine.api.models

import com.arcade_engine.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ToolGetParamsTest {

    @Test
    fun create() {
        ToolGetParams.builder()
            .name("name")
            .addIncludeFormat(ToolGetParams.IncludeFormat.ARCADE)
            .userId("user_id")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ToolGetParams.builder()
                .name("name")
                .addIncludeFormat(ToolGetParams.IncludeFormat.ARCADE)
                .userId("user_id")
                .build()
        val expected = QueryParams.builder()
        expected.put("include_format", ToolGetParams.IncludeFormat.ARCADE.toString())
        expected.put("user_id", "user_id")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ToolGetParams.builder().name("name").build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getPathParam() {
        val params = ToolGetParams.builder().name("name").build()
        assertThat(params).isNotNull
        // path param "name"
        assertThat(params.getPathParam(0)).isEqualTo("name")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
