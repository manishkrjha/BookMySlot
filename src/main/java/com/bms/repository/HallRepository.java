package com.bms.repository;

import com.bms.entity.HallEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface HallRepository extends JpaRepository<HallEntity, UUID> {
}
