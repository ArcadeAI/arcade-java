// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.arcade.core.JsonValue
import dev.arcade.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuthorizationResponseTest {

    @Test
    fun create() {
        val authorizationResponse =
            AuthorizationResponse.builder()
                .id("id")
                .context(
                    AuthorizationContext.builder()
                        .token("token")
                        .userInfo(
                            AuthorizationContext.UserInfo.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .providerId("provider_id")
                .addScope("string")
                .status(AuthorizationResponse.Status.NOT_STARTED)
                .url("url")
                .userId("user_id")
                .build()

        assertThat(authorizationResponse.id()).contains("id")
        assertThat(authorizationResponse.context())
            .contains(
                AuthorizationContext.builder()
                    .token("token")
                    .userInfo(
                        AuthorizationContext.UserInfo.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )
        assertThat(authorizationResponse.providerId()).contains("provider_id")
        assertThat(authorizationResponse.scopes().getOrNull()).containsExactly("string")
        assertThat(authorizationResponse.status())
            .contains(AuthorizationResponse.Status.NOT_STARTED)
        assertThat(authorizationResponse.url()).contains("url")
        assertThat(authorizationResponse.userId()).contains("user_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val authorizationResponse =
            AuthorizationResponse.builder()
                .id("id")
                .context(
                    AuthorizationContext.builder()
                        .token("token")
                        .userInfo(
                            AuthorizationContext.UserInfo.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .providerId("provider_id")
                .addScope("string")
                .status(AuthorizationResponse.Status.NOT_STARTED)
                .url("url")
                .userId("user_id")
                .build()

        val roundtrippedAuthorizationResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(authorizationResponse),
                jacksonTypeRef<AuthorizationResponse>(),
            )

        assertThat(roundtrippedAuthorizationResponse).isEqualTo(authorizationResponse)
    }
}
