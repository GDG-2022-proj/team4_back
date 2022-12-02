package com.example.soccup.service;

import com.example.soccup.entity.Player;
import com.example.soccup.entity.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {

    @Autowired
    PlayerRepository playerRepository;

    public Player detail(Long id){
        return playerRepository.findById(id).orElse(null);
    }
    public Player search(String name){
        String input = "%"+name+"%";
        Player player = playerRepository.findIdByName(input);
        return player;
    }

}
