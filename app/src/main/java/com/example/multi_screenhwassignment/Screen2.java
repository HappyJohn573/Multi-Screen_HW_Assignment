package com.example.multi_screenhwassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Screen2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);
    }

    public void onNextScreenButtonPressed(View v)
    {
        Intent i = new Intent(this, Screen3.class);
        this.startActivity(i);
    }

    class factorialCalculator
    {
        public static void main(String args[])
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number:");
            int num = scanner.nextInt();
            int factorial = fact(num);
            System.out.println("Factorial of entered number is: "+factorial);
        }
        static int fact(int n)
        {
            int output;
            if(n==1)
            {
                return 1;
            }
            output = fact(n-1)* n;
            return output;
        }
}