package com.example.repeatlearn;

import com.example.repeatlearn.controller.MainTemplateController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("welcome-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 330);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        //stage.setResizable(false);
        stage.show();

        new MainTemplateController().openPage();
    }

    public static void main(String[] args) {
        launch();
    }
}