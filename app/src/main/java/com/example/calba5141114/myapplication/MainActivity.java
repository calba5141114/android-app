package com.example.calba5141114.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.calba5141114.myapplication.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    // This is the event triggered when the user clicks the submit button
    public void eventOneClick(View view) {

        Intent intent = new Intent(this, Main2Activity.class);
        EditText editText = (EditText) findViewById(R.id.editText);

        // setting the value of the message string = to the value of the dit text element in XML mainactivity
        String message = editText.getText().toString();

        if (message.length() <= 0) {
            Context context = getApplicationContext();
            CharSequence text = " Your message needs to be longer than 0 characters!";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        } else {
            intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);
        }

    }


    public double calculateIncome(double money, double[] totalMoney) {

        double endOfArrIndex = totalMoney.length + 1;
        totalMoney[(int) endOfArrIndex] = money;
        double total = 0;

        for (int i = 0; i <= totalMoney.length; i++) {
            double v = totalMoney[i];
            total += v;
        }

        return total;

    }

    public void calculateIncomeEvent(View view) {

        double money[] = new double[0];

        EditText editTextCalc = (EditText) findViewById(R.id.editText2);

        String stringAmount = editTextCalc.getText().toString();
        
        Double amount = Double.parseDouble(stringAmount);

        Double total = calculateIncome(amount, money);

        String totalFinalized = total.toString();

        Context context = getApplicationContext();

        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, totalFinalized, duration);
        toast.show();

    }


}
