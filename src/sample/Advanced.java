package sample;

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
/**
 * Created by Android on 16/07/2015.
 */
public class Advanced extends Application{
    TextField textField ;
    Button button ;
    // List of data
    ListView<String> listView ;
    // data
    ObservableList<String> items = FXCollections.observableArrayList();
    VBox vBox ;
    Scene scene ;
    @Override
    public void start(Stage primaryStage) throws Exception {
        textField = new TextField();
        textField.setPromptText("Write here");
        button = new Button();
        button.setPrefSize(500,30);
        button.setText("Done");
        // Create the log that shows events
        listView = new ListView<String>();
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (!(textField.getText().toString()).isEmpty()) {
                    items.add(textField.getText().toString());
                    listView.setItems(items);
                    System.out.println(items);
                } else {
                    System.out.println("Is empty !");
                    Alert.display("Error", "is empty ! ");

                }
            }
        });

        vBox = new VBox(20);
        vBox.getChildren().addAll(textField ,button , listView);
        scene = new Scene(vBox, 400, 500);
        primaryStage.setTitle("List View Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
