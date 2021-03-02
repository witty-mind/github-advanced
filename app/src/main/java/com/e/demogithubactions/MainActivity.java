package com.e.demogithubactions;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        solveFizzBuzz();
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

    // Solving fizz buzz
    public void solveFizzBuzz() {
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.println("FiZZ");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 5 == 0 && i % 3 == 0) {
                System.out.println("FizzBuzz");
                printValue("FizzBuzz");
            } else {
                System.out.println(i + "");
                printValue(i + "");
            }
        }
    }


    /**
     * Function responsible for logging the given value
     *
     * @param value
     */
    public void printValue(String value) {
        Log.d("This is a Log", value);
    }


    /**
     * This function is responsible for displaying toast message
     *
     * @param value
     */
    public void showToast(String value) {
        Toast.makeText(this, value, Toast.LENGTH_SHORT).show();
    }
}