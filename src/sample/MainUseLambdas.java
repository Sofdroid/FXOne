package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Created by Android on 16/07/2015.
 */

public class MainUseLambdas extends Application {
    Button button ;
    @Override
    public void start(Stage primaryStage) throws Exception{
        //  Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        primaryStage.setTitle("Title");
        button = new Button();
        button.setText("Click me !");
        button.setOnAction( e -> System.out.println("Yes we Cane !!"));

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout , 300 ,300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
