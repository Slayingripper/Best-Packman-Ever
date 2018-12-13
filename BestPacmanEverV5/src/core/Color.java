package core;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;

public class Color {

	
	
	
	@FXML Button Save;
	@FXML ColorPicker backgroundbtn;
	@FXML ColorPicker obsticlebtn;
	
	
	/* Connects the colour pickers
	 * with the rest of the program
	 * so that we can change the colour
	 * of the maze to anything we want
	 */
	
	public static javafx.scene.paint.Color backgroundbtn1;
	public static javafx.scene.paint.Color obsticlebtn1;
	
	
	@FXML public void Colorpicker() throws Exception{
		
		backgroundbtn1 = backgroundbtn.getValue();
		obsticlebtn1 = obsticlebtn.getValue();
		
	
	}
	

}
