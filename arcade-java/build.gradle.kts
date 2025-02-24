plugins {
    id("arcade.kotlin")
    id("arcade.publish")
}

dependencies {
    api(project(":arcade-java-client-okhttp"))
}
