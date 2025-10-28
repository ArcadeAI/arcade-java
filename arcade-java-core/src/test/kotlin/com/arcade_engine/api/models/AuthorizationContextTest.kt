// File generated from our OpenAPI spec by Stainless.

package com.arcade_engine.api.models

import com.arcade_engine.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AuthorizationContextTest {

    @Test
    fun createAuthorizationContext() {
        val authorizationContext =
            AuthorizationContext.builder()
                .token("token")
                .userInfo(
                    AuthorizationContext.UserInfo.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()
        assertThat(authorizationContext).isNotNull
        assertThat(authorizationContext.token()).contains("token")
        assertThat(authorizationContext.userInfo())
            .contains(
                AuthorizationContext.UserInfo.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }
}
