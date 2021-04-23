package com.example.multi_screenhwassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import java.util.Scanner;

public class Screen3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3);
    }

    public class squareRootCalculator
    {
        public static void main(String[] args)
        {
            Double num;
            Scanner sc= new Scanner(System.in);

            System.out.print("Enter a number: ");
            num = sc.nextDouble();

            Double squareroot = Math.pow(num, 0.5);
            System.out.println("The Square of a Given Number  " + num + "  =  " + squareroot);
        }
    }
}