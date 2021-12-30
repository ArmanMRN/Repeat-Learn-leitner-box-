package com.example.repeatlearn.controller;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class MainTemplateController {

    @FXML
    private AnchorPane anchorPane_mainTemplate;

    @FXML
    private ImageView imageView_mainTemplate;

    //todo : add setter and getter to this for change the imageUrl
    String imageURL = "/com/example/repeatlearn/images/bk-2.png";

    public void initialize(){
        Image image = new Image(getClass().getResource(imageURL).toExternalForm());
        imageView_mainTemplate.setImage(image);
    }

}
