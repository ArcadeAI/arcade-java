// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models.tools

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

class AuthorizeToolRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val toolName: JsonField<String>,
    private val nextUri: JsonField<String>,
    private val toolVersion: JsonField<String>,
    private val userId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("tool_name") @ExcludeMissing toolName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("next_uri") @ExcludeMissing nextUri: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tool_version")
        @ExcludeMissing
        toolVersion: JsonField<String> = JsonMissing.of(),
        @JsonProperty("user_id") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
    ) : this(toolName, nextUri, toolVersion, userId, mutableMapOf())

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun toolName(): String = toolName.getRequired("tool_name")

    /**
     * Optional: if provided, the user will be redirected to this URI after authorization
     *
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun nextUri(): Optional<String> = nextUri.getOptional("next_uri")

    /**
     * Optional: if not provided, any version is used
     *
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun toolVersion(): Optional<String> = toolVersion.getOptional("tool_version")

    /**
     * Required only when calling with an API key
     *
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userId(): Optional<String> = userId.getOptional("user_id")

    /**
     * Returns the raw JSON value of [toolName].
     *
     * Unlike [toolName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tool_name") @ExcludeMissing fun _toolName(): JsonField<String> = toolName

    /**
     * Returns the raw JSON value of [nextUri].
     *
     * Unlike [nextUri], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("next_uri") @ExcludeMissing fun _nextUri(): JsonField<String> = nextUri

    /**
     * Returns the raw JSON value of [toolVersion].
     *
     * Unlike [toolVersion], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tool_version")
    @ExcludeMissing
    fun _toolVersion(): JsonField<String> = toolVersion

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

        /**
         * Returns a mutable builder for constructing an instance of [AuthorizeToolRequest].
         *
         * The following fields are required:
         * ```java
         * .toolName()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AuthorizeToolRequest]. */
    class Builder internal constructor() {

        private var toolName: JsonField<String>? = null
        private var nextUri: JsonField<String> = JsonMissing.of()
        private var toolVersion: JsonField<String> = JsonMissing.of()
        private var userId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(authorizeToolRequest: AuthorizeToolRequest) = apply {
            toolName = authorizeToolRequest.toolName
            nextUri = authorizeToolRequest.nextUri
            toolVersion = authorizeToolRequest.toolVersion
            userId = authorizeToolRequest.userId
            additionalProperties = authorizeToolRequest.additionalProperties.toMutableMap()
        }

        fun toolName(toolName: String) = toolName(JsonField.of(toolName))

        /**
         * Sets [Builder.toolName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.toolName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun toolName(toolName: JsonField<String>) = apply { this.toolName = toolName }

        /** Optional: if provided, the user will be redirected to this URI after authorization */
        fun nextUri(nextUri: String) = nextUri(JsonField.of(nextUri))

        /**
         * Sets [Builder.nextUri] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nextUri] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun nextUri(nextUri: JsonField<String>) = apply { this.nextUri = nextUri }

        /** Optional: if not provided, any version is used */
        fun toolVersion(toolVersion: String) = toolVersion(JsonField.of(toolVersion))

        /**
         * Sets [Builder.toolVersion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.toolVersion] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun toolVersion(toolVersion: JsonField<String>) = apply { this.toolVersion = toolVersion }

        /** Required only when calling with an API key */
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
         * Returns an immutable instance of [AuthorizeToolRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .toolName()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AuthorizeToolRequest =
            AuthorizeToolRequest(
                checkRequired("toolName", toolName),
                nextUri,
                toolVersion,
                userId,
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
    fun validate(): AuthorizeToolRequest = apply {
        if (validated) {
            return@apply
        }

        toolName()
        nextUri()
        toolVersion()
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
        (if (toolName.asKnown().isPresent) 1 else 0) +
            (if (nextUri.asKnown().isPresent) 1 else 0) +
            (if (toolVersion.asKnown().isPresent) 1 else 0) +
            (if (userId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AuthorizeToolRequest &&
            toolName == other.toolName &&
            nextUri == other.nextUri &&
            toolVersion == other.toolVersion &&
            userId == other.userId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(toolName, nextUri, toolVersion, userId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AuthorizeToolRequest{toolName=$toolName, nextUri=$nextUri, toolVersion=$toolVersion, userId=$userId, additionalProperties=$additionalProperties}"
}
