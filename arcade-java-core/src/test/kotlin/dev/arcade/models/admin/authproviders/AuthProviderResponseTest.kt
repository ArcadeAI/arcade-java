// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models.admin.authproviders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.arcade.core.JsonValue
import dev.arcade.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuthProviderResponseTest {

    @Test
    fun create() {
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
                                .authHeaderValueFormat("auth_header_value_format")
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
                                .authHeaderValueFormat("auth_header_value_format")
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
                                .authHeaderValueFormat("auth_header_value_format")
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
                                .authHeaderValueFormat("auth_header_value_format")
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
                                .authHeaderValueFormat("auth_header_value_format")
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
                            .authHeaderValueFormat("auth_header_value_format")
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
                            .authHeaderValueFormat("auth_header_value_format")
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
                            .authHeaderValueFormat("auth_header_value_format")
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
                            .authHeaderValueFormat("auth_header_value_format")
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
                            .authHeaderValueFormat("auth_header_value_format")
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

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
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
                                .authHeaderValueFormat("auth_header_value_format")
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
                                .authHeaderValueFormat("auth_header_value_format")
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
                                .authHeaderValueFormat("auth_header_value_format")
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
                                .authHeaderValueFormat("auth_header_value_format")
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
                                .authHeaderValueFormat("auth_header_value_format")
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

        val roundtrippedAuthProviderResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(authProviderResponse),
                jacksonTypeRef<AuthProviderResponse>(),
            )

        assertThat(roundtrippedAuthProviderResponse).isEqualTo(authProviderResponse)
    }
}
