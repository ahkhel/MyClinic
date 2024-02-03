package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class MedicalHistoryController {
	@FXML 
	TitledPane root;
	@FXML
	Label titleLbl;
	@FXML
	ToggleButton pregnancyTB, heartTB, diabetesTB, epilepsyTB, stomachTB, kidneyTB, bloodTB, otherTB;
	@ FXML
	VBox illnessesPane;

	@FXML 
	public void initialize() {
		root.setOnMouseClicked(e->{System.err.println("Mouse clicked on root pane");});
		pregnancyTB.setOnAction(e->{System.out.println("Pregnancy button pressed");});
		root.getStylesheets().add("cssPack/controls/toggleButtons.css");
	}
}
