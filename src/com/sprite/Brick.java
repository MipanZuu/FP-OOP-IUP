package com.sprite;
import java.util.List;

import javax.swing.ImageIcon;

import com.main.Drop;

public class Brick extends Sprite{
    private boolean destroyed;
    public static int BRICK_WIDTH = 40;
	public static int BRICK_HEIGHT = 10;
	public static int BRICK_X_OFFSET = 10;
	public static int BRICK_Y_OFFSET = 50;

    public Brick(int x, int y, int i) {

        initBrick(x, y);
    }

    private void initBrick(int x, int y) {

        this.x = x;
        this.y = y;

        destroyed = false;

        loadImage();
        getImageDimensions();
    }

    private void loadImage() {

        var ii = new ImageIcon("resources/brick.png");
        image = ii.getImage();
    }

    public boolean isDestroyed() {

        return destroyed;
    }

    public void setDestroyed(boolean val) {

        destroyed = val;
    }

    public static void breaks(List<Drop> drops) {
    }
}
