package com.gizemkoc.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extendsAppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void changeImage(View view) {
        ImageView imageView = findViewById (R.id.imageView);
        ImageView.setImageReesource(R.drawable.manzara2);
    }
}