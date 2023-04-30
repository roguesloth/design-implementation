package org.tech.tictactoe.models;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Game {

    Board board;
    List<Player> playerList = new ArrayList<>();

    public void addPlayers(Player player){
        this.playerList.add(player);
    }

}
