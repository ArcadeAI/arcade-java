// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models.tools.formatted

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.arcade.core.JsonValue
import dev.arcade.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FormattedGetResponseTest {

    @Test
    fun create() {
        val formattedGetResponse =
            FormattedGetResponse.builder()
                .putAdditionalProperty("foo", JsonValue.from("bar"))
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val formattedGetResponse =
            FormattedGetResponse.builder()
                .putAdditionalProperty("foo", JsonValue.from("bar"))
                .build()

        val roundtrippedFormattedGetResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(formattedGetResponse),
                jacksonTypeRef<FormattedGetResponse>(),
            )

        assertThat(roundtrippedFormattedGetResponse).isEqualTo(formattedGetResponse)
    }
}
