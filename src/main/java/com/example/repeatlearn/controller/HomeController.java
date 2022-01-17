package com.example.repeatlearn.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class HomeController {

    @FXML
    private JFXButton JFXButton_SeeTodaysWords;

    @FXML
    private JFXButton JFXButton_addNewWord;

    @FXML
    private AnchorPane anchorPane_mainTemplate;

    @FXML
    private ImageView imageView_mainTemplate;

    Stage stage;
    Parent root;

    @FXML
    void JFXButton_SeeTodaysWords_Action(ActionEvent event) throws IOException {

    }

    @FXML
    void JFXButton_addNewWord_Action(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/example/repeatlearn/importNewWord-view.fxml"));
        Stage stage = new Stage();
        stage.setTitle("");
        stage.setScene(new Scene(root,600,400));
        stage.show();
    }

    public void openPage() throws IOException {

        root = FXMLLoader.load(getClass().getResource("/com/example/repeatlearn/home-view.fxml"));
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
