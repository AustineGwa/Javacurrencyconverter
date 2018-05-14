package com.austinegwa64.javacurrencyconverter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.austinegwa64.javacurrencyconverter.ConverterClasses.Constants;

public class MainActivity extends AppCompatActivity {

    TextView result;
    EditText foreignAmount;
    Spinner  currency;
    Button   convertbtn;

    int convertedAmount;
    int providedForeignAmount;
    String providedCurrency;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = findViewById(R.id.result);
        foreignAmount = findViewById(R.id.foreignAmount);
        currency = findViewById(R.id.spinner);
        convertbtn = findViewById(R.id.convertbtn);

        convertbtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
               convertedAmount =  convertNow();
            }
        });

        result.setText(convertedAmount);
    }

    private int  convertNow() {
        providedForeignAmount = Integer.parseInt(foreignAmount.getText().toString());
        providedCurrency = currency.getSelectedItem().toString();

        Constants constants = new Constants();

        int newAmount = 0;
        switch(providedCurrency){

            case "dollar" : newAmount = providedForeignAmount * constants.getDollar();
            break;

            case "Euro" : newAmount = providedForeignAmount * constants.getEuro();
                break;

            case "SA_Rand" : newAmount = providedForeignAmount * constants.getDollar();
                break;
        }

        return newAmount;

    }
}
