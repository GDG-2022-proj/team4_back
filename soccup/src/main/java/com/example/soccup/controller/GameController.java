package com.example.soccup.controller;

import com.example.soccup.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping
public class GameController {
        @Autowired
        ScoreService scoreService = new ScoreService();

        @GetMapping("game/")
        public List<Integer> playerShuffle(@RequestParam(value="playerList") List<Integer> playerList){
            Collections.shuffle(playerList);
            return playerList;
        }

        @PostMapping("game/")
        public void playerScoreUP(@RequestParam(value="id") int id){
            
        }

}
