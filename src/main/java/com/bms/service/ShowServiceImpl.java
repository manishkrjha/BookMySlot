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


    @Override
    public List<ShowEntity> searchShows(String movieName, String cityName, Date date) {
        return null;
    }

    @Override
    public List<String> displayEmptySeats(ShowEntity show) {
        return null;
    }

    @Override
    public String bookTicket(ShowEntity show, String email, int seatNo) {
        return null;
    }
}
