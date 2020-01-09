package core;

import processing.core.PApplet;

public class Ui {
    PApplet parent;
    public Ui(PApplet p) {
        this.parent = p;
    }

    public void menuTitle(){
        parent.fill(255,0,0);
        parent.textSize(50);
        parent.text("WELCOME!", 200, 300);
    }

    public void editor(){
        parent.fill(255,0,0);
        parent.textSize(50);
        parent.text("EDITOR!", 200, 300);
    }
}
