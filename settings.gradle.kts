
rootProject.name = "otus-demo-project"
include("m1l1")

pluginManagement{
    val kotlinVersion: String by settings
    plugins{
        kotlin("jvm") version kotlinVersion apply false
    }
}
