package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.Group;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

public class LaunchScreen extends Application {
	
	
	@Override
	public void start(Stage primaryStage) {
		try {
			Group root = new Group();
			
			//creating scene  
			Scene scene = new Scene(root,700,700,Color.BEIGE);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			
			//Create button to start game
			Button startButton = new Button("Start Game");
			startButton.setLayoutX(300);
			startButton.setLayoutY(300);
			
			startButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("Must Launch Checkers Match Class here");//action handler where we will launch match
			}});
		
			//adding text
			Text text = new Text(); 
			text.setText("  Welcome To Checkers\n	  With a twist!");
			text.setX(100);
			text.setY(200);
			text.setFont(Font.font("Calibri",50));
			text.setFill(Color.SADDLEBROWN);
			
			//adding home screen image
			Image homeImage = new Image("Logo.png");
			ImageView imageView = new ImageView(homeImage);
			imageView.setX(0);
			imageView.setY(500);
			
			//adding button, text and image to scene
			root.getChildren().addAll(startButton, text, imageView);
			
			
			//changing window icon
			Image logo = new Image("Logo.png");
			primaryStage.getIcons().add(logo);
			
			//setting scene
			primaryStage.setScene(scene);
			
			//naming stage
			primaryStage.setTitle("Checkers");
			
			//displaying stage
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	
}
