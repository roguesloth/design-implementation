package org.tech.tictactoe.models;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Getter
@Setter
public class Board {

    List<List<BoardCell>> cells = new ArrayList<>();

    public Board(int noOfRows, int noOfCol){
        List<BoardCell> columns = Collections.nCopies(noOfCol, new BoardCell());
        List<List<BoardCell>> boardCell = Collections.nCopies(noOfRows, columns);
        this.cells = boardCell;
    }
}
