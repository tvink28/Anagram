package com.example.tast1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements TextWatcher {

    private EditText textForAnagram, filterAnagram;
    private TextView viewAnagram;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        textForAnagram = findViewById(R.id.text_for_anagram);
        filterAnagram = findViewById(R.id.filter_anagram);
        viewAnagram = findViewById(R.id.text_anagram);

        textForAnagram.addTextChangedListener(this);
        filterAnagram.addTextChangedListener(this);
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        String text = textForAnagram.getText().toString().trim();
        String filter = filterAnagram.getText().toString().trim();
        viewAnagram.setText(Reverse.makeAnagram(text, filter));
    }

    @Override
    public void afterTextChanged(Editable s) {

    }
}