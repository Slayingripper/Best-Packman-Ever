package engine;

import java.io.IOException;

import core.Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.stage.Stage;

public class Setupcontroll {
    
	@FXML ColorPicker obstacle;
	@FXML ColorPicker background;
	
	public void initialise() {
	}
	
	@FXML public void returntomain(ActionEvent event) throws IOException {
		
		colourpicker();
		Parent start = FXMLLoader.load(getClass().getResource("set.fxml")) ;
	    Scene startScene = new Scene(start);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(startScene);

	}

	private void colourpicker() {
		
		BarObstacle.obstacle = obstacle.getValue();
		Controller.background = background.getValue();
		
	}
	

}
