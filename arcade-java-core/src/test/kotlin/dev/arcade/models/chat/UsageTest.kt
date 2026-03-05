// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models.chat

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.arcade.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsageTest {

    @Test
    fun create() {
        val usage = Usage.builder().completionTokens(0L).promptTokens(0L).totalTokens(0L).build()

        assertThat(usage.completionTokens()).contains(0L)
        assertThat(usage.promptTokens()).contains(0L)
        assertThat(usage.totalTokens()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val usage = Usage.builder().completionTokens(0L).promptTokens(0L).totalTokens(0L).build()

        val roundtrippedUsage =
            jsonMapper.readValue(jsonMapper.writeValueAsString(usage), jacksonTypeRef<Usage>())

        assertThat(roundtrippedUsage).isEqualTo(usage)
    }
}
