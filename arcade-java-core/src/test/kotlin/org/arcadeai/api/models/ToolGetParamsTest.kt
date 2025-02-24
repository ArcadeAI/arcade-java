// File generated from our OpenAPI spec by Stainless.

package org.arcadeai.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ToolGetParamsTest {

    @Test
    fun create() {
        ToolGetParams.builder().name("name").build()
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
