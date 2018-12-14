package core;

import javafx.geometry.Insets;
import javafx.scene.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.stage.Stage;
import static javafx.scene.paint.Color.*;

import engine.GameManager;

@SuppressWarnings("unused")
public class Main extends Application {
	static Stage newStage;
    @SuppressWarnings("static-access")
	@Override
    public void start(Stage theStage) throws Exception{
////        Parent root = FXMLLoader.load(getClass().getResource("pacman.fxml"));
//        theStage.setTitle( "Pacman" );
//
//        Group root = new Group();
//        Scene theScene = new Scene( root );
//        theStage.setScene( theScene );
//
//        Canvas canvas = new Canvas( 1225, 600 );
//        root.getChildren().add( canvas );
//        GameManager gameManager = new GameManager(root);
//
//        gameManager.drawBoard();
//       
//
//        theScene.addEventHandler(KeyEvent.KEY_PRESSED, event -> gameManager.movePacman(event));
//        theScene.addEventHandler(KeyEvent.KEY_RELEASED, event -> gameManager.stopPacman(event));
//        theScene.addEventHandler(KeyEvent.KEY_PRESSED, event -> gameManager.restartGame(event));
//
//        theStage.show();
    	
    	/*
    	 * loads up the Homescreen with 
    	 * a window size of 1225x600
    	 * 
    	 */
    	 Parent root = FXMLLoader.load(getClass().getResource("homescreen.fxml"));
         theStage.setTitle( "Pacman" );
         Scene start = new Scene(root, 1225, 600);
         theStage.setScene( start );
         theStage.show();
         this.newStage = theStage;
    }


    /**
     * Play pacman intro music
     * when the program starts up.
     */
    @SuppressWarnings("deprecation")
	public static void main(String[] args) {
    	 try {
      		java.applet.AudioClip clip =
      		java.applet.Applet.newAudioClip(
      		new java.net.URL("http://soundbible.com/grab.php?id=1563&type=wav"));
      		clip.play();
      		} catch (java.net.MalformedURLException murle) {
      		System.out.println(murle);
      		}
    	 
    	launch(args);
    	
    	
    }
    
}