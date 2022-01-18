package com.example.repeatlearn.controller;

import com.example.repeatlearn.build.Time;
import com.example.repeatlearn.database.InsertDB;
import com.example.repeatlearn.model.Word;
import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ImportNewWordController {

    @FXML
    private JFXButton button_save_importNewWord;

    @FXML
    private TextArea textArea_wordDefinition_importNewWord;

    @FXML
    private TextField textField_newWord_importNewWord;

    @FXML
    void button_save_importNewWord_Action(ActionEvent event) {

        Word word = new Word(textField_newWord_importNewWord.getText(),
                textArea_wordDefinition_importNewWord.getText(),
                0,
                Time.getToday(),
                Time.getLevel_1_day(),
                false);

        new InsertDB().insertIntoWords(word);

        textArea_wordDefinition_importNewWord.setText("");
        textField_newWord_importNewWord.setText("");

    }

    Stage stage;
    Parent root;

    public void openPage() throws IOException {

        root = FXMLLoader.load(getClass().getResource("/com/example/repeatlearn/importNewWord-view.fxml"));
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
