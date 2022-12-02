package com.example.soccup.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

public class GameControllerTest {

    GameController gameController = new GameController();
    @DisplayName("int list를 넣으면 셔플된 결과를 반환한다.")
    @Test
    void case1(){
        List<Integer> temp = new ArrayList<>(List.of(1,2,3,4,5,6));
        List<Integer> newTemp = gameController.playerShuffle(temp);
        assertThat(newTemp.size()).isEqualTo(temp.size());
        assertThat(newTemp.contains(List.of(1,2,3,4,5,6)));
        System.out.println(newTemp);
    }
}