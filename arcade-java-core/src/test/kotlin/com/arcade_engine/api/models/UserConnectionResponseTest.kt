// File generated from our OpenAPI spec by Stainless.

package com.arcade_engine.api.models

import com.arcade_engine.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class UserConnectionResponseTest {

    @Test
    fun createUserConnectionResponse() {
        val userConnectionResponse =
            UserConnectionResponse.builder()
                .id("id")
                .connectionId("connection_id")
                .connectionStatus("connection_status")
                .providerDescription("provider_description")
                .providerId("provider_id")
                .providerType("provider_type")
                .providerUserInfo(JsonValue.from(mapOf<String, Any>()))
                .addScope("string")
                .userId("user_id")
                .build()
        assertThat(userConnectionResponse).isNotNull
        assertThat(userConnectionResponse.id()).contains("id")
        assertThat(userConnectionResponse.connectionId()).contains("connection_id")
        assertThat(userConnectionResponse.connectionStatus()).contains("connection_status")
        assertThat(userConnectionResponse.providerDescription()).contains("provider_description")
        assertThat(userConnectionResponse.providerId()).contains("provider_id")
        assertThat(userConnectionResponse.providerType()).contains("provider_type")
        assertThat(userConnectionResponse._providerUserInfo())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(userConnectionResponse.scopes().get()).containsExactly("string")
        assertThat(userConnectionResponse.userId()).contains("user_id")
    }
}
