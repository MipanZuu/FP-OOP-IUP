package com.sprite.Bricks;

import javax.swing.ImageIcon;

import com.sprite.Brick;

public class UnBreakBricks extends Brick {

	public UnBreakBricks(int x, int y, char dropId) {
		super(x, y, dropId);
	}

	@Override
	public void setDestroyed(boolean isDestroyed) {
		// do nothing
	}

	protected void loadImage() {
		ImageIcon ii = new ImageIcon("Resource/brick.png");
		image = ii.getImage();
	}

}
