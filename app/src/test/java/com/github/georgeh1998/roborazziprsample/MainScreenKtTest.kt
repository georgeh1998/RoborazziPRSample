package com.github.georgeh1998.roborazziprsample


import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onRoot
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.github.georgeh1998.roborazziprsample.ui.theme.RoborazziPRSampleTheme
import com.github.takahirom.roborazzi.captureRoboImage
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.annotation.GraphicsMode

@RunWith(AndroidJUnit4::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
class MainScreenTest {


    @get:Rule
    val composeRule = createComposeRule()

    @Test
    fun testMainScreen() {
        composeRule.setContent {
            RoborazziPRSampleTheme {
                MainScreen()
            }
        }
        composeRule.onRoot().captureRoboImage()
    }

}