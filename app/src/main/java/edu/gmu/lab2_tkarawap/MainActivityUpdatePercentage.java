package edu.gmu.lab2_tkarawap;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivityUpdatePercentage extends AppCompatActivity {
    public final static String EXTRA_MSH = "edu.gmu.lab2_tkarawap.MESSAGE";
    public final static String DATA_MSG1 = "edu.gmu.lab2_tkarawap.DATA1";
    public final static String DATA_MSG2 = "edu.gmu.lab2_tkarawap.DATA2";
    public final static String DATA_MSG3 = "edu.gmu.lab2_tkarawap.DATA3";
    private TextView excView, avgView, lackView;
    private EditText excEdit, avgEdit,lackEdit;
    private Button add_updateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setContentView(R.layout.activity_main_update_percentage);
        excEdit = findViewById(R.id.excellentUpdate);
        avgEdit = findViewById(R.id.averageUpdate);
        lackEdit = findViewById(R.id.lackingUpdate);
        add_updateButton = findViewById(R.id.addUpdatePercentage);

            add_updateButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int number1 = 20;
                    int number2 = 18;
                    int number3 = 14;
                        if (excEdit.getText().toString().equals("")) {
                            excEdit.setText("20");
                            number1 = Integer.parseInt(excEdit.getText().toString());
                            Toast.makeText(MainActivityUpdatePercentage.this, "Excellent tip update to " + number1, Toast.LENGTH_LONG).show();
                        }
                        else if (!excEdit.getText().toString().equals("")) {
                            number1 = Integer.parseInt(excEdit.getText().toString());
                            Toast.makeText(MainActivityUpdatePercentage.this, "Excellent tip update to " + number1, Toast.LENGTH_LONG).show();
                        }

                        if (avgEdit.getText().toString().equals("")) {
                            avgEdit.setText("18");
                            number2 = Integer.parseInt(avgEdit.getText().toString());
                            Toast.makeText(MainActivityUpdatePercentage.this, "Average tip update to " + number2, Toast.LENGTH_LONG).show();
                        }
                        else if (!avgEdit.getText().toString().equals("")) {
                            number2 = Integer.parseInt(avgEdit.getText().toString());
                            Toast.makeText(MainActivityUpdatePercentage.this, "Average tip update to " + number2, Toast.LENGTH_LONG).show();
                        }
                        if (lackEdit.getText().toString().equals("")) {
                            lackEdit.setText("14");
                            number3 = Integer.parseInt(lackEdit.getText().toString());
                            Toast.makeText(MainActivityUpdatePercentage.this, "Lacking tip update to " + number3, Toast.LENGTH_LONG).show();
                        }
                        else if (!lackEdit.getText().toString().equals("")) {
                            number3 = Integer.parseInt(lackEdit.getText().toString());
                            Toast.makeText(MainActivityUpdatePercentage.this, "Lacking tip update to " + number3, Toast.LENGTH_LONG).show();
                        }
                    Intent intent = new Intent(MainActivityUpdatePercentage.this, MainActivity.class);
                        intent.putExtra("number1", number1);
                        intent.putExtra("number2", number2);
                        intent.putExtra("number3", number3);
                        startActivity(intent);


                }
            });
        }


    public void onBackPressed(View view) {
        startActivity(new Intent(MainActivityUpdatePercentage.this,MainActivity.class));

    }
}