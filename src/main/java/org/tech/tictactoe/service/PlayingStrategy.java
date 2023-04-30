package org.tech.tictactoe.service;

import org.tech.tictactoe.models.Board;
import org.tech.tictactoe.models.BoardCell;

public interface PlayingStrategy {

    public BoardCell play(Board board);

}
