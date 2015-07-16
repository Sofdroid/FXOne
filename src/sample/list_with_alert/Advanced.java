package sample.list_with_alert;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import sample.list_with_alert.Alert;
import sample.list_with_alert.AlertChoice;

/**
 * Created by Android on 16/07/2015.
 */
public class Advanced extends Application{
    TextField textField1 ;
    Button button ;
    // List of data
    ListView<String> listView ;
    // data
    ObservableList<String> items = FXCollections.observableArrayList();
    VBox vBox ;
    Scene scene ;
    @Override
    public void start(Stage primaryStage) throws Exception {
        textField1 = new TextField();
        textField1.setPromptText("Write here");
        button = new Button();
        button.setPrefSize(500,30);
        button.setText("Done");
        button.setStyle("-fx-font: 15 arial; -fx-base: #E91E63;");

        // Create the log that shows events
        listView = new ListView<String>();
        listView.setEditable(true);
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if ((textField1.getText().toString()).isEmpty()) {
                    System.out.println("Is empty !");
                    Alert.display("Error", "is empty ! ");
                } else if (isExist(textField1.getText().toString())) {
                    System.out.println("Is Exist !");
                    Alert.display("Error", "is Exist ! ");
                 } else {
                    items.add(textField1.getText().toString());
                    listView.setItems(items);
                    System.out.println(items);
                    textField1.setText("");
                    // just for a test
                    AlertChoice.display("Title", "Are you sure ??");
                }
            }
        });
        vBox = new VBox(20);
        vBox.getChildren().addAll(textField1 ,button , listView);
        scene = new Scene(vBox, 400, 500);
        primaryStage.setTitle("List View Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public  boolean isExist (String item) {
        for (String s : items) {
            if (s.equals(item)) {
                return true ;
            }
        }
        return  false;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
