package com.bms.controller;

import com.bms.entity.MovieEntity;
import com.bms.service.MovieService;
import com.bms.service.MovieServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/bms/movie")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping
    public List<MovieEntity> getAllMovies(){
       return movieService.fetchMovie();
    }

    @GetMapping("/{param}/{paramVal}")
    public List<MovieEntity> getMovieByParam(@PathVariable String param, @PathVariable Object paramVal){
        return movieService.fetchMovieByAttribute(param, paramVal);
    }


    @PostMapping
    public String addMovie(@RequestBody MovieEntity movie){
        movieService.addMovie(movie);
        return "Added " + movie.getMovieName() + " in the database";
    }

    @PutMapping
    public String updateMovie(@RequestBody MovieEntity movie){
        movieService.updateMovie(movie.getId(), movie);
        return movie.getMovieName() + " updated";
    }

    @DeleteMapping
    public String deleteMovie(@RequestBody MovieEntity movie){
        movieService.deleteMovie(movie.getId());
        return "Deleted " + movie.getMovieName() + " from Database";
    }

}
