package game;

import room.MagicRoom;
import room.Room;

public final class MagicMazeGame extends MazeGame {

    @Override
    protected Room makeRoom() {
        return new MagicRoom();
    }
}
