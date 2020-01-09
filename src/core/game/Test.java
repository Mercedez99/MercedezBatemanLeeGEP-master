package core.game;

import core.Ui;
import processing.core.PApplet;

public class Test {
    PApplet parent;
  SceneManager sceneManager;
    GameManager gameManager;
Scenes scenes;
    public Test(PApplet p) {
        this.parent = p;
    }

    public void start(){
        sceneManager = new SceneManager(parent);
        gameManager = new GameManager(parent);
        gameManager.start();

    }

    public void update(){
        if(sceneManager.ActiveScene() == Scenes.MAINMENU) {
            gameManager.update();
        }
        if(sceneManager.ActiveScene() == Scenes.EDITOR){
            //game engine manager stuff
        }
    }
    public void checkInput(){
        gameManager.checkInput();
    }
}

