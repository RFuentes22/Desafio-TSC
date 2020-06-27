package com.simu.scenes.scene7;

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

public class Scene7ControllerMEF implements Initializable {


    @FXML
    private Button button;
    @FXML
    private AnchorPane anchorRoot;
    @FXML
    private StackPane parentContainer;
    @FXML
    private AnchorPane container;

    Parent root;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    @FXML
    private void load1(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene7/View/scene7mef1.fxml"));
        transicion(root);
    }

    @FXML
    private void load12(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene7/View/scene7mef12.fxml"));
        transicion2(root);
    }

    @FXML
    private void load2(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene7/View/scene7mef2.fxml"));
        transicion(root);
    }

    @FXML
    private void load3(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene7/View/scene7mef3.fxml"));
        transicion(root);
    }

    @FXML
    private void load4(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene7/View/scene7mef4.fxml"));
        transicion(root);
    }

    @FXML
    private void load5(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene7/View/scene7mef5.fxml"));
        transicion(root);
    }

    @FXML
    private void load51(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene7/View/scene7mef51.fxml"));
        transicion2(root);
    }

    @FXML
    private void load61(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene7/View/scene7mef61.fxml"));
        transicion(root);
    }

    @FXML
    private void load62(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene7/View/scene7mef62.fxml"));
        transicion2(root);
    }

    @FXML
    private void load63(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene7/View/scene7mef63.fxml"));
        transicion2(root);
    }

    @FXML
    private void load71(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene7/View/scene7mefd1.fxml"));
        transicion(root);
    }

    @FXML
    private void load72(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene7/View/scene7mefd2.fxml"));
        transicion2(root);
    }

    @FXML
    private void load73(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene7/View/scene7mefd3.fxml"));
        transicion2(root);
    }

    @FXML
    private void loadfd4(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene7/View/scene7mefd4.fxml"));
        transicion2(root);
    }

    @FXML
    private void loadfd5(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene7/View/scene7mefd5.fxml"));
        transicion2(root);
    }

    @FXML
    private void loadfd6(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene7/View/scene7mefd6.fxml"));
        transicion2(root);
    }

    @FXML
    private void loaddf1(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene7/View/scene7mefdf1.fxml"));
        transicion(root);
    }

    @FXML
    private void loaddf2(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene7/View/scene7mefdf2.fxml"));
        transicion2(root);
    }

    @FXML
    private void loaddf3(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene7/View/scene7mefdf3.fxml"));
        transicion2(root);
    }

    @FXML
    private void loaddf4(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene7/View/scene7mefdf4.fxml"));
        transicion2(root);
    }

    @FXML
    private void loaddf5(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene7/View/scene7mefdf5.fxml"));
        transicion2(root);
    }

    @FXML
    private void loaddg1(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene7/View/scene7mefdg1.fxml"));
        transicion(root);
    }

    @FXML
    private void loaddg2(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene7/View/scene7mefdg2.fxml"));
        transicion2(root);
    }

    @FXML
    private void loaddg3(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene7/View/scene7mefdg3.fxml"));
        transicion2(root);
    }

    @FXML
    private void loaddg4(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene7/View/scene7mefdg4.fxml"));
        transicion2(root);
    }

    @FXML
    private void loaddH1(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene7/View/scene7mefdH1.fxml"));
        transicion(root);
    }

    @FXML
    private void loaddH2(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene7/View/scene7mefdH2.fxml"));
        transicion2(root);
    }

    @FXML
    private void loaddk1(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene7/View/scene7mefdk1.fxml"));
        transicion(root);
    }

    @FXML
    private void loaddk2(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene7/View/scene7mefdk2.fxml"));
        transicion2(root);
    }

