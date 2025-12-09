// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models.workers

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.arcade.core.ExcludeMissing
import dev.arcade.core.JsonField
import dev.arcade.core.JsonMissing
import dev.arcade.core.JsonValue
import dev.arcade.core.toImmutable
import dev.arcade.errors.ArcadeInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class UpdateWorkerRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val enabled: JsonField<Boolean>,
    private val http: JsonField<Http>,
    private val mcp: JsonField<Mcp>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("enabled") @ExcludeMissing enabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("http") @ExcludeMissing http: JsonField<Http> = JsonMissing.of(),
        @JsonProperty("mcp") @ExcludeMissing mcp: JsonField<Mcp> = JsonMissing.of(),
    ) : this(enabled, http, mcp, mutableMapOf())

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
    fun mcp(): Optional<Mcp> = mcp.getOptional("mcp")

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
     * Returns the raw JSON value of [mcp].
     *
     * Unlike [mcp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mcp") @ExcludeMissing fun _mcp(): JsonField<Mcp> = mcp

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

        /** Returns a mutable builder for constructing an instance of [UpdateWorkerRequest]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UpdateWorkerRequest]. */
    class Builder internal constructor() {

        private var enabled: JsonField<Boolean> = JsonMissing.of()
        private var http: JsonField<Http> = JsonMissing.of()
        private var mcp: JsonField<Mcp> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(updateWorkerRequest: UpdateWorkerRequest) = apply {
            enabled = updateWorkerRequest.enabled
            http = updateWorkerRequest.http
            mcp = updateWorkerRequest.mcp
            additionalProperties = updateWorkerRequest.additionalProperties.toMutableMap()
        }

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

        fun mcp(mcp: Mcp) = mcp(JsonField.of(mcp))

        /**
         * Sets [Builder.mcp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mcp] with a well-typed [Mcp] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mcp(mcp: JsonField<Mcp>) = apply { this.mcp = mcp }

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
         * Returns an immutable instance of [UpdateWorkerRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): UpdateWorkerRequest =
            UpdateWorkerRequest(enabled, http, mcp, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): UpdateWorkerRequest = apply {
        if (validated) {
            return@apply
        }

        enabled()
        http().ifPresent { it.validate() }
        mcp().ifPresent { it.validate() }
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
        (if (enabled.asKnown().isPresent) 1 else 0) +
            (http.asKnown().getOrNull()?.validity() ?: 0) +
            (mcp.asKnown().getOrNull()?.validity() ?: 0)

    class Http
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val retry: JsonField<Long>,
        private val secret: JsonField<String>,
        private val timeout: JsonField<Long>,
        private val uri: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("retry") @ExcludeMissing retry: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("secret") @ExcludeMissing secret: JsonField<String> = JsonMissing.of(),
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
        fun secret(): Optional<String> = secret.getOptional("secret")

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
        @JsonProperty("secret") @ExcludeMissing fun _secret(): JsonField<String> = secret

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
            private var secret: JsonField<String> = JsonMissing.of()
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

            fun secret(secret: String) = secret(JsonField.of(secret))

            /**
             * Sets [Builder.secret] to an arbitrary JSON value.
             *
             * You should usually call [Builder.secret] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun secret(secret: JsonField<String>) = apply { this.secret = secret }

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
            secret()
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
                (if (secret.asKnown().isPresent) 1 else 0) +
                (if (timeout.asKnown().isPresent) 1 else 0) +
                (if (uri.asKnown().isPresent) 1 else 0)

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
            private val clientSecret: JsonField<String>,
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
                clientSecret: JsonField<String> = JsonMissing.of(),
            ) : this(authorizationUrl, clientId, clientSecret, mutableMapOf())

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
            fun clientSecret(): Optional<String> = clientSecret.getOptional("client_secret")

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
            fun _clientSecret(): JsonField<String> = clientSecret

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
                private var clientSecret: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(oauth2: Oauth2) = apply {
                    authorizationUrl = oauth2.authorizationUrl
                    clientId = oauth2.clientId
                    clientSecret = oauth2.clientSecret
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

                fun clientSecret(clientSecret: String) = clientSecret(JsonField.of(clientSecret))

                /**
                 * Sets [Builder.clientSecret] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.clientSecret] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun clientSecret(clientSecret: JsonField<String>) = apply {
                    this.clientSecret = clientSecret
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
                clientSecret()
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
                    (if (clientSecret.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Oauth2 &&
                    authorizationUrl == other.authorizationUrl &&
                    clientId == other.clientId &&
                    clientSecret == other.clientSecret &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(authorizationUrl, clientId, clientSecret, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Oauth2{authorizationUrl=$authorizationUrl, clientId=$clientId, clientSecret=$clientSecret, additionalProperties=$additionalProperties}"
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UpdateWorkerRequest &&
            enabled == other.enabled &&
            http == other.http &&
            mcp == other.mcp &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(enabled, http, mcp, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UpdateWorkerRequest{enabled=$enabled, http=$http, mcp=$mcp, additionalProperties=$additionalProperties}"
}
