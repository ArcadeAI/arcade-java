// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models.admin.userconnections

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.arcade.core.ExcludeMissing
import dev.arcade.core.JsonField
import dev.arcade.core.JsonMissing
import dev.arcade.core.JsonValue
import dev.arcade.core.checkKnown
import dev.arcade.core.toImmutable
import dev.arcade.errors.ArcadeInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class UserConnectionResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val connectionId: JsonField<String>,
    private val connectionStatus: JsonField<String>,
    private val providerDescription: JsonField<String>,
    private val providerId: JsonField<String>,
    private val providerType: JsonField<String>,
    private val providerUserInfo: JsonValue,
    private val scopes: JsonField<List<String>>,
    private val userId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("connection_id")
        @ExcludeMissing
        connectionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("connection_status")
        @ExcludeMissing
        connectionStatus: JsonField<String> = JsonMissing.of(),
        @JsonProperty("provider_description")
        @ExcludeMissing
        providerDescription: JsonField<String> = JsonMissing.of(),
        @JsonProperty("provider_id")
        @ExcludeMissing
        providerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("provider_type")
        @ExcludeMissing
        providerType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("provider_user_info")
        @ExcludeMissing
        providerUserInfo: JsonValue = JsonMissing.of(),
        @JsonProperty("scopes") @ExcludeMissing scopes: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("user_id") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        connectionId,
        connectionStatus,
        providerDescription,
        providerId,
        providerType,
        providerUserInfo,
        scopes,
        userId,
        mutableMapOf(),
    )

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun connectionId(): Optional<String> = connectionId.getOptional("connection_id")

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun connectionStatus(): Optional<String> = connectionStatus.getOptional("connection_status")

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun providerDescription(): Optional<String> =
        providerDescription.getOptional("provider_description")

    /**
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
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = userConnectionResponse.providerUserInfo().convert(MyClass.class);
     * ```
     */
    @JsonProperty("provider_user_info")
    @ExcludeMissing
    fun _providerUserInfo(): JsonValue = providerUserInfo

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun scopes(): Optional<List<String>> = scopes.getOptional("scopes")

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userId(): Optional<String> = userId.getOptional("user_id")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [connectionId].
     *
     * Unlike [connectionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("connection_id")
    @ExcludeMissing
    fun _connectionId(): JsonField<String> = connectionId

    /**
     * Returns the raw JSON value of [connectionStatus].
     *
     * Unlike [connectionStatus], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("connection_status")
    @ExcludeMissing
    fun _connectionStatus(): JsonField<String> = connectionStatus

    /**
     * Returns the raw JSON value of [providerDescription].
     *
     * Unlike [providerDescription], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("provider_description")
    @ExcludeMissing
    fun _providerDescription(): JsonField<String> = providerDescription

    /**
     * Returns the raw JSON value of [providerId].
     *
     * Unlike [providerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("provider_id") @ExcludeMissing fun _providerId(): JsonField<String> = providerId

    /**
     * Returns the raw JSON value of [providerType].
     *
     * Unlike [providerType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("provider_type")
    @ExcludeMissing
    fun _providerType(): JsonField<String> = providerType

    /**
     * Returns the raw JSON value of [scopes].
     *
     * Unlike [scopes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("scopes") @ExcludeMissing fun _scopes(): JsonField<List<String>> = scopes

    /**
     * Returns the raw JSON value of [userId].
     *
     * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

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

        /** Returns a mutable builder for constructing an instance of [UserConnectionResponse]. */
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

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun connectionId(connectionId: String) = connectionId(JsonField.of(connectionId))

        /**
         * Sets [Builder.connectionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.connectionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun connectionId(connectionId: JsonField<String>) = apply {
            this.connectionId = connectionId
        }

        fun connectionStatus(connectionStatus: String) =
            connectionStatus(JsonField.of(connectionStatus))

        /**
         * Sets [Builder.connectionStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.connectionStatus] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun connectionStatus(connectionStatus: JsonField<String>) = apply {
            this.connectionStatus = connectionStatus
        }

        fun providerDescription(providerDescription: String) =
            providerDescription(JsonField.of(providerDescription))

        /**
         * Sets [Builder.providerDescription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.providerDescription] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun providerDescription(providerDescription: JsonField<String>) = apply {
            this.providerDescription = providerDescription
        }

        fun providerId(providerId: String) = providerId(JsonField.of(providerId))

        /**
         * Sets [Builder.providerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.providerId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun providerId(providerId: JsonField<String>) = apply { this.providerId = providerId }

        fun providerType(providerType: String) = providerType(JsonField.of(providerType))

        /**
         * Sets [Builder.providerType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.providerType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun providerType(providerType: JsonField<String>) = apply {
            this.providerType = providerType
        }

        fun providerUserInfo(providerUserInfo: JsonValue) = apply {
            this.providerUserInfo = providerUserInfo
        }

        fun scopes(scopes: List<String>) = scopes(JsonField.of(scopes))

        /**
         * Sets [Builder.scopes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scopes] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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

        fun userId(userId: String) = userId(JsonField.of(userId))

        /**
         * Sets [Builder.userId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
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

        /**
         * Returns an immutable instance of [UserConnectionResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
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
                additionalProperties.toMutableMap(),
            )
    }

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
            (if (connectionId.asKnown().isPresent) 1 else 0) +
            (if (connectionStatus.asKnown().isPresent) 1 else 0) +
            (if (providerDescription.asKnown().isPresent) 1 else 0) +
            (if (providerId.asKnown().isPresent) 1 else 0) +
            (if (providerType.asKnown().isPresent) 1 else 0) +
            (scopes.asKnown().getOrNull()?.size ?: 0) +
            (if (userId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UserConnectionResponse &&
            id == other.id &&
            connectionId == other.connectionId &&
            connectionStatus == other.connectionStatus &&
            providerDescription == other.providerDescription &&
            providerId == other.providerId &&
            providerType == other.providerType &&
            providerUserInfo == other.providerUserInfo &&
            scopes == other.scopes &&
            userId == other.userId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            connectionId,
            connectionStatus,
            providerDescription,
            providerId,
            providerType,
            providerUserInfo,
            scopes,
            userId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UserConnectionResponse{id=$id, connectionId=$connectionId, connectionStatus=$connectionStatus, providerDescription=$providerDescription, providerId=$providerId, providerType=$providerType, providerUserInfo=$providerUserInfo, scopes=$scopes, userId=$userId, additionalProperties=$additionalProperties}"
}
