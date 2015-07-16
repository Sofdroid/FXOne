package sample.Controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;

/**
 * Created by Android on 16/07/2015.
 */
public class MainOfController extends Application{


     @Override
    public void start(Stage primaryStage) throws Exception {
         Parent root = FXMLLoader.load(getClass().getResource("Controller/sample.fxml"));
    }
    public static void main(String[] args) {
        launch(args);
    }
}
