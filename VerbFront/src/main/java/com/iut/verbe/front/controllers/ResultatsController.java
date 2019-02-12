package com.iut.verbe.front.controllers;

import com.iut.verbe.comon.constant.ServerConstant;
import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import static com.iut.verbe.front.utils.ControllerUtils.animation;
import static com.iut.verbe.front.utils.ControllerUtils.loadAlert;

public class ResultatsController implements Initializable {

    @FXML
    private StackPane parentContainer;

    @FXML
    private AnchorPane anchorRoot;

    @FXML
    private VBox vbox;

    private String verbe;
    private int temps;

    public ResultatsController(String verbe, int temps) {
        this.verbe = verbe;
        this.temps = temps;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            List<String> resultats = ServerConstant.SERVER.conjugaison(verbe, temps);
            if (resultats != null)
            {
                for (String item : resultats) {
                    vbox.getChildren().add(new Label(item));
                }

                generateCloseButton();
            }else {
                generateCloseButton();
            }
        }catch (Exception ex){
            loadAlert("Impossible d'effectuer la conjugaison", ex.toString());
            newTraduction();
        }
    }

    private void generateCloseButton() {
        JFXButton back = new JFXButton("Nouvelle conjugaison");
        back.setStyle("-fx-background-color: lightgrey");
        back.setOnAction(e -> {
            newTraduction();
        });

        vbox.getChildren().add(back);
        back.requestFocus();
    }

    public void newTraduction() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/gui/mainUi.fxml"));
            Scene scene = vbox.getScene();
            root.translateXProperty().set(-scene.getWidth());
            animation(root, scene, anchorRoot);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
