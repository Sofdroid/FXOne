package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Created by Android on 16/07/2015.
 */
public class MouseEvents  extends Application{
    Circle circle ;
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Title");

        circle = new Circle(100 ,Color.RED);

        DropShadow shadow = new DropShadow();

        circle.setOnMouseEntered(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent me) {
                System.out.println("Mouse entered");
                circle.setEffect(shadow);
             }
        });

        circle.setOnMouseExited(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent me) {
                System.out.println("Mouse exited");
                circle.setEffect(null);
            }
        });

        circle.setOnMousePressed(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent me) {
                System.out.println("Mouse pressed");
            }
        });
        StackPane layout = new StackPane();
        layout.getChildren().add(circle);
        Scene scene = new Scene(layout , 300 ,300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
