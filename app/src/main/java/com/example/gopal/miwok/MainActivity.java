package com.example.gopal.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public static final String LANGUAGE_KEY = "LANGUAGE_KEY";
    public static final String BENGALI = "Bengali";
    public static final String HINDI = "Hindi";
    String languageSelected = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         Spinner spinner = findViewById(R.id.spinner);
        final ArrayList<String> list = new ArrayList<>();
        list.add("Select from drop down");
        list.add(BENGALI);
        list.add(HINDI);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, list);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                           languageSelected = list.get(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        TextView number = findViewById(R.id.number_activity);
        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!languageSelected.equals(list.get(0))) {
                    Intent numberIntent = new Intent(MainActivity.this, NumbersActivity.class);
                    numberIntent.putExtra(LANGUAGE_KEY, languageSelected);
                    startActivity(numberIntent);
                }else {
                    Toast.makeText(MainActivity.this, "Select a language", Toast.LENGTH_SHORT).show();
                }
            }
        });
        TextView family = findViewById(R.id.family_activity);
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!languageSelected.equals(list.get(0))) {
                    Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);
                    familyIntent.putExtra(LANGUAGE_KEY, languageSelected);
                    startActivity(familyIntent);
                }else {
                    Toast.makeText(MainActivity.this, "Select a language", Toast.LENGTH_SHORT).show();

                }
            }
        });
        TextView color = findViewById(R.id.colors_activity);
        color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!languageSelected.equals(list.get(0))) {
                    Intent colorIntent = new Intent(MainActivity.this, ColorsActivity.class);
                    colorIntent.putExtra(LANGUAGE_KEY, languageSelected);
                    startActivity(colorIntent);
                }else {
                    Toast.makeText(MainActivity.this, "Select a language", Toast.LENGTH_SHORT).show();

                }
            }
        });
        TextView phrase = findViewById(R.id.phrases_activity);
        phrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!languageSelected.equals(list.get(0))) {
                    Intent phraseIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                    phraseIntent.putExtra(LANGUAGE_KEY, languageSelected);
                    startActivity(phraseIntent);
                }else {
                    Toast.makeText(MainActivity.this, "Select a language", Toast.LENGTH_SHORT).show();

                }
            }
        });
        Log.v("MainActivity","Hey is it you");

        final ImageView imageView = findViewById(R.id.play);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageResource(R.drawable.ic_pause);

            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("MainActivity","Start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("MainActivity","Resume");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("MainActivity","Stop");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("MainActivity","Pause");

    }

}
