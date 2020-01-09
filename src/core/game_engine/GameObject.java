package core.game_engine;

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

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    public abstract void update();


}
