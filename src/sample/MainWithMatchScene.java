package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.SwipeEvent;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import javax.swing.text.Element;
import javax.swing.text.html.ImageView;

/**
 * Created by Android on 16/07/2015.
 */

public class MainWithMatchScene extends Application {
    Button button1 , button2  ;
    Stage stage ;
    Scene scene1 ,scene2 ;
    VBox vbox ;
    StackPane layoutPane1 , layoutPane2 ;
    Label label1 ;
    Image imageOk ;
    @Override
    public void start(Stage primaryStage) throws Exception{

        stage = primaryStage ;

        primaryStage.setTitle("Title of primary stage");
        button1 = new Button();
        imageOk = new Image(getClass().getResourceAsStream("images/balla.png"));
        button1.setText("Click me to move to scene 2");
        button1.setStyle("-fx-font: 15 arial; -fx-base: #E91E63;");
        DropShadow shadow = new DropShadow();
        //Adding the shadow when the mouse cursor is on
        button1.addEventHandler(MouseEvent.MOUSE_ENTERED,
                new EventHandler<MouseEvent>() {
                    @Override public void handle(MouseEvent e) {
                        button1.setEffect(shadow);
                    }
                });
        //Removing the shadow when the mouse cursor is off
        button1.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent e) {
                        button1.setEffect(null);
                    }
                });


        button1.setOnAction(e -> {
            System.out.println("button one clicked ! ");
            label1 = new Label("Welcome");
            button2 = new Button();
            button2.setText("Click me to move to scene 1");
            button2.setStyle("-fx-font: 15 arial; -fx-base: #E91E63;");
            vbox = new VBox(50);
            vbox.getChildren().addAll(label1, button2  );
          //  layoutPane2 = new StackPane();
          //  layoutPane2.getChildren().addAll(label1, button2);
            scene2 = new Scene(vbox, 300, 200);

            scene2.setOnSwipeRight(new EventHandler<SwipeEvent>() {
                @Override
                public void handle(SwipeEvent event) {
                    stage.setScene(scene1);
                }
            });
            stage.setScene(scene2);
            button2.setOnAction(event -> {
                stage.setScene(scene1);
            });
        });
        layoutPane1 = new StackPane();
        layoutPane1.getChildren().add(button1);
        scene1 = new Scene(layoutPane1 , 300 ,300);
        primaryStage.setScene(scene1);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
