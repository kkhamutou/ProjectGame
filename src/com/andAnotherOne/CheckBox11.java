package com.andAnotherOne;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.*;
import javafx.stage.Stage;

/**
 * Created by kirylkhamutou on 09/06/16.
 */
public class CheckBox11 extends Application {

    Stage window;
    Scene scene;
    Button button;

    public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Bucky's Meat Subs");

        //Check Box
        CheckBox box1 = new CheckBox("Bacon");
        CheckBox box2 = new CheckBox("Tuna");
        box2.setSelected(true);

        button = new Button("Order Now");
        button.setOnAction(e -> handleOptions(box1, box2));


        //layout
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(button,box1,box2);

        scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();

    }

    //handle check box options
    private void handleOptions(CheckBox box1, CheckBox box2) {
        String message  = "Users order\n";

        if (box1.isSelected())
            message += "Bacon\n";
        if (box2.isSelected())
            message += "Tuna\n";
        System.out.println(message);
    }
}