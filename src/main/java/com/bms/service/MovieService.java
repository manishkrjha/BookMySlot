package com.bms.service;

import com.bms.entity.MovieEntity;

import java.util.List;
import java.util.UUID;

public interface MovieService {

    MovieEntity saveMovie(MovieEntity movie);

    List<MovieEntity> fetchMovie();


    MovieEntity updateMovie(UUID id, MovieEntity newMovie);

    void deleteMovie(UUID id);
}
