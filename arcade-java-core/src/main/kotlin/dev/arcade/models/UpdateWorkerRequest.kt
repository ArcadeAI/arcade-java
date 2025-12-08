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
class UpdateWorkerRequest
@JsonCreator
private constructor(
    @JsonProperty("enabled")
    @ExcludeMissing
    private val enabled: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("http") @ExcludeMissing private val http: JsonField<Http> = JsonMissing.of(),
    @JsonProperty("mcp") @ExcludeMissing private val mcp: JsonField<Mcp> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun enabled(): Optional<Boolean> = Optional.ofNullable(enabled.getNullable("enabled"))

    fun http(): Optional<Http> = Optional.ofNullable(http.getNullable("http"))

    fun mcp(): Optional<Mcp> = Optional.ofNullable(mcp.getNullable("mcp"))

    @JsonProperty("enabled") @ExcludeMissing fun _enabled(): JsonField<Boolean> = enabled

    @JsonProperty("http") @ExcludeMissing fun _http(): JsonField<Http> = http

    @JsonProperty("mcp") @ExcludeMissing fun _mcp(): JsonField<Mcp> = mcp

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

    fun toBuilder() = Builder().from(this)

    companion object {

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

        fun enabled(enabled: JsonField<Boolean>) = apply { this.enabled = enabled }

        fun http(http: Http) = http(JsonField.of(http))

        fun http(http: JsonField<Http>) = apply { this.http = http }

        fun mcp(mcp: Mcp) = mcp(JsonField.of(mcp))

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

        fun build(): UpdateWorkerRequest =
            UpdateWorkerRequest(enabled, http, mcp, additionalProperties.toImmutable())
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
        private val secret: JsonField<String> = JsonMissing.of(),
        @JsonProperty("timeout")
        @ExcludeMissing
        private val timeout: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("uri") @ExcludeMissing private val uri: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun retry(): Optional<Long> = Optional.ofNullable(retry.getNullable("retry"))

        fun secret(): Optional<String> = Optional.ofNullable(secret.getNullable("secret"))

        fun timeout(): Optional<Long> = Optional.ofNullable(timeout.getNullable("timeout"))

        fun uri(): Optional<String> = Optional.ofNullable(uri.getNullable("uri"))

        @JsonProperty("retry") @ExcludeMissing fun _retry(): JsonField<Long> = retry

        @JsonProperty("secret") @ExcludeMissing fun _secret(): JsonField<String> = secret

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
            secret()
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

            fun retry(retry: JsonField<Long>) = apply { this.retry = retry }

            fun secret(secret: String) = secret(JsonField.of(secret))

            fun secret(secret: JsonField<String>) = apply { this.secret = secret }

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
            private val clientSecret: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun authorizationUrl(): Optional<String> =
                Optional.ofNullable(authorizationUrl.getNullable("authorization_url"))

            fun clientId(): Optional<String> =
                Optional.ofNullable(clientId.getNullable("client_id"))

            fun clientSecret(): Optional<String> =
                Optional.ofNullable(clientSecret.getNullable("client_secret"))

            @JsonProperty("authorization_url")
            @ExcludeMissing
            fun _authorizationUrl(): JsonField<String> = authorizationUrl

            @JsonProperty("client_id") @ExcludeMissing fun _clientId(): JsonField<String> = clientId

            @JsonProperty("client_secret")
            @ExcludeMissing
            fun _clientSecret(): JsonField<String> = clientSecret

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
                clientSecret()
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

                fun authorizationUrl(authorizationUrl: JsonField<String>) = apply {
                    this.authorizationUrl = authorizationUrl
                }

                fun clientId(clientId: String) = clientId(JsonField.of(clientId))

                fun clientId(clientId: JsonField<String>) = apply { this.clientId = clientId }

                fun clientSecret(clientSecret: String) = clientSecret(JsonField.of(clientSecret))

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

                fun build(): Oauth2 =
                    Oauth2(
                        authorizationUrl,
                        clientId,
                        clientSecret,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Oauth2 && authorizationUrl == other.authorizationUrl && clientId == other.clientId && clientSecret == other.clientSecret && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(authorizationUrl, clientId, clientSecret, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Oauth2{authorizationUrl=$authorizationUrl, clientId=$clientId, clientSecret=$clientSecret, additionalProperties=$additionalProperties}"
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is UpdateWorkerRequest && enabled == other.enabled && http == other.http && mcp == other.mcp && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(enabled, http, mcp, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UpdateWorkerRequest{enabled=$enabled, http=$http, mcp=$mcp, additionalProperties=$additionalProperties}"
}
