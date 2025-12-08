// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models

import dev.arcade.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ToolFormattedGetParamsTest {

    @Test
    fun create() {
        ToolFormattedGetParams.builder().name("name").format("format").userId("user_id").build()
    }

    @Test
    fun queryParams() {
        val params =
            ToolFormattedGetParams.builder().name("name").format("format").userId("user_id").build()
        val expected = QueryParams.builder()
        expected.put("format", "format")
        expected.put("user_id", "user_id")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ToolFormattedGetParams.builder().name("name").build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getPathParam() {
        val params = ToolFormattedGetParams.builder().name("name").build()
        assertThat(params).isNotNull
        // path param "name"
        assertThat(params.getPathParam(0)).isEqualTo("name")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
