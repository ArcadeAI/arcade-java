// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.arcade.core.Enum
import dev.arcade.core.ExcludeMissing
import dev.arcade.core.JsonField
import dev.arcade.core.JsonMissing
import dev.arcade.core.JsonValue
import dev.arcade.core.NoAutoDetect
import dev.arcade.core.immutableEmptyMap
import dev.arcade.core.toImmutable
import dev.arcade.errors.ArcadeInvalidDataException
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class WorkerResponse
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("binding")
    @ExcludeMissing
    private val binding: JsonField<Binding> = JsonMissing.of(),
    @JsonProperty("enabled")
    @ExcludeMissing
    private val enabled: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("http") @ExcludeMissing private val http: JsonField<Http> = JsonMissing.of(),
    @JsonProperty("managed")
    @ExcludeMissing
    private val managed: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("mcp") @ExcludeMissing private val mcp: JsonField<Mcp> = JsonMissing.of(),
    @JsonProperty("requirements")
    @ExcludeMissing
    private val requirements: JsonField<Requirements> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): Optional<String> = Optional.ofNullable(id.getNullable("id"))

    fun binding(): Optional<Binding> = Optional.ofNullable(binding.getNullable("binding"))

    fun enabled(): Optional<Boolean> = Optional.ofNullable(enabled.getNullable("enabled"))

    fun http(): Optional<Http> = Optional.ofNullable(http.getNullable("http"))

    fun managed(): Optional<Boolean> = Optional.ofNullable(managed.getNullable("managed"))

    fun mcp(): Optional<Mcp> = Optional.ofNullable(mcp.getNullable("mcp"))

    fun requirements(): Optional<Requirements> =
        Optional.ofNullable(requirements.getNullable("requirements"))

    fun type(): Optional<Type> = Optional.ofNullable(type.getNullable("type"))

    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    @JsonProperty("binding") @ExcludeMissing fun _binding(): JsonField<Binding> = binding

    @JsonProperty("enabled") @ExcludeMissing fun _enabled(): JsonField<Boolean> = enabled

    @JsonProperty("http") @ExcludeMissing fun _http(): JsonField<Http> = http

    @JsonProperty("managed") @ExcludeMissing fun _managed(): JsonField<Boolean> = managed

    @JsonProperty("mcp") @ExcludeMissing fun _mcp(): JsonField<Mcp> = mcp

    @JsonProperty("requirements")
    @ExcludeMissing
    fun _requirements(): JsonField<Requirements> = requirements

    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): WorkerResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        binding().ifPresent { it.validate() }
        enabled()
        http().ifPresent { it.validate() }
        managed()
        mcp().ifPresent { it.validate() }
        requirements().ifPresent { it.validate() }
        type()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WorkerResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var binding: JsonField<Binding> = JsonMissing.of()
        private var enabled: JsonField<Boolean> = JsonMissing.of()
        private var http: JsonField<Http> = JsonMissing.of()
        private var managed: JsonField<Boolean> = JsonMissing.of()
        private var mcp: JsonField<Mcp> = JsonMissing.of()
        private var requirements: JsonField<Requirements> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(workerResponse: WorkerResponse) = apply {
            id = workerResponse.id
            binding = workerResponse.binding
            enabled = workerResponse.enabled
            http = workerResponse.http
            managed = workerResponse.managed
            mcp = workerResponse.mcp
            requirements = workerResponse.requirements
            type = workerResponse.type
            additionalProperties = workerResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        fun binding(binding: Binding) = binding(JsonField.of(binding))

        fun binding(binding: JsonField<Binding>) = apply { this.binding = binding }

        fun enabled(enabled: Boolean) = enabled(JsonField.of(enabled))

        fun enabled(enabled: JsonField<Boolean>) = apply { this.enabled = enabled }

        fun http(http: Http) = http(JsonField.of(http))

        fun http(http: JsonField<Http>) = apply { this.http = http }

        fun managed(managed: Boolean) = managed(JsonField.of(managed))

        fun managed(managed: JsonField<Boolean>) = apply { this.managed = managed }

        fun mcp(mcp: Mcp) = mcp(JsonField.of(mcp))

        fun mcp(mcp: JsonField<Mcp>) = apply { this.mcp = mcp }

        fun requirements(requirements: Requirements) = requirements(JsonField.of(requirements))

        fun requirements(requirements: JsonField<Requirements>) = apply {
            this.requirements = requirements
        }

        fun type(type: Type) = type(JsonField.of(type))

        fun type(type: JsonField<Type>) = apply { this.type = type }

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

        fun build(): WorkerResponse =
            WorkerResponse(
                id,
                binding,
                enabled,
                http,
                managed,
                mcp,
                requirements,
                type,
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class Binding
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): Optional<String> = Optional.ofNullable(id.getNullable("id"))

        fun type(): Optional<Type> = Optional.ofNullable(type.getNullable("type"))

        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Binding = apply {
            if (validated) {
                return@apply
            }

            id()
            type()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Binding]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(binding: Binding) = apply {
                id = binding.id
                type = binding.type
                additionalProperties = binding.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

            fun type(type: Type) = type(JsonField.of(type))

            fun type(type: JsonField<Type>) = apply { this.type = type }

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

            fun build(): Binding = Binding(id, type, additionalProperties.toImmutable())
        }

        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val STATIC = of("static")

                @JvmField val TENANT = of("tenant")

                @JvmField val PROJECT = of("project")

                @JvmField val ACCOUNT = of("account")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                STATIC,
                TENANT,
                PROJECT,
                ACCOUNT,
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                STATIC,
                TENANT,
                PROJECT,
                ACCOUNT,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                    STATIC -> Value.STATIC
                    TENANT -> Value.TENANT
                    PROJECT -> Value.PROJECT
                    ACCOUNT -> Value.ACCOUNT
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
                    STATIC -> Known.STATIC
                    TENANT -> Known.TENANT
                    PROJECT -> Known.PROJECT
                    ACCOUNT -> Known.ACCOUNT
                    else -> throw ArcadeInvalidDataException("Unknown Type: $value")
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

                return /* spotless:off */ other is Type && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Binding && id == other.id && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Binding{id=$id, type=$type, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class Http
    @JsonCreator
    private constructor(
        @JsonProperty("retry")
        @ExcludeMissing
        private val retry: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("secret")
        @ExcludeMissing
        private val secret: JsonField<Secret> = JsonMissing.of(),
        @JsonProperty("timeout")
        @ExcludeMissing
        private val timeout: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("uri") @ExcludeMissing private val uri: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun retry(): Optional<Long> = Optional.ofNullable(retry.getNullable("retry"))

        fun secret(): Optional<Secret> = Optional.ofNullable(secret.getNullable("secret"))

        fun timeout(): Optional<Long> = Optional.ofNullable(timeout.getNullable("timeout"))

        fun uri(): Optional<String> = Optional.ofNullable(uri.getNullable("uri"))

        @JsonProperty("retry") @ExcludeMissing fun _retry(): JsonField<Long> = retry

        @JsonProperty("secret") @ExcludeMissing fun _secret(): JsonField<Secret> = secret

        @JsonProperty("timeout") @ExcludeMissing fun _timeout(): JsonField<Long> = timeout

        @JsonProperty("uri") @ExcludeMissing fun _uri(): JsonField<String> = uri

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Http = apply {
            if (validated) {
                return@apply
            }

            retry()
            secret().ifPresent { it.validate() }
            timeout()
            uri()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Http]. */
        class Builder internal constructor() {

            private var retry: JsonField<Long> = JsonMissing.of()
            private var secret: JsonField<Secret> = JsonMissing.of()
            private var timeout: JsonField<Long> = JsonMissing.of()
            private var uri: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(http: Http) = apply {
                retry = http.retry
                secret = http.secret
                timeout = http.timeout
                uri = http.uri
                additionalProperties = http.additionalProperties.toMutableMap()
            }

            fun retry(retry: Long) = retry(JsonField.of(retry))

            fun retry(retry: JsonField<Long>) = apply { this.retry = retry }

            fun secret(secret: Secret) = secret(JsonField.of(secret))

            fun secret(secret: JsonField<Secret>) = apply { this.secret = secret }

            fun timeout(timeout: Long) = timeout(JsonField.of(timeout))

            fun timeout(timeout: JsonField<Long>) = apply { this.timeout = timeout }

            fun uri(uri: String) = uri(JsonField.of(uri))

            fun uri(uri: JsonField<String>) = apply { this.uri = uri }

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

            fun build(): Http =
                Http(retry, secret, timeout, uri, additionalProperties.toImmutable())
        }

        @NoAutoDetect
        class Secret
        @JsonCreator
        private constructor(
            @JsonProperty("binding")
            @ExcludeMissing
            private val binding: JsonField<Binding> = JsonMissing.of(),
            @JsonProperty("editable")
            @ExcludeMissing
            private val editable: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("exists")
            @ExcludeMissing
            private val exists: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("hint")
            @ExcludeMissing
            private val hint: JsonField<String> = JsonMissing.of(),
            @JsonProperty("value")
            @ExcludeMissing
            private val value: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun binding(): Optional<Binding> = Optional.ofNullable(binding.getNullable("binding"))

            fun editable(): Optional<Boolean> =
                Optional.ofNullable(editable.getNullable("editable"))

            fun exists(): Optional<Boolean> = Optional.ofNullable(exists.getNullable("exists"))

            fun hint(): Optional<String> = Optional.ofNullable(hint.getNullable("hint"))

            fun value(): Optional<String> = Optional.ofNullable(value.getNullable("value"))

            @JsonProperty("binding") @ExcludeMissing fun _binding(): JsonField<Binding> = binding

            @JsonProperty("editable") @ExcludeMissing fun _editable(): JsonField<Boolean> = editable

            @JsonProperty("exists") @ExcludeMissing fun _exists(): JsonField<Boolean> = exists

            @JsonProperty("hint") @ExcludeMissing fun _hint(): JsonField<String> = hint

            @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Secret = apply {
                if (validated) {
                    return@apply
                }

                binding()
                editable()
                exists()
                hint()
                value()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Secret]. */
            class Builder internal constructor() {

                private var binding: JsonField<Binding> = JsonMissing.of()
                private var editable: JsonField<Boolean> = JsonMissing.of()
                private var exists: JsonField<Boolean> = JsonMissing.of()
                private var hint: JsonField<String> = JsonMissing.of()
                private var value: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(secret: Secret) = apply {
                    binding = secret.binding
                    editable = secret.editable
                    exists = secret.exists
                    hint = secret.hint
                    value = secret.value
                    additionalProperties = secret.additionalProperties.toMutableMap()
                }

                fun binding(binding: Binding) = binding(JsonField.of(binding))

                fun binding(binding: JsonField<Binding>) = apply { this.binding = binding }

                fun editable(editable: Boolean) = editable(JsonField.of(editable))

                fun editable(editable: JsonField<Boolean>) = apply { this.editable = editable }

                fun exists(exists: Boolean) = exists(JsonField.of(exists))

                fun exists(exists: JsonField<Boolean>) = apply { this.exists = exists }

                fun hint(hint: String) = hint(JsonField.of(hint))

                fun hint(hint: JsonField<String>) = apply { this.hint = hint }

                fun value(value: String) = value(JsonField.of(value))

                fun value(value: JsonField<String>) = apply { this.value = value }

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

                fun build(): Secret =
                    Secret(
                        binding,
                        editable,
                        exists,
                        hint,
                        value,
                        additionalProperties.toImmutable(),
                    )
            }

            class Binding @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

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

                    @JvmField val STATIC = of("static")

                    @JvmField val TENANT = of("tenant")

                    @JvmField val PROJECT = of("project")

                    @JvmField val ACCOUNT = of("account")

                    @JvmStatic fun of(value: String) = Binding(JsonField.of(value))
                }

                /** An enum containing [Binding]'s known values. */
                enum class Known {
                    STATIC,
                    TENANT,
                    PROJECT,
                    ACCOUNT,
                }

                /**
                 * An enum containing [Binding]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Binding] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    STATIC,
                    TENANT,
                    PROJECT,
                    ACCOUNT,
                    /**
                     * An enum member indicating that [Binding] was instantiated with an unknown
                     * value.
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
                        STATIC -> Value.STATIC
                        TENANT -> Value.TENANT
                        PROJECT -> Value.PROJECT
                        ACCOUNT -> Value.ACCOUNT
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
                        STATIC -> Known.STATIC
                        TENANT -> Known.TENANT
                        PROJECT -> Known.PROJECT
                        ACCOUNT -> Known.ACCOUNT
                        else -> throw ArcadeInvalidDataException("Unknown Binding: $value")
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

                    return /* spotless:off */ other is Binding && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Secret && binding == other.binding && editable == other.editable && exists == other.exists && hint == other.hint && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(binding, editable, exists, hint, value, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Secret{binding=$binding, editable=$editable, exists=$exists, hint=$hint, value=$value, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Http && retry == other.retry && secret == other.secret && timeout == other.timeout && uri == other.uri && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(retry, secret, timeout, uri, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Http{retry=$retry, secret=$secret, timeout=$timeout, uri=$uri, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class Mcp
    @JsonCreator
    private constructor(
        @JsonProperty("headers")
        @ExcludeMissing
        private val headers: JsonField<Headers> = JsonMissing.of(),
        @JsonProperty("oauth2")
        @ExcludeMissing
        private val oauth2: JsonField<Oauth2> = JsonMissing.of(),
        @JsonProperty("retry")
        @ExcludeMissing
        private val retry: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("secrets")
        @ExcludeMissing
        private val secrets: JsonField<Secrets> = JsonMissing.of(),
        @JsonProperty("timeout")
        @ExcludeMissing
        private val timeout: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("uri") @ExcludeMissing private val uri: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun headers(): Optional<Headers> = Optional.ofNullable(headers.getNullable("headers"))

        fun oauth2(): Optional<Oauth2> = Optional.ofNullable(oauth2.getNullable("oauth2"))

        fun retry(): Optional<Long> = Optional.ofNullable(retry.getNullable("retry"))

        fun secrets(): Optional<Secrets> = Optional.ofNullable(secrets.getNullable("secrets"))

        fun timeout(): Optional<Long> = Optional.ofNullable(timeout.getNullable("timeout"))

        fun uri(): Optional<String> = Optional.ofNullable(uri.getNullable("uri"))

        @JsonProperty("headers") @ExcludeMissing fun _headers(): JsonField<Headers> = headers

        @JsonProperty("oauth2") @ExcludeMissing fun _oauth2(): JsonField<Oauth2> = oauth2

        @JsonProperty("retry") @ExcludeMissing fun _retry(): JsonField<Long> = retry

        @JsonProperty("secrets") @ExcludeMissing fun _secrets(): JsonField<Secrets> = secrets

        @JsonProperty("timeout") @ExcludeMissing fun _timeout(): JsonField<Long> = timeout

        @JsonProperty("uri") @ExcludeMissing fun _uri(): JsonField<String> = uri

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Mcp = apply {
            if (validated) {
                return@apply
            }

            headers().ifPresent { it.validate() }
            oauth2().ifPresent { it.validate() }
            retry()
            secrets().ifPresent { it.validate() }
            timeout()
            uri()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Mcp]. */
        class Builder internal constructor() {

            private var headers: JsonField<Headers> = JsonMissing.of()
            private var oauth2: JsonField<Oauth2> = JsonMissing.of()
            private var retry: JsonField<Long> = JsonMissing.of()
            private var secrets: JsonField<Secrets> = JsonMissing.of()
            private var timeout: JsonField<Long> = JsonMissing.of()
            private var uri: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(mcp: Mcp) = apply {
                headers = mcp.headers
                oauth2 = mcp.oauth2
                retry = mcp.retry
                secrets = mcp.secrets
                timeout = mcp.timeout
                uri = mcp.uri
                additionalProperties = mcp.additionalProperties.toMutableMap()
            }

            fun headers(headers: Headers) = headers(JsonField.of(headers))

            fun headers(headers: JsonField<Headers>) = apply { this.headers = headers }

            fun oauth2(oauth2: Oauth2) = oauth2(JsonField.of(oauth2))

            fun oauth2(oauth2: JsonField<Oauth2>) = apply { this.oauth2 = oauth2 }

            fun retry(retry: Long) = retry(JsonField.of(retry))

            fun retry(retry: JsonField<Long>) = apply { this.retry = retry }

            fun secrets(secrets: Secrets) = secrets(JsonField.of(secrets))

            fun secrets(secrets: JsonField<Secrets>) = apply { this.secrets = secrets }

            fun timeout(timeout: Long) = timeout(JsonField.of(timeout))

            fun timeout(timeout: JsonField<Long>) = apply { this.timeout = timeout }

            fun uri(uri: String) = uri(JsonField.of(uri))

            fun uri(uri: JsonField<String>) = apply { this.uri = uri }

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

            fun build(): Mcp =
                Mcp(
                    headers,
                    oauth2,
                    retry,
                    secrets,
                    timeout,
                    uri,
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class Headers
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Headers = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Headers]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(headers: Headers) = apply {
                    additionalProperties = headers.additionalProperties.toMutableMap()
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

                fun build(): Headers = Headers(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Headers && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Headers{additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class Oauth2
        @JsonCreator
        private constructor(
            @JsonProperty("authorization_url")
            @ExcludeMissing
            private val authorizationUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("client_id")
            @ExcludeMissing
            private val clientId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("client_secret")
            @ExcludeMissing
            private val clientSecret: JsonField<ClientSecret> = JsonMissing.of(),
            @JsonProperty("redirect_uri")
            @ExcludeMissing
            private val redirectUri: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun authorizationUrl(): Optional<String> =
                Optional.ofNullable(authorizationUrl.getNullable("authorization_url"))

            fun clientId(): Optional<String> =
                Optional.ofNullable(clientId.getNullable("client_id"))

            fun clientSecret(): Optional<ClientSecret> =
                Optional.ofNullable(clientSecret.getNullable("client_secret"))

            fun redirectUri(): Optional<String> =
                Optional.ofNullable(redirectUri.getNullable("redirect_uri"))

            @JsonProperty("authorization_url")
            @ExcludeMissing
            fun _authorizationUrl(): JsonField<String> = authorizationUrl

            @JsonProperty("client_id") @ExcludeMissing fun _clientId(): JsonField<String> = clientId

            @JsonProperty("client_secret")
            @ExcludeMissing
            fun _clientSecret(): JsonField<ClientSecret> = clientSecret

            @JsonProperty("redirect_uri")
            @ExcludeMissing
            fun _redirectUri(): JsonField<String> = redirectUri

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Oauth2 = apply {
                if (validated) {
                    return@apply
                }

                authorizationUrl()
                clientId()
                clientSecret().ifPresent { it.validate() }
                redirectUri()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Oauth2]. */
            class Builder internal constructor() {

                private var authorizationUrl: JsonField<String> = JsonMissing.of()
                private var clientId: JsonField<String> = JsonMissing.of()
                private var clientSecret: JsonField<ClientSecret> = JsonMissing.of()
                private var redirectUri: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(oauth2: Oauth2) = apply {
                    authorizationUrl = oauth2.authorizationUrl
                    clientId = oauth2.clientId
                    clientSecret = oauth2.clientSecret
                    redirectUri = oauth2.redirectUri
                    additionalProperties = oauth2.additionalProperties.toMutableMap()
                }

                fun authorizationUrl(authorizationUrl: String) =
                    authorizationUrl(JsonField.of(authorizationUrl))

                fun authorizationUrl(authorizationUrl: JsonField<String>) = apply {
                    this.authorizationUrl = authorizationUrl
                }

                fun clientId(clientId: String) = clientId(JsonField.of(clientId))

                fun clientId(clientId: JsonField<String>) = apply { this.clientId = clientId }

                fun clientSecret(clientSecret: ClientSecret) =
                    clientSecret(JsonField.of(clientSecret))

                fun clientSecret(clientSecret: JsonField<ClientSecret>) = apply {
                    this.clientSecret = clientSecret
                }

                fun redirectUri(redirectUri: String) = redirectUri(JsonField.of(redirectUri))

                fun redirectUri(redirectUri: JsonField<String>) = apply {
                    this.redirectUri = redirectUri
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
                        authorizationUrl,
                        clientId,
                        clientSecret,
                        redirectUri,
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class ClientSecret
            @JsonCreator
            private constructor(
                @JsonProperty("binding")
                @ExcludeMissing
                private val binding: JsonField<Binding> = JsonMissing.of(),
                @JsonProperty("editable")
                @ExcludeMissing
                private val editable: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("exists")
                @ExcludeMissing
                private val exists: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("hint")
                @ExcludeMissing
                private val hint: JsonField<String> = JsonMissing.of(),
                @JsonProperty("value")
                @ExcludeMissing
                private val value: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun binding(): Optional<Binding> =
                    Optional.ofNullable(binding.getNullable("binding"))

                fun editable(): Optional<Boolean> =
                    Optional.ofNullable(editable.getNullable("editable"))

                fun exists(): Optional<Boolean> = Optional.ofNullable(exists.getNullable("exists"))

                fun hint(): Optional<String> = Optional.ofNullable(hint.getNullable("hint"))

                fun value(): Optional<String> = Optional.ofNullable(value.getNullable("value"))

                @JsonProperty("binding")
                @ExcludeMissing
                fun _binding(): JsonField<Binding> = binding

                @JsonProperty("editable")
                @ExcludeMissing
                fun _editable(): JsonField<Boolean> = editable

                @JsonProperty("exists") @ExcludeMissing fun _exists(): JsonField<Boolean> = exists

                @JsonProperty("hint") @ExcludeMissing fun _hint(): JsonField<String> = hint

                @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): ClientSecret = apply {
                    if (validated) {
                        return@apply
                    }

                    binding()
                    editable()
                    exists()
                    hint()
                    value()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [ClientSecret]. */
                class Builder internal constructor() {

                    private var binding: JsonField<Binding> = JsonMissing.of()
                    private var editable: JsonField<Boolean> = JsonMissing.of()
                    private var exists: JsonField<Boolean> = JsonMissing.of()
                    private var hint: JsonField<String> = JsonMissing.of()
                    private var value: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(clientSecret: ClientSecret) = apply {
                        binding = clientSecret.binding
                        editable = clientSecret.editable
                        exists = clientSecret.exists
                        hint = clientSecret.hint
                        value = clientSecret.value
                        additionalProperties = clientSecret.additionalProperties.toMutableMap()
                    }

                    fun binding(binding: Binding) = binding(JsonField.of(binding))

                    fun binding(binding: JsonField<Binding>) = apply { this.binding = binding }

                    fun editable(editable: Boolean) = editable(JsonField.of(editable))

                    fun editable(editable: JsonField<Boolean>) = apply { this.editable = editable }

                    fun exists(exists: Boolean) = exists(JsonField.of(exists))

                    fun exists(exists: JsonField<Boolean>) = apply { this.exists = exists }

                    fun hint(hint: String) = hint(JsonField.of(hint))

                    fun hint(hint: JsonField<String>) = apply { this.hint = hint }

                    fun value(value: String) = value(JsonField.of(value))

                    fun value(value: JsonField<String>) = apply { this.value = value }

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

                    fun build(): ClientSecret =
                        ClientSecret(
                            binding,
                            editable,
                            exists,
                            hint,
                            value,
                            additionalProperties.toImmutable(),
                        )
                }

                class Binding
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val STATIC = of("static")

                        @JvmField val TENANT = of("tenant")

                        @JvmField val PROJECT = of("project")

                        @JvmField val ACCOUNT = of("account")

                        @JvmStatic fun of(value: String) = Binding(JsonField.of(value))
                    }

                    /** An enum containing [Binding]'s known values. */
                    enum class Known {
                        STATIC,
                        TENANT,
                        PROJECT,
                        ACCOUNT,
                    }

                    /**
                     * An enum containing [Binding]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Binding] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        STATIC,
                        TENANT,
                        PROJECT,
                        ACCOUNT,
                        /**
                         * An enum member indicating that [Binding] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            STATIC -> Value.STATIC
                            TENANT -> Value.TENANT
                            PROJECT -> Value.PROJECT
                            ACCOUNT -> Value.ACCOUNT
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws ArcadeInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            STATIC -> Known.STATIC
                            TENANT -> Known.TENANT
                            PROJECT -> Known.PROJECT
                            ACCOUNT -> Known.ACCOUNT
                            else -> throw ArcadeInvalidDataException("Unknown Binding: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws ArcadeInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            ArcadeInvalidDataException("Value is not a String")
                        }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Binding && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ClientSecret && binding == other.binding && editable == other.editable && exists == other.exists && hint == other.hint && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(binding, editable, exists, hint, value, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ClientSecret{binding=$binding, editable=$editable, exists=$exists, hint=$hint, value=$value, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Oauth2 && authorizationUrl == other.authorizationUrl && clientId == other.clientId && clientSecret == other.clientSecret && redirectUri == other.redirectUri && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(authorizationUrl, clientId, clientSecret, redirectUri, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Oauth2{authorizationUrl=$authorizationUrl, clientId=$clientId, clientSecret=$clientSecret, redirectUri=$redirectUri, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class Secrets
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Secrets = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Secrets]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(secrets: Secrets) = apply {
                    additionalProperties = secrets.additionalProperties.toMutableMap()
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

                fun build(): Secrets = Secrets(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Secrets && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Secrets{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Mcp && headers == other.headers && oauth2 == other.oauth2 && retry == other.retry && secrets == other.secrets && timeout == other.timeout && uri == other.uri && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(headers, oauth2, retry, secrets, timeout, uri, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Mcp{headers=$headers, oauth2=$oauth2, retry=$retry, secrets=$secrets, timeout=$timeout, uri=$uri, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class Requirements
    @JsonCreator
    private constructor(
        @JsonProperty("authorization")
        @ExcludeMissing
        private val authorization: JsonField<Authorization> = JsonMissing.of(),
        @JsonProperty("met") @ExcludeMissing private val met: JsonField<Boolean> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun authorization(): Optional<Authorization> =
            Optional.ofNullable(authorization.getNullable("authorization"))

        fun met(): Optional<Boolean> = Optional.ofNullable(met.getNullable("met"))

        @JsonProperty("authorization")
        @ExcludeMissing
        fun _authorization(): JsonField<Authorization> = authorization

        @JsonProperty("met") @ExcludeMissing fun _met(): JsonField<Boolean> = met

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Requirements = apply {
            if (validated) {
                return@apply
            }

            authorization().ifPresent { it.validate() }
            met()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Requirements]. */
        class Builder internal constructor() {

            private var authorization: JsonField<Authorization> = JsonMissing.of()
            private var met: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(requirements: Requirements) = apply {
                authorization = requirements.authorization
                met = requirements.met
                additionalProperties = requirements.additionalProperties.toMutableMap()
            }

            fun authorization(authorization: Authorization) =
                authorization(JsonField.of(authorization))

            fun authorization(authorization: JsonField<Authorization>) = apply {
                this.authorization = authorization
            }

            fun met(met: Boolean) = met(JsonField.of(met))

            fun met(met: JsonField<Boolean>) = apply { this.met = met }

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

            fun build(): Requirements =
                Requirements(authorization, met, additionalProperties.toImmutable())
        }

        @NoAutoDetect
        class Authorization
        @JsonCreator
        private constructor(
            @JsonProperty("met")
            @ExcludeMissing
            private val met: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("oauth2")
            @ExcludeMissing
            private val oauth2: JsonField<Oauth2> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun met(): Optional<Boolean> = Optional.ofNullable(met.getNullable("met"))

            fun oauth2(): Optional<Oauth2> = Optional.ofNullable(oauth2.getNullable("oauth2"))

            @JsonProperty("met") @ExcludeMissing fun _met(): JsonField<Boolean> = met

            @JsonProperty("oauth2") @ExcludeMissing fun _oauth2(): JsonField<Oauth2> = oauth2

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Authorization = apply {
                if (validated) {
                    return@apply
                }

                met()
                oauth2().ifPresent { it.validate() }
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Authorization]. */
            class Builder internal constructor() {

                private var met: JsonField<Boolean> = JsonMissing.of()
                private var oauth2: JsonField<Oauth2> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(authorization: Authorization) = apply {
                    met = authorization.met
                    oauth2 = authorization.oauth2
                    additionalProperties = authorization.additionalProperties.toMutableMap()
                }

                fun met(met: Boolean) = met(JsonField.of(met))

                fun met(met: JsonField<Boolean>) = apply { this.met = met }

                fun oauth2(oauth2: Oauth2) = oauth2(JsonField.of(oauth2))

                fun oauth2(oauth2: JsonField<Oauth2>) = apply { this.oauth2 = oauth2 }

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

                fun build(): Authorization =
                    Authorization(met, oauth2, additionalProperties.toImmutable())
            }

            @NoAutoDetect
            class Oauth2
            @JsonCreator
            private constructor(
                @JsonProperty("met")
                @ExcludeMissing
                private val met: JsonField<Boolean> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun met(): Optional<Boolean> = Optional.ofNullable(met.getNullable("met"))

                @JsonProperty("met") @ExcludeMissing fun _met(): JsonField<Boolean> = met

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Oauth2 = apply {
                    if (validated) {
                        return@apply
                    }

                    met()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Oauth2]. */
                class Builder internal constructor() {

                    private var met: JsonField<Boolean> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(oauth2: Oauth2) = apply {
                        met = oauth2.met
                        additionalProperties = oauth2.additionalProperties.toMutableMap()
                    }

                    fun met(met: Boolean) = met(JsonField.of(met))

                    fun met(met: JsonField<Boolean>) = apply { this.met = met }

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

                    fun build(): Oauth2 = Oauth2(met, additionalProperties.toImmutable())
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Oauth2 && met == other.met && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(met, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Oauth2{met=$met, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Authorization && met == other.met && oauth2 == other.oauth2 && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(met, oauth2, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Authorization{met=$met, oauth2=$oauth2, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Requirements && authorization == other.authorization && met == other.met && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(authorization, met, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Requirements{authorization=$authorization, met=$met, additionalProperties=$additionalProperties}"
    }

    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val HTTP = of("http")

            @JvmField val MCP = of("mcp")

            @JvmField val UNKNOWN = of("unknown")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            HTTP,
            MCP,
            UNKNOWN,
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            HTTP,
            MCP,
            UNKNOWN,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                HTTP -> Value.HTTP
                MCP -> Value.MCP
                UNKNOWN -> Value.UNKNOWN
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws ArcadeInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                HTTP -> Known.HTTP
                MCP -> Known.MCP
                UNKNOWN -> Known.UNKNOWN
                else -> throw ArcadeInvalidDataException("Unknown Type: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws ArcadeInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { ArcadeInvalidDataException("Value is not a String") }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is WorkerResponse && id == other.id && binding == other.binding && enabled == other.enabled && http == other.http && managed == other.managed && mcp == other.mcp && requirements == other.requirements && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, binding, enabled, http, managed, mcp, requirements, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "WorkerResponse{id=$id, binding=$binding, enabled=$enabled, http=$http, managed=$managed, mcp=$mcp, requirements=$requirements, type=$type, additionalProperties=$additionalProperties}"
}
