// File generated from our OpenAPI spec by Stainless.

package org.arcadeai.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Objects
import java.util.Optional
import org.arcadeai.api.core.ExcludeMissing
import org.arcadeai.api.core.JsonField
import org.arcadeai.api.core.JsonMissing
import org.arcadeai.api.core.JsonValue
import org.arcadeai.api.core.NoAutoDetect
import org.arcadeai.api.core.checkRequired
import org.arcadeai.api.core.immutableEmptyMap
import org.arcadeai.api.core.toImmutable

@NoAutoDetect
class AuthRequest
@JsonCreator
private constructor(
    @JsonProperty("auth_requirement")
    @ExcludeMissing
    private val authRequirement: JsonField<AuthRequirement> = JsonMissing.of(),
    @JsonProperty("user_id")
    @ExcludeMissing
    private val userId: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun authRequirement(): AuthRequirement = authRequirement.getRequired("auth_requirement")

    fun userId(): String = userId.getRequired("user_id")

    @JsonProperty("auth_requirement")
    @ExcludeMissing
    fun _authRequirement(): JsonField<AuthRequirement> = authRequirement

    @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): AuthRequest = apply {
        if (validated) {
            return@apply
        }

        authRequirement().validate()
        userId()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AuthRequest]. */
    class Builder internal constructor() {

        private var authRequirement: JsonField<AuthRequirement>? = null
        private var userId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(authRequest: AuthRequest) = apply {
            authRequirement = authRequest.authRequirement
            userId = authRequest.userId
            additionalProperties = authRequest.additionalProperties.toMutableMap()
        }

        fun authRequirement(authRequirement: AuthRequirement) =
            authRequirement(JsonField.of(authRequirement))

        fun authRequirement(authRequirement: JsonField<AuthRequirement>) = apply {
            this.authRequirement = authRequirement
        }

        fun userId(userId: String) = userId(JsonField.of(userId))

        fun userId(userId: JsonField<String>) = apply { this.userId = userId }

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

        fun build(): AuthRequest =
            AuthRequest(
                checkRequired("authRequirement", authRequirement),
                checkRequired("userId", userId),
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class AuthRequirement
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("oauth2")
        @ExcludeMissing
        private val oauth2: JsonField<Oauth2> = JsonMissing.of(),
        @JsonProperty("provider_id")
        @ExcludeMissing
        private val providerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("provider_type")
        @ExcludeMissing
        private val providerType: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** one of ID or ProviderID must be set */
        fun id(): Optional<String> = Optional.ofNullable(id.getNullable("id"))

        fun oauth2(): Optional<Oauth2> = Optional.ofNullable(oauth2.getNullable("oauth2"))

        /** one of ID or ProviderID must be set */
        fun providerId(): Optional<String> =
            Optional.ofNullable(providerId.getNullable("provider_id"))

        fun providerType(): Optional<String> =
            Optional.ofNullable(providerType.getNullable("provider_type"))

        /** one of ID or ProviderID must be set */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        @JsonProperty("oauth2") @ExcludeMissing fun _oauth2(): JsonField<Oauth2> = oauth2

        /** one of ID or ProviderID must be set */
        @JsonProperty("provider_id")
        @ExcludeMissing
        fun _providerId(): JsonField<String> = providerId

        @JsonProperty("provider_type")
        @ExcludeMissing
        fun _providerType(): JsonField<String> = providerType

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

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

        fun toBuilder() = Builder().from(this)

        companion object {

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

            /** one of ID or ProviderID must be set */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun oauth2(oauth2: Oauth2) = oauth2(JsonField.of(oauth2))

            fun oauth2(oauth2: JsonField<Oauth2>) = apply { this.oauth2 = oauth2 }

            /** one of ID or ProviderID must be set */
            fun providerId(providerId: String) = providerId(JsonField.of(providerId))

            /** one of ID or ProviderID must be set */
            fun providerId(providerId: JsonField<String>) = apply { this.providerId = providerId }

            fun providerType(providerType: String) = providerType(JsonField.of(providerType))

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

            fun build(): AuthRequirement =
                AuthRequirement(
                    id,
                    oauth2,
                    providerId,
                    providerType,
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class Oauth2
        @JsonCreator
        private constructor(
            @JsonProperty("scopes")
            @ExcludeMissing
            private val scopes: JsonField<List<String>> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun scopes(): Optional<List<String>> = Optional.ofNullable(scopes.getNullable("scopes"))

            @JsonProperty("scopes") @ExcludeMissing fun _scopes(): JsonField<List<String>> = scopes

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Oauth2 = apply {
                if (validated) {
                    return@apply
                }

                scopes()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

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

                fun scopes(scopes: JsonField<List<String>>) = apply {
                    this.scopes = scopes.map { it.toMutableList() }
                }

                fun addScope(scope: String) = apply {
                    scopes =
                        (scopes ?: JsonField.of(mutableListOf())).apply {
                            asKnown()
                                .orElseThrow {
                                    IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    )
                                }
                                .add(scope)
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

                fun build(): Oauth2 =
                    Oauth2(
                        (scopes ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Oauth2 && scopes == other.scopes && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(scopes, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Oauth2{scopes=$scopes, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AuthRequirement && id == other.id && oauth2 == other.oauth2 && providerId == other.providerId && providerType == other.providerType && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, oauth2, providerId, providerType, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AuthRequirement{id=$id, oauth2=$oauth2, providerId=$providerId, providerType=$providerType, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AuthRequest && authRequirement == other.authRequirement && userId == other.userId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(authRequirement, userId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AuthRequest{authRequirement=$authRequirement, userId=$userId, additionalProperties=$additionalProperties}"
}
