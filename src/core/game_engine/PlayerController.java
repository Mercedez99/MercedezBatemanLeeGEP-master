package core.game_engine;

import core.game_engine.game_objects.Player;
import processing.core.PApplet;


public class PlayerController {
    PApplet parent;
    Player player;


    public PlayerController(PApplet p) {
        parent = p;
    }

    public void addPlayer(Player player) {
        this.player = player;
    }

    public void checkInput() {
        if (player == null) return;
        switch (parent.key) {
            case 'w':
                player.moveUp();
                break;
            case 's':
                player.moveDown();
                break;
            case 'a':
                player.moveLeft();
                break;
            case 'd':
                player.moveRight();
        }
//        if (parent.key == 'w' || parent.key == 'W') {
//            player.moveUp();
//            return;
//        } else if (parent.key == 's' || parent.key == 'S') {
//            player.moveDown();
//            return;
//        } else if (parent.key == 'a' || parent.key == 'A') {
//            player.moveLeft();
//            return;
//
//        } else if (parent.key == 'd' || parent.key == 'D') {
//            player.moveRight();
//            return;
//        }
//    }
    }
}

