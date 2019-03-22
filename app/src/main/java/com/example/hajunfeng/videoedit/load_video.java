package com.example.hajunfeng.videoedit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class load_video extends AppCompatActivity {

    private String[] date = {"apple", "banana", "orange"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load_video);

        ArrayAdapter<String>adapter = new ArrayAdapter<String>(load_video.this,
                android.R.layout.simple_list_item_1, date);
        ((ListView)findViewById(R.id.all_video)).setAdapter(adapter);
    }

    public void Back(View view) {
        Intent intent = new Intent(load_video.this, MainActivity.class);
        startActivity(intent);
        this.finish();
    }
}
