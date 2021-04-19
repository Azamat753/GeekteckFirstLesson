package com.lawlett.geekteckfirstlesson;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ImageView animalImage;
    boolean isCat, isDog, isSquirrel;
    Button catBtn, dogBtn, squirrelBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initClickers();
    }

    private void initClickers() {
        catBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isCat){
                    Toast.makeText(MainActivity.this, "Вы угадали!", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "Вы не угадали", Toast.LENGTH_SHORT).show();
                }
            }
        });
        dogBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        squirrelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    private void initViews() {
        animalImage = findViewById(R.id.animal_image);
        catBtn = findViewById(R.id.cat_btn);
        dogBtn = findViewById(R.id.dog_btn);
        squirrelBtn = findViewById(R.id.squirrel_btn);
    }

    @SuppressLint("NonConstantResourceId")
    public void changeImage(View view) {
        switch (view.getId()) {
            case R.id.image_first_btn:
                animalImage.setImageResource(R.drawable.catimage);
                isCat = true;
                break;
            case R.id.image_second_btn:
                animalImage.setImageResource(R.drawable.squirrel);
                isSquirrel = true;
                isCat=false;
                break;
            case R.id.image_third_btn:
                animalImage.setImageResource(R.drawable.dog);
                isDog = true;
                isCat=false;
                break;
        }
    }
}