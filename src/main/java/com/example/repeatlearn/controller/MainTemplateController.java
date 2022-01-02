package com.example.repeatlearn.controller;

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

    /*@FXML
    private AnchorPane anchorPane_mainTemplate;*/

    @FXML
    private HBox hbox;


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
