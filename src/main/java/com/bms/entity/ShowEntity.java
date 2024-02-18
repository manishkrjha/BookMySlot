package com.bms.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Time;
import java.util.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="SHOW")
public class ShowEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private Date date;
    private Time time;

    @ManyToOne(cascade = CascadeType.ALL)
    private MovieEntity movieRunning;

    @ManyToOne(cascade = CascadeType.ALL)
    private HallEntity hallName;

    private List<String> seats = new ArrayList<>(Collections.nCopies(50, "available"));
    
}
