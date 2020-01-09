package core.game;

import core.Ui;
import javafx.scene.Scene;
import processing.core.PApplet;

public class SceneManager {
    PApplet parent;
    Ui uiCreator;
    String scene = "Main Menu";
    GameManager gameManager;

    public SceneManager(PApplet p) {
        parent = p;
        gameManager = new GameManager(parent);

    }

    public String ActiveScene() {
        return scene;
    }

    public void linkScenes() {
        if (ActiveScene() == "Main Menu") {
            uiCreator = new Ui(parent);
            if(uiCreator.keys() == 1){
                scene = "Editor";
                uiCreator = null;
            }
        }
        else if(ActiveScene() == "Editor"){
            //commands
        }
    }
}


