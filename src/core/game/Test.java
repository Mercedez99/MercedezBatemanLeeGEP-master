package core.game;

import core.Ui;
import core.game_engine.GameEngineManager;
import processing.core.PApplet;

public class Test {
    PApplet parent;
  SceneManager sceneManager;
    GameManager gameManager;
    GameEngineManager gameEngineManager;
    Ui uiCreator;
//link with main for the direct functions


    public Test(PApplet p) {
        this.parent = p;
    }

    public void start(){
        sceneManager = new SceneManager(parent);
        gameManager = new GameManager(parent);
        gameManager.start();
        gameEngineManager = new GameEngineManager(parent);
        gameEngineManager.start();
        uiCreator = new Ui(parent);


    }

    public void update(){
        sceneManager.linkScenes();

        if(sceneManager.ActiveScene() == "Main Menu") {
            gameManager.update();
           uiCreator.menuTitle();

        }
        else if(sceneManager.ActiveScene() == "Editor") {
            //what to display
            gameEngineManager.update();
        }
         else if(sceneManager.ActiveScene() == "Game"){
                gameManager.updateGame();


        }
    }
   public void checkInput(){
        // play move
       gameManager.checkInput();
    }
}

