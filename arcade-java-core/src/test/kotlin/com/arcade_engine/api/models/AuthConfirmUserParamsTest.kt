// File generated from our OpenAPI spec by Stainless.

package com.arcade_engine.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AuthConfirmUserParamsTest {

    @Test
    fun create() {
        AuthConfirmUserParams.builder()
            .confirmUserRequest(
                ConfirmUserRequest.builder().flowId("flow_id").userId("user_id").build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            AuthConfirmUserParams.builder()
                .confirmUserRequest(
                    ConfirmUserRequest.builder().flowId("flow_id").userId("user_id").build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(ConfirmUserRequest.builder().flowId("flow_id").userId("user_id").build())
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AuthConfirmUserParams.builder()
                .confirmUserRequest(
                    ConfirmUserRequest.builder().flowId("flow_id").userId("user_id").build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(ConfirmUserRequest.builder().flowId("flow_id").userId("user_id").build())
    }
}
