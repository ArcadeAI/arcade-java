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
import dev.arcade.core.checkKnown
import dev.arcade.core.toImmutable
import dev.arcade.errors.ArcadeInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class Error
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val fieldErrors: JsonField<List<FieldError>>,
    private val message: JsonField<String>,
    private val name: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("field_errors")
        @ExcludeMissing
        fieldErrors: JsonField<List<FieldError>> = JsonMissing.of(),
        @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
    ) : this(fieldErrors, message, name, mutableMapOf())

    /**
     * FieldErrors carries machine-actionable, per-field detail for a request-body validation
     * failure so a client can map each failure to a specific input field. It is empty (and omitted)
     * for every other error, keeping Message the single source of truth for those.
     *
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fieldErrors(): Optional<List<FieldError>> = fieldErrors.getOptional("field_errors")

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun message(): Optional<String> = message.getOptional("message")

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * Returns the raw JSON value of [fieldErrors].
     *
     * Unlike [fieldErrors], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("field_errors")
    @ExcludeMissing
    fun _fieldErrors(): JsonField<List<FieldError>> = fieldErrors

    /**
     * Returns the raw JSON value of [message].
     *
     * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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

        /** Returns a mutable builder for constructing an instance of [Error]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Error]. */
    class Builder internal constructor() {

        private var fieldErrors: JsonField<MutableList<FieldError>>? = null
        private var message: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(error: Error) = apply {
            fieldErrors = error.fieldErrors.map { it.toMutableList() }
            message = error.message
            name = error.name
            additionalProperties = error.additionalProperties.toMutableMap()
        }

        /**
         * FieldErrors carries machine-actionable, per-field detail for a request-body validation
         * failure so a client can map each failure to a specific input field. It is empty (and
         * omitted) for every other error, keeping Message the single source of truth for those.
         */
        fun fieldErrors(fieldErrors: List<FieldError>) = fieldErrors(JsonField.of(fieldErrors))

        /**
         * Sets [Builder.fieldErrors] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fieldErrors] with a well-typed `List<FieldError>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun fieldErrors(fieldErrors: JsonField<List<FieldError>>) = apply {
            this.fieldErrors = fieldErrors.map { it.toMutableList() }
        }

        /**
         * Adds a single [FieldError] to [fieldErrors].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFieldError(fieldError: FieldError) = apply {
            fieldErrors =
                (fieldErrors ?: JsonField.of(mutableListOf())).also {
                    checkKnown("fieldErrors", it).add(fieldError)
                }
        }

        fun message(message: String) = message(JsonField.of(message))

        /**
         * Sets [Builder.message] to an arbitrary JSON value.
         *
         * You should usually call [Builder.message] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun message(message: JsonField<String>) = apply { this.message = message }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

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
         * Returns an immutable instance of [Error].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): Error =
            Error(
                (fieldErrors ?: JsonMissing.of()).map { it.toImmutable() },
                message,
                name,
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
    fun validate(): Error = apply {
        if (validated) {
            return@apply
        }

        fieldErrors().ifPresent { it.forEach { it.validate() } }
        message()
        name()
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
        (fieldErrors.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (message.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0)

    class FieldError
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val field: JsonField<String>,
        private val message: JsonField<String>,
        private val param: JsonField<String>,
        private val rule: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("field") @ExcludeMissing field: JsonField<String> = JsonMissing.of(),
            @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
            @JsonProperty("param") @ExcludeMissing param: JsonField<String> = JsonMissing.of(),
            @JsonProperty("rule") @ExcludeMissing rule: JsonField<String> = JsonMissing.of(),
        ) : this(field, message, param, rule, mutableMapOf())

        /**
         * Field is the json field path of the offending value, rooted at the request body with
         * inline-embed levels flattened (e.g. "oauth2.token_request.endpoint").
         *
         * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun field(): Optional<String> = field.getOptional("field")

        /**
         * Message is the human-readable, per-field explanation.
         *
         * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun message(): Optional<String> = message.getOptional("message")

        /**
         * Param is the rule's parameter when it has one (e.g. "500" for max), omitted otherwise.
         *
         * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun param(): Optional<String> = param.getOptional("param")

        /**
         * Rule is the validation rule that failed (e.g. "required", "max", "url").
         *
         * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun rule(): Optional<String> = rule.getOptional("rule")

        /**
         * Returns the raw JSON value of [field].
         *
         * Unlike [field], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("field") @ExcludeMissing fun _field(): JsonField<String> = field

        /**
         * Returns the raw JSON value of [message].
         *
         * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

        /**
         * Returns the raw JSON value of [param].
         *
         * Unlike [param], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("param") @ExcludeMissing fun _param(): JsonField<String> = param

        /**
         * Returns the raw JSON value of [rule].
         *
         * Unlike [rule], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rule") @ExcludeMissing fun _rule(): JsonField<String> = rule

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

            /** Returns a mutable builder for constructing an instance of [FieldError]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [FieldError]. */
        class Builder internal constructor() {

            private var field: JsonField<String> = JsonMissing.of()
            private var message: JsonField<String> = JsonMissing.of()
            private var param: JsonField<String> = JsonMissing.of()
            private var rule: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(fieldError: FieldError) = apply {
                field = fieldError.field
                message = fieldError.message
                param = fieldError.param
                rule = fieldError.rule
                additionalProperties = fieldError.additionalProperties.toMutableMap()
            }

            /**
             * Field is the json field path of the offending value, rooted at the request body with
             * inline-embed levels flattened (e.g. "oauth2.token_request.endpoint").
             */
            fun field(field: String) = field(JsonField.of(field))

            /**
             * Sets [Builder.field] to an arbitrary JSON value.
             *
             * You should usually call [Builder.field] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun field(field: JsonField<String>) = apply { this.field = field }

            /** Message is the human-readable, per-field explanation. */
            fun message(message: String) = message(JsonField.of(message))

            /**
             * Sets [Builder.message] to an arbitrary JSON value.
             *
             * You should usually call [Builder.message] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun message(message: JsonField<String>) = apply { this.message = message }

            /**
             * Param is the rule's parameter when it has one (e.g. "500" for max), omitted
             * otherwise.
             */
            fun param(param: String) = param(JsonField.of(param))

            /**
             * Sets [Builder.param] to an arbitrary JSON value.
             *
             * You should usually call [Builder.param] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun param(param: JsonField<String>) = apply { this.param = param }

            /** Rule is the validation rule that failed (e.g. "required", "max", "url"). */
            fun rule(rule: String) = rule(JsonField.of(rule))

            /**
             * Sets [Builder.rule] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rule] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun rule(rule: JsonField<String>) = apply { this.rule = rule }

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
             * Returns an immutable instance of [FieldError].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): FieldError =
                FieldError(field, message, param, rule, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws ArcadeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): FieldError = apply {
            if (validated) {
                return@apply
            }

            field()
            message()
            param()
            rule()
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
            (if (field.asKnown().isPresent) 1 else 0) +
                (if (message.asKnown().isPresent) 1 else 0) +
                (if (param.asKnown().isPresent) 1 else 0) +
                (if (rule.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is FieldError &&
                field == other.field &&
                message == other.message &&
                param == other.param &&
                rule == other.rule &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(field, message, param, rule, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "FieldError{field=$field, message=$message, param=$param, rule=$rule, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Error &&
            fieldErrors == other.fieldErrors &&
            message == other.message &&
            name == other.name &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(fieldErrors, message, name, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Error{fieldErrors=$fieldErrors, message=$message, name=$name, additionalProperties=$additionalProperties}"
}
