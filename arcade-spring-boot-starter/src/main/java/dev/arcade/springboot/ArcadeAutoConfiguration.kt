package dev.arcade.springboot

import dev.arcade.client.ArcadeClient
import dev.arcade.client.okhttp.ArcadeOkHttpClient
import dev.arcade.core.ClientOptions
import org.springframework.boot.autoconfigure.AutoConfiguration
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.util.StringUtils

@AutoConfiguration
@EnableConfigurationProperties(ArcadeAutoConfiguration.Config::class)
open class ArcadeAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(prefix = "arcade", name = ["api-key"])
    open fun arcadeClient(config: Config): ArcadeClient {
        val clientBuilder = ArcadeOkHttpClient.builder().fromEnv()

        if (config.apiKey != null && StringUtils.hasText(config.apiKey)) {
            clientBuilder.apiKey(config.apiKey)
        }

        if (config.baseUrl != null && StringUtils.hasText(config.baseUrl)) {
            clientBuilder.baseUrl(config.baseUrl)
        }

        return clientBuilder.build()
    }

    @ConfigurationProperties(prefix = "arcade")
    @JvmRecord
    data class Config(
        val apiKey: String? = System.getenv("ARCADE_API_KEY"),
        val baseUrl: String? = ClientOptions.PRODUCTION_URL,
    ) {}
}
