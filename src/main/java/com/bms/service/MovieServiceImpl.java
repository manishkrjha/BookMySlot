package com.bms.service;

import com.bms.entity.MovieEntity;
import com.bms.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Service
public class MovieServiceImpl implements MovieService{

   @Autowired
   private MovieRepository movieRepository;

   @Override
   public MovieEntity saveMovie(MovieEntity movie){
       movieRepository.save(movie);
       return movie;
   }

   @Override
    public List<MovieEntity> fetchMovie(){
       List<MovieEntity> allMovieList = movieRepository.findAll();
       return  allMovieList;
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

       return currMovie;
    }

    @Override
    public void deleteMovie(UUID id){
       movieRepository.deleteById(id);
    }
}
