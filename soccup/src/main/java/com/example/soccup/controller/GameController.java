package com.example.soccup.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping
public class GameController {

        @GetMapping("game/")
        public List<Integer> playerShuffle(@RequestParam(value="playerList") List<Integer> playerList){
            Collections.shuffle(playerList);
            return playerList;
        }
        @PostMapping("game/")
        public void playerScoreUP(@RequestParam(value="id") int id){

        }
}
