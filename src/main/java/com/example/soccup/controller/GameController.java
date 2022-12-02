package com.example.soccup.controller;

import com.example.soccup.entity.Player;
import com.example.soccup.entity.PlayerRepository;
import com.example.soccup.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping
public class GameController {
        @Autowired
        PlayerRepository playerRepository;
        @Autowired
        ScoreService scoreService;

        @CrossOrigin
        @GetMapping("game/")
        public List<Player> playerAll(){
            List<Player> playerList = playerRepository.findAll();
            return playerList;
        }
//        @CrossOrigin
//        @GetMapping("game/")
//        public List<Integer> playerShuffle(@RequestParam(value="playerList") List<Integer> playerList){
//            Collections.shuffle(playerList);
//            return playerList;
//        }

        @CrossOrigin
        @PostMapping("game/")
        public void playerScoreUP(@RequestParam(value="id") Long id){
            scoreService.updateScore(id);
        }

        @CrossOrigin
        @GetMapping("result/")
        public List<Integer> playerScoreAll(){
            List<Integer> score = scoreService.playerScoreAll();
            List<Integer> scorePercent = new ArrayList<>();
            float sum=0;
            int count = score.size();
            for(int s : score){
                sum += s;
            }
            if(sum!=0) {
                for (int s : score) {
                    scorePercent.add(Math.round(s / sum) * 100);
                }
            }else{
                for (int s : score) {
                    scorePercent.add(0);
                }
            }
            return scorePercent;
        }

}
