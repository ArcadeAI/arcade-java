// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models.admin.userconnections

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.arcade.core.JsonValue
import dev.arcade.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserConnectionListPageResponseTest {

    @Test
    fun create() {
        val userConnectionListPageResponse =
            UserConnectionListPageResponse.builder()
                .addItem(
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
                )
                .limit(0L)
                .offset(0L)
                .pageCount(0L)
                .totalCount(0L)
                .build()

        assertThat(userConnectionListPageResponse.items().getOrNull())
            .containsExactly(
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
            )
        assertThat(userConnectionListPageResponse.limit()).contains(0L)
        assertThat(userConnectionListPageResponse.offset()).contains(0L)
        assertThat(userConnectionListPageResponse.pageCount()).contains(0L)
        assertThat(userConnectionListPageResponse.totalCount()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val userConnectionListPageResponse =
            UserConnectionListPageResponse.builder()
                .addItem(
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
                )
                .limit(0L)
                .offset(0L)
                .pageCount(0L)
                .totalCount(0L)
                .build()

        val roundtrippedUserConnectionListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userConnectionListPageResponse),
                jacksonTypeRef<UserConnectionListPageResponse>(),
            )

        assertThat(roundtrippedUserConnectionListPageResponse)
            .isEqualTo(userConnectionListPageResponse)
    }
}
