plugins {
    id("arcade.kotlin")
    id("java")
    application
}

dependencies {
    implementation(project(":arcade-java"))
}

tasks.withType<JavaCompile>().configureEach {
    // Allow using more modern APIs, like `List.of` and `Map.of`, in examples.
    options.release.set(9)
}

application {
    mainClass = "com.arcade_engine.api.example.Main"
}
