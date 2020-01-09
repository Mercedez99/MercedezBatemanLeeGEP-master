package core.game_engine;

import core.game_engine.game_objects.Point;
import processing.core.PApplet;

public abstract class GameObject {
    protected PApplet parent;
protected int x;
protected int y;

    public GameObject(PApplet parent, int x, int y) {
        this.parent = parent;
        this.x = x;
        this.y = y;

    }

    public abstract void update();


}
