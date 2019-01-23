package game;

import room.OrdinaryRoom;
import room.Room;

public final class OrdinaryMazeGame extends MazeGame {

    @Override
    protected Room makeRoom() {
        return new OrdinaryRoom();
    }

}
