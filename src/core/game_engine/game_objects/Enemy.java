package core.game_engine.game_objects;

import core.game_engine.GameObject;
import processing.core.PApplet;

    public class Enemy extends GameObject {
        Point point;
        public Enemy(PApplet parent, int x, int y) {
            super(parent, x, y);
        }

        @Override
        public void update() {
            getPoints();
            parent.fill(255,0,0);
            parent.noStroke();
            parent.rect(x,y,400,25);
            parent.rect(x,y,400,25);
        }
        private void getPoints(){point= new Point(x,y);}
    }

