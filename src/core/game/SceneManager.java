package core.game;

import core.Ui;
import javafx.scene.Scene;
import processing.core.PApplet;

public class SceneManager {
    PApplet parent;
    Scenes scene;
    GameManager gameManager;
    Ui uiCreator;

    public SceneManager(PApplet p) {
        parent = p;
        scene = Scenes.MAINMENU;
        gameManager = new GameManager(parent);

    }

    public Scenes ActiveScene() {
        return scene;
    }

    public void linkScenes() {
        if (ActiveScene() == Scenes.MAINMENU) {
            uiCreator = new Ui(parent);
            uiCreator.menuTitle();
            if(parent.mousePressed){
                System.out.println(Scenes.EDITOR);
                scene = Scenes.EDITOR;
            }
        }
        else if(ActiveScene() == Scenes.EDITOR){
            uiCreator = new Ui(parent);
            uiCreator.editor();
        }
    }
}


