// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models.admin.authproviders

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.arcade.core.Enum
import dev.arcade.core.ExcludeMissing
import dev.arcade.core.JsonField
import dev.arcade.core.JsonMissing
import dev.arcade.core.JsonValue
import dev.arcade.core.toImmutable
import dev.arcade.errors.ArcadeInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class AuthProviderUpdateRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val description: JsonField<String>,
    private val oauth2: JsonField<Oauth2>,
    private val providerId: JsonField<String>,
    private val status: JsonField<String>,
    private val type: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("oauth2") @ExcludeMissing oauth2: JsonField<Oauth2> = JsonMissing.of(),
        @JsonProperty("provider_id")
        @ExcludeMissing
        providerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
    ) : this(id, description, oauth2, providerId, status, type, mutableMapOf())

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun oauth2(): Optional<Oauth2> = oauth2.getOptional("oauth2")

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun providerId(): Optional<String> = providerId.getOptional("provider_id")

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<String> = status.getOptional("status")

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun type(): Optional<String> = type.getOptional("type")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [oauth2].
     *
     * Unlike [oauth2], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("oauth2") @ExcludeMissing fun _oauth2(): JsonField<Oauth2> = oauth2

    /**
     * Returns the raw JSON value of [providerId].
     *
     * Unlike [providerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("provider_id") @ExcludeMissing fun _providerId(): JsonField<String> = providerId

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AuthProviderUpdateRequest].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AuthProviderUpdateRequest]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var oauth2: JsonField<Oauth2> = JsonMissing.of()
        private var providerId: JsonField<String> = JsonMissing.of()
        private var status: JsonField<String> = JsonMissing.of()
        private var type: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(authProviderUpdateRequest: AuthProviderUpdateRequest) = apply {
            id = authProviderUpdateRequest.id
            description = authProviderUpdateRequest.description
            oauth2 = authProviderUpdateRequest.oauth2
            providerId = authProviderUpdateRequest.providerId
            status = authProviderUpdateRequest.status
            type = authProviderUpdateRequest.type
            additionalProperties = authProviderUpdateRequest.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        fun oauth2(oauth2: Oauth2) = oauth2(JsonField.of(oauth2))

        /**
         * Sets [Builder.oauth2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.oauth2] with a well-typed [Oauth2] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun oauth2(oauth2: JsonField<Oauth2>) = apply { this.oauth2 = oauth2 }

        fun providerId(providerId: String) = providerId(JsonField.of(providerId))

        /**
         * Sets [Builder.providerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.providerId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun providerId(providerId: JsonField<String>) = apply { this.providerId = providerId }

        fun status(status: String) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<String>) = apply { this.status = status }

        fun type(type: String) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
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

        /**
         * Returns an immutable instance of [AuthProviderUpdateRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AuthProviderUpdateRequest =
            AuthProviderUpdateRequest(
                id,
                description,
                oauth2,
                providerId,
                status,
                type,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws ArcadeInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): AuthProviderUpdateRequest = apply {
        if (validated) {
            return@apply
        }

        id()
        description()
        oauth2().ifPresent { it.validate() }
        providerId()
        status()
        type()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: ArcadeInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (oauth2.asKnown().getOrNull()?.validity() ?: 0) +
            (if (providerId.asKnown().isPresent) 1 else 0) +
            (if (status.asKnown().isPresent) 1 else 0) +
            (if (type.asKnown().isPresent) 1 else 0)

    class Oauth2
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val authorizeRequest: JsonField<AuthorizeRequest>,
        private val clientId: JsonField<String>,
        private val clientSecret: JsonField<String>,
        private val pkce: JsonField<Pkce>,
        private val refreshRequest: JsonField<RefreshRequest>,
        private val scopeDelimiter: JsonField<ScopeDelimiter>,
        private val tokenIntrospectionRequest: JsonField<TokenIntrospectionRequest>,
        private val tokenRequest: JsonField<TokenRequest>,
        private val userInfoRequest: JsonField<UserInfoRequest>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("authorize_request")
            @ExcludeMissing
            authorizeRequest: JsonField<AuthorizeRequest> = JsonMissing.of(),
            @JsonProperty("client_id")
            @ExcludeMissing
            clientId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("client_secret")
            @ExcludeMissing
            clientSecret: JsonField<String> = JsonMissing.of(),
            @JsonProperty("pkce") @ExcludeMissing pkce: JsonField<Pkce> = JsonMissing.of(),
            @JsonProperty("refresh_request")
            @ExcludeMissing
            refreshRequest: JsonField<RefreshRequest> = JsonMissing.of(),
            @JsonProperty("scope_delimiter")
            @ExcludeMissing
            scopeDelimiter: JsonField<ScopeDelimiter> = JsonMissing.of(),
            @JsonProperty("token_introspection_request")
            @ExcludeMissing
            tokenIntrospectionRequest: JsonField<TokenIntrospectionRequest> = JsonMissing.of(),
            @JsonProperty("token_request")
            @ExcludeMissing
            tokenRequest: JsonField<TokenRequest> = JsonMissing.of(),
            @JsonProperty("user_info_request")
            @ExcludeMissing
            userInfoRequest: JsonField<UserInfoRequest> = JsonMissing.of(),
        ) : this(
            authorizeRequest,
            clientId,
            clientSecret,
            pkce,
            refreshRequest,
            scopeDelimiter,
            tokenIntrospectionRequest,
            tokenRequest,
            userInfoRequest,
            mutableMapOf(),
        )

        /**
         * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun authorizeRequest(): Optional<AuthorizeRequest> =
            authorizeRequest.getOptional("authorize_request")

        /**
         * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun clientId(): Optional<String> = clientId.getOptional("client_id")

        /**
         * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun clientSecret(): Optional<String> = clientSecret.getOptional("client_secret")

        /**
         * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun pkce(): Optional<Pkce> = pkce.getOptional("pkce")

        /**
         * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun refreshRequest(): Optional<RefreshRequest> =
            refreshRequest.getOptional("refresh_request")

        /**
         * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun scopeDelimiter(): Optional<ScopeDelimiter> =
            scopeDelimiter.getOptional("scope_delimiter")

        /**
         * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tokenIntrospectionRequest(): Optional<TokenIntrospectionRequest> =
            tokenIntrospectionRequest.getOptional("token_introspection_request")

        /**
         * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tokenRequest(): Optional<TokenRequest> = tokenRequest.getOptional("token_request")

        /**
         * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun userInfoRequest(): Optional<UserInfoRequest> =
            userInfoRequest.getOptional("user_info_request")

        /**
         * Returns the raw JSON value of [authorizeRequest].
         *
         * Unlike [authorizeRequest], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("authorize_request")
        @ExcludeMissing
        fun _authorizeRequest(): JsonField<AuthorizeRequest> = authorizeRequest

        /**
         * Returns the raw JSON value of [clientId].
         *
         * Unlike [clientId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("client_id") @ExcludeMissing fun _clientId(): JsonField<String> = clientId

        /**
         * Returns the raw JSON value of [clientSecret].
         *
         * Unlike [clientSecret], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("client_secret")
        @ExcludeMissing
        fun _clientSecret(): JsonField<String> = clientSecret

        /**
         * Returns the raw JSON value of [pkce].
         *
         * Unlike [pkce], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pkce") @ExcludeMissing fun _pkce(): JsonField<Pkce> = pkce

        /**
         * Returns the raw JSON value of [refreshRequest].
         *
         * Unlike [refreshRequest], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("refresh_request")
        @ExcludeMissing
        fun _refreshRequest(): JsonField<RefreshRequest> = refreshRequest

        /**
         * Returns the raw JSON value of [scopeDelimiter].
         *
         * Unlike [scopeDelimiter], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("scope_delimiter")
        @ExcludeMissing
        fun _scopeDelimiter(): JsonField<ScopeDelimiter> = scopeDelimiter

        /**
         * Returns the raw JSON value of [tokenIntrospectionRequest].
         *
         * Unlike [tokenIntrospectionRequest], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("token_introspection_request")
        @ExcludeMissing
        fun _tokenIntrospectionRequest(): JsonField<TokenIntrospectionRequest> =
            tokenIntrospectionRequest

        /**
         * Returns the raw JSON value of [tokenRequest].
         *
         * Unlike [tokenRequest], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("token_request")
        @ExcludeMissing
        fun _tokenRequest(): JsonField<TokenRequest> = tokenRequest

        /**
         * Returns the raw JSON value of [userInfoRequest].
         *
         * Unlike [userInfoRequest], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("user_info_request")
        @ExcludeMissing
        fun _userInfoRequest(): JsonField<UserInfoRequest> = userInfoRequest

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Oauth2]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Oauth2]. */
        class Builder internal constructor() {

            private var authorizeRequest: JsonField<AuthorizeRequest> = JsonMissing.of()
            private var clientId: JsonField<String> = JsonMissing.of()
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
                authorizeRequest = oauth2.authorizeRequest
                clientId = oauth2.clientId
                clientSecret = oauth2.clientSecret
                pkce = oauth2.pkce
                refreshRequest = oauth2.refreshRequest
                scopeDelimiter = oauth2.scopeDelimiter
                tokenIntrospectionRequest = oauth2.tokenIntrospectionRequest
                tokenRequest = oauth2.tokenRequest
                userInfoRequest = oauth2.userInfoRequest
                additionalProperties = oauth2.additionalProperties.toMutableMap()
            }

            fun authorizeRequest(authorizeRequest: AuthorizeRequest) =
                authorizeRequest(JsonField.of(authorizeRequest))

            /**
             * Sets [Builder.authorizeRequest] to an arbitrary JSON value.
             *
             * You should usually call [Builder.authorizeRequest] with a well-typed
             * [AuthorizeRequest] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun authorizeRequest(authorizeRequest: JsonField<AuthorizeRequest>) = apply {
                this.authorizeRequest = authorizeRequest
            }

            fun clientId(clientId: String) = clientId(JsonField.of(clientId))

            /**
             * Sets [Builder.clientId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.clientId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun clientId(clientId: JsonField<String>) = apply { this.clientId = clientId }

            fun clientSecret(clientSecret: String) = clientSecret(JsonField.of(clientSecret))

            /**
             * Sets [Builder.clientSecret] to an arbitrary JSON value.
             *
             * You should usually call [Builder.clientSecret] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun clientSecret(clientSecret: JsonField<String>) = apply {
                this.clientSecret = clientSecret
            }

            fun pkce(pkce: Pkce) = pkce(JsonField.of(pkce))

            /**
             * Sets [Builder.pkce] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pkce] with a well-typed [Pkce] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun pkce(pkce: JsonField<Pkce>) = apply { this.pkce = pkce }

            fun refreshRequest(refreshRequest: RefreshRequest) =
                refreshRequest(JsonField.of(refreshRequest))

            /**
             * Sets [Builder.refreshRequest] to an arbitrary JSON value.
             *
             * You should usually call [Builder.refreshRequest] with a well-typed [RefreshRequest]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun refreshRequest(refreshRequest: JsonField<RefreshRequest>) = apply {
                this.refreshRequest = refreshRequest
            }

            fun scopeDelimiter(scopeDelimiter: ScopeDelimiter) =
                scopeDelimiter(JsonField.of(scopeDelimiter))

            /**
             * Sets [Builder.scopeDelimiter] to an arbitrary JSON value.
             *
             * You should usually call [Builder.scopeDelimiter] with a well-typed [ScopeDelimiter]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun scopeDelimiter(scopeDelimiter: JsonField<ScopeDelimiter>) = apply {
                this.scopeDelimiter = scopeDelimiter
            }

            fun tokenIntrospectionRequest(tokenIntrospectionRequest: TokenIntrospectionRequest) =
                tokenIntrospectionRequest(JsonField.of(tokenIntrospectionRequest))

            /**
             * Sets [Builder.tokenIntrospectionRequest] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tokenIntrospectionRequest] with a well-typed
             * [TokenIntrospectionRequest] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun tokenIntrospectionRequest(
                tokenIntrospectionRequest: JsonField<TokenIntrospectionRequest>
            ) = apply { this.tokenIntrospectionRequest = tokenIntrospectionRequest }

            fun tokenRequest(tokenRequest: TokenRequest) = tokenRequest(JsonField.of(tokenRequest))

            /**
             * Sets [Builder.tokenRequest] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tokenRequest] with a well-typed [TokenRequest] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tokenRequest(tokenRequest: JsonField<TokenRequest>) = apply {
                this.tokenRequest = tokenRequest
            }

            fun userInfoRequest(userInfoRequest: UserInfoRequest) =
                userInfoRequest(JsonField.of(userInfoRequest))

            /**
             * Sets [Builder.userInfoRequest] to an arbitrary JSON value.
             *
             * You should usually call [Builder.userInfoRequest] with a well-typed [UserInfoRequest]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
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

            /**
             * Returns an immutable instance of [Oauth2].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Oauth2 =
                Oauth2(
                    authorizeRequest,
                    clientId,
                    clientSecret,
                    pkce,
                    refreshRequest,
                    scopeDelimiter,
                    tokenIntrospectionRequest,
                    tokenRequest,
                    userInfoRequest,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws ArcadeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Oauth2 = apply {
            if (validated) {
                return@apply
            }

            authorizeRequest().ifPresent { it.validate() }
            clientId()
            clientSecret()
            pkce().ifPresent { it.validate() }
            refreshRequest().ifPresent { it.validate() }
            scopeDelimiter().ifPresent { it.validate() }
            tokenIntrospectionRequest().ifPresent { it.validate() }
            tokenRequest().ifPresent { it.validate() }
            userInfoRequest().ifPresent { it.validate() }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: ArcadeInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (authorizeRequest.asKnown().getOrNull()?.validity() ?: 0) +
                (if (clientId.asKnown().isPresent) 1 else 0) +
                (if (clientSecret.asKnown().isPresent) 1 else 0) +
                (pkce.asKnown().getOrNull()?.validity() ?: 0) +
                (refreshRequest.asKnown().getOrNull()?.validity() ?: 0) +
                (scopeDelimiter.asKnown().getOrNull()?.validity() ?: 0) +
                (tokenIntrospectionRequest.asKnown().getOrNull()?.validity() ?: 0) +
                (tokenRequest.asKnown().getOrNull()?.validity() ?: 0) +
                (userInfoRequest.asKnown().getOrNull()?.validity() ?: 0)

        class AuthorizeRequest
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val authHeaderValueFormat: JsonField<String>,
            private val authMethod: JsonField<String>,
            private val endpoint: JsonField<String>,
            private val method: JsonField<String>,
            private val params: JsonField<Params>,
            private val requestContentType: JsonField<RequestContentType>,
            private val responseContentType: JsonField<ResponseContentType>,
            private val responseMap: JsonField<ResponseMap>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("auth_header_value_format")
                @ExcludeMissing
                authHeaderValueFormat: JsonField<String> = JsonMissing.of(),
                @JsonProperty("auth_method")
                @ExcludeMissing
                authMethod: JsonField<String> = JsonMissing.of(),
                @JsonProperty("endpoint")
                @ExcludeMissing
                endpoint: JsonField<String> = JsonMissing.of(),
                @JsonProperty("method")
                @ExcludeMissing
                method: JsonField<String> = JsonMissing.of(),
                @JsonProperty("params")
                @ExcludeMissing
                params: JsonField<Params> = JsonMissing.of(),
                @JsonProperty("request_content_type")
                @ExcludeMissing
                requestContentType: JsonField<RequestContentType> = JsonMissing.of(),
                @JsonProperty("response_content_type")
                @ExcludeMissing
                responseContentType: JsonField<ResponseContentType> = JsonMissing.of(),
                @JsonProperty("response_map")
                @ExcludeMissing
                responseMap: JsonField<ResponseMap> = JsonMissing.of(),
            ) : this(
                authHeaderValueFormat,
                authMethod,
                endpoint,
                method,
                params,
                requestContentType,
                responseContentType,
                responseMap,
                mutableMapOf(),
            )

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun authHeaderValueFormat(): Optional<String> =
                authHeaderValueFormat.getOptional("auth_header_value_format")

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun authMethod(): Optional<String> = authMethod.getOptional("auth_method")

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun endpoint(): Optional<String> = endpoint.getOptional("endpoint")

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun method(): Optional<String> = method.getOptional("method")

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun params(): Optional<Params> = params.getOptional("params")

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun requestContentType(): Optional<RequestContentType> =
                requestContentType.getOptional("request_content_type")

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun responseContentType(): Optional<ResponseContentType> =
                responseContentType.getOptional("response_content_type")

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun responseMap(): Optional<ResponseMap> = responseMap.getOptional("response_map")

            /**
             * Returns the raw JSON value of [authHeaderValueFormat].
             *
             * Unlike [authHeaderValueFormat], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("auth_header_value_format")
            @ExcludeMissing
            fun _authHeaderValueFormat(): JsonField<String> = authHeaderValueFormat

            /**
             * Returns the raw JSON value of [authMethod].
             *
             * Unlike [authMethod], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("auth_method")
            @ExcludeMissing
            fun _authMethod(): JsonField<String> = authMethod

            /**
             * Returns the raw JSON value of [endpoint].
             *
             * Unlike [endpoint], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("endpoint") @ExcludeMissing fun _endpoint(): JsonField<String> = endpoint

            /**
             * Returns the raw JSON value of [method].
             *
             * Unlike [method], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("method") @ExcludeMissing fun _method(): JsonField<String> = method

            /**
             * Returns the raw JSON value of [params].
             *
             * Unlike [params], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("params") @ExcludeMissing fun _params(): JsonField<Params> = params

            /**
             * Returns the raw JSON value of [requestContentType].
             *
             * Unlike [requestContentType], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("request_content_type")
            @ExcludeMissing
            fun _requestContentType(): JsonField<RequestContentType> = requestContentType

            /**
             * Returns the raw JSON value of [responseContentType].
             *
             * Unlike [responseContentType], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("response_content_type")
            @ExcludeMissing
            fun _responseContentType(): JsonField<ResponseContentType> = responseContentType

            /**
             * Returns the raw JSON value of [responseMap].
             *
             * Unlike [responseMap], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("response_map")
            @ExcludeMissing
            fun _responseMap(): JsonField<ResponseMap> = responseMap

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [AuthorizeRequest]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [AuthorizeRequest]. */
            class Builder internal constructor() {

                private var authHeaderValueFormat: JsonField<String> = JsonMissing.of()
                private var authMethod: JsonField<String> = JsonMissing.of()
                private var endpoint: JsonField<String> = JsonMissing.of()
                private var method: JsonField<String> = JsonMissing.of()
                private var params: JsonField<Params> = JsonMissing.of()
                private var requestContentType: JsonField<RequestContentType> = JsonMissing.of()
                private var responseContentType: JsonField<ResponseContentType> = JsonMissing.of()
                private var responseMap: JsonField<ResponseMap> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(authorizeRequest: AuthorizeRequest) = apply {
                    authHeaderValueFormat = authorizeRequest.authHeaderValueFormat
                    authMethod = authorizeRequest.authMethod
                    endpoint = authorizeRequest.endpoint
                    method = authorizeRequest.method
                    params = authorizeRequest.params
                    requestContentType = authorizeRequest.requestContentType
                    responseContentType = authorizeRequest.responseContentType
                    responseMap = authorizeRequest.responseMap
                    additionalProperties = authorizeRequest.additionalProperties.toMutableMap()
                }

                fun authHeaderValueFormat(authHeaderValueFormat: String) =
                    authHeaderValueFormat(JsonField.of(authHeaderValueFormat))

                /**
                 * Sets [Builder.authHeaderValueFormat] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.authHeaderValueFormat] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun authHeaderValueFormat(authHeaderValueFormat: JsonField<String>) = apply {
                    this.authHeaderValueFormat = authHeaderValueFormat
                }

                fun authMethod(authMethod: String) = authMethod(JsonField.of(authMethod))

                /**
                 * Sets [Builder.authMethod] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.authMethod] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun authMethod(authMethod: JsonField<String>) = apply {
                    this.authMethod = authMethod
                }

                fun endpoint(endpoint: String) = endpoint(JsonField.of(endpoint))

                /**
                 * Sets [Builder.endpoint] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.endpoint] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun endpoint(endpoint: JsonField<String>) = apply { this.endpoint = endpoint }

                fun method(method: String) = method(JsonField.of(method))

                /**
                 * Sets [Builder.method] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.method] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun method(method: JsonField<String>) = apply { this.method = method }

                fun params(params: Params) = params(JsonField.of(params))

                /**
                 * Sets [Builder.params] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.params] with a well-typed [Params] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun params(params: JsonField<Params>) = apply { this.params = params }

                fun requestContentType(requestContentType: RequestContentType) =
                    requestContentType(JsonField.of(requestContentType))

                /**
                 * Sets [Builder.requestContentType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.requestContentType] with a well-typed
                 * [RequestContentType] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun requestContentType(requestContentType: JsonField<RequestContentType>) = apply {
                    this.requestContentType = requestContentType
                }

                fun responseContentType(responseContentType: ResponseContentType) =
                    responseContentType(JsonField.of(responseContentType))

                /**
                 * Sets [Builder.responseContentType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.responseContentType] with a well-typed
                 * [ResponseContentType] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun responseContentType(responseContentType: JsonField<ResponseContentType>) =
                    apply {
                        this.responseContentType = responseContentType
                    }

                fun responseMap(responseMap: ResponseMap) = responseMap(JsonField.of(responseMap))

                /**
                 * Sets [Builder.responseMap] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.responseMap] with a well-typed [ResponseMap]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
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

                /**
                 * Returns an immutable instance of [AuthorizeRequest].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): AuthorizeRequest =
                    AuthorizeRequest(
                        authHeaderValueFormat,
                        authMethod,
                        endpoint,
                        method,
                        params,
                        requestContentType,
                        responseContentType,
                        responseMap,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws ArcadeInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): AuthorizeRequest = apply {
                if (validated) {
                    return@apply
                }

                authHeaderValueFormat()
                authMethod()
                endpoint()
                method()
                params().ifPresent { it.validate() }
                requestContentType().ifPresent { it.validate() }
                responseContentType().ifPresent { it.validate() }
                responseMap().ifPresent { it.validate() }
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: ArcadeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (authHeaderValueFormat.asKnown().isPresent) 1 else 0) +
                    (if (authMethod.asKnown().isPresent) 1 else 0) +
                    (if (endpoint.asKnown().isPresent) 1 else 0) +
                    (if (method.asKnown().isPresent) 1 else 0) +
                    (params.asKnown().getOrNull()?.validity() ?: 0) +
                    (requestContentType.asKnown().getOrNull()?.validity() ?: 0) +
                    (responseContentType.asKnown().getOrNull()?.validity() ?: 0) +
                    (responseMap.asKnown().getOrNull()?.validity() ?: 0)

            class Params
            @JsonCreator
            private constructor(
                @com.fasterxml.jackson.annotation.JsonValue
                private val additionalProperties: Map<String, JsonValue>
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [Params]. */
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

                    /**
                     * Returns an immutable instance of [Params].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Params = Params(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws ArcadeInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): Params = apply {
                    if (validated) {
                        return@apply
                    }

                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: ArcadeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Params && additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

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

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws ArcadeInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): RequestContentType = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: ArcadeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is RequestContentType && value == other.value
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

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws ArcadeInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): ResponseContentType = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: ArcadeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ResponseContentType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class ResponseMap
            @JsonCreator
            private constructor(
                @com.fasterxml.jackson.annotation.JsonValue
                private val additionalProperties: Map<String, JsonValue>
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [ResponseMap]. */
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

                    /**
                     * Returns an immutable instance of [ResponseMap].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): ResponseMap = ResponseMap(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws ArcadeInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): ResponseMap = apply {
                    if (validated) {
                        return@apply
                    }

                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: ArcadeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ResponseMap &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "ResponseMap{additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is AuthorizeRequest &&
                    authHeaderValueFormat == other.authHeaderValueFormat &&
                    authMethod == other.authMethod &&
                    endpoint == other.endpoint &&
                    method == other.method &&
                    params == other.params &&
                    requestContentType == other.requestContentType &&
                    responseContentType == other.responseContentType &&
                    responseMap == other.responseMap &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    authHeaderValueFormat,
                    authMethod,
                    endpoint,
                    method,
                    params,
                    requestContentType,
                    responseContentType,
                    responseMap,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AuthorizeRequest{authHeaderValueFormat=$authHeaderValueFormat, authMethod=$authMethod, endpoint=$endpoint, method=$method, params=$params, requestContentType=$requestContentType, responseContentType=$responseContentType, responseMap=$responseMap, additionalProperties=$additionalProperties}"
        }

        class Pkce
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val codeChallengeMethod: JsonField<String>,
            private val enabled: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("code_challenge_method")
                @ExcludeMissing
                codeChallengeMethod: JsonField<String> = JsonMissing.of(),
                @JsonProperty("enabled")
                @ExcludeMissing
                enabled: JsonField<Boolean> = JsonMissing.of(),
            ) : this(codeChallengeMethod, enabled, mutableMapOf())

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun codeChallengeMethod(): Optional<String> =
                codeChallengeMethod.getOptional("code_challenge_method")

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun enabled(): Optional<Boolean> = enabled.getOptional("enabled")

            /**
             * Returns the raw JSON value of [codeChallengeMethod].
             *
             * Unlike [codeChallengeMethod], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("code_challenge_method")
            @ExcludeMissing
            fun _codeChallengeMethod(): JsonField<String> = codeChallengeMethod

            /**
             * Returns the raw JSON value of [enabled].
             *
             * Unlike [enabled], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("enabled") @ExcludeMissing fun _enabled(): JsonField<Boolean> = enabled

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Pkce]. */
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

                /**
                 * Sets [Builder.codeChallengeMethod] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.codeChallengeMethod] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun codeChallengeMethod(codeChallengeMethod: JsonField<String>) = apply {
                    this.codeChallengeMethod = codeChallengeMethod
                }

                fun enabled(enabled: Boolean) = enabled(JsonField.of(enabled))

                /**
                 * Sets [Builder.enabled] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.enabled] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
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

                /**
                 * Returns an immutable instance of [Pkce].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Pkce =
                    Pkce(codeChallengeMethod, enabled, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws ArcadeInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Pkce = apply {
                if (validated) {
                    return@apply
                }

                codeChallengeMethod()
                enabled()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: ArcadeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (codeChallengeMethod.asKnown().isPresent) 1 else 0) +
                    (if (enabled.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Pkce &&
                    codeChallengeMethod == other.codeChallengeMethod &&
                    enabled == other.enabled &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(codeChallengeMethod, enabled, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Pkce{codeChallengeMethod=$codeChallengeMethod, enabled=$enabled, additionalProperties=$additionalProperties}"
        }

        class RefreshRequest
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val authHeaderValueFormat: JsonField<String>,
            private val authMethod: JsonField<String>,
            private val endpoint: JsonField<String>,
            private val method: JsonField<String>,
            private val params: JsonField<Params>,
            private val requestContentType: JsonField<RequestContentType>,
            private val responseContentType: JsonField<ResponseContentType>,
            private val responseMap: JsonField<ResponseMap>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("auth_header_value_format")
                @ExcludeMissing
                authHeaderValueFormat: JsonField<String> = JsonMissing.of(),
                @JsonProperty("auth_method")
                @ExcludeMissing
                authMethod: JsonField<String> = JsonMissing.of(),
                @JsonProperty("endpoint")
                @ExcludeMissing
                endpoint: JsonField<String> = JsonMissing.of(),
                @JsonProperty("method")
                @ExcludeMissing
                method: JsonField<String> = JsonMissing.of(),
                @JsonProperty("params")
                @ExcludeMissing
                params: JsonField<Params> = JsonMissing.of(),
                @JsonProperty("request_content_type")
                @ExcludeMissing
                requestContentType: JsonField<RequestContentType> = JsonMissing.of(),
                @JsonProperty("response_content_type")
                @ExcludeMissing
                responseContentType: JsonField<ResponseContentType> = JsonMissing.of(),
                @JsonProperty("response_map")
                @ExcludeMissing
                responseMap: JsonField<ResponseMap> = JsonMissing.of(),
            ) : this(
                authHeaderValueFormat,
                authMethod,
                endpoint,
                method,
                params,
                requestContentType,
                responseContentType,
                responseMap,
                mutableMapOf(),
            )

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun authHeaderValueFormat(): Optional<String> =
                authHeaderValueFormat.getOptional("auth_header_value_format")

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun authMethod(): Optional<String> = authMethod.getOptional("auth_method")

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun endpoint(): Optional<String> = endpoint.getOptional("endpoint")

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun method(): Optional<String> = method.getOptional("method")

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun params(): Optional<Params> = params.getOptional("params")

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun requestContentType(): Optional<RequestContentType> =
                requestContentType.getOptional("request_content_type")

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun responseContentType(): Optional<ResponseContentType> =
                responseContentType.getOptional("response_content_type")

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun responseMap(): Optional<ResponseMap> = responseMap.getOptional("response_map")

            /**
             * Returns the raw JSON value of [authHeaderValueFormat].
             *
             * Unlike [authHeaderValueFormat], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("auth_header_value_format")
            @ExcludeMissing
            fun _authHeaderValueFormat(): JsonField<String> = authHeaderValueFormat

            /**
             * Returns the raw JSON value of [authMethod].
             *
             * Unlike [authMethod], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("auth_method")
            @ExcludeMissing
            fun _authMethod(): JsonField<String> = authMethod

            /**
             * Returns the raw JSON value of [endpoint].
             *
             * Unlike [endpoint], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("endpoint") @ExcludeMissing fun _endpoint(): JsonField<String> = endpoint

            /**
             * Returns the raw JSON value of [method].
             *
             * Unlike [method], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("method") @ExcludeMissing fun _method(): JsonField<String> = method

            /**
             * Returns the raw JSON value of [params].
             *
             * Unlike [params], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("params") @ExcludeMissing fun _params(): JsonField<Params> = params

            /**
             * Returns the raw JSON value of [requestContentType].
             *
             * Unlike [requestContentType], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("request_content_type")
            @ExcludeMissing
            fun _requestContentType(): JsonField<RequestContentType> = requestContentType

            /**
             * Returns the raw JSON value of [responseContentType].
             *
             * Unlike [responseContentType], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("response_content_type")
            @ExcludeMissing
            fun _responseContentType(): JsonField<ResponseContentType> = responseContentType

            /**
             * Returns the raw JSON value of [responseMap].
             *
             * Unlike [responseMap], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("response_map")
            @ExcludeMissing
            fun _responseMap(): JsonField<ResponseMap> = responseMap

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [RefreshRequest]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [RefreshRequest]. */
            class Builder internal constructor() {

                private var authHeaderValueFormat: JsonField<String> = JsonMissing.of()
                private var authMethod: JsonField<String> = JsonMissing.of()
                private var endpoint: JsonField<String> = JsonMissing.of()
                private var method: JsonField<String> = JsonMissing.of()
                private var params: JsonField<Params> = JsonMissing.of()
                private var requestContentType: JsonField<RequestContentType> = JsonMissing.of()
                private var responseContentType: JsonField<ResponseContentType> = JsonMissing.of()
                private var responseMap: JsonField<ResponseMap> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(refreshRequest: RefreshRequest) = apply {
                    authHeaderValueFormat = refreshRequest.authHeaderValueFormat
                    authMethod = refreshRequest.authMethod
                    endpoint = refreshRequest.endpoint
                    method = refreshRequest.method
                    params = refreshRequest.params
                    requestContentType = refreshRequest.requestContentType
                    responseContentType = refreshRequest.responseContentType
                    responseMap = refreshRequest.responseMap
                    additionalProperties = refreshRequest.additionalProperties.toMutableMap()
                }

                fun authHeaderValueFormat(authHeaderValueFormat: String) =
                    authHeaderValueFormat(JsonField.of(authHeaderValueFormat))

                /**
                 * Sets [Builder.authHeaderValueFormat] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.authHeaderValueFormat] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun authHeaderValueFormat(authHeaderValueFormat: JsonField<String>) = apply {
                    this.authHeaderValueFormat = authHeaderValueFormat
                }

                fun authMethod(authMethod: String) = authMethod(JsonField.of(authMethod))

                /**
                 * Sets [Builder.authMethod] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.authMethod] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun authMethod(authMethod: JsonField<String>) = apply {
                    this.authMethod = authMethod
                }

                fun endpoint(endpoint: String) = endpoint(JsonField.of(endpoint))

                /**
                 * Sets [Builder.endpoint] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.endpoint] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun endpoint(endpoint: JsonField<String>) = apply { this.endpoint = endpoint }

                fun method(method: String) = method(JsonField.of(method))

                /**
                 * Sets [Builder.method] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.method] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun method(method: JsonField<String>) = apply { this.method = method }

                fun params(params: Params) = params(JsonField.of(params))

                /**
                 * Sets [Builder.params] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.params] with a well-typed [Params] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun params(params: JsonField<Params>) = apply { this.params = params }

                fun requestContentType(requestContentType: RequestContentType) =
                    requestContentType(JsonField.of(requestContentType))

                /**
                 * Sets [Builder.requestContentType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.requestContentType] with a well-typed
                 * [RequestContentType] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun requestContentType(requestContentType: JsonField<RequestContentType>) = apply {
                    this.requestContentType = requestContentType
                }

                fun responseContentType(responseContentType: ResponseContentType) =
                    responseContentType(JsonField.of(responseContentType))

                /**
                 * Sets [Builder.responseContentType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.responseContentType] with a well-typed
                 * [ResponseContentType] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun responseContentType(responseContentType: JsonField<ResponseContentType>) =
                    apply {
                        this.responseContentType = responseContentType
                    }

                fun responseMap(responseMap: ResponseMap) = responseMap(JsonField.of(responseMap))

                /**
                 * Sets [Builder.responseMap] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.responseMap] with a well-typed [ResponseMap]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
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

                /**
                 * Returns an immutable instance of [RefreshRequest].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): RefreshRequest =
                    RefreshRequest(
                        authHeaderValueFormat,
                        authMethod,
                        endpoint,
                        method,
                        params,
                        requestContentType,
                        responseContentType,
                        responseMap,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws ArcadeInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): RefreshRequest = apply {
                if (validated) {
                    return@apply
                }

                authHeaderValueFormat()
                authMethod()
                endpoint()
                method()
                params().ifPresent { it.validate() }
                requestContentType().ifPresent { it.validate() }
                responseContentType().ifPresent { it.validate() }
                responseMap().ifPresent { it.validate() }
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: ArcadeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (authHeaderValueFormat.asKnown().isPresent) 1 else 0) +
                    (if (authMethod.asKnown().isPresent) 1 else 0) +
                    (if (endpoint.asKnown().isPresent) 1 else 0) +
                    (if (method.asKnown().isPresent) 1 else 0) +
                    (params.asKnown().getOrNull()?.validity() ?: 0) +
                    (requestContentType.asKnown().getOrNull()?.validity() ?: 0) +
                    (responseContentType.asKnown().getOrNull()?.validity() ?: 0) +
                    (responseMap.asKnown().getOrNull()?.validity() ?: 0)

            class Params
            @JsonCreator
            private constructor(
                @com.fasterxml.jackson.annotation.JsonValue
                private val additionalProperties: Map<String, JsonValue>
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [Params]. */
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

                    /**
                     * Returns an immutable instance of [Params].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Params = Params(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws ArcadeInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): Params = apply {
                    if (validated) {
                        return@apply
                    }

                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: ArcadeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Params && additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

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

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws ArcadeInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): RequestContentType = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: ArcadeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is RequestContentType && value == other.value
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

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws ArcadeInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): ResponseContentType = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: ArcadeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ResponseContentType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class ResponseMap
            @JsonCreator
            private constructor(
                @com.fasterxml.jackson.annotation.JsonValue
                private val additionalProperties: Map<String, JsonValue>
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [ResponseMap]. */
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

                    /**
                     * Returns an immutable instance of [ResponseMap].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): ResponseMap = ResponseMap(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws ArcadeInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): ResponseMap = apply {
                    if (validated) {
                        return@apply
                    }

                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: ArcadeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ResponseMap &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "ResponseMap{additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is RefreshRequest &&
                    authHeaderValueFormat == other.authHeaderValueFormat &&
                    authMethod == other.authMethod &&
                    endpoint == other.endpoint &&
                    method == other.method &&
                    params == other.params &&
                    requestContentType == other.requestContentType &&
                    responseContentType == other.responseContentType &&
                    responseMap == other.responseMap &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    authHeaderValueFormat,
                    authMethod,
                    endpoint,
                    method,
                    params,
                    requestContentType,
                    responseContentType,
                    responseMap,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "RefreshRequest{authHeaderValueFormat=$authHeaderValueFormat, authMethod=$authMethod, endpoint=$endpoint, method=$method, params=$params, requestContentType=$requestContentType, responseContentType=$responseContentType, responseMap=$responseMap, additionalProperties=$additionalProperties}"
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

                @JvmField val Unknown2 = of(",")

                @JvmField val Unknown3 = of(" ")

                @JvmStatic fun of(value: String) = ScopeDelimiter(JsonField.of(value))
            }

            /** An enum containing [ScopeDelimiter]'s known values. */
            enum class Known {
                Unknown2,
                Unknown3,
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
                Unknown2,
                Unknown3,
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
                    Unknown2 -> Value.Unknown2
                    Unknown3 -> Value.Unknown3
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
                    Unknown2 -> Known.Unknown2
                    Unknown3 -> Known.Unknown3
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

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws ArcadeInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): ScopeDelimiter = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: ArcadeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ScopeDelimiter && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class TokenIntrospectionRequest
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val authHeaderValueFormat: JsonField<String>,
            private val authMethod: JsonField<String>,
            private val endpoint: JsonField<String>,
            private val method: JsonField<String>,
            private val params: JsonField<Params>,
            private val requestContentType: JsonField<RequestContentType>,
            private val responseContentType: JsonField<ResponseContentType>,
            private val responseMap: JsonField<ResponseMap>,
            private val triggers: JsonField<Triggers>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("auth_header_value_format")
                @ExcludeMissing
                authHeaderValueFormat: JsonField<String> = JsonMissing.of(),
                @JsonProperty("auth_method")
                @ExcludeMissing
                authMethod: JsonField<String> = JsonMissing.of(),
                @JsonProperty("endpoint")
                @ExcludeMissing
                endpoint: JsonField<String> = JsonMissing.of(),
                @JsonProperty("method")
                @ExcludeMissing
                method: JsonField<String> = JsonMissing.of(),
                @JsonProperty("params")
                @ExcludeMissing
                params: JsonField<Params> = JsonMissing.of(),
                @JsonProperty("request_content_type")
                @ExcludeMissing
                requestContentType: JsonField<RequestContentType> = JsonMissing.of(),
                @JsonProperty("response_content_type")
                @ExcludeMissing
                responseContentType: JsonField<ResponseContentType> = JsonMissing.of(),
                @JsonProperty("response_map")
                @ExcludeMissing
                responseMap: JsonField<ResponseMap> = JsonMissing.of(),
                @JsonProperty("triggers")
                @ExcludeMissing
                triggers: JsonField<Triggers> = JsonMissing.of(),
            ) : this(
                authHeaderValueFormat,
                authMethod,
                endpoint,
                method,
                params,
                requestContentType,
                responseContentType,
                responseMap,
                triggers,
                mutableMapOf(),
            )

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun authHeaderValueFormat(): Optional<String> =
                authHeaderValueFormat.getOptional("auth_header_value_format")

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun authMethod(): Optional<String> = authMethod.getOptional("auth_method")

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun endpoint(): Optional<String> = endpoint.getOptional("endpoint")

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun method(): Optional<String> = method.getOptional("method")

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun params(): Optional<Params> = params.getOptional("params")

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun requestContentType(): Optional<RequestContentType> =
                requestContentType.getOptional("request_content_type")

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun responseContentType(): Optional<ResponseContentType> =
                responseContentType.getOptional("response_content_type")

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun responseMap(): Optional<ResponseMap> = responseMap.getOptional("response_map")

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun triggers(): Optional<Triggers> = triggers.getOptional("triggers")

            /**
             * Returns the raw JSON value of [authHeaderValueFormat].
             *
             * Unlike [authHeaderValueFormat], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("auth_header_value_format")
            @ExcludeMissing
            fun _authHeaderValueFormat(): JsonField<String> = authHeaderValueFormat

            /**
             * Returns the raw JSON value of [authMethod].
             *
             * Unlike [authMethod], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("auth_method")
            @ExcludeMissing
            fun _authMethod(): JsonField<String> = authMethod

            /**
             * Returns the raw JSON value of [endpoint].
             *
             * Unlike [endpoint], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("endpoint") @ExcludeMissing fun _endpoint(): JsonField<String> = endpoint

            /**
             * Returns the raw JSON value of [method].
             *
             * Unlike [method], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("method") @ExcludeMissing fun _method(): JsonField<String> = method

            /**
             * Returns the raw JSON value of [params].
             *
             * Unlike [params], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("params") @ExcludeMissing fun _params(): JsonField<Params> = params

            /**
             * Returns the raw JSON value of [requestContentType].
             *
             * Unlike [requestContentType], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("request_content_type")
            @ExcludeMissing
            fun _requestContentType(): JsonField<RequestContentType> = requestContentType

            /**
             * Returns the raw JSON value of [responseContentType].
             *
             * Unlike [responseContentType], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("response_content_type")
            @ExcludeMissing
            fun _responseContentType(): JsonField<ResponseContentType> = responseContentType

            /**
             * Returns the raw JSON value of [responseMap].
             *
             * Unlike [responseMap], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("response_map")
            @ExcludeMissing
            fun _responseMap(): JsonField<ResponseMap> = responseMap

            /**
             * Returns the raw JSON value of [triggers].
             *
             * Unlike [triggers], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("triggers")
            @ExcludeMissing
            fun _triggers(): JsonField<Triggers> = triggers

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [TokenIntrospectionRequest].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [TokenIntrospectionRequest]. */
            class Builder internal constructor() {

                private var authHeaderValueFormat: JsonField<String> = JsonMissing.of()
                private var authMethod: JsonField<String> = JsonMissing.of()
                private var endpoint: JsonField<String> = JsonMissing.of()
                private var method: JsonField<String> = JsonMissing.of()
                private var params: JsonField<Params> = JsonMissing.of()
                private var requestContentType: JsonField<RequestContentType> = JsonMissing.of()
                private var responseContentType: JsonField<ResponseContentType> = JsonMissing.of()
                private var responseMap: JsonField<ResponseMap> = JsonMissing.of()
                private var triggers: JsonField<Triggers> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(tokenIntrospectionRequest: TokenIntrospectionRequest) = apply {
                    authHeaderValueFormat = tokenIntrospectionRequest.authHeaderValueFormat
                    authMethod = tokenIntrospectionRequest.authMethod
                    endpoint = tokenIntrospectionRequest.endpoint
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

                /**
                 * Sets [Builder.authHeaderValueFormat] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.authHeaderValueFormat] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun authHeaderValueFormat(authHeaderValueFormat: JsonField<String>) = apply {
                    this.authHeaderValueFormat = authHeaderValueFormat
                }

                fun authMethod(authMethod: String) = authMethod(JsonField.of(authMethod))

                /**
                 * Sets [Builder.authMethod] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.authMethod] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun authMethod(authMethod: JsonField<String>) = apply {
                    this.authMethod = authMethod
                }

                fun endpoint(endpoint: String) = endpoint(JsonField.of(endpoint))

                /**
                 * Sets [Builder.endpoint] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.endpoint] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun endpoint(endpoint: JsonField<String>) = apply { this.endpoint = endpoint }

                fun method(method: String) = method(JsonField.of(method))

                /**
                 * Sets [Builder.method] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.method] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun method(method: JsonField<String>) = apply { this.method = method }

                fun params(params: Params) = params(JsonField.of(params))

                /**
                 * Sets [Builder.params] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.params] with a well-typed [Params] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun params(params: JsonField<Params>) = apply { this.params = params }

                fun requestContentType(requestContentType: RequestContentType) =
                    requestContentType(JsonField.of(requestContentType))

                /**
                 * Sets [Builder.requestContentType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.requestContentType] with a well-typed
                 * [RequestContentType] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun requestContentType(requestContentType: JsonField<RequestContentType>) = apply {
                    this.requestContentType = requestContentType
                }

                fun responseContentType(responseContentType: ResponseContentType) =
                    responseContentType(JsonField.of(responseContentType))

                /**
                 * Sets [Builder.responseContentType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.responseContentType] with a well-typed
                 * [ResponseContentType] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun responseContentType(responseContentType: JsonField<ResponseContentType>) =
                    apply {
                        this.responseContentType = responseContentType
                    }

                fun responseMap(responseMap: ResponseMap) = responseMap(JsonField.of(responseMap))

                /**
                 * Sets [Builder.responseMap] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.responseMap] with a well-typed [ResponseMap]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun responseMap(responseMap: JsonField<ResponseMap>) = apply {
                    this.responseMap = responseMap
                }

                fun triggers(triggers: Triggers) = triggers(JsonField.of(triggers))

                /**
                 * Sets [Builder.triggers] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.triggers] with a well-typed [Triggers] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
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

                /**
                 * Returns an immutable instance of [TokenIntrospectionRequest].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): TokenIntrospectionRequest =
                    TokenIntrospectionRequest(
                        authHeaderValueFormat,
                        authMethod,
                        endpoint,
                        method,
                        params,
                        requestContentType,
                        responseContentType,
                        responseMap,
                        triggers,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws ArcadeInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): TokenIntrospectionRequest = apply {
                if (validated) {
                    return@apply
                }

                authHeaderValueFormat()
                authMethod()
                endpoint()
                method()
                params().ifPresent { it.validate() }
                requestContentType().ifPresent { it.validate() }
                responseContentType().ifPresent { it.validate() }
                responseMap().ifPresent { it.validate() }
                triggers().ifPresent { it.validate() }
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: ArcadeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (authHeaderValueFormat.asKnown().isPresent) 1 else 0) +
                    (if (authMethod.asKnown().isPresent) 1 else 0) +
                    (if (endpoint.asKnown().isPresent) 1 else 0) +
                    (if (method.asKnown().isPresent) 1 else 0) +
                    (params.asKnown().getOrNull()?.validity() ?: 0) +
                    (requestContentType.asKnown().getOrNull()?.validity() ?: 0) +
                    (responseContentType.asKnown().getOrNull()?.validity() ?: 0) +
                    (responseMap.asKnown().getOrNull()?.validity() ?: 0) +
                    (triggers.asKnown().getOrNull()?.validity() ?: 0)

            class Params
            @JsonCreator
            private constructor(
                @com.fasterxml.jackson.annotation.JsonValue
                private val additionalProperties: Map<String, JsonValue>
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [Params]. */
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

                    /**
                     * Returns an immutable instance of [Params].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Params = Params(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws ArcadeInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): Params = apply {
                    if (validated) {
                        return@apply
                    }

                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: ArcadeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Params && additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

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

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws ArcadeInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): RequestContentType = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: ArcadeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is RequestContentType && value == other.value
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

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws ArcadeInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): ResponseContentType = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: ArcadeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ResponseContentType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class ResponseMap
            @JsonCreator
            private constructor(
                @com.fasterxml.jackson.annotation.JsonValue
                private val additionalProperties: Map<String, JsonValue>
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [ResponseMap]. */
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

                    /**
                     * Returns an immutable instance of [ResponseMap].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): ResponseMap = ResponseMap(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws ArcadeInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): ResponseMap = apply {
                    if (validated) {
                        return@apply
                    }

                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: ArcadeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ResponseMap &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "ResponseMap{additionalProperties=$additionalProperties}"
            }

            class Triggers
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val onTokenGrant: JsonField<Boolean>,
                private val onTokenRefresh: JsonField<Boolean>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("on_token_grant")
                    @ExcludeMissing
                    onTokenGrant: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("on_token_refresh")
                    @ExcludeMissing
                    onTokenRefresh: JsonField<Boolean> = JsonMissing.of(),
                ) : this(onTokenGrant, onTokenRefresh, mutableMapOf())

                /**
                 * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun onTokenGrant(): Optional<Boolean> = onTokenGrant.getOptional("on_token_grant")

                /**
                 * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun onTokenRefresh(): Optional<Boolean> =
                    onTokenRefresh.getOptional("on_token_refresh")

                /**
                 * Returns the raw JSON value of [onTokenGrant].
                 *
                 * Unlike [onTokenGrant], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("on_token_grant")
                @ExcludeMissing
                fun _onTokenGrant(): JsonField<Boolean> = onTokenGrant

                /**
                 * Returns the raw JSON value of [onTokenRefresh].
                 *
                 * Unlike [onTokenRefresh], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("on_token_refresh")
                @ExcludeMissing
                fun _onTokenRefresh(): JsonField<Boolean> = onTokenRefresh

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [Triggers]. */
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

                    /**
                     * Sets [Builder.onTokenGrant] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.onTokenGrant] with a well-typed [Boolean]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun onTokenGrant(onTokenGrant: JsonField<Boolean>) = apply {
                        this.onTokenGrant = onTokenGrant
                    }

                    fun onTokenRefresh(onTokenRefresh: Boolean) =
                        onTokenRefresh(JsonField.of(onTokenRefresh))

                    /**
                     * Sets [Builder.onTokenRefresh] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.onTokenRefresh] with a well-typed [Boolean]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
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

                    /**
                     * Returns an immutable instance of [Triggers].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Triggers =
                        Triggers(onTokenGrant, onTokenRefresh, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws ArcadeInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): Triggers = apply {
                    if (validated) {
                        return@apply
                    }

                    onTokenGrant()
                    onTokenRefresh()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: ArcadeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (onTokenGrant.asKnown().isPresent) 1 else 0) +
                        (if (onTokenRefresh.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Triggers &&
                        onTokenGrant == other.onTokenGrant &&
                        onTokenRefresh == other.onTokenRefresh &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(onTokenGrant, onTokenRefresh, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Triggers{onTokenGrant=$onTokenGrant, onTokenRefresh=$onTokenRefresh, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is TokenIntrospectionRequest &&
                    authHeaderValueFormat == other.authHeaderValueFormat &&
                    authMethod == other.authMethod &&
                    endpoint == other.endpoint &&
                    method == other.method &&
                    params == other.params &&
                    requestContentType == other.requestContentType &&
                    responseContentType == other.responseContentType &&
                    responseMap == other.responseMap &&
                    triggers == other.triggers &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    authHeaderValueFormat,
                    authMethod,
                    endpoint,
                    method,
                    params,
                    requestContentType,
                    responseContentType,
                    responseMap,
                    triggers,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "TokenIntrospectionRequest{authHeaderValueFormat=$authHeaderValueFormat, authMethod=$authMethod, endpoint=$endpoint, method=$method, params=$params, requestContentType=$requestContentType, responseContentType=$responseContentType, responseMap=$responseMap, triggers=$triggers, additionalProperties=$additionalProperties}"
        }

        class TokenRequest
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val authHeaderValueFormat: JsonField<String>,
            private val authMethod: JsonField<String>,
            private val endpoint: JsonField<String>,
            private val method: JsonField<String>,
            private val params: JsonField<Params>,
            private val requestContentType: JsonField<RequestContentType>,
            private val responseContentType: JsonField<ResponseContentType>,
            private val responseMap: JsonField<ResponseMap>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("auth_header_value_format")
                @ExcludeMissing
                authHeaderValueFormat: JsonField<String> = JsonMissing.of(),
                @JsonProperty("auth_method")
                @ExcludeMissing
                authMethod: JsonField<String> = JsonMissing.of(),
                @JsonProperty("endpoint")
                @ExcludeMissing
                endpoint: JsonField<String> = JsonMissing.of(),
                @JsonProperty("method")
                @ExcludeMissing
                method: JsonField<String> = JsonMissing.of(),
                @JsonProperty("params")
                @ExcludeMissing
                params: JsonField<Params> = JsonMissing.of(),
                @JsonProperty("request_content_type")
                @ExcludeMissing
                requestContentType: JsonField<RequestContentType> = JsonMissing.of(),
                @JsonProperty("response_content_type")
                @ExcludeMissing
                responseContentType: JsonField<ResponseContentType> = JsonMissing.of(),
                @JsonProperty("response_map")
                @ExcludeMissing
                responseMap: JsonField<ResponseMap> = JsonMissing.of(),
            ) : this(
                authHeaderValueFormat,
                authMethod,
                endpoint,
                method,
                params,
                requestContentType,
                responseContentType,
                responseMap,
                mutableMapOf(),
            )

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun authHeaderValueFormat(): Optional<String> =
                authHeaderValueFormat.getOptional("auth_header_value_format")

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun authMethod(): Optional<String> = authMethod.getOptional("auth_method")

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun endpoint(): Optional<String> = endpoint.getOptional("endpoint")

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun method(): Optional<String> = method.getOptional("method")

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun params(): Optional<Params> = params.getOptional("params")

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun requestContentType(): Optional<RequestContentType> =
                requestContentType.getOptional("request_content_type")

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun responseContentType(): Optional<ResponseContentType> =
                responseContentType.getOptional("response_content_type")

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun responseMap(): Optional<ResponseMap> = responseMap.getOptional("response_map")

            /**
             * Returns the raw JSON value of [authHeaderValueFormat].
             *
             * Unlike [authHeaderValueFormat], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("auth_header_value_format")
            @ExcludeMissing
            fun _authHeaderValueFormat(): JsonField<String> = authHeaderValueFormat

            /**
             * Returns the raw JSON value of [authMethod].
             *
             * Unlike [authMethod], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("auth_method")
            @ExcludeMissing
            fun _authMethod(): JsonField<String> = authMethod

            /**
             * Returns the raw JSON value of [endpoint].
             *
             * Unlike [endpoint], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("endpoint") @ExcludeMissing fun _endpoint(): JsonField<String> = endpoint

            /**
             * Returns the raw JSON value of [method].
             *
             * Unlike [method], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("method") @ExcludeMissing fun _method(): JsonField<String> = method

            /**
             * Returns the raw JSON value of [params].
             *
             * Unlike [params], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("params") @ExcludeMissing fun _params(): JsonField<Params> = params

            /**
             * Returns the raw JSON value of [requestContentType].
             *
             * Unlike [requestContentType], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("request_content_type")
            @ExcludeMissing
            fun _requestContentType(): JsonField<RequestContentType> = requestContentType

            /**
             * Returns the raw JSON value of [responseContentType].
             *
             * Unlike [responseContentType], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("response_content_type")
            @ExcludeMissing
            fun _responseContentType(): JsonField<ResponseContentType> = responseContentType

            /**
             * Returns the raw JSON value of [responseMap].
             *
             * Unlike [responseMap], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("response_map")
            @ExcludeMissing
            fun _responseMap(): JsonField<ResponseMap> = responseMap

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [TokenRequest]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [TokenRequest]. */
            class Builder internal constructor() {

                private var authHeaderValueFormat: JsonField<String> = JsonMissing.of()
                private var authMethod: JsonField<String> = JsonMissing.of()
                private var endpoint: JsonField<String> = JsonMissing.of()
                private var method: JsonField<String> = JsonMissing.of()
                private var params: JsonField<Params> = JsonMissing.of()
                private var requestContentType: JsonField<RequestContentType> = JsonMissing.of()
                private var responseContentType: JsonField<ResponseContentType> = JsonMissing.of()
                private var responseMap: JsonField<ResponseMap> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(tokenRequest: TokenRequest) = apply {
                    authHeaderValueFormat = tokenRequest.authHeaderValueFormat
                    authMethod = tokenRequest.authMethod
                    endpoint = tokenRequest.endpoint
                    method = tokenRequest.method
                    params = tokenRequest.params
                    requestContentType = tokenRequest.requestContentType
                    responseContentType = tokenRequest.responseContentType
                    responseMap = tokenRequest.responseMap
                    additionalProperties = tokenRequest.additionalProperties.toMutableMap()
                }

                fun authHeaderValueFormat(authHeaderValueFormat: String) =
                    authHeaderValueFormat(JsonField.of(authHeaderValueFormat))

                /**
                 * Sets [Builder.authHeaderValueFormat] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.authHeaderValueFormat] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun authHeaderValueFormat(authHeaderValueFormat: JsonField<String>) = apply {
                    this.authHeaderValueFormat = authHeaderValueFormat
                }

                fun authMethod(authMethod: String) = authMethod(JsonField.of(authMethod))

                /**
                 * Sets [Builder.authMethod] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.authMethod] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun authMethod(authMethod: JsonField<String>) = apply {
                    this.authMethod = authMethod
                }

                fun endpoint(endpoint: String) = endpoint(JsonField.of(endpoint))

                /**
                 * Sets [Builder.endpoint] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.endpoint] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun endpoint(endpoint: JsonField<String>) = apply { this.endpoint = endpoint }

                fun method(method: String) = method(JsonField.of(method))

                /**
                 * Sets [Builder.method] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.method] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun method(method: JsonField<String>) = apply { this.method = method }

                fun params(params: Params) = params(JsonField.of(params))

                /**
                 * Sets [Builder.params] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.params] with a well-typed [Params] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun params(params: JsonField<Params>) = apply { this.params = params }

                fun requestContentType(requestContentType: RequestContentType) =
                    requestContentType(JsonField.of(requestContentType))

                /**
                 * Sets [Builder.requestContentType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.requestContentType] with a well-typed
                 * [RequestContentType] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun requestContentType(requestContentType: JsonField<RequestContentType>) = apply {
                    this.requestContentType = requestContentType
                }

                fun responseContentType(responseContentType: ResponseContentType) =
                    responseContentType(JsonField.of(responseContentType))

                /**
                 * Sets [Builder.responseContentType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.responseContentType] with a well-typed
                 * [ResponseContentType] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun responseContentType(responseContentType: JsonField<ResponseContentType>) =
                    apply {
                        this.responseContentType = responseContentType
                    }

                fun responseMap(responseMap: ResponseMap) = responseMap(JsonField.of(responseMap))

                /**
                 * Sets [Builder.responseMap] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.responseMap] with a well-typed [ResponseMap]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
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

                /**
                 * Returns an immutable instance of [TokenRequest].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): TokenRequest =
                    TokenRequest(
                        authHeaderValueFormat,
                        authMethod,
                        endpoint,
                        method,
                        params,
                        requestContentType,
                        responseContentType,
                        responseMap,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws ArcadeInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): TokenRequest = apply {
                if (validated) {
                    return@apply
                }

                authHeaderValueFormat()
                authMethod()
                endpoint()
                method()
                params().ifPresent { it.validate() }
                requestContentType().ifPresent { it.validate() }
                responseContentType().ifPresent { it.validate() }
                responseMap().ifPresent { it.validate() }
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: ArcadeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (authHeaderValueFormat.asKnown().isPresent) 1 else 0) +
                    (if (authMethod.asKnown().isPresent) 1 else 0) +
                    (if (endpoint.asKnown().isPresent) 1 else 0) +
                    (if (method.asKnown().isPresent) 1 else 0) +
                    (params.asKnown().getOrNull()?.validity() ?: 0) +
                    (requestContentType.asKnown().getOrNull()?.validity() ?: 0) +
                    (responseContentType.asKnown().getOrNull()?.validity() ?: 0) +
                    (responseMap.asKnown().getOrNull()?.validity() ?: 0)

            class Params
            @JsonCreator
            private constructor(
                @com.fasterxml.jackson.annotation.JsonValue
                private val additionalProperties: Map<String, JsonValue>
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [Params]. */
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

                    /**
                     * Returns an immutable instance of [Params].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Params = Params(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws ArcadeInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): Params = apply {
                    if (validated) {
                        return@apply
                    }

                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: ArcadeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Params && additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

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

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws ArcadeInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): RequestContentType = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: ArcadeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is RequestContentType && value == other.value
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

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws ArcadeInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): ResponseContentType = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: ArcadeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ResponseContentType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class ResponseMap
            @JsonCreator
            private constructor(
                @com.fasterxml.jackson.annotation.JsonValue
                private val additionalProperties: Map<String, JsonValue>
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [ResponseMap]. */
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

                    /**
                     * Returns an immutable instance of [ResponseMap].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): ResponseMap = ResponseMap(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws ArcadeInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): ResponseMap = apply {
                    if (validated) {
                        return@apply
                    }

                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: ArcadeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ResponseMap &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "ResponseMap{additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is TokenRequest &&
                    authHeaderValueFormat == other.authHeaderValueFormat &&
                    authMethod == other.authMethod &&
                    endpoint == other.endpoint &&
                    method == other.method &&
                    params == other.params &&
                    requestContentType == other.requestContentType &&
                    responseContentType == other.responseContentType &&
                    responseMap == other.responseMap &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    authHeaderValueFormat,
                    authMethod,
                    endpoint,
                    method,
                    params,
                    requestContentType,
                    responseContentType,
                    responseMap,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "TokenRequest{authHeaderValueFormat=$authHeaderValueFormat, authMethod=$authMethod, endpoint=$endpoint, method=$method, params=$params, requestContentType=$requestContentType, responseContentType=$responseContentType, responseMap=$responseMap, additionalProperties=$additionalProperties}"
        }

        class UserInfoRequest
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val authHeaderValueFormat: JsonField<String>,
            private val authMethod: JsonField<String>,
            private val endpoint: JsonField<String>,
            private val method: JsonField<String>,
            private val params: JsonField<Params>,
            private val requestContentType: JsonField<RequestContentType>,
            private val responseContentType: JsonField<ResponseContentType>,
            private val responseMap: JsonField<ResponseMap>,
            private val triggers: JsonField<Triggers>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("auth_header_value_format")
                @ExcludeMissing
                authHeaderValueFormat: JsonField<String> = JsonMissing.of(),
                @JsonProperty("auth_method")
                @ExcludeMissing
                authMethod: JsonField<String> = JsonMissing.of(),
                @JsonProperty("endpoint")
                @ExcludeMissing
                endpoint: JsonField<String> = JsonMissing.of(),
                @JsonProperty("method")
                @ExcludeMissing
                method: JsonField<String> = JsonMissing.of(),
                @JsonProperty("params")
                @ExcludeMissing
                params: JsonField<Params> = JsonMissing.of(),
                @JsonProperty("request_content_type")
                @ExcludeMissing
                requestContentType: JsonField<RequestContentType> = JsonMissing.of(),
                @JsonProperty("response_content_type")
                @ExcludeMissing
                responseContentType: JsonField<ResponseContentType> = JsonMissing.of(),
                @JsonProperty("response_map")
                @ExcludeMissing
                responseMap: JsonField<ResponseMap> = JsonMissing.of(),
                @JsonProperty("triggers")
                @ExcludeMissing
                triggers: JsonField<Triggers> = JsonMissing.of(),
            ) : this(
                authHeaderValueFormat,
                authMethod,
                endpoint,
                method,
                params,
                requestContentType,
                responseContentType,
                responseMap,
                triggers,
                mutableMapOf(),
            )

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun authHeaderValueFormat(): Optional<String> =
                authHeaderValueFormat.getOptional("auth_header_value_format")

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun authMethod(): Optional<String> = authMethod.getOptional("auth_method")

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun endpoint(): Optional<String> = endpoint.getOptional("endpoint")

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun method(): Optional<String> = method.getOptional("method")

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun params(): Optional<Params> = params.getOptional("params")

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun requestContentType(): Optional<RequestContentType> =
                requestContentType.getOptional("request_content_type")

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun responseContentType(): Optional<ResponseContentType> =
                responseContentType.getOptional("response_content_type")

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun responseMap(): Optional<ResponseMap> = responseMap.getOptional("response_map")

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun triggers(): Optional<Triggers> = triggers.getOptional("triggers")

            /**
             * Returns the raw JSON value of [authHeaderValueFormat].
             *
             * Unlike [authHeaderValueFormat], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("auth_header_value_format")
            @ExcludeMissing
            fun _authHeaderValueFormat(): JsonField<String> = authHeaderValueFormat

            /**
             * Returns the raw JSON value of [authMethod].
             *
             * Unlike [authMethod], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("auth_method")
            @ExcludeMissing
            fun _authMethod(): JsonField<String> = authMethod

            /**
             * Returns the raw JSON value of [endpoint].
             *
             * Unlike [endpoint], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("endpoint") @ExcludeMissing fun _endpoint(): JsonField<String> = endpoint

            /**
             * Returns the raw JSON value of [method].
             *
             * Unlike [method], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("method") @ExcludeMissing fun _method(): JsonField<String> = method

            /**
             * Returns the raw JSON value of [params].
             *
             * Unlike [params], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("params") @ExcludeMissing fun _params(): JsonField<Params> = params

            /**
             * Returns the raw JSON value of [requestContentType].
             *
             * Unlike [requestContentType], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("request_content_type")
            @ExcludeMissing
            fun _requestContentType(): JsonField<RequestContentType> = requestContentType

            /**
             * Returns the raw JSON value of [responseContentType].
             *
             * Unlike [responseContentType], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("response_content_type")
            @ExcludeMissing
            fun _responseContentType(): JsonField<ResponseContentType> = responseContentType

            /**
             * Returns the raw JSON value of [responseMap].
             *
             * Unlike [responseMap], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("response_map")
            @ExcludeMissing
            fun _responseMap(): JsonField<ResponseMap> = responseMap

            /**
             * Returns the raw JSON value of [triggers].
             *
             * Unlike [triggers], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("triggers")
            @ExcludeMissing
            fun _triggers(): JsonField<Triggers> = triggers

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [UserInfoRequest]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [UserInfoRequest]. */
            class Builder internal constructor() {

                private var authHeaderValueFormat: JsonField<String> = JsonMissing.of()
                private var authMethod: JsonField<String> = JsonMissing.of()
                private var endpoint: JsonField<String> = JsonMissing.of()
                private var method: JsonField<String> = JsonMissing.of()
                private var params: JsonField<Params> = JsonMissing.of()
                private var requestContentType: JsonField<RequestContentType> = JsonMissing.of()
                private var responseContentType: JsonField<ResponseContentType> = JsonMissing.of()
                private var responseMap: JsonField<ResponseMap> = JsonMissing.of()
                private var triggers: JsonField<Triggers> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(userInfoRequest: UserInfoRequest) = apply {
                    authHeaderValueFormat = userInfoRequest.authHeaderValueFormat
                    authMethod = userInfoRequest.authMethod
                    endpoint = userInfoRequest.endpoint
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

                /**
                 * Sets [Builder.authHeaderValueFormat] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.authHeaderValueFormat] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun authHeaderValueFormat(authHeaderValueFormat: JsonField<String>) = apply {
                    this.authHeaderValueFormat = authHeaderValueFormat
                }

                fun authMethod(authMethod: String) = authMethod(JsonField.of(authMethod))

                /**
                 * Sets [Builder.authMethod] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.authMethod] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun authMethod(authMethod: JsonField<String>) = apply {
                    this.authMethod = authMethod
                }

                fun endpoint(endpoint: String) = endpoint(JsonField.of(endpoint))

                /**
                 * Sets [Builder.endpoint] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.endpoint] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun endpoint(endpoint: JsonField<String>) = apply { this.endpoint = endpoint }

                fun method(method: String) = method(JsonField.of(method))

                /**
                 * Sets [Builder.method] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.method] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun method(method: JsonField<String>) = apply { this.method = method }

                fun params(params: Params) = params(JsonField.of(params))

                /**
                 * Sets [Builder.params] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.params] with a well-typed [Params] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun params(params: JsonField<Params>) = apply { this.params = params }

                fun requestContentType(requestContentType: RequestContentType) =
                    requestContentType(JsonField.of(requestContentType))

                /**
                 * Sets [Builder.requestContentType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.requestContentType] with a well-typed
                 * [RequestContentType] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun requestContentType(requestContentType: JsonField<RequestContentType>) = apply {
                    this.requestContentType = requestContentType
                }

                fun responseContentType(responseContentType: ResponseContentType) =
                    responseContentType(JsonField.of(responseContentType))

                /**
                 * Sets [Builder.responseContentType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.responseContentType] with a well-typed
                 * [ResponseContentType] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun responseContentType(responseContentType: JsonField<ResponseContentType>) =
                    apply {
                        this.responseContentType = responseContentType
                    }

                fun responseMap(responseMap: ResponseMap) = responseMap(JsonField.of(responseMap))

                /**
                 * Sets [Builder.responseMap] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.responseMap] with a well-typed [ResponseMap]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun responseMap(responseMap: JsonField<ResponseMap>) = apply {
                    this.responseMap = responseMap
                }

                fun triggers(triggers: Triggers) = triggers(JsonField.of(triggers))

                /**
                 * Sets [Builder.triggers] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.triggers] with a well-typed [Triggers] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
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

                /**
                 * Returns an immutable instance of [UserInfoRequest].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): UserInfoRequest =
                    UserInfoRequest(
                        authHeaderValueFormat,
                        authMethod,
                        endpoint,
                        method,
                        params,
                        requestContentType,
                        responseContentType,
                        responseMap,
                        triggers,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws ArcadeInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): UserInfoRequest = apply {
                if (validated) {
                    return@apply
                }

                authHeaderValueFormat()
                authMethod()
                endpoint()
                method()
                params().ifPresent { it.validate() }
                requestContentType().ifPresent { it.validate() }
                responseContentType().ifPresent { it.validate() }
                responseMap().ifPresent { it.validate() }
                triggers().ifPresent { it.validate() }
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: ArcadeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (authHeaderValueFormat.asKnown().isPresent) 1 else 0) +
                    (if (authMethod.asKnown().isPresent) 1 else 0) +
                    (if (endpoint.asKnown().isPresent) 1 else 0) +
                    (if (method.asKnown().isPresent) 1 else 0) +
                    (params.asKnown().getOrNull()?.validity() ?: 0) +
                    (requestContentType.asKnown().getOrNull()?.validity() ?: 0) +
                    (responseContentType.asKnown().getOrNull()?.validity() ?: 0) +
                    (responseMap.asKnown().getOrNull()?.validity() ?: 0) +
                    (triggers.asKnown().getOrNull()?.validity() ?: 0)

            class Params
            @JsonCreator
            private constructor(
                @com.fasterxml.jackson.annotation.JsonValue
                private val additionalProperties: Map<String, JsonValue>
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [Params]. */
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

                    /**
                     * Returns an immutable instance of [Params].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Params = Params(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws ArcadeInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): Params = apply {
                    if (validated) {
                        return@apply
                    }

                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: ArcadeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Params && additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

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

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws ArcadeInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): RequestContentType = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: ArcadeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is RequestContentType && value == other.value
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

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws ArcadeInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): ResponseContentType = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: ArcadeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ResponseContentType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class ResponseMap
            @JsonCreator
            private constructor(
                @com.fasterxml.jackson.annotation.JsonValue
                private val additionalProperties: Map<String, JsonValue>
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [ResponseMap]. */
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

                    /**
                     * Returns an immutable instance of [ResponseMap].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): ResponseMap = ResponseMap(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws ArcadeInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): ResponseMap = apply {
                    if (validated) {
                        return@apply
                    }

                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: ArcadeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ResponseMap &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "ResponseMap{additionalProperties=$additionalProperties}"
            }

            class Triggers
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val onTokenGrant: JsonField<Boolean>,
                private val onTokenRefresh: JsonField<Boolean>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("on_token_grant")
                    @ExcludeMissing
                    onTokenGrant: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("on_token_refresh")
                    @ExcludeMissing
                    onTokenRefresh: JsonField<Boolean> = JsonMissing.of(),
                ) : this(onTokenGrant, onTokenRefresh, mutableMapOf())

                /**
                 * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun onTokenGrant(): Optional<Boolean> = onTokenGrant.getOptional("on_token_grant")

                /**
                 * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun onTokenRefresh(): Optional<Boolean> =
                    onTokenRefresh.getOptional("on_token_refresh")

                /**
                 * Returns the raw JSON value of [onTokenGrant].
                 *
                 * Unlike [onTokenGrant], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("on_token_grant")
                @ExcludeMissing
                fun _onTokenGrant(): JsonField<Boolean> = onTokenGrant

                /**
                 * Returns the raw JSON value of [onTokenRefresh].
                 *
                 * Unlike [onTokenRefresh], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("on_token_refresh")
                @ExcludeMissing
                fun _onTokenRefresh(): JsonField<Boolean> = onTokenRefresh

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [Triggers]. */
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

                    /**
                     * Sets [Builder.onTokenGrant] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.onTokenGrant] with a well-typed [Boolean]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun onTokenGrant(onTokenGrant: JsonField<Boolean>) = apply {
                        this.onTokenGrant = onTokenGrant
                    }

                    fun onTokenRefresh(onTokenRefresh: Boolean) =
                        onTokenRefresh(JsonField.of(onTokenRefresh))

                    /**
                     * Sets [Builder.onTokenRefresh] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.onTokenRefresh] with a well-typed [Boolean]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
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

                    /**
                     * Returns an immutable instance of [Triggers].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Triggers =
                        Triggers(onTokenGrant, onTokenRefresh, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws ArcadeInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): Triggers = apply {
                    if (validated) {
                        return@apply
                    }

                    onTokenGrant()
                    onTokenRefresh()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: ArcadeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (onTokenGrant.asKnown().isPresent) 1 else 0) +
                        (if (onTokenRefresh.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Triggers &&
                        onTokenGrant == other.onTokenGrant &&
                        onTokenRefresh == other.onTokenRefresh &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(onTokenGrant, onTokenRefresh, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Triggers{onTokenGrant=$onTokenGrant, onTokenRefresh=$onTokenRefresh, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is UserInfoRequest &&
                    authHeaderValueFormat == other.authHeaderValueFormat &&
                    authMethod == other.authMethod &&
                    endpoint == other.endpoint &&
                    method == other.method &&
                    params == other.params &&
                    requestContentType == other.requestContentType &&
                    responseContentType == other.responseContentType &&
                    responseMap == other.responseMap &&
                    triggers == other.triggers &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    authHeaderValueFormat,
                    authMethod,
                    endpoint,
                    method,
                    params,
                    requestContentType,
                    responseContentType,
                    responseMap,
                    triggers,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UserInfoRequest{authHeaderValueFormat=$authHeaderValueFormat, authMethod=$authMethod, endpoint=$endpoint, method=$method, params=$params, requestContentType=$requestContentType, responseContentType=$responseContentType, responseMap=$responseMap, triggers=$triggers, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Oauth2 &&
                authorizeRequest == other.authorizeRequest &&
                clientId == other.clientId &&
                clientSecret == other.clientSecret &&
                pkce == other.pkce &&
                refreshRequest == other.refreshRequest &&
                scopeDelimiter == other.scopeDelimiter &&
                tokenIntrospectionRequest == other.tokenIntrospectionRequest &&
                tokenRequest == other.tokenRequest &&
                userInfoRequest == other.userInfoRequest &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                authorizeRequest,
                clientId,
                clientSecret,
                pkce,
                refreshRequest,
                scopeDelimiter,
                tokenIntrospectionRequest,
                tokenRequest,
                userInfoRequest,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Oauth2{authorizeRequest=$authorizeRequest, clientId=$clientId, clientSecret=$clientSecret, pkce=$pkce, refreshRequest=$refreshRequest, scopeDelimiter=$scopeDelimiter, tokenIntrospectionRequest=$tokenIntrospectionRequest, tokenRequest=$tokenRequest, userInfoRequest=$userInfoRequest, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AuthProviderUpdateRequest &&
            id == other.id &&
            description == other.description &&
            oauth2 == other.oauth2 &&
            providerId == other.providerId &&
            status == other.status &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(id, description, oauth2, providerId, status, type, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AuthProviderUpdateRequest{id=$id, description=$description, oauth2=$oauth2, providerId=$providerId, status=$status, type=$type, additionalProperties=$additionalProperties}"
}
