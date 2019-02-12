package com.iut.verbe.front.utils;

import com.iut.verbe.front.controllers.AlertController;
import com.iut.verbe.front.controllers.ResultatsController;
import com.iut.verbe.front.start.Start;
import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;


import java.io.IOException;
import java.util.HashMap;

public class ControllerUtils {
    public static void loadStart(FXMLLoader loader) {
        loadFX(loader, 0);
    }

    private static void loadFX(FXMLLoader loader, int index) {
        try {
            Pane root = loader.load();
            Stage stage = new Stage();
            assert root != null;
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("Conjugator");
            stage.show();
            Start.setPrimaryStage(stage);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void loadAlert(String titre, String message){
        try {
            AlertController alertController = new AlertController(titre, message);
            FXMLLoader loader = new FXMLLoader(ControllerUtils.class.getResource("/gui/genericAlert.fxml"));
            loader.setController(alertController);
            loadFX(loader, 1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void animation(Parent root, Scene scene, AnchorPane anchorRoot) {
        StackPane parentContainer = (StackPane) scene.getRoot();
        parentContainer.getChildren().add(root);

        Timeline timeline = new Timeline();
        KeyValue kv = new KeyValue(root.translateXProperty(), 0, Interpolator.EASE_IN);
        KeyFrame kf = new KeyFrame(Duration.millis(500), kv);
        timeline.getKeyFrames().add(kf);
        timeline.play();
        anchorRoot.setVisible(false);
    }
}