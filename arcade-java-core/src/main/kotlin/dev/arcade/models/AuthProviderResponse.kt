// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.arcade.core.Enum
import dev.arcade.core.ExcludeMissing
import dev.arcade.core.JsonField
import dev.arcade.core.JsonMissing
import dev.arcade.core.JsonValue
import dev.arcade.core.NoAutoDetect
import dev.arcade.core.immutableEmptyMap
import dev.arcade.core.toImmutable
import dev.arcade.errors.ArcadeInvalidDataException
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class AuthProviderResponse
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("binding")
    @ExcludeMissing
    private val binding: JsonField<Binding> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<String> = JsonMissing.of(),
    @JsonProperty("description")
    @ExcludeMissing
    private val description: JsonField<String> = JsonMissing.of(),
    @JsonProperty("oauth2")
    @ExcludeMissing
    private val oauth2: JsonField<Oauth2> = JsonMissing.of(),
    @JsonProperty("provider_id")
    @ExcludeMissing
    private val providerId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<String> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<String> = JsonMissing.of(),
    @JsonProperty("updated_at")
    @ExcludeMissing
    private val updatedAt: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): Optional<String> = Optional.ofNullable(id.getNullable("id"))

    fun binding(): Optional<Binding> = Optional.ofNullable(binding.getNullable("binding"))

    fun createdAt(): Optional<String> = Optional.ofNullable(createdAt.getNullable("created_at"))

    fun description(): Optional<String> =
        Optional.ofNullable(description.getNullable("description"))

    fun oauth2(): Optional<Oauth2> = Optional.ofNullable(oauth2.getNullable("oauth2"))

    fun providerId(): Optional<String> = Optional.ofNullable(providerId.getNullable("provider_id"))

    fun status(): Optional<String> = Optional.ofNullable(status.getNullable("status"))

    fun type(): Optional<String> = Optional.ofNullable(type.getNullable("type"))

    fun updatedAt(): Optional<String> = Optional.ofNullable(updatedAt.getNullable("updated_at"))

    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    @JsonProperty("binding") @ExcludeMissing fun _binding(): JsonField<Binding> = binding

    @JsonProperty("created_at") @ExcludeMissing fun _createdAt(): JsonField<String> = createdAt

    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    @JsonProperty("oauth2") @ExcludeMissing fun _oauth2(): JsonField<Oauth2> = oauth2

    @JsonProperty("provider_id") @ExcludeMissing fun _providerId(): JsonField<String> = providerId

    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt(): JsonField<String> = updatedAt

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): AuthProviderResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        binding().ifPresent { it.validate() }
        createdAt()
        description()
        oauth2().ifPresent { it.validate() }
        providerId()
        status()
        type()
        updatedAt()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AuthProviderResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var binding: JsonField<Binding> = JsonMissing.of()
        private var createdAt: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var oauth2: JsonField<Oauth2> = JsonMissing.of()
        private var providerId: JsonField<String> = JsonMissing.of()
        private var status: JsonField<String> = JsonMissing.of()
        private var type: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(authProviderResponse: AuthProviderResponse) = apply {
            id = authProviderResponse.id
            binding = authProviderResponse.binding
            createdAt = authProviderResponse.createdAt
            description = authProviderResponse.description
            oauth2 = authProviderResponse.oauth2
            providerId = authProviderResponse.providerId
            status = authProviderResponse.status
            type = authProviderResponse.type
            updatedAt = authProviderResponse.updatedAt
            additionalProperties = authProviderResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        fun binding(binding: Binding) = binding(JsonField.of(binding))

        fun binding(binding: JsonField<Binding>) = apply { this.binding = binding }

        fun createdAt(createdAt: String) = createdAt(JsonField.of(createdAt))

        fun createdAt(createdAt: JsonField<String>) = apply { this.createdAt = createdAt }

        fun description(description: String) = description(JsonField.of(description))

        fun description(description: JsonField<String>) = apply { this.description = description }

        fun oauth2(oauth2: Oauth2) = oauth2(JsonField.of(oauth2))

        fun oauth2(oauth2: JsonField<Oauth2>) = apply { this.oauth2 = oauth2 }

        fun providerId(providerId: String) = providerId(JsonField.of(providerId))

        fun providerId(providerId: JsonField<String>) = apply { this.providerId = providerId }

        fun status(status: String) = status(JsonField.of(status))

        fun status(status: JsonField<String>) = apply { this.status = status }

        fun type(type: String) = type(JsonField.of(type))

        fun type(type: JsonField<String>) = apply { this.type = type }

        fun updatedAt(updatedAt: String) = updatedAt(JsonField.of(updatedAt))

        fun updatedAt(updatedAt: JsonField<String>) = apply { this.updatedAt = updatedAt }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        fun build(): AuthProviderResponse =
            AuthProviderResponse(
                id,
                binding,
                createdAt,
                description,
                oauth2,
                providerId,
                status,
                type,
                updatedAt,
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class Binding
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): Optional<String> = Optional.ofNullable(id.getNullable("id"))

        fun type(): Optional<Type> = Optional.ofNullable(type.getNullable("type"))

        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Binding = apply {
            if (validated) {
                return@apply
            }

            id()
            type()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Binding]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(binding: Binding) = apply {
                id = binding.id
                type = binding.type
                additionalProperties = binding.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

            fun type(type: Type) = type(JsonField.of(type))

            fun type(type: JsonField<Type>) = apply { this.type = type }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): Binding = Binding(id, type, additionalProperties.toImmutable())
        }

        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val STATIC = of("static")

                @JvmField val TENANT = of("tenant")

                @JvmField val PROJECT = of("project")

                @JvmField val ACCOUNT = of("account")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                STATIC,
                TENANT,
                PROJECT,
                ACCOUNT,
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                STATIC,
                TENANT,
                PROJECT,
                ACCOUNT,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    STATIC -> Value.STATIC
                    TENANT -> Value.TENANT
                    PROJECT -> Value.PROJECT
                    ACCOUNT -> Value.ACCOUNT
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws ArcadeInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    STATIC -> Known.STATIC
                    TENANT -> Known.TENANT
                    PROJECT -> Known.PROJECT
                    ACCOUNT -> Known.ACCOUNT
                    else -> throw ArcadeInvalidDataException("Unknown Type: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws ArcadeInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    ArcadeInvalidDataException("Value is not a String")
                }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Type && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Binding && id == other.id && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Binding{id=$id, type=$type, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class Oauth2
    @JsonCreator
    private constructor(
        @JsonProperty("authorize_request")
        @ExcludeMissing
        private val authorizeRequest: JsonField<AuthorizeRequest> = JsonMissing.of(),
        @JsonProperty("client_id")
        @ExcludeMissing
        private val clientId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("client_secret")
        @ExcludeMissing
        private val clientSecret: JsonField<ClientSecret> = JsonMissing.of(),
        @JsonProperty("pkce") @ExcludeMissing private val pkce: JsonField<Pkce> = JsonMissing.of(),
        @JsonProperty("redirect_uri")
        @ExcludeMissing
        private val redirectUri: JsonField<String> = JsonMissing.of(),
        @JsonProperty("refresh_request")
        @ExcludeMissing
        private val refreshRequest: JsonField<RefreshRequest> = JsonMissing.of(),
        @JsonProperty("scope_delimiter")
        @ExcludeMissing
        private val scopeDelimiter: JsonField<String> = JsonMissing.of(),
        @JsonProperty("token_introspection_request")
        @ExcludeMissing
        private val tokenIntrospectionRequest: JsonField<TokenIntrospectionRequest> =
            JsonMissing.of(),
        @JsonProperty("token_request")
        @ExcludeMissing
        private val tokenRequest: JsonField<TokenRequest> = JsonMissing.of(),
        @JsonProperty("user_info_request")
        @ExcludeMissing
        private val userInfoRequest: JsonField<UserInfoRequest> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun authorizeRequest(): Optional<AuthorizeRequest> =
            Optional.ofNullable(authorizeRequest.getNullable("authorize_request"))

        fun clientId(): Optional<String> = Optional.ofNullable(clientId.getNullable("client_id"))

        fun clientSecret(): Optional<ClientSecret> =
            Optional.ofNullable(clientSecret.getNullable("client_secret"))

        fun pkce(): Optional<Pkce> = Optional.ofNullable(pkce.getNullable("pkce"))

        /** The redirect URI required for this provider. */
        fun redirectUri(): Optional<String> =
            Optional.ofNullable(redirectUri.getNullable("redirect_uri"))

        fun refreshRequest(): Optional<RefreshRequest> =
            Optional.ofNullable(refreshRequest.getNullable("refresh_request"))

        fun scopeDelimiter(): Optional<String> =
            Optional.ofNullable(scopeDelimiter.getNullable("scope_delimiter"))

        fun tokenIntrospectionRequest(): Optional<TokenIntrospectionRequest> =
            Optional.ofNullable(
                tokenIntrospectionRequest.getNullable("token_introspection_request")
            )

        fun tokenRequest(): Optional<TokenRequest> =
            Optional.ofNullable(tokenRequest.getNullable("token_request"))

        fun userInfoRequest(): Optional<UserInfoRequest> =
            Optional.ofNullable(userInfoRequest.getNullable("user_info_request"))

        @JsonProperty("authorize_request")
        @ExcludeMissing
        fun _authorizeRequest(): JsonField<AuthorizeRequest> = authorizeRequest

        @JsonProperty("client_id") @ExcludeMissing fun _clientId(): JsonField<String> = clientId

        @JsonProperty("client_secret")
        @ExcludeMissing
        fun _clientSecret(): JsonField<ClientSecret> = clientSecret

        @JsonProperty("pkce") @ExcludeMissing fun _pkce(): JsonField<Pkce> = pkce

        /** The redirect URI required for this provider. */
        @JsonProperty("redirect_uri")
        @ExcludeMissing
        fun _redirectUri(): JsonField<String> = redirectUri

        @JsonProperty("refresh_request")
        @ExcludeMissing
        fun _refreshRequest(): JsonField<RefreshRequest> = refreshRequest

        @JsonProperty("scope_delimiter")
        @ExcludeMissing
        fun _scopeDelimiter(): JsonField<String> = scopeDelimiter

        @JsonProperty("token_introspection_request")
        @ExcludeMissing
        fun _tokenIntrospectionRequest(): JsonField<TokenIntrospectionRequest> =
            tokenIntrospectionRequest

        @JsonProperty("token_request")
        @ExcludeMissing
        fun _tokenRequest(): JsonField<TokenRequest> = tokenRequest

        @JsonProperty("user_info_request")
        @ExcludeMissing
        fun _userInfoRequest(): JsonField<UserInfoRequest> = userInfoRequest

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Oauth2 = apply {
            if (validated) {
                return@apply
            }

            authorizeRequest().ifPresent { it.validate() }
            clientId()
            clientSecret().ifPresent { it.validate() }
            pkce().ifPresent { it.validate() }
            redirectUri()
            refreshRequest().ifPresent { it.validate() }
            scopeDelimiter()
            tokenIntrospectionRequest().ifPresent { it.validate() }
            tokenRequest().ifPresent { it.validate() }
            userInfoRequest().ifPresent { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Oauth2]. */
        class Builder internal constructor() {

            private var authorizeRequest: JsonField<AuthorizeRequest> = JsonMissing.of()
            private var clientId: JsonField<String> = JsonMissing.of()
            private var clientSecret: JsonField<ClientSecret> = JsonMissing.of()
            private var pkce: JsonField<Pkce> = JsonMissing.of()
            private var redirectUri: JsonField<String> = JsonMissing.of()
            private var refreshRequest: JsonField<RefreshRequest> = JsonMissing.of()
            private var scopeDelimiter: JsonField<String> = JsonMissing.of()
            private var tokenIntrospectionRequest: JsonField<TokenIntrospectionRequest> =
                JsonMissing.of()
            private var tokenRequest: JsonField<TokenRequest> = JsonMissing.of()
            private var userInfoRequest: JsonField<UserInfoRequest> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(oauth2: Oauth2) = apply {
                authorizeRequest = oauth2.authorizeRequest
                clientId = oauth2.clientId
                clientSecret = oauth2.clientSecret
                pkce = oauth2.pkce
                redirectUri = oauth2.redirectUri
                refreshRequest = oauth2.refreshRequest
                scopeDelimiter = oauth2.scopeDelimiter
                tokenIntrospectionRequest = oauth2.tokenIntrospectionRequest
                tokenRequest = oauth2.tokenRequest
                userInfoRequest = oauth2.userInfoRequest
                additionalProperties = oauth2.additionalProperties.toMutableMap()
            }

            fun authorizeRequest(authorizeRequest: AuthorizeRequest) =
                authorizeRequest(JsonField.of(authorizeRequest))

            fun authorizeRequest(authorizeRequest: JsonField<AuthorizeRequest>) = apply {
                this.authorizeRequest = authorizeRequest
            }

            fun clientId(clientId: String) = clientId(JsonField.of(clientId))

            fun clientId(clientId: JsonField<String>) = apply { this.clientId = clientId }

            fun clientSecret(clientSecret: ClientSecret) = clientSecret(JsonField.of(clientSecret))

            fun clientSecret(clientSecret: JsonField<ClientSecret>) = apply {
                this.clientSecret = clientSecret
            }

            fun pkce(pkce: Pkce) = pkce(JsonField.of(pkce))

            fun pkce(pkce: JsonField<Pkce>) = apply { this.pkce = pkce }

            /** The redirect URI required for this provider. */
            fun redirectUri(redirectUri: String) = redirectUri(JsonField.of(redirectUri))

            /** The redirect URI required for this provider. */
            fun redirectUri(redirectUri: JsonField<String>) = apply {
                this.redirectUri = redirectUri
            }

            fun refreshRequest(refreshRequest: RefreshRequest) =
                refreshRequest(JsonField.of(refreshRequest))

            fun refreshRequest(refreshRequest: JsonField<RefreshRequest>) = apply {
                this.refreshRequest = refreshRequest
            }

            fun scopeDelimiter(scopeDelimiter: String) =
                scopeDelimiter(JsonField.of(scopeDelimiter))

            fun scopeDelimiter(scopeDelimiter: JsonField<String>) = apply {
                this.scopeDelimiter = scopeDelimiter
            }

            fun tokenIntrospectionRequest(tokenIntrospectionRequest: TokenIntrospectionRequest) =
                tokenIntrospectionRequest(JsonField.of(tokenIntrospectionRequest))

            fun tokenIntrospectionRequest(
                tokenIntrospectionRequest: JsonField<TokenIntrospectionRequest>
            ) = apply { this.tokenIntrospectionRequest = tokenIntrospectionRequest }

            fun tokenRequest(tokenRequest: TokenRequest) = tokenRequest(JsonField.of(tokenRequest))

            fun tokenRequest(tokenRequest: JsonField<TokenRequest>) = apply {
                this.tokenRequest = tokenRequest
            }

            fun userInfoRequest(userInfoRequest: UserInfoRequest) =
                userInfoRequest(JsonField.of(userInfoRequest))

            fun userInfoRequest(userInfoRequest: JsonField<UserInfoRequest>) = apply {
                this.userInfoRequest = userInfoRequest
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): Oauth2 =
                Oauth2(
                    authorizeRequest,
                    clientId,
                    clientSecret,
                    pkce,
                    redirectUri,
                    refreshRequest,
                    scopeDelimiter,
                    tokenIntrospectionRequest,
                    tokenRequest,
                    userInfoRequest,
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class AuthorizeRequest
        @JsonCreator
        private constructor(
            @JsonProperty("auth_header_value_format")
            @ExcludeMissing
            private val authHeaderValueFormat: JsonField<String> = JsonMissing.of(),
            @JsonProperty("auth_method")
            @ExcludeMissing
            private val authMethod: JsonField<String> = JsonMissing.of(),
            @JsonProperty("endpoint")
            @ExcludeMissing
            private val endpoint: JsonField<String> = JsonMissing.of(),
            @JsonProperty("expiration_format")
            @ExcludeMissing
            private val expirationFormat: JsonField<String> = JsonMissing.of(),
            @JsonProperty("method")
            @ExcludeMissing
            private val method: JsonField<String> = JsonMissing.of(),
            @JsonProperty("params")
            @ExcludeMissing
            private val params: JsonField<Params> = JsonMissing.of(),
            @JsonProperty("request_content_type")
            @ExcludeMissing
            private val requestContentType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("response_content_type")
            @ExcludeMissing
            private val responseContentType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("response_map")
            @ExcludeMissing
            private val responseMap: JsonField<ResponseMap> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun authHeaderValueFormat(): Optional<String> =
                Optional.ofNullable(authHeaderValueFormat.getNullable("auth_header_value_format"))

            fun authMethod(): Optional<String> =
                Optional.ofNullable(authMethod.getNullable("auth_method"))

            fun endpoint(): Optional<String> = Optional.ofNullable(endpoint.getNullable("endpoint"))

            fun expirationFormat(): Optional<String> =
                Optional.ofNullable(expirationFormat.getNullable("expiration_format"))

            fun method(): Optional<String> = Optional.ofNullable(method.getNullable("method"))

            fun params(): Optional<Params> = Optional.ofNullable(params.getNullable("params"))

            fun requestContentType(): Optional<String> =
                Optional.ofNullable(requestContentType.getNullable("request_content_type"))

            fun responseContentType(): Optional<String> =
                Optional.ofNullable(responseContentType.getNullable("response_content_type"))

            fun responseMap(): Optional<ResponseMap> =
                Optional.ofNullable(responseMap.getNullable("response_map"))

            @JsonProperty("auth_header_value_format")
            @ExcludeMissing
            fun _authHeaderValueFormat(): JsonField<String> = authHeaderValueFormat

            @JsonProperty("auth_method")
            @ExcludeMissing
            fun _authMethod(): JsonField<String> = authMethod

            @JsonProperty("endpoint") @ExcludeMissing fun _endpoint(): JsonField<String> = endpoint

            @JsonProperty("expiration_format")
            @ExcludeMissing
            fun _expirationFormat(): JsonField<String> = expirationFormat

            @JsonProperty("method") @ExcludeMissing fun _method(): JsonField<String> = method

            @JsonProperty("params") @ExcludeMissing fun _params(): JsonField<Params> = params

            @JsonProperty("request_content_type")
            @ExcludeMissing
            fun _requestContentType(): JsonField<String> = requestContentType

            @JsonProperty("response_content_type")
            @ExcludeMissing
            fun _responseContentType(): JsonField<String> = responseContentType

            @JsonProperty("response_map")
            @ExcludeMissing
            fun _responseMap(): JsonField<ResponseMap> = responseMap

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): AuthorizeRequest = apply {
                if (validated) {
                    return@apply
                }

                authHeaderValueFormat()
                authMethod()
                endpoint()
                expirationFormat()
                method()
                params().ifPresent { it.validate() }
                requestContentType()
                responseContentType()
                responseMap().ifPresent { it.validate() }
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [AuthorizeRequest]. */
            class Builder internal constructor() {

                private var authHeaderValueFormat: JsonField<String> = JsonMissing.of()
                private var authMethod: JsonField<String> = JsonMissing.of()
                private var endpoint: JsonField<String> = JsonMissing.of()
                private var expirationFormat: JsonField<String> = JsonMissing.of()
                private var method: JsonField<String> = JsonMissing.of()
                private var params: JsonField<Params> = JsonMissing.of()
                private var requestContentType: JsonField<String> = JsonMissing.of()
                private var responseContentType: JsonField<String> = JsonMissing.of()
                private var responseMap: JsonField<ResponseMap> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(authorizeRequest: AuthorizeRequest) = apply {
                    authHeaderValueFormat = authorizeRequest.authHeaderValueFormat
                    authMethod = authorizeRequest.authMethod
                    endpoint = authorizeRequest.endpoint
                    expirationFormat = authorizeRequest.expirationFormat
                    method = authorizeRequest.method
                    params = authorizeRequest.params
                    requestContentType = authorizeRequest.requestContentType
                    responseContentType = authorizeRequest.responseContentType
                    responseMap = authorizeRequest.responseMap
                    additionalProperties = authorizeRequest.additionalProperties.toMutableMap()
                }

                fun authHeaderValueFormat(authHeaderValueFormat: String) =
                    authHeaderValueFormat(JsonField.of(authHeaderValueFormat))

                fun authHeaderValueFormat(authHeaderValueFormat: JsonField<String>) = apply {
                    this.authHeaderValueFormat = authHeaderValueFormat
                }

                fun authMethod(authMethod: String) = authMethod(JsonField.of(authMethod))

                fun authMethod(authMethod: JsonField<String>) = apply {
                    this.authMethod = authMethod
                }

                fun endpoint(endpoint: String) = endpoint(JsonField.of(endpoint))

                fun endpoint(endpoint: JsonField<String>) = apply { this.endpoint = endpoint }

                fun expirationFormat(expirationFormat: String) =
                    expirationFormat(JsonField.of(expirationFormat))

                fun expirationFormat(expirationFormat: JsonField<String>) = apply {
                    this.expirationFormat = expirationFormat
                }

                fun method(method: String) = method(JsonField.of(method))

                fun method(method: JsonField<String>) = apply { this.method = method }

                fun params(params: Params) = params(JsonField.of(params))

                fun params(params: JsonField<Params>) = apply { this.params = params }

                fun requestContentType(requestContentType: String) =
                    requestContentType(JsonField.of(requestContentType))

                fun requestContentType(requestContentType: JsonField<String>) = apply {
                    this.requestContentType = requestContentType
                }

                fun responseContentType(responseContentType: String) =
                    responseContentType(JsonField.of(responseContentType))

                fun responseContentType(responseContentType: JsonField<String>) = apply {
                    this.responseContentType = responseContentType
                }

                fun responseMap(responseMap: ResponseMap) = responseMap(JsonField.of(responseMap))

                fun responseMap(responseMap: JsonField<ResponseMap>) = apply {
                    this.responseMap = responseMap
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): AuthorizeRequest =
                    AuthorizeRequest(
                        authHeaderValueFormat,
                        authMethod,
                        endpoint,
                        expirationFormat,
                        method,
                        params,
                        requestContentType,
                        responseContentType,
                        responseMap,
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class Params
            @JsonCreator
            private constructor(
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Params = apply {
                    if (validated) {
                        return@apply
                    }

                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Params]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(params: Params) = apply {
                        additionalProperties = params.additionalProperties.toMutableMap()
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    fun build(): Params = Params(additionalProperties.toImmutable())
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Params && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() = "Params{additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class ResponseMap
            @JsonCreator
            private constructor(
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): ResponseMap = apply {
                    if (validated) {
                        return@apply
                    }

                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [ResponseMap]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(responseMap: ResponseMap) = apply {
                        additionalProperties = responseMap.additionalProperties.toMutableMap()
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    fun build(): ResponseMap = ResponseMap(additionalProperties.toImmutable())
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ResponseMap && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() = "ResponseMap{additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AuthorizeRequest && authHeaderValueFormat == other.authHeaderValueFormat && authMethod == other.authMethod && endpoint == other.endpoint && expirationFormat == other.expirationFormat && method == other.method && params == other.params && requestContentType == other.requestContentType && responseContentType == other.responseContentType && responseMap == other.responseMap && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(authHeaderValueFormat, authMethod, endpoint, expirationFormat, method, params, requestContentType, responseContentType, responseMap, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AuthorizeRequest{authHeaderValueFormat=$authHeaderValueFormat, authMethod=$authMethod, endpoint=$endpoint, expirationFormat=$expirationFormat, method=$method, params=$params, requestContentType=$requestContentType, responseContentType=$responseContentType, responseMap=$responseMap, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class ClientSecret
        @JsonCreator
        private constructor(
            @JsonProperty("binding")
            @ExcludeMissing
            private val binding: JsonField<Binding> = JsonMissing.of(),
            @JsonProperty("editable")
            @ExcludeMissing
            private val editable: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("exists")
            @ExcludeMissing
            private val exists: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("hint")
            @ExcludeMissing
            private val hint: JsonField<String> = JsonMissing.of(),
            @JsonProperty("value")
            @ExcludeMissing
            private val value: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun binding(): Optional<Binding> = Optional.ofNullable(binding.getNullable("binding"))

            fun editable(): Optional<Boolean> =
                Optional.ofNullable(editable.getNullable("editable"))

            fun exists(): Optional<Boolean> = Optional.ofNullable(exists.getNullable("exists"))

            fun hint(): Optional<String> = Optional.ofNullable(hint.getNullable("hint"))

            fun value(): Optional<String> = Optional.ofNullable(value.getNullable("value"))

            @JsonProperty("binding") @ExcludeMissing fun _binding(): JsonField<Binding> = binding

            @JsonProperty("editable") @ExcludeMissing fun _editable(): JsonField<Boolean> = editable

            @JsonProperty("exists") @ExcludeMissing fun _exists(): JsonField<Boolean> = exists

            @JsonProperty("hint") @ExcludeMissing fun _hint(): JsonField<String> = hint

            @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): ClientSecret = apply {
                if (validated) {
                    return@apply
                }

                binding()
                editable()
                exists()
                hint()
                value()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ClientSecret]. */
            class Builder internal constructor() {

                private var binding: JsonField<Binding> = JsonMissing.of()
                private var editable: JsonField<Boolean> = JsonMissing.of()
                private var exists: JsonField<Boolean> = JsonMissing.of()
                private var hint: JsonField<String> = JsonMissing.of()
                private var value: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(clientSecret: ClientSecret) = apply {
                    binding = clientSecret.binding
                    editable = clientSecret.editable
                    exists = clientSecret.exists
                    hint = clientSecret.hint
                    value = clientSecret.value
                    additionalProperties = clientSecret.additionalProperties.toMutableMap()
                }

                fun binding(binding: Binding) = binding(JsonField.of(binding))

                fun binding(binding: JsonField<Binding>) = apply { this.binding = binding }

                fun editable(editable: Boolean) = editable(JsonField.of(editable))

                fun editable(editable: JsonField<Boolean>) = apply { this.editable = editable }

                fun exists(exists: Boolean) = exists(JsonField.of(exists))

                fun exists(exists: JsonField<Boolean>) = apply { this.exists = exists }

                fun hint(hint: String) = hint(JsonField.of(hint))

                fun hint(hint: JsonField<String>) = apply { this.hint = hint }

                fun value(value: String) = value(JsonField.of(value))

                fun value(value: JsonField<String>) = apply { this.value = value }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): ClientSecret =
                    ClientSecret(
                        binding,
                        editable,
                        exists,
                        hint,
                        value,
                        additionalProperties.toImmutable(),
                    )
            }

            class Binding @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val STATIC = of("static")

                    @JvmField val TENANT = of("tenant")

                    @JvmField val PROJECT = of("project")

                    @JvmField val ACCOUNT = of("account")

                    @JvmStatic fun of(value: String) = Binding(JsonField.of(value))
                }

                /** An enum containing [Binding]'s known values. */
                enum class Known {
                    STATIC,
                    TENANT,
                    PROJECT,
                    ACCOUNT,
                }

                /**
                 * An enum containing [Binding]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Binding] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    STATIC,
                    TENANT,
                    PROJECT,
                    ACCOUNT,
                    /**
                     * An enum member indicating that [Binding] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        STATIC -> Value.STATIC
                        TENANT -> Value.TENANT
                        PROJECT -> Value.PROJECT
                        ACCOUNT -> Value.ACCOUNT
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws ArcadeInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        STATIC -> Known.STATIC
                        TENANT -> Known.TENANT
                        PROJECT -> Known.PROJECT
                        ACCOUNT -> Known.ACCOUNT
                        else -> throw ArcadeInvalidDataException("Unknown Binding: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws ArcadeInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        ArcadeInvalidDataException("Value is not a String")
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Binding && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ClientSecret && binding == other.binding && editable == other.editable && exists == other.exists && hint == other.hint && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(binding, editable, exists, hint, value, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ClientSecret{binding=$binding, editable=$editable, exists=$exists, hint=$hint, value=$value, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class Pkce
        @JsonCreator
        private constructor(
            @JsonProperty("code_challenge_method")
            @ExcludeMissing
            private val codeChallengeMethod: JsonField<String> = JsonMissing.of(),
            @JsonProperty("enabled")
            @ExcludeMissing
            private val enabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun codeChallengeMethod(): Optional<String> =
                Optional.ofNullable(codeChallengeMethod.getNullable("code_challenge_method"))

            fun enabled(): Optional<Boolean> = Optional.ofNullable(enabled.getNullable("enabled"))

            @JsonProperty("code_challenge_method")
            @ExcludeMissing
            fun _codeChallengeMethod(): JsonField<String> = codeChallengeMethod

            @JsonProperty("enabled") @ExcludeMissing fun _enabled(): JsonField<Boolean> = enabled

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Pkce = apply {
                if (validated) {
                    return@apply
                }

                codeChallengeMethod()
                enabled()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Pkce]. */
            class Builder internal constructor() {

                private var codeChallengeMethod: JsonField<String> = JsonMissing.of()
                private var enabled: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(pkce: Pkce) = apply {
                    codeChallengeMethod = pkce.codeChallengeMethod
                    enabled = pkce.enabled
                    additionalProperties = pkce.additionalProperties.toMutableMap()
                }

                fun codeChallengeMethod(codeChallengeMethod: String) =
                    codeChallengeMethod(JsonField.of(codeChallengeMethod))

                fun codeChallengeMethod(codeChallengeMethod: JsonField<String>) = apply {
                    this.codeChallengeMethod = codeChallengeMethod
                }

                fun enabled(enabled: Boolean) = enabled(JsonField.of(enabled))

                fun enabled(enabled: JsonField<Boolean>) = apply { this.enabled = enabled }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): Pkce =
                    Pkce(codeChallengeMethod, enabled, additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Pkce && codeChallengeMethod == other.codeChallengeMethod && enabled == other.enabled && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(codeChallengeMethod, enabled, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Pkce{codeChallengeMethod=$codeChallengeMethod, enabled=$enabled, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class RefreshRequest
        @JsonCreator
        private constructor(
            @JsonProperty("auth_header_value_format")
            @ExcludeMissing
            private val authHeaderValueFormat: JsonField<String> = JsonMissing.of(),
            @JsonProperty("auth_method")
            @ExcludeMissing
            private val authMethod: JsonField<String> = JsonMissing.of(),
            @JsonProperty("endpoint")
            @ExcludeMissing
            private val endpoint: JsonField<String> = JsonMissing.of(),
            @JsonProperty("expiration_format")
            @ExcludeMissing
            private val expirationFormat: JsonField<String> = JsonMissing.of(),
            @JsonProperty("method")
            @ExcludeMissing
            private val method: JsonField<String> = JsonMissing.of(),
            @JsonProperty("params")
            @ExcludeMissing
            private val params: JsonField<Params> = JsonMissing.of(),
            @JsonProperty("request_content_type")
            @ExcludeMissing
            private val requestContentType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("response_content_type")
            @ExcludeMissing
            private val responseContentType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("response_map")
            @ExcludeMissing
            private val responseMap: JsonField<ResponseMap> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun authHeaderValueFormat(): Optional<String> =
                Optional.ofNullable(authHeaderValueFormat.getNullable("auth_header_value_format"))

            fun authMethod(): Optional<String> =
                Optional.ofNullable(authMethod.getNullable("auth_method"))

            fun endpoint(): Optional<String> = Optional.ofNullable(endpoint.getNullable("endpoint"))

            fun expirationFormat(): Optional<String> =
                Optional.ofNullable(expirationFormat.getNullable("expiration_format"))

            fun method(): Optional<String> = Optional.ofNullable(method.getNullable("method"))

            fun params(): Optional<Params> = Optional.ofNullable(params.getNullable("params"))

            fun requestContentType(): Optional<String> =
                Optional.ofNullable(requestContentType.getNullable("request_content_type"))

            fun responseContentType(): Optional<String> =
                Optional.ofNullable(responseContentType.getNullable("response_content_type"))

            fun responseMap(): Optional<ResponseMap> =
                Optional.ofNullable(responseMap.getNullable("response_map"))

            @JsonProperty("auth_header_value_format")
            @ExcludeMissing
            fun _authHeaderValueFormat(): JsonField<String> = authHeaderValueFormat

            @JsonProperty("auth_method")
            @ExcludeMissing
            fun _authMethod(): JsonField<String> = authMethod

            @JsonProperty("endpoint") @ExcludeMissing fun _endpoint(): JsonField<String> = endpoint

            @JsonProperty("expiration_format")
            @ExcludeMissing
            fun _expirationFormat(): JsonField<String> = expirationFormat

            @JsonProperty("method") @ExcludeMissing fun _method(): JsonField<String> = method

            @JsonProperty("params") @ExcludeMissing fun _params(): JsonField<Params> = params

            @JsonProperty("request_content_type")
            @ExcludeMissing
            fun _requestContentType(): JsonField<String> = requestContentType

            @JsonProperty("response_content_type")
            @ExcludeMissing
            fun _responseContentType(): JsonField<String> = responseContentType

            @JsonProperty("response_map")
            @ExcludeMissing
            fun _responseMap(): JsonField<ResponseMap> = responseMap

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): RefreshRequest = apply {
                if (validated) {
                    return@apply
                }

                authHeaderValueFormat()
                authMethod()
                endpoint()
                expirationFormat()
                method()
                params().ifPresent { it.validate() }
                requestContentType()
                responseContentType()
                responseMap().ifPresent { it.validate() }
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [RefreshRequest]. */
            class Builder internal constructor() {

                private var authHeaderValueFormat: JsonField<String> = JsonMissing.of()
                private var authMethod: JsonField<String> = JsonMissing.of()
                private var endpoint: JsonField<String> = JsonMissing.of()
                private var expirationFormat: JsonField<String> = JsonMissing.of()
                private var method: JsonField<String> = JsonMissing.of()
                private var params: JsonField<Params> = JsonMissing.of()
                private var requestContentType: JsonField<String> = JsonMissing.of()
                private var responseContentType: JsonField<String> = JsonMissing.of()
                private var responseMap: JsonField<ResponseMap> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(refreshRequest: RefreshRequest) = apply {
                    authHeaderValueFormat = refreshRequest.authHeaderValueFormat
                    authMethod = refreshRequest.authMethod
                    endpoint = refreshRequest.endpoint
                    expirationFormat = refreshRequest.expirationFormat
                    method = refreshRequest.method
                    params = refreshRequest.params
                    requestContentType = refreshRequest.requestContentType
                    responseContentType = refreshRequest.responseContentType
                    responseMap = refreshRequest.responseMap
                    additionalProperties = refreshRequest.additionalProperties.toMutableMap()
                }

                fun authHeaderValueFormat(authHeaderValueFormat: String) =
                    authHeaderValueFormat(JsonField.of(authHeaderValueFormat))

                fun authHeaderValueFormat(authHeaderValueFormat: JsonField<String>) = apply {
                    this.authHeaderValueFormat = authHeaderValueFormat
                }

                fun authMethod(authMethod: String) = authMethod(JsonField.of(authMethod))

                fun authMethod(authMethod: JsonField<String>) = apply {
                    this.authMethod = authMethod
                }

                fun endpoint(endpoint: String) = endpoint(JsonField.of(endpoint))

                fun endpoint(endpoint: JsonField<String>) = apply { this.endpoint = endpoint }

                fun expirationFormat(expirationFormat: String) =
                    expirationFormat(JsonField.of(expirationFormat))

                fun expirationFormat(expirationFormat: JsonField<String>) = apply {
                    this.expirationFormat = expirationFormat
                }

                fun method(method: String) = method(JsonField.of(method))

                fun method(method: JsonField<String>) = apply { this.method = method }

                fun params(params: Params) = params(JsonField.of(params))

                fun params(params: JsonField<Params>) = apply { this.params = params }

                fun requestContentType(requestContentType: String) =
                    requestContentType(JsonField.of(requestContentType))

                fun requestContentType(requestContentType: JsonField<String>) = apply {
                    this.requestContentType = requestContentType
                }

                fun responseContentType(responseContentType: String) =
                    responseContentType(JsonField.of(responseContentType))

                fun responseContentType(responseContentType: JsonField<String>) = apply {
                    this.responseContentType = responseContentType
                }

                fun responseMap(responseMap: ResponseMap) = responseMap(JsonField.of(responseMap))

                fun responseMap(responseMap: JsonField<ResponseMap>) = apply {
                    this.responseMap = responseMap
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): RefreshRequest =
                    RefreshRequest(
                        authHeaderValueFormat,
                        authMethod,
                        endpoint,
                        expirationFormat,
                        method,
                        params,
                        requestContentType,
                        responseContentType,
                        responseMap,
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class Params
            @JsonCreator
            private constructor(
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Params = apply {
                    if (validated) {
                        return@apply
                    }

                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Params]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(params: Params) = apply {
                        additionalProperties = params.additionalProperties.toMutableMap()
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    fun build(): Params = Params(additionalProperties.toImmutable())
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Params && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() = "Params{additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class ResponseMap
            @JsonCreator
            private constructor(
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): ResponseMap = apply {
                    if (validated) {
                        return@apply
                    }

                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [ResponseMap]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(responseMap: ResponseMap) = apply {
                        additionalProperties = responseMap.additionalProperties.toMutableMap()
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    fun build(): ResponseMap = ResponseMap(additionalProperties.toImmutable())
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ResponseMap && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() = "ResponseMap{additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is RefreshRequest && authHeaderValueFormat == other.authHeaderValueFormat && authMethod == other.authMethod && endpoint == other.endpoint && expirationFormat == other.expirationFormat && method == other.method && params == other.params && requestContentType == other.requestContentType && responseContentType == other.responseContentType && responseMap == other.responseMap && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(authHeaderValueFormat, authMethod, endpoint, expirationFormat, method, params, requestContentType, responseContentType, responseMap, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "RefreshRequest{authHeaderValueFormat=$authHeaderValueFormat, authMethod=$authMethod, endpoint=$endpoint, expirationFormat=$expirationFormat, method=$method, params=$params, requestContentType=$requestContentType, responseContentType=$responseContentType, responseMap=$responseMap, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class TokenIntrospectionRequest
        @JsonCreator
        private constructor(
            @JsonProperty("auth_header_value_format")
            @ExcludeMissing
            private val authHeaderValueFormat: JsonField<String> = JsonMissing.of(),
            @JsonProperty("auth_method")
            @ExcludeMissing
            private val authMethod: JsonField<String> = JsonMissing.of(),
            @JsonProperty("enabled")
            @ExcludeMissing
            private val enabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("endpoint")
            @ExcludeMissing
            private val endpoint: JsonField<String> = JsonMissing.of(),
            @JsonProperty("expiration_format")
            @ExcludeMissing
            private val expirationFormat: JsonField<String> = JsonMissing.of(),
            @JsonProperty("method")
            @ExcludeMissing
            private val method: JsonField<String> = JsonMissing.of(),
            @JsonProperty("params")
            @ExcludeMissing
            private val params: JsonField<Params> = JsonMissing.of(),
            @JsonProperty("request_content_type")
            @ExcludeMissing
            private val requestContentType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("response_content_type")
            @ExcludeMissing
            private val responseContentType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("response_map")
            @ExcludeMissing
            private val responseMap: JsonField<ResponseMap> = JsonMissing.of(),
            @JsonProperty("triggers")
            @ExcludeMissing
            private val triggers: JsonField<Triggers> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun authHeaderValueFormat(): Optional<String> =
                Optional.ofNullable(authHeaderValueFormat.getNullable("auth_header_value_format"))

            fun authMethod(): Optional<String> =
                Optional.ofNullable(authMethod.getNullable("auth_method"))

            fun enabled(): Optional<Boolean> = Optional.ofNullable(enabled.getNullable("enabled"))

            fun endpoint(): Optional<String> = Optional.ofNullable(endpoint.getNullable("endpoint"))

            fun expirationFormat(): Optional<String> =
                Optional.ofNullable(expirationFormat.getNullable("expiration_format"))

            fun method(): Optional<String> = Optional.ofNullable(method.getNullable("method"))

            fun params(): Optional<Params> = Optional.ofNullable(params.getNullable("params"))

            fun requestContentType(): Optional<String> =
                Optional.ofNullable(requestContentType.getNullable("request_content_type"))

            fun responseContentType(): Optional<String> =
                Optional.ofNullable(responseContentType.getNullable("response_content_type"))

            fun responseMap(): Optional<ResponseMap> =
                Optional.ofNullable(responseMap.getNullable("response_map"))

            fun triggers(): Optional<Triggers> =
                Optional.ofNullable(triggers.getNullable("triggers"))

            @JsonProperty("auth_header_value_format")
            @ExcludeMissing
            fun _authHeaderValueFormat(): JsonField<String> = authHeaderValueFormat

            @JsonProperty("auth_method")
            @ExcludeMissing
            fun _authMethod(): JsonField<String> = authMethod

            @JsonProperty("enabled") @ExcludeMissing fun _enabled(): JsonField<Boolean> = enabled

            @JsonProperty("endpoint") @ExcludeMissing fun _endpoint(): JsonField<String> = endpoint

            @JsonProperty("expiration_format")
            @ExcludeMissing
            fun _expirationFormat(): JsonField<String> = expirationFormat

            @JsonProperty("method") @ExcludeMissing fun _method(): JsonField<String> = method

            @JsonProperty("params") @ExcludeMissing fun _params(): JsonField<Params> = params

            @JsonProperty("request_content_type")
            @ExcludeMissing
            fun _requestContentType(): JsonField<String> = requestContentType

            @JsonProperty("response_content_type")
            @ExcludeMissing
            fun _responseContentType(): JsonField<String> = responseContentType

            @JsonProperty("response_map")
            @ExcludeMissing
            fun _responseMap(): JsonField<ResponseMap> = responseMap

            @JsonProperty("triggers")
            @ExcludeMissing
            fun _triggers(): JsonField<Triggers> = triggers

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): TokenIntrospectionRequest = apply {
                if (validated) {
                    return@apply
                }

                authHeaderValueFormat()
                authMethod()
                enabled()
                endpoint()
                expirationFormat()
                method()
                params().ifPresent { it.validate() }
                requestContentType()
                responseContentType()
                responseMap().ifPresent { it.validate() }
                triggers().ifPresent { it.validate() }
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [TokenIntrospectionRequest]. */
            class Builder internal constructor() {

                private var authHeaderValueFormat: JsonField<String> = JsonMissing.of()
                private var authMethod: JsonField<String> = JsonMissing.of()
                private var enabled: JsonField<Boolean> = JsonMissing.of()
                private var endpoint: JsonField<String> = JsonMissing.of()
                private var expirationFormat: JsonField<String> = JsonMissing.of()
                private var method: JsonField<String> = JsonMissing.of()
                private var params: JsonField<Params> = JsonMissing.of()
                private var requestContentType: JsonField<String> = JsonMissing.of()
                private var responseContentType: JsonField<String> = JsonMissing.of()
                private var responseMap: JsonField<ResponseMap> = JsonMissing.of()
                private var triggers: JsonField<Triggers> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(tokenIntrospectionRequest: TokenIntrospectionRequest) = apply {
                    authHeaderValueFormat = tokenIntrospectionRequest.authHeaderValueFormat
                    authMethod = tokenIntrospectionRequest.authMethod
                    enabled = tokenIntrospectionRequest.enabled
                    endpoint = tokenIntrospectionRequest.endpoint
                    expirationFormat = tokenIntrospectionRequest.expirationFormat
                    method = tokenIntrospectionRequest.method
                    params = tokenIntrospectionRequest.params
                    requestContentType = tokenIntrospectionRequest.requestContentType
                    responseContentType = tokenIntrospectionRequest.responseContentType
                    responseMap = tokenIntrospectionRequest.responseMap
                    triggers = tokenIntrospectionRequest.triggers
                    additionalProperties =
                        tokenIntrospectionRequest.additionalProperties.toMutableMap()
                }

                fun authHeaderValueFormat(authHeaderValueFormat: String) =
                    authHeaderValueFormat(JsonField.of(authHeaderValueFormat))

                fun authHeaderValueFormat(authHeaderValueFormat: JsonField<String>) = apply {
                    this.authHeaderValueFormat = authHeaderValueFormat
                }

                fun authMethod(authMethod: String) = authMethod(JsonField.of(authMethod))

                fun authMethod(authMethod: JsonField<String>) = apply {
                    this.authMethod = authMethod
                }

                fun enabled(enabled: Boolean) = enabled(JsonField.of(enabled))

                fun enabled(enabled: JsonField<Boolean>) = apply { this.enabled = enabled }

                fun endpoint(endpoint: String) = endpoint(JsonField.of(endpoint))

                fun endpoint(endpoint: JsonField<String>) = apply { this.endpoint = endpoint }

                fun expirationFormat(expirationFormat: String) =
                    expirationFormat(JsonField.of(expirationFormat))

                fun expirationFormat(expirationFormat: JsonField<String>) = apply {
                    this.expirationFormat = expirationFormat
                }

                fun method(method: String) = method(JsonField.of(method))

                fun method(method: JsonField<String>) = apply { this.method = method }

                fun params(params: Params) = params(JsonField.of(params))

                fun params(params: JsonField<Params>) = apply { this.params = params }

                fun requestContentType(requestContentType: String) =
                    requestContentType(JsonField.of(requestContentType))

                fun requestContentType(requestContentType: JsonField<String>) = apply {
                    this.requestContentType = requestContentType
                }

                fun responseContentType(responseContentType: String) =
                    responseContentType(JsonField.of(responseContentType))

                fun responseContentType(responseContentType: JsonField<String>) = apply {
                    this.responseContentType = responseContentType
                }

                fun responseMap(responseMap: ResponseMap) = responseMap(JsonField.of(responseMap))

                fun responseMap(responseMap: JsonField<ResponseMap>) = apply {
                    this.responseMap = responseMap
                }

                fun triggers(triggers: Triggers) = triggers(JsonField.of(triggers))

                fun triggers(triggers: JsonField<Triggers>) = apply { this.triggers = triggers }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): TokenIntrospectionRequest =
                    TokenIntrospectionRequest(
                        authHeaderValueFormat,
                        authMethod,
                        enabled,
                        endpoint,
                        expirationFormat,
                        method,
                        params,
                        requestContentType,
                        responseContentType,
                        responseMap,
                        triggers,
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class Params
            @JsonCreator
            private constructor(
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Params = apply {
                    if (validated) {
                        return@apply
                    }

                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Params]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(params: Params) = apply {
                        additionalProperties = params.additionalProperties.toMutableMap()
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    fun build(): Params = Params(additionalProperties.toImmutable())
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Params && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() = "Params{additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class ResponseMap
            @JsonCreator
            private constructor(
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): ResponseMap = apply {
                    if (validated) {
                        return@apply
                    }

                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [ResponseMap]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(responseMap: ResponseMap) = apply {
                        additionalProperties = responseMap.additionalProperties.toMutableMap()
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    fun build(): ResponseMap = ResponseMap(additionalProperties.toImmutable())
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ResponseMap && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() = "ResponseMap{additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class Triggers
            @JsonCreator
            private constructor(
                @JsonProperty("on_token_grant")
                @ExcludeMissing
                private val onTokenGrant: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("on_token_refresh")
                @ExcludeMissing
                private val onTokenRefresh: JsonField<Boolean> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun onTokenGrant(): Optional<Boolean> =
                    Optional.ofNullable(onTokenGrant.getNullable("on_token_grant"))

                fun onTokenRefresh(): Optional<Boolean> =
                    Optional.ofNullable(onTokenRefresh.getNullable("on_token_refresh"))

                @JsonProperty("on_token_grant")
                @ExcludeMissing
                fun _onTokenGrant(): JsonField<Boolean> = onTokenGrant

                @JsonProperty("on_token_refresh")
                @ExcludeMissing
                fun _onTokenRefresh(): JsonField<Boolean> = onTokenRefresh

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Triggers = apply {
                    if (validated) {
                        return@apply
                    }

                    onTokenGrant()
                    onTokenRefresh()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Triggers]. */
                class Builder internal constructor() {

                    private var onTokenGrant: JsonField<Boolean> = JsonMissing.of()
                    private var onTokenRefresh: JsonField<Boolean> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(triggers: Triggers) = apply {
                        onTokenGrant = triggers.onTokenGrant
                        onTokenRefresh = triggers.onTokenRefresh
                        additionalProperties = triggers.additionalProperties.toMutableMap()
                    }

                    fun onTokenGrant(onTokenGrant: Boolean) =
                        onTokenGrant(JsonField.of(onTokenGrant))

                    fun onTokenGrant(onTokenGrant: JsonField<Boolean>) = apply {
                        this.onTokenGrant = onTokenGrant
                    }

                    fun onTokenRefresh(onTokenRefresh: Boolean) =
                        onTokenRefresh(JsonField.of(onTokenRefresh))

                    fun onTokenRefresh(onTokenRefresh: JsonField<Boolean>) = apply {
                        this.onTokenRefresh = onTokenRefresh
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    fun build(): Triggers =
                        Triggers(onTokenGrant, onTokenRefresh, additionalProperties.toImmutable())
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Triggers && onTokenGrant == other.onTokenGrant && onTokenRefresh == other.onTokenRefresh && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(onTokenGrant, onTokenRefresh, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Triggers{onTokenGrant=$onTokenGrant, onTokenRefresh=$onTokenRefresh, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is TokenIntrospectionRequest && authHeaderValueFormat == other.authHeaderValueFormat && authMethod == other.authMethod && enabled == other.enabled && endpoint == other.endpoint && expirationFormat == other.expirationFormat && method == other.method && params == other.params && requestContentType == other.requestContentType && responseContentType == other.responseContentType && responseMap == other.responseMap && triggers == other.triggers && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(authHeaderValueFormat, authMethod, enabled, endpoint, expirationFormat, method, params, requestContentType, responseContentType, responseMap, triggers, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "TokenIntrospectionRequest{authHeaderValueFormat=$authHeaderValueFormat, authMethod=$authMethod, enabled=$enabled, endpoint=$endpoint, expirationFormat=$expirationFormat, method=$method, params=$params, requestContentType=$requestContentType, responseContentType=$responseContentType, responseMap=$responseMap, triggers=$triggers, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class TokenRequest
        @JsonCreator
        private constructor(
            @JsonProperty("auth_header_value_format")
            @ExcludeMissing
            private val authHeaderValueFormat: JsonField<String> = JsonMissing.of(),
            @JsonProperty("auth_method")
            @ExcludeMissing
            private val authMethod: JsonField<String> = JsonMissing.of(),
            @JsonProperty("endpoint")
            @ExcludeMissing
            private val endpoint: JsonField<String> = JsonMissing.of(),
            @JsonProperty("expiration_format")
            @ExcludeMissing
            private val expirationFormat: JsonField<String> = JsonMissing.of(),
            @JsonProperty("method")
            @ExcludeMissing
            private val method: JsonField<String> = JsonMissing.of(),
            @JsonProperty("params")
            @ExcludeMissing
            private val params: JsonField<Params> = JsonMissing.of(),
            @JsonProperty("request_content_type")
            @ExcludeMissing
            private val requestContentType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("response_content_type")
            @ExcludeMissing
            private val responseContentType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("response_map")
            @ExcludeMissing
            private val responseMap: JsonField<ResponseMap> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun authHeaderValueFormat(): Optional<String> =
                Optional.ofNullable(authHeaderValueFormat.getNullable("auth_header_value_format"))

            fun authMethod(): Optional<String> =
                Optional.ofNullable(authMethod.getNullable("auth_method"))

            fun endpoint(): Optional<String> = Optional.ofNullable(endpoint.getNullable("endpoint"))

            fun expirationFormat(): Optional<String> =
                Optional.ofNullable(expirationFormat.getNullable("expiration_format"))

            fun method(): Optional<String> = Optional.ofNullable(method.getNullable("method"))

            fun params(): Optional<Params> = Optional.ofNullable(params.getNullable("params"))

            fun requestContentType(): Optional<String> =
                Optional.ofNullable(requestContentType.getNullable("request_content_type"))

            fun responseContentType(): Optional<String> =
                Optional.ofNullable(responseContentType.getNullable("response_content_type"))

            fun responseMap(): Optional<ResponseMap> =
                Optional.ofNullable(responseMap.getNullable("response_map"))

            @JsonProperty("auth_header_value_format")
            @ExcludeMissing
            fun _authHeaderValueFormat(): JsonField<String> = authHeaderValueFormat

            @JsonProperty("auth_method")
            @ExcludeMissing
            fun _authMethod(): JsonField<String> = authMethod

            @JsonProperty("endpoint") @ExcludeMissing fun _endpoint(): JsonField<String> = endpoint

            @JsonProperty("expiration_format")
            @ExcludeMissing
            fun _expirationFormat(): JsonField<String> = expirationFormat

            @JsonProperty("method") @ExcludeMissing fun _method(): JsonField<String> = method

            @JsonProperty("params") @ExcludeMissing fun _params(): JsonField<Params> = params

            @JsonProperty("request_content_type")
            @ExcludeMissing
            fun _requestContentType(): JsonField<String> = requestContentType

            @JsonProperty("response_content_type")
            @ExcludeMissing
            fun _responseContentType(): JsonField<String> = responseContentType

            @JsonProperty("response_map")
            @ExcludeMissing
            fun _responseMap(): JsonField<ResponseMap> = responseMap

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): TokenRequest = apply {
                if (validated) {
                    return@apply
                }

                authHeaderValueFormat()
                authMethod()
                endpoint()
                expirationFormat()
                method()
                params().ifPresent { it.validate() }
                requestContentType()
                responseContentType()
                responseMap().ifPresent { it.validate() }
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [TokenRequest]. */
            class Builder internal constructor() {

                private var authHeaderValueFormat: JsonField<String> = JsonMissing.of()
                private var authMethod: JsonField<String> = JsonMissing.of()
                private var endpoint: JsonField<String> = JsonMissing.of()
                private var expirationFormat: JsonField<String> = JsonMissing.of()
                private var method: JsonField<String> = JsonMissing.of()
                private var params: JsonField<Params> = JsonMissing.of()
                private var requestContentType: JsonField<String> = JsonMissing.of()
                private var responseContentType: JsonField<String> = JsonMissing.of()
                private var responseMap: JsonField<ResponseMap> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(tokenRequest: TokenRequest) = apply {
                    authHeaderValueFormat = tokenRequest.authHeaderValueFormat
                    authMethod = tokenRequest.authMethod
                    endpoint = tokenRequest.endpoint
                    expirationFormat = tokenRequest.expirationFormat
                    method = tokenRequest.method
                    params = tokenRequest.params
                    requestContentType = tokenRequest.requestContentType
                    responseContentType = tokenRequest.responseContentType
                    responseMap = tokenRequest.responseMap
                    additionalProperties = tokenRequest.additionalProperties.toMutableMap()
                }

                fun authHeaderValueFormat(authHeaderValueFormat: String) =
                    authHeaderValueFormat(JsonField.of(authHeaderValueFormat))

                fun authHeaderValueFormat(authHeaderValueFormat: JsonField<String>) = apply {
                    this.authHeaderValueFormat = authHeaderValueFormat
                }

                fun authMethod(authMethod: String) = authMethod(JsonField.of(authMethod))

                fun authMethod(authMethod: JsonField<String>) = apply {
                    this.authMethod = authMethod
                }

                fun endpoint(endpoint: String) = endpoint(JsonField.of(endpoint))

                fun endpoint(endpoint: JsonField<String>) = apply { this.endpoint = endpoint }

                fun expirationFormat(expirationFormat: String) =
                    expirationFormat(JsonField.of(expirationFormat))

                fun expirationFormat(expirationFormat: JsonField<String>) = apply {
                    this.expirationFormat = expirationFormat
                }

                fun method(method: String) = method(JsonField.of(method))

                fun method(method: JsonField<String>) = apply { this.method = method }

                fun params(params: Params) = params(JsonField.of(params))

                fun params(params: JsonField<Params>) = apply { this.params = params }

                fun requestContentType(requestContentType: String) =
                    requestContentType(JsonField.of(requestContentType))

                fun requestContentType(requestContentType: JsonField<String>) = apply {
                    this.requestContentType = requestContentType
                }

                fun responseContentType(responseContentType: String) =
                    responseContentType(JsonField.of(responseContentType))

                fun responseContentType(responseContentType: JsonField<String>) = apply {
                    this.responseContentType = responseContentType
                }

                fun responseMap(responseMap: ResponseMap) = responseMap(JsonField.of(responseMap))

                fun responseMap(responseMap: JsonField<ResponseMap>) = apply {
                    this.responseMap = responseMap
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): TokenRequest =
                    TokenRequest(
                        authHeaderValueFormat,
                        authMethod,
                        endpoint,
                        expirationFormat,
                        method,
                        params,
                        requestContentType,
                        responseContentType,
                        responseMap,
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class Params
            @JsonCreator
            private constructor(
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Params = apply {
                    if (validated) {
                        return@apply
                    }

                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Params]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(params: Params) = apply {
                        additionalProperties = params.additionalProperties.toMutableMap()
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    fun build(): Params = Params(additionalProperties.toImmutable())
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Params && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() = "Params{additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class ResponseMap
            @JsonCreator
            private constructor(
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): ResponseMap = apply {
                    if (validated) {
                        return@apply
                    }

                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [ResponseMap]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(responseMap: ResponseMap) = apply {
                        additionalProperties = responseMap.additionalProperties.toMutableMap()
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    fun build(): ResponseMap = ResponseMap(additionalProperties.toImmutable())
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ResponseMap && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() = "ResponseMap{additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is TokenRequest && authHeaderValueFormat == other.authHeaderValueFormat && authMethod == other.authMethod && endpoint == other.endpoint && expirationFormat == other.expirationFormat && method == other.method && params == other.params && requestContentType == other.requestContentType && responseContentType == other.responseContentType && responseMap == other.responseMap && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(authHeaderValueFormat, authMethod, endpoint, expirationFormat, method, params, requestContentType, responseContentType, responseMap, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "TokenRequest{authHeaderValueFormat=$authHeaderValueFormat, authMethod=$authMethod, endpoint=$endpoint, expirationFormat=$expirationFormat, method=$method, params=$params, requestContentType=$requestContentType, responseContentType=$responseContentType, responseMap=$responseMap, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class UserInfoRequest
        @JsonCreator
        private constructor(
            @JsonProperty("auth_header_value_format")
            @ExcludeMissing
            private val authHeaderValueFormat: JsonField<String> = JsonMissing.of(),
            @JsonProperty("auth_method")
            @ExcludeMissing
            private val authMethod: JsonField<String> = JsonMissing.of(),
            @JsonProperty("endpoint")
            @ExcludeMissing
            private val endpoint: JsonField<String> = JsonMissing.of(),
            @JsonProperty("expiration_format")
            @ExcludeMissing
            private val expirationFormat: JsonField<String> = JsonMissing.of(),
            @JsonProperty("method")
            @ExcludeMissing
            private val method: JsonField<String> = JsonMissing.of(),
            @JsonProperty("params")
            @ExcludeMissing
            private val params: JsonField<Params> = JsonMissing.of(),
            @JsonProperty("request_content_type")
            @ExcludeMissing
            private val requestContentType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("response_content_type")
            @ExcludeMissing
            private val responseContentType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("response_map")
            @ExcludeMissing
            private val responseMap: JsonField<ResponseMap> = JsonMissing.of(),
            @JsonProperty("triggers")
            @ExcludeMissing
            private val triggers: JsonField<Triggers> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun authHeaderValueFormat(): Optional<String> =
                Optional.ofNullable(authHeaderValueFormat.getNullable("auth_header_value_format"))

            fun authMethod(): Optional<String> =
                Optional.ofNullable(authMethod.getNullable("auth_method"))

            fun endpoint(): Optional<String> = Optional.ofNullable(endpoint.getNullable("endpoint"))

            fun expirationFormat(): Optional<String> =
                Optional.ofNullable(expirationFormat.getNullable("expiration_format"))

            fun method(): Optional<String> = Optional.ofNullable(method.getNullable("method"))

            fun params(): Optional<Params> = Optional.ofNullable(params.getNullable("params"))

            fun requestContentType(): Optional<String> =
                Optional.ofNullable(requestContentType.getNullable("request_content_type"))

            fun responseContentType(): Optional<String> =
                Optional.ofNullable(responseContentType.getNullable("response_content_type"))

            fun responseMap(): Optional<ResponseMap> =
                Optional.ofNullable(responseMap.getNullable("response_map"))

            fun triggers(): Optional<Triggers> =
                Optional.ofNullable(triggers.getNullable("triggers"))

            @JsonProperty("auth_header_value_format")
            @ExcludeMissing
            fun _authHeaderValueFormat(): JsonField<String> = authHeaderValueFormat

            @JsonProperty("auth_method")
            @ExcludeMissing
            fun _authMethod(): JsonField<String> = authMethod

            @JsonProperty("endpoint") @ExcludeMissing fun _endpoint(): JsonField<String> = endpoint

            @JsonProperty("expiration_format")
            @ExcludeMissing
            fun _expirationFormat(): JsonField<String> = expirationFormat

            @JsonProperty("method") @ExcludeMissing fun _method(): JsonField<String> = method

            @JsonProperty("params") @ExcludeMissing fun _params(): JsonField<Params> = params

            @JsonProperty("request_content_type")
            @ExcludeMissing
            fun _requestContentType(): JsonField<String> = requestContentType

            @JsonProperty("response_content_type")
            @ExcludeMissing
            fun _responseContentType(): JsonField<String> = responseContentType

            @JsonProperty("response_map")
            @ExcludeMissing
            fun _responseMap(): JsonField<ResponseMap> = responseMap

            @JsonProperty("triggers")
            @ExcludeMissing
            fun _triggers(): JsonField<Triggers> = triggers

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): UserInfoRequest = apply {
                if (validated) {
                    return@apply
                }

                authHeaderValueFormat()
                authMethod()
                endpoint()
                expirationFormat()
                method()
                params().ifPresent { it.validate() }
                requestContentType()
                responseContentType()
                responseMap().ifPresent { it.validate() }
                triggers().ifPresent { it.validate() }
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [UserInfoRequest]. */
            class Builder internal constructor() {

                private var authHeaderValueFormat: JsonField<String> = JsonMissing.of()
                private var authMethod: JsonField<String> = JsonMissing.of()
                private var endpoint: JsonField<String> = JsonMissing.of()
                private var expirationFormat: JsonField<String> = JsonMissing.of()
                private var method: JsonField<String> = JsonMissing.of()
                private var params: JsonField<Params> = JsonMissing.of()
                private var requestContentType: JsonField<String> = JsonMissing.of()
                private var responseContentType: JsonField<String> = JsonMissing.of()
                private var responseMap: JsonField<ResponseMap> = JsonMissing.of()
                private var triggers: JsonField<Triggers> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(userInfoRequest: UserInfoRequest) = apply {
                    authHeaderValueFormat = userInfoRequest.authHeaderValueFormat
                    authMethod = userInfoRequest.authMethod
                    endpoint = userInfoRequest.endpoint
                    expirationFormat = userInfoRequest.expirationFormat
                    method = userInfoRequest.method
                    params = userInfoRequest.params
                    requestContentType = userInfoRequest.requestContentType
                    responseContentType = userInfoRequest.responseContentType
                    responseMap = userInfoRequest.responseMap
                    triggers = userInfoRequest.triggers
                    additionalProperties = userInfoRequest.additionalProperties.toMutableMap()
                }

                fun authHeaderValueFormat(authHeaderValueFormat: String) =
                    authHeaderValueFormat(JsonField.of(authHeaderValueFormat))

                fun authHeaderValueFormat(authHeaderValueFormat: JsonField<String>) = apply {
                    this.authHeaderValueFormat = authHeaderValueFormat
                }

                fun authMethod(authMethod: String) = authMethod(JsonField.of(authMethod))

                fun authMethod(authMethod: JsonField<String>) = apply {
                    this.authMethod = authMethod
                }

                fun endpoint(endpoint: String) = endpoint(JsonField.of(endpoint))

                fun endpoint(endpoint: JsonField<String>) = apply { this.endpoint = endpoint }

                fun expirationFormat(expirationFormat: String) =
                    expirationFormat(JsonField.of(expirationFormat))

                fun expirationFormat(expirationFormat: JsonField<String>) = apply {
                    this.expirationFormat = expirationFormat
                }

                fun method(method: String) = method(JsonField.of(method))

                fun method(method: JsonField<String>) = apply { this.method = method }

                fun params(params: Params) = params(JsonField.of(params))

                fun params(params: JsonField<Params>) = apply { this.params = params }

                fun requestContentType(requestContentType: String) =
                    requestContentType(JsonField.of(requestContentType))

                fun requestContentType(requestContentType: JsonField<String>) = apply {
                    this.requestContentType = requestContentType
                }

                fun responseContentType(responseContentType: String) =
                    responseContentType(JsonField.of(responseContentType))

                fun responseContentType(responseContentType: JsonField<String>) = apply {
                    this.responseContentType = responseContentType
                }

                fun responseMap(responseMap: ResponseMap) = responseMap(JsonField.of(responseMap))

                fun responseMap(responseMap: JsonField<ResponseMap>) = apply {
                    this.responseMap = responseMap
                }

                fun triggers(triggers: Triggers) = triggers(JsonField.of(triggers))

                fun triggers(triggers: JsonField<Triggers>) = apply { this.triggers = triggers }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): UserInfoRequest =
                    UserInfoRequest(
                        authHeaderValueFormat,
                        authMethod,
                        endpoint,
                        expirationFormat,
                        method,
                        params,
                        requestContentType,
                        responseContentType,
                        responseMap,
                        triggers,
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class Params
            @JsonCreator
            private constructor(
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Params = apply {
                    if (validated) {
                        return@apply
                    }

                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Params]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(params: Params) = apply {
                        additionalProperties = params.additionalProperties.toMutableMap()
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    fun build(): Params = Params(additionalProperties.toImmutable())
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Params && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() = "Params{additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class ResponseMap
            @JsonCreator
            private constructor(
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): ResponseMap = apply {
                    if (validated) {
                        return@apply
                    }

                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [ResponseMap]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(responseMap: ResponseMap) = apply {
                        additionalProperties = responseMap.additionalProperties.toMutableMap()
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    fun build(): ResponseMap = ResponseMap(additionalProperties.toImmutable())
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ResponseMap && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() = "ResponseMap{additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class Triggers
            @JsonCreator
            private constructor(
                @JsonProperty("on_token_grant")
                @ExcludeMissing
                private val onTokenGrant: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("on_token_refresh")
                @ExcludeMissing
                private val onTokenRefresh: JsonField<Boolean> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun onTokenGrant(): Optional<Boolean> =
                    Optional.ofNullable(onTokenGrant.getNullable("on_token_grant"))

                fun onTokenRefresh(): Optional<Boolean> =
                    Optional.ofNullable(onTokenRefresh.getNullable("on_token_refresh"))

                @JsonProperty("on_token_grant")
                @ExcludeMissing
                fun _onTokenGrant(): JsonField<Boolean> = onTokenGrant

                @JsonProperty("on_token_refresh")
                @ExcludeMissing
                fun _onTokenRefresh(): JsonField<Boolean> = onTokenRefresh

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Triggers = apply {
                    if (validated) {
                        return@apply
                    }

                    onTokenGrant()
                    onTokenRefresh()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Triggers]. */
                class Builder internal constructor() {

                    private var onTokenGrant: JsonField<Boolean> = JsonMissing.of()
                    private var onTokenRefresh: JsonField<Boolean> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(triggers: Triggers) = apply {
                        onTokenGrant = triggers.onTokenGrant
                        onTokenRefresh = triggers.onTokenRefresh
                        additionalProperties = triggers.additionalProperties.toMutableMap()
                    }

                    fun onTokenGrant(onTokenGrant: Boolean) =
                        onTokenGrant(JsonField.of(onTokenGrant))

                    fun onTokenGrant(onTokenGrant: JsonField<Boolean>) = apply {
                        this.onTokenGrant = onTokenGrant
                    }

                    fun onTokenRefresh(onTokenRefresh: Boolean) =
                        onTokenRefresh(JsonField.of(onTokenRefresh))

                    fun onTokenRefresh(onTokenRefresh: JsonField<Boolean>) = apply {
                        this.onTokenRefresh = onTokenRefresh
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    fun build(): Triggers =
                        Triggers(onTokenGrant, onTokenRefresh, additionalProperties.toImmutable())
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Triggers && onTokenGrant == other.onTokenGrant && onTokenRefresh == other.onTokenRefresh && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(onTokenGrant, onTokenRefresh, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Triggers{onTokenGrant=$onTokenGrant, onTokenRefresh=$onTokenRefresh, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is UserInfoRequest && authHeaderValueFormat == other.authHeaderValueFormat && authMethod == other.authMethod && endpoint == other.endpoint && expirationFormat == other.expirationFormat && method == other.method && params == other.params && requestContentType == other.requestContentType && responseContentType == other.responseContentType && responseMap == other.responseMap && triggers == other.triggers && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(authHeaderValueFormat, authMethod, endpoint, expirationFormat, method, params, requestContentType, responseContentType, responseMap, triggers, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UserInfoRequest{authHeaderValueFormat=$authHeaderValueFormat, authMethod=$authMethod, endpoint=$endpoint, expirationFormat=$expirationFormat, method=$method, params=$params, requestContentType=$requestContentType, responseContentType=$responseContentType, responseMap=$responseMap, triggers=$triggers, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Oauth2 && authorizeRequest == other.authorizeRequest && clientId == other.clientId && clientSecret == other.clientSecret && pkce == other.pkce && redirectUri == other.redirectUri && refreshRequest == other.refreshRequest && scopeDelimiter == other.scopeDelimiter && tokenIntrospectionRequest == other.tokenIntrospectionRequest && tokenRequest == other.tokenRequest && userInfoRequest == other.userInfoRequest && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(authorizeRequest, clientId, clientSecret, pkce, redirectUri, refreshRequest, scopeDelimiter, tokenIntrospectionRequest, tokenRequest, userInfoRequest, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Oauth2{authorizeRequest=$authorizeRequest, clientId=$clientId, clientSecret=$clientSecret, pkce=$pkce, redirectUri=$redirectUri, refreshRequest=$refreshRequest, scopeDelimiter=$scopeDelimiter, tokenIntrospectionRequest=$tokenIntrospectionRequest, tokenRequest=$tokenRequest, userInfoRequest=$userInfoRequest, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AuthProviderResponse && id == other.id && binding == other.binding && createdAt == other.createdAt && description == other.description && oauth2 == other.oauth2 && providerId == other.providerId && status == other.status && type == other.type && updatedAt == other.updatedAt && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, binding, createdAt, description, oauth2, providerId, status, type, updatedAt, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AuthProviderResponse{id=$id, binding=$binding, createdAt=$createdAt, description=$description, oauth2=$oauth2, providerId=$providerId, status=$status, type=$type, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
