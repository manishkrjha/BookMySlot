package com.bms.repository;

import com.bms.entity.TheatreEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TheatreRepository extends JpaRepository<TheatreEntity, UUID> {
}
