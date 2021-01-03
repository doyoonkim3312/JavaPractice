package JavaFxPractice;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.*;

public class ImageLoadDemo extends Application {
    private static final String localPath = System.getProperty("user.home");
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("First Image Load Demo");


        Image testImage = loadImage("file:" + localPath + "/Desktop/" + "TestImage.jpg");


        // Load Image from Internet Location
        Image internetImage = loadImage(
                "https://ww.namu.la/s/6982dde9e737c205cab1bdfcd5b9fe8431c6379d2a6d4223d76783232a7fac46a44a2c78bc3f96d791757a7222778a912b281b1e1002ed3a299e38abe72456c4ce0c0921a2c5102dfac94fb32eeefd421c000efed3be6d5c81e3cd52bcce4226"
        );

        // Create ImageView object to display image object.
        ImageView testImageView = getImageView(testImage);

        ImageView internetImageView = getImageView(internetImage);


        // Create root node.
        HBox layoutContainer = new HBox(0.5, testImageView, internetImageView);
        layoutContainer.setAlignment(Pos.CENTER);

        // setPadding(Insets insets) method set padding around layoutContainer. It accepts Insets object as an argument.
        // Insets object accepts integer value for its constructor's parameter, which will be the pixel value of padding.
        layoutContainer.setPadding(new Insets(10));

        Scene scene = new Scene(layoutContainer);


        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();

    }

    /**
     * <p>This method takes Image object as an argument and return ImageView.</p>
     * <p>Default config: <b>Preserves Ratio</b>, Height: 250.0</p>
     * @param source Image that loaded from local or internet location.
     * @return <b>ImageView</b>
     */
    private static ImageView getImageView(Image source) {
        ImageView imageView = new ImageView(source);
        imageView.setPreserveRatio(true);
        imageView.setFitHeight(250.0);

        return imageView;
    }

    private static Image loadImage(String path) {
        // Use Image class to load image from local or Internet.
        // 'file:' is a protocol identifier indicating that the file is on the local computer.
        try {
            return new Image(path);
        } catch (Exception e) {
            return new Image("file:DefaultImage.png");
        }
    }
}
