// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models.admin.userconnections

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.arcade.core.JsonValue
import dev.arcade.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserConnectionResponseTest {

    @Test
    fun create() {
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

        assertThat(userConnectionResponse.id()).contains("id")
        assertThat(userConnectionResponse.connectionId()).contains("connection_id")
        assertThat(userConnectionResponse.connectionStatus()).contains("connection_status")
        assertThat(userConnectionResponse.providerDescription()).contains("provider_description")
        assertThat(userConnectionResponse.providerId()).contains("provider_id")
        assertThat(userConnectionResponse.providerType()).contains("provider_type")
        assertThat(userConnectionResponse._providerUserInfo())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(userConnectionResponse.scopes().getOrNull()).containsExactly("string")
        assertThat(userConnectionResponse.userId()).contains("user_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
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

        val roundtrippedUserConnectionResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userConnectionResponse),
                jacksonTypeRef<UserConnectionResponse>(),
            )

        assertThat(roundtrippedUserConnectionResponse).isEqualTo(userConnectionResponse)
    }
}
