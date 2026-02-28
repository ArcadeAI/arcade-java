plugins {
    id("arcade.java")
    id("io.spring.dependency-management") version "1.1.7" // only needed for SpringBoot examples
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":arcade-java"))

    // Only needed for SpringBootExample
    implementation(project(":arcade-spring-boot-starter"))
    implementation("org.springframework.boot:spring-boot-starter:3.5.10")

    // only needed for SpringAIExample
    implementation("org.springframework.ai:spring-ai-starter-model-openai")
    implementation("org.apache.httpcomponents.client5:httpclient5:5.6")

    // Only needed for GmailExample
    implementation("com.google.api-client:google-api-client:2.9.0")
    implementation("com.google.oauth-client:google-oauth-client-jetty:1.39.0")
    implementation("com.google.apis:google-api-services-gmail:v1-rev20260112-2.0.0")

}

// only needed for SpringAIExample
dependencyManagement {
    imports {
        mavenBom("org.springframework.ai:spring-ai-bom:1.1.2")
    }
}

tasks.withType<JavaCompile>().configureEach {
    // Allow using more modern APIs, like `List.of` and `Map.of`, in examples.
    options.release.set(17)
}

application {
    // Use `./gradlew :arcade-java-example:run` to run `Main`
    // Use `./gradlew :arcade-java-example:run -Pexample=Something` to run `SomethingExample`
    mainClass = "dev.arcade.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}Example"
        else
            "Main"
    }"
}
