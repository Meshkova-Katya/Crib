package com.example.crib;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   public static String[] array = {"Математика", "История", "Физика", "Английский"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Получение элемента TextView
        TextView textView1 = (TextView) findViewById(R.id.textView1);
        // получаем элемент ListView
        ListView selection = (ListView) findViewById(R.id.selection);
        // создаём адаптер
        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, array);
        // устанавливаем для списка адаптер
        selection.setAdapter(adapter);
        // добавляем для списка слушатель
        selection.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // по позиции получаем выбранный элемент
               String selectedItem = array[position];

                Intent intent = new Intent(MainActivity.this, AboutActivity.class);
                intent.putExtra("textView1", selectedItem);
                startActivity(intent);
            }
        });
    }
}