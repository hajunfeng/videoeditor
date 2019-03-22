package com.example.hajunfeng.videoedit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void LoadVideo(View view) {
        Intent intent = new Intent(MainActivity.this, load_video.class);
        startActivity(intent);
    }
}
