package com.simu.scenes.scene4;


import com.simu.scenes.scene3.Scene3Controller;
import com.simu.scenes.scene5.Scene5Controller;
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

public class Scene41Controller implements Initializable {


    @FXML
    private Button button;
    @FXML
    private AnchorPane anchorRoot;
    @FXML
    private StackPane parentContainer;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    @FXML
    private void loadSecond(ActionEvent event) throws IOException {

        Scene5Controller scene5 = new Scene5Controller();
        Stage stage = (Stage) button.getScene().getWindow();
        scene5.start(stage);
    }

}