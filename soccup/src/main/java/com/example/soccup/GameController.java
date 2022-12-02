package com.example.soccup;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class GameController {

        @GetMapping("game/")
        public List<Integer> player(){
            return null;
        }
}
