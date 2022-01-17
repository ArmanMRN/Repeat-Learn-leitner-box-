package com.example.repeatlearn.database;

import com.example.repeatlearn.model.Word;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDB {

    Connection connection = new ConnectDB().getConnection();
    Statement statement;

    public boolean insertIntoWords(Word word){

        try {
            Statement statement = connection.createStatement();
            System.out.println("statement created successful");

            String query = "insert into words (word,meaning,repeat_level,entered_time,next_repeat_time,is_finished)" +
                    "values ('%s','%s','%s',%s,%s,%s)";

            query = String.format(query,
                    word.getWord(),
                    word.getMeaning(),
                    word.getRepeat_level(),
                    word.getEntered_time(),
                    word.getNext_repeat_time(),
                    word.isIs_finished());

            statement.execute(query);

            statement.close();
            connection.close();

            return true;
        }



        catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
