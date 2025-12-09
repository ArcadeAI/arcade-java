// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models.tools.scheduled

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScheduledGetParamsTest {

    @Test
    fun create() {
        ScheduledGetParams.builder().id("id").build()
    }

    @Test
    fun pathParams() {
        val params = ScheduledGetParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
