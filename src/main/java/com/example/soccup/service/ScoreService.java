package com.example.soccup.service;

import com.example.soccup.entity.PlayerRepository;
import com.example.soccup.entity.Score;
import com.example.soccup.entity.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ScoreService {
    @Autowired
    ScoreRepository scoreRepository;
    public void updateScore(long id) {
        Score score = scoreRepository.findById(id).orElse(null);
        int newScore = score.getScore() + 1;
        score.setScore(newScore);
 //       System.out.println(newScore);
        scoreRepository.save(score);
    }

    public List<Integer> playerScoreAll() {
        List<Integer> scores = new ArrayList<>();
        List<Score> player = scoreRepository.findAll();
        for(Score s : player){
            scores.add(s.getScore());
        }
        return scores;
    }
}
