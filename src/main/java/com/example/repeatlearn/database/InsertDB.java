package com.example.repeatlearn.database;

import com.example.repeatlearn.model.Word;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDB {

    ConnectDB connectDB = new ConnectDB();
    Connection connection = connectDB.getConnection();

    public boolean insertIntoWords(Word word){

        try {
            connection = connectDB.getConnection();
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

    public boolean updateLevel(int id , int newLevel){
        try {
            connection = connectDB.getConnection();
            Statement statement = connection.createStatement();
            System.out.println("statement created successful");

            String query = "update words set repeat_level = '%s' where id = %s";

            query = String.format(query,newLevel,id);

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


    public boolean updateNext_repeat_time(int id , long newNextRepeatTime) {
        try {
            connection = connectDB.getConnection();
            Statement statement = connection.createStatement();
            System.out.println("statement created successful");

            String query = "update words set next_repeat_time = %s where id = %s";

            query = String.format(query, newNextRepeatTime, id);

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



    public boolean updateIS_finished(int id){
        try {
            connection = connectDB.getConnection();
            Statement statement = connection.createStatement();
            System.out.println("statement created successful");

            String query = "update words set is_finished = true where id = %s";

            query = String.format(query,id);

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
