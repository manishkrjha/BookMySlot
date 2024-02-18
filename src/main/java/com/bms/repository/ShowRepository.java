package com.bms.repository;

import com.bms.entity.ShowEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.UUID;
import java.util.List;
import java.util.Date;

public interface ShowRepository extends JpaRepository<ShowEntity, UUID> {


}
