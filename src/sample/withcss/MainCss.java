package sample.withcss;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import com.sun.javafx.css.StyleManager ;
/**
 * Created by Android on 16/07/2015.
 */
public class MainCss extends Application  {

    Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("JavaFX With css");

        //GridPane with 10px padding around edge
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);




        grid.setHgap(10);

        //Name Label - constrains use (child, column, row)
        Label nameLabel = new Label("Username:");
        nameLabel.setId("bold-label");
        nameLabel.setStyle(" -fx-font-weight: bold; -fx-text-fill: #FFFFFF;");
        GridPane.setConstraints(nameLabel, 0, 0);

        //Name Input
        TextField nameInput = new TextField();
        nameInput.setPromptText("username");
        GridPane.setConstraints(nameInput, 1, 0);

        //Password Label
        Label passLabel = new Label("Password:");
        passLabel.setStyle(" -fx-font-weight: bold; -fx-text-fill: #FFFFFF; ");
        GridPane.setConstraints(passLabel, 0, 1);

        //Password Input
        TextField passInput = new TextField();
        passInput.setPromptText("password");
        GridPane.setConstraints(passInput, 1, 1);

        //Login
        Button loginButton = new Button("Log In");
        loginButton.setStyle(" -fx-background-color: #7cafc2; -fx-text-fill: #FFFFFF; -fx-background-radius: 4;");
        GridPane.setConstraints(loginButton, 1, 2);

        //Sign up
        Button signUpButton = new Button("Sign Up");
        signUpButton.getStyleClass().add("button-blue");
        signUpButton.setStyle(" -fx-background-color: #7cafc2;  -fx-text-fill: #FFFFFF; -fx-background-radius: 4;");
        signUpButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                setUserAgentStylesheet(STYLESHEET_CASPIAN);
            }
        });
        GridPane.setConstraints(signUpButton, 1, 3);

        //Add everything to grid
        grid.getChildren().addAll(nameLabel, nameInput, passLabel, passInput, loginButton, signUpButton);
        grid.setStyle(" -fx-background-color: #383838;");
        Scene scene = new Scene(grid, 300, 200);

        scene.getStylesheets().add("design.css");
        window.setScene(scene);
        window.show();
    }

}
