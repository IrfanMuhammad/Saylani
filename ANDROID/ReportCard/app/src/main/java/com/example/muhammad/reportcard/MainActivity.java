package com.example.muhammad.reportcard;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.submit);

        button.setOnClickListener(new View.OnClickListener() {

            EditText rollNo = (EditText) findViewById(R.id.rollno);
            EditText name = (EditText) findViewById(R.id.name);
            EditText marksUrdu = (EditText) findViewById(R.id.marks_urdu);
            EditText marksEnglish = (EditText) findViewById(R.id.marks_english);
            EditText marksMathematics = (EditText) findViewById(R.id.marks_mathematics);
            EditText marksHistory = (EditText) findViewById(R.id.marks_history);
            EditText marksScience = (EditText) findViewById(R.id.marks_science);
            EditText marksComputer = (EditText) findViewById(R.id.marks_computer);

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, MyActivity.class);
                intent.putExtra("rollNo", rollNo.getText().toString());
                intent.putExtra("name", name.getText().toString());
                intent.putExtra("urdu", marksUrdu.getText().toString());
                intent.putExtra("english", marksEnglish.getText().toString());
                intent.putExtra("mathematics", marksMathematics.getText().toString());
                intent.putExtra("history", marksHistory.getText().toString());
                intent.putExtra("science", marksScience.getText().toString());
                intent.putExtra("computer", marksComputer.getText().toString());
                startActivity(intent);
            }
        });
    }
}
