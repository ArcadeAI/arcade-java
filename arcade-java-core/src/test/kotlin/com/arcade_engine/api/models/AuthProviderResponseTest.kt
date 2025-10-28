// File generated from our OpenAPI spec by Stainless.

package com.arcade_engine.api.models

import com.arcade_engine.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AuthProviderResponseTest {

    @Test
    fun createAuthProviderResponse() {
        val authProviderResponse =
            AuthProviderResponse.builder()
                .id("id")
                .binding(
                    AuthProviderResponse.Binding.builder()
                        .id("id")
                        .type(AuthProviderResponse.Binding.Type.STATIC)
                        .build()
                )
                .createdAt("created_at")
                .description("description")
                .oauth2(
                    AuthProviderResponse.Oauth2.builder()
                        .authorizeRequest(
                            AuthProviderResponse.Oauth2.AuthorizeRequest.builder()
                                .authMethod("auth_method")
                                .endpoint("endpoint")
                                .expirationFormat("expiration_format")
                                .method("method")
                                .params(
                                    AuthProviderResponse.Oauth2.AuthorizeRequest.Params.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .requestContentType("request_content_type")
                                .responseContentType("response_content_type")
                                .responseMap(
                                    AuthProviderResponse.Oauth2.AuthorizeRequest.ResponseMap
                                        .builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .build()
                        )
                        .clientId("client_id")
                        .clientSecret(
                            AuthProviderResponse.Oauth2.ClientSecret.builder()
                                .binding(AuthProviderResponse.Oauth2.ClientSecret.Binding.STATIC)
                                .editable(true)
                                .exists(true)
                                .hint("hint")
                                .value("value")
                                .build()
                        )
                        .pkce(
                            AuthProviderResponse.Oauth2.Pkce.builder()
                                .codeChallengeMethod("code_challenge_method")
                                .enabled(true)
                                .build()
                        )
                        .redirectUri("redirect_uri")
                        .refreshRequest(
                            AuthProviderResponse.Oauth2.RefreshRequest.builder()
                                .authMethod("auth_method")
                                .endpoint("endpoint")
                                .expirationFormat("expiration_format")
                                .method("method")
                                .params(
                                    AuthProviderResponse.Oauth2.RefreshRequest.Params.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .requestContentType("request_content_type")
                                .responseContentType("response_content_type")
                                .responseMap(
                                    AuthProviderResponse.Oauth2.RefreshRequest.ResponseMap.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .build()
                        )
                        .scopeDelimiter("scope_delimiter")
                        .tokenIntrospectionRequest(
                            AuthProviderResponse.Oauth2.TokenIntrospectionRequest.builder()
                                .authMethod("auth_method")
                                .enabled(true)
                                .endpoint("endpoint")
                                .expirationFormat("expiration_format")
                                .method("method")
                                .params(
                                    AuthProviderResponse.Oauth2.TokenIntrospectionRequest.Params
                                        .builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .requestContentType("request_content_type")
                                .responseContentType("response_content_type")
                                .responseMap(
                                    AuthProviderResponse.Oauth2.TokenIntrospectionRequest
                                        .ResponseMap
                                        .builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .triggers(
                                    AuthProviderResponse.Oauth2.TokenIntrospectionRequest.Triggers
                                        .builder()
                                        .onTokenGrant(true)
                                        .onTokenRefresh(true)
                                        .build()
                                )
                                .build()
                        )
                        .tokenRequest(
                            AuthProviderResponse.Oauth2.TokenRequest.builder()
                                .authMethod("auth_method")
                                .endpoint("endpoint")
                                .expirationFormat("expiration_format")
                                .method("method")
                                .params(
                                    AuthProviderResponse.Oauth2.TokenRequest.Params.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .requestContentType("request_content_type")
                                .responseContentType("response_content_type")
                                .responseMap(
                                    AuthProviderResponse.Oauth2.TokenRequest.ResponseMap.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .build()
                        )
                        .userInfoRequest(
                            AuthProviderResponse.Oauth2.UserInfoRequest.builder()
                                .authMethod("auth_method")
                                .endpoint("endpoint")
                                .expirationFormat("expiration_format")
                                .method("method")
                                .params(
                                    AuthProviderResponse.Oauth2.UserInfoRequest.Params.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .requestContentType("request_content_type")
                                .responseContentType("response_content_type")
                                .responseMap(
                                    AuthProviderResponse.Oauth2.UserInfoRequest.ResponseMap
                                        .builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .triggers(
                                    AuthProviderResponse.Oauth2.UserInfoRequest.Triggers.builder()
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
                .updatedAt("updated_at")
                .build()
        assertThat(authProviderResponse).isNotNull
        assertThat(authProviderResponse.id()).contains("id")
        assertThat(authProviderResponse.binding())
            .contains(
                AuthProviderResponse.Binding.builder()
                    .id("id")
                    .type(AuthProviderResponse.Binding.Type.STATIC)
                    .build()
            )
        assertThat(authProviderResponse.createdAt()).contains("created_at")
        assertThat(authProviderResponse.description()).contains("description")
        assertThat(authProviderResponse.oauth2())
            .contains(
                AuthProviderResponse.Oauth2.builder()
                    .authorizeRequest(
                        AuthProviderResponse.Oauth2.AuthorizeRequest.builder()
                            .authMethod("auth_method")
                            .endpoint("endpoint")
                            .expirationFormat("expiration_format")
                            .method("method")
                            .params(
                                AuthProviderResponse.Oauth2.AuthorizeRequest.Params.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .requestContentType("request_content_type")
                            .responseContentType("response_content_type")
                            .responseMap(
                                AuthProviderResponse.Oauth2.AuthorizeRequest.ResponseMap.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .build()
                    )
                    .clientId("client_id")
                    .clientSecret(
                        AuthProviderResponse.Oauth2.ClientSecret.builder()
                            .binding(AuthProviderResponse.Oauth2.ClientSecret.Binding.STATIC)
                            .editable(true)
                            .exists(true)
                            .hint("hint")
                            .value("value")
                            .build()
                    )
                    .pkce(
                        AuthProviderResponse.Oauth2.Pkce.builder()
                            .codeChallengeMethod("code_challenge_method")
                            .enabled(true)
                            .build()
                    )
                    .redirectUri("redirect_uri")
                    .refreshRequest(
                        AuthProviderResponse.Oauth2.RefreshRequest.builder()
                            .authMethod("auth_method")
                            .endpoint("endpoint")
                            .expirationFormat("expiration_format")
                            .method("method")
                            .params(
                                AuthProviderResponse.Oauth2.RefreshRequest.Params.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .requestContentType("request_content_type")
                            .responseContentType("response_content_type")
                            .responseMap(
                                AuthProviderResponse.Oauth2.RefreshRequest.ResponseMap.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .build()
                    )
                    .scopeDelimiter("scope_delimiter")
                    .tokenIntrospectionRequest(
                        AuthProviderResponse.Oauth2.TokenIntrospectionRequest.builder()
                            .authMethod("auth_method")
                            .enabled(true)
                            .endpoint("endpoint")
                            .expirationFormat("expiration_format")
                            .method("method")
                            .params(
                                AuthProviderResponse.Oauth2.TokenIntrospectionRequest.Params
                                    .builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .requestContentType("request_content_type")
                            .responseContentType("response_content_type")
                            .responseMap(
                                AuthProviderResponse.Oauth2.TokenIntrospectionRequest.ResponseMap
                                    .builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .triggers(
                                AuthProviderResponse.Oauth2.TokenIntrospectionRequest.Triggers
                                    .builder()
                                    .onTokenGrant(true)
                                    .onTokenRefresh(true)
                                    .build()
                            )
                            .build()
                    )
                    .tokenRequest(
                        AuthProviderResponse.Oauth2.TokenRequest.builder()
                            .authMethod("auth_method")
                            .endpoint("endpoint")
                            .expirationFormat("expiration_format")
                            .method("method")
                            .params(
                                AuthProviderResponse.Oauth2.TokenRequest.Params.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .requestContentType("request_content_type")
                            .responseContentType("response_content_type")
                            .responseMap(
                                AuthProviderResponse.Oauth2.TokenRequest.ResponseMap.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .build()
                    )
                    .userInfoRequest(
                        AuthProviderResponse.Oauth2.UserInfoRequest.builder()
                            .authMethod("auth_method")
                            .endpoint("endpoint")
                            .expirationFormat("expiration_format")
                            .method("method")
                            .params(
                                AuthProviderResponse.Oauth2.UserInfoRequest.Params.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .requestContentType("request_content_type")
                            .responseContentType("response_content_type")
                            .responseMap(
                                AuthProviderResponse.Oauth2.UserInfoRequest.ResponseMap.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .triggers(
                                AuthProviderResponse.Oauth2.UserInfoRequest.Triggers.builder()
                                    .onTokenGrant(true)
                                    .onTokenRefresh(true)
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
        assertThat(authProviderResponse.providerId()).contains("provider_id")
        assertThat(authProviderResponse.status()).contains("status")
        assertThat(authProviderResponse.type()).contains("type")
        assertThat(authProviderResponse.updatedAt()).contains("updated_at")
    }
}
