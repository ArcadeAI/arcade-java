// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models

import dev.arcade.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AuthorizationResponseTest {

    @Test
    fun createAuthorizationResponse() {
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
        assertThat(authorizationResponse).isNotNull
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
        assertThat(authorizationResponse.scopes().get()).containsExactly("string")
        assertThat(authorizationResponse.status())
            .contains(AuthorizationResponse.Status.NOT_STARTED)
        assertThat(authorizationResponse.url()).contains("url")
        assertThat(authorizationResponse.userId()).contains("user_id")
    }
}
