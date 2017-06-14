package com.yunli.www.heheda.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.yunli.www.heheda.R;

/**
 * 作者:郭凯奇
 * 时间: 2017/6/14 8:43
 * Title:
 * Text:
 */

public class Second extends AppCompatActivity{

    private EditText edit;
    private Intent edits;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        edit = (EditText) findViewById(R.id.edit);
        edits = getIntent();
        edit.setText(edits.getStringExtra("edit"));
        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edits.putExtra("edit",edit.getText().toString());
                setResult(0,edits);
                finish();
                Log.d(",", "");
            }
        });

    }

    @Override
    protected void onPause() {


        super.onPause();
    }
}
