package com.bms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.UUID;

@RestController
public class BookingController {

    public String getMovie(String movieName, String city, Date date){
        return "Returns the name of the movie";
    }

    public  String getShow(UUID showId){
        return  "return show details and available seats";
    }

    public String bookSeat(UUID showId, int seatIndex){
        return "Books ticket if available";
    }
}
