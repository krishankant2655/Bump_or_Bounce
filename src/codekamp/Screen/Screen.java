package Bump_or_Bounce.Screen;

import Bump_or_Bounce.Entity.Entity;

import java.awt.*;

import java.util.ArrayList;
import java.util.List;


abstract public class Screen {


    protected List<Entity> entities = new ArrayList<>();

    public void update() {
        for (Entity e : entities) {
            e.update();
        }
    }

    public void draw(Graphics g) {
        for (Entity e : entities) {
            if (e.visible) {
                g.drawImage(e.image, e.x, e.y, null);
            }
        }


    }

    public void onKeyPress(int keyCode) {

    }
}