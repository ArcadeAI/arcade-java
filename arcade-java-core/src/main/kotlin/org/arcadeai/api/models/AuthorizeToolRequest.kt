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
class AuthorizeToolRequest
@JsonCreator
private constructor(
    @JsonProperty("tool_name")
    @ExcludeMissing
    private val toolName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("tool_version")
    @ExcludeMissing
    private val toolVersion: JsonField<String> = JsonMissing.of(),
    @JsonProperty("user_id")
    @ExcludeMissing
    private val userId: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun toolName(): String = toolName.getRequired("tool_name")

    /** Optional: if not provided, any version is used */
    fun toolVersion(): Optional<String> =
        Optional.ofNullable(toolVersion.getNullable("tool_version"))

    /** Required only when calling with an API key */
    fun userId(): Optional<String> = Optional.ofNullable(userId.getNullable("user_id"))

    @JsonProperty("tool_name") @ExcludeMissing fun _toolName(): JsonField<String> = toolName

    /** Optional: if not provided, any version is used */
    @JsonProperty("tool_version")
    @ExcludeMissing
    fun _toolVersion(): JsonField<String> = toolVersion

    /** Required only when calling with an API key */
    @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): AuthorizeToolRequest = apply {
        if (validated) {
            return@apply
        }

        toolName()
        toolVersion()
        userId()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AuthorizeToolRequest]. */
    class Builder internal constructor() {

        private var toolName: JsonField<String>? = null
        private var toolVersion: JsonField<String> = JsonMissing.of()
        private var userId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(authorizeToolRequest: AuthorizeToolRequest) = apply {
            toolName = authorizeToolRequest.toolName
            toolVersion = authorizeToolRequest.toolVersion
            userId = authorizeToolRequest.userId
            additionalProperties = authorizeToolRequest.additionalProperties.toMutableMap()
        }

        fun toolName(toolName: String) = toolName(JsonField.of(toolName))

        fun toolName(toolName: JsonField<String>) = apply { this.toolName = toolName }

        /** Optional: if not provided, any version is used */
        fun toolVersion(toolVersion: String) = toolVersion(JsonField.of(toolVersion))

        /** Optional: if not provided, any version is used */
        fun toolVersion(toolVersion: JsonField<String>) = apply { this.toolVersion = toolVersion }

        /** Required only when calling with an API key */
        fun userId(userId: String) = userId(JsonField.of(userId))

        /** Required only when calling with an API key */
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

        fun build(): AuthorizeToolRequest =
            AuthorizeToolRequest(
                checkRequired("toolName", toolName),
                toolVersion,
                userId,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AuthorizeToolRequest && toolName == other.toolName && toolVersion == other.toolVersion && userId == other.userId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(toolName, toolVersion, userId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AuthorizeToolRequest{toolName=$toolName, toolVersion=$toolVersion, userId=$userId, additionalProperties=$additionalProperties}"
}
