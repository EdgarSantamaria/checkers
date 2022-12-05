package application;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Tile extends Rectangle {//tile is a rectangle shape
	
	public Tile(boolean shade, int x, int y) {//takes in shade and x y coordinates
		setWidth(CheckersMatch.TILE_SIZE);
		setHeight(CheckersMatch.TILE_SIZE);
		
		relocate(x * CheckersMatch.TILE_SIZE, y * CheckersMatch.TILE_SIZE);
	
		setFill(shade ? Color.BEIGE : Color.SADDLEBROWN);//filling shade of tiles, if shade is true it will fill in beige, 
														//if false it will fill in brown
														 
	
	}
	
}
