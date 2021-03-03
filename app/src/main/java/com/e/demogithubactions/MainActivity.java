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

    // Function responsible for checking the number is positive or negative
    public void checkNumber() {
        double number = 12.3;

        // true if number is less than 0
        if (number < 0.0)
            System.out.println(number + " is a negative number.");

            // true if number is greater than 0
        else if (number > 0.0)
            System.out.println(number + " is a positive number.");

            // if both test expression is evaluated to false
        else
            System.out.println(number + " is 0.");
    }

    // Function to check prime numbers
    public void checkPrimeNumber(){
        int num = 29;
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            // condition for nonprime number
            if (num % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}