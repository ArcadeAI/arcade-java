// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models.workers

import dev.arcade.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WorkerListParamsTest {

    @Test
    fun create() {
        WorkerListParams.builder().limit(0L).offset(0L).build()
    }

    @Test
    fun queryParams() {
        val params = WorkerListParams.builder().limit(0L).offset(0L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("limit", "0").put("offset", "0").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = WorkerListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
