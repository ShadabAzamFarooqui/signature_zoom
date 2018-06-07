package com.example.berylsystems.zoomimage;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView zoomage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        zoomage=findViewById(R.id.zoomage);
        String encodeString=getIntent().getStringExtra("image");
        zoomage.setImageBitmap(Helpers.base64ToBitmap(encodeString));
    }
}
