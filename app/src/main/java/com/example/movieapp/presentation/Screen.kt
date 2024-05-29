package com.aliduman.movieappmodern.presentation

sealed class Screen(val route: String) {
    object MovieScreen : Screen("movie_screen")
    object MovieDetailScreen : Screen("movie_detail_screen")
}
