plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.plugin.compose")
}

android {
    namespace = "com.example.tinkovquotes"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.example.tinkovquotes"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    // Core
    implementation("androidx.core:core-ktx:1.17.0")

    // Compose
    implementation("androidx.activity:activity-compose:1.12.4")
    implementation(platform("androidx.compose:compose-bom:2026.02.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3:1.4.0")

    // LifeCycle
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.10.0")
    implementation("androidx.lifecycle:lifecycle-runtime-compose:2.10.0")

    // Fragment
    implementation("androidx.fragment:fragment-ktx:1.8.9")

    // Navigation
    implementation("androidx.navigation:navigation-compose:2.9.7")

    // Koin
    implementation("io.insert-koin:koin-android:4.1.1")
    implementation("io.insert-koin:koin-androidx-compose:4.1.1")

    // Exoplayer
    implementation("androidx.media3:media3-exoplayer:1.9.2")

    // Tests
    androidTestImplementation(platform("androidx.compose:compose-bom:2026.02.00"))

    // Debug
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")
}