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

    public static class Demo{
        double my_real;
        double my_imag;
        public Demo(double my_real, double my_imag){
            this.my_real = my_real;
            this.my_imag = my_imag;
        }
        public static void main(String[] args){
            Demo n1 = new Demo(76.8, 24.0),
                    n2 = new Demo(65.9, 11.23),
                    temp;
            temp = add(n1, n2);
            System.out.printf("The sum of two complex numbers is %.1f + %.1fi", temp.my_real,
                    temp.my_imag);
        }
        public static Demo add(Demo n1, Demo n2){
            Demo temp = new Demo(0.0, 0.0);
            temp.my_real = n1.my_real + n2.my_real;
            temp.my_imag = n1.my_imag + n2.my_imag;
            Log.d("This is done", "Yes");
            return(temp);
        }
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