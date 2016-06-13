package com.andAnotherOne;

import com.andAnotherOne.ConfirmBox;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;



/**
 * Created by kirylkhamutou on 09/06/16.
 */
public class ClosingTheProgramProperly extends Application {

    Stage window;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("Game");

        window.setOnCloseRequest(e -> {
            e.consume();
            closeProgram();
        });

        button  = new Button("CLOSE");
        button.setOnAction(e -> closeProgram());

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }

    private void closeProgram() {
        Boolean answer = ConfirmBox.display("Title", "Sure you want to exit?");
        if (answer)
            window.close();
    }
}
