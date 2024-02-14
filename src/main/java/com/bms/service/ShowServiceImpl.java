package com.bms.service;

import com.bms.entity.ShowEntity;
import com.bms.repository.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Service
public class ShowServiceImpl implements ShowService{

    @Autowired
    private ShowRepository showRepository;
    @Override
    public List<ShowEntity> searchShows(String movieName, String cityName, Date date) {
        return showRepository.findShowByMovieNameDateAndCity(date, movieName, cityName);
    }

    @Override
    public List<String> displayEmptySeats(ShowEntity show) {
        List<String> seatList = showRepository.findById(show.getId()).get().getSeats();
        return seatList;
    }

    @Override
    public String bookTicket(ShowEntity show, String email, int seatNo) {
        
    }
}
