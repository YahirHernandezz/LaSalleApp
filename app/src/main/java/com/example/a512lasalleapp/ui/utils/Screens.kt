package com.example.a512lasalleapp.ui.utils

sealed class Screens(val route : String) {
    data object Home : Screens("home")
    data object Grades : Screens("grades")
    data object Calendar : Screens("calendar")
    data object Settings : Screens("settings")
    data object NewsDetail: Screens("news-detail")
    data object Password : Screens("password")
    data object Theme : Screens("theme")
    data object ClassDetail : Screens("class-detail")
    data object Payments : Screens("payments")
}