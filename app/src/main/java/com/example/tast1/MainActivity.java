package com.example.tast1;

import static com.example.tast1.Reverse.reverseWord;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.OrientationEventListener;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText textForAnagram, filterAnagram;
    private TextView viewAnagram;
    //private Button btn_convert;


    //editText1.addTextChangedListener(this)
    private final TextWatcher textWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            String str = textForAnagram.getText().toString();
            //Reverse.reverseWord(str);
            viewAnagram.setText(Reverse.reverseWord(str));
            //textView.setText(charSequence);
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


        //btn_convert = findViewById(R.id.btn_convert);
        textForAnagram = findViewById(R.id.text_for_anagram);
        filterAnagram = findViewById(R.id.filter_anagram);
        viewAnagram = findViewById(R.id.text_anagram);




        //Reverse.reverseWord(editText1.getText().toString());
        textForAnagram.addTextChangedListener(textWatcher);



        }
    }