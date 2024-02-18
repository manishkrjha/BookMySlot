package com.bms.repository;

import com.bms.entity.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@Repository
public interface MovieRepository extends JpaRepository<MovieEntity, UUID> {

    @Query("SELECT id, movieName, releaseDate, description, durationInMinutes, genre FROM MovieEntity WHERE :attributeNames = :attributeValue")
    List<MovieEntity> fetchMovieByAttribute(
            @Param("attributeName") String attributeName,
            @Param("attributeValue") Object attributeValue
    );


}
