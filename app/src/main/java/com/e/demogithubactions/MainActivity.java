package com.e.demogithubactions;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
    }

    // Function responsible for adding data to the array
    public void addData() {
        try {
            ArrayList<String> stringArray = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                stringArray.add("This is" + i);
                Toast.makeText(this, "This is inside the loop", Toast.LENGTH_SHORT).show();
            }
            Toast.makeText(this, "Data added to array successfully", Toast.LENGTH_SHORT).show();
        } catch (Exception ex) {
            Toast.makeText(this, "There was an error with Data Insertation", Toast.LENGTH_SHORT).show();
            ex.printStackTrace();
        }
    }
}