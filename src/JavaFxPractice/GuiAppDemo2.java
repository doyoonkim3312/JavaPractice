package JavaFxPractice;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GuiAppDemo2 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("GUI Application Demo 2");

        // Create Labels.
        Label messageLabel1 = new Label("Hello, Java");
        Label messageLabel2 = new Label("Hello, JavaFx");
        Label messageLabel3 = new Label("Hello, Gui!");
        Label messageLabel4 = new Label("Hello, Apple");
        Label messageLabel5 = new Label("Hello MacBook!");
        Label messageLabel6 = new Label("Hello, HHKB!");

        // Create Layout Container

        VBox vBox1 = new VBox(messageLabel1, messageLabel2);
        vBox1.setAlignment(Pos.CENTER);
        VBox vBox2 = new VBox(messageLabel3, messageLabel4);
        vBox2.setAlignment(Pos.CENTER);
        VBox vBox3 = new VBox(messageLabel5, messageLabel6);
        vBox3.setAlignment(Pos.CENTER);

        // Creat Root node
        HBox layoutContainer = new HBox(10.0, vBox1, vBox2, vBox3);
        layoutContainer.setAlignment(Pos.CENTER);

        /*
            Root Node: layoutContainer
                ㄴ> Branch Node 1: vBox1
                    ㄴ> Leaf Node 1: messageLabel1
                    ㄴ> Leaf Node 2: messageLabel2
                ㄴ> Branch Node 2: vBox2
                    ㄴ> Leaf Node 1: messageLabel3
                    ㄴ> Leaf Node 2: messageLabel4
                ㄴ> Branch Node 3: vBox3
                    ㄴ> Leaf Node 1: messageLabel5
                    ㄴ> Leaf Node 2: messageLabel6
         */

        // Create Scene.
        Scene scene = new Scene(layoutContainer, 400, 150);

        // Add Scene to Stage.
        primaryStage.setScene(scene);

        // Display primary stage.
        primaryStage.show();

    }
}


