package com.autotrading.composeui


import androidx.compose.material.Text
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.navigation.Navigation
import androidx.navigation.testing.TestNavHostController
import androidx.test.core.app.ApplicationProvider
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.autotrading.composeui.model.Schools
import com.autotrading.composeui.viewmodel.SplashScreenView

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule


/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    private lateinit var navController: TestNavHostController

    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    @Before
    fun setUp() {
        navController = TestNavHostController(ApplicationProvider.getApplicationContext())
    }

    @Test
    fun testsplashscreen() {
        composeTestRule.setContent {
            SplashScreenView(navController = navController)
        }
        composeTestRule.onNodeWithTag("splash_screencontainer")
            .assertIsDisplayed()
    }
    @Test
    fun Testmainscreenlist()
    {
        composeTestRule.setContent {
            SchoolItem(Schools.SchoolsItem("","","","Test School"))
        }
        composeTestRule.onNodeWithTag("school_listitem")
            .assertIsDisplayed()
    }
}


