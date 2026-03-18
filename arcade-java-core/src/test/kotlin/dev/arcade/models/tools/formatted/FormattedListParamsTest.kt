// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models.tools.formatted

import dev.arcade.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FormattedListParamsTest {

    @Test
    fun create() {
        FormattedListParams.builder()
            .filter("filter")
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
            FormattedListParams.builder()
                .filter("filter")
                .format("format")
                .includeAllVersions(true)
                .limit(0L)
                .offset(0L)
                .toolkit("toolkit")
                .userId("user_id")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter", "filter")
                    .put("format", "format")
                    .put("include_all_versions", "true")
                    .put("limit", "0")
                    .put("offset", "0")
                    .put("toolkit", "toolkit")
                    .put("user_id", "user_id")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = FormattedListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
