package com.bms.service;

import com.bms.entity.ShowEntity;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public interface ShowService {

    List<ShowEntity> searchShows(String movieName, String cityName, Date date);

    List<String> displayEmptySeats(ShowEntity show);

    String bookTicket(ShowEntity show, String email, int seatNo);
}
