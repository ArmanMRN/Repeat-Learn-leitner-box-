package com.example.repeatlearn.controller;

import com.example.repeatlearn.build.Time;
import com.example.repeatlearn.database.GetDataDB;
import com.example.repeatlearn.database.InsertDB;
import com.example.repeatlearn.model.Word;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.text.Text;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ReviewWordController {

    @FXML
    private AnchorPane anchorPane_mainTemplate;

    @FXML
    private JFXButton btnBack;

    @FXML
    private JFXButton btnCrerect;

    @FXML
    private JFXButton btnIncrrect;

    @FXML
    private JFXButton btnNext;

    @FXML
    private JFXButton btnShowMeaning;

    @FXML
    private ImageView imageView_mainTemplate;

    @FXML
    private JFXTextArea jtxtAreaMeaning;

    @FXML
    private Text jtxtWord;

    private ArrayList<Word> todaysWords;

    private int index = -1;

    @FXML
    void btnBack_action(ActionEvent event) {
        if (index != -1 && index > 0){
            index--;
            jtxtAreaMeaning.setText("");
            jtxtWord.setText(todaysWords.get(index).getWord());
        }
    }

    @FXML
    void btnCrerect_action(ActionEvent event) {

        //todo : complete this method

        InsertDB insertDB = new InsertDB();
        Word word = todaysWords.get(index);

        if (word.getRepeat_level() == 1){

            insertDB.updateNext_repeat_time(word.getId(), Time.getLevel_1_day());
            insertDB.updateLevel(word.getId(),2);
        }

        else if (word.getRepeat_level() == 2){
            insertDB.updateNext_repeat_time(word.getId(), Time.getLevel_2_day());
            insertDB.updateLevel(word.getId(),3);
        }

        else if (word.getRepeat_level() == 3){
            insertDB.updateNext_repeat_time(word.getId(), Time.getLevel_3_day());
            insertDB.updateLevel(word.getId(),4);
        }

        else if (word.getRepeat_level() == 4){
            insertDB.updateNext_repeat_time(word.getId(), Time.getLevel_4_day());
            insertDB.updateLevel(word.getId(),5);
        }

        else if (word.getRepeat_level() == 5){
            insertDB.updateIS_finished(word.getId());
        }


    }

    @FXML
    void btnIncrrect_action(ActionEvent event) {

    }

    @FXML
    void btnNext_action(ActionEvent event) {
        if (todaysWords.size()-1 > index){
            index++;
            jtxtAreaMeaning.setText("");
            jtxtWord.setText(todaysWords.get(index).getWord());
        }
    }

    @FXML
    void btnShowMeaning_action(ActionEvent event) {
        jtxtAreaMeaning.setText(todaysWords.get(index).getMeaning());
    }

    public void initialize(){

        todaysWords = new GetDataDB().getWordsMustReviewToday();

        if (todaysWords.isEmpty() == false){
            index = 0;
            jtxtWord.setText(todaysWords.get(index).getWord());
        }

    }
}
