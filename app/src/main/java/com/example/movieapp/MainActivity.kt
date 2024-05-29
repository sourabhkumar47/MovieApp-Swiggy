package com.example.movieapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.aliduman.movieappmodern.presentation.Screen
import com.example.movieapp.presentation.movie_detail.views.MovieDetailScreen
import com.example.movieapp.presentation.movies.views.MovieScreen
import com.example.movieapp.util.Constants
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Surface(
                modifier = Modifier.fillMaxWidth()
            ) {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = Screen.MovieScreen.route) {
                    composable(route = Screen.MovieScreen.route) {
                        MovieScreen(navController = navController)
                    }
                    composable(route = Screen.MovieDetailScreen.route + "/{${Constants.IMDB_ID}}") {
                        MovieDetailScreen()
                    }

                }
            }
        }
    }
}
