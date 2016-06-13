package com;

import com.andAnotherOne.iProject.ConfirmBox;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Created by kirylkhamutou on 09/06/16.
 */
public class GUI5_Alert_Boxes extends Application{

    Stage window;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("Game");

        button  = new Button("Click");

        button.setOnAction(e -> {
            boolean result = ConfirmBox.display("Window", "Are you sure to close the window?");
            System.out.println(result);
        });

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }
}
