package core;


import engine.GameManager;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

public class Controller {
	public static Color background = Color.BLACK;
	
	
	
	@FXML public void startGame () throws Exception{
		Stage theStage = new Stage();
		
		theStage.setTitle( "Pacman" );

  Group root = new Group();
  Scene theScene = new Scene( root );
  theStage.setScene( theScene );

  Canvas canvas = new Canvas( 1225, 600 );
  GraphicsContext gc = canvas.getGraphicsContext2D();
  gc.setFill(background);
  gc.fillRect(0,0,1225,600);

  root.getChildren().add( canvas );
  GameManager gameManager = new GameManager(root);

  gameManager.drawBoard();
 

  theScene.addEventHandler(KeyEvent.KEY_PRESSED, event -> gameManager.movePacman(event));
  theScene.addEventHandler(KeyEvent.KEY_RELEASED, event -> gameManager.stopPacman(event));
  theScene.addEventHandler(KeyEvent.KEY_PRESSED, event -> gameManager.restartGame(event));

  theStage.show();
}
	@FXML public void Setup () throws Exception{
	Stage setStage = new Stage();
	Parent root = FXMLLoader.load(getClass().getResource("set.fxml"));
	Scene scene = new Scene ( root,1225, 600 );
	
	setStage.setScene(scene);
	setStage.show();
	
}
	
}