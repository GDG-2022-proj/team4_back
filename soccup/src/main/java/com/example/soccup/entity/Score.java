package com.example.soccup.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;

@Getter
@Setter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Score {

    @Id
    @OneToOne
    @JoinColumn(name ="player_id")
    private Player player;

    @ColumnDefault("0")
    private int score;

}
