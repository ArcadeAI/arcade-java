// File generated from our OpenAPI spec by Stainless.

package com.arcade_engine.api.models

import com.arcade_engine.api.core.Enum
import com.arcade_engine.api.core.ExcludeMissing
import com.arcade_engine.api.core.JsonField
import com.arcade_engine.api.core.JsonMissing
import com.arcade_engine.api.core.JsonValue
import com.arcade_engine.api.core.NoAutoDetect
import com.arcade_engine.api.core.checkRequired
import com.arcade_engine.api.core.immutableEmptyMap
import com.arcade_engine.api.core.toImmutable
import com.arcade_engine.api.errors.ArcadeInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class AuthProviderCreateRequest
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("description")
    @ExcludeMissing
    private val description: JsonField<String> = JsonMissing.of(),
    @JsonProperty("external_id")
    @ExcludeMissing
    private val externalId: JsonField<String> = JsonMissing.of(),
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
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): String = id.getRequired("id")

    fun description(): Optional<String> =
        Optional.ofNullable(description.getNullable("description"))

    /** The unique external ID for the auth provider */
    fun externalId(): Optional<String> = Optional.ofNullable(externalId.getNullable("external_id"))

    fun oauth2(): Optional<Oauth2> = Optional.ofNullable(oauth2.getNullable("oauth2"))

    fun providerId(): Optional<String> = Optional.ofNullable(providerId.getNullable("provider_id"))

    fun status(): Optional<String> = Optional.ofNullable(status.getNullable("status"))

    fun type(): Optional<String> = Optional.ofNullable(type.getNullable("type"))

    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /** The unique external ID for the auth provider */
    @JsonProperty("external_id") @ExcludeMissing fun _externalId(): JsonField<String> = externalId

    @JsonProperty("oauth2") @ExcludeMissing fun _oauth2(): JsonField<Oauth2> = oauth2

    @JsonProperty("provider_id") @ExcludeMissing fun _providerId(): JsonField<String> = providerId

    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): AuthProviderCreateRequest = apply {
        if (validated) {
            return@apply
        }

        id()
        description()
        externalId()
        oauth2().ifPresent { it.validate() }
        providerId()
        status()
        type()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AuthProviderCreateRequest]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var description: JsonField<String> = JsonMissing.of()
        private var externalId: JsonField<String> = JsonMissing.of()
        private var oauth2: JsonField<Oauth2> = JsonMissing.of()
        private var providerId: JsonField<String> = JsonMissing.of()
        private var status: JsonField<String> = JsonMissing.of()
        private var type: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(authProviderCreateRequest: AuthProviderCreateRequest) = apply {
            id = authProviderCreateRequest.id
            description = authProviderCreateRequest.description
            externalId = authProviderCreateRequest.externalId
            oauth2 = authProviderCreateRequest.oauth2
            providerId = authProviderCreateRequest.providerId
            status = authProviderCreateRequest.status
            type = authProviderCreateRequest.type
            additionalProperties = authProviderCreateRequest.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        fun description(description: String) = description(JsonField.of(description))

        fun description(description: JsonField<String>) = apply { this.description = description }

        /** The unique external ID for the auth provider */
        fun externalId(externalId: String) = externalId(JsonField.of(externalId))

        /** The unique external ID for the auth provider */
        fun externalId(externalId: JsonField<String>) = apply { this.externalId = externalId }

        fun oauth2(oauth2: Oauth2) = oauth2(JsonField.of(oauth2))

        fun oauth2(oauth2: JsonField<Oauth2>) = apply { this.oauth2 = oauth2 }

        fun providerId(providerId: String) = providerId(JsonField.of(providerId))

        fun providerId(providerId: JsonField<String>) = apply { this.providerId = providerId }

        fun status(status: String) = status(JsonField.of(status))

        fun status(status: JsonField<String>) = apply { this.status = status }

        fun type(type: String) = type(JsonField.of(type))

        fun type(type: JsonField<String>) = apply { this.type = type }

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

        fun build(): AuthProviderCreateRequest =
            AuthProviderCreateRequest(
                checkRequired("id", id),
                description,
                externalId,
                oauth2,
                providerId,
                status,
                type,
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class Oauth2
    @JsonCreator
    private constructor(
        @JsonProperty("client_id")
        @ExcludeMissing
        private val clientId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("authorize_request")
        @ExcludeMissing
        private val authorizeRequest: JsonField<AuthorizeRequest> = JsonMissing.of(),
        @JsonProperty("client_secret")
        @ExcludeMissing
        private val clientSecret: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pkce") @ExcludeMissing private val pkce: JsonField<Pkce> = JsonMissing.of(),
        @JsonProperty("refresh_request")
        @ExcludeMissing
        private val refreshRequest: JsonField<RefreshRequest> = JsonMissing.of(),
        @JsonProperty("scope_delimiter")
        @ExcludeMissing
        private val scopeDelimiter: JsonField<ScopeDelimiter> = JsonMissing.of(),
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

        fun clientId(): String = clientId.getRequired("client_id")

        fun authorizeRequest(): Optional<AuthorizeRequest> =
            Optional.ofNullable(authorizeRequest.getNullable("authorize_request"))

        fun clientSecret(): Optional<String> =
            Optional.ofNullable(clientSecret.getNullable("client_secret"))

        fun pkce(): Optional<Pkce> = Optional.ofNullable(pkce.getNullable("pkce"))

        fun refreshRequest(): Optional<RefreshRequest> =
            Optional.ofNullable(refreshRequest.getNullable("refresh_request"))

        fun scopeDelimiter(): Optional<ScopeDelimiter> =
            Optional.ofNullable(scopeDelimiter.getNullable("scope_delimiter"))

        fun tokenIntrospectionRequest(): Optional<TokenIntrospectionRequest> =
            Optional.ofNullable(
                tokenIntrospectionRequest.getNullable("token_introspection_request")
            )

        fun tokenRequest(): Optional<TokenRequest> =
            Optional.ofNullable(tokenRequest.getNullable("token_request"))

        fun userInfoRequest(): Optional<UserInfoRequest> =
            Optional.ofNullable(userInfoRequest.getNullable("user_info_request"))

        @JsonProperty("client_id") @ExcludeMissing fun _clientId(): JsonField<String> = clientId

        @JsonProperty("authorize_request")
        @ExcludeMissing
        fun _authorizeRequest(): JsonField<AuthorizeRequest> = authorizeRequest

        @JsonProperty("client_secret")
        @ExcludeMissing
        fun _clientSecret(): JsonField<String> = clientSecret

        @JsonProperty("pkce") @ExcludeMissing fun _pkce(): JsonField<Pkce> = pkce

        @JsonProperty("refresh_request")
        @ExcludeMissing
        fun _refreshRequest(): JsonField<RefreshRequest> = refreshRequest

        @JsonProperty("scope_delimiter")
        @ExcludeMissing
        fun _scopeDelimiter(): JsonField<ScopeDelimiter> = scopeDelimiter

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

            clientId()
            authorizeRequest().ifPresent { it.validate() }
            clientSecret()
            pkce().ifPresent { it.validate() }
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

            private var clientId: JsonField<String>? = null
            private var authorizeRequest: JsonField<AuthorizeRequest> = JsonMissing.of()
            private var clientSecret: JsonField<String> = JsonMissing.of()
            private var pkce: JsonField<Pkce> = JsonMissing.of()
            private var refreshRequest: JsonField<RefreshRequest> = JsonMissing.of()
            private var scopeDelimiter: JsonField<ScopeDelimiter> = JsonMissing.of()
            private var tokenIntrospectionRequest: JsonField<TokenIntrospectionRequest> =
                JsonMissing.of()
            private var tokenRequest: JsonField<TokenRequest> = JsonMissing.of()
            private var userInfoRequest: JsonField<UserInfoRequest> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(oauth2: Oauth2) = apply {
                clientId = oauth2.clientId
                authorizeRequest = oauth2.authorizeRequest
                clientSecret = oauth2.clientSecret
                pkce = oauth2.pkce
                refreshRequest = oauth2.refreshRequest
                scopeDelimiter = oauth2.scopeDelimiter
                tokenIntrospectionRequest = oauth2.tokenIntrospectionRequest
                tokenRequest = oauth2.tokenRequest
                userInfoRequest = oauth2.userInfoRequest
                additionalProperties = oauth2.additionalProperties.toMutableMap()
            }

            fun clientId(clientId: String) = clientId(JsonField.of(clientId))

            fun clientId(clientId: JsonField<String>) = apply { this.clientId = clientId }

            fun authorizeRequest(authorizeRequest: AuthorizeRequest) =
                authorizeRequest(JsonField.of(authorizeRequest))

            fun authorizeRequest(authorizeRequest: JsonField<AuthorizeRequest>) = apply {
                this.authorizeRequest = authorizeRequest
            }

            fun clientSecret(clientSecret: String) = clientSecret(JsonField.of(clientSecret))

            fun clientSecret(clientSecret: JsonField<String>) = apply {
                this.clientSecret = clientSecret
            }

            fun pkce(pkce: Pkce) = pkce(JsonField.of(pkce))

            fun pkce(pkce: JsonField<Pkce>) = apply { this.pkce = pkce }

            fun refreshRequest(refreshRequest: RefreshRequest) =
                refreshRequest(JsonField.of(refreshRequest))

            fun refreshRequest(refreshRequest: JsonField<RefreshRequest>) = apply {
                this.refreshRequest = refreshRequest
            }

            fun scopeDelimiter(scopeDelimiter: ScopeDelimiter) =
                scopeDelimiter(JsonField.of(scopeDelimiter))

            fun scopeDelimiter(scopeDelimiter: JsonField<ScopeDelimiter>) = apply {
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
                    checkRequired("clientId", clientId),
                    authorizeRequest,
                    clientSecret,
                    pkce,
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
            @JsonProperty("endpoint")
            @ExcludeMissing
            private val endpoint: JsonField<String> = JsonMissing.of(),
            @JsonProperty("auth_method")
            @ExcludeMissing
            private val authMethod: JsonField<String> = JsonMissing.of(),
            @JsonProperty("method")
            @ExcludeMissing
            private val method: JsonField<String> = JsonMissing.of(),
            @JsonProperty("params")
            @ExcludeMissing
            private val params: JsonField<Params> = JsonMissing.of(),
            @JsonProperty("request_content_type")
            @ExcludeMissing
            private val requestContentType: JsonField<RequestContentType> = JsonMissing.of(),
            @JsonProperty("response_content_type")
            @ExcludeMissing
            private val responseContentType: JsonField<ResponseContentType> = JsonMissing.of(),
            @JsonProperty("response_map")
            @ExcludeMissing
            private val responseMap: JsonField<ResponseMap> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun endpoint(): String = endpoint.getRequired("endpoint")

            fun authMethod(): Optional<String> =
                Optional.ofNullable(authMethod.getNullable("auth_method"))

            fun method(): Optional<String> = Optional.ofNullable(method.getNullable("method"))

            fun params(): Optional<Params> = Optional.ofNullable(params.getNullable("params"))

            fun requestContentType(): Optional<RequestContentType> =
                Optional.ofNullable(requestContentType.getNullable("request_content_type"))

            fun responseContentType(): Optional<ResponseContentType> =
                Optional.ofNullable(responseContentType.getNullable("response_content_type"))

            fun responseMap(): Optional<ResponseMap> =
                Optional.ofNullable(responseMap.getNullable("response_map"))

            @JsonProperty("endpoint") @ExcludeMissing fun _endpoint(): JsonField<String> = endpoint

            @JsonProperty("auth_method")
            @ExcludeMissing
            fun _authMethod(): JsonField<String> = authMethod

            @JsonProperty("method") @ExcludeMissing fun _method(): JsonField<String> = method

            @JsonProperty("params") @ExcludeMissing fun _params(): JsonField<Params> = params

            @JsonProperty("request_content_type")
            @ExcludeMissing
            fun _requestContentType(): JsonField<RequestContentType> = requestContentType

            @JsonProperty("response_content_type")
            @ExcludeMissing
            fun _responseContentType(): JsonField<ResponseContentType> = responseContentType

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

                endpoint()
                authMethod()
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

                private var endpoint: JsonField<String>? = null
                private var authMethod: JsonField<String> = JsonMissing.of()
                private var method: JsonField<String> = JsonMissing.of()
                private var params: JsonField<Params> = JsonMissing.of()
                private var requestContentType: JsonField<RequestContentType> = JsonMissing.of()
                private var responseContentType: JsonField<ResponseContentType> = JsonMissing.of()
                private var responseMap: JsonField<ResponseMap> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(authorizeRequest: AuthorizeRequest) = apply {
                    endpoint = authorizeRequest.endpoint
                    authMethod = authorizeRequest.authMethod
                    method = authorizeRequest.method
                    params = authorizeRequest.params
                    requestContentType = authorizeRequest.requestContentType
                    responseContentType = authorizeRequest.responseContentType
                    responseMap = authorizeRequest.responseMap
                    additionalProperties = authorizeRequest.additionalProperties.toMutableMap()
                }

                fun endpoint(endpoint: String) = endpoint(JsonField.of(endpoint))

                fun endpoint(endpoint: JsonField<String>) = apply { this.endpoint = endpoint }

                fun authMethod(authMethod: String) = authMethod(JsonField.of(authMethod))

                fun authMethod(authMethod: JsonField<String>) = apply {
                    this.authMethod = authMethod
                }

                fun method(method: String) = method(JsonField.of(method))

                fun method(method: JsonField<String>) = apply { this.method = method }

                fun params(params: Params) = params(JsonField.of(params))

                fun params(params: JsonField<Params>) = apply { this.params = params }

                fun requestContentType(requestContentType: RequestContentType) =
                    requestContentType(JsonField.of(requestContentType))

                fun requestContentType(requestContentType: JsonField<RequestContentType>) = apply {
                    this.requestContentType = requestContentType
                }

                fun responseContentType(responseContentType: ResponseContentType) =
                    responseContentType(JsonField.of(responseContentType))

                fun responseContentType(responseContentType: JsonField<ResponseContentType>) =
                    apply {
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
                        checkRequired("endpoint", endpoint),
                        authMethod,
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

            class RequestContentType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

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

                    @JvmField
                    val APPLICATION_X_WWW_FORM_URLENCODED = of("application/x-www-form-urlencoded")

                    @JvmField val APPLICATION_JSON = of("application/json")

                    @JvmStatic fun of(value: String) = RequestContentType(JsonField.of(value))
                }

                /** An enum containing [RequestContentType]'s known values. */
                enum class Known {
                    APPLICATION_X_WWW_FORM_URLENCODED,
                    APPLICATION_JSON,
                }

                /**
                 * An enum containing [RequestContentType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [RequestContentType] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    APPLICATION_X_WWW_FORM_URLENCODED,
                    APPLICATION_JSON,
                    /**
                     * An enum member indicating that [RequestContentType] was instantiated with an
                     * unknown value.
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
                        APPLICATION_X_WWW_FORM_URLENCODED -> Value.APPLICATION_X_WWW_FORM_URLENCODED
                        APPLICATION_JSON -> Value.APPLICATION_JSON
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
                        APPLICATION_X_WWW_FORM_URLENCODED -> Known.APPLICATION_X_WWW_FORM_URLENCODED
                        APPLICATION_JSON -> Known.APPLICATION_JSON
                        else ->
                            throw ArcadeInvalidDataException("Unknown RequestContentType: $value")
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

                    return /* spotless:off */ other is RequestContentType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class ResponseContentType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

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

                    @JvmField
                    val APPLICATION_X_WWW_FORM_URLENCODED = of("application/x-www-form-urlencoded")

                    @JvmField val APPLICATION_JSON = of("application/json")

                    @JvmStatic fun of(value: String) = ResponseContentType(JsonField.of(value))
                }

                /** An enum containing [ResponseContentType]'s known values. */
                enum class Known {
                    APPLICATION_X_WWW_FORM_URLENCODED,
                    APPLICATION_JSON,
                }

                /**
                 * An enum containing [ResponseContentType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [ResponseContentType] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    APPLICATION_X_WWW_FORM_URLENCODED,
                    APPLICATION_JSON,
                    /**
                     * An enum member indicating that [ResponseContentType] was instantiated with an
                     * unknown value.
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
                        APPLICATION_X_WWW_FORM_URLENCODED -> Value.APPLICATION_X_WWW_FORM_URLENCODED
                        APPLICATION_JSON -> Value.APPLICATION_JSON
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
                        APPLICATION_X_WWW_FORM_URLENCODED -> Known.APPLICATION_X_WWW_FORM_URLENCODED
                        APPLICATION_JSON -> Known.APPLICATION_JSON
                        else ->
                            throw ArcadeInvalidDataException("Unknown ResponseContentType: $value")
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

                    return /* spotless:off */ other is ResponseContentType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
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

                return /* spotless:off */ other is AuthorizeRequest && endpoint == other.endpoint && authMethod == other.authMethod && method == other.method && params == other.params && requestContentType == other.requestContentType && responseContentType == other.responseContentType && responseMap == other.responseMap && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(endpoint, authMethod, method, params, requestContentType, responseContentType, responseMap, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AuthorizeRequest{endpoint=$endpoint, authMethod=$authMethod, method=$method, params=$params, requestContentType=$requestContentType, responseContentType=$responseContentType, responseMap=$responseMap, additionalProperties=$additionalProperties}"
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
            @JsonProperty("endpoint")
            @ExcludeMissing
            private val endpoint: JsonField<String> = JsonMissing.of(),
            @JsonProperty("auth_method")
            @ExcludeMissing
            private val authMethod: JsonField<String> = JsonMissing.of(),
            @JsonProperty("method")
            @ExcludeMissing
            private val method: JsonField<String> = JsonMissing.of(),
            @JsonProperty("params")
            @ExcludeMissing
            private val params: JsonField<Params> = JsonMissing.of(),
            @JsonProperty("request_content_type")
            @ExcludeMissing
            private val requestContentType: JsonField<RequestContentType> = JsonMissing.of(),
            @JsonProperty("response_content_type")
            @ExcludeMissing
            private val responseContentType: JsonField<ResponseContentType> = JsonMissing.of(),
            @JsonProperty("response_map")
            @ExcludeMissing
            private val responseMap: JsonField<ResponseMap> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun endpoint(): String = endpoint.getRequired("endpoint")

            fun authMethod(): Optional<String> =
                Optional.ofNullable(authMethod.getNullable("auth_method"))

            fun method(): Optional<String> = Optional.ofNullable(method.getNullable("method"))

            fun params(): Optional<Params> = Optional.ofNullable(params.getNullable("params"))

            fun requestContentType(): Optional<RequestContentType> =
                Optional.ofNullable(requestContentType.getNullable("request_content_type"))

            fun responseContentType(): Optional<ResponseContentType> =
                Optional.ofNullable(responseContentType.getNullable("response_content_type"))

            fun responseMap(): Optional<ResponseMap> =
                Optional.ofNullable(responseMap.getNullable("response_map"))

            @JsonProperty("endpoint") @ExcludeMissing fun _endpoint(): JsonField<String> = endpoint

            @JsonProperty("auth_method")
            @ExcludeMissing
            fun _authMethod(): JsonField<String> = authMethod

            @JsonProperty("method") @ExcludeMissing fun _method(): JsonField<String> = method

            @JsonProperty("params") @ExcludeMissing fun _params(): JsonField<Params> = params

            @JsonProperty("request_content_type")
            @ExcludeMissing
            fun _requestContentType(): JsonField<RequestContentType> = requestContentType

            @JsonProperty("response_content_type")
            @ExcludeMissing
            fun _responseContentType(): JsonField<ResponseContentType> = responseContentType

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

                endpoint()
                authMethod()
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

                private var endpoint: JsonField<String>? = null
                private var authMethod: JsonField<String> = JsonMissing.of()
                private var method: JsonField<String> = JsonMissing.of()
                private var params: JsonField<Params> = JsonMissing.of()
                private var requestContentType: JsonField<RequestContentType> = JsonMissing.of()
                private var responseContentType: JsonField<ResponseContentType> = JsonMissing.of()
                private var responseMap: JsonField<ResponseMap> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(refreshRequest: RefreshRequest) = apply {
                    endpoint = refreshRequest.endpoint
                    authMethod = refreshRequest.authMethod
                    method = refreshRequest.method
                    params = refreshRequest.params
                    requestContentType = refreshRequest.requestContentType
                    responseContentType = refreshRequest.responseContentType
                    responseMap = refreshRequest.responseMap
                    additionalProperties = refreshRequest.additionalProperties.toMutableMap()
                }

                fun endpoint(endpoint: String) = endpoint(JsonField.of(endpoint))

                fun endpoint(endpoint: JsonField<String>) = apply { this.endpoint = endpoint }

                fun authMethod(authMethod: String) = authMethod(JsonField.of(authMethod))

                fun authMethod(authMethod: JsonField<String>) = apply {
                    this.authMethod = authMethod
                }

                fun method(method: String) = method(JsonField.of(method))

                fun method(method: JsonField<String>) = apply { this.method = method }

                fun params(params: Params) = params(JsonField.of(params))

                fun params(params: JsonField<Params>) = apply { this.params = params }

                fun requestContentType(requestContentType: RequestContentType) =
                    requestContentType(JsonField.of(requestContentType))

                fun requestContentType(requestContentType: JsonField<RequestContentType>) = apply {
                    this.requestContentType = requestContentType
                }

                fun responseContentType(responseContentType: ResponseContentType) =
                    responseContentType(JsonField.of(responseContentType))

                fun responseContentType(responseContentType: JsonField<ResponseContentType>) =
                    apply {
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
                        checkRequired("endpoint", endpoint),
                        authMethod,
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

            class RequestContentType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

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

                    @JvmField
                    val APPLICATION_X_WWW_FORM_URLENCODED = of("application/x-www-form-urlencoded")

                    @JvmField val APPLICATION_JSON = of("application/json")

                    @JvmStatic fun of(value: String) = RequestContentType(JsonField.of(value))
                }

                /** An enum containing [RequestContentType]'s known values. */
                enum class Known {
                    APPLICATION_X_WWW_FORM_URLENCODED,
                    APPLICATION_JSON,
                }

                /**
                 * An enum containing [RequestContentType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [RequestContentType] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    APPLICATION_X_WWW_FORM_URLENCODED,
                    APPLICATION_JSON,
                    /**
                     * An enum member indicating that [RequestContentType] was instantiated with an
                     * unknown value.
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
                        APPLICATION_X_WWW_FORM_URLENCODED -> Value.APPLICATION_X_WWW_FORM_URLENCODED
                        APPLICATION_JSON -> Value.APPLICATION_JSON
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
                        APPLICATION_X_WWW_FORM_URLENCODED -> Known.APPLICATION_X_WWW_FORM_URLENCODED
                        APPLICATION_JSON -> Known.APPLICATION_JSON
                        else ->
                            throw ArcadeInvalidDataException("Unknown RequestContentType: $value")
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

                    return /* spotless:off */ other is RequestContentType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class ResponseContentType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

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

                    @JvmField
                    val APPLICATION_X_WWW_FORM_URLENCODED = of("application/x-www-form-urlencoded")

                    @JvmField val APPLICATION_JSON = of("application/json")

                    @JvmStatic fun of(value: String) = ResponseContentType(JsonField.of(value))
                }

                /** An enum containing [ResponseContentType]'s known values. */
                enum class Known {
                    APPLICATION_X_WWW_FORM_URLENCODED,
                    APPLICATION_JSON,
                }

                /**
                 * An enum containing [ResponseContentType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [ResponseContentType] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    APPLICATION_X_WWW_FORM_URLENCODED,
                    APPLICATION_JSON,
                    /**
                     * An enum member indicating that [ResponseContentType] was instantiated with an
                     * unknown value.
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
                        APPLICATION_X_WWW_FORM_URLENCODED -> Value.APPLICATION_X_WWW_FORM_URLENCODED
                        APPLICATION_JSON -> Value.APPLICATION_JSON
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
                        APPLICATION_X_WWW_FORM_URLENCODED -> Known.APPLICATION_X_WWW_FORM_URLENCODED
                        APPLICATION_JSON -> Known.APPLICATION_JSON
                        else ->
                            throw ArcadeInvalidDataException("Unknown ResponseContentType: $value")
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

                    return /* spotless:off */ other is ResponseContentType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
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

                return /* spotless:off */ other is RefreshRequest && endpoint == other.endpoint && authMethod == other.authMethod && method == other.method && params == other.params && requestContentType == other.requestContentType && responseContentType == other.responseContentType && responseMap == other.responseMap && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(endpoint, authMethod, method, params, requestContentType, responseContentType, responseMap, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "RefreshRequest{endpoint=$endpoint, authMethod=$authMethod, method=$method, params=$params, requestContentType=$requestContentType, responseContentType=$responseContentType, responseMap=$responseMap, additionalProperties=$additionalProperties}"
        }

        class ScopeDelimiter
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val Unknown0 = of(",")

                @JvmField val Unknown2 = of(" ")

                @JvmStatic fun of(value: String) = ScopeDelimiter(JsonField.of(value))
            }

            /** An enum containing [ScopeDelimiter]'s known values. */
            enum class Known {
                Unknown0,
                Unknown2,
            }

            /**
             * An enum containing [ScopeDelimiter]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [ScopeDelimiter] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                Unknown0,
                Unknown2,
                /**
                 * An enum member indicating that [ScopeDelimiter] was instantiated with an unknown
                 * value.
                 */
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
                    Unknown0 -> Value.Unknown0
                    Unknown2 -> Value.Unknown2
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
                    Unknown0 -> Known.Unknown0
                    Unknown2 -> Known.Unknown2
                    else -> throw ArcadeInvalidDataException("Unknown ScopeDelimiter: $value")
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

                return /* spotless:off */ other is ScopeDelimiter && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        @NoAutoDetect
        class TokenIntrospectionRequest
        @JsonCreator
        private constructor(
            @JsonProperty("endpoint")
            @ExcludeMissing
            private val endpoint: JsonField<String> = JsonMissing.of(),
            @JsonProperty("triggers")
            @ExcludeMissing
            private val triggers: JsonField<Triggers> = JsonMissing.of(),
            @JsonProperty("auth_method")
            @ExcludeMissing
            private val authMethod: JsonField<String> = JsonMissing.of(),
            @JsonProperty("method")
            @ExcludeMissing
            private val method: JsonField<String> = JsonMissing.of(),
            @JsonProperty("params")
            @ExcludeMissing
            private val params: JsonField<Params> = JsonMissing.of(),
            @JsonProperty("request_content_type")
            @ExcludeMissing
            private val requestContentType: JsonField<RequestContentType> = JsonMissing.of(),
            @JsonProperty("response_content_type")
            @ExcludeMissing
            private val responseContentType: JsonField<ResponseContentType> = JsonMissing.of(),
            @JsonProperty("response_map")
            @ExcludeMissing
            private val responseMap: JsonField<ResponseMap> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun endpoint(): String = endpoint.getRequired("endpoint")

            fun triggers(): Triggers = triggers.getRequired("triggers")

            fun authMethod(): Optional<String> =
                Optional.ofNullable(authMethod.getNullable("auth_method"))

            fun method(): Optional<String> = Optional.ofNullable(method.getNullable("method"))

            fun params(): Optional<Params> = Optional.ofNullable(params.getNullable("params"))

            fun requestContentType(): Optional<RequestContentType> =
                Optional.ofNullable(requestContentType.getNullable("request_content_type"))

            fun responseContentType(): Optional<ResponseContentType> =
                Optional.ofNullable(responseContentType.getNullable("response_content_type"))

            fun responseMap(): Optional<ResponseMap> =
                Optional.ofNullable(responseMap.getNullable("response_map"))

            @JsonProperty("endpoint") @ExcludeMissing fun _endpoint(): JsonField<String> = endpoint

            @JsonProperty("triggers")
            @ExcludeMissing
            fun _triggers(): JsonField<Triggers> = triggers

            @JsonProperty("auth_method")
            @ExcludeMissing
            fun _authMethod(): JsonField<String> = authMethod

            @JsonProperty("method") @ExcludeMissing fun _method(): JsonField<String> = method

            @JsonProperty("params") @ExcludeMissing fun _params(): JsonField<Params> = params

            @JsonProperty("request_content_type")
            @ExcludeMissing
            fun _requestContentType(): JsonField<RequestContentType> = requestContentType

            @JsonProperty("response_content_type")
            @ExcludeMissing
            fun _responseContentType(): JsonField<ResponseContentType> = responseContentType

            @JsonProperty("response_map")
            @ExcludeMissing
            fun _responseMap(): JsonField<ResponseMap> = responseMap

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): TokenIntrospectionRequest = apply {
                if (validated) {
                    return@apply
                }

                endpoint()
                triggers().validate()
                authMethod()
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

            /** A builder for [TokenIntrospectionRequest]. */
            class Builder internal constructor() {

                private var endpoint: JsonField<String>? = null
                private var triggers: JsonField<Triggers>? = null
                private var authMethod: JsonField<String> = JsonMissing.of()
                private var method: JsonField<String> = JsonMissing.of()
                private var params: JsonField<Params> = JsonMissing.of()
                private var requestContentType: JsonField<RequestContentType> = JsonMissing.of()
                private var responseContentType: JsonField<ResponseContentType> = JsonMissing.of()
                private var responseMap: JsonField<ResponseMap> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(tokenIntrospectionRequest: TokenIntrospectionRequest) = apply {
                    endpoint = tokenIntrospectionRequest.endpoint
                    triggers = tokenIntrospectionRequest.triggers
                    authMethod = tokenIntrospectionRequest.authMethod
                    method = tokenIntrospectionRequest.method
                    params = tokenIntrospectionRequest.params
                    requestContentType = tokenIntrospectionRequest.requestContentType
                    responseContentType = tokenIntrospectionRequest.responseContentType
                    responseMap = tokenIntrospectionRequest.responseMap
                    additionalProperties =
                        tokenIntrospectionRequest.additionalProperties.toMutableMap()
                }

                fun endpoint(endpoint: String) = endpoint(JsonField.of(endpoint))

                fun endpoint(endpoint: JsonField<String>) = apply { this.endpoint = endpoint }

                fun triggers(triggers: Triggers) = triggers(JsonField.of(triggers))

                fun triggers(triggers: JsonField<Triggers>) = apply { this.triggers = triggers }

                fun authMethod(authMethod: String) = authMethod(JsonField.of(authMethod))

                fun authMethod(authMethod: JsonField<String>) = apply {
                    this.authMethod = authMethod
                }

                fun method(method: String) = method(JsonField.of(method))

                fun method(method: JsonField<String>) = apply { this.method = method }

                fun params(params: Params) = params(JsonField.of(params))

                fun params(params: JsonField<Params>) = apply { this.params = params }

                fun requestContentType(requestContentType: RequestContentType) =
                    requestContentType(JsonField.of(requestContentType))

                fun requestContentType(requestContentType: JsonField<RequestContentType>) = apply {
                    this.requestContentType = requestContentType
                }

                fun responseContentType(responseContentType: ResponseContentType) =
                    responseContentType(JsonField.of(responseContentType))

                fun responseContentType(responseContentType: JsonField<ResponseContentType>) =
                    apply {
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

                fun build(): TokenIntrospectionRequest =
                    TokenIntrospectionRequest(
                        checkRequired("endpoint", endpoint),
                        checkRequired("triggers", triggers),
                        authMethod,
                        method,
                        params,
                        requestContentType,
                        responseContentType,
                        responseMap,
                        additionalProperties.toImmutable(),
                    )
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

            class RequestContentType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

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

                    @JvmField
                    val APPLICATION_X_WWW_FORM_URLENCODED = of("application/x-www-form-urlencoded")

                    @JvmField val APPLICATION_JSON = of("application/json")

                    @JvmStatic fun of(value: String) = RequestContentType(JsonField.of(value))
                }

                /** An enum containing [RequestContentType]'s known values. */
                enum class Known {
                    APPLICATION_X_WWW_FORM_URLENCODED,
                    APPLICATION_JSON,
                }

                /**
                 * An enum containing [RequestContentType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [RequestContentType] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    APPLICATION_X_WWW_FORM_URLENCODED,
                    APPLICATION_JSON,
                    /**
                     * An enum member indicating that [RequestContentType] was instantiated with an
                     * unknown value.
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
                        APPLICATION_X_WWW_FORM_URLENCODED -> Value.APPLICATION_X_WWW_FORM_URLENCODED
                        APPLICATION_JSON -> Value.APPLICATION_JSON
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
                        APPLICATION_X_WWW_FORM_URLENCODED -> Known.APPLICATION_X_WWW_FORM_URLENCODED
                        APPLICATION_JSON -> Known.APPLICATION_JSON
                        else ->
                            throw ArcadeInvalidDataException("Unknown RequestContentType: $value")
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

                    return /* spotless:off */ other is RequestContentType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class ResponseContentType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

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

                    @JvmField
                    val APPLICATION_X_WWW_FORM_URLENCODED = of("application/x-www-form-urlencoded")

                    @JvmField val APPLICATION_JSON = of("application/json")

                    @JvmStatic fun of(value: String) = ResponseContentType(JsonField.of(value))
                }

                /** An enum containing [ResponseContentType]'s known values. */
                enum class Known {
                    APPLICATION_X_WWW_FORM_URLENCODED,
                    APPLICATION_JSON,
                }

                /**
                 * An enum containing [ResponseContentType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [ResponseContentType] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    APPLICATION_X_WWW_FORM_URLENCODED,
                    APPLICATION_JSON,
                    /**
                     * An enum member indicating that [ResponseContentType] was instantiated with an
                     * unknown value.
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
                        APPLICATION_X_WWW_FORM_URLENCODED -> Value.APPLICATION_X_WWW_FORM_URLENCODED
                        APPLICATION_JSON -> Value.APPLICATION_JSON
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
                        APPLICATION_X_WWW_FORM_URLENCODED -> Known.APPLICATION_X_WWW_FORM_URLENCODED
                        APPLICATION_JSON -> Known.APPLICATION_JSON
                        else ->
                            throw ArcadeInvalidDataException("Unknown ResponseContentType: $value")
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

                    return /* spotless:off */ other is ResponseContentType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
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

                return /* spotless:off */ other is TokenIntrospectionRequest && endpoint == other.endpoint && triggers == other.triggers && authMethod == other.authMethod && method == other.method && params == other.params && requestContentType == other.requestContentType && responseContentType == other.responseContentType && responseMap == other.responseMap && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(endpoint, triggers, authMethod, method, params, requestContentType, responseContentType, responseMap, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "TokenIntrospectionRequest{endpoint=$endpoint, triggers=$triggers, authMethod=$authMethod, method=$method, params=$params, requestContentType=$requestContentType, responseContentType=$responseContentType, responseMap=$responseMap, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class TokenRequest
        @JsonCreator
        private constructor(
            @JsonProperty("endpoint")
            @ExcludeMissing
            private val endpoint: JsonField<String> = JsonMissing.of(),
            @JsonProperty("auth_method")
            @ExcludeMissing
            private val authMethod: JsonField<String> = JsonMissing.of(),
            @JsonProperty("method")
            @ExcludeMissing
            private val method: JsonField<String> = JsonMissing.of(),
            @JsonProperty("params")
            @ExcludeMissing
            private val params: JsonField<Params> = JsonMissing.of(),
            @JsonProperty("request_content_type")
            @ExcludeMissing
            private val requestContentType: JsonField<RequestContentType> = JsonMissing.of(),
            @JsonProperty("response_content_type")
            @ExcludeMissing
            private val responseContentType: JsonField<ResponseContentType> = JsonMissing.of(),
            @JsonProperty("response_map")
            @ExcludeMissing
            private val responseMap: JsonField<ResponseMap> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun endpoint(): String = endpoint.getRequired("endpoint")

            fun authMethod(): Optional<String> =
                Optional.ofNullable(authMethod.getNullable("auth_method"))

            fun method(): Optional<String> = Optional.ofNullable(method.getNullable("method"))

            fun params(): Optional<Params> = Optional.ofNullable(params.getNullable("params"))

            fun requestContentType(): Optional<RequestContentType> =
                Optional.ofNullable(requestContentType.getNullable("request_content_type"))

            fun responseContentType(): Optional<ResponseContentType> =
                Optional.ofNullable(responseContentType.getNullable("response_content_type"))

            fun responseMap(): Optional<ResponseMap> =
                Optional.ofNullable(responseMap.getNullable("response_map"))

            @JsonProperty("endpoint") @ExcludeMissing fun _endpoint(): JsonField<String> = endpoint

            @JsonProperty("auth_method")
            @ExcludeMissing
            fun _authMethod(): JsonField<String> = authMethod

            @JsonProperty("method") @ExcludeMissing fun _method(): JsonField<String> = method

            @JsonProperty("params") @ExcludeMissing fun _params(): JsonField<Params> = params

            @JsonProperty("request_content_type")
            @ExcludeMissing
            fun _requestContentType(): JsonField<RequestContentType> = requestContentType

            @JsonProperty("response_content_type")
            @ExcludeMissing
            fun _responseContentType(): JsonField<ResponseContentType> = responseContentType

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

                endpoint()
                authMethod()
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

                private var endpoint: JsonField<String>? = null
                private var authMethod: JsonField<String> = JsonMissing.of()
                private var method: JsonField<String> = JsonMissing.of()
                private var params: JsonField<Params> = JsonMissing.of()
                private var requestContentType: JsonField<RequestContentType> = JsonMissing.of()
                private var responseContentType: JsonField<ResponseContentType> = JsonMissing.of()
                private var responseMap: JsonField<ResponseMap> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(tokenRequest: TokenRequest) = apply {
                    endpoint = tokenRequest.endpoint
                    authMethod = tokenRequest.authMethod
                    method = tokenRequest.method
                    params = tokenRequest.params
                    requestContentType = tokenRequest.requestContentType
                    responseContentType = tokenRequest.responseContentType
                    responseMap = tokenRequest.responseMap
                    additionalProperties = tokenRequest.additionalProperties.toMutableMap()
                }

                fun endpoint(endpoint: String) = endpoint(JsonField.of(endpoint))

                fun endpoint(endpoint: JsonField<String>) = apply { this.endpoint = endpoint }

                fun authMethod(authMethod: String) = authMethod(JsonField.of(authMethod))

                fun authMethod(authMethod: JsonField<String>) = apply {
                    this.authMethod = authMethod
                }

                fun method(method: String) = method(JsonField.of(method))

                fun method(method: JsonField<String>) = apply { this.method = method }

                fun params(params: Params) = params(JsonField.of(params))

                fun params(params: JsonField<Params>) = apply { this.params = params }

                fun requestContentType(requestContentType: RequestContentType) =
                    requestContentType(JsonField.of(requestContentType))

                fun requestContentType(requestContentType: JsonField<RequestContentType>) = apply {
                    this.requestContentType = requestContentType
                }

                fun responseContentType(responseContentType: ResponseContentType) =
                    responseContentType(JsonField.of(responseContentType))

                fun responseContentType(responseContentType: JsonField<ResponseContentType>) =
                    apply {
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
                        checkRequired("endpoint", endpoint),
                        authMethod,
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

            class RequestContentType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

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

                    @JvmField
                    val APPLICATION_X_WWW_FORM_URLENCODED = of("application/x-www-form-urlencoded")

                    @JvmField val APPLICATION_JSON = of("application/json")

                    @JvmStatic fun of(value: String) = RequestContentType(JsonField.of(value))
                }

                /** An enum containing [RequestContentType]'s known values. */
                enum class Known {
                    APPLICATION_X_WWW_FORM_URLENCODED,
                    APPLICATION_JSON,
                }

                /**
                 * An enum containing [RequestContentType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [RequestContentType] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    APPLICATION_X_WWW_FORM_URLENCODED,
                    APPLICATION_JSON,
                    /**
                     * An enum member indicating that [RequestContentType] was instantiated with an
                     * unknown value.
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
                        APPLICATION_X_WWW_FORM_URLENCODED -> Value.APPLICATION_X_WWW_FORM_URLENCODED
                        APPLICATION_JSON -> Value.APPLICATION_JSON
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
                        APPLICATION_X_WWW_FORM_URLENCODED -> Known.APPLICATION_X_WWW_FORM_URLENCODED
                        APPLICATION_JSON -> Known.APPLICATION_JSON
                        else ->
                            throw ArcadeInvalidDataException("Unknown RequestContentType: $value")
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

                    return /* spotless:off */ other is RequestContentType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class ResponseContentType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

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

                    @JvmField
                    val APPLICATION_X_WWW_FORM_URLENCODED = of("application/x-www-form-urlencoded")

                    @JvmField val APPLICATION_JSON = of("application/json")

                    @JvmStatic fun of(value: String) = ResponseContentType(JsonField.of(value))
                }

                /** An enum containing [ResponseContentType]'s known values. */
                enum class Known {
                    APPLICATION_X_WWW_FORM_URLENCODED,
                    APPLICATION_JSON,
                }

                /**
                 * An enum containing [ResponseContentType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [ResponseContentType] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    APPLICATION_X_WWW_FORM_URLENCODED,
                    APPLICATION_JSON,
                    /**
                     * An enum member indicating that [ResponseContentType] was instantiated with an
                     * unknown value.
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
                        APPLICATION_X_WWW_FORM_URLENCODED -> Value.APPLICATION_X_WWW_FORM_URLENCODED
                        APPLICATION_JSON -> Value.APPLICATION_JSON
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
                        APPLICATION_X_WWW_FORM_URLENCODED -> Known.APPLICATION_X_WWW_FORM_URLENCODED
                        APPLICATION_JSON -> Known.APPLICATION_JSON
                        else ->
                            throw ArcadeInvalidDataException("Unknown ResponseContentType: $value")
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

                    return /* spotless:off */ other is ResponseContentType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
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

                return /* spotless:off */ other is TokenRequest && endpoint == other.endpoint && authMethod == other.authMethod && method == other.method && params == other.params && requestContentType == other.requestContentType && responseContentType == other.responseContentType && responseMap == other.responseMap && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(endpoint, authMethod, method, params, requestContentType, responseContentType, responseMap, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "TokenRequest{endpoint=$endpoint, authMethod=$authMethod, method=$method, params=$params, requestContentType=$requestContentType, responseContentType=$responseContentType, responseMap=$responseMap, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class UserInfoRequest
        @JsonCreator
        private constructor(
            @JsonProperty("endpoint")
            @ExcludeMissing
            private val endpoint: JsonField<String> = JsonMissing.of(),
            @JsonProperty("triggers")
            @ExcludeMissing
            private val triggers: JsonField<Triggers> = JsonMissing.of(),
            @JsonProperty("auth_method")
            @ExcludeMissing
            private val authMethod: JsonField<String> = JsonMissing.of(),
            @JsonProperty("method")
            @ExcludeMissing
            private val method: JsonField<String> = JsonMissing.of(),
            @JsonProperty("params")
            @ExcludeMissing
            private val params: JsonField<Params> = JsonMissing.of(),
            @JsonProperty("request_content_type")
            @ExcludeMissing
            private val requestContentType: JsonField<RequestContentType> = JsonMissing.of(),
            @JsonProperty("response_content_type")
            @ExcludeMissing
            private val responseContentType: JsonField<ResponseContentType> = JsonMissing.of(),
            @JsonProperty("response_map")
            @ExcludeMissing
            private val responseMap: JsonField<ResponseMap> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun endpoint(): String = endpoint.getRequired("endpoint")

            fun triggers(): Triggers = triggers.getRequired("triggers")

            fun authMethod(): Optional<String> =
                Optional.ofNullable(authMethod.getNullable("auth_method"))

            fun method(): Optional<String> = Optional.ofNullable(method.getNullable("method"))

            fun params(): Optional<Params> = Optional.ofNullable(params.getNullable("params"))

            fun requestContentType(): Optional<RequestContentType> =
                Optional.ofNullable(requestContentType.getNullable("request_content_type"))

            fun responseContentType(): Optional<ResponseContentType> =
                Optional.ofNullable(responseContentType.getNullable("response_content_type"))

            fun responseMap(): Optional<ResponseMap> =
                Optional.ofNullable(responseMap.getNullable("response_map"))

            @JsonProperty("endpoint") @ExcludeMissing fun _endpoint(): JsonField<String> = endpoint

            @JsonProperty("triggers")
            @ExcludeMissing
            fun _triggers(): JsonField<Triggers> = triggers

            @JsonProperty("auth_method")
            @ExcludeMissing
            fun _authMethod(): JsonField<String> = authMethod

            @JsonProperty("method") @ExcludeMissing fun _method(): JsonField<String> = method

            @JsonProperty("params") @ExcludeMissing fun _params(): JsonField<Params> = params

            @JsonProperty("request_content_type")
            @ExcludeMissing
            fun _requestContentType(): JsonField<RequestContentType> = requestContentType

            @JsonProperty("response_content_type")
            @ExcludeMissing
            fun _responseContentType(): JsonField<ResponseContentType> = responseContentType

            @JsonProperty("response_map")
            @ExcludeMissing
            fun _responseMap(): JsonField<ResponseMap> = responseMap

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): UserInfoRequest = apply {
                if (validated) {
                    return@apply
                }

                endpoint()
                triggers().validate()
                authMethod()
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

            /** A builder for [UserInfoRequest]. */
            class Builder internal constructor() {

                private var endpoint: JsonField<String>? = null
                private var triggers: JsonField<Triggers>? = null
                private var authMethod: JsonField<String> = JsonMissing.of()
                private var method: JsonField<String> = JsonMissing.of()
                private var params: JsonField<Params> = JsonMissing.of()
                private var requestContentType: JsonField<RequestContentType> = JsonMissing.of()
                private var responseContentType: JsonField<ResponseContentType> = JsonMissing.of()
                private var responseMap: JsonField<ResponseMap> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(userInfoRequest: UserInfoRequest) = apply {
                    endpoint = userInfoRequest.endpoint
                    triggers = userInfoRequest.triggers
                    authMethod = userInfoRequest.authMethod
                    method = userInfoRequest.method
                    params = userInfoRequest.params
                    requestContentType = userInfoRequest.requestContentType
                    responseContentType = userInfoRequest.responseContentType
                    responseMap = userInfoRequest.responseMap
                    additionalProperties = userInfoRequest.additionalProperties.toMutableMap()
                }

                fun endpoint(endpoint: String) = endpoint(JsonField.of(endpoint))

                fun endpoint(endpoint: JsonField<String>) = apply { this.endpoint = endpoint }

                fun triggers(triggers: Triggers) = triggers(JsonField.of(triggers))

                fun triggers(triggers: JsonField<Triggers>) = apply { this.triggers = triggers }

                fun authMethod(authMethod: String) = authMethod(JsonField.of(authMethod))

                fun authMethod(authMethod: JsonField<String>) = apply {
                    this.authMethod = authMethod
                }

                fun method(method: String) = method(JsonField.of(method))

                fun method(method: JsonField<String>) = apply { this.method = method }

                fun params(params: Params) = params(JsonField.of(params))

                fun params(params: JsonField<Params>) = apply { this.params = params }

                fun requestContentType(requestContentType: RequestContentType) =
                    requestContentType(JsonField.of(requestContentType))

                fun requestContentType(requestContentType: JsonField<RequestContentType>) = apply {
                    this.requestContentType = requestContentType
                }

                fun responseContentType(responseContentType: ResponseContentType) =
                    responseContentType(JsonField.of(responseContentType))

                fun responseContentType(responseContentType: JsonField<ResponseContentType>) =
                    apply {
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

                fun build(): UserInfoRequest =
                    UserInfoRequest(
                        checkRequired("endpoint", endpoint),
                        checkRequired("triggers", triggers),
                        authMethod,
                        method,
                        params,
                        requestContentType,
                        responseContentType,
                        responseMap,
                        additionalProperties.toImmutable(),
                    )
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

            class RequestContentType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

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

                    @JvmField
                    val APPLICATION_X_WWW_FORM_URLENCODED = of("application/x-www-form-urlencoded")

                    @JvmField val APPLICATION_JSON = of("application/json")

                    @JvmStatic fun of(value: String) = RequestContentType(JsonField.of(value))
                }

                /** An enum containing [RequestContentType]'s known values. */
                enum class Known {
                    APPLICATION_X_WWW_FORM_URLENCODED,
                    APPLICATION_JSON,
                }

                /**
                 * An enum containing [RequestContentType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [RequestContentType] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    APPLICATION_X_WWW_FORM_URLENCODED,
                    APPLICATION_JSON,
                    /**
                     * An enum member indicating that [RequestContentType] was instantiated with an
                     * unknown value.
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
                        APPLICATION_X_WWW_FORM_URLENCODED -> Value.APPLICATION_X_WWW_FORM_URLENCODED
                        APPLICATION_JSON -> Value.APPLICATION_JSON
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
                        APPLICATION_X_WWW_FORM_URLENCODED -> Known.APPLICATION_X_WWW_FORM_URLENCODED
                        APPLICATION_JSON -> Known.APPLICATION_JSON
                        else ->
                            throw ArcadeInvalidDataException("Unknown RequestContentType: $value")
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

                    return /* spotless:off */ other is RequestContentType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class ResponseContentType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

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

                    @JvmField
                    val APPLICATION_X_WWW_FORM_URLENCODED = of("application/x-www-form-urlencoded")

                    @JvmField val APPLICATION_JSON = of("application/json")

                    @JvmStatic fun of(value: String) = ResponseContentType(JsonField.of(value))
                }

                /** An enum containing [ResponseContentType]'s known values. */
                enum class Known {
                    APPLICATION_X_WWW_FORM_URLENCODED,
                    APPLICATION_JSON,
                }

                /**
                 * An enum containing [ResponseContentType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [ResponseContentType] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    APPLICATION_X_WWW_FORM_URLENCODED,
                    APPLICATION_JSON,
                    /**
                     * An enum member indicating that [ResponseContentType] was instantiated with an
                     * unknown value.
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
                        APPLICATION_X_WWW_FORM_URLENCODED -> Value.APPLICATION_X_WWW_FORM_URLENCODED
                        APPLICATION_JSON -> Value.APPLICATION_JSON
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
                        APPLICATION_X_WWW_FORM_URLENCODED -> Known.APPLICATION_X_WWW_FORM_URLENCODED
                        APPLICATION_JSON -> Known.APPLICATION_JSON
                        else ->
                            throw ArcadeInvalidDataException("Unknown ResponseContentType: $value")
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

                    return /* spotless:off */ other is ResponseContentType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
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

                return /* spotless:off */ other is UserInfoRequest && endpoint == other.endpoint && triggers == other.triggers && authMethod == other.authMethod && method == other.method && params == other.params && requestContentType == other.requestContentType && responseContentType == other.responseContentType && responseMap == other.responseMap && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(endpoint, triggers, authMethod, method, params, requestContentType, responseContentType, responseMap, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UserInfoRequest{endpoint=$endpoint, triggers=$triggers, authMethod=$authMethod, method=$method, params=$params, requestContentType=$requestContentType, responseContentType=$responseContentType, responseMap=$responseMap, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Oauth2 && clientId == other.clientId && authorizeRequest == other.authorizeRequest && clientSecret == other.clientSecret && pkce == other.pkce && refreshRequest == other.refreshRequest && scopeDelimiter == other.scopeDelimiter && tokenIntrospectionRequest == other.tokenIntrospectionRequest && tokenRequest == other.tokenRequest && userInfoRequest == other.userInfoRequest && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(clientId, authorizeRequest, clientSecret, pkce, refreshRequest, scopeDelimiter, tokenIntrospectionRequest, tokenRequest, userInfoRequest, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Oauth2{clientId=$clientId, authorizeRequest=$authorizeRequest, clientSecret=$clientSecret, pkce=$pkce, refreshRequest=$refreshRequest, scopeDelimiter=$scopeDelimiter, tokenIntrospectionRequest=$tokenIntrospectionRequest, tokenRequest=$tokenRequest, userInfoRequest=$userInfoRequest, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AuthProviderCreateRequest && id == other.id && description == other.description && externalId == other.externalId && oauth2 == other.oauth2 && providerId == other.providerId && status == other.status && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, description, externalId, oauth2, providerId, status, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AuthProviderCreateRequest{id=$id, description=$description, externalId=$externalId, oauth2=$oauth2, providerId=$providerId, status=$status, type=$type, additionalProperties=$additionalProperties}"
}
