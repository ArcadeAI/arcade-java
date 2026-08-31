// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models.auth

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.arcade.core.ExcludeMissing
import dev.arcade.core.JsonField
import dev.arcade.core.JsonMissing
import dev.arcade.core.JsonValue
import dev.arcade.core.checkKnown
import dev.arcade.core.checkRequired
import dev.arcade.core.toImmutable
import dev.arcade.errors.ArcadeInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class AuthRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val authRequirement: JsonField<AuthRequirement>,
    private val userId: JsonField<String>,
    private val nextUri: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("auth_requirement")
        @ExcludeMissing
        authRequirement: JsonField<AuthRequirement> = JsonMissing.of(),
        @JsonProperty("user_id") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("next_uri") @ExcludeMissing nextUri: JsonField<String> = JsonMissing.of(),
    ) : this(authRequirement, userId, nextUri, mutableMapOf())

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun authRequirement(): AuthRequirement = authRequirement.getRequired("auth_requirement")

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun userId(): String = userId.getRequired("user_id")

    /**
     * Optional: if provided, the user will be redirected to this URI after authorization
     *
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun nextUri(): Optional<String> = nextUri.getOptional("next_uri")

    /**
     * Returns the raw JSON value of [authRequirement].
     *
     * Unlike [authRequirement], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("auth_requirement")
    @ExcludeMissing
    fun _authRequirement(): JsonField<AuthRequirement> = authRequirement

    /**
     * Returns the raw JSON value of [userId].
     *
     * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

    /**
     * Returns the raw JSON value of [nextUri].
     *
     * Unlike [nextUri], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("next_uri") @ExcludeMissing fun _nextUri(): JsonField<String> = nextUri

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
         * Returns a mutable builder for constructing an instance of [AuthRequest].
         *
         * The following fields are required:
         * ```java
         * .authRequirement()
         * .userId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AuthRequest]. */
    class Builder internal constructor() {

        private var authRequirement: JsonField<AuthRequirement>? = null
        private var userId: JsonField<String>? = null
        private var nextUri: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(authRequest: AuthRequest) = apply {
            authRequirement = authRequest.authRequirement
            userId = authRequest.userId
            nextUri = authRequest.nextUri
            additionalProperties = authRequest.additionalProperties.toMutableMap()
        }

        fun authRequirement(authRequirement: AuthRequirement) =
            authRequirement(JsonField.of(authRequirement))

        /**
         * Sets [Builder.authRequirement] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authRequirement] with a well-typed [AuthRequirement]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun authRequirement(authRequirement: JsonField<AuthRequirement>) = apply {
            this.authRequirement = authRequirement
        }

        fun userId(userId: String) = userId(JsonField.of(userId))

        /**
         * Sets [Builder.userId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun userId(userId: JsonField<String>) = apply { this.userId = userId }

        /** Optional: if provided, the user will be redirected to this URI after authorization */
        fun nextUri(nextUri: String) = nextUri(JsonField.of(nextUri))

        /**
         * Sets [Builder.nextUri] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nextUri] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun nextUri(nextUri: JsonField<String>) = apply { this.nextUri = nextUri }

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
         * Returns an immutable instance of [AuthRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .authRequirement()
         * .userId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AuthRequest =
            AuthRequest(
                checkRequired("authRequirement", authRequirement),
                checkRequired("userId", userId),
                nextUri,
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
    fun validate(): AuthRequest = apply {
        if (validated) {
            return@apply
        }

        authRequirement().validate()
        userId()
        nextUri()
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
        (authRequirement.asKnown().getOrNull()?.validity() ?: 0) +
            (if (userId.asKnown().isPresent) 1 else 0) +
            (if (nextUri.asKnown().isPresent) 1 else 0)

    class AuthRequirement
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val oauth2: JsonField<Oauth2>,
        private val providerId: JsonField<String>,
        private val providerType: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("oauth2") @ExcludeMissing oauth2: JsonField<Oauth2> = JsonMissing.of(),
            @JsonProperty("provider_id")
            @ExcludeMissing
            providerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("provider_type")
            @ExcludeMissing
            providerType: JsonField<String> = JsonMissing.of(),
        ) : this(id, oauth2, providerId, providerType, mutableMapOf())

        /**
         * one of ID or ProviderID must be set
         *
         * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun oauth2(): Optional<Oauth2> = oauth2.getOptional("oauth2")

        /**
         * one of ID or ProviderID must be set
         *
         * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun providerId(): Optional<String> = providerId.getOptional("provider_id")

        /**
         * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun providerType(): Optional<String> = providerType.getOptional("provider_type")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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
        @JsonProperty("provider_id")
        @ExcludeMissing
        fun _providerId(): JsonField<String> = providerId

        /**
         * Returns the raw JSON value of [providerType].
         *
         * Unlike [providerType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("provider_type")
        @ExcludeMissing
        fun _providerType(): JsonField<String> = providerType

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

            /** Returns a mutable builder for constructing an instance of [AuthRequirement]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AuthRequirement]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var oauth2: JsonField<Oauth2> = JsonMissing.of()
            private var providerId: JsonField<String> = JsonMissing.of()
            private var providerType: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(authRequirement: AuthRequirement) = apply {
                id = authRequirement.id
                oauth2 = authRequirement.oauth2
                providerId = authRequirement.providerId
                providerType = authRequirement.providerType
                additionalProperties = authRequirement.additionalProperties.toMutableMap()
            }

            /** one of ID or ProviderID must be set */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun oauth2(oauth2: Oauth2) = oauth2(JsonField.of(oauth2))

            /**
             * Sets [Builder.oauth2] to an arbitrary JSON value.
             *
             * You should usually call [Builder.oauth2] with a well-typed [Oauth2] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun oauth2(oauth2: JsonField<Oauth2>) = apply { this.oauth2 = oauth2 }

            /** one of ID or ProviderID must be set */
            fun providerId(providerId: String) = providerId(JsonField.of(providerId))

            /**
             * Sets [Builder.providerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.providerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun providerId(providerId: JsonField<String>) = apply { this.providerId = providerId }

            fun providerType(providerType: String) = providerType(JsonField.of(providerType))

            /**
             * Sets [Builder.providerType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.providerType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun providerType(providerType: JsonField<String>) = apply {
                this.providerType = providerType
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
             * Returns an immutable instance of [AuthRequirement].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): AuthRequirement =
                AuthRequirement(
                    id,
                    oauth2,
                    providerId,
                    providerType,
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
        fun validate(): AuthRequirement = apply {
            if (validated) {
                return@apply
            }

            id()
            oauth2().ifPresent { it.validate() }
            providerId()
            providerType()
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (oauth2.asKnown().getOrNull()?.validity() ?: 0) +
                (if (providerId.asKnown().isPresent) 1 else 0) +
                (if (providerType.asKnown().isPresent) 1 else 0)

        class Oauth2
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val scopes: JsonField<List<String>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("scopes")
                @ExcludeMissing
                scopes: JsonField<List<String>> = JsonMissing.of()
            ) : this(scopes, mutableMapOf())

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun scopes(): Optional<List<String>> = scopes.getOptional("scopes")

            /**
             * Returns the raw JSON value of [scopes].
             *
             * Unlike [scopes], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("scopes") @ExcludeMissing fun _scopes(): JsonField<List<String>> = scopes

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

                private var scopes: JsonField<MutableList<String>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(oauth2: Oauth2) = apply {
                    scopes = oauth2.scopes.map { it.toMutableList() }
                    additionalProperties = oauth2.additionalProperties.toMutableMap()
                }

                fun scopes(scopes: List<String>) = scopes(JsonField.of(scopes))

                /**
                 * Sets [Builder.scopes] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.scopes] with a well-typed `List<String>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun scopes(scopes: JsonField<List<String>>) = apply {
                    this.scopes = scopes.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [scopes].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addScope(scope: String) = apply {
                    scopes =
                        (scopes ?: JsonField.of(mutableListOf())).also {
                            checkKnown("scopes", it).add(scope)
                        }
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
                 * Returns an immutable instance of [Oauth2].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Oauth2 =
                    Oauth2(
                        (scopes ?: JsonMissing.of()).map { it.toImmutable() },
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
            fun validate(): Oauth2 = apply {
                if (validated) {
                    return@apply
                }

                scopes()
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
            @JvmSynthetic internal fun validity(): Int = (scopes.asKnown().getOrNull()?.size ?: 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Oauth2 &&
                    scopes == other.scopes &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(scopes, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Oauth2{scopes=$scopes, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AuthRequirement &&
                id == other.id &&
                oauth2 == other.oauth2 &&
                providerId == other.providerId &&
                providerType == other.providerType &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(id, oauth2, providerId, providerType, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AuthRequirement{id=$id, oauth2=$oauth2, providerId=$providerId, providerType=$providerType, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AuthRequest &&
            authRequirement == other.authRequirement &&
            userId == other.userId &&
            nextUri == other.nextUri &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(authRequirement, userId, nextUri, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AuthRequest{authRequirement=$authRequirement, userId=$userId, nextUri=$nextUri, additionalProperties=$additionalProperties}"
}
