package com.bms.service;

import com.bms.entity.ShowEntity;
import com.bms.repository.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Objects;

@Service
public class ShowServiceImpl implements ShowService{

    @Autowired
    private ShowRepository showRepository;
    @Override
    public List<ShowEntity> searchShows(String movieName, String cityName, Date date) {

    }

    @Override
    public List<String> displayEmptySeats(ShowEntity show) {
        return null;
    }

    @Override
    public String bookTicket(ShowEntity show, String email) {
        return null;
    }
}
