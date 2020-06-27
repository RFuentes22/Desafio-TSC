package com.simu.scenes.scene9;


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
import javafx.stage.Stage;
import javafx.util.Duration;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Scene9Controller implements Initializable {


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
    private void loadscn9N1(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene9/scene9N1.fxml"));
        transicion2(root);
    }
    @FXML
    private void loadscn9N2(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene9/scene9N2.fxml"));
        transicion2(root);
    }
    @FXML
    private void loadscn9D1(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene9/scene9D1.fxml"));
        transicion2(root);
    }
    @FXML
    private void loadscn9D2(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene9/scene9D2.fxml"));
        transicion2(root);
    }
    @FXML
    private void loadscn9end(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene9/scene9end.fxml"));
        transicion2(root);
    }

    @FXML
    private void loadBefore(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene8/scene8global3.fxml"));
        transicion(root);
    }

    @FXML
    private void loadBeforeinit(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene1/scene1.fxml"));
        transicion(root);
    }

    @FXML
    private void end(ActionEvent event) throws IOException {
        Stage stage = (Stage) button.getScene().getWindow();
        stage.close();
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