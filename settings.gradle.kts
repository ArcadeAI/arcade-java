rootProject.name = "arcade-java-root"

val projectNames = rootDir.listFiles()
    ?.asSequence()
    .orEmpty()
    .filter { file ->
        file.isDirectory &&
        file.name.startsWith("arcade-java") &&
        file.listFiles()?.asSequence().orEmpty().any { it.name == "build.gradle.kts" }
    }
    .map { it.name }
    .toList() +
    listOf("arcade-spring-boot-starter")
println("projects: $projectNames")
projectNames.forEach { include(it) }
