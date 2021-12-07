package com.menuState.levels;

import com.menuState.LevelState;
import com.menuState.StateManager;

public class LvlOne extends  LevelState{


    public LvlOne(StateManager sm, int rows, int columns) {
		super(sm, rows, columns);

		fillConfiguration(0, 0, getRows() - 1, getColumns() - 1, 1);
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if (((i == 1 || i == 5) && ((j + 1) % 2 == 0)) || (i == 3 && j % 2 == 0)) {
					fillConfiguration(i, j, 11);
				}
			}
		}

		translateConfiguration();
	}
}
