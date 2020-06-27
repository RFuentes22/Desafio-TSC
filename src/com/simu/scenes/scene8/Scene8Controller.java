package com.simu.scenes.scene8;


import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Scene8Controller implements Initializable {


    @FXML
    private Button button;
    @FXML
    private AnchorPane anchorRoot;
    @FXML
    private StackPane parentContainer;
    @FXML
    private AnchorPane container;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    @FXML
    private void loadscn801(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene8/scene801.fxml"));
        transicion2(root);
    }

    @FXML
    private void loadscn81(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene8/scene81.fxml"));
        transicion2(root);
    }
    @FXML
    private void loadscn82(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene8/scene82.fxml"));
        transicion2(root);
    }

    @FXML
    private void loadscn8global(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene8/scene8global.fxml"));
        transicion2(root);
    }

    @FXML
    private void loadscn8global2(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene8/scene8global2.fxml"));
        transicion2(root);
    }

    @FXML
    private void loadscn8global3(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene8/scene8global3.fxml"));
        transicion2(root);
    }

    @FXML
    private void loadscn9n1(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene9/scene9N1.fxml"));
        transicion2(root);
    }




    @FXML
    private void loadBefore(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene7/View/scene7mefdg4.fxml"));
        transicion(root);
    }
    @FXML
    private void loadBeforescn8(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene8/scene8.fxml"));
        transicion(root);
    }


    //transicions
    public void transicion(Parent root){
        Scene scene = button.getScene();
        root.translateYProperty().set(scene.getHeight());

        parentContainer.getChildren().add(root);

        Timeline timeline = new Timeline();
        KeyValue kv = new KeyValue(root.translateYProperty(), 0, Interpolator.EASE_IN);
        KeyFrame kf = new KeyFrame(Duration.seconds(1), kv);
        timeline.getKeyFrames().add(kf);
        timeline.setOnFinished(t -> {
            parentContainer.getChildren().remove(anchorRoot);
        });
        timeline.play();

    }

    private void transicion2(Parent root)  {
        Scene scene = button.getScene();
        root.translateXProperty().set(scene.getWidth());

        StackPane parentContainer = (StackPane) button.getScene().getRoot();

        parentContainer.getChildren().add(root);

        Timeline timeline = new Timeline();
        KeyValue kv = new KeyValue(root.translateXProperty(), 0, Interpolator.EASE_IN);
        KeyFrame kf = new KeyFrame(Duration.seconds(1), kv);
        timeline.getKeyFrames().add(kf);
        timeline.setOnFinished(t -> {
            parentContainer.getChildren().remove(container);
        });
        timeline.play();
    }
}