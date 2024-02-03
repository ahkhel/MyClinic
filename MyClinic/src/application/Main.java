package application;
	
import controllers.MainController;
import controllers.MedicalHistoryController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
//			FXMLLoader loader = new FXMLLoader(getClass().getResource("../views/medicalHistoryLayout.fxml"));
//			MedicalHistoryController controller = loader.getController();

			FXMLLoader loader = new FXMLLoader(getClass().getResource("../views/mainLayout.fxml"));
			MainController controller = loader.getController();
			
			Parent root  = loader.load();
//			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,1200,700);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
