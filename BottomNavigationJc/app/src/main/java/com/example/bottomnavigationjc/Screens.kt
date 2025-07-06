package com.example.bottomnavigationjc

sealed class Screens (val screen: String) {
    data object Home: Screens("home")
    data object Profile: Screens("Profile")
    data object Search: Screens("Search")
    data object Notifications: Screens("Notifications")
    data object Post: Screens("Post")
}