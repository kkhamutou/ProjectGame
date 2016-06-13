package com.andAnotherOne;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Created by kirylkhamutou on 09/06/16.
 */
public class GridPane9 extends Application {

    Stage window;

    public static void main(String[] args) {
        launch(args);

    }
    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        window.setTitle("Window");

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10,10,10,10));
        gridPane.setVgap(8);
        gridPane.setHgap(10);

        //Name, lable
        Label nameLable = new Label("User");
        GridPane.setConstraints(nameLable, 0, 0);

        //Name imput
        TextField nameInput = new TextField("Bucky");
        GridPane.setConstraints(nameInput, 1,0);

        //Pass lable
        Label passLable = new Label("Password");
        GridPane.setConstraints(passLable, 0,1);

        //Password input
        TextField passInput = new TextField();
        passInput.setPromptText("password");
        GridPane.setConstraints(passInput, 1, 1);

        Button loginButton = new Button("Log In");
        GridPane.setConstraints(loginButton, 1, 2);

        gridPane.getChildren().addAll(nameInput,nameLable,passInput,passLable,loginButton);
        Scene scene = new Scene(gridPane, 300, 200);
        window.setScene(scene);
        window.show();

    }

}
