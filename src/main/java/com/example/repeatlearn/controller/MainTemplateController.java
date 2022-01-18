package com.example.repeatlearn.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

public class MainTemplateController {

    @FXML
    private Button btnHome;

    @FXML
    private Button btnAzmon;

    @FXML
    private Button btnListeHameyeLogat;

    @FXML
    private Button btnListeHameyeLogatBarHasbRoz;

    @FXML
    private Button btnLogateSabtShodeYeEmroz;

    @FXML
    private Button btnMrorLogat;

    @FXML
    private Button btnSabteLogateJadid;

    @FXML
    private Button btnTanzimat;

    @FXML
    private HBox hbox;

    @FXML
    void btnHomeAction(ActionEvent event) throws IOException {
        hbox.getChildren().remove(1);
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/com/example/repeatlearn/home-view.fxml"));
        hbox.getChildren().add(anchorPane);
    }

    @FXML
    void btnAzmon_action(ActionEvent event) {

    }

    @FXML
    void btnListeHameyeLogatBarHasbRoz_aciton(ActionEvent event) {

    }

    @FXML
    void btnListeHameyeLogat_action(ActionEvent event) throws IOException {
        hbox.getChildren().remove(1);
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/com/example/repeatlearn/allWordsList-view.fxml"));
        hbox.getChildren().add(anchorPane);
    }

    @FXML
    void btnLogateSabtShodeYeEmroz_action(ActionEvent event) throws IOException {
        hbox.getChildren().remove(1);
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/com/example/repeatlearn/wordsInsertedToday-view.fxml"));
        hbox.getChildren().add(anchorPane);
    }

    @FXML
    void btnMrorLogat_action(ActionEvent event) throws IOException {
        hbox.getChildren().remove(1);
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/com/example/repeatlearn/reviewWord-view.fxml"));
        hbox.getChildren().add(anchorPane);
    }

    @FXML
    void btnSabteLogateJadid_action(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/example/repeatlearn/importNewWord-view.fxml"));
        Stage stage = new Stage();
        stage.setTitle("");
        stage.setScene(new Scene(root,600,400));
        stage.show();
    }

    @FXML
    void btnTanzimat_action(ActionEvent event) {

    }


    Stage stage;
    Parent root;

    public void initialize() throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/com/example/repeatlearn/home-view.fxml"));
        hbox.getChildren().add(anchorPane);
    }

    public void openPage() throws IOException {

        root = FXMLLoader.load(getClass().getResource("/com/example/repeatlearn/mainTemplate-view.fxml"));
        stage = new Stage();
        stage.setTitle("");
        stage.setScene(new Scene(root,900,600));
        stage.show();

    }

    public void closePage(){
        stage.close();
        root = null;
        stage = null;
    }

}
