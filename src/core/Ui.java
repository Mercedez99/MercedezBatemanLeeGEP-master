package core;

import processing.core.PApplet;

public class Ui {
    PApplet parent;
    int key;
    public Ui(PApplet p) {
        this.parent = p;
    }

    public void menuTitle(){
        parent.fill(255,0,0);
        parent.textSize(50);
        parent.text("WELCOME!", 200, 300);
    }

    public int keys(){
        if(keyCheck() == 10){
            return key = 1;
        }
        return key;
    }

    public int keyCheck(){
        parent.keyTyped();
        return parent.keyCode;
    }
}
