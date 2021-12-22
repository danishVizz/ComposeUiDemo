package com.autotrading.composeui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.autotrading.composeui.viewmodel.MainViewModel
import com.autotrading.composeui.viewmodel.SplashScreenView

class MainActivity : ComponentActivity() {

    val mainViewModel by viewModels<MainViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(color = Color.White, modifier = Modifier.fillMaxSize()) {
                MainNavigationView()
            }
        }
    }

    @Composable
    fun MainNavigationView() {
        val navController = rememberNavController()
        NavHost(
            navController = navController,
            startDestination = "splash_screen"
        ) {
            composable("splash_screen") {
                SplashScreenView(navController = navController)
            }
            // Main Screen
            mainViewModel.getSchoolList()
            composable("main_screen") {
                MovieList(movieList = mainViewModel.schoolListResponse)
                mainViewModel.getSchoolList()

            }
        }
    }


}
