package core.game_engine.game_objects;

import core.game_engine.GameObject;
import processing.core.PApplet;

public class Player extends GameObject {

Point point;

    public Player(PApplet parent, int x, int y) {
        super(parent, x, y);
    }

    @Override
    public void update() {
        getPoints();
        parent.fill(255);
        parent.noStroke();
        parent.rect(x, y, 25, 25);
    }

    // tells where to move player
    private void getPoints(){
        point = new Point(x,y);
    }
    public void moveUp(){
        y -=1;
    }
    public void moveDown(){
        y +=1;
    }
    public void moveLeft(){
        x -=1;
    }
    public void moveRight(){
        x +=1;
    }

}
