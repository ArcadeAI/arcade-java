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
class ToolDefinition
@JsonCreator
private constructor(
    @JsonProperty("input") @ExcludeMissing private val input: JsonField<Input> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("toolkit")
    @ExcludeMissing
    private val toolkit: JsonField<Toolkit> = JsonMissing.of(),
    @JsonProperty("description")
    @ExcludeMissing
    private val description: JsonField<String> = JsonMissing.of(),
    @JsonProperty("fully_qualified_name")
    @ExcludeMissing
    private val fullyQualifiedName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("output")
    @ExcludeMissing
    private val output: JsonField<Output> = JsonMissing.of(),
    @JsonProperty("requirements")
    @ExcludeMissing
    private val requirements: JsonField<Requirements> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun input(): Input = input.getRequired("input")

    fun name(): String = name.getRequired("name")

    fun toolkit(): Toolkit = toolkit.getRequired("toolkit")

    fun description(): Optional<String> =
        Optional.ofNullable(description.getNullable("description"))

    fun fullyQualifiedName(): Optional<String> =
        Optional.ofNullable(fullyQualifiedName.getNullable("fully_qualified_name"))

    fun output(): Optional<Output> = Optional.ofNullable(output.getNullable("output"))

    fun requirements(): Optional<Requirements> =
        Optional.ofNullable(requirements.getNullable("requirements"))

    @JsonProperty("input") @ExcludeMissing fun _input(): JsonField<Input> = input

    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    @JsonProperty("toolkit") @ExcludeMissing fun _toolkit(): JsonField<Toolkit> = toolkit

    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    @JsonProperty("fully_qualified_name")
    @ExcludeMissing
    fun _fullyQualifiedName(): JsonField<String> = fullyQualifiedName

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

        input().validate()
        name()
        toolkit().validate()
        description()
        fullyQualifiedName()
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

        private var input: JsonField<Input>? = null
        private var name: JsonField<String>? = null
        private var toolkit: JsonField<Toolkit>? = null
        private var description: JsonField<String> = JsonMissing.of()
        private var fullyQualifiedName: JsonField<String> = JsonMissing.of()
        private var output: JsonField<Output> = JsonMissing.of()
        private var requirements: JsonField<Requirements> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(toolDefinition: ToolDefinition) = apply {
            input = toolDefinition.input
            name = toolDefinition.name
            toolkit = toolDefinition.toolkit
            description = toolDefinition.description
            fullyQualifiedName = toolDefinition.fullyQualifiedName
            output = toolDefinition.output
            requirements = toolDefinition.requirements
            additionalProperties = toolDefinition.additionalProperties.toMutableMap()
        }

        fun input(input: Input) = input(JsonField.of(input))

        fun input(input: JsonField<Input>) = apply { this.input = input }

        fun name(name: String) = name(JsonField.of(name))

        fun name(name: JsonField<String>) = apply { this.name = name }

        fun toolkit(toolkit: Toolkit) = toolkit(JsonField.of(toolkit))

        fun toolkit(toolkit: JsonField<Toolkit>) = apply { this.toolkit = toolkit }

        fun description(description: String) = description(JsonField.of(description))

        fun description(description: JsonField<String>) = apply { this.description = description }

        fun fullyQualifiedName(fullyQualifiedName: String) =
            fullyQualifiedName(JsonField.of(fullyQualifiedName))

        fun fullyQualifiedName(fullyQualifiedName: JsonField<String>) = apply {
            this.fullyQualifiedName = fullyQualifiedName
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
                checkRequired("input", input),
                checkRequired("name", name),
                checkRequired("toolkit", toolkit),
                description,
                fullyQualifiedName,
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
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun authorization(): Optional<Authorization> =
            Optional.ofNullable(authorization.getNullable("authorization"))

        @JsonProperty("authorization")
        @ExcludeMissing
        fun _authorization(): JsonField<Authorization> = authorization

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Requirements = apply {
            if (validated) {
                return@apply
            }

            authorization().ifPresent { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Requirements]. */
        class Builder internal constructor() {

            private var authorization: JsonField<Authorization> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(requirements: Requirements) = apply {
                authorization = requirements.authorization
                additionalProperties = requirements.additionalProperties.toMutableMap()
            }

            fun authorization(authorization: Authorization) =
                authorization(JsonField.of(authorization))

            fun authorization(authorization: JsonField<Authorization>) = apply {
                this.authorization = authorization
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
                Requirements(authorization, additionalProperties.toImmutable())
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
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun id(): Optional<String> = Optional.ofNullable(id.getNullable("id"))

            fun oauth2(): Optional<Oauth2> = Optional.ofNullable(oauth2.getNullable("oauth2"))

            fun providerId(): Optional<String> =
                Optional.ofNullable(providerId.getNullable("provider_id"))

            fun providerType(): Optional<String> =
                Optional.ofNullable(providerType.getNullable("provider_type"))

            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            @JsonProperty("oauth2") @ExcludeMissing fun _oauth2(): JsonField<Oauth2> = oauth2

            @JsonProperty("provider_id")
            @ExcludeMissing
            fun _providerId(): JsonField<String> = providerId

            @JsonProperty("provider_type")
            @ExcludeMissing
            fun _providerType(): JsonField<String> = providerType

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
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(authorization: Authorization) = apply {
                    id = authorization.id
                    oauth2 = authorization.oauth2
                    providerId = authorization.providerId
                    providerType = authorization.providerType
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Authorization && id == other.id && oauth2 == other.oauth2 && providerId == other.providerId && providerType == other.providerType && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, oauth2, providerId, providerType, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Authorization{id=$id, oauth2=$oauth2, providerId=$providerId, providerType=$providerType, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Requirements && authorization == other.authorization && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(authorization, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Requirements{authorization=$authorization, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ToolDefinition && input == other.input && name == other.name && toolkit == other.toolkit && description == other.description && fullyQualifiedName == other.fullyQualifiedName && output == other.output && requirements == other.requirements && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(input, name, toolkit, description, fullyQualifiedName, output, requirements, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ToolDefinition{input=$input, name=$name, toolkit=$toolkit, description=$description, fullyQualifiedName=$fullyQualifiedName, output=$output, requirements=$requirements, additionalProperties=$additionalProperties}"
}
