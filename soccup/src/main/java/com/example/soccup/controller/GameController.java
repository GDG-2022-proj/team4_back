package com.example.soccup.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping
public class GameController {

        @GetMapping("game/")
        public List<Integer> playerShuffle(List<Integer> playerList){
            Collections.shuffle(playerList);
            return playerList;
        }

        @PostMapping("game/")
        public void playerScoreUP(int id){

        }
}
