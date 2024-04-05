plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("androidx.navigation.safeargs.kotlin")
}

android {
    namespace = "com.getir.patika.foodcouriers"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.getir.patika.foodcouriers"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    android.sourceSets.getByName("main") {
        res.srcDirs(
            "src/main/res",
            "src/main/res/layouts",
            "src/main/res/layouts/splash",
            "src/main/res/layouts/onboarding",
            "src/main/res/layouts/account"
        )
    }

    buildFeatures {
        viewBinding = true
    }


    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    sourceSets {
        getByName("main") {
            res {
                srcDirs("src/main/res", "src/main/res/layouts/splash",
                    "src/main/res/layouts/onboarding", "src/main/res/layouts/account"
                )
            }
        }
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.navigation:navigation-fragment-ktx:2.7.7")
    implementation("androidx.navigation:navigation-ui-ktx:2.7.7")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    //sdp
    implementation("com.intuit.sdp:sdp-android:1.1.1")
    //ssp
    implementation("com.intuit.ssp:ssp-android:1.1.1")
    //viewbinding
    implementation("com.wada811.viewbindingktx:viewbindingktx:3.1.0")

}