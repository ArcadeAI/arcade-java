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
class AuthorizationContext
@JsonCreator
private constructor(
    @JsonProperty("token") @ExcludeMissing private val token: JsonField<String> = JsonMissing.of(),
    @JsonProperty("user_info")
    @ExcludeMissing
    private val userInfo: JsonField<UserInfo> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun token(): Optional<String> = Optional.ofNullable(token.getNullable("token"))

    fun userInfo(): Optional<UserInfo> = Optional.ofNullable(userInfo.getNullable("user_info"))

    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    @JsonProperty("user_info") @ExcludeMissing fun _userInfo(): JsonField<UserInfo> = userInfo

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): AuthorizationContext = apply {
        if (validated) {
            return@apply
        }

        token()
        userInfo().ifPresent { it.validate() }
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AuthorizationContext]. */
    class Builder internal constructor() {

        private var token: JsonField<String> = JsonMissing.of()
        private var userInfo: JsonField<UserInfo> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(authorizationContext: AuthorizationContext) = apply {
            token = authorizationContext.token
            userInfo = authorizationContext.userInfo
            additionalProperties = authorizationContext.additionalProperties.toMutableMap()
        }

        fun token(token: String) = token(JsonField.of(token))

        fun token(token: JsonField<String>) = apply { this.token = token }

        fun userInfo(userInfo: UserInfo) = userInfo(JsonField.of(userInfo))

        fun userInfo(userInfo: JsonField<UserInfo>) = apply { this.userInfo = userInfo }

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

        fun build(): AuthorizationContext =
            AuthorizationContext(token, userInfo, additionalProperties.toImmutable())
    }

    @NoAutoDetect
    class UserInfo
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): UserInfo = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [UserInfo]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(userInfo: UserInfo) = apply {
                additionalProperties = userInfo.additionalProperties.toMutableMap()
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

            fun build(): UserInfo = UserInfo(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is UserInfo && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "UserInfo{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AuthorizationContext && token == other.token && userInfo == other.userInfo && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(token, userInfo, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AuthorizationContext{token=$token, userInfo=$userInfo, additionalProperties=$additionalProperties}"
}
