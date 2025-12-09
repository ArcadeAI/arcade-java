// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models.admin.authproviders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.arcade.core.JsonValue
import dev.arcade.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuthProviderUpdateRequestTest {

    @Test
    fun create() {
        val authProviderUpdateRequest =
            AuthProviderUpdateRequest.builder()
                .id("id")
                .description("description")
                .oauth2(
                    AuthProviderUpdateRequest.Oauth2.builder()
                        .authorizeRequest(
                            AuthProviderUpdateRequest.Oauth2.AuthorizeRequest.builder()
                                .authHeaderValueFormat("auth_header_value_format")
                                .authMethod("auth_method")
                                .endpoint("endpoint")
                                .method("method")
                                .params(
                                    AuthProviderUpdateRequest.Oauth2.AuthorizeRequest.Params
                                        .builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .requestContentType(
                                    AuthProviderUpdateRequest.Oauth2.AuthorizeRequest
                                        .RequestContentType
                                        .APPLICATION_X_WWW_FORM_URLENCODED
                                )
                                .responseContentType(
                                    AuthProviderUpdateRequest.Oauth2.AuthorizeRequest
                                        .ResponseContentType
                                        .APPLICATION_X_WWW_FORM_URLENCODED
                                )
                                .responseMap(
                                    AuthProviderUpdateRequest.Oauth2.AuthorizeRequest.ResponseMap
                                        .builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .build()
                        )
                        .clientId("client_id")
                        .clientSecret("client_secret")
                        .pkce(
                            AuthProviderUpdateRequest.Oauth2.Pkce.builder()
                                .codeChallengeMethod("code_challenge_method")
                                .enabled(true)
                                .build()
                        )
                        .refreshRequest(
                            AuthProviderUpdateRequest.Oauth2.RefreshRequest.builder()
                                .authHeaderValueFormat("auth_header_value_format")
                                .authMethod("auth_method")
                                .endpoint("endpoint")
                                .method("method")
                                .params(
                                    AuthProviderUpdateRequest.Oauth2.RefreshRequest.Params.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .requestContentType(
                                    AuthProviderUpdateRequest.Oauth2.RefreshRequest
                                        .RequestContentType
                                        .APPLICATION_X_WWW_FORM_URLENCODED
                                )
                                .responseContentType(
                                    AuthProviderUpdateRequest.Oauth2.RefreshRequest
                                        .ResponseContentType
                                        .APPLICATION_X_WWW_FORM_URLENCODED
                                )
                                .responseMap(
                                    AuthProviderUpdateRequest.Oauth2.RefreshRequest.ResponseMap
                                        .builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .build()
                        )
                        .scopeDelimiter(AuthProviderUpdateRequest.Oauth2.ScopeDelimiter.Unknown2)
                        .tokenRequest(
                            AuthProviderUpdateRequest.Oauth2.TokenRequest.builder()
                                .authHeaderValueFormat("auth_header_value_format")
                                .authMethod("auth_method")
                                .endpoint("endpoint")
                                .method("method")
                                .params(
                                    AuthProviderUpdateRequest.Oauth2.TokenRequest.Params.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .requestContentType(
                                    AuthProviderUpdateRequest.Oauth2.TokenRequest.RequestContentType
                                        .APPLICATION_X_WWW_FORM_URLENCODED
                                )
                                .responseContentType(
                                    AuthProviderUpdateRequest.Oauth2.TokenRequest
                                        .ResponseContentType
                                        .APPLICATION_X_WWW_FORM_URLENCODED
                                )
                                .responseMap(
                                    AuthProviderUpdateRequest.Oauth2.TokenRequest.ResponseMap
                                        .builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .build()
                        )
                        .userInfoRequest(
                            AuthProviderUpdateRequest.Oauth2.UserInfoRequest.builder()
                                .authHeaderValueFormat("auth_header_value_format")
                                .authMethod("auth_method")
                                .endpoint("endpoint")
                                .method("method")
                                .params(
                                    AuthProviderUpdateRequest.Oauth2.UserInfoRequest.Params
                                        .builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .requestContentType(
                                    AuthProviderUpdateRequest.Oauth2.UserInfoRequest
                                        .RequestContentType
                                        .APPLICATION_X_WWW_FORM_URLENCODED
                                )
                                .responseContentType(
                                    AuthProviderUpdateRequest.Oauth2.UserInfoRequest
                                        .ResponseContentType
                                        .APPLICATION_X_WWW_FORM_URLENCODED
                                )
                                .responseMap(
                                    AuthProviderUpdateRequest.Oauth2.UserInfoRequest.ResponseMap
                                        .builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .triggers(
                                    AuthProviderUpdateRequest.Oauth2.UserInfoRequest.Triggers
                                        .builder()
                                        .onTokenGrant(true)
                                        .onTokenRefresh(true)
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .providerId("provider_id")
                .status("status")
                .type("type")
                .build()

        assertThat(authProviderUpdateRequest.id()).contains("id")
        assertThat(authProviderUpdateRequest.description()).contains("description")
        assertThat(authProviderUpdateRequest.oauth2())
            .contains(
                AuthProviderUpdateRequest.Oauth2.builder()
                    .authorizeRequest(
                        AuthProviderUpdateRequest.Oauth2.AuthorizeRequest.builder()
                            .authHeaderValueFormat("auth_header_value_format")
                            .authMethod("auth_method")
                            .endpoint("endpoint")
                            .method("method")
                            .params(
                                AuthProviderUpdateRequest.Oauth2.AuthorizeRequest.Params.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .requestContentType(
                                AuthProviderUpdateRequest.Oauth2.AuthorizeRequest.RequestContentType
                                    .APPLICATION_X_WWW_FORM_URLENCODED
                            )
                            .responseContentType(
                                AuthProviderUpdateRequest.Oauth2.AuthorizeRequest
                                    .ResponseContentType
                                    .APPLICATION_X_WWW_FORM_URLENCODED
                            )
                            .responseMap(
                                AuthProviderUpdateRequest.Oauth2.AuthorizeRequest.ResponseMap
                                    .builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .build()
                    )
                    .clientId("client_id")
                    .clientSecret("client_secret")
                    .pkce(
                        AuthProviderUpdateRequest.Oauth2.Pkce.builder()
                            .codeChallengeMethod("code_challenge_method")
                            .enabled(true)
                            .build()
                    )
                    .refreshRequest(
                        AuthProviderUpdateRequest.Oauth2.RefreshRequest.builder()
                            .authHeaderValueFormat("auth_header_value_format")
                            .authMethod("auth_method")
                            .endpoint("endpoint")
                            .method("method")
                            .params(
                                AuthProviderUpdateRequest.Oauth2.RefreshRequest.Params.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .requestContentType(
                                AuthProviderUpdateRequest.Oauth2.RefreshRequest.RequestContentType
                                    .APPLICATION_X_WWW_FORM_URLENCODED
                            )
                            .responseContentType(
                                AuthProviderUpdateRequest.Oauth2.RefreshRequest.ResponseContentType
                                    .APPLICATION_X_WWW_FORM_URLENCODED
                            )
                            .responseMap(
                                AuthProviderUpdateRequest.Oauth2.RefreshRequest.ResponseMap
                                    .builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .build()
                    )
                    .scopeDelimiter(AuthProviderUpdateRequest.Oauth2.ScopeDelimiter.Unknown2)
                    .tokenRequest(
                        AuthProviderUpdateRequest.Oauth2.TokenRequest.builder()
                            .authHeaderValueFormat("auth_header_value_format")
                            .authMethod("auth_method")
                            .endpoint("endpoint")
                            .method("method")
                            .params(
                                AuthProviderUpdateRequest.Oauth2.TokenRequest.Params.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .requestContentType(
                                AuthProviderUpdateRequest.Oauth2.TokenRequest.RequestContentType
                                    .APPLICATION_X_WWW_FORM_URLENCODED
                            )
                            .responseContentType(
                                AuthProviderUpdateRequest.Oauth2.TokenRequest.ResponseContentType
                                    .APPLICATION_X_WWW_FORM_URLENCODED
                            )
                            .responseMap(
                                AuthProviderUpdateRequest.Oauth2.TokenRequest.ResponseMap.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .build()
                    )
                    .userInfoRequest(
                        AuthProviderUpdateRequest.Oauth2.UserInfoRequest.builder()
                            .authHeaderValueFormat("auth_header_value_format")
                            .authMethod("auth_method")
                            .endpoint("endpoint")
                            .method("method")
                            .params(
                                AuthProviderUpdateRequest.Oauth2.UserInfoRequest.Params.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .requestContentType(
                                AuthProviderUpdateRequest.Oauth2.UserInfoRequest.RequestContentType
                                    .APPLICATION_X_WWW_FORM_URLENCODED
                            )
                            .responseContentType(
                                AuthProviderUpdateRequest.Oauth2.UserInfoRequest.ResponseContentType
                                    .APPLICATION_X_WWW_FORM_URLENCODED
                            )
                            .responseMap(
                                AuthProviderUpdateRequest.Oauth2.UserInfoRequest.ResponseMap
                                    .builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .triggers(
                                AuthProviderUpdateRequest.Oauth2.UserInfoRequest.Triggers.builder()
                                    .onTokenGrant(true)
                                    .onTokenRefresh(true)
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
        assertThat(authProviderUpdateRequest.providerId()).contains("provider_id")
        assertThat(authProviderUpdateRequest.status()).contains("status")
        assertThat(authProviderUpdateRequest.type()).contains("type")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val authProviderUpdateRequest =
            AuthProviderUpdateRequest.builder()
                .id("id")
                .description("description")
                .oauth2(
                    AuthProviderUpdateRequest.Oauth2.builder()
                        .authorizeRequest(
                            AuthProviderUpdateRequest.Oauth2.AuthorizeRequest.builder()
                                .authHeaderValueFormat("auth_header_value_format")
                                .authMethod("auth_method")
                                .endpoint("endpoint")
                                .method("method")
                                .params(
                                    AuthProviderUpdateRequest.Oauth2.AuthorizeRequest.Params
                                        .builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .requestContentType(
                                    AuthProviderUpdateRequest.Oauth2.AuthorizeRequest
                                        .RequestContentType
                                        .APPLICATION_X_WWW_FORM_URLENCODED
                                )
                                .responseContentType(
                                    AuthProviderUpdateRequest.Oauth2.AuthorizeRequest
                                        .ResponseContentType
                                        .APPLICATION_X_WWW_FORM_URLENCODED
                                )
                                .responseMap(
                                    AuthProviderUpdateRequest.Oauth2.AuthorizeRequest.ResponseMap
                                        .builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .build()
                        )
                        .clientId("client_id")
                        .clientSecret("client_secret")
                        .pkce(
                            AuthProviderUpdateRequest.Oauth2.Pkce.builder()
                                .codeChallengeMethod("code_challenge_method")
                                .enabled(true)
                                .build()
                        )
                        .refreshRequest(
                            AuthProviderUpdateRequest.Oauth2.RefreshRequest.builder()
                                .authHeaderValueFormat("auth_header_value_format")
                                .authMethod("auth_method")
                                .endpoint("endpoint")
                                .method("method")
                                .params(
                                    AuthProviderUpdateRequest.Oauth2.RefreshRequest.Params.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .requestContentType(
                                    AuthProviderUpdateRequest.Oauth2.RefreshRequest
                                        .RequestContentType
                                        .APPLICATION_X_WWW_FORM_URLENCODED
                                )
                                .responseContentType(
                                    AuthProviderUpdateRequest.Oauth2.RefreshRequest
                                        .ResponseContentType
                                        .APPLICATION_X_WWW_FORM_URLENCODED
                                )
                                .responseMap(
                                    AuthProviderUpdateRequest.Oauth2.RefreshRequest.ResponseMap
                                        .builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .build()
                        )
                        .scopeDelimiter(AuthProviderUpdateRequest.Oauth2.ScopeDelimiter.Unknown2)
                        .tokenRequest(
                            AuthProviderUpdateRequest.Oauth2.TokenRequest.builder()
                                .authHeaderValueFormat("auth_header_value_format")
                                .authMethod("auth_method")
                                .endpoint("endpoint")
                                .method("method")
                                .params(
                                    AuthProviderUpdateRequest.Oauth2.TokenRequest.Params.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .requestContentType(
                                    AuthProviderUpdateRequest.Oauth2.TokenRequest.RequestContentType
                                        .APPLICATION_X_WWW_FORM_URLENCODED
                                )
                                .responseContentType(
                                    AuthProviderUpdateRequest.Oauth2.TokenRequest
                                        .ResponseContentType
                                        .APPLICATION_X_WWW_FORM_URLENCODED
                                )
                                .responseMap(
                                    AuthProviderUpdateRequest.Oauth2.TokenRequest.ResponseMap
                                        .builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .build()
                        )
                        .userInfoRequest(
                            AuthProviderUpdateRequest.Oauth2.UserInfoRequest.builder()
                                .authHeaderValueFormat("auth_header_value_format")
                                .authMethod("auth_method")
                                .endpoint("endpoint")
                                .method("method")
                                .params(
                                    AuthProviderUpdateRequest.Oauth2.UserInfoRequest.Params
                                        .builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .requestContentType(
                                    AuthProviderUpdateRequest.Oauth2.UserInfoRequest
                                        .RequestContentType
                                        .APPLICATION_X_WWW_FORM_URLENCODED
                                )
                                .responseContentType(
                                    AuthProviderUpdateRequest.Oauth2.UserInfoRequest
                                        .ResponseContentType
                                        .APPLICATION_X_WWW_FORM_URLENCODED
                                )
                                .responseMap(
                                    AuthProviderUpdateRequest.Oauth2.UserInfoRequest.ResponseMap
                                        .builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .triggers(
                                    AuthProviderUpdateRequest.Oauth2.UserInfoRequest.Triggers
                                        .builder()
                                        .onTokenGrant(true)
                                        .onTokenRefresh(true)
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .providerId("provider_id")
                .status("status")
                .type("type")
                .build()

        val roundtrippedAuthProviderUpdateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(authProviderUpdateRequest),
                jacksonTypeRef<AuthProviderUpdateRequest>(),
            )

        assertThat(roundtrippedAuthProviderUpdateRequest).isEqualTo(authProviderUpdateRequest)
    }
}
