package com.example.uicomponeny;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tampil(View view) {
        Toast muncul = Toast.makeText(this,"Berhasil", Toast.LENGTH_SHORT);
        muncul.show();

    }

}