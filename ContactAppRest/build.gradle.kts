

buildscript{
    dependencies{
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:2.5.3")
        classpath ("com.google.dagger:hilt-android-gradle-plugin:2.44") // hilt 1. aşama

    }
}

plugins {
    id("com.android.application") version "8.1.2" apply false
}