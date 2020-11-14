package com.ldm.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class PartidasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void empezarQuiz(View view){
        Intent preguntasIntent = new Intent(this, QuizActivity.class);
        startActivity(preguntasIntent);
    }


}