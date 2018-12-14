package engine;

import java.io.IOException;

import core.Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.stage.Stage;

public class Setupcontroll {
    @FXML Button	savebtn;
	@FXML ColorPicker obstacle;
	@FXML ColorPicker background;
	
	
	
	@FXML public void returntomain(ActionEvent event) throws IOException {
		/*Gets the values from the ColorPickers
		 * Adds them to the their corresponding positions
		 * hence if we pick Yellow for the background 
		 * the value will be added in the controller class
		 * and will change the background.
		 */
		closesstage();
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
	
	private void closesstage() {
		Stage stage = (Stage) savebtn.getScene().getWindow();
		stage.close();
	}

}
