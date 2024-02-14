package com.bms.repository;

import com.bms.entity.ShowEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ShowRepository extends JpaRepository<ShowEntity, UUID> {
}
