package com.example.soccup.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.awt.*;

@Repository
public interface ScoreRepository extends JpaRepository<Score,Long> {
  //  @Query(value = "select * from score where player_id = :playerId",nativeQuery = true)
  //  Score findByPlayerId(@Param("id") Long playerId);
}
