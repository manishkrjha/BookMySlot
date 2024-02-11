package com.bms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "HALL")
public class HallEntity {

    @Id
    private String id;
    private String theatre;

    private  int theatreNumber;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTheatre() {
        return theatre;
    }

    public void setTheatre(String theatre) {
        this.theatre = theatre;
    }

    public int getTheatreNumber() {
        return theatreNumber;
    }

    public void setTheatreNumber(int theatreNumber) {
        this.theatreNumber = theatreNumber;
    }
}
