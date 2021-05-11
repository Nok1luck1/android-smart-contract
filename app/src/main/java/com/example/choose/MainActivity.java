package com.example.choose;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MainActivity extends AppCompatActivity {


    private EditText ETmail;
    private EditText ETpassword;

    private static final String dbname = "choose++";
    public static final String USER = " postgres";
    public static final String PASSWORD = "11111";
    TextView text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            Class.forName("org.postgresql.Driver");

        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        String url = "jdbc:postgresql:localhost:5432/postgres";
        Connection conn;
        try {
            //conn = DriverManager.getConnection(url, USER, PASSWORD);

            conn =  DriverManager.getConnection(url);
            text.setText("Connected");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            Log.e("Tag", "Description", e);
        }

    }

}

