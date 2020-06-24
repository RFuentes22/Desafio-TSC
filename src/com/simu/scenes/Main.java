package com.simu.scenes;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene1/scene1.fxml"));

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("MEF 3D");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
