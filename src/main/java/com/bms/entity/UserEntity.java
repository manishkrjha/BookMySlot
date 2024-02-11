package com.bms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.List;
import java.util.UUID;

@Entity
public class UserEntity {

    @Id
    private String email;

    private String password;
    private String name;
    private long walletBalance;
    private List<UUID> shows;


}
