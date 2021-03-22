package com.example.crib;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import static com.example.crib.MainActivity.array;

public class AboutActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        TextView textView2 = findViewById(R.id.textView2);
        String str = getIntent().getStringExtra("textView1");
        if (str.equals(array[0]))
            textView2.setText("Математика - точная (формальная) наука, первоначально исследовавшая количественные отношения и пространственные формы");
        if (str.equals(array[1]))
            textView2.setText("Исто́рия  — область знаний, а также гуманитарная наука, занимающаяся изучением человека в прошлом.");
        if (str.equals(array[2])) {
            textView2.setText("Физика - область естествознания: наука о наиболее общих законах природы, о материи, её структуре, движении и правилах трансформации.");
        }
        if (str.equals(array[3])) {
            textView2.setText("Английский язык - язык англо-фризской подгруппы западной группы германской ветви индоевропейской языковой семьи.");
        }
    }
}
