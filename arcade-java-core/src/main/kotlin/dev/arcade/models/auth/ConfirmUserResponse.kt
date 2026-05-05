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
import dev.arcade.core.checkRequired
import dev.arcade.errors.ArcadeInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

class ConfirmUserResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val authId: JsonField<String>,
    private val nextUri: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("auth_id") @ExcludeMissing authId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("next_uri") @ExcludeMissing nextUri: JsonField<String> = JsonMissing.of(),
    ) : this(authId, nextUri, mutableMapOf())

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun authId(): String = authId.getRequired("auth_id")

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun nextUri(): Optional<String> = nextUri.getOptional("next_uri")

    /**
     * Returns the raw JSON value of [authId].
     *
     * Unlike [authId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("auth_id") @ExcludeMissing fun _authId(): JsonField<String> = authId

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
         * Returns a mutable builder for constructing an instance of [ConfirmUserResponse].
         *
         * The following fields are required:
         * ```java
         * .authId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ConfirmUserResponse]. */
    class Builder internal constructor() {

        private var authId: JsonField<String>? = null
        private var nextUri: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(confirmUserResponse: ConfirmUserResponse) = apply {
            authId = confirmUserResponse.authId
            nextUri = confirmUserResponse.nextUri
            additionalProperties = confirmUserResponse.additionalProperties.toMutableMap()
        }

        fun authId(authId: String) = authId(JsonField.of(authId))

        /**
         * Sets [Builder.authId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun authId(authId: JsonField<String>) = apply { this.authId = authId }

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
         * Returns an immutable instance of [ConfirmUserResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .authId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ConfirmUserResponse =
            ConfirmUserResponse(
                checkRequired("authId", authId),
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
    fun validate(): ConfirmUserResponse = apply {
        if (validated) {
            return@apply
        }

        authId()
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
        (if (authId.asKnown().isPresent) 1 else 0) + (if (nextUri.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ConfirmUserResponse &&
            authId == other.authId &&
            nextUri == other.nextUri &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(authId, nextUri, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ConfirmUserResponse{authId=$authId, nextUri=$nextUri, additionalProperties=$additionalProperties}"
}
