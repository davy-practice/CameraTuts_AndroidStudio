package com.example.cameratest;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.*;
import androidx.core.content.ContextCompat;
import android.Manifest;
import android.content.pm.PackageManager;

public class MainActivity extends AppCompatActivity {

    private Button takePictureButton;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        takePictureButton =  findViewById(R.id.button_image);
        imageView = findViewById(R.id.imageview);

        if(ContextCompat.checkSelfPermission(this,
                Manifest.permission.CAMERA != PackageManager.PERMISSION_GRANTED))
        {
            takePictureButton.setEnabled(false);
            Activity.Compat.requestPermissions(
                    this, new String[] {
                            Manifest.permission.CAMERA, Manifest.permission.WRITE_EXTERNAL_STORAGE}, 0);

        }
    }

    @Override
    public void onRequestPermissionResult(int requestCode, String[] permission, int[] grantResults)
    {

    }
}
