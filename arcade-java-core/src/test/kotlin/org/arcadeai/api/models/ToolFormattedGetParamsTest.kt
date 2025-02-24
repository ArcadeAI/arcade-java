// File generated from our OpenAPI spec by Stainless.

package org.arcadeai.api.models

import org.arcadeai.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ToolFormattedGetParamsTest {

    @Test
    fun create() {
        ToolFormattedGetParams.builder().name("name").format("format").build()
    }

    @Test
    fun queryParams() {
        val params = ToolFormattedGetParams.builder().name("name").format("format").build()
        val expected = QueryParams.builder()
        expected.put("format", "format")
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
