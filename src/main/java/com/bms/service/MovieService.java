package com.bms.service;

import com.bms.entity.MovieEntity;

import java.util.List;
import java.util.UUID;

public interface MovieService {

    MovieEntity addMovie(MovieEntity movie);

    List<MovieEntity> fetchMovie();

    List<MovieEntity> fetchMovieByAttribute(String attributeName, Object object);

    MovieEntity updateMovie(UUID id, MovieEntity newMovie);

    void deleteMovie(UUID id);
}
