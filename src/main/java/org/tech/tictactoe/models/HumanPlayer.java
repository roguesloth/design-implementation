package org.tech.tictactoe.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class HumanPlayer extends Player{

    User user;

    @Override
    public BoardCell makeMove(Board board) {
        return null;
    }
}
