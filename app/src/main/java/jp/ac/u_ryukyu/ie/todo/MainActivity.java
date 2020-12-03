package jp.ac.u_ryukyu.ie.todo;


import android.os.Bundle;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox checkBox1 = findViewById(R.id.checkBox1);

        Scanner scan = new Scanner(System.in);

        //String text = scan.next();

        //checkBox1.setText(text);




    }

}