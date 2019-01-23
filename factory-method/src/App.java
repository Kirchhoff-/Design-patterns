import game.MagicMazeGame;
import game.OrdinaryMazeGame;

public class App {

    public static void main(String[] args) {
        OrdinaryMazeGame ordinaryMazeGame = new OrdinaryMazeGame();
        ordinaryMazeGame.showRoomsInfo();
        MagicMazeGame magicMazeGame = new MagicMazeGame();
        magicMazeGame.showRoomsInfo();
    }
}
