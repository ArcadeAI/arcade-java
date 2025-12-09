plugins {
    id("arcade.java")
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":arcade-java"))
}

tasks.withType<JavaCompile>().configureEach {
    // Allow using more modern APIs, like `List.of` and `Map.of`, in examples.
    options.release.set(9)
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
