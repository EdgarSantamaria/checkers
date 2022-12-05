package application;

import javafx.scene.layout.StackPane;

public class Piece extends StackPane{//extends stack pane because a piece is 2 ellipses 
	
	private Piece piece;
	
	public boolean hasPiece(){//to check if it is not null
		return piece!= null;
	}
	public Piece getPiece() {//getter
		return piece;
	}
	public void setPiece(Piece piece) {//setter
		this.piece = piece;
	}
	
}
