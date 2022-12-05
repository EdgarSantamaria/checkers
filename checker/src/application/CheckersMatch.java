package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

public class CheckersMatch extends Application {

	public static final int TILE_SIZE = 100;//setting size of tile
	//8 by 8 setting width and length
	public static final int WIDTH = 8;
	public static final int LENGTH = 8;
	
	private Group tileGroup = new Group();//
	private Group pieceGroup = new Group();//
	
	private Parent createContent() {
		Pane root = new Pane();
		root.setPrefSize(WIDTH * TILE_SIZE, LENGTH * TILE_SIZE);
		root.getChildren().addAll(tileGroup, pieceGroup);
		
		//Creating 2D array for tile board 
		for (int i = 0; i < LENGTH; i++) {
			for (int j = 0; j < WIDTH; j++) {
				//for every even sum of i and j, the tile shade is light(beige), vice versa
				//so since shade is a boolean, if it is true it will fill in beige(light), if it is false it will fill in brown(dark)
				//to illustrate the light and dark pattern of a checkers board
				Tile tile = new Tile((i + j) % 2 == 0, i,j);
				
				tileGroup.getChildren().add(tile);//adding to stage
			}
		}
		
		return root;
	}
	
	
	
	@Override
	public void start(Stage stage) throws Exception {
		Scene scene = new Scene (createContent());
		stage.setTitle("Checkers Match");//setting tile
		//changing window icon
		Image logo = new Image("Logo.png");//setting checkers logo
		stage.getIcons().add(logo);//adding it to window icon
		stage.setResizable(false);//so that the window won't resize because it messes up the display
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args) { launch(args);}
}













