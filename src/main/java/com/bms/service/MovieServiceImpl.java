package com.bms.service;

import com.bms.entity.MovieEntity;
import com.bms.repository.MovieRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class MovieServiceImpl implements MovieService{

   @Autowired
   private MovieRepository movieRepository;

   @Override
   public MovieEntity addMovie(MovieEntity movie){
       movieRepository.save(movie);
       return movie;
   }

   @Override
    public List<MovieEntity> fetchMovie(){
       List<MovieEntity> allMovieList = movieRepository.findAll();
       return  allMovieList;
    }

    @Override
    public List<MovieEntity> fetchMovieByAttribute(@NotNull String attributeName, Object object) {
        List<MovieEntity> movieList;

        if(attributeName.equals("genre") || attributeName.equals("movieName")){
            return movieRepository.fetchMovieByAttribute(attributeName, object);
        }else if(attributeName.equals("releaseDate")){
            return movieRepository.fetchMovieByAttribute(attributeName, object);
        }else{
            //Returns empty list should be replaced by IllegalArgumentException
            return  new ArrayList<>();
        }
    }


    @Override
    public MovieEntity updateMovie(UUID id, MovieEntity newMovie){
       MovieEntity currMovie = movieRepository.getReferenceById(id);

       if(Objects.nonNull(newMovie.getMovieName()) && Objects.nonNull(newMovie.getDescription()) && Objects.nonNull(newMovie.getDurationInMinutes()) && Objects.nonNull(newMovie.getGenre()) && Objects.nonNull(newMovie.getReleaseDate())){
           currMovie.setDescription(newMovie.getDescription());
           currMovie.setMovieName((newMovie.getMovieName()));
           currMovie.setGenre(newMovie.getGenre());
           currMovie.setReleaseDate(newMovie.getReleaseDate());
       }

       movieRepository.save(currMovie);
       return currMovie;
    }

    @Override
    public void deleteMovie(UUID id){
       movieRepository.deleteById(id);
    }
}
