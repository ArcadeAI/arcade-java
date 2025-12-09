// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.arcade.core.JsonValue
import dev.arcade.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuthorizationContextTest {

    @Test
    fun create() {
        val authorizationContext =
            AuthorizationContext.builder()
                .token("token")
                .userInfo(
                    AuthorizationContext.UserInfo.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        assertThat(authorizationContext.token()).contains("token")
        assertThat(authorizationContext.userInfo())
            .contains(
                AuthorizationContext.UserInfo.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val authorizationContext =
            AuthorizationContext.builder()
                .token("token")
                .userInfo(
                    AuthorizationContext.UserInfo.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val roundtrippedAuthorizationContext =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(authorizationContext),
                jacksonTypeRef<AuthorizationContext>(),
            )

        assertThat(roundtrippedAuthorizationContext).isEqualTo(authorizationContext)
    }
}
