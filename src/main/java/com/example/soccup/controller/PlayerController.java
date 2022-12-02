package com.example.soccup.controller;

import com.example.soccup.entity.Player;
import com.example.soccup.entity.PlayerRepository;
import com.example.soccup.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

@RestController
@RequestMapping
public class PlayerController {
    @Autowired
    PlayerService playerService = new PlayerService();

    @CrossOrigin
    @GetMapping("player/{id}")
    public Player detail(@PathVariable Long id){
        Player player = playerService.detail(id);
        return player;
    }

    @CrossOrigin
    @GetMapping("player/")
    public Player search(@RequestParam(value="name") String name){
        Player player = playerService.search(name);
        return player;
    }

}
