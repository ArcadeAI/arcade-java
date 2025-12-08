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
import dev.arcade.core.checkRequired
import dev.arcade.core.immutableEmptyMap
import dev.arcade.core.toImmutable
import dev.arcade.errors.ArcadeInvalidDataException
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class ChatMessage
@JsonCreator
private constructor(
    @JsonProperty("content")
    @ExcludeMissing
    private val content: JsonField<String> = JsonMissing.of(),
    @JsonProperty("role") @ExcludeMissing private val role: JsonField<String> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("tool_call_id")
    @ExcludeMissing
    private val toolCallId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("tool_calls")
    @ExcludeMissing
    private val toolCalls: JsonField<List<ToolCall>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The content of the message. */
    fun content(): String = content.getRequired("content")

    /** The role of the author of this message. One of system, user, tool, or assistant. */
    fun role(): String = role.getRequired("role")

    /** tool Name */
    fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

    /** tool_call_id */
    fun toolCallId(): Optional<String> = Optional.ofNullable(toolCallId.getNullable("tool_call_id"))

    /** tool calls if any */
    fun toolCalls(): Optional<List<ToolCall>> =
        Optional.ofNullable(toolCalls.getNullable("tool_calls"))

    /** The content of the message. */
    @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<String> = content

    /** The role of the author of this message. One of system, user, tool, or assistant. */
    @JsonProperty("role") @ExcludeMissing fun _role(): JsonField<String> = role

    /** tool Name */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /** tool_call_id */
    @JsonProperty("tool_call_id") @ExcludeMissing fun _toolCallId(): JsonField<String> = toolCallId

    /** tool calls if any */
    @JsonProperty("tool_calls")
    @ExcludeMissing
    fun _toolCalls(): JsonField<List<ToolCall>> = toolCalls

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ChatMessage = apply {
        if (validated) {
            return@apply
        }

        content()
        role()
        name()
        toolCallId()
        toolCalls().ifPresent { it.forEach { it.validate() } }
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ChatMessage]. */
    class Builder internal constructor() {

        private var content: JsonField<String>? = null
        private var role: JsonField<String>? = null
        private var name: JsonField<String> = JsonMissing.of()
        private var toolCallId: JsonField<String> = JsonMissing.of()
        private var toolCalls: JsonField<MutableList<ToolCall>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(chatMessage: ChatMessage) = apply {
            content = chatMessage.content
            role = chatMessage.role
            name = chatMessage.name
            toolCallId = chatMessage.toolCallId
            toolCalls = chatMessage.toolCalls.map { it.toMutableList() }
            additionalProperties = chatMessage.additionalProperties.toMutableMap()
        }

        /** The content of the message. */
        fun content(content: String) = content(JsonField.of(content))

        /** The content of the message. */
        fun content(content: JsonField<String>) = apply { this.content = content }

        /** The role of the author of this message. One of system, user, tool, or assistant. */
        fun role(role: String) = role(JsonField.of(role))

        /** The role of the author of this message. One of system, user, tool, or assistant. */
        fun role(role: JsonField<String>) = apply { this.role = role }

        /** tool Name */
        fun name(name: String) = name(JsonField.of(name))

        /** tool Name */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** tool_call_id */
        fun toolCallId(toolCallId: String) = toolCallId(JsonField.of(toolCallId))

        /** tool_call_id */
        fun toolCallId(toolCallId: JsonField<String>) = apply { this.toolCallId = toolCallId }

        /** tool calls if any */
        fun toolCalls(toolCalls: List<ToolCall>) = toolCalls(JsonField.of(toolCalls))

        /** tool calls if any */
        fun toolCalls(toolCalls: JsonField<List<ToolCall>>) = apply {
            this.toolCalls = toolCalls.map { it.toMutableList() }
        }

        /** tool calls if any */
        fun addToolCall(toolCall: ToolCall) = apply {
            toolCalls =
                (toolCalls ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(toolCall)
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

        fun build(): ChatMessage =
            ChatMessage(
                checkRequired("content", content),
                checkRequired("role", role),
                name,
                toolCallId,
                (toolCalls ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class ToolCall
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("function")
        @ExcludeMissing
        private val function: JsonField<Function> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): Optional<String> = Optional.ofNullable(id.getNullable("id"))

        fun function(): Optional<Function> = Optional.ofNullable(function.getNullable("function"))

        fun type(): Optional<Type> = Optional.ofNullable(type.getNullable("type"))

        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        @JsonProperty("function") @ExcludeMissing fun _function(): JsonField<Function> = function

        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ToolCall = apply {
            if (validated) {
                return@apply
            }

            id()
            function().ifPresent { it.validate() }
            type()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ToolCall]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var function: JsonField<Function> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(toolCall: ToolCall) = apply {
                id = toolCall.id
                function = toolCall.function
                type = toolCall.type
                additionalProperties = toolCall.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

            fun function(function: Function) = function(JsonField.of(function))

            fun function(function: JsonField<Function>) = apply { this.function = function }

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

            fun build(): ToolCall = ToolCall(id, function, type, additionalProperties.toImmutable())
        }

        @NoAutoDetect
        class Function
        @JsonCreator
        private constructor(
            @JsonProperty("arguments")
            @ExcludeMissing
            private val arguments: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name")
            @ExcludeMissing
            private val name: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun arguments(): Optional<String> =
                Optional.ofNullable(arguments.getNullable("arguments"))

            fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

            @JsonProperty("arguments")
            @ExcludeMissing
            fun _arguments(): JsonField<String> = arguments

            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Function = apply {
                if (validated) {
                    return@apply
                }

                arguments()
                name()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Function]. */
            class Builder internal constructor() {

                private var arguments: JsonField<String> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(function: Function) = apply {
                    arguments = function.arguments
                    name = function.name
                    additionalProperties = function.additionalProperties.toMutableMap()
                }

                fun arguments(arguments: String) = arguments(JsonField.of(arguments))

                fun arguments(arguments: JsonField<String>) = apply { this.arguments = arguments }

                fun name(name: String) = name(JsonField.of(name))

                fun name(name: JsonField<String>) = apply { this.name = name }

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

                fun build(): Function =
                    Function(arguments, name, additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Function && arguments == other.arguments && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(arguments, name, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Function{arguments=$arguments, name=$name, additionalProperties=$additionalProperties}"
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

                @JvmField val FUNCTION = of("function")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                FUNCTION
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
                FUNCTION,
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
                    FUNCTION -> Value.FUNCTION
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
                    FUNCTION -> Known.FUNCTION
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

            return /* spotless:off */ other is ToolCall && id == other.id && function == other.function && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, function, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ToolCall{id=$id, function=$function, type=$type, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ChatMessage && content == other.content && role == other.role && name == other.name && toolCallId == other.toolCallId && toolCalls == other.toolCalls && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(content, role, name, toolCallId, toolCalls, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ChatMessage{content=$content, role=$role, name=$name, toolCallId=$toolCallId, toolCalls=$toolCalls, additionalProperties=$additionalProperties}"
}
