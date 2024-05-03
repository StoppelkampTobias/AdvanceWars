package org1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Parent root = FXMLLoader.load(getClass().getResource("AdvanceWars.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("Advance Wars");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
