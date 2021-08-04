package com.continuidadoperativa.copepedialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        COPepeDialog.Builder builder = new COPepeDialog.Builder(this, getClass().getSimpleName());
        builder.setTitle("hola mundo");
        builder.setBodyText("hola tu");
        COPepeDialog dialog = builder.create();
        if (dialog.isShowing()) {
            dialog.dismiss();
        }
        dialog.show();
    }
}