// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models.tools

import dev.arcade.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ToolListParamsTest {

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

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("include_all_versions", "true")
                    .put("include_format", listOf("arcade").joinToString(","))
                    .put("limit", "0")
                    .put("offset", "0")
                    .put("toolkit", "toolkit")
                    .put("user_id", "user_id")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ToolListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
