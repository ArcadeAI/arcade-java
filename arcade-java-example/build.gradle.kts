plugins {
    id("arcade.java")
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
