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
        parent.noStroke();
        parent.textSize(50);
        parent.text("WELCOME!", 200, 300);
        parent.text("PRESS SPACE TO PLAY!", 100, 200);
        parent.text("PRESS ENTER TO EDIT!", 100, 100);
    }

    public int keys(){
        //checks what key was pressed and returns the key code value
        if(keyCheck() == 10){
            return key = 1;
        }
        else if (keyCheck()==32){
            return key = 2;
        }
        return key;
    }

    public int keyCheck(){
        //checks the key code
        parent.keyTyped();
        return parent.keyCode;
    }
}
