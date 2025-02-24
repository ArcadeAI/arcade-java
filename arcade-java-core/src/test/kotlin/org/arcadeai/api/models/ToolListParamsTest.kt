// File generated from our OpenAPI spec by Stainless.

package org.arcadeai.api.models

import org.arcadeai.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ToolListParamsTest {

    @Test
    fun create() {
        ToolListParams.builder().limit(0L).offset(0L).toolkit("toolkit").build()
    }

    @Test
    fun queryParams() {
        val params = ToolListParams.builder().limit(0L).offset(0L).toolkit("toolkit").build()
        val expected = QueryParams.builder()
        expected.put("limit", "0")
        expected.put("offset", "0")
        expected.put("toolkit", "toolkit")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ToolListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