    @FXML
    private void loaddL1(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene7/View/scene7mefdL1.fxml"));
        transicion(root);
    }
    @FXML
    private void loadscn8(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene8/scene8.fxml"));
        transicion(root);
    }
    //before
    @FXML
    private void loadBeforescn6(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene6/scene6.fxml"));
        transicion(root);
    }
    @FXML
    private void loadBeforemef(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene7/View/scene7mef.fxml"));
        transicion(root);
    }
    @FXML
    private void loadBeforemef1(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene7/View/scene7mef1.fxml"));
        transicion2(root);
    }
    @FXML
    private void loadBeforemef12(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene7/View/scene7mef12.fxml"));
        transicion2(root);
    }
    @FXML
    private void loadBeforemef2(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene7/View/scene7mef2.fxml"));
        transicion2(root);
    }
    @FXML
    private void loadBeforemef3(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene7/View/scene7mef3.fxml"));
        transicion2(root);
    }
    @FXML
    private void loadBeforemef4(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene7/View/scene7mef4.fxml"));
        transicion2(root);
    }
    @FXML
    private void loadBeforemef5(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene7/View/scene7mef5.fxml"));
        transicion2(root);
    }
    @FXML
    private void loadBeforemef51(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene7/View/scene7mef51.fxml"));
        transicion(root);
    }
    @FXML
    private void loadBeforemef6(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene7/View/scene7mef6.fxml"));
        transicion2(root);
    }
    @FXML
    private void loadBeforemef61(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene7/View/scene7mef61.fxml"));
        transicion2(root);
    }
    @FXML
    private void loadBeforemef62(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene7/View/scene7mef62.fxml"));
        transicion2(root);
    }
    @FXML
    private void loadBeforemef63(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene7/View/scene7mef63.fxml"));
        transicion(root);
    }
    @FXML
    private void loadBeforemefd1(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene7/View/scene7mefd1.fxml"));
        transicion(root);
    }
    @FXML
    private void loadBeforemefd2(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene7/View/scene7mefd2.fxml"));
        transicion(root);
    }
    @FXML
    private void loadBeforemefd3(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene7/View/scene7mefd3.fxml"));
        transicion(root);
    }
    @FXML
    private void loadBeforemefd4(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene7/View/scene7mefd4.fxml"));
        transicion(root);
    }
    @FXML
    private void loadBeforemefd5(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene7/View/scene7mefd5.fxml"));
        transicion(root);
    }
    @FXML
    private void loadBeforemefd6(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene7/View/scene7mefd6.fxml"));
        transicion(root);
    }
    @FXML
    private void loadBeforemefdk1(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene7/View/scene7mefdk1.fxml"));
        transicion2(root);
    }
    @FXML
    private void loadBeforemefk2(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene7/View/scene7mefdk2.fxml"));
        transicion(root);
    }
    @FXML
    private void loadBeforemefL1(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene7/View/scene7mefdL1.fxml"));
        transicion(root);
    }
    @FXML
    private void loadBeforemefH1(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene7/View/scene7mefdH1.fxml"));
        transicion2(root);
    }
    @FXML
    private void loadBeforemefH2(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene7/View/scene7mefdH2.fxml"));
        transicion(root);
    }
    @FXML
    private void loadBeforemefdf1(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene7/View/scene7mefdf1.fxml"));
        transicion2(root);
    }
    @FXML
    private void loadBeforemefdf2(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene7/View/scene7mefdf2.fxml"));
        transicion2(root);
    }
    @FXML
    private void loadBeforemefdf3(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene7/View/scene7mefdf3.fxml"));
        transicion2(root);
    }
    @FXML
    private void loadBeforemefdf4(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene7/View/scene7mefdf4.fxml"));
        transicion2(root);
    }
    @FXML
    private void loadBeforemefdf5(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene7/View/scene7mefdf5.fxml"));
        transicion(root);
    }
    @FXML
    private void loadBeforemefdfg1(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene7/View/scene7mefdg1.fxml"));
        transicion2(root);
    }
    @FXML
    private void loadBeforemefdfg2(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene7/View/scene7mefdg2.fxml"));
        transicion2(root);
    }
    @FXML
    private void loadBeforemefdfg3(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene7/View/scene7mefdg3.fxml"));
        transicion2(root);
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