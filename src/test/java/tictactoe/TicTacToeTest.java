package tictactoe;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.tech.tictactoe.models.*;
import org.tech.tictactoe.service.GreedyStrategy;
import org.tech.tictactoe.service.PlayingStrategy;

public class TicTacToeTest {

    @Test
    public void boardTest(){
        Board board = new Board(3,3);
        Assertions.assertEquals(3, board.getCells().size());
        Assertions.assertEquals(3, board.getCells().get(0).size());
    }

    @Test
    public Game createGame(){
        Game game = new Game();

        Board board = new Board(3,3);
        game.setBoard(board);

        User user = new User();
        user.setUserName("rupeshkumar");
        user.setEmailId("rupesh@gmail.com");

        HumanPlayer humanPlayer = new HumanPlayer();
        humanPlayer.setSymbol(GameSymbol.X);
        humanPlayer.setUser(user);

        game.addPlayers(humanPlayer);

        PlayingStrategy playingStrategy = new GreedyStrategy();
        Player bot = new Bot(playingStrategy);
        game.addPlayers(bot);

        return game;
    }
}
