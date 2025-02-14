package com.example.udfArchitecture.navigation

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.udfArchitecture.composable.ui.example.ExampleScreen

enum class UDFDestinations(
    val route: String,
    val hasBottomBar: Boolean = false,
    val content: @Composable () -> Unit
) {
    // Bottom Nav Screens
    Example(
        route = "example",
        hasBottomBar = false,
        content = { ExampleScreen.Content(hiltViewModel()) }
    ),

    Main(
        route = "main",
        content = { com.example.udfArchitecture.composable.ui.main.MainScreen.Content(hiltViewModel()) }
    ),

    Error(
    route = "error",
    content = {  }
    ),
}