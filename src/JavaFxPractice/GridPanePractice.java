package JavaFxPractice;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPanePractice extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("GidePane Practice.");

        Label label1 = new Label("Label 1");
        Label label2 = new Label("Label 2");
        Label label3 = new Label("Label 3");
        Label label4 = new Label("Label 4");

        // Create new GridPane layout container
        GridPane layoutContainer = new GridPane();

        // Add controls to GridPane layout container.
        // add(control, column, row) is used to add controls to grid pane.
        layoutContainer.add(label1, 0,0);
        layoutContainer.add(label2, 0,1);
        layoutContainer.add(label3, 1,0);
        layoutContainer.add(label4, 1,1);

        layoutContainer.setAlignment(Pos.CENTER);

        // Display Grid Lines
        layoutContainer.setGridLinesVisible(true);

        // Set Horizontal and vertical gap between controls
        layoutContainer.setHgap(10.0);
        layoutContainer.setVgap(10.0);

        // Set padding around GridPane layout container.
        layoutContainer.setPadding(new Insets(15));

        // add layout container to scene.
        Scene scene = new Scene(layoutContainer, 300,100);

        // put scene on stage
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
