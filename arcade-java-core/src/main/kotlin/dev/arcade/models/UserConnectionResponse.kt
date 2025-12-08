// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.arcade.core.ExcludeMissing
import dev.arcade.core.JsonField
import dev.arcade.core.JsonMissing
import dev.arcade.core.JsonValue
import dev.arcade.core.NoAutoDetect
import dev.arcade.core.immutableEmptyMap
import dev.arcade.core.toImmutable
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class UserConnectionResponse
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("connection_id")
    @ExcludeMissing
    private val connectionId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("connection_status")
    @ExcludeMissing
    private val connectionStatus: JsonField<String> = JsonMissing.of(),
    @JsonProperty("provider_description")
    @ExcludeMissing
    private val providerDescription: JsonField<String> = JsonMissing.of(),
    @JsonProperty("provider_id")
    @ExcludeMissing
    private val providerId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("provider_type")
    @ExcludeMissing
    private val providerType: JsonField<String> = JsonMissing.of(),
    @JsonProperty("provider_user_info")
    @ExcludeMissing
    private val providerUserInfo: JsonValue = JsonMissing.of(),
    @JsonProperty("scopes")
    @ExcludeMissing
    private val scopes: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("user_id")
    @ExcludeMissing
    private val userId: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): Optional<String> = Optional.ofNullable(id.getNullable("id"))

    fun connectionId(): Optional<String> =
        Optional.ofNullable(connectionId.getNullable("connection_id"))

    fun connectionStatus(): Optional<String> =
        Optional.ofNullable(connectionStatus.getNullable("connection_status"))

    fun providerDescription(): Optional<String> =
        Optional.ofNullable(providerDescription.getNullable("provider_description"))

    fun providerId(): Optional<String> = Optional.ofNullable(providerId.getNullable("provider_id"))

    fun providerType(): Optional<String> =
        Optional.ofNullable(providerType.getNullable("provider_type"))

    @JsonProperty("provider_user_info")
    @ExcludeMissing
    fun _providerUserInfo(): JsonValue = providerUserInfo

    fun scopes(): Optional<List<String>> = Optional.ofNullable(scopes.getNullable("scopes"))

    fun userId(): Optional<String> = Optional.ofNullable(userId.getNullable("user_id"))

    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    @JsonProperty("connection_id")
    @ExcludeMissing
    fun _connectionId(): JsonField<String> = connectionId

    @JsonProperty("connection_status")
    @ExcludeMissing
    fun _connectionStatus(): JsonField<String> = connectionStatus

    @JsonProperty("provider_description")
    @ExcludeMissing
    fun _providerDescription(): JsonField<String> = providerDescription

    @JsonProperty("provider_id") @ExcludeMissing fun _providerId(): JsonField<String> = providerId

    @JsonProperty("provider_type")
    @ExcludeMissing
    fun _providerType(): JsonField<String> = providerType

    @JsonProperty("scopes") @ExcludeMissing fun _scopes(): JsonField<List<String>> = scopes

    @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): UserConnectionResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        connectionId()
        connectionStatus()
        providerDescription()
        providerId()
        providerType()
        scopes()
        userId()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UserConnectionResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var connectionId: JsonField<String> = JsonMissing.of()
        private var connectionStatus: JsonField<String> = JsonMissing.of()
        private var providerDescription: JsonField<String> = JsonMissing.of()
        private var providerId: JsonField<String> = JsonMissing.of()
        private var providerType: JsonField<String> = JsonMissing.of()
        private var providerUserInfo: JsonValue = JsonMissing.of()
        private var scopes: JsonField<MutableList<String>>? = null
        private var userId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(userConnectionResponse: UserConnectionResponse) = apply {
            id = userConnectionResponse.id
            connectionId = userConnectionResponse.connectionId
            connectionStatus = userConnectionResponse.connectionStatus
            providerDescription = userConnectionResponse.providerDescription
            providerId = userConnectionResponse.providerId
            providerType = userConnectionResponse.providerType
            providerUserInfo = userConnectionResponse.providerUserInfo
            scopes = userConnectionResponse.scopes.map { it.toMutableList() }
            userId = userConnectionResponse.userId
            additionalProperties = userConnectionResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        fun connectionId(connectionId: String) = connectionId(JsonField.of(connectionId))

        fun connectionId(connectionId: JsonField<String>) = apply {
            this.connectionId = connectionId
        }

        fun connectionStatus(connectionStatus: String) =
            connectionStatus(JsonField.of(connectionStatus))

        fun connectionStatus(connectionStatus: JsonField<String>) = apply {
            this.connectionStatus = connectionStatus
        }

        fun providerDescription(providerDescription: String) =
            providerDescription(JsonField.of(providerDescription))

        fun providerDescription(providerDescription: JsonField<String>) = apply {
            this.providerDescription = providerDescription
        }

        fun providerId(providerId: String) = providerId(JsonField.of(providerId))

        fun providerId(providerId: JsonField<String>) = apply { this.providerId = providerId }

        fun providerType(providerType: String) = providerType(JsonField.of(providerType))

        fun providerType(providerType: JsonField<String>) = apply {
            this.providerType = providerType
        }

        fun providerUserInfo(providerUserInfo: JsonValue) = apply {
            this.providerUserInfo = providerUserInfo
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

        fun build(): UserConnectionResponse =
            UserConnectionResponse(
                id,
                connectionId,
                connectionStatus,
                providerDescription,
                providerId,
                providerType,
                providerUserInfo,
                (scopes ?: JsonMissing.of()).map { it.toImmutable() },
                userId,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is UserConnectionResponse && id == other.id && connectionId == other.connectionId && connectionStatus == other.connectionStatus && providerDescription == other.providerDescription && providerId == other.providerId && providerType == other.providerType && providerUserInfo == other.providerUserInfo && scopes == other.scopes && userId == other.userId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, connectionId, connectionStatus, providerDescription, providerId, providerType, providerUserInfo, scopes, userId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UserConnectionResponse{id=$id, connectionId=$connectionId, connectionStatus=$connectionStatus, providerDescription=$providerDescription, providerId=$providerId, providerType=$providerType, providerUserInfo=$providerUserInfo, scopes=$scopes, userId=$userId, additionalProperties=$additionalProperties}"
}
