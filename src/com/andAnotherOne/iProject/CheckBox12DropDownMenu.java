package com.andAnotherOne.iProject;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.*;
import javafx.stage.Stage;

/**
 * Created by kirylkhamutou on 09/06/16.
 */
public class CheckBox12DropDownMenu extends Application {

    Stage window;
    Scene scene;
    Button button;

    public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("ChoiceBox Demo");
        button = new Button("Click");

        ChoiceBox<String> choiceBox = new ChoiceBox<>();

        //getItems returns the ObservableList which you can add items to
        choiceBox.getItems().add("Apples");
        choiceBox.getItems().add("Bananas");
        choiceBox.getItems().addAll("Bacon", "Ham", "Meatballs");

        //Set default value
        choiceBox.setValue("Apples");

        button.setOnAction(e -> getChoice(choiceBox));

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(choiceBox,button);

        scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }

    //To get the value of the selected item
    private void getChoice(ChoiceBox<String> choiceBox) {
        String food = choiceBox.getValue();
        System.out.println(food);
    }

}
