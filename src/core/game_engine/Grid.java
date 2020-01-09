package core.game_engine;

import processing.core.PApplet;

public class Grid {
    PApplet parent;

    public Grid(PApplet parent) {
        this.parent = parent;
    }

    public void margins() {
        //building border
        parent.fill(225);
        parent.noStroke();
        parent.rectMode(parent.CORNER);
        parent.rect(0, 0, 600, 25);
        parent.rect(575, 0, 25, 600);
        parent.rect(0, 550, 600, 50);
        parent.rect(0, 0, 25, 600);
    }

    public void editorBackground(){
        //background
        parent.fill(175,0,255,100);
        parent.rectMode(parent.CORNER);
        parent.rect(0,0,600,600);
    }

    public void makeGrid(){
        parent.stroke(255,0,0);
        for(int y=25; y<=550; y+=25){
            parent.line(25, y, 575, y);
        }
        for(int x=25; x<=575; x+=25){
            parent.line(x, 25, x , 550);
        }
    }

}
