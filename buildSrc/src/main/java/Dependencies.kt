/**
 *
 * Created by Lukmanul Hakim on  05/08/22
 * devs.lukman@gmail.com
 */
object Dependencies {

    const val kotlin                = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Version.kotlin}"
    const val hilt                  = "com.google.dagger:hilt-android-gradle-plugin:${Version.hilt}"
    const val googleService         = "com.google.gms:google-services:${Version.googleService}"

    const val core                  = "androidx.core:core-ktx:${Version.core}"
    const val appcompat             = "androidx.appcompat:appcompat:${Version.appcompat}"
    const val material              = "com.google.android.material:material:${Version.material}"
    const val constraintLayout      = "androidx.constraintlayout:constraintlayout:${Version.constraintLayout}"
    const val livedataKtx           = "androidx.lifecycle:lifecycle-livedata-ktx:${Version.livedataKtx}"
    const val viewModelKtx          = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Version.viewModelKtx}"
    const val navigationFragKtx     = "androidx.navigation:navigation-fragment-ktx:${Version.navigationFragKtx}"
    const val navigationUiKtx       = "androidx.navigation:navigation-ui-ktx:${Version.navigationUiKtx}"

    const val composeUI             = "androidx.compose.ui:ui:${Version.compose}"
    const val composeMaterial       = "androidx.compose.material:material:${Version.compose}"
    const val composeUiTool         = "androidx.compose.ui:ui-tooling:${Version.compose}"
    const val composeUiToolPreview  = "androidx.compose.ui:ui-tooling-preview:${Version.compose}"
    const val runtimeLiveData       = "androidx.compose.runtime:runtime-livedata:${Version.compose}"
    const val runtimeCompose        = "androidx.compose.runtime:runtime:${Version.compose}"
    const val activityCompose       = "androidx.activity:activity-compose:${Version.activityCompose}"
    const val lifecycleRuntime      = "androidx.lifecycle:lifecycle-runtime-ktx:${Version.lifecycleRuntime}"
    const val viewModelCompose      = "androidx.lifecycle:lifecycle-viewmodel-compose:${Version.viewModelCompose}"
    const val navigationCompose     = "androidx.navigation:navigation-compose:${Version.navigationCompose}"
    const val hiltNavigationCompose = "androidx.hilt:hilt-navigation-compose:${Version.hiltNavigationCompose}"
    const val composeMaterialIcon   = "androidx.compose.material:material-icons-extended:${Version.compose}"

    const val firebaseMessaging     = "com.google.firebase:firebase-messaging-ktx:${Version.firebaseMessaging}"

    // koin
    const val koinAndroid           = "io.insert-koin:koin-android:${Version.koinAndroid}"
    const val koinAnnotation        = "io.insert-koin:koin-annotations:${Version.koinAnnotation}"
    const val koinKspCompiler       = "io.insert-koin:koin-ksp-compiler:${Version.koinKspCompiler}"

    const val hiltAndroid           = "com.google.dagger:hilt-android:${Version.hilt}"
    const val hiltCompiler          = "com.google.dagger:hilt-android-compiler:${Version.hilt}"
    const val hiltAndroidTest       = "com.google.dagger:hilt-android-testing:${Version.hilt}"

    const val jUnit                 = "junit:junit:${Version.jUnit}"
    const val extJUnit              = "androidx.test.ext:junit:${Version.extJUnit}"
    const val extTruth              = "androidx.test.ext:truth:${Version.extTruth}"
    const val archCoreTest          = "androidx.arch.core:core-testing:${Version.archCoreTest}"
    const val robolectric           = "org.robolectric:robolectric:${Version.robolectric}"
    const val mockk                 = "io.mockk:mockk:${Version.mockk}"
    const val coroutinesTest        = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Version.coroutinesTest}"
    const val testCore              = "androidx.test:core:${Version.testCore}"
    const val testCoreKTX           = "androidx.test:core-ktx:${Version.testCoreKTX}"
    const val extJUnitKTX           = "androidx.test.ext:junit-ktx:${Version.extJUnitKTX}"
    const val espresso              = "androidx.test.espresso:espresso-core:${Version.espresso}"

    const val uiTestJUnit           = "androidx.compose.ui:ui-test-junit4:${Version.compose}"
    const val uiTestManifest        = "androidx.compose.ui:ui-test-manifest:${Version.compose}"

    const val retrofit              = "com.squareup.retrofit2:retrofit:${Version.retrofit}"
    const val converterGson         = "com.squareup.retrofit2:converter-gson:${Version.converterGson}"
    const val kotlinxJson           = "org.jetbrains.kotlinx:kotlinx-serialization-json:${Version.kotlinxJson}"

    const val okhttp                = "com.squareup.okhttp3:okhttp:${Version.okhttp}"
    const val loggingInterceptor    = "com.squareup.okhttp3:logging-interceptor:${Version.loggingInterceptor}"

    const val coroutines            = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Version.coroutines}"

    const val chuckEnable           = "com.github.chuckerteam.chucker:library:${Version.chucker}"
    const val chuckDisable          = "com.github.chuckerteam.chucker:library-no-op:${Version.chucker}"

    const val playServiceLocation   = "com.google.android.gms:play-services-location:${Version.playServiceLocation}"

}