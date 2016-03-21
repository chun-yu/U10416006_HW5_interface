import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.scene.*;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.*;
import javafx.scene.paint.*;
import javafx.stage.*;
import javafx.application.*;
import javafx.geometry.*;
import java.util.*;

public class BeanGame extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Scene scene = new Scene(new LinePane(),700,700);
		primaryStage.setTitle("BeanGame");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}

class  LinePane extends Pane {
	public LinePane(){
		Polygon polygon = new Polygon();
		polygon.getPoints().addAll(new Double[]{
			320.0, 30.0,
		    320.0, 100.0,
		    150.0, 550.0,
		    150.0, 600.0,
		    600.0, 600.0,
		    600.0, 550.0,
		    420.0, 100.0,
		    420.0, 30.0});
		polygon.setStrokeWidth(6);
		polygon.setStroke(Color.GRAY);
		polygon.setFill(null);
		Line line1 = new Line(200,550,200,600);
		Line line2 = new Line(250,550,250,600);
		Line line3 = new Line(300,550,300,600);
		Line line4 = new Line(350,550,350,600);
		Line line5 = new Line(400,550,400,600);
		Line line6 = new Line(450,550,450,600);
		Line line7 = new Line(500,550,500,600);
		Line line8 = new Line(550,550,550,600);

		Circle circle2 = new Circle(370,70,10,Color.RED);
		Circle circle3 = new Circle(345,135,10,Color.RED);
		Circle circle4 = new Circle(395,135,10,Color.RED);
		Circle circle5 = new Circle(320,200,10,Color.RED);
		Circle circle6 = new Circle(370,200,10,Color.RED);
		Circle circle7 = new Circle(420,200,10,Color.RED);
		Circle circle8 = new Circle(295,265,10,Color.RED);
		Circle circle9 = new Circle(345,265,10,Color.RED);
		Circle circle10 = new Circle(395,265,10,Color.RED);
		Circle circle11 = new Circle(445,265,10,Color.RED);
		Circle circle12 = new Circle(270,330,10,Color.RED);
		Circle circle13 = new Circle(320,330,10,Color.RED);
		Circle circle14 = new Circle(370,330,10,Color.RED);
		Circle circle15 = new Circle(420,330,10,Color.RED);
		Circle circle16 = new Circle(470,330,10,Color.RED);
		Circle circle17 = new Circle(245,395,10,Color.RED);
		Circle circle18 = new Circle(295,395,10,Color.RED);
		Circle circle19 = new Circle(345,395,10,Color.RED);
		Circle circle20 = new Circle(395,395,10,Color.RED);
		Circle circle21 = new Circle(445,395,10,Color.RED);
		Circle circle22 = new Circle(495,395,10,Color.RED);
		Circle circle23 = new Circle(220,460,10,Color.RED);
		Circle circle25 = new Circle(270,460,10,Color.RED);
		Circle circle26 = new Circle(320,460,10,Color.RED);
		Circle circle27 = new Circle(370,460,10,Color.RED);
		Circle circle28 = new Circle(420,460,10,Color.RED);
		Circle circle29 = new Circle(470,460,10,Color.RED);
		Circle circle30 = new Circle(520,460,10,Color.RED);


		
		line1.setStrokeWidth(5);
		line2.setStrokeWidth(5);
		line3.setStrokeWidth(5);
		line4.setStrokeWidth(5);
		line5.setStrokeWidth(5);
		line6.setStrokeWidth(5);
		line7.setStrokeWidth(5);
		line8.setStrokeWidth(5);
		
		line1.setStroke(Color.BLACK);
		getChildren().addAll(polygon,line1,line2,line3,line4,line5,line6,line7,line8,circle2,circle3,circle4,circle5,circle6,circle7,circle8,circle9,circle10,circle11,circle12,circle13,circle14,circle15,circle16,circle17,circle18,circle19,circle20,circle21,circle22,circle23,circle25,circle26,circle27,circle28,circle29,circle30);
		
	}
}
