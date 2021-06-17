package com.continuidadoperativa.copepedialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new COPepeDialog.Builder(this,getClass().getSimpleName())
                .setTitle("hola mundo")
                .setBodyText("hola tu")
                .create()
                .show();
    }
}