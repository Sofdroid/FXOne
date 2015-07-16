package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by Android on 16/07/2015.
 */
public class KeyboardEvents extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Title");

        final TextField textBox = new TextField();
        textBox.setPromptText("Write here");
        Button  button1 = new Button();
        button1.setText("Done");
        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String string = textBox.getText().toString() ;
                System.out.println(string);
            }
        });
        textBox.setOnKeyPressed(new EventHandler<KeyEvent>() {
            public void handle(KeyEvent ke) {
                System.out.println("Key Pressed: " + ke.getText());
            }
        });

        textBox.setOnKeyReleased(new EventHandler<KeyEvent>() {
            public void handle(KeyEvent ke) {
                System.out.println("Key Released: " + ke.getText());
            }
        });


        VBox vBox = new VBox(20);
        vBox.getChildren().addAll(textBox, button1);
        Scene scene = new Scene(vBox , 300 ,300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}


