// File generated from our OpenAPI spec by Stainless.

package com.arcade_engine.api.models

import com.arcade_engine.api.core.Enum
import com.arcade_engine.api.core.ExcludeMissing
import com.arcade_engine.api.core.JsonField
import com.arcade_engine.api.core.JsonMissing
import com.arcade_engine.api.core.JsonValue
import com.arcade_engine.api.core.NoAutoDetect
import com.arcade_engine.api.core.checkRequired
import com.arcade_engine.api.core.immutableEmptyMap
import com.arcade_engine.api.core.toImmutable
import com.arcade_engine.api.errors.ArcadeInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class ToolDefinition
@JsonCreator
private constructor(
    @JsonProperty("fully_qualified_name")
    @ExcludeMissing
    private val fullyQualifiedName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("input") @ExcludeMissing private val input: JsonField<Input> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("qualified_name")
    @ExcludeMissing
    private val qualifiedName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("toolkit")
    @ExcludeMissing
    private val toolkit: JsonField<Toolkit> = JsonMissing.of(),
    @JsonProperty("description")
    @ExcludeMissing
    private val description: JsonField<String> = JsonMissing.of(),
    @JsonProperty("formatted_schema")
    @ExcludeMissing
    private val formattedSchema: JsonField<FormattedSchema> = JsonMissing.of(),
    @JsonProperty("output")
    @ExcludeMissing
    private val output: JsonField<Output> = JsonMissing.of(),
    @JsonProperty("requirements")
    @ExcludeMissing
    private val requirements: JsonField<Requirements> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun fullyQualifiedName(): String = fullyQualifiedName.getRequired("fully_qualified_name")

    fun input(): Input = input.getRequired("input")

    fun name(): String = name.getRequired("name")

    fun qualifiedName(): String = qualifiedName.getRequired("qualified_name")

    fun toolkit(): Toolkit = toolkit.getRequired("toolkit")

    fun description(): Optional<String> =
        Optional.ofNullable(description.getNullable("description"))

    fun formattedSchema(): Optional<FormattedSchema> =
        Optional.ofNullable(formattedSchema.getNullable("formatted_schema"))

    fun output(): Optional<Output> = Optional.ofNullable(output.getNullable("output"))

    fun requirements(): Optional<Requirements> =
        Optional.ofNullable(requirements.getNullable("requirements"))

    @JsonProperty("fully_qualified_name")
    @ExcludeMissing
    fun _fullyQualifiedName(): JsonField<String> = fullyQualifiedName

    @JsonProperty("input") @ExcludeMissing fun _input(): JsonField<Input> = input

    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    @JsonProperty("qualified_name")
    @ExcludeMissing
    fun _qualifiedName(): JsonField<String> = qualifiedName

    @JsonProperty("toolkit") @ExcludeMissing fun _toolkit(): JsonField<Toolkit> = toolkit

    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    @JsonProperty("formatted_schema")
    @ExcludeMissing
    fun _formattedSchema(): JsonField<FormattedSchema> = formattedSchema

    @JsonProperty("output") @ExcludeMissing fun _output(): JsonField<Output> = output

    @JsonProperty("requirements")
    @ExcludeMissing
    fun _requirements(): JsonField<Requirements> = requirements

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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
        output().ifPresent { it.validate() }
        requirements().ifPresent { it.validate() }
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

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
            output = toolDefinition.output
            requirements = toolDefinition.requirements
            additionalProperties = toolDefinition.additionalProperties.toMutableMap()
        }

        fun fullyQualifiedName(fullyQualifiedName: String) =
            fullyQualifiedName(JsonField.of(fullyQualifiedName))

        fun fullyQualifiedName(fullyQualifiedName: JsonField<String>) = apply {
            this.fullyQualifiedName = fullyQualifiedName
        }

        fun input(input: Input) = input(JsonField.of(input))

        fun input(input: JsonField<Input>) = apply { this.input = input }

        fun name(name: String) = name(JsonField.of(name))

        fun name(name: JsonField<String>) = apply { this.name = name }

        fun qualifiedName(qualifiedName: String) = qualifiedName(JsonField.of(qualifiedName))

        fun qualifiedName(qualifiedName: JsonField<String>) = apply {
            this.qualifiedName = qualifiedName
        }

        fun toolkit(toolkit: Toolkit) = toolkit(JsonField.of(toolkit))

        fun toolkit(toolkit: JsonField<Toolkit>) = apply { this.toolkit = toolkit }

        fun description(description: String) = description(JsonField.of(description))

        fun description(description: JsonField<String>) = apply { this.description = description }

        fun formattedSchema(formattedSchema: FormattedSchema) =
            formattedSchema(JsonField.of(formattedSchema))

        fun formattedSchema(formattedSchema: JsonField<FormattedSchema>) = apply {
            this.formattedSchema = formattedSchema
        }

        fun output(output: Output) = output(JsonField.of(output))

        fun output(output: JsonField<Output>) = apply { this.output = output }

        fun requirements(requirements: Requirements) = requirements(JsonField.of(requirements))

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

        fun build(): ToolDefinition =
            ToolDefinition(
                checkRequired("fullyQualifiedName", fullyQualifiedName),
                checkRequired("input", input),
                checkRequired("name", name),
                checkRequired("qualifiedName", qualifiedName),
                checkRequired("toolkit", toolkit),
                description,
                formattedSchema,
                output,
                requirements,
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class Input
    @JsonCreator
    private constructor(
        @JsonProperty("parameters")
        @ExcludeMissing
        private val parameters: JsonField<List<Parameter>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun parameters(): Optional<List<Parameter>> =
            Optional.ofNullable(parameters.getNullable("parameters"))

        @JsonProperty("parameters")
        @ExcludeMissing
        fun _parameters(): JsonField<List<Parameter>> = parameters

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Input = apply {
            if (validated) {
                return@apply
            }

            parameters().ifPresent { it.forEach { it.validate() } }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

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

            fun parameters(parameters: JsonField<List<Parameter>>) = apply {
                this.parameters = parameters.map { it.toMutableList() }
            }

            fun addParameter(parameter: Parameter) = apply {
                parameters =
                    (parameters ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(parameter)
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

            fun build(): Input =
                Input(
                    (parameters ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class Parameter
        @JsonCreator
        private constructor(
            @JsonProperty("name")
            @ExcludeMissing
            private val name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("value_schema")
            @ExcludeMissing
            private val valueSchema: JsonField<ValueSchema> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            private val description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("inferrable")
            @ExcludeMissing
            private val inferrable: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("required")
            @ExcludeMissing
            private val required: JsonField<Boolean> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun name(): String = name.getRequired("name")

            fun valueSchema(): ValueSchema = valueSchema.getRequired("value_schema")

            fun description(): Optional<String> =
                Optional.ofNullable(description.getNullable("description"))

            fun inferrable(): Optional<Boolean> =
                Optional.ofNullable(inferrable.getNullable("inferrable"))

            fun required(): Optional<Boolean> =
                Optional.ofNullable(required.getNullable("required"))

            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            @JsonProperty("value_schema")
            @ExcludeMissing
            fun _valueSchema(): JsonField<ValueSchema> = valueSchema

            @JsonProperty("description")
            @ExcludeMissing
            fun _description(): JsonField<String> = description

            @JsonProperty("inferrable")
            @ExcludeMissing
            fun _inferrable(): JsonField<Boolean> = inferrable

            @JsonProperty("required") @ExcludeMissing fun _required(): JsonField<Boolean> = required

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

            fun toBuilder() = Builder().from(this)

            companion object {

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

                fun name(name: JsonField<String>) = apply { this.name = name }

                fun valueSchema(valueSchema: ValueSchema) = valueSchema(JsonField.of(valueSchema))

                fun valueSchema(valueSchema: JsonField<ValueSchema>) = apply {
                    this.valueSchema = valueSchema
                }

                fun description(description: String) = description(JsonField.of(description))

                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                fun inferrable(inferrable: Boolean) = inferrable(JsonField.of(inferrable))

                fun inferrable(inferrable: JsonField<Boolean>) = apply {
                    this.inferrable = inferrable
                }

                fun required(required: Boolean) = required(JsonField.of(required))

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

                fun build(): Parameter =
                    Parameter(
                        checkRequired("name", name),
                        checkRequired("valueSchema", valueSchema),
                        description,
                        inferrable,
                        required,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Parameter && name == other.name && valueSchema == other.valueSchema && description == other.description && inferrable == other.inferrable && required == other.required && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(name, valueSchema, description, inferrable, required, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Parameter{name=$name, valueSchema=$valueSchema, description=$description, inferrable=$inferrable, required=$required, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Input && parameters == other.parameters && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(parameters, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Input{parameters=$parameters, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class Toolkit
    @JsonCreator
    private constructor(
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("version")
        @ExcludeMissing
        private val version: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun name(): String = name.getRequired("name")

        fun description(): Optional<String> =
            Optional.ofNullable(description.getNullable("description"))

        fun version(): Optional<String> = Optional.ofNullable(version.getNullable("version"))

        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<String> = version

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

        fun toBuilder() = Builder().from(this)

        companion object {

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

            fun name(name: JsonField<String>) = apply { this.name = name }

            fun description(description: String) = description(JsonField.of(description))

            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            fun version(version: String) = version(JsonField.of(version))

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

            fun build(): Toolkit =
                Toolkit(
                    checkRequired("name", name),
                    description,
                    version,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Toolkit && name == other.name && description == other.description && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(name, description, version, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Toolkit{name=$name, description=$description, version=$version, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class FormattedSchema
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): FormattedSchema = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

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

            fun build(): FormattedSchema = FormattedSchema(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is FormattedSchema && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "FormattedSchema{additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class Output
    @JsonCreator
    private constructor(
        @JsonProperty("available_modes")
        @ExcludeMissing
        private val availableModes: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("value_schema")
        @ExcludeMissing
        private val valueSchema: JsonField<ValueSchema> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun availableModes(): Optional<List<String>> =
            Optional.ofNullable(availableModes.getNullable("available_modes"))

        fun description(): Optional<String> =
            Optional.ofNullable(description.getNullable("description"))

        fun valueSchema(): Optional<ValueSchema> =
            Optional.ofNullable(valueSchema.getNullable("value_schema"))

        @JsonProperty("available_modes")
        @ExcludeMissing
        fun _availableModes(): JsonField<List<String>> = availableModes

        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        @JsonProperty("value_schema")
        @ExcludeMissing
        fun _valueSchema(): JsonField<ValueSchema> = valueSchema

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

        fun toBuilder() = Builder().from(this)

        companion object {

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

            fun availableModes(availableModes: JsonField<List<String>>) = apply {
                this.availableModes = availableModes.map { it.toMutableList() }
            }

            fun addAvailableMode(availableMode: String) = apply {
                availableModes =
                    (availableModes ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(availableMode)
                    }
            }

            fun description(description: String) = description(JsonField.of(description))

            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            fun valueSchema(valueSchema: ValueSchema) = valueSchema(JsonField.of(valueSchema))

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

            fun build(): Output =
                Output(
                    (availableModes ?: JsonMissing.of()).map { it.toImmutable() },
                    description,
                    valueSchema,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Output && availableModes == other.availableModes && description == other.description && valueSchema == other.valueSchema && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(availableModes, description, valueSchema, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Output{availableModes=$availableModes, description=$description, valueSchema=$valueSchema, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class Requirements
    @JsonCreator
    private constructor(
        @JsonProperty("authorization")
        @ExcludeMissing
        private val authorization: JsonField<Authorization> = JsonMissing.of(),
        @JsonProperty("met") @ExcludeMissing private val met: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("secrets")
        @ExcludeMissing
        private val secrets: JsonField<List<Secret>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun authorization(): Optional<Authorization> =
            Optional.ofNullable(authorization.getNullable("authorization"))

        fun met(): Optional<Boolean> = Optional.ofNullable(met.getNullable("met"))

        fun secrets(): Optional<List<Secret>> = Optional.ofNullable(secrets.getNullable("secrets"))

        @JsonProperty("authorization")
        @ExcludeMissing
        fun _authorization(): JsonField<Authorization> = authorization

        @JsonProperty("met") @ExcludeMissing fun _met(): JsonField<Boolean> = met

        @JsonProperty("secrets") @ExcludeMissing fun _secrets(): JsonField<List<Secret>> = secrets

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
            secrets().ifPresent { it.forEach { it.validate() } }
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

            fun authorization(authorization: JsonField<Authorization>) = apply {
                this.authorization = authorization
            }

            fun met(met: Boolean) = met(JsonField.of(met))

            fun met(met: JsonField<Boolean>) = apply { this.met = met }

            fun secrets(secrets: List<Secret>) = secrets(JsonField.of(secrets))

            fun secrets(secrets: JsonField<List<Secret>>) = apply {
                this.secrets = secrets.map { it.toMutableList() }
            }

            fun addSecret(secret: Secret) = apply {
                secrets =
                    (secrets ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(secret)
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

            fun build(): Requirements =
                Requirements(
                    authorization,
                    met,
                    (secrets ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class Authorization
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("oauth2")
            @ExcludeMissing
            private val oauth2: JsonField<Oauth2> = JsonMissing.of(),
            @JsonProperty("provider_id")
            @ExcludeMissing
            private val providerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("provider_type")
            @ExcludeMissing
            private val providerType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status")
            @ExcludeMissing
            private val status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("status_reason")
            @ExcludeMissing
            private val statusReason: JsonField<String> = JsonMissing.of(),
            @JsonProperty("token_status")
            @ExcludeMissing
            private val tokenStatus: JsonField<TokenStatus> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun id(): Optional<String> = Optional.ofNullable(id.getNullable("id"))

            fun oauth2(): Optional<Oauth2> = Optional.ofNullable(oauth2.getNullable("oauth2"))

            fun providerId(): Optional<String> =
                Optional.ofNullable(providerId.getNullable("provider_id"))

            fun providerType(): Optional<String> =
                Optional.ofNullable(providerType.getNullable("provider_type"))

            fun status(): Optional<Status> = Optional.ofNullable(status.getNullable("status"))

            fun statusReason(): Optional<String> =
                Optional.ofNullable(statusReason.getNullable("status_reason"))

            fun tokenStatus(): Optional<TokenStatus> =
                Optional.ofNullable(tokenStatus.getNullable("token_status"))

            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            @JsonProperty("oauth2") @ExcludeMissing fun _oauth2(): JsonField<Oauth2> = oauth2

            @JsonProperty("provider_id")
            @ExcludeMissing
            fun _providerId(): JsonField<String> = providerId

            @JsonProperty("provider_type")
            @ExcludeMissing
            fun _providerType(): JsonField<String> = providerType

            @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

            @JsonProperty("status_reason")
            @ExcludeMissing
            fun _statusReason(): JsonField<String> = statusReason

            @JsonProperty("token_status")
            @ExcludeMissing
            fun _tokenStatus(): JsonField<TokenStatus> = tokenStatus

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Authorization = apply {
                if (validated) {
                    return@apply
                }

                id()
                oauth2().ifPresent { it.validate() }
                providerId()
                providerType()
                status()
                statusReason()
                tokenStatus()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

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

                fun id(id: JsonField<String>) = apply { this.id = id }

                fun oauth2(oauth2: Oauth2) = oauth2(JsonField.of(oauth2))

                fun oauth2(oauth2: JsonField<Oauth2>) = apply { this.oauth2 = oauth2 }

                fun providerId(providerId: String) = providerId(JsonField.of(providerId))

                fun providerId(providerId: JsonField<String>) = apply {
                    this.providerId = providerId
                }

                fun providerType(providerType: String) = providerType(JsonField.of(providerType))

                fun providerType(providerType: JsonField<String>) = apply {
                    this.providerType = providerType
                }

                fun status(status: Status) = status(JsonField.of(status))

                fun status(status: JsonField<Status>) = apply { this.status = status }

                fun statusReason(statusReason: String) = statusReason(JsonField.of(statusReason))

                fun statusReason(statusReason: JsonField<String>) = apply {
                    this.statusReason = statusReason
                }

                fun tokenStatus(tokenStatus: TokenStatus) = tokenStatus(JsonField.of(tokenStatus))

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

                fun build(): Authorization =
                    Authorization(
                        id,
                        oauth2,
                        providerId,
                        providerType,
                        status,
                        statusReason,
                        tokenStatus,
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class Oauth2
            @JsonCreator
            private constructor(
                @JsonProperty("scopes")
                @ExcludeMissing
                private val scopes: JsonField<List<String>> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun scopes(): Optional<List<String>> =
                    Optional.ofNullable(scopes.getNullable("scopes"))

                @JsonProperty("scopes")
                @ExcludeMissing
                fun _scopes(): JsonField<List<String>> = scopes

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Oauth2 = apply {
                    if (validated) {
                        return@apply
                    }

                    scopes()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

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

                    fun scopes(scopes: JsonField<List<String>>) = apply {
                        this.scopes = scopes.map { it.toMutableList() }
                    }

                    fun addScope(scope: String) = apply {
                        scopes =
                            (scopes ?: JsonField.of(mutableListOf())).apply {
                                asKnown()
                                    .orElseThrow {
                                        IllegalStateException(
                                            "Field was set to non-list type: ${javaClass.simpleName}"
                                        )
                                    }
                                    .add(scope)
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

                    fun build(): Oauth2 =
                        Oauth2(
                            (scopes ?: JsonMissing.of()).map { it.toImmutable() },
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Oauth2 && scopes == other.scopes && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(scopes, additionalProperties) }
                /* spotless:on */

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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Status && value == other.value /* spotless:on */
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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is TokenStatus && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Authorization && id == other.id && oauth2 == other.oauth2 && providerId == other.providerId && providerType == other.providerType && status == other.status && statusReason == other.statusReason && tokenStatus == other.tokenStatus && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, oauth2, providerId, providerType, status, statusReason, tokenStatus, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Authorization{id=$id, oauth2=$oauth2, providerId=$providerId, providerType=$providerType, status=$status, statusReason=$statusReason, tokenStatus=$tokenStatus, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class Secret
        @JsonCreator
        private constructor(
            @JsonProperty("key")
            @ExcludeMissing
            private val key: JsonField<String> = JsonMissing.of(),
            @JsonProperty("met")
            @ExcludeMissing
            private val met: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("status_reason")
            @ExcludeMissing
            private val statusReason: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun key(): String = key.getRequired("key")

            fun met(): Optional<Boolean> = Optional.ofNullable(met.getNullable("met"))

            fun statusReason(): Optional<String> =
                Optional.ofNullable(statusReason.getNullable("status_reason"))

            @JsonProperty("key") @ExcludeMissing fun _key(): JsonField<String> = key

            @JsonProperty("met") @ExcludeMissing fun _met(): JsonField<Boolean> = met

            @JsonProperty("status_reason")
            @ExcludeMissing
            fun _statusReason(): JsonField<String> = statusReason

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

            fun toBuilder() = Builder().from(this)

            companion object {

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

                fun key(key: JsonField<String>) = apply { this.key = key }

                fun met(met: Boolean) = met(JsonField.of(met))

                fun met(met: JsonField<Boolean>) = apply { this.met = met }

                fun statusReason(statusReason: String) = statusReason(JsonField.of(statusReason))

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

                fun build(): Secret =
                    Secret(
                        checkRequired("key", key),
                        met,
                        statusReason,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Secret && key == other.key && met == other.met && statusReason == other.statusReason && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(key, met, statusReason, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Secret{key=$key, met=$met, statusReason=$statusReason, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Requirements && authorization == other.authorization && met == other.met && secrets == other.secrets && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(authorization, met, secrets, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Requirements{authorization=$authorization, met=$met, secrets=$secrets, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ToolDefinition && fullyQualifiedName == other.fullyQualifiedName && input == other.input && name == other.name && qualifiedName == other.qualifiedName && toolkit == other.toolkit && description == other.description && formattedSchema == other.formattedSchema && output == other.output && requirements == other.requirements && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(fullyQualifiedName, input, name, qualifiedName, toolkit, description, formattedSchema, output, requirements, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ToolDefinition{fullyQualifiedName=$fullyQualifiedName, input=$input, name=$name, qualifiedName=$qualifiedName, toolkit=$toolkit, description=$description, formattedSchema=$formattedSchema, output=$output, requirements=$requirements, additionalProperties=$additionalProperties}"
}
