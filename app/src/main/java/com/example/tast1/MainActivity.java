package com.example.tast1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    private EditText textForAnagram, filterAnagram;
    private TextView viewAnagram;




    private final TextWatcher textWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            String text = textForAnagram.getText().toString();
            String filter = filterAnagram.getText().toString();
            viewAnagram.setText(Reverse.makeAnagram(text, filter));

        }

        @Override
        public void afterTextChanged(Editable editable) {


        }
    };




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        textForAnagram = findViewById(R.id.text_for_anagram);
        filterAnagram = findViewById(R.id.filter_anagram);
        viewAnagram = findViewById(R.id.text_anagram);




        textForAnagram.addTextChangedListener(textWatcher);



        }
    }