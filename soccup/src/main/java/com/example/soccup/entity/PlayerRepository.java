package com.example.soccup.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository  extends JpaRepository<Player,Long> {

    @Query(value = "select * from player where name like :name",nativeQuery = true)
    Player findIdByName(@Param("name") String name);

}

