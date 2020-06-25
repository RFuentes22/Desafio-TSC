package com.simu.scenes.scene5;


import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.ScrollEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.ImagePattern;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Transform;
import javafx.stage.Stage;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Scene5Controller extends Application {


    private static final float WIDTH = 800;
    private static final float HEIGHT = 600;
    private BorderPane layout;
    //private Scene scene2;
    @FXML
    private Button button;
    @FXML
    private AnchorPane container;

    private double anchorX, anchorY;
    private double anchorAngleX = 0;
    private double anchorAngleY = 0;
    private final DoubleProperty angleX = new SimpleDoubleProperty(5);
    private final DoubleProperty angleY = new SimpleDoubleProperty(0);


    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        layout=new BorderPane();
        //  primaryStage.close();

        Box box = prepareBox();

        com.simu.scenes.scene5.Scene5Controller.SmartGroup group = new com.simu.scenes.scene5.Scene5Controller.SmartGroup();
        group.getChildren().add(box);

        Camera camera = new PerspectiveCamera();
        Scene scene = new Scene(group, WIDTH, HEIGHT);
        // scene.setFill(Color.SILVER);

        Image x = new Image("/resources/background/mesh.jpg");
        ImagePattern pattern = new ImagePattern(x);
        scene.setFill(pattern);
        scene.setCamera(camera);

        group.translateXProperty().set(WIDTH / 2);
        group.translateYProperty().set(HEIGHT / 2);
        group.translateZProperty().set(-860);

        initMouseControl(group, scene, primaryStage);

        //scene2 = new Scene(layout,WIDTH,HEIGHT);

        // create a image
        Image i = new Image("/resources/black.jpg");
        ImageView iw = new ImageView(i);

        Button btnext = new Button("Next");
        btnext.setPrefSize(45,-50);
        btnext.setRotationAxis(box.getRotationAxis());
        //btnext.setBackground();
        btnext.setLayoutX(40);
        btnext.setLayoutY(38);

        //group.getChildrenUnmodifiable().add(btnext);
        group.getChildren().add(btnext);
        //group.getChildrenUnmodifiable().set(1,btnext);

        btnext.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                Parent root = null;
                try {
                    root = FXMLLoader.load(getClass().getResource("/com/simu/scenes/scene4/scene4.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root);

                primaryStage.setScene(scene);

            }
        });


        primaryStage.setTitle("MEF 3D");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    private Box prepareBox() {
        PhongMaterial material = new PhongMaterial();
        material.setDiffuseMap(new Image(getClass().getResourceAsStream("/resources/cube/mesh.jpg")));
        Box box = new Box(30, 30, 30);
        box.setMaterial(material);
        return box;
    }

    private void initMouseControl(com.simu.scenes.scene5.Scene5Controller.SmartGroup group, Scene scene, Stage stage) {
        Rotate xRotate;
        Rotate yRotate;
        group.getTransforms().addAll(
                xRotate = new Rotate(0, Rotate.X_AXIS),
                yRotate = new Rotate(0, Rotate.Y_AXIS)
        );
        xRotate.angleProperty().bind(angleX);
        yRotate.angleProperty().bind(angleY);

        scene.setOnMousePressed(event -> {
            anchorX = event.getSceneX();
            anchorY = event.getSceneY();
            anchorAngleX = angleX.get();
            anchorAngleY = angleY.get();
        });

        scene.setOnMouseDragged(event -> {
            angleX.set(anchorAngleX - (anchorY - event.getSceneY()));
            angleY.set(anchorAngleY + anchorX - event.getSceneX());
        });

        stage.addEventHandler(ScrollEvent.SCROLL, event -> {
            double delta = event.getDeltaY();
            group.translateZProperty().set(group.getTranslateZ() + delta);
        });
    }

    public static void main(String[] args) {
        launch(args);
    }

    class SmartGroup extends Group {

        Rotate r;
        Transform t = new Rotate();

        void rotateByX(int ang) {
            r = new Rotate(ang, Rotate.X_AXIS);
            t = t.createConcatenation(r);
            this.getTransforms().clear();
            this.getTransforms().addAll(t);
        }

        void rotateByY(int ang) {
            r = new Rotate(ang, Rotate.Y_AXIS);
            t = t.createConcatenation(r);
            this.getTransforms().clear();
            this.getTransforms().addAll(t);
        }
    }
}
