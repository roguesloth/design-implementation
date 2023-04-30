package org.tech.tictactoe.models;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.tech.tictactoe.service.PlayingStrategy;

@NoArgsConstructor
@AllArgsConstructor
public class Bot extends Player{

    PlayingStrategy playingStrategy;

    @Override
    public BoardCell makeMove(Board board) {
        return playingStrategy.play(board);
    }
}
