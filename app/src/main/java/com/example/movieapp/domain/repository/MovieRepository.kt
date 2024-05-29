package com.aliduman.movieappmodern.domain.repository

import com.example.movieapp.data.remote.dto.MovieDetailDto
import com.example.movieapp.data.remote.dto.MoviesDto

interface MovieRepository {
    suspend fun getMovies(search: String) : MoviesDto
    suspend fun getMovieDetail(imdbId: String) : MovieDetailDto
}
