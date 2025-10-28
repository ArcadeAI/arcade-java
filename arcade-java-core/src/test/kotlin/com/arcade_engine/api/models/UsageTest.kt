// File generated from our OpenAPI spec by Stainless.

package com.arcade_engine.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class UsageTest {

    @Test
    fun createUsage() {
        val usage = Usage.builder().completionTokens(0L).promptTokens(0L).totalTokens(0L).build()
        assertThat(usage).isNotNull
        assertThat(usage.completionTokens()).contains(0L)
        assertThat(usage.promptTokens()).contains(0L)
        assertThat(usage.totalTokens()).contains(0L)
    }
}
