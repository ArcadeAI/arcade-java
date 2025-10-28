// File generated from our OpenAPI spec by Stainless.

package com.arcade_engine.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AdminSecretDeleteParamsTest {

    @Test
    fun create() {
        AdminSecretDeleteParams.builder().secretId("secret_id").build()
    }

    @Test
    fun getPathParam() {
        val params = AdminSecretDeleteParams.builder().secretId("secret_id").build()
        assertThat(params).isNotNull
        // path param "secretId"
        assertThat(params.getPathParam(0)).isEqualTo("secret_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
