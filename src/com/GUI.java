package com;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Created by kirylkhamutou on 09/06/16.
 */
public class GUI extends Application  {

    Button button;

    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Guess What the number");
        button = new Button();
        button.setText("Play");

        button.setOnAction(e -> System.out.println("Hey my Nigga"));


        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}


/*implements EventHandler<ActionEvent>*/
/*button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("I am an anonymous inner class");

            }
        });*/


//button.setOnAction(this);
   /* @Override
    public void handle(ActionEvent event) {
        if (event.getSource()==button){
            System.out.println("Start");
        }
        //Button implementation
    }*/


