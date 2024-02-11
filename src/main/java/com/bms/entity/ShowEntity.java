package com.bms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="SHOW")
public class ShowEntity {

    @Id
    private String id;
    private Date date;
    private Time time;

    private String movieRunning;
    private String hallName;

    private List<String> seats = new ArrayList<>(Collections.nCopies(50, "available"));

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getMovieRunning() {
        return movieRunning;
    }

    public void setMovieRunning(String movieRunning) {
        this.movieRunning = movieRunning;
    }

    public String getHallName() {
        return hallName;
    }

    public void setHallName(String hallName) {
        this.hallName = hallName;
    }

    public List<String> getSeats() {
        return seats;
    }

    public void setSeats(List<String> seats) {
        this.seats = seats;
    }
}
