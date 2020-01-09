package core.game;

import core.game_engine.GameObject;
import core.game_engine.PlayerController;
import core.game_engine.game_objects.Enemy;
import core.game_engine.game_objects.Platform;
import core.game_engine.game_objects.Player;
import processing.core.PApplet;

import java.util.ArrayList;

public class GameManager {
    //where i name the classes i want to use in this class
    PApplet parent;
    PlayerController playerController;
    GameObject player;
    Platform platform;
    Enemy enemy;
    SceneManager sceneManager;
    private ArrayList<GameObject> objectsOnScreen;

//constuctor(creates the parameters for it
    public GameManager(PApplet p) {
        parent = p;
        objectsOnScreen = new ArrayList<>();
    }

    public void start(){
        //where i create the class i want to use
        playerController = new PlayerController(parent);
        player = new Player(parent,300,300);
        objectsOnScreen.add(player);
        sceneManager = new SceneManager(parent);
        playerController = new PlayerController(parent);
        platform = new Platform(parent, 400, 400);
        objectsOnScreen.add(platform);
          enemy = new Enemy(parent, 200, 200);
        objectsOnScreen.add(enemy);

    }

    public void update(){
        //running every frames

        sceneManager.linkScenes();

    }

    public void checkInput(){
       playerController.checkInput();
    }
    public void updateGame(){
        System.out.println("GAME");
        for(GameObject gameObject: objectsOnScreen){
            gameObject.update();
            playerController.addPlayer((Player) player);
            checkInput();
        }

    }
}
