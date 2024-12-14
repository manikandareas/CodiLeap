import org.gradle.kotlin.dsl.android

plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.kotlin.serialization)
    id("kotlin-parcelize")
}

android {
    namespace = "com.manikandareas.codileap"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.manikandareas.codileap"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
            buildConfigField("String", "BASE_URL", "\"http://34.128.113.63:3000/\"")
//            buildConfigField("String", "BASE_URL", "\"http://34.128.113.63:3000/\"")
        }
        debug {
            buildConfigField("String", "BASE_URL", "\"http://34.128.113.63:3000/\"")
            buildConfigField("String", "APP_SECRET_KEY", "\"codileap_secret_key\"")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
        buildConfig = true
    }
}

dependencies {

    implementation(libs.bundles.ktor)
    implementation(libs.ktor.client.auth)

    implementation(libs.bundles.koin)

    implementation(libs.androidx.datastore.preferences)

    implementation(libs.androidx.ui.text.google.fonts)

    implementation(libs.navigation.compose)
    implementation(libs.kotlinx.serialization.json)

    implementation(libs.coil.kt.coil.compose)
    implementation(libs.coil)

    implementation (libs.kotlinx.serialization.json)
    implementation (libs.jsoup.v1181)

    implementation(libs.androidx.compose.animation)
    implementation(libs.androidx.core.splashscreen)
    implementation(libs.androidx.material.icons.extended.android)
    
    implementation (libs.yml.ycharts)

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
}