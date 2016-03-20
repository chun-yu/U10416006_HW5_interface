//import Data
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.scene.*;
import javafx.scene.shape.Circle;
import javafx.stage.*;
import javafx.application.*;
import javafx.geometry.*;
import java.util.*;

//Main class
public class BeanGame extends Application{

//output the scene
	@Override
	public void start(Stage primaryStage){
		BorderPane pane = new BorderPane();		
			pane.setTop(getStartPane());
			pane.setCenter(Game());
		Scene scene = new Scene(pane);
			primaryStage.setTitle("BeanGame");
			primaryStage.setScene(scene);
			primaryStage.show();
}

//StartPane method
private HBox getStartPane(){

  //create hbox
	HBox hBox = new HBox(15);
	
	//set pad and background
	hBox.setPadding(new Insets(15,15,15,15));
	hBox.setStyle("-fx-background-color: gold");
	
	//set two button
	hBox.getChildren().add(new Button("NEW GAME"));
	hBox.getChildren().add(new Button("E X I T"));
	
	//input the image
	ImageView imageView = new ImageView(new Image("tai.png"));
	hBox.getChildren().add(imageView);
	return hBox;
}

//Game method
private Pane Game(){
  //random the bean place
	int x = (int)( Math.random()*40);
	int y = (int)( Math.random()*40);
	
	//create stackpane input the game image
	StackPane pane = new StackPane();
	pane.setStyle("-fx-background-color: black");
	Image image = new Image("game.jpg");
	
	//create gridpane input the bean image
	GridPane gridPane = new GridPane();
		Image image1 = new Image("smile.png");
	gridPane.add(new ImageView(image1),70,70);
	pane.getChildren().add(new ImageView(image));
	pane.getChildren().add(gridPane);

	return pane;
}
}
