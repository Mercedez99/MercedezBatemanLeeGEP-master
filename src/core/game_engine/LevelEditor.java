package core.game_engine;

import core.Ui;
import core.game_engine.game_objects.Platform;
import processing.core.PApplet;

import java.util.ArrayList;

public class LevelEditor {
    PApplet parent;
    Ui uiCreator;
    private ArrayList <GameObject> placedObject;

    public LevelEditor(PApplet parent) {
        this.parent = parent;
        uiCreator = new Ui(parent);
        placedObject = new ArrayList<>();
    }

    public void putObject(float x, float y){
        System.out.println(placedObject.size());

        int roundedX = PApplet.round(x / 25)*25;
        int roundedY = PApplet.round(y / 25)*25;

        if(roundedX > 25 && roundedX < 575 && roundedY > 25 && roundedY < 575){
            if(isPlaceEmpty(roundedX, roundedY) && parent.mousePressed){
               Platform platform = new Platform(parent, roundedX, roundedY);
                placedObject.add(platform);
            }
        }
    }

    public boolean isPlaceEmpty(int x, int y){
        for(GameObject gameObject: placedObject){
            if(gameObject.getX() == x && gameObject.getY() == y){
                return false;
            }
        }
        return true;
    }
}
