package com.halfminute.itmadness;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/halfminute/itmadness/hello-view.fxml"));
        VBox root = loader.load();
        Scene scene = new Scene(root, 1500, 768);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Hello JavaFX");
        primaryStage.show();

        HelloController controller = loader.getController();
        controller.initialize();
    }
}
