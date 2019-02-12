package com.iut.verbe.front.controllers;

import com.iut.verbe.comon.constant.ServerConstant;
import com.iut.verbe.comon.link.ServerInterface;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.rmi.Naming;
import java.util.ResourceBundle;

import static com.iut.verbe.front.utils.ControllerUtils.animation;
import static com.iut.verbe.front.utils.ControllerUtils.loadAlert;

public class MainController implements Initializable {

    @FXML
    private AnchorPane anchorRoot;

    @FXML
    private JFXTextField inputVerbe;

    @FXML
    private JFXComboBox inputTemps;

    @FXML
    private JFXButton conjuguer;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.inputTemps.getItems().addAll("Participe présent", "Participe passé", "Présent simple", "Passé simple", "Futur simple");
        this.inputTemps.getSelectionModel().select(0);
    }

    @FXML
    void conjuguerClick(ActionEvent event) {
        try {
            if(this.inputVerbe != null && !this.inputVerbe.getText().isEmpty()) {
                ServerConstant.SERVER = (ServerInterface) Naming.lookup("//" + ServerConstant.IP + ":" + ServerConstant.PORT + "/serverInterface");
                ResultatsController resultatsController = new ResultatsController(this.inputVerbe.getText(), this.inputTemps.getSelectionModel().getSelectedIndex());
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/ResultatsController.fxml"));
                loader.setController(resultatsController);
                Parent root = loader.load();
                Scene scene = conjuguer.getScene();
                root.translateXProperty().set(scene.getWidth());
                animation(root, scene, anchorRoot);
            }else{
                loadAlert("Impossible d'effectuer la conjugaison", "Veuillez entrer un verbe");
            }
        }catch (Exception ex){
            loadAlert("Impossible d'effectuer la conjugaison", ex.toString());
        }
    }
}
