// File generated from our OpenAPI spec by Stainless.

package dev.arcade.services.blocking.admin

import dev.arcade.TestServerExtension
import dev.arcade.client.okhttp.ArcadeOkHttpClient
import dev.arcade.core.JsonValue
import dev.arcade.models.admin.authproviders.AuthProviderCreateRequest
import dev.arcade.models.admin.authproviders.AuthProviderPatchParams
import dev.arcade.models.admin.authproviders.AuthProviderUpdateRequest
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AuthProviderServiceTest {

    @Test
    fun create() {
        val client =
            ArcadeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val authProviderService = client.admin().authProviders()

        val authProviderResponse =
            authProviderService.create(
                AuthProviderCreateRequest.builder()
                    .id("id")
                    .description("description")
                    .externalId("external_id")
                    .oauth2(
                        AuthProviderCreateRequest.Oauth2.builder()
                            .clientId("client_id")
                            .authorizeRequest(
                                AuthProviderCreateRequest.Oauth2.AuthorizeRequest.builder()
                                    .endpoint("endpoint")
                                    .authHeaderValueFormat("auth_header_value_format")
                                    .authMethod("auth_method")
                                    .method("method")
                                    .params(
                                        AuthProviderCreateRequest.Oauth2.AuthorizeRequest.Params
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .requestContentType(
                                        AuthProviderCreateRequest.Oauth2.AuthorizeRequest
                                            .RequestContentType
                                            .APPLICATION_X_WWW_FORM_URLENCODED
                                    )
                                    .responseContentType(
                                        AuthProviderCreateRequest.Oauth2.AuthorizeRequest
                                            .ResponseContentType
                                            .APPLICATION_X_WWW_FORM_URLENCODED
                                    )
                                    .responseMap(
                                        AuthProviderCreateRequest.Oauth2.AuthorizeRequest
                                            .ResponseMap
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .build()
                            )
                            .clientSecret("client_secret")
                            .pkce(
                                AuthProviderCreateRequest.Oauth2.Pkce.builder()
                                    .codeChallengeMethod("code_challenge_method")
                                    .enabled(true)
                                    .build()
                            )
                            .refreshRequest(
                                AuthProviderCreateRequest.Oauth2.RefreshRequest.builder()
                                    .endpoint("endpoint")
                                    .authHeaderValueFormat("auth_header_value_format")
                                    .authMethod("auth_method")
                                    .method("method")
                                    .params(
                                        AuthProviderCreateRequest.Oauth2.RefreshRequest.Params
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .requestContentType(
                                        AuthProviderCreateRequest.Oauth2.RefreshRequest
                                            .RequestContentType
                                            .APPLICATION_X_WWW_FORM_URLENCODED
                                    )
                                    .responseContentType(
                                        AuthProviderCreateRequest.Oauth2.RefreshRequest
                                            .ResponseContentType
                                            .APPLICATION_X_WWW_FORM_URLENCODED
                                    )
                                    .responseMap(
                                        AuthProviderCreateRequest.Oauth2.RefreshRequest.ResponseMap
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .build()
                            )
                            .scopeDelimiter(
                                AuthProviderCreateRequest.Oauth2.ScopeDelimiter.Unknown0
                            )
                            .tokenIntrospectionRequest(
                                AuthProviderCreateRequest.Oauth2.TokenIntrospectionRequest.builder()
                                    .endpoint("endpoint")
                                    .triggers(
                                        AuthProviderCreateRequest.Oauth2.TokenIntrospectionRequest
                                            .Triggers
                                            .builder()
                                            .onTokenGrant(true)
                                            .onTokenRefresh(true)
                                            .build()
                                    )
                                    .authHeaderValueFormat("auth_header_value_format")
                                    .authMethod("auth_method")
                                    .method("method")
                                    .params(
                                        AuthProviderCreateRequest.Oauth2.TokenIntrospectionRequest
                                            .Params
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .requestContentType(
                                        AuthProviderCreateRequest.Oauth2.TokenIntrospectionRequest
                                            .RequestContentType
                                            .APPLICATION_X_WWW_FORM_URLENCODED
                                    )
                                    .responseContentType(
                                        AuthProviderCreateRequest.Oauth2.TokenIntrospectionRequest
                                            .ResponseContentType
                                            .APPLICATION_X_WWW_FORM_URLENCODED
                                    )
                                    .responseMap(
                                        AuthProviderCreateRequest.Oauth2.TokenIntrospectionRequest
                                            .ResponseMap
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .build()
                            )
                            .tokenRequest(
                                AuthProviderCreateRequest.Oauth2.TokenRequest.builder()
                                    .endpoint("endpoint")
                                    .authHeaderValueFormat("auth_header_value_format")
                                    .authMethod("auth_method")
                                    .method("method")
                                    .params(
                                        AuthProviderCreateRequest.Oauth2.TokenRequest.Params
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .requestContentType(
                                        AuthProviderCreateRequest.Oauth2.TokenRequest
                                            .RequestContentType
                                            .APPLICATION_X_WWW_FORM_URLENCODED
                                    )
                                    .responseContentType(
                                        AuthProviderCreateRequest.Oauth2.TokenRequest
                                            .ResponseContentType
                                            .APPLICATION_X_WWW_FORM_URLENCODED
                                    )
                                    .responseMap(
                                        AuthProviderCreateRequest.Oauth2.TokenRequest.ResponseMap
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .build()
                            )
                            .userInfoRequest(
                                AuthProviderCreateRequest.Oauth2.UserInfoRequest.builder()
                                    .endpoint("endpoint")
                                    .triggers(
                                        AuthProviderCreateRequest.Oauth2.UserInfoRequest.Triggers
                                            .builder()
                                            .onTokenGrant(true)
                                            .onTokenRefresh(true)
                                            .build()
                                    )
                                    .authHeaderValueFormat("auth_header_value_format")
                                    .authMethod("auth_method")
                                    .method("method")
                                    .params(
                                        AuthProviderCreateRequest.Oauth2.UserInfoRequest.Params
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .requestContentType(
                                        AuthProviderCreateRequest.Oauth2.UserInfoRequest
                                            .RequestContentType
                                            .APPLICATION_X_WWW_FORM_URLENCODED
                                    )
                                    .responseContentType(
                                        AuthProviderCreateRequest.Oauth2.UserInfoRequest
                                            .ResponseContentType
                                            .APPLICATION_X_WWW_FORM_URLENCODED
                                    )
                                    .responseMap(
                                        AuthProviderCreateRequest.Oauth2.UserInfoRequest.ResponseMap
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
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
            )

        authProviderResponse.validate()
    }

    @Test
    fun list() {
        val client =
            ArcadeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val authProviderService = client.admin().authProviders()

        val authProviders = authProviderService.list()

        authProviders.validate()
    }

    @Test
    fun delete() {
        val client =
            ArcadeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val authProviderService = client.admin().authProviders()

        val authProviderResponse = authProviderService.delete("id")

        authProviderResponse.validate()
    }

    @Test
    fun get() {
        val client =
            ArcadeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val authProviderService = client.admin().authProviders()

        val authProviderResponse = authProviderService.get("id")

        authProviderResponse.validate()
    }

    @Test
    fun patch() {
        val client =
            ArcadeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val authProviderService = client.admin().authProviders()

        val authProviderResponse =
            authProviderService.patch(
                AuthProviderPatchParams.builder()
                    .pathId("id")
                    .authProviderUpdateRequest(
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
                                                AuthProviderUpdateRequest.Oauth2.AuthorizeRequest
                                                    .Params
                                                    .builder()
                                                    .putAdditionalProperty(
                                                        "foo",
                                                        JsonValue.from("string"),
                                                    )
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
                                                AuthProviderUpdateRequest.Oauth2.AuthorizeRequest
                                                    .ResponseMap
                                                    .builder()
                                                    .putAdditionalProperty(
                                                        "foo",
                                                        JsonValue.from("string"),
                                                    )
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
                                                AuthProviderUpdateRequest.Oauth2.RefreshRequest
                                                    .Params
                                                    .builder()
                                                    .putAdditionalProperty(
                                                        "foo",
                                                        JsonValue.from("string"),
                                                    )
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
                                                AuthProviderUpdateRequest.Oauth2.RefreshRequest
                                                    .ResponseMap
                                                    .builder()
                                                    .putAdditionalProperty(
                                                        "foo",
                                                        JsonValue.from("string"),
                                                    )
                                                    .build()
                                            )
                                            .build()
                                    )
                                    .scopeDelimiter(
                                        AuthProviderUpdateRequest.Oauth2.ScopeDelimiter.Unknown2
                                    )
                                    .tokenIntrospectionRequest(
                                        AuthProviderUpdateRequest.Oauth2.TokenIntrospectionRequest
                                            .builder()
                                            .authHeaderValueFormat("auth_header_value_format")
                                            .authMethod("auth_method")
                                            .endpoint("endpoint")
                                            .method("method")
                                            .params(
                                                AuthProviderUpdateRequest.Oauth2
                                                    .TokenIntrospectionRequest
                                                    .Params
                                                    .builder()
                                                    .putAdditionalProperty(
                                                        "foo",
                                                        JsonValue.from("string"),
                                                    )
                                                    .build()
                                            )
                                            .requestContentType(
                                                AuthProviderUpdateRequest.Oauth2
                                                    .TokenIntrospectionRequest
                                                    .RequestContentType
                                                    .APPLICATION_X_WWW_FORM_URLENCODED
                                            )
                                            .responseContentType(
                                                AuthProviderUpdateRequest.Oauth2
                                                    .TokenIntrospectionRequest
                                                    .ResponseContentType
                                                    .APPLICATION_X_WWW_FORM_URLENCODED
                                            )
                                            .responseMap(
                                                AuthProviderUpdateRequest.Oauth2
                                                    .TokenIntrospectionRequest
                                                    .ResponseMap
                                                    .builder()
                                                    .putAdditionalProperty(
                                                        "foo",
                                                        JsonValue.from("string"),
                                                    )
                                                    .build()
                                            )
                                            .triggers(
                                                AuthProviderUpdateRequest.Oauth2
                                                    .TokenIntrospectionRequest
                                                    .Triggers
                                                    .builder()
                                                    .onTokenGrant(true)
                                                    .onTokenRefresh(true)
                                                    .build()
                                            )
                                            .build()
                                    )
                                    .tokenRequest(
                                        AuthProviderUpdateRequest.Oauth2.TokenRequest.builder()
                                            .authHeaderValueFormat("auth_header_value_format")
                                            .authMethod("auth_method")
                                            .endpoint("endpoint")
                                            .method("method")
                                            .params(
                                                AuthProviderUpdateRequest.Oauth2.TokenRequest.Params
                                                    .builder()
                                                    .putAdditionalProperty(
                                                        "foo",
                                                        JsonValue.from("string"),
                                                    )
                                                    .build()
                                            )
                                            .requestContentType(
                                                AuthProviderUpdateRequest.Oauth2.TokenRequest
                                                    .RequestContentType
                                                    .APPLICATION_X_WWW_FORM_URLENCODED
                                            )
                                            .responseContentType(
                                                AuthProviderUpdateRequest.Oauth2.TokenRequest
                                                    .ResponseContentType
                                                    .APPLICATION_X_WWW_FORM_URLENCODED
                                            )
                                            .responseMap(
                                                AuthProviderUpdateRequest.Oauth2.TokenRequest
                                                    .ResponseMap
                                                    .builder()
                                                    .putAdditionalProperty(
                                                        "foo",
                                                        JsonValue.from("string"),
                                                    )
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
                                                AuthProviderUpdateRequest.Oauth2.UserInfoRequest
                                                    .Params
                                                    .builder()
                                                    .putAdditionalProperty(
                                                        "foo",
                                                        JsonValue.from("string"),
                                                    )
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
                                                AuthProviderUpdateRequest.Oauth2.UserInfoRequest
                                                    .ResponseMap
                                                    .builder()
                                                    .putAdditionalProperty(
                                                        "foo",
                                                        JsonValue.from("string"),
                                                    )
                                                    .build()
                                            )
                                            .triggers(
                                                AuthProviderUpdateRequest.Oauth2.UserInfoRequest
                                                    .Triggers
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
                    )
                    .build()
            )

        authProviderResponse.validate()
    }
}
