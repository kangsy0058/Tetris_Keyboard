package com.example.tetris_keyboard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //키보드 전체 레이아웃
    ConstraintLayout keyboard_layout ;
    //키보드 줄별 레이아웃
    LinearLayout keyboard_10, keyboard_qp, keyboard_al, keyboard_zm;
    //비밀번호
    String passwd = new String();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InitializeView();


    }

    public void InitializeView()
    {
        keyboard_layout = (ConstraintLayout)findViewById(R.id.KeyboardLayout);
        keyboard_10 = (LinearLayout)keyboard_layout.getChildAt(0);
        keyboard_qp = (LinearLayout)keyboard_layout.getChildAt(1);
        keyboard_al = (LinearLayout)keyboard_layout.getChildAt(2);
        keyboard_zm = (LinearLayout)keyboard_layout.getChildAt(3);
    }

    public void onClick_keyboardopen(View view){
        keyboard_layout.setVisibility(View.VISIBLE);
    }
    public void onClick_keyboardclose(View view){
        keyboard_layout.setVisibility(View.INVISIBLE);
    }
}
