package com.andAnotherOne;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.stage.Stage;

/**
 * Created by kirylkhamutou on 09/06/16.
 */
public class EmbeddingLayouts extends Application {

    Stage window;

    public static void main(String[] args) {
        launch(args);

    }
    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        window.setTitle("Window");

        HBox topManu = new HBox();
        Button buttonA = new Button("File");
        Button buttonB = new Button("Edit");
        Button buttonC = new Button("View");
        topManu.getChildren().addAll(buttonA,buttonB,buttonC);

        VBox leftManu = new VBox();
        Button buttonD = new Button("Page Up");
        Button buttonE = new Button("Page Down");
        Button buttonF = new Button("Exit");
        leftManu.getChildren().addAll(buttonD,buttonE,buttonF);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(topManu);
        borderPane.setLeft(leftManu);

        Scene scene = new Scene(borderPane, 400, 300);
        window.setScene(scene);
        window.show();

    }

}
