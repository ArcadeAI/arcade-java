// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models.tools.formatted

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.arcade.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FormattedListResponseTest {

    @Test
    fun create() {
        val formattedListResponse = FormattedListResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val formattedListResponse = FormattedListResponse.builder().build()

        val roundtrippedFormattedListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(formattedListResponse),
                jacksonTypeRef<FormattedListResponse>(),
            )

        assertThat(roundtrippedFormattedListResponse).isEqualTo(formattedListResponse)
    }
}
