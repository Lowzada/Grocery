package com.example.grocery;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> groceryList = new ArrayList<>();
        final EditText addList = findViewById(R.id.textList);
        final Button buttonAdd = findViewById(R.id.addButton);
        final TextView textOutput = findViewById(R.id.textView);
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                groceryList.add("Maca");
                groceryList.add("Pera");
                groceryList.add(addList.getText().toString());
                String myOutStr = "";
                for (String i : groceryList) {
                    myOutStr = myOutStr + i + ", ";
                }
                textOutput.setText(myOutStr);
            }
        });
    }
 }