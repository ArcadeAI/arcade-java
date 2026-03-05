// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models.tools

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
import dev.arcade.core.checkRequired
import dev.arcade.core.toImmutable
import dev.arcade.errors.ArcadeInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ToolDefinition
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val fullyQualifiedName: JsonField<String>,
    private val input: JsonField<Input>,
    private val name: JsonField<String>,
    private val qualifiedName: JsonField<String>,
    private val toolkit: JsonField<Toolkit>,
    private val description: JsonField<String>,
    private val formattedSchema: JsonField<FormattedSchema>,
    private val metadata: JsonField<Metadata>,
    private val output: JsonField<Output>,
    private val requirements: JsonField<Requirements>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("fully_qualified_name")
        @ExcludeMissing
        fullyQualifiedName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("input") @ExcludeMissing input: JsonField<Input> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("qualified_name")
        @ExcludeMissing
        qualifiedName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("toolkit") @ExcludeMissing toolkit: JsonField<Toolkit> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("formatted_schema")
        @ExcludeMissing
        formattedSchema: JsonField<FormattedSchema> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("output") @ExcludeMissing output: JsonField<Output> = JsonMissing.of(),
        @JsonProperty("requirements")
        @ExcludeMissing
        requirements: JsonField<Requirements> = JsonMissing.of(),
    ) : this(
        fullyQualifiedName,
        input,
        name,
        qualifiedName,
        toolkit,
        description,
        formattedSchema,
        metadata,
        output,
        requirements,
        mutableMapOf(),
    )

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fullyQualifiedName(): String = fullyQualifiedName.getRequired("fully_qualified_name")

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun input(): Input = input.getRequired("input")

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun qualifiedName(): String = qualifiedName.getRequired("qualified_name")

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun toolkit(): Toolkit = toolkit.getRequired("toolkit")

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun formattedSchema(): Optional<FormattedSchema> =
        formattedSchema.getOptional("formatted_schema")

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun output(): Optional<Output> = output.getOptional("output")

    /**
     * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun requirements(): Optional<Requirements> = requirements.getOptional("requirements")

    /**
     * Returns the raw JSON value of [fullyQualifiedName].
     *
     * Unlike [fullyQualifiedName], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("fully_qualified_name")
    @ExcludeMissing
    fun _fullyQualifiedName(): JsonField<String> = fullyQualifiedName

    /**
     * Returns the raw JSON value of [input].
     *
     * Unlike [input], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("input") @ExcludeMissing fun _input(): JsonField<Input> = input

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [qualifiedName].
     *
     * Unlike [qualifiedName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("qualified_name")
    @ExcludeMissing
    fun _qualifiedName(): JsonField<String> = qualifiedName

    /**
     * Returns the raw JSON value of [toolkit].
     *
     * Unlike [toolkit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("toolkit") @ExcludeMissing fun _toolkit(): JsonField<Toolkit> = toolkit

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [formattedSchema].
     *
     * Unlike [formattedSchema], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("formatted_schema")
    @ExcludeMissing
    fun _formattedSchema(): JsonField<FormattedSchema> = formattedSchema

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /**
     * Returns the raw JSON value of [output].
     *
     * Unlike [output], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("output") @ExcludeMissing fun _output(): JsonField<Output> = output

    /**
     * Returns the raw JSON value of [requirements].
     *
     * Unlike [requirements], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("requirements")
    @ExcludeMissing
    fun _requirements(): JsonField<Requirements> = requirements

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
         * Returns a mutable builder for constructing an instance of [ToolDefinition].
         *
         * The following fields are required:
         * ```java
         * .fullyQualifiedName()
         * .input()
         * .name()
         * .qualifiedName()
         * .toolkit()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ToolDefinition]. */
    class Builder internal constructor() {

        private var fullyQualifiedName: JsonField<String>? = null
        private var input: JsonField<Input>? = null
        private var name: JsonField<String>? = null
        private var qualifiedName: JsonField<String>? = null
        private var toolkit: JsonField<Toolkit>? = null
        private var description: JsonField<String> = JsonMissing.of()
        private var formattedSchema: JsonField<FormattedSchema> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var output: JsonField<Output> = JsonMissing.of()
        private var requirements: JsonField<Requirements> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(toolDefinition: ToolDefinition) = apply {
            fullyQualifiedName = toolDefinition.fullyQualifiedName
            input = toolDefinition.input
            name = toolDefinition.name
            qualifiedName = toolDefinition.qualifiedName
            toolkit = toolDefinition.toolkit
            description = toolDefinition.description
            formattedSchema = toolDefinition.formattedSchema
            metadata = toolDefinition.metadata
            output = toolDefinition.output
            requirements = toolDefinition.requirements
            additionalProperties = toolDefinition.additionalProperties.toMutableMap()
        }

        fun fullyQualifiedName(fullyQualifiedName: String) =
            fullyQualifiedName(JsonField.of(fullyQualifiedName))

        /**
         * Sets [Builder.fullyQualifiedName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fullyQualifiedName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun fullyQualifiedName(fullyQualifiedName: JsonField<String>) = apply {
            this.fullyQualifiedName = fullyQualifiedName
        }

        fun input(input: Input) = input(JsonField.of(input))

        /**
         * Sets [Builder.input] to an arbitrary JSON value.
         *
         * You should usually call [Builder.input] with a well-typed [Input] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun input(input: JsonField<Input>) = apply { this.input = input }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun qualifiedName(qualifiedName: String) = qualifiedName(JsonField.of(qualifiedName))

        /**
         * Sets [Builder.qualifiedName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.qualifiedName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun qualifiedName(qualifiedName: JsonField<String>) = apply {
            this.qualifiedName = qualifiedName
        }

        fun toolkit(toolkit: Toolkit) = toolkit(JsonField.of(toolkit))

        /**
         * Sets [Builder.toolkit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.toolkit] with a well-typed [Toolkit] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun toolkit(toolkit: JsonField<Toolkit>) = apply { this.toolkit = toolkit }

        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        fun formattedSchema(formattedSchema: FormattedSchema) =
            formattedSchema(JsonField.of(formattedSchema))

        /**
         * Sets [Builder.formattedSchema] to an arbitrary JSON value.
         *
         * You should usually call [Builder.formattedSchema] with a well-typed [FormattedSchema]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun formattedSchema(formattedSchema: JsonField<FormattedSchema>) = apply {
            this.formattedSchema = formattedSchema
        }

        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        fun output(output: Output) = output(JsonField.of(output))

        /**
         * Sets [Builder.output] to an arbitrary JSON value.
         *
         * You should usually call [Builder.output] with a well-typed [Output] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun output(output: JsonField<Output>) = apply { this.output = output }

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
         * Returns an immutable instance of [ToolDefinition].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .fullyQualifiedName()
         * .input()
         * .name()
         * .qualifiedName()
         * .toolkit()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ToolDefinition =
            ToolDefinition(
                checkRequired("fullyQualifiedName", fullyQualifiedName),
                checkRequired("input", input),
                checkRequired("name", name),
                checkRequired("qualifiedName", qualifiedName),
                checkRequired("toolkit", toolkit),
                description,
                formattedSchema,
                metadata,
                output,
                requirements,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ToolDefinition = apply {
        if (validated) {
            return@apply
        }

        fullyQualifiedName()
        input().validate()
        name()
        qualifiedName()
        toolkit().validate()
        description()
        formattedSchema().ifPresent { it.validate() }
        metadata().ifPresent { it.validate() }
        output().ifPresent { it.validate() }
        requirements().ifPresent { it.validate() }
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
        (if (fullyQualifiedName.asKnown().isPresent) 1 else 0) +
            (input.asKnown().getOrNull()?.validity() ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (qualifiedName.asKnown().isPresent) 1 else 0) +
            (toolkit.asKnown().getOrNull()?.validity() ?: 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (formattedSchema.asKnown().getOrNull()?.validity() ?: 0) +
            (metadata.asKnown().getOrNull()?.validity() ?: 0) +
            (output.asKnown().getOrNull()?.validity() ?: 0) +
            (requirements.asKnown().getOrNull()?.validity() ?: 0)

    class Input
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val parameters: JsonField<List<Parameter>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("parameters")
            @ExcludeMissing
            parameters: JsonField<List<Parameter>> = JsonMissing.of()
        ) : this(parameters, mutableMapOf())

        /**
         * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun parameters(): Optional<List<Parameter>> = parameters.getOptional("parameters")

        /**
         * Returns the raw JSON value of [parameters].
         *
         * Unlike [parameters], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("parameters")
        @ExcludeMissing
        fun _parameters(): JsonField<List<Parameter>> = parameters

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

            /** Returns a mutable builder for constructing an instance of [Input]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Input]. */
        class Builder internal constructor() {

            private var parameters: JsonField<MutableList<Parameter>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(input: Input) = apply {
                parameters = input.parameters.map { it.toMutableList() }
                additionalProperties = input.additionalProperties.toMutableMap()
            }

            fun parameters(parameters: List<Parameter>) = parameters(JsonField.of(parameters))

            /**
             * Sets [Builder.parameters] to an arbitrary JSON value.
             *
             * You should usually call [Builder.parameters] with a well-typed `List<Parameter>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun parameters(parameters: JsonField<List<Parameter>>) = apply {
                this.parameters = parameters.map { it.toMutableList() }
            }

            /**
             * Adds a single [Parameter] to [parameters].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addParameter(parameter: Parameter) = apply {
                parameters =
                    (parameters ?: JsonField.of(mutableListOf())).also {
                        checkKnown("parameters", it).add(parameter)
                    }
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

            /**
             * Returns an immutable instance of [Input].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Input =
                Input(
                    (parameters ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Input = apply {
            if (validated) {
                return@apply
            }

            parameters().ifPresent { it.forEach { it.validate() } }
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
            (parameters.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        class Parameter
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val name: JsonField<String>,
            private val valueSchema: JsonField<ValueSchema>,
            private val description: JsonField<String>,
            private val inferrable: JsonField<Boolean>,
            private val required: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("value_schema")
                @ExcludeMissing
                valueSchema: JsonField<ValueSchema> = JsonMissing.of(),
                @JsonProperty("description")
                @ExcludeMissing
                description: JsonField<String> = JsonMissing.of(),
                @JsonProperty("inferrable")
                @ExcludeMissing
                inferrable: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("required")
                @ExcludeMissing
                required: JsonField<Boolean> = JsonMissing.of(),
            ) : this(name, valueSchema, description, inferrable, required, mutableMapOf())

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun name(): String = name.getRequired("name")

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun valueSchema(): ValueSchema = valueSchema.getRequired("value_schema")

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun description(): Optional<String> = description.getOptional("description")

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun inferrable(): Optional<Boolean> = inferrable.getOptional("inferrable")

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun required(): Optional<Boolean> = required.getOptional("required")

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [valueSchema].
             *
             * Unlike [valueSchema], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("value_schema")
            @ExcludeMissing
            fun _valueSchema(): JsonField<ValueSchema> = valueSchema

            /**
             * Returns the raw JSON value of [description].
             *
             * Unlike [description], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("description")
            @ExcludeMissing
            fun _description(): JsonField<String> = description

            /**
             * Returns the raw JSON value of [inferrable].
             *
             * Unlike [inferrable], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("inferrable")
            @ExcludeMissing
            fun _inferrable(): JsonField<Boolean> = inferrable

            /**
             * Returns the raw JSON value of [required].
             *
             * Unlike [required], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("required") @ExcludeMissing fun _required(): JsonField<Boolean> = required

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
                 * Returns a mutable builder for constructing an instance of [Parameter].
                 *
                 * The following fields are required:
                 * ```java
                 * .name()
                 * .valueSchema()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Parameter]. */
            class Builder internal constructor() {

                private var name: JsonField<String>? = null
                private var valueSchema: JsonField<ValueSchema>? = null
                private var description: JsonField<String> = JsonMissing.of()
                private var inferrable: JsonField<Boolean> = JsonMissing.of()
                private var required: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(parameter: Parameter) = apply {
                    name = parameter.name
                    valueSchema = parameter.valueSchema
                    description = parameter.description
                    inferrable = parameter.inferrable
                    required = parameter.required
                    additionalProperties = parameter.additionalProperties.toMutableMap()
                }

                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun valueSchema(valueSchema: ValueSchema) = valueSchema(JsonField.of(valueSchema))

                /**
                 * Sets [Builder.valueSchema] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.valueSchema] with a well-typed [ValueSchema]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun valueSchema(valueSchema: JsonField<ValueSchema>) = apply {
                    this.valueSchema = valueSchema
                }

                fun description(description: String) = description(JsonField.of(description))

                /**
                 * Sets [Builder.description] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.description] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                fun inferrable(inferrable: Boolean) = inferrable(JsonField.of(inferrable))

                /**
                 * Sets [Builder.inferrable] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.inferrable] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun inferrable(inferrable: JsonField<Boolean>) = apply {
                    this.inferrable = inferrable
                }

                fun required(required: Boolean) = required(JsonField.of(required))

                /**
                 * Sets [Builder.required] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.required] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun required(required: JsonField<Boolean>) = apply { this.required = required }

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
                 * Returns an immutable instance of [Parameter].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .name()
                 * .valueSchema()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Parameter =
                    Parameter(
                        checkRequired("name", name),
                        checkRequired("valueSchema", valueSchema),
                        description,
                        inferrable,
                        required,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Parameter = apply {
                if (validated) {
                    return@apply
                }

                name()
                valueSchema().validate()
                description()
                inferrable()
                required()
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
                (if (name.asKnown().isPresent) 1 else 0) +
                    (valueSchema.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (description.asKnown().isPresent) 1 else 0) +
                    (if (inferrable.asKnown().isPresent) 1 else 0) +
                    (if (required.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Parameter &&
                    name == other.name &&
                    valueSchema == other.valueSchema &&
                    description == other.description &&
                    inferrable == other.inferrable &&
                    required == other.required &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    name,
                    valueSchema,
                    description,
                    inferrable,
                    required,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Parameter{name=$name, valueSchema=$valueSchema, description=$description, inferrable=$inferrable, required=$required, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Input &&
                parameters == other.parameters &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(parameters, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Input{parameters=$parameters, additionalProperties=$additionalProperties}"
    }

    class Toolkit
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val name: JsonField<String>,
        private val description: JsonField<String>,
        private val version: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("version") @ExcludeMissing version: JsonField<String> = JsonMissing.of(),
        ) : this(name, description, version, mutableMapOf())

        /**
         * @throws ArcadeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun version(): Optional<String> = version.getOptional("version")

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [version].
         *
         * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<String> = version

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
             * Returns a mutable builder for constructing an instance of [Toolkit].
             *
             * The following fields are required:
             * ```java
             * .name()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Toolkit]. */
        class Builder internal constructor() {

            private var name: JsonField<String>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var version: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(toolkit: Toolkit) = apply {
                name = toolkit.name
                description = toolkit.description
                version = toolkit.version
                additionalProperties = toolkit.additionalProperties.toMutableMap()
            }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            fun version(version: String) = version(JsonField.of(version))

            /**
             * Sets [Builder.version] to an arbitrary JSON value.
             *
             * You should usually call [Builder.version] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun version(version: JsonField<String>) = apply { this.version = version }

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
             * Returns an immutable instance of [Toolkit].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Toolkit =
                Toolkit(
                    checkRequired("name", name),
                    description,
                    version,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Toolkit = apply {
            if (validated) {
                return@apply
            }

            name()
            description()
            version()
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
            (if (name.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (version.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Toolkit &&
                name == other.name &&
                description == other.description &&
                version == other.version &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(name, description, version, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Toolkit{name=$name, description=$description, version=$version, additionalProperties=$additionalProperties}"
    }

    class FormattedSchema
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

            /** Returns a mutable builder for constructing an instance of [FormattedSchema]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [FormattedSchema]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(formattedSchema: FormattedSchema) = apply {
                additionalProperties = formattedSchema.additionalProperties.toMutableMap()
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

            /**
             * Returns an immutable instance of [FormattedSchema].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): FormattedSchema = FormattedSchema(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): FormattedSchema = apply {
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

            return other is FormattedSchema && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "FormattedSchema{additionalProperties=$additionalProperties}"
    }

    class Metadata
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val behavior: JsonField<Behavior>,
        private val classification: JsonField<Classification>,
        private val extras: JsonField<Extras>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("behavior")
            @ExcludeMissing
            behavior: JsonField<Behavior> = JsonMissing.of(),
            @JsonProperty("classification")
            @ExcludeMissing
            classification: JsonField<Classification> = JsonMissing.of(),
            @JsonProperty("extras") @ExcludeMissing extras: JsonField<Extras> = JsonMissing.of(),
        ) : this(behavior, classification, extras, mutableMapOf())

        /**
         * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun behavior(): Optional<Behavior> = behavior.getOptional("behavior")

        /**
         * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun classification(): Optional<Classification> =
            classification.getOptional("classification")

        /**
         * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun extras(): Optional<Extras> = extras.getOptional("extras")

        /**
         * Returns the raw JSON value of [behavior].
         *
         * Unlike [behavior], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("behavior") @ExcludeMissing fun _behavior(): JsonField<Behavior> = behavior

        /**
         * Returns the raw JSON value of [classification].
         *
         * Unlike [classification], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("classification")
        @ExcludeMissing
        fun _classification(): JsonField<Classification> = classification

        /**
         * Returns the raw JSON value of [extras].
         *
         * Unlike [extras], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("extras") @ExcludeMissing fun _extras(): JsonField<Extras> = extras

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

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var behavior: JsonField<Behavior> = JsonMissing.of()
            private var classification: JsonField<Classification> = JsonMissing.of()
            private var extras: JsonField<Extras> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metadata: Metadata) = apply {
                behavior = metadata.behavior
                classification = metadata.classification
                extras = metadata.extras
                additionalProperties = metadata.additionalProperties.toMutableMap()
            }

            fun behavior(behavior: Behavior) = behavior(JsonField.of(behavior))

            /**
             * Sets [Builder.behavior] to an arbitrary JSON value.
             *
             * You should usually call [Builder.behavior] with a well-typed [Behavior] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun behavior(behavior: JsonField<Behavior>) = apply { this.behavior = behavior }

            fun classification(classification: Classification) =
                classification(JsonField.of(classification))

            /**
             * Sets [Builder.classification] to an arbitrary JSON value.
             *
             * You should usually call [Builder.classification] with a well-typed [Classification]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun classification(classification: JsonField<Classification>) = apply {
                this.classification = classification
            }

            fun extras(extras: Extras) = extras(JsonField.of(extras))

            /**
             * Sets [Builder.extras] to an arbitrary JSON value.
             *
             * You should usually call [Builder.extras] with a well-typed [Extras] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun extras(extras: JsonField<Extras>) = apply { this.extras = extras }

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
             * Returns an immutable instance of [Metadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Metadata =
                Metadata(behavior, classification, extras, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
            if (validated) {
                return@apply
            }

            behavior().ifPresent { it.validate() }
            classification().ifPresent { it.validate() }
            extras().ifPresent { it.validate() }
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
            (behavior.asKnown().getOrNull()?.validity() ?: 0) +
                (classification.asKnown().getOrNull()?.validity() ?: 0) +
                (extras.asKnown().getOrNull()?.validity() ?: 0)

        class Behavior
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val destructive: JsonField<Boolean>,
            private val idempotent: JsonField<Boolean>,
            private val openWorld: JsonField<Boolean>,
            private val operations: JsonField<List<String>>,
            private val readOnly: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("destructive")
                @ExcludeMissing
                destructive: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("idempotent")
                @ExcludeMissing
                idempotent: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("open_world")
                @ExcludeMissing
                openWorld: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("operations")
                @ExcludeMissing
                operations: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("read_only")
                @ExcludeMissing
                readOnly: JsonField<Boolean> = JsonMissing.of(),
            ) : this(destructive, idempotent, openWorld, operations, readOnly, mutableMapOf())

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun destructive(): Optional<Boolean> = destructive.getOptional("destructive")

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun idempotent(): Optional<Boolean> = idempotent.getOptional("idempotent")

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun openWorld(): Optional<Boolean> = openWorld.getOptional("open_world")

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun operations(): Optional<List<String>> = operations.getOptional("operations")

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun readOnly(): Optional<Boolean> = readOnly.getOptional("read_only")

            /**
             * Returns the raw JSON value of [destructive].
             *
             * Unlike [destructive], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("destructive")
            @ExcludeMissing
            fun _destructive(): JsonField<Boolean> = destructive

            /**
             * Returns the raw JSON value of [idempotent].
             *
             * Unlike [idempotent], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("idempotent")
            @ExcludeMissing
            fun _idempotent(): JsonField<Boolean> = idempotent

            /**
             * Returns the raw JSON value of [openWorld].
             *
             * Unlike [openWorld], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("open_world")
            @ExcludeMissing
            fun _openWorld(): JsonField<Boolean> = openWorld

            /**
             * Returns the raw JSON value of [operations].
             *
             * Unlike [operations], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("operations")
            @ExcludeMissing
            fun _operations(): JsonField<List<String>> = operations

            /**
             * Returns the raw JSON value of [readOnly].
             *
             * Unlike [readOnly], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("read_only")
            @ExcludeMissing
            fun _readOnly(): JsonField<Boolean> = readOnly

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

                /** Returns a mutable builder for constructing an instance of [Behavior]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Behavior]. */
            class Builder internal constructor() {

                private var destructive: JsonField<Boolean> = JsonMissing.of()
                private var idempotent: JsonField<Boolean> = JsonMissing.of()
                private var openWorld: JsonField<Boolean> = JsonMissing.of()
                private var operations: JsonField<MutableList<String>>? = null
                private var readOnly: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(behavior: Behavior) = apply {
                    destructive = behavior.destructive
                    idempotent = behavior.idempotent
                    openWorld = behavior.openWorld
                    operations = behavior.operations.map { it.toMutableList() }
                    readOnly = behavior.readOnly
                    additionalProperties = behavior.additionalProperties.toMutableMap()
                }

                fun destructive(destructive: Boolean) = destructive(JsonField.of(destructive))

                /**
                 * Sets [Builder.destructive] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.destructive] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun destructive(destructive: JsonField<Boolean>) = apply {
                    this.destructive = destructive
                }

                fun idempotent(idempotent: Boolean) = idempotent(JsonField.of(idempotent))

                /**
                 * Sets [Builder.idempotent] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.idempotent] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun idempotent(idempotent: JsonField<Boolean>) = apply {
                    this.idempotent = idempotent
                }

                fun openWorld(openWorld: Boolean) = openWorld(JsonField.of(openWorld))

                /**
                 * Sets [Builder.openWorld] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.openWorld] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun openWorld(openWorld: JsonField<Boolean>) = apply { this.openWorld = openWorld }

                fun operations(operations: List<String>) = operations(JsonField.of(operations))

                /**
                 * Sets [Builder.operations] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.operations] with a well-typed `List<String>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun operations(operations: JsonField<List<String>>) = apply {
                    this.operations = operations.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [operations].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addOperation(operation: String) = apply {
                    operations =
                        (operations ?: JsonField.of(mutableListOf())).also {
                            checkKnown("operations", it).add(operation)
                        }
                }

                fun readOnly(readOnly: Boolean) = readOnly(JsonField.of(readOnly))

                /**
                 * Sets [Builder.readOnly] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.readOnly] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun readOnly(readOnly: JsonField<Boolean>) = apply { this.readOnly = readOnly }

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
                 * Returns an immutable instance of [Behavior].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Behavior =
                    Behavior(
                        destructive,
                        idempotent,
                        openWorld,
                        (operations ?: JsonMissing.of()).map { it.toImmutable() },
                        readOnly,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Behavior = apply {
                if (validated) {
                    return@apply
                }

                destructive()
                idempotent()
                openWorld()
                operations()
                readOnly()
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
                (if (destructive.asKnown().isPresent) 1 else 0) +
                    (if (idempotent.asKnown().isPresent) 1 else 0) +
                    (if (openWorld.asKnown().isPresent) 1 else 0) +
                    (operations.asKnown().getOrNull()?.size ?: 0) +
                    (if (readOnly.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Behavior &&
                    destructive == other.destructive &&
                    idempotent == other.idempotent &&
                    openWorld == other.openWorld &&
                    operations == other.operations &&
                    readOnly == other.readOnly &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    destructive,
                    idempotent,
                    openWorld,
                    operations,
                    readOnly,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Behavior{destructive=$destructive, idempotent=$idempotent, openWorld=$openWorld, operations=$operations, readOnly=$readOnly, additionalProperties=$additionalProperties}"
        }

        class Classification
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val serviceDomains: JsonField<List<String>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("service_domains")
                @ExcludeMissing
                serviceDomains: JsonField<List<String>> = JsonMissing.of()
            ) : this(serviceDomains, mutableMapOf())

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun serviceDomains(): Optional<List<String>> =
                serviceDomains.getOptional("service_domains")

            /**
             * Returns the raw JSON value of [serviceDomains].
             *
             * Unlike [serviceDomains], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("service_domains")
            @ExcludeMissing
            fun _serviceDomains(): JsonField<List<String>> = serviceDomains

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

                /** Returns a mutable builder for constructing an instance of [Classification]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Classification]. */
            class Builder internal constructor() {

                private var serviceDomains: JsonField<MutableList<String>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(classification: Classification) = apply {
                    serviceDomains = classification.serviceDomains.map { it.toMutableList() }
                    additionalProperties = classification.additionalProperties.toMutableMap()
                }

                fun serviceDomains(serviceDomains: List<String>) =
                    serviceDomains(JsonField.of(serviceDomains))

                /**
                 * Sets [Builder.serviceDomains] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.serviceDomains] with a well-typed `List<String>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun serviceDomains(serviceDomains: JsonField<List<String>>) = apply {
                    this.serviceDomains = serviceDomains.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [serviceDomains].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addServiceDomain(serviceDomain: String) = apply {
                    serviceDomains =
                        (serviceDomains ?: JsonField.of(mutableListOf())).also {
                            checkKnown("serviceDomains", it).add(serviceDomain)
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
                 * Returns an immutable instance of [Classification].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Classification =
                    Classification(
                        (serviceDomains ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Classification = apply {
                if (validated) {
                    return@apply
                }

                serviceDomains()
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
            internal fun validity(): Int = (serviceDomains.asKnown().getOrNull()?.size ?: 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Classification &&
                    serviceDomains == other.serviceDomains &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(serviceDomains, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Classification{serviceDomains=$serviceDomains, additionalProperties=$additionalProperties}"
        }

        class Extras
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

                /** Returns a mutable builder for constructing an instance of [Extras]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Extras]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(extras: Extras) = apply {
                    additionalProperties = extras.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [Extras].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Extras = Extras(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): Extras = apply {
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

                return other is Extras && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "Extras{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Metadata &&
                behavior == other.behavior &&
                classification == other.classification &&
                extras == other.extras &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(behavior, classification, extras, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Metadata{behavior=$behavior, classification=$classification, extras=$extras, additionalProperties=$additionalProperties}"
    }

    class Output
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val availableModes: JsonField<List<String>>,
        private val description: JsonField<String>,
        private val valueSchema: JsonField<ValueSchema>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("available_modes")
            @ExcludeMissing
            availableModes: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("value_schema")
            @ExcludeMissing
            valueSchema: JsonField<ValueSchema> = JsonMissing.of(),
        ) : this(availableModes, description, valueSchema, mutableMapOf())

        /**
         * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun availableModes(): Optional<List<String>> = availableModes.getOptional("available_modes")

        /**
         * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun valueSchema(): Optional<ValueSchema> = valueSchema.getOptional("value_schema")

        /**
         * Returns the raw JSON value of [availableModes].
         *
         * Unlike [availableModes], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("available_modes")
        @ExcludeMissing
        fun _availableModes(): JsonField<List<String>> = availableModes

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [valueSchema].
         *
         * Unlike [valueSchema], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("value_schema")
        @ExcludeMissing
        fun _valueSchema(): JsonField<ValueSchema> = valueSchema

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

            /** Returns a mutable builder for constructing an instance of [Output]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Output]. */
        class Builder internal constructor() {

            private var availableModes: JsonField<MutableList<String>>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var valueSchema: JsonField<ValueSchema> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(output: Output) = apply {
                availableModes = output.availableModes.map { it.toMutableList() }
                description = output.description
                valueSchema = output.valueSchema
                additionalProperties = output.additionalProperties.toMutableMap()
            }

            fun availableModes(availableModes: List<String>) =
                availableModes(JsonField.of(availableModes))

            /**
             * Sets [Builder.availableModes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.availableModes] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun availableModes(availableModes: JsonField<List<String>>) = apply {
                this.availableModes = availableModes.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [availableModes].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAvailableMode(availableMode: String) = apply {
                availableModes =
                    (availableModes ?: JsonField.of(mutableListOf())).also {
                        checkKnown("availableModes", it).add(availableMode)
                    }
            }

            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            fun valueSchema(valueSchema: ValueSchema) = valueSchema(JsonField.of(valueSchema))

            /**
             * Sets [Builder.valueSchema] to an arbitrary JSON value.
             *
             * You should usually call [Builder.valueSchema] with a well-typed [ValueSchema] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun valueSchema(valueSchema: JsonField<ValueSchema>) = apply {
                this.valueSchema = valueSchema
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

            /**
             * Returns an immutable instance of [Output].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Output =
                Output(
                    (availableModes ?: JsonMissing.of()).map { it.toImmutable() },
                    description,
                    valueSchema,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Output = apply {
            if (validated) {
                return@apply
            }

            availableModes()
            description()
            valueSchema().ifPresent { it.validate() }
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
            (availableModes.asKnown().getOrNull()?.size ?: 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (valueSchema.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Output &&
                availableModes == other.availableModes &&
                description == other.description &&
                valueSchema == other.valueSchema &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(availableModes, description, valueSchema, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Output{availableModes=$availableModes, description=$description, valueSchema=$valueSchema, additionalProperties=$additionalProperties}"
    }

    class Requirements
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val authorization: JsonField<Authorization>,
        private val met: JsonField<Boolean>,
        private val secrets: JsonField<List<Secret>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("authorization")
            @ExcludeMissing
            authorization: JsonField<Authorization> = JsonMissing.of(),
            @JsonProperty("met") @ExcludeMissing met: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("secrets")
            @ExcludeMissing
            secrets: JsonField<List<Secret>> = JsonMissing.of(),
        ) : this(authorization, met, secrets, mutableMapOf())

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
         * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun secrets(): Optional<List<Secret>> = secrets.getOptional("secrets")

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

        /**
         * Returns the raw JSON value of [secrets].
         *
         * Unlike [secrets], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("secrets") @ExcludeMissing fun _secrets(): JsonField<List<Secret>> = secrets

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
            private var secrets: JsonField<MutableList<Secret>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(requirements: Requirements) = apply {
                authorization = requirements.authorization
                met = requirements.met
                secrets = requirements.secrets.map { it.toMutableList() }
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

            fun secrets(secrets: List<Secret>) = secrets(JsonField.of(secrets))

            /**
             * Sets [Builder.secrets] to an arbitrary JSON value.
             *
             * You should usually call [Builder.secrets] with a well-typed `List<Secret>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun secrets(secrets: JsonField<List<Secret>>) = apply {
                this.secrets = secrets.map { it.toMutableList() }
            }

            /**
             * Adds a single [Secret] to [secrets].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSecret(secret: Secret) = apply {
                secrets =
                    (secrets ?: JsonField.of(mutableListOf())).also {
                        checkKnown("secrets", it).add(secret)
                    }
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

            /**
             * Returns an immutable instance of [Requirements].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Requirements =
                Requirements(
                    authorization,
                    met,
                    (secrets ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Requirements = apply {
            if (validated) {
                return@apply
            }

            authorization().ifPresent { it.validate() }
            met()
            secrets().ifPresent { it.forEach { it.validate() } }
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
                (if (met.asKnown().isPresent) 1 else 0) +
                (secrets.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        class Authorization
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val oauth2: JsonField<Oauth2>,
            private val providerId: JsonField<String>,
            private val providerType: JsonField<String>,
            private val status: JsonField<Status>,
            private val statusReason: JsonField<String>,
            private val tokenStatus: JsonField<TokenStatus>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("oauth2")
                @ExcludeMissing
                oauth2: JsonField<Oauth2> = JsonMissing.of(),
                @JsonProperty("provider_id")
                @ExcludeMissing
                providerId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("provider_type")
                @ExcludeMissing
                providerType: JsonField<String> = JsonMissing.of(),
                @JsonProperty("status")
                @ExcludeMissing
                status: JsonField<Status> = JsonMissing.of(),
                @JsonProperty("status_reason")
                @ExcludeMissing
                statusReason: JsonField<String> = JsonMissing.of(),
                @JsonProperty("token_status")
                @ExcludeMissing
                tokenStatus: JsonField<TokenStatus> = JsonMissing.of(),
            ) : this(
                id,
                oauth2,
                providerId,
                providerType,
                status,
                statusReason,
                tokenStatus,
                mutableMapOf(),
            )

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun id(): Optional<String> = id.getOptional("id")

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun oauth2(): Optional<Oauth2> = oauth2.getOptional("oauth2")

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun providerId(): Optional<String> = providerId.getOptional("provider_id")

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun providerType(): Optional<String> = providerType.getOptional("provider_type")

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun status(): Optional<Status> = status.getOptional("status")

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun statusReason(): Optional<String> = statusReason.getOptional("status_reason")

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun tokenStatus(): Optional<TokenStatus> = tokenStatus.getOptional("token_status")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [oauth2].
             *
             * Unlike [oauth2], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("oauth2") @ExcludeMissing fun _oauth2(): JsonField<Oauth2> = oauth2

            /**
             * Returns the raw JSON value of [providerId].
             *
             * Unlike [providerId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("provider_id")
            @ExcludeMissing
            fun _providerId(): JsonField<String> = providerId

            /**
             * Returns the raw JSON value of [providerType].
             *
             * Unlike [providerType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("provider_type")
            @ExcludeMissing
            fun _providerType(): JsonField<String> = providerType

            /**
             * Returns the raw JSON value of [status].
             *
             * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

            /**
             * Returns the raw JSON value of [statusReason].
             *
             * Unlike [statusReason], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("status_reason")
            @ExcludeMissing
            fun _statusReason(): JsonField<String> = statusReason

            /**
             * Returns the raw JSON value of [tokenStatus].
             *
             * Unlike [tokenStatus], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("token_status")
            @ExcludeMissing
            fun _tokenStatus(): JsonField<TokenStatus> = tokenStatus

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

                private var id: JsonField<String> = JsonMissing.of()
                private var oauth2: JsonField<Oauth2> = JsonMissing.of()
                private var providerId: JsonField<String> = JsonMissing.of()
                private var providerType: JsonField<String> = JsonMissing.of()
                private var status: JsonField<Status> = JsonMissing.of()
                private var statusReason: JsonField<String> = JsonMissing.of()
                private var tokenStatus: JsonField<TokenStatus> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(authorization: Authorization) = apply {
                    id = authorization.id
                    oauth2 = authorization.oauth2
                    providerId = authorization.providerId
                    providerType = authorization.providerType
                    status = authorization.status
                    statusReason = authorization.statusReason
                    tokenStatus = authorization.tokenStatus
                    additionalProperties = authorization.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun oauth2(oauth2: Oauth2) = oauth2(JsonField.of(oauth2))

                /**
                 * Sets [Builder.oauth2] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.oauth2] with a well-typed [Oauth2] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun oauth2(oauth2: JsonField<Oauth2>) = apply { this.oauth2 = oauth2 }

                fun providerId(providerId: String) = providerId(JsonField.of(providerId))

                /**
                 * Sets [Builder.providerId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.providerId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun providerId(providerId: JsonField<String>) = apply {
                    this.providerId = providerId
                }

                fun providerType(providerType: String) = providerType(JsonField.of(providerType))

                /**
                 * Sets [Builder.providerType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.providerType] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun providerType(providerType: JsonField<String>) = apply {
                    this.providerType = providerType
                }

                fun status(status: Status) = status(JsonField.of(status))

                /**
                 * Sets [Builder.status] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.status] with a well-typed [Status] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun status(status: JsonField<Status>) = apply { this.status = status }

                fun statusReason(statusReason: String) = statusReason(JsonField.of(statusReason))

                /**
                 * Sets [Builder.statusReason] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.statusReason] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun statusReason(statusReason: JsonField<String>) = apply {
                    this.statusReason = statusReason
                }

                fun tokenStatus(tokenStatus: TokenStatus) = tokenStatus(JsonField.of(tokenStatus))

                /**
                 * Sets [Builder.tokenStatus] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tokenStatus] with a well-typed [TokenStatus]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun tokenStatus(tokenStatus: JsonField<TokenStatus>) = apply {
                    this.tokenStatus = tokenStatus
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
                 * Returns an immutable instance of [Authorization].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Authorization =
                    Authorization(
                        id,
                        oauth2,
                        providerId,
                        providerType,
                        status,
                        statusReason,
                        tokenStatus,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Authorization = apply {
                if (validated) {
                    return@apply
                }

                id()
                oauth2().ifPresent { it.validate() }
                providerId()
                providerType()
                status().ifPresent { it.validate() }
                statusReason()
                tokenStatus().ifPresent { it.validate() }
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
                (if (id.asKnown().isPresent) 1 else 0) +
                    (oauth2.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (providerId.asKnown().isPresent) 1 else 0) +
                    (if (providerType.asKnown().isPresent) 1 else 0) +
                    (status.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (statusReason.asKnown().isPresent) 1 else 0) +
                    (tokenStatus.asKnown().getOrNull()?.validity() ?: 0)

            class Oauth2
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val scopes: JsonField<List<String>>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("scopes")
                    @ExcludeMissing
                    scopes: JsonField<List<String>> = JsonMissing.of()
                ) : this(scopes, mutableMapOf())

                /**
                 * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun scopes(): Optional<List<String>> = scopes.getOptional("scopes")

                /**
                 * Returns the raw JSON value of [scopes].
                 *
                 * Unlike [scopes], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("scopes")
                @ExcludeMissing
                fun _scopes(): JsonField<List<String>> = scopes

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

                    private var scopes: JsonField<MutableList<String>>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(oauth2: Oauth2) = apply {
                        scopes = oauth2.scopes.map { it.toMutableList() }
                        additionalProperties = oauth2.additionalProperties.toMutableMap()
                    }

                    fun scopes(scopes: List<String>) = scopes(JsonField.of(scopes))

                    /**
                     * Sets [Builder.scopes] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.scopes] with a well-typed `List<String>`
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
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
                            (scopes ?: JsonMissing.of()).map { it.toImmutable() },
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Oauth2 = apply {
                    if (validated) {
                        return@apply
                    }

                    scopes()
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
                internal fun validity(): Int = (scopes.asKnown().getOrNull()?.size ?: 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Oauth2 &&
                        scopes == other.scopes &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(scopes, additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Oauth2{scopes=$scopes, additionalProperties=$additionalProperties}"
            }

            class Status @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val ACTIVE = of("active")

                    @JvmField val INACTIVE = of("inactive")

                    @JvmStatic fun of(value: String) = Status(JsonField.of(value))
                }

                /** An enum containing [Status]'s known values. */
                enum class Known {
                    ACTIVE,
                    INACTIVE,
                }

                /**
                 * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Status] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ACTIVE,
                    INACTIVE,
                    /**
                     * An enum member indicating that [Status] was instantiated with an unknown
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
                        ACTIVE -> Value.ACTIVE
                        INACTIVE -> Value.INACTIVE
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
                        ACTIVE -> Known.ACTIVE
                        INACTIVE -> Known.INACTIVE
                        else -> throw ArcadeInvalidDataException("Unknown Status: $value")
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

                fun validate(): Status = apply {
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

                    return other is Status && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class TokenStatus
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

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

                    @JvmField val NOT_STARTED = of("not_started")

                    @JvmField val PENDING = of("pending")

                    @JvmField val COMPLETED = of("completed")

                    @JvmField val FAILED = of("failed")

                    @JvmStatic fun of(value: String) = TokenStatus(JsonField.of(value))
                }

                /** An enum containing [TokenStatus]'s known values. */
                enum class Known {
                    NOT_STARTED,
                    PENDING,
                    COMPLETED,
                    FAILED,
                }

                /**
                 * An enum containing [TokenStatus]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [TokenStatus] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    NOT_STARTED,
                    PENDING,
                    COMPLETED,
                    FAILED,
                    /**
                     * An enum member indicating that [TokenStatus] was instantiated with an unknown
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
                        NOT_STARTED -> Value.NOT_STARTED
                        PENDING -> Value.PENDING
                        COMPLETED -> Value.COMPLETED
                        FAILED -> Value.FAILED
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
                        NOT_STARTED -> Known.NOT_STARTED
                        PENDING -> Known.PENDING
                        COMPLETED -> Known.COMPLETED
                        FAILED -> Known.FAILED
                        else -> throw ArcadeInvalidDataException("Unknown TokenStatus: $value")
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

                fun validate(): TokenStatus = apply {
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

                    return other is TokenStatus && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Authorization &&
                    id == other.id &&
                    oauth2 == other.oauth2 &&
                    providerId == other.providerId &&
                    providerType == other.providerType &&
                    status == other.status &&
                    statusReason == other.statusReason &&
                    tokenStatus == other.tokenStatus &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    id,
                    oauth2,
                    providerId,
                    providerType,
                    status,
                    statusReason,
                    tokenStatus,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Authorization{id=$id, oauth2=$oauth2, providerId=$providerId, providerType=$providerType, status=$status, statusReason=$statusReason, tokenStatus=$tokenStatus, additionalProperties=$additionalProperties}"
        }

        class Secret
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val key: JsonField<String>,
            private val met: JsonField<Boolean>,
            private val statusReason: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("key") @ExcludeMissing key: JsonField<String> = JsonMissing.of(),
                @JsonProperty("met") @ExcludeMissing met: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("status_reason")
                @ExcludeMissing
                statusReason: JsonField<String> = JsonMissing.of(),
            ) : this(key, met, statusReason, mutableMapOf())

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun key(): String = key.getRequired("key")

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun met(): Optional<Boolean> = met.getOptional("met")

            /**
             * @throws ArcadeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun statusReason(): Optional<String> = statusReason.getOptional("status_reason")

            /**
             * Returns the raw JSON value of [key].
             *
             * Unlike [key], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("key") @ExcludeMissing fun _key(): JsonField<String> = key

            /**
             * Returns the raw JSON value of [met].
             *
             * Unlike [met], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("met") @ExcludeMissing fun _met(): JsonField<Boolean> = met

            /**
             * Returns the raw JSON value of [statusReason].
             *
             * Unlike [statusReason], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("status_reason")
            @ExcludeMissing
            fun _statusReason(): JsonField<String> = statusReason

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
                 * Returns a mutable builder for constructing an instance of [Secret].
                 *
                 * The following fields are required:
                 * ```java
                 * .key()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Secret]. */
            class Builder internal constructor() {

                private var key: JsonField<String>? = null
                private var met: JsonField<Boolean> = JsonMissing.of()
                private var statusReason: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(secret: Secret) = apply {
                    key = secret.key
                    met = secret.met
                    statusReason = secret.statusReason
                    additionalProperties = secret.additionalProperties.toMutableMap()
                }

                fun key(key: String) = key(JsonField.of(key))

                /**
                 * Sets [Builder.key] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.key] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun key(key: JsonField<String>) = apply { this.key = key }

                fun met(met: Boolean) = met(JsonField.of(met))

                /**
                 * Sets [Builder.met] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.met] with a well-typed [Boolean] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun met(met: JsonField<Boolean>) = apply { this.met = met }

                fun statusReason(statusReason: String) = statusReason(JsonField.of(statusReason))

                /**
                 * Sets [Builder.statusReason] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.statusReason] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun statusReason(statusReason: JsonField<String>) = apply {
                    this.statusReason = statusReason
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
                 * Returns an immutable instance of [Secret].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .key()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Secret =
                    Secret(
                        checkRequired("key", key),
                        met,
                        statusReason,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Secret = apply {
                if (validated) {
                    return@apply
                }

                key()
                met()
                statusReason()
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
                (if (key.asKnown().isPresent) 1 else 0) +
                    (if (met.asKnown().isPresent) 1 else 0) +
                    (if (statusReason.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Secret &&
                    key == other.key &&
                    met == other.met &&
                    statusReason == other.statusReason &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(key, met, statusReason, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Secret{key=$key, met=$met, statusReason=$statusReason, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Requirements &&
                authorization == other.authorization &&
                met == other.met &&
                secrets == other.secrets &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(authorization, met, secrets, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Requirements{authorization=$authorization, met=$met, secrets=$secrets, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ToolDefinition &&
            fullyQualifiedName == other.fullyQualifiedName &&
            input == other.input &&
            name == other.name &&
            qualifiedName == other.qualifiedName &&
            toolkit == other.toolkit &&
            description == other.description &&
            formattedSchema == other.formattedSchema &&
            metadata == other.metadata &&
            output == other.output &&
            requirements == other.requirements &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            fullyQualifiedName,
            input,
            name,
            qualifiedName,
            toolkit,
            description,
            formattedSchema,
            metadata,
            output,
            requirements,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ToolDefinition{fullyQualifiedName=$fullyQualifiedName, input=$input, name=$name, qualifiedName=$qualifiedName, toolkit=$toolkit, description=$description, formattedSchema=$formattedSchema, metadata=$metadata, output=$output, requirements=$requirements, additionalProperties=$additionalProperties}"
}
