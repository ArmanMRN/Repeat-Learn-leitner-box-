package com.example.repeatlearn;

import com.example.repeatlearn.controller.ImportNewWordController;
import com.example.repeatlearn.controller.MainTemplateController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.skin.TableHeaderRow;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException, InterruptedException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("mainTemplate-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 910, 600);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {launch();}

}
