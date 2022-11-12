package com.example.tast1;

import static com.example.tast1.Reverse.reverse;

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

    private EditText editText1, editText2;
    private TextView textView;
    //private Button btn_convert;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //btn_convert = findViewById(R.id.btn_convert);
        editText1 = findViewById(R.id.input_1);
        editText2 = findViewById(R.id.input_2);
        textView = findViewById(R.id.recover_pas);



        String str = editText1.getText().toString();
        char[] charArray = str.toCharArray();
        reverse(charArray);
        String revStr = new String(charArray);


            editText1.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    textView.setText(charSequence);
                }

                @Override
                public void afterTextChanged(Editable editable) {


                }
            });
        }
    }