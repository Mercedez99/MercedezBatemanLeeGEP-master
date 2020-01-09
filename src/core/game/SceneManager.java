package core.game;

import core.Ui;
import javafx.scene.Scene;
import processing.core.PApplet;



public class SceneManager {
    //manages the scenes
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
        //switch for scenes
        if (ActiveScene() == "Main Menu") {
            uiCreator = new Ui(parent);
            if(uiCreator.keys() == 1){
                scene = "Editor";
                uiCreator = null;

            }
            else if(uiCreator.keys() == 2) {
                scene = "Game";
                uiCreator = null;
            }
        }
        else if(ActiveScene() == "Editor"){
            //commands
        }
    }
}


