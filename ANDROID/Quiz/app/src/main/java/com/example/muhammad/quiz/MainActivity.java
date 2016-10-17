package com.example.muhammad.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.submit);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                int score = 0;
                score = radioGroup1(score);
                score = radioGroup2(score);
                score = radioGroup3(score);
                score = radioGroup4(score);
                score = radioGroup5(score);
                Toast.makeText(MainActivity.this, "your score is: " + score, Toast.LENGTH_SHORT).show();

            }
        });
    }

    private int radioGroup1(int score) {

        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radiogroup_q1);
        int selectedId = radioGroup.getCheckedRadioButtonId();
        if (selectedId > 0) {
            RadioButton radioButton = (RadioButton) findViewById(selectedId);
            if ((radioButton.getText()).equals("1972")) {
                score += 1;
            }
        }
        return score;
    }

    private int radioGroup2(int score) {

        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radiogroup_q2);
        int selectedId = radioGroup.getCheckedRadioButtonId();
        if (selectedId > 0) {
            RadioButton radioButton = (RadioButton) findViewById(selectedId);
            if ((radioButton.getText()).equals("4.7")) {
                score += 1;
            }
        }
        return score;
    }

    private int radioGroup3(int score) {

        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radiogroup_q3);
        int selectedId = radioGroup.getCheckedRadioButtonId();
        if (selectedId > 0) {
            RadioButton radioButton = (RadioButton) findViewById(selectedId);
            if ((radioButton.getText()).equals("4")) {
                score += 1;
            }
        }
        return score;
    }

    private int radioGroup4(int score) {

        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radiogroup_q4);
        int selectedId = radioGroup.getCheckedRadioButtonId();
        if (selectedId > 0) {
            RadioButton radioButton = (RadioButton) findViewById(selectedId);
            if ((radioButton.getText()).equals("1998")) {
                score += 1;
            }
        }
        return score;
    }

    private int radioGroup5(int score) {

        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radiogroup_q5);
        int selectedId = radioGroup.getCheckedRadioButtonId();
        if (selectedId > 0) {
            RadioButton radioButton = (RadioButton) findViewById(selectedId);
            if ((radioButton.getText()).equals("1992")) {
                score += 1;
            }
        }
        return score;
    }

}
