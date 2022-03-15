package edu.gmu.lab2_tkarawap;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    int excellent_tip = 20;
    int average_tip = 18;
    int bad_tip = 14;
    EditText amountBill;
    TextView tip, total;
    private Button updateButton, implicitCallButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        amountBill = (EditText) findViewById(R.id.bill);
        tip = (TextView) findViewById(R.id.computed_tip);
        total = (TextView) findViewById(R.id.bill_total);
        updateButton = (Button) findViewById(R.id.updatePercentage);
        implicitCallButton = (Button) findViewById(R.id.CallLab1Implicitly);

        Intent intent = getIntent();
        setTitle("MainActivityUpdatePercentage");
        int number1 = intent.getIntExtra("number1", 20);
        int number2 = intent.getIntExtra("number2", 18);
        int number3 = intent.getIntExtra("number3", 14);
        excellent_tip = number1;
        average_tip = number2;
        bad_tip = number3;

        updateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    Intent intent = new Intent(MainActivity.this, MainActivityUpdatePercentage.class);
                    startActivity(intent);
            }
        });

        implicitCallButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                intent.addCategory("android.intent.category.DEFAULT");
                startActivity(intent);
            }
        });

    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        float bill;
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.excellent_button:
                if (checked) {
                    EditText b = (EditText)findViewById(R.id.bill);
                    if (b.getText().toString().equals(""))
                        bill = 0;
                    else bill = Float.parseFloat(b.getText().toString());
                    compute_tip(bill, excellent_tip);
                }
                break;
            case R.id.average_button:
                if (checked) {
                    EditText b = (EditText)findViewById(R.id.bill);
                    if (b.getText().toString().equals(""))
                        bill = 0;
                    else bill = Float.parseFloat(b.getText().toString());
                    compute_tip(bill, average_tip);
                }
                break;
            case R.id.lacking_button:
                if (checked) {
                    EditText b = (EditText)findViewById(R.id.bill);
                    if (b.getText().toString().equals(""))
                        bill = 0;
                    else bill = Float.parseFloat(b.getText().toString());
                    compute_tip(bill, bad_tip);
                }

                break;
        }
    }

    public static String roundToTwoDigit(float paramFloat) {
        return String.format("%.2f%n", paramFloat);
    }
    void compute_tip(float bill, int percent) {
        float pct= (float)percent/100;
        float tip = bill * pct;
        float total = bill + tip;
        TextView t = (TextView)findViewById(R.id.computed_tip);
        String s = roundToTwoDigit(tip);
        t.setText(s);
        t = (TextView)findViewById(R.id.bill_total);
        s = roundToTwoDigit(total);
        t.setText(s);

    }

    public void onBackPressed() {
        super.onBackPressed();
        //int billTotalBack = Integer.parseInt(amountBill.getText().toString());
        //int tipBack = Integer.parseInt(tip.getText().toString());
        //int totalBack = Integer.parseInt(total.getText().toString());
        //Intent intent = new Intent();
        //intent.putExtra(MainActivityUpdatePercentage, billTotalBack );

    }
}
