package com.bms.repository;

import com.bms.entity.ShowEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.UUID;
import java.util.List;
import java.util.Date;

public interface ShowRepository extends JpaRepository<ShowEntity, UUID> {

    @Query("SELECT s FROM ShowEntity s JOIN s.movieRunning m WHERE s.date = :date AND m.movieName = :movieName")
    List<ShowEntity> findShowByMovieNameDateAndCity(@Param("date") Date date, @Param("movieName") String movieName, @Param("cityName") String cityName);

}
