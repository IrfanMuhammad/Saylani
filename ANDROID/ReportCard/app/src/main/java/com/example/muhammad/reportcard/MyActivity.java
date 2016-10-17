package com.example.muhammad.reportcard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MyActivity extends AppCompatActivity {

    private int marks;
    private int percentage;
    private String rollNo;
    private String name;
    private String urdu;
    private String english;
    private String mathematics;
    private String history;
    private String science;
    private String computer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        Intent intent = getIntent();

        rollNo = intent.getStringExtra("rollNo");
        name = intent.getStringExtra("name");
        urdu = intent.getStringExtra("urdu");
        english = intent.getStringExtra("english");
        mathematics = intent.getStringExtra("mathematics");
        history = intent.getStringExtra("history");
        science = intent.getStringExtra("science");
        computer = intent.getStringExtra("computer");

        TextView text_roll = (TextView) findViewById(R.id.roll_no);
        text_roll.setText(rollNo);

        TextView text_name = (TextView) findViewById(R.id._name);
        text_name.setText(name);

        TextView text_urdu = (TextView) findViewById(R.id.urdu);
        text_urdu.setText(urdu);

        TextView text_english = (TextView) findViewById(R.id.english);
        text_english.setText(english);

        TextView text_math = (TextView) findViewById(R.id.mathematics);
        text_math.setText(mathematics);

        TextView text_history = (TextView) findViewById(R.id.history);
        text_history.setText(history);

        TextView text_science = (TextView) findViewById(R.id.science);
        text_science.setText(science);

        TextView text_computer = (TextView) findViewById(R.id.computer);
        text_computer.setText(computer);

        TextView text_marks = (TextView) findViewById(R.id.marks_gained);
        text_marks.setText(calculateMarks());

        TextView text_percentage = (TextView) findViewById(R.id.percentage);
        text_percentage.setText(calculatePercentage());


        TextView text_grade = (TextView) findViewById(R.id.grade);
        text_grade.setText(grade());

    }

    private String calculateMarks() {

        marks = Integer.parseInt(urdu) + Integer.parseInt(english) +
                Integer.parseInt(mathematics) + Integer.parseInt(history) +
                Integer.parseInt(science) + Integer.parseInt(computer);
        return Integer.toString(marks);
    }

    private String calculatePercentage() {

        percentage = (marks * 100) / 600;
        return Integer.toString(percentage) + "%";
    }

    private String grade() {

        String grade = "";
        if (percentage >= 80) {
            grade = "A1";
        } else if (percentage > 70 && percentage < 80) {
            grade = "A";
        } else if (percentage > 60 && percentage < 70) {
            grade = "B";
        } else if (percentage > 50 && percentage < 60) {
            grade = "C";
        } else if (percentage >= 45 && percentage < 50) {
            grade = "D";
        } else {
            grade = "FAIL";
        }
        return grade;
    }
}
