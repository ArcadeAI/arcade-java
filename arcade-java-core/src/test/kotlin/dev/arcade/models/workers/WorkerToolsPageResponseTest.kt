// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models.workers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.arcade.core.JsonValue
import dev.arcade.core.jsonMapper
import dev.arcade.models.tools.ToolDefinition
import dev.arcade.models.tools.ValueSchema
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WorkerToolsPageResponseTest {

    @Test
    fun create() {
        val workerToolsPageResponse =
            WorkerToolsPageResponse.builder()
                .addItem(
                    ToolDefinition.builder()
                        .fullyQualifiedName("fully_qualified_name")
                        .input(
                            ToolDefinition.Input.builder()
                                .addParameter(
                                    ToolDefinition.Input.Parameter.builder()
                                        .name("name")
                                        .valueSchema(
                                            ValueSchema.builder()
                                                .valType("val_type")
                                                .description("description")
                                                .addEnum("string")
                                                .innerProperties(
                                                    JsonValue.from(mapOf<String, Any>())
                                                )
                                                .addInnerRequiredKey("string")
                                                .innerValType("inner_val_type")
                                                .nullable(true)
                                                .properties(JsonValue.from(mapOf<String, Any>()))
                                                .addRequiredKey("string")
                                                .build()
                                        )
                                        .description("description")
                                        .inferrable(true)
                                        .required(true)
                                        .build()
                                )
                                .build()
                        )
                        .name("name")
                        .qualifiedName("qualified_name")
                        .toolkit(
                            ToolDefinition.Toolkit.builder()
                                .name("name")
                                .description("description")
                                .version("version")
                                .build()
                        )
                        .description("description")
                        .formattedSchema(
                            ToolDefinition.FormattedSchema.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .metadata(
                            ToolDefinition.Metadata.builder()
                                .behavior(
                                    ToolDefinition.Metadata.Behavior.builder()
                                        .destructive(true)
                                        .idempotent(true)
                                        .openWorld(true)
                                        .addOperation("string")
                                        .readOnly(true)
                                        .build()
                                )
                                .classification(
                                    ToolDefinition.Metadata.Classification.builder()
                                        .addServiceDomain("string")
                                        .build()
                                )
                                .extras(
                                    ToolDefinition.Metadata.Extras.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .build()
                        )
                        .output(
                            ToolDefinition.Output.builder()
                                .addAvailableMode("string")
                                .description("description")
                                .valueSchema(
                                    ValueSchema.builder()
                                        .valType("val_type")
                                        .description("description")
                                        .addEnum("string")
                                        .innerProperties(JsonValue.from(mapOf<String, Any>()))
                                        .addInnerRequiredKey("string")
                                        .innerValType("inner_val_type")
                                        .nullable(true)
                                        .properties(JsonValue.from(mapOf<String, Any>()))
                                        .addRequiredKey("string")
                                        .build()
                                )
                                .build()
                        )
                        .requirements(
                            ToolDefinition.Requirements.builder()
                                .authorization(
                                    ToolDefinition.Requirements.Authorization.builder()
                                        .id("id")
                                        .oauth2(
                                            ToolDefinition.Requirements.Authorization.Oauth2
                                                .builder()
                                                .addScope("string")
                                                .build()
                                        )
                                        .providerId("provider_id")
                                        .providerType("provider_type")
                                        .status(
                                            ToolDefinition.Requirements.Authorization.Status.ACTIVE
                                        )
                                        .statusReason("status_reason")
                                        .tokenStatus(
                                            ToolDefinition.Requirements.Authorization.TokenStatus
                                                .NOT_STARTED
                                        )
                                        .build()
                                )
                                .met(true)
                                .addSecret(
                                    ToolDefinition.Requirements.Secret.builder()
                                        .key("key")
                                        .met(true)
                                        .statusReason("status_reason")
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .limit(0L)
                .offset(0L)
                .pageCount(0L)
                .totalCount(0L)
                .build()

        assertThat(workerToolsPageResponse.items().getOrNull())
            .containsExactly(
                ToolDefinition.builder()
                    .fullyQualifiedName("fully_qualified_name")
                    .input(
                        ToolDefinition.Input.builder()
                            .addParameter(
                                ToolDefinition.Input.Parameter.builder()
                                    .name("name")
                                    .valueSchema(
                                        ValueSchema.builder()
                                            .valType("val_type")
                                            .description("description")
                                            .addEnum("string")
                                            .innerProperties(JsonValue.from(mapOf<String, Any>()))
                                            .addInnerRequiredKey("string")
                                            .innerValType("inner_val_type")
                                            .nullable(true)
                                            .properties(JsonValue.from(mapOf<String, Any>()))
                                            .addRequiredKey("string")
                                            .build()
                                    )
                                    .description("description")
                                    .inferrable(true)
                                    .required(true)
                                    .build()
                            )
                            .build()
                    )
                    .name("name")
                    .qualifiedName("qualified_name")
                    .toolkit(
                        ToolDefinition.Toolkit.builder()
                            .name("name")
                            .description("description")
                            .version("version")
                            .build()
                    )
                    .description("description")
                    .formattedSchema(
                        ToolDefinition.FormattedSchema.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .metadata(
                        ToolDefinition.Metadata.builder()
                            .behavior(
                                ToolDefinition.Metadata.Behavior.builder()
                                    .destructive(true)
                                    .idempotent(true)
                                    .openWorld(true)
                                    .addOperation("string")
                                    .readOnly(true)
                                    .build()
                            )
                            .classification(
                                ToolDefinition.Metadata.Classification.builder()
                                    .addServiceDomain("string")
                                    .build()
                            )
                            .extras(
                                ToolDefinition.Metadata.Extras.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .build()
                    )
                    .output(
                        ToolDefinition.Output.builder()
                            .addAvailableMode("string")
                            .description("description")
                            .valueSchema(
                                ValueSchema.builder()
                                    .valType("val_type")
                                    .description("description")
                                    .addEnum("string")
                                    .innerProperties(JsonValue.from(mapOf<String, Any>()))
                                    .addInnerRequiredKey("string")
                                    .innerValType("inner_val_type")
                                    .nullable(true)
                                    .properties(JsonValue.from(mapOf<String, Any>()))
                                    .addRequiredKey("string")
                                    .build()
                            )
                            .build()
                    )
                    .requirements(
                        ToolDefinition.Requirements.builder()
                            .authorization(
                                ToolDefinition.Requirements.Authorization.builder()
                                    .id("id")
                                    .oauth2(
                                        ToolDefinition.Requirements.Authorization.Oauth2.builder()
                                            .addScope("string")
                                            .build()
                                    )
                                    .providerId("provider_id")
                                    .providerType("provider_type")
                                    .status(ToolDefinition.Requirements.Authorization.Status.ACTIVE)
                                    .statusReason("status_reason")
                                    .tokenStatus(
                                        ToolDefinition.Requirements.Authorization.TokenStatus
                                            .NOT_STARTED
                                    )
                                    .build()
                            )
                            .met(true)
                            .addSecret(
                                ToolDefinition.Requirements.Secret.builder()
                                    .key("key")
                                    .met(true)
                                    .statusReason("status_reason")
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
        assertThat(workerToolsPageResponse.limit()).contains(0L)
        assertThat(workerToolsPageResponse.offset()).contains(0L)
        assertThat(workerToolsPageResponse.pageCount()).contains(0L)
        assertThat(workerToolsPageResponse.totalCount()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val workerToolsPageResponse =
            WorkerToolsPageResponse.builder()
                .addItem(
                    ToolDefinition.builder()
                        .fullyQualifiedName("fully_qualified_name")
                        .input(
                            ToolDefinition.Input.builder()
                                .addParameter(
                                    ToolDefinition.Input.Parameter.builder()
                                        .name("name")
                                        .valueSchema(
                                            ValueSchema.builder()
                                                .valType("val_type")
                                                .description("description")
                                                .addEnum("string")
                                                .innerProperties(
                                                    JsonValue.from(mapOf<String, Any>())
                                                )
                                                .addInnerRequiredKey("string")
                                                .innerValType("inner_val_type")
                                                .nullable(true)
                                                .properties(JsonValue.from(mapOf<String, Any>()))
                                                .addRequiredKey("string")
                                                .build()
                                        )
                                        .description("description")
                                        .inferrable(true)
                                        .required(true)
                                        .build()
                                )
                                .build()
                        )
                        .name("name")
                        .qualifiedName("qualified_name")
                        .toolkit(
                            ToolDefinition.Toolkit.builder()
                                .name("name")
                                .description("description")
                                .version("version")
                                .build()
                        )
                        .description("description")
                        .formattedSchema(
                            ToolDefinition.FormattedSchema.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .metadata(
                            ToolDefinition.Metadata.builder()
                                .behavior(
                                    ToolDefinition.Metadata.Behavior.builder()
                                        .destructive(true)
                                        .idempotent(true)
                                        .openWorld(true)
                                        .addOperation("string")
                                        .readOnly(true)
                                        .build()
                                )
                                .classification(
                                    ToolDefinition.Metadata.Classification.builder()
                                        .addServiceDomain("string")
                                        .build()
                                )
                                .extras(
                                    ToolDefinition.Metadata.Extras.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .build()
                        )
                        .output(
                            ToolDefinition.Output.builder()
                                .addAvailableMode("string")
                                .description("description")
                                .valueSchema(
                                    ValueSchema.builder()
                                        .valType("val_type")
                                        .description("description")
                                        .addEnum("string")
                                        .innerProperties(JsonValue.from(mapOf<String, Any>()))
                                        .addInnerRequiredKey("string")
                                        .innerValType("inner_val_type")
                                        .nullable(true)
                                        .properties(JsonValue.from(mapOf<String, Any>()))
                                        .addRequiredKey("string")
                                        .build()
                                )
                                .build()
                        )
                        .requirements(
                            ToolDefinition.Requirements.builder()
                                .authorization(
                                    ToolDefinition.Requirements.Authorization.builder()
                                        .id("id")
                                        .oauth2(
                                            ToolDefinition.Requirements.Authorization.Oauth2
                                                .builder()
                                                .addScope("string")
                                                .build()
                                        )
                                        .providerId("provider_id")
                                        .providerType("provider_type")
                                        .status(
                                            ToolDefinition.Requirements.Authorization.Status.ACTIVE
                                        )
                                        .statusReason("status_reason")
                                        .tokenStatus(
                                            ToolDefinition.Requirements.Authorization.TokenStatus
                                                .NOT_STARTED
                                        )
                                        .build()
                                )
                                .met(true)
                                .addSecret(
                                    ToolDefinition.Requirements.Secret.builder()
                                        .key("key")
                                        .met(true)
                                        .statusReason("status_reason")
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .limit(0L)
                .offset(0L)
                .pageCount(0L)
                .totalCount(0L)
                .build()

        val roundtrippedWorkerToolsPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(workerToolsPageResponse),
                jacksonTypeRef<WorkerToolsPageResponse>(),
            )

        assertThat(roundtrippedWorkerToolsPageResponse).isEqualTo(workerToolsPageResponse)
    }
}
