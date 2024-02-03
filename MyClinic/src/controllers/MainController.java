package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.MenuBar;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.BorderPane;

public class MainController {
	@FXML
	BorderPane root;
	@FXML
	MenuBar menuBar;
	@FXML
	TabPane parentTabPane, mainTabPane;
	@FXML
	Tab mainTab, patientTab, treatmentTab, appointmentsTab, historyTab, patientsTab, labTab, financeTab, stockTab, documentsTab, stuffTab;
	@FXML
	public void initialize() {
		
	}
}
