package sample.list_with_alert;

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
public class AlertChoice {

    public  static  void display (String title , String message) {
        Stage stage = new Stage() ;
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle(title);
        stage.setMinWidth(250);

        Label label = new Label() ;
        label.setText(message);
        Button buttonYes = new Button("Yes") ;
        buttonYes.setPrefSize(250 , 30);
        buttonYes.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               System.out.println("yessss");
                stage.close();
            }
        });

        Button buttonNo = new Button("No") ;
        buttonNo.setPrefSize(250 , 30);
        buttonNo.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("noooo");
                stage.close();
            }
        });
        VBox vBox = new VBox(10) ;
        vBox.getChildren().addAll(label, buttonYes , buttonNo);
        vBox.setAlignment(Pos.CENTER);
        Scene scene = new Scene(vBox) ;
        stage.setScene(scene);
        stage.show();
    }
}
