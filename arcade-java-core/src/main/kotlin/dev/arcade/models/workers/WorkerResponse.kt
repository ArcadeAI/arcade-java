// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models.workers

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.arcade.core.Enum
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

class WorkerResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val binding: JsonField<Binding>,
    private val enabled: JsonField<Boolean>,
    private val http: JsonField<Http>,
    private val managed: JsonField<Boolean>,
    private val mcp: JsonField<Mcp>,
    private val requirements: JsonField<Requirements>,
    private val type: JsonField<Type>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("binding") @ExcludeMissing binding: JsonField<Binding> = JsonMissing.of(),
        @JsonProperty("enabled") @ExcludeMissing enabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("http") @ExcludeMissing http: JsonField<Http> = JsonMissing.of(),
        @JsonProperty("managed") @ExcludeMissing managed: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("mcp") @ExcludeMissing mcp: JsonField<Mcp> = JsonMissing.of(),
        @JsonProperty("requirements")
        @ExcludeMissing
        requirements: JsonField<Requirements> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
    ) : this(id, binding, enabled, http, managed, mcp, requirements, type, mutableMapOf())

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun binding(): Optional<Binding> = binding.getOptional("binding")

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enabled(): Optional<Boolean> = enabled.getOptional("enabled")

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun http(): Optional<Http> = http.getOptional("http")

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun managed(): Optional<Boolean> = managed.getOptional("managed")

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mcp(): Optional<Mcp> = mcp.getOptional("mcp")

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun requirements(): Optional<Requirements> = requirements.getOptional("requirements")

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun type(): Optional<Type> = type.getOptional("type")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [binding].
     *
     * Unlike [binding], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("binding") @ExcludeMissing fun _binding(): JsonField<Binding> = binding

    /**
     * Returns the raw JSON value of [enabled].
     *
     * Unlike [enabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("enabled") @ExcludeMissing fun _enabled(): JsonField<Boolean> = enabled

    /**
     * Returns the raw JSON value of [http].
     *
     * Unlike [http], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("http") @ExcludeMissing fun _http(): JsonField<Http> = http

    /**
     * Returns the raw JSON value of [managed].
     *
     * Unlike [managed], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("managed") @ExcludeMissing fun _managed(): JsonField<Boolean> = managed

    /**
     * Returns the raw JSON value of [mcp].
     *
     * Unlike [mcp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mcp") @ExcludeMissing fun _mcp(): JsonField<Mcp> = mcp

    /**
     * Returns the raw JSON value of [requirements].
     *
     * Unlike [requirements], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("requirements")
    @ExcludeMissing
    fun _requirements(): JsonField<Requirements> = requirements

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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

        /** Returns a mutable builder for constructing an instance of [WorkerResponse]. */
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

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun binding(binding: Binding) = binding(JsonField.of(binding))

        /**
         * Sets [Builder.binding] to an arbitrary JSON value.
         *
         * You should usually call [Builder.binding] with a well-typed [Binding] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun binding(binding: JsonField<Binding>) = apply { this.binding = binding }

        fun enabled(enabled: Boolean) = enabled(JsonField.of(enabled))

        /**
         * Sets [Builder.enabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enabled] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun enabled(enabled: JsonField<Boolean>) = apply { this.enabled = enabled }

        fun http(http: Http) = http(JsonField.of(http))

        /**
         * Sets [Builder.http] to an arbitrary JSON value.
         *
         * You should usually call [Builder.http] with a well-typed [Http] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun http(http: JsonField<Http>) = apply { this.http = http }

        fun managed(managed: Boolean) = managed(JsonField.of(managed))

        /**
         * Sets [Builder.managed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.managed] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun managed(managed: JsonField<Boolean>) = apply { this.managed = managed }

        fun mcp(mcp: Mcp) = mcp(JsonField.of(mcp))

        /**
         * Sets [Builder.mcp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mcp] with a well-typed [Mcp] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mcp(mcp: JsonField<Mcp>) = apply { this.mcp = mcp }

        fun requirements(requirements: Requirements) = requirements(JsonField.of(requirements))

        /**
         * Sets [Builder.requirements] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requirements] with a well-typed [Requirements] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun requirements(requirements: JsonField<Requirements>) = apply {
            this.requirements = requirements
        }

        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
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

        /**
         * Returns an immutable instance of [WorkerResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
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
                additionalProperties.toMutableMap(),
            )
    }

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
        type().ifPresent { it.validate() }
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
            (binding.asKnown().getOrNull()?.validity() ?: 0) +
            (if (enabled.asKnown().isPresent) 1 else 0) +
            (http.asKnown().getOrNull()?.validity() ?: 0) +
            (if (managed.asKnown().isPresent) 1 else 0) +
            (mcp.asKnown().getOrNull()?.validity() ?: 0) +
            (requirements.asKnown().getOrNull()?.validity() ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0)

    class Binding
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val type: JsonField<Type>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(id, type, mutableMapOf())

        /**
         * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun type(): Optional<Type> = type.getOptional("type")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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

            /** Returns a mutable builder for constructing an instance of [Binding]. */
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

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
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

            /**
             * Returns an immutable instance of [Binding].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Binding = Binding(id, type, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Binding = apply {
            if (validated) {
                return@apply
            }

            id()
            type().ifPresent { it.validate() }
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
            (if (id.asKnown().isPresent) 1 else 0) + (type.asKnown().getOrNull()?.validity() ?: 0)

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

            private var validated: Boolean = false

            fun validate(): Type = apply {
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

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Binding &&
                id == other.id &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(id, type, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Binding{id=$id, type=$type, additionalProperties=$additionalProperties}"
    }

    class Http
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val retry: JsonField<Long>,
        private val secret: JsonField<Secret>,
        private val timeout: JsonField<Long>,
        private val uri: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("retry") @ExcludeMissing retry: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("secret") @ExcludeMissing secret: JsonField<Secret> = JsonMissing.of(),
            @JsonProperty("timeout") @ExcludeMissing timeout: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("uri") @ExcludeMissing uri: JsonField<String> = JsonMissing.of(),
        ) : this(retry, secret, timeout, uri, mutableMapOf())

        /**
         * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun retry(): Optional<Long> = retry.getOptional("retry")

        /**
         * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun secret(): Optional<Secret> = secret.getOptional("secret")

        /**
         * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun timeout(): Optional<Long> = timeout.getOptional("timeout")

        /**
         * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun uri(): Optional<String> = uri.getOptional("uri")

        /**
         * Returns the raw JSON value of [retry].
         *
         * Unlike [retry], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("retry") @ExcludeMissing fun _retry(): JsonField<Long> = retry

        /**
         * Returns the raw JSON value of [secret].
         *
         * Unlike [secret], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("secret") @ExcludeMissing fun _secret(): JsonField<Secret> = secret

        /**
         * Returns the raw JSON value of [timeout].
         *
         * Unlike [timeout], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("timeout") @ExcludeMissing fun _timeout(): JsonField<Long> = timeout

        /**
         * Returns the raw JSON value of [uri].
         *
         * Unlike [uri], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("uri") @ExcludeMissing fun _uri(): JsonField<String> = uri

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

            /** Returns a mutable builder for constructing an instance of [Http]. */
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

            /**
             * Sets [Builder.retry] to an arbitrary JSON value.
             *
             * You should usually call [Builder.retry] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun retry(retry: JsonField<Long>) = apply { this.retry = retry }

            fun secret(secret: Secret) = secret(JsonField.of(secret))

            /**
             * Sets [Builder.secret] to an arbitrary JSON value.
             *
             * You should usually call [Builder.secret] with a well-typed [Secret] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun secret(secret: JsonField<Secret>) = apply { this.secret = secret }

            fun timeout(timeout: Long) = timeout(JsonField.of(timeout))

            /**
             * Sets [Builder.timeout] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timeout] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timeout(timeout: JsonField<Long>) = apply { this.timeout = timeout }

            fun uri(uri: String) = uri(JsonField.of(uri))

            /**
             * Sets [Builder.uri] to an arbitrary JSON value.
             *
             * You should usually call [Builder.uri] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
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

            /**
             * Returns an immutable instance of [Http].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Http =
                Http(retry, secret, timeout, uri, additionalProperties.toMutableMap())
        }

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
            (if (retry.asKnown().isPresent) 1 else 0) +
                (secret.asKnown().getOrNull()?.validity() ?: 0) +
                (if (timeout.asKnown().isPresent) 1 else 0) +
                (if (uri.asKnown().isPresent) 1 else 0)

        class Secret
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val binding: JsonField<Binding>,
            private val editable: JsonField<Boolean>,
            private val exists: JsonField<Boolean>,
            private val value: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("binding")
                @ExcludeMissing
                binding: JsonField<Binding> = JsonMissing.of(),
                @JsonProperty("editable")
                @ExcludeMissing
                editable: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("exists")
                @ExcludeMissing
                exists: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
            ) : this(binding, editable, exists, value, mutableMapOf())

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun binding(): Optional<Binding> = binding.getOptional("binding")

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun editable(): Optional<Boolean> = editable.getOptional("editable")

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun exists(): Optional<Boolean> = exists.getOptional("exists")

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun value(): Optional<String> = value.getOptional("value")

            /**
             * Returns the raw JSON value of [binding].
             *
             * Unlike [binding], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("binding") @ExcludeMissing fun _binding(): JsonField<Binding> = binding

            /**
             * Returns the raw JSON value of [editable].
             *
             * Unlike [editable], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("editable") @ExcludeMissing fun _editable(): JsonField<Boolean> = editable

            /**
             * Returns the raw JSON value of [exists].
             *
             * Unlike [exists], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("exists") @ExcludeMissing fun _exists(): JsonField<Boolean> = exists

            /**
             * Returns the raw JSON value of [value].
             *
             * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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

                /** Returns a mutable builder for constructing an instance of [Secret]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Secret]. */
            class Builder internal constructor() {

                private var binding: JsonField<Binding> = JsonMissing.of()
                private var editable: JsonField<Boolean> = JsonMissing.of()
                private var exists: JsonField<Boolean> = JsonMissing.of()
                private var value: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(secret: Secret) = apply {
                    binding = secret.binding
                    editable = secret.editable
                    exists = secret.exists
                    value = secret.value
                    additionalProperties = secret.additionalProperties.toMutableMap()
                }

                fun binding(binding: Binding) = binding(JsonField.of(binding))

                /**
                 * Sets [Builder.binding] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.binding] with a well-typed [Binding] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun binding(binding: JsonField<Binding>) = apply { this.binding = binding }

                fun editable(editable: Boolean) = editable(JsonField.of(editable))

                /**
                 * Sets [Builder.editable] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.editable] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun editable(editable: JsonField<Boolean>) = apply { this.editable = editable }

                fun exists(exists: Boolean) = exists(JsonField.of(exists))

                /**
                 * Sets [Builder.exists] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.exists] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun exists(exists: JsonField<Boolean>) = apply { this.exists = exists }

                fun value(value: String) = value(JsonField.of(value))

                /**
                 * Sets [Builder.value] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.value] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
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

                /**
                 * Returns an immutable instance of [Secret].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Secret =
                    Secret(binding, editable, exists, value, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Secret = apply {
                if (validated) {
                    return@apply
                }

                binding().ifPresent { it.validate() }
                editable()
                exists()
                value()
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
                (binding.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (editable.asKnown().isPresent) 1 else 0) +
                    (if (exists.asKnown().isPresent) 1 else 0) +
                    (if (value.asKnown().isPresent) 1 else 0)

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

                private var validated: Boolean = false

                fun validate(): Binding = apply {
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

                    return other is Binding && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Secret &&
                    binding == other.binding &&
                    editable == other.editable &&
                    exists == other.exists &&
                    value == other.value &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(binding, editable, exists, value, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Secret{binding=$binding, editable=$editable, exists=$exists, value=$value, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Http &&
                retry == other.retry &&
                secret == other.secret &&
                timeout == other.timeout &&
                uri == other.uri &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(retry, secret, timeout, uri, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Http{retry=$retry, secret=$secret, timeout=$timeout, uri=$uri, additionalProperties=$additionalProperties}"
    }

    class Mcp
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val headers: JsonField<Headers>,
        private val oauth2: JsonField<Oauth2>,
        private val retry: JsonField<Long>,
        private val secrets: JsonField<Secrets>,
        private val timeout: JsonField<Long>,
        private val uri: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("headers") @ExcludeMissing headers: JsonField<Headers> = JsonMissing.of(),
            @JsonProperty("oauth2") @ExcludeMissing oauth2: JsonField<Oauth2> = JsonMissing.of(),
            @JsonProperty("retry") @ExcludeMissing retry: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("secrets") @ExcludeMissing secrets: JsonField<Secrets> = JsonMissing.of(),
            @JsonProperty("timeout") @ExcludeMissing timeout: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("uri") @ExcludeMissing uri: JsonField<String> = JsonMissing.of(),
        ) : this(headers, oauth2, retry, secrets, timeout, uri, mutableMapOf())

        /**
         * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun headers(): Optional<Headers> = headers.getOptional("headers")

        /**
         * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun oauth2(): Optional<Oauth2> = oauth2.getOptional("oauth2")

        /**
         * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun retry(): Optional<Long> = retry.getOptional("retry")

        /**
         * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun secrets(): Optional<Secrets> = secrets.getOptional("secrets")

        /**
         * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun timeout(): Optional<Long> = timeout.getOptional("timeout")

        /**
         * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun uri(): Optional<String> = uri.getOptional("uri")

        /**
         * Returns the raw JSON value of [headers].
         *
         * Unlike [headers], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("headers") @ExcludeMissing fun _headers(): JsonField<Headers> = headers

        /**
         * Returns the raw JSON value of [oauth2].
         *
         * Unlike [oauth2], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("oauth2") @ExcludeMissing fun _oauth2(): JsonField<Oauth2> = oauth2

        /**
         * Returns the raw JSON value of [retry].
         *
         * Unlike [retry], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("retry") @ExcludeMissing fun _retry(): JsonField<Long> = retry

        /**
         * Returns the raw JSON value of [secrets].
         *
         * Unlike [secrets], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("secrets") @ExcludeMissing fun _secrets(): JsonField<Secrets> = secrets

        /**
         * Returns the raw JSON value of [timeout].
         *
         * Unlike [timeout], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("timeout") @ExcludeMissing fun _timeout(): JsonField<Long> = timeout

        /**
         * Returns the raw JSON value of [uri].
         *
         * Unlike [uri], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("uri") @ExcludeMissing fun _uri(): JsonField<String> = uri

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

            /** Returns a mutable builder for constructing an instance of [Mcp]. */
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

            /**
             * Sets [Builder.headers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.headers] with a well-typed [Headers] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun headers(headers: JsonField<Headers>) = apply { this.headers = headers }

            fun oauth2(oauth2: Oauth2) = oauth2(JsonField.of(oauth2))

            /**
             * Sets [Builder.oauth2] to an arbitrary JSON value.
             *
             * You should usually call [Builder.oauth2] with a well-typed [Oauth2] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun oauth2(oauth2: JsonField<Oauth2>) = apply { this.oauth2 = oauth2 }

            fun retry(retry: Long) = retry(JsonField.of(retry))

            /**
             * Sets [Builder.retry] to an arbitrary JSON value.
             *
             * You should usually call [Builder.retry] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun retry(retry: JsonField<Long>) = apply { this.retry = retry }

            fun secrets(secrets: Secrets) = secrets(JsonField.of(secrets))

            /**
             * Sets [Builder.secrets] to an arbitrary JSON value.
             *
             * You should usually call [Builder.secrets] with a well-typed [Secrets] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun secrets(secrets: JsonField<Secrets>) = apply { this.secrets = secrets }

            fun timeout(timeout: Long) = timeout(JsonField.of(timeout))

            /**
             * Sets [Builder.timeout] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timeout] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timeout(timeout: JsonField<Long>) = apply { this.timeout = timeout }

            fun uri(uri: String) = uri(JsonField.of(uri))

            /**
             * Sets [Builder.uri] to an arbitrary JSON value.
             *
             * You should usually call [Builder.uri] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
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

            /**
             * Returns an immutable instance of [Mcp].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Mcp =
                Mcp(
                    headers,
                    oauth2,
                    retry,
                    secrets,
                    timeout,
                    uri,
                    additionalProperties.toMutableMap(),
                )
        }

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
            (headers.asKnown().getOrNull()?.validity() ?: 0) +
                (oauth2.asKnown().getOrNull()?.validity() ?: 0) +
                (if (retry.asKnown().isPresent) 1 else 0) +
                (secrets.asKnown().getOrNull()?.validity() ?: 0) +
                (if (timeout.asKnown().isPresent) 1 else 0) +
                (if (uri.asKnown().isPresent) 1 else 0)

        class Headers
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

                /** Returns a mutable builder for constructing an instance of [Headers]. */
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

                /**
                 * Returns an immutable instance of [Headers].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Headers = Headers(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): Headers = apply {
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
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Headers && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "Headers{additionalProperties=$additionalProperties}"
        }

        class Oauth2
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val authorizationUrl: JsonField<String>,
            private val clientId: JsonField<String>,
            private val clientSecret: JsonField<ClientSecret>,
            private val redirectUri: JsonField<String>,
            private val supportedScopes: JsonField<List<String>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("authorization_url")
                @ExcludeMissing
                authorizationUrl: JsonField<String> = JsonMissing.of(),
                @JsonProperty("client_id")
                @ExcludeMissing
                clientId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("client_secret")
                @ExcludeMissing
                clientSecret: JsonField<ClientSecret> = JsonMissing.of(),
                @JsonProperty("redirect_uri")
                @ExcludeMissing
                redirectUri: JsonField<String> = JsonMissing.of(),
                @JsonProperty("supported_scopes")
                @ExcludeMissing
                supportedScopes: JsonField<List<String>> = JsonMissing.of(),
            ) : this(
                authorizationUrl,
                clientId,
                clientSecret,
                redirectUri,
                supportedScopes,
                mutableMapOf(),
            )

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun authorizationUrl(): Optional<String> =
                authorizationUrl.getOptional("authorization_url")

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun clientId(): Optional<String> = clientId.getOptional("client_id")

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun clientSecret(): Optional<ClientSecret> = clientSecret.getOptional("client_secret")

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun redirectUri(): Optional<String> = redirectUri.getOptional("redirect_uri")

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun supportedScopes(): Optional<List<String>> =
                supportedScopes.getOptional("supported_scopes")

            /**
             * Returns the raw JSON value of [authorizationUrl].
             *
             * Unlike [authorizationUrl], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("authorization_url")
            @ExcludeMissing
            fun _authorizationUrl(): JsonField<String> = authorizationUrl

            /**
             * Returns the raw JSON value of [clientId].
             *
             * Unlike [clientId], this method doesn't throw if the JSON field has an unexpected
             * type.
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
            fun _clientSecret(): JsonField<ClientSecret> = clientSecret

            /**
             * Returns the raw JSON value of [redirectUri].
             *
             * Unlike [redirectUri], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("redirect_uri")
            @ExcludeMissing
            fun _redirectUri(): JsonField<String> = redirectUri

            /**
             * Returns the raw JSON value of [supportedScopes].
             *
             * Unlike [supportedScopes], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("supported_scopes")
            @ExcludeMissing
            fun _supportedScopes(): JsonField<List<String>> = supportedScopes

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

                private var authorizationUrl: JsonField<String> = JsonMissing.of()
                private var clientId: JsonField<String> = JsonMissing.of()
                private var clientSecret: JsonField<ClientSecret> = JsonMissing.of()
                private var redirectUri: JsonField<String> = JsonMissing.of()
                private var supportedScopes: JsonField<MutableList<String>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(oauth2: Oauth2) = apply {
                    authorizationUrl = oauth2.authorizationUrl
                    clientId = oauth2.clientId
                    clientSecret = oauth2.clientSecret
                    redirectUri = oauth2.redirectUri
                    supportedScopes = oauth2.supportedScopes.map { it.toMutableList() }
                    additionalProperties = oauth2.additionalProperties.toMutableMap()
                }

                fun authorizationUrl(authorizationUrl: String) =
                    authorizationUrl(JsonField.of(authorizationUrl))

                /**
                 * Sets [Builder.authorizationUrl] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.authorizationUrl] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun authorizationUrl(authorizationUrl: JsonField<String>) = apply {
                    this.authorizationUrl = authorizationUrl
                }

                fun clientId(clientId: String) = clientId(JsonField.of(clientId))

                /**
                 * Sets [Builder.clientId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.clientId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun clientId(clientId: JsonField<String>) = apply { this.clientId = clientId }

                fun clientSecret(clientSecret: ClientSecret) =
                    clientSecret(JsonField.of(clientSecret))

                /**
                 * Sets [Builder.clientSecret] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.clientSecret] with a well-typed [ClientSecret]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun clientSecret(clientSecret: JsonField<ClientSecret>) = apply {
                    this.clientSecret = clientSecret
                }

                fun redirectUri(redirectUri: String) = redirectUri(JsonField.of(redirectUri))

                /**
                 * Sets [Builder.redirectUri] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.redirectUri] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun redirectUri(redirectUri: JsonField<String>) = apply {
                    this.redirectUri = redirectUri
                }

                fun supportedScopes(supportedScopes: List<String>) =
                    supportedScopes(JsonField.of(supportedScopes))

                /**
                 * Sets [Builder.supportedScopes] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.supportedScopes] with a well-typed
                 * `List<String>` value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun supportedScopes(supportedScopes: JsonField<List<String>>) = apply {
                    this.supportedScopes = supportedScopes.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [supportedScopes].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addSupportedScope(supportedScope: String) = apply {
                    supportedScopes =
                        (supportedScopes ?: JsonField.of(mutableListOf())).also {
                            checkKnown("supportedScopes", it).add(supportedScope)
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
                        authorizationUrl,
                        clientId,
                        clientSecret,
                        redirectUri,
                        (supportedScopes ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Oauth2 = apply {
                if (validated) {
                    return@apply
                }

                authorizationUrl()
                clientId()
                clientSecret().ifPresent { it.validate() }
                redirectUri()
                supportedScopes()
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
                (if (authorizationUrl.asKnown().isPresent) 1 else 0) +
                    (if (clientId.asKnown().isPresent) 1 else 0) +
                    (clientSecret.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (redirectUri.asKnown().isPresent) 1 else 0) +
                    (supportedScopes.asKnown().getOrNull()?.size ?: 0)

            class ClientSecret
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val binding: JsonField<Binding>,
                private val editable: JsonField<Boolean>,
                private val exists: JsonField<Boolean>,
                private val value: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("binding")
                    @ExcludeMissing
                    binding: JsonField<Binding> = JsonMissing.of(),
                    @JsonProperty("editable")
                    @ExcludeMissing
                    editable: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("exists")
                    @ExcludeMissing
                    exists: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("value")
                    @ExcludeMissing
                    value: JsonField<String> = JsonMissing.of(),
                ) : this(binding, editable, exists, value, mutableMapOf())

                /**
                 * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun binding(): Optional<Binding> = binding.getOptional("binding")

                /**
                 * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun editable(): Optional<Boolean> = editable.getOptional("editable")

                /**
                 * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun exists(): Optional<Boolean> = exists.getOptional("exists")

                /**
                 * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun value(): Optional<String> = value.getOptional("value")

                /**
                 * Returns the raw JSON value of [binding].
                 *
                 * Unlike [binding], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("binding")
                @ExcludeMissing
                fun _binding(): JsonField<Binding> = binding

                /**
                 * Returns the raw JSON value of [editable].
                 *
                 * Unlike [editable], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("editable")
                @ExcludeMissing
                fun _editable(): JsonField<Boolean> = editable

                /**
                 * Returns the raw JSON value of [exists].
                 *
                 * Unlike [exists], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("exists") @ExcludeMissing fun _exists(): JsonField<Boolean> = exists

                /**
                 * Returns the raw JSON value of [value].
                 *
                 * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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

                    /** Returns a mutable builder for constructing an instance of [ClientSecret]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [ClientSecret]. */
                class Builder internal constructor() {

                    private var binding: JsonField<Binding> = JsonMissing.of()
                    private var editable: JsonField<Boolean> = JsonMissing.of()
                    private var exists: JsonField<Boolean> = JsonMissing.of()
                    private var value: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(clientSecret: ClientSecret) = apply {
                        binding = clientSecret.binding
                        editable = clientSecret.editable
                        exists = clientSecret.exists
                        value = clientSecret.value
                        additionalProperties = clientSecret.additionalProperties.toMutableMap()
                    }

                    fun binding(binding: Binding) = binding(JsonField.of(binding))

                    /**
                     * Sets [Builder.binding] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.binding] with a well-typed [Binding] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun binding(binding: JsonField<Binding>) = apply { this.binding = binding }

                    fun editable(editable: Boolean) = editable(JsonField.of(editable))

                    /**
                     * Sets [Builder.editable] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.editable] with a well-typed [Boolean] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun editable(editable: JsonField<Boolean>) = apply { this.editable = editable }

                    fun exists(exists: Boolean) = exists(JsonField.of(exists))

                    /**
                     * Sets [Builder.exists] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.exists] with a well-typed [Boolean] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun exists(exists: JsonField<Boolean>) = apply { this.exists = exists }

                    fun value(value: String) = value(JsonField.of(value))

                    /**
                     * Sets [Builder.value] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.value] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
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

                    /**
                     * Returns an immutable instance of [ClientSecret].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): ClientSecret =
                        ClientSecret(
                            binding,
                            editable,
                            exists,
                            value,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): ClientSecret = apply {
                    if (validated) {
                        return@apply
                    }

                    binding().ifPresent { it.validate() }
                    editable()
                    exists()
                    value()
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
                    (binding.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (editable.asKnown().isPresent) 1 else 0) +
                        (if (exists.asKnown().isPresent) 1 else 0) +
                        (if (value.asKnown().isPresent) 1 else 0)

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

                    private var validated: Boolean = false

                    fun validate(): Binding = apply {
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Binding && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ClientSecret &&
                        binding == other.binding &&
                        editable == other.editable &&
                        exists == other.exists &&
                        value == other.value &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(binding, editable, exists, value, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ClientSecret{binding=$binding, editable=$editable, exists=$exists, value=$value, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Oauth2 &&
                    authorizationUrl == other.authorizationUrl &&
                    clientId == other.clientId &&
                    clientSecret == other.clientSecret &&
                    redirectUri == other.redirectUri &&
                    supportedScopes == other.supportedScopes &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    authorizationUrl,
                    clientId,
                    clientSecret,
                    redirectUri,
                    supportedScopes,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Oauth2{authorizationUrl=$authorizationUrl, clientId=$clientId, clientSecret=$clientSecret, redirectUri=$redirectUri, supportedScopes=$supportedScopes, additionalProperties=$additionalProperties}"
        }

        class Secrets
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

                /** Returns a mutable builder for constructing an instance of [Secrets]. */
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

                /**
                 * Returns an immutable instance of [Secrets].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Secrets = Secrets(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): Secrets = apply {
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
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Secrets && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "Secrets{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Mcp &&
                headers == other.headers &&
                oauth2 == other.oauth2 &&
                retry == other.retry &&
                secrets == other.secrets &&
                timeout == other.timeout &&
                uri == other.uri &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(headers, oauth2, retry, secrets, timeout, uri, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Mcp{headers=$headers, oauth2=$oauth2, retry=$retry, secrets=$secrets, timeout=$timeout, uri=$uri, additionalProperties=$additionalProperties}"
    }

    class Requirements
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val authorization: JsonField<Authorization>,
        private val met: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("authorization")
            @ExcludeMissing
            authorization: JsonField<Authorization> = JsonMissing.of(),
            @JsonProperty("met") @ExcludeMissing met: JsonField<Boolean> = JsonMissing.of(),
        ) : this(authorization, met, mutableMapOf())

        /**
         * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun authorization(): Optional<Authorization> = authorization.getOptional("authorization")

        /**
         * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun met(): Optional<Boolean> = met.getOptional("met")

        /**
         * Returns the raw JSON value of [authorization].
         *
         * Unlike [authorization], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("authorization")
        @ExcludeMissing
        fun _authorization(): JsonField<Authorization> = authorization

        /**
         * Returns the raw JSON value of [met].
         *
         * Unlike [met], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("met") @ExcludeMissing fun _met(): JsonField<Boolean> = met

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

            /** Returns a mutable builder for constructing an instance of [Requirements]. */
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

            /**
             * Sets [Builder.authorization] to an arbitrary JSON value.
             *
             * You should usually call [Builder.authorization] with a well-typed [Authorization]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun authorization(authorization: JsonField<Authorization>) = apply {
                this.authorization = authorization
            }

            fun met(met: Boolean) = met(JsonField.of(met))

            /**
             * Sets [Builder.met] to an arbitrary JSON value.
             *
             * You should usually call [Builder.met] with a well-typed [Boolean] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
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

            /**
             * Returns an immutable instance of [Requirements].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Requirements =
                Requirements(authorization, met, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Requirements = apply {
            if (validated) {
                return@apply
            }

            authorization().ifPresent { it.validate() }
            met()
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
            (authorization.asKnown().getOrNull()?.validity() ?: 0) +
                (if (met.asKnown().isPresent) 1 else 0)

        class Authorization
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val met: JsonField<Boolean>,
            private val oauth2: JsonField<Oauth2>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("met") @ExcludeMissing met: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("oauth2") @ExcludeMissing oauth2: JsonField<Oauth2> = JsonMissing.of(),
            ) : this(met, oauth2, mutableMapOf())

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun met(): Optional<Boolean> = met.getOptional("met")

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun oauth2(): Optional<Oauth2> = oauth2.getOptional("oauth2")

            /**
             * Returns the raw JSON value of [met].
             *
             * Unlike [met], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("met") @ExcludeMissing fun _met(): JsonField<Boolean> = met

            /**
             * Returns the raw JSON value of [oauth2].
             *
             * Unlike [oauth2], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("oauth2") @ExcludeMissing fun _oauth2(): JsonField<Oauth2> = oauth2

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

                /** Returns a mutable builder for constructing an instance of [Authorization]. */
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

                /**
                 * Sets [Builder.met] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.met] with a well-typed [Boolean] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun met(met: JsonField<Boolean>) = apply { this.met = met }

                fun oauth2(oauth2: Oauth2) = oauth2(JsonField.of(oauth2))

                /**
                 * Sets [Builder.oauth2] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.oauth2] with a well-typed [Oauth2] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
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

                /**
                 * Returns an immutable instance of [Authorization].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Authorization =
                    Authorization(met, oauth2, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Authorization = apply {
                if (validated) {
                    return@apply
                }

                met()
                oauth2().ifPresent { it.validate() }
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
                (if (met.asKnown().isPresent) 1 else 0) +
                    (oauth2.asKnown().getOrNull()?.validity() ?: 0)

            class Oauth2
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val met: JsonField<Boolean>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("met") @ExcludeMissing met: JsonField<Boolean> = JsonMissing.of()
                ) : this(met, mutableMapOf())

                /**
                 * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun met(): Optional<Boolean> = met.getOptional("met")

                /**
                 * Returns the raw JSON value of [met].
                 *
                 * Unlike [met], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("met") @ExcludeMissing fun _met(): JsonField<Boolean> = met

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

                    private var met: JsonField<Boolean> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(oauth2: Oauth2) = apply {
                        met = oauth2.met
                        additionalProperties = oauth2.additionalProperties.toMutableMap()
                    }

                    fun met(met: Boolean) = met(JsonField.of(met))

                    /**
                     * Sets [Builder.met] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.met] with a well-typed [Boolean] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
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

                    /**
                     * Returns an immutable instance of [Oauth2].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Oauth2 = Oauth2(met, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                fun validate(): Oauth2 = apply {
                    if (validated) {
                        return@apply
                    }

                    met()
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
                @JvmSynthetic internal fun validity(): Int = (if (met.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Oauth2 &&
                        met == other.met &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(met, additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Oauth2{met=$met, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Authorization &&
                    met == other.met &&
                    oauth2 == other.oauth2 &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(met, oauth2, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Authorization{met=$met, oauth2=$oauth2, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Requirements &&
                authorization == other.authorization &&
                met == other.met &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(authorization, met, additionalProperties) }

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

        private var validated: Boolean = false

        fun validate(): Type = apply {
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

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WorkerResponse &&
            id == other.id &&
            binding == other.binding &&
            enabled == other.enabled &&
            http == other.http &&
            managed == other.managed &&
            mcp == other.mcp &&
            requirements == other.requirements &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            binding,
            enabled,
            http,
            managed,
            mcp,
            requirements,
            type,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "WorkerResponse{id=$id, binding=$binding, enabled=$enabled, http=$http, managed=$managed, mcp=$mcp, requirements=$requirements, type=$type, additionalProperties=$additionalProperties}"
}
