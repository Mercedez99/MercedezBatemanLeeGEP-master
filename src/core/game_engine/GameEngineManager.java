package core.game_engine;

import processing.core.PApplet;

import java.util.logging.Level;

public class GameEngineManager {
    PApplet parent;
    Grid grid;
    LevelEditor levelEditor;
    private boolean editorBackground = false;

    public GameEngineManager(PApplet parent) {
        this.parent = parent;
    }

    public void start(){
    grid = new Grid(parent);
    levelEditor = new LevelEditor(parent);
    }


    public void update(){
        if(!editorBackground){
            grid.editorBackground();
            editorBackground = true;
        }
        levelEditor.putObject(parent.mouseX, parent.mouseY);
        grid.margins();
        grid.makeGrid();
    }
}
