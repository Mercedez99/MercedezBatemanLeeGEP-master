package core.game;

import core.game_engine.GameObject;
import core.game_engine.PlayerController;
import core.game_engine.game_objects.Player;
import processing.core.PApplet;

import java.util.ArrayList;

public class GameManager {
    PApplet parent;
    PlayerController playerController;
    GameObject player;
    SceneManager sceneManager;
    private ArrayList<GameObject> objectsOnScreen;


    public GameManager(PApplet p) {
        parent = p;
        objectsOnScreen = new ArrayList<>();
    }

    public void start(){
        playerController = new PlayerController(parent);
        player = new Player(parent,300,300);
        objectsOnScreen.add(player);
        sceneManager = new SceneManager(parent);
        playerController = new PlayerController(parent);
    }

    public void update(){
        for(GameObject gameObject: objectsOnScreen){
            gameObject.update();
        }
        sceneManager.linkScenes();
        playerController.addPlayer((Player) player);
        checkInput();
    }

    public void checkInput(){
        playerController.checkInput();
    }
}
