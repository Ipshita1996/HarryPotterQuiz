package com.android.ipshita.harrypotterquiz;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    int correct = 0;
    int wrong = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String fontPath = "fonts/hp.TTF";
        TextView maintitle = (TextView) findViewById(R.id.maintitle);
        Typeface HP = Typeface.createFromAsset(getAssets(), fontPath);
        maintitle.setTypeface(HP);
    }

    public void submitanswers(View view) {
        EditText nametext = (EditText) findViewById(R.id.nametext);
        String name = nametext.getText().toString();

        EditText first = (EditText) findViewById(R.id.ans1);
        String ans1 = first.getText().toString();
        if (ans1.equals("31st July")) {
            correct++;
        } else {
            wrong++;
        }

        CheckBox lockhart = (CheckBox) findViewById(R.id.lockhart);
        CheckBox lupin = (CheckBox) findViewById(R.id.lupin);
        CheckBox luna = (CheckBox) findViewById(R.id.luna);
        CheckBox tonks = (CheckBox) findViewById(R.id.tonks);

        if (lockhart.isChecked() && lupin.isChecked() && luna.isChecked() == false && tonks.isChecked() == false) {
            correct++;
        } else {
            wrong++;
        }


        RadioButton harry = (RadioButton) findViewById(R.id.harry);
        if (harry.isChecked()) {
            correct++;
        } else {
            wrong++;
        }
        RadioButton owl = (RadioButton) findViewById(R.id.owl);

        if (owl.isChecked()) {
            correct++;
        } else {
            wrong++;
        }

        RadioButton fang = (RadioButton) findViewById(R.id.fang);

        if (fang.isChecked()) {
            correct++;
        } else {
            wrong++;
        }
        RadioButton locked = (RadioButton) findViewById(R.id.locked);

        if (locked.isChecked()) {
            correct++;
        } else {
            wrong++;
        }

        Context context = getApplicationContext();
        String text = "Hello " + name + "!\n" + "You got " + correct + " correct answers and " + wrong + " wrong answers";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

}


