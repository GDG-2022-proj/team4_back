package com.example.soccup;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping
public class GameController {

        @GetMapping("game/")
        public List<Integer> player(List<Integer> playerList){
            Collections.shuffle(playerList);
            return playerList;
        }
}
