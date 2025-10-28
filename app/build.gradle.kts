plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.foodiewe"
    compileSdk = 36


    defaultConfig {
        applicationId = "com.example.foodiewe"
        minSdk = 24
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildFeatures {
        buildConfig = true
    }

    val apiKey: String = project.findProperty("SPOONACULAR_API_KEY") as? String ?: ""

    buildTypes {
        debug {
            buildConfigField("String", "SPOONACULAR_API_KEY", "\"$apiKey\"")
        }
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
            buildConfigField("String", "SPOONACULAR_API_KEY", "\"$apiKey\"")
        }
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11

    }

}


dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)

    // Retrofit core library
    implementation("com.squareup.retrofit2:retrofit:2.9.0")

   // Converter library (e.g., Gson)
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation("com.squareup.picasso:picasso:2.71828")

    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}