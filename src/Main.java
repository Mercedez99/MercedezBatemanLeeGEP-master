import core.game.Test;
import processing.core.PApplet;

public class Main extends PApplet {
    Test testGame;

    public static void main(String[] args) {
        PApplet.main("Main");
    }
    public void settings() {
        size(600, 600);
    }
    public void setup() {
        background(0);
        noStroke();
        fill(102);
        testGame = new Test(this);
        testGame.start();
    }
//    public void keyPressed(){
//        testGame.checkInput();
//    }
    public void draw() {
        testGame.update();
    }


}
