package com.sprite.Bricks;

import javax.swing.ImageIcon;

import com.sprite.Brick;

public class NormalBrick extends Brick {

	public NormalBrick(int x, int y, char dropId) {
		super(x, y, dropId);
	}

	protected void loadImage() {
		ImageIcon ii = new ImageIcon("Resources/brick.png");
		image = ii.getImage();
	}
}
