package JavaFxPractice;

/*
    First GUI Application using JavaFx
    To run this application, add "--module-path ${PATH_TO_FX} --add-modules javafx.controls,javafx.fxml" to
    Run -> Edit Configuration -> VM Option.
 */


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class FirstGuiPractice extends Application {
    public static void main(String[] args) {
        // Launch the application
        // launch(args) calls the start method, passing a reference to the Stage object as an argument.
        launch(args);
    }

    /**
     * This method is overridden from Application class.
     * It performs an entry point of application.
     * @param primaryStage primaryStage variable will reference the Stage object created by the launch method.
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Set the stage title
        primaryStage.setTitle("First GUI Application");

        // Create Label Controls.
        Label messageLabel = new Label("Hello, World!");
        Label messageLabel2 = new Label("Hello, JavaFx");

        // Create Layout Container
        // HBox: Arranges controls in a single horizontal line.
        // VBox: Arranges controls in a single vertical line.
        // GidePane: Arrange controls in a grid with rows and columns.
        HBox layoutContainer = new HBox(20.0, messageLabel, messageLabel2);
        layoutContainer.setAlignment(Pos.TOP_CENTER);
        //layoutContainer.setSpacing(20.0);

        // Create a Scene and add layoutContainer(HBox) as a root node.
        // There are three types of node: Root, Branch, Leaf.
        // Root node: Parents of all the other nodes in the scene. There's only one root node exists.
        // Branch node: Node can have other nodes as a children.
        // Leaf node: Node at the end of hierarchy. Cannot have children.
        // public Scene(layoutContainer, width, height)
        Scene scene = new Scene(layoutContainer, 300, 100);

        // Add Scene object to Stage.
        // Recall that this Start(Stage primaryStage) method receives a reference to a Stage object as a argument.
        primaryStage.setScene(scene);

        // show the stage (window)
        primaryStage.show();
    }


}
