package org.tech.tictactoe.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public abstract class Player {
    //Since we have an attribute, we have used Abstract class
    GameSymbol symbol;

    //Always return something rather than void
    public abstract BoardCell makeMove(Board board);
}
