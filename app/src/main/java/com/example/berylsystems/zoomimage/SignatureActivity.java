package com.example.berylsystems.zoomimage;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.kyanogen.signatureview.SignatureView;

public class SignatureActivity extends AppCompatActivity {




    TextView mClearImage;

    TextView mSave;

    SignatureView mSignatureView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signature_layout);
        mClearImage=findViewById(R.id.clear);
        mSave=findViewById(R.id.save);
        mSignatureView=findViewById(R.id.signature_view);
        mClearImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mSignatureView.clearCanvas();

            }
        });
        mSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String image= Helpers.bitmapToBase64(mSignatureView.getSignatureBitmap());
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                intent.putExtra("image",image);
                startActivity(intent);
            }
        });
    }

}
