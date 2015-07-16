package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * Created by Android on 16/07/2015.
 */
public class Alert {

    public  static  void display (String title , String message) {
        Stage stage = new Stage() ;
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle(title);
        stage.setMinWidth(250);

        Label label = new Label() ;
        label.setText(message);
        Button button = new Button("Close") ;
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                stage.close();
            }
        });

        VBox vBox = new VBox(10) ;
        vBox.getChildren().addAll(label, button);
        vBox.setAlignment(Pos.CENTER);
        Scene scene = new Scene(vBox) ;
        stage.setScene(scene);
        stage.show();
    }
}
