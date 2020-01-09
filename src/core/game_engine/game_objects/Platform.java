package core.game_engine.game_objects;

import core.game_engine.GameObject;
import processing.core.PApplet;

public class Platform extends GameObject {
Point point;
    public Platform(PApplet parent, int x, int y) {
        super(parent, x, y);
    }

    @Override
    public void update() {
       getPoints();
       parent.fill(255);
       parent.noStroke();
       parent.rect(x,y,25,25);
    }
    private void getPoints(){point= new Point(x,y);}
}
