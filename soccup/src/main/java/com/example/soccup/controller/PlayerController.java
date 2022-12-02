package com.example.soccup.controller;

import com.example.soccup.entity.Player;
import com.example.soccup.entity.PlayerRepository;
import com.example.soccup.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RestController
@RequestMapping
public class PlayerController {
    @Autowired
    PlayerService playerService = new PlayerService();

    @GetMapping("player/{id}")
    public Player detail(@PathVariable Long id){
        Player player = playerService.detail(id);
        return player;
    }

}
