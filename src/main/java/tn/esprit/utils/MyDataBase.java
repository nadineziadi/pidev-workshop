package tn.esprit.utils;

import tn.esprit.A;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyDataBase {
    // synglottant, to make sure only one instance is able to connect to a DB

    private Connection cnx;
    private static MyDataBase instance ;
    private final String URL="jdbc:mysql://127.0.0.1:3307/personne";
    private final String USERNAME="root";
    private final String PASSWORD="";
    private MyDataBase(){
        try {
            cnx = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Connected");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("Not Connected");
        }
    }

    public static MyDataBase getInstance(){
        if (instance == null )
            instance = new MyDataBase();
        return instance;
    }


}
