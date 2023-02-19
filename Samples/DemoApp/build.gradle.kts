plugins {
    //trick: for the same plugin versions in all sub-modules
    id("com.android.application").version("7.1.3").apply(false)
    id("com.android.library").version("7.1.3").apply(false)
    kotlin("android").version("1.7.10").apply(false)
    kotlin("multiplatform").version("1.7.10").apply(false)
    id("org.jetbrains.compose").version("1.2.1").apply(false)
    id("io.github.skeptick.libres").version("1.1.4").apply(false)
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
