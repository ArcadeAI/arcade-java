// File generated from our OpenAPI spec by Stainless.

package dev.arcade.proguard

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.arcade.client.okhttp.ArcadeOkHttpClient
import dev.arcade.core.jsonMapper
import dev.arcade.models.tools.AuthorizeToolRequest
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.jvm.javaMethod
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProGuardCompatibilityTest {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            // To debug that we're using the right JAR.
            val jarPath = this::class.java.getProtectionDomain().codeSource.location
            println("JAR being used: $jarPath")

            // We have to manually run the test methods instead of using the JUnit runner because it
            // seems impossible to get working with R8.
            val test = ProGuardCompatibilityTest()
            test::class
                .memberFunctions
                .asSequence()
                .filter { function ->
                    function.javaMethod?.isAnnotationPresent(Test::class.java) == true
                }
                .forEach { it.call(test) }
        }
    }

    @Test
    fun proguardRules() {
        val rulesFile =
            javaClass.classLoader.getResourceAsStream("META-INF/proguard/arcade-java-core.pro")

        assertThat(rulesFile).isNotNull()
    }

    @Test
    fun client() {
        val client = ArcadeOkHttpClient.builder().apiKey("My API Key").build()

        assertThat(client).isNotNull()
        assertThat(client.admin()).isNotNull()
        assertThat(client.auth()).isNotNull()
        assertThat(client.health()).isNotNull()
        assertThat(client.chat()).isNotNull()
        assertThat(client.tools()).isNotNull()
        assertThat(client.workers()).isNotNull()
    }

    @Test
    fun authorizeToolRequestRoundtrip() {
        val jsonMapper = jsonMapper()
        val authorizeToolRequest =
            AuthorizeToolRequest.builder()
                .toolName("tool_name")
                .nextUri("next_uri")
                .toolVersion("tool_version")
                .userId("user_id")
                .build()

        val roundtrippedAuthorizeToolRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(authorizeToolRequest),
                jacksonTypeRef<AuthorizeToolRequest>(),
            )

        assertThat(roundtrippedAuthorizeToolRequest).isEqualTo(authorizeToolRequest)
    }
}
