package com.example.repeatlearn.controller;

import com.example.repeatlearn.build.Time;
import com.example.repeatlearn.database.GetDataDB;
import com.example.repeatlearn.model.Word;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.util.ArrayList;

public class WordsInsertedTodayController {

    @FXML
    private AnchorPane anchorPane_mainTemplate;

    @FXML
    private ImageView imageView_mainTemplate;

    @FXML
    private TableView<Word> tableAllWordsList;

    @FXML
    private TableColumn<Word,Integer> tableclID;

    @FXML
    private TableColumn<Word,Boolean> tableclIsFinished;

    @FXML
    private TableColumn<Word,Integer> tableclLevel;

    @FXML
    private TableColumn<Word,String> tableclMeaning;

    @FXML
    private TableColumn<Word,String> tableclWord;

    public void initialize(){

        tableclID.setCellValueFactory(new PropertyValueFactory<Word,Integer>("id"));
        tableclWord.setCellValueFactory(new PropertyValueFactory<Word,String>("word"));
        tableclMeaning.setCellValueFactory(new PropertyValueFactory<Word,String>("meaning"));
        tableclLevel.setCellValueFactory(new PropertyValueFactory<Word,Integer>("repeat_level"));
        tableclIsFinished.setCellValueFactory(new PropertyValueFactory<Word,Boolean>("is_finished"));

        ArrayList<Word> arrayList = new GetDataDB().getWordsInsertedByDay(Time.getToday());

        ObservableList<Word> list = FXCollections.observableArrayList(arrayList);

        tableAllWordsList.setItems(list);
    }

}
