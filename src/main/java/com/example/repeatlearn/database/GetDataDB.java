package com.example.repeatlearn.database;

import com.example.repeatlearn.build.Time;
import com.example.repeatlearn.model.Word;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class GetDataDB {

    Connection connection = new ConnectDB().getConnection();
    Statement statement;

    public ArrayList<Word> getAllWords(){

        ArrayList<Word> words = new ArrayList<>();

        try {
            statement = connection.createStatement();

            String url = "select * from words";

            ResultSet resultSet = statement.executeQuery(url);

            while(resultSet.next()){

                Word word = new Word();

                word.setId(resultSet.getInt("id"));
                word.setWord(resultSet.getString("word"));
                word.setMeaning(resultSet.getString("meaning"));
                word.setRepeat_level(resultSet.getInt("repeat_level"));
                word.setEntered_time(resultSet.getLong("entered_time"));
                word.setNext_repeat_time(resultSet.getLong("next_repeat_time"));
                word.setIs_finished(resultSet.getBoolean("is_finished"));

                words.add(word);
            }

            resultSet.close();
            statement.close();
            connection.close();
        }

        catch (SQLException e) {e.printStackTrace();}



        return words;
    }

    public ArrayList<Word> getWordsInsertedByDay(Long day){

        ArrayList<Word> words = new ArrayList<>();

        try {
            statement = connection.createStatement();

            String url = "select * from words";

            ResultSet resultSet = statement.executeQuery(url);

            int i = 1;
            while(resultSet.next()){

                if (resultSet.getLong("entered_time") == day){
                    Word word = new Word();

                    word.setId(i);
                    word.setWord(resultSet.getString("word"));
                    word.setMeaning(resultSet.getString("meaning"));
                    word.setRepeat_level(resultSet.getInt("repeat_level"));
                    word.setEntered_time(resultSet.getLong("entered_time"));
                    word.setNext_repeat_time(resultSet.getLong("next_repeat_time"));
                    word.setIs_finished(resultSet.getBoolean("is_finished"));

                    words.add(word);
                    i++;
                }


                }

            resultSet.close();
            statement.close();
            connection.close();
        }

        catch (SQLException e) {e.printStackTrace();}



        return words;

    }

    public ArrayList<Word> getWordsMustReviewToday(){

        ArrayList<Word> words = new ArrayList<>();

        try {
            statement = connection.createStatement();

            String url = "select * from words";

            ResultSet resultSet = statement.executeQuery(url);

            int i = 1;
            while(resultSet.next()){

                if (resultSet.getLong("next_repeat_time") == Time.getToday()){
                    Word word = new Word();

                    word.setId(i);
                    word.setWord(resultSet.getString("word"));
                    word.setMeaning(resultSet.getString("meaning"));
                    word.setRepeat_level(resultSet.getInt("repeat_level"));
                    word.setEntered_time(resultSet.getLong("entered_time"));
                    word.setNext_repeat_time(resultSet.getLong("next_repeat_time"));
                    word.setIs_finished(resultSet.getBoolean("is_finished"));

                    words.add(word);
                    i++;
                }


            }

            resultSet.close();
            statement.close();
            connection.close();
        }

        catch (SQLException e) {e.printStackTrace();}



        return words;

    }

}
