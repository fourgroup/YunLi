package com.yunli.www.heheda.view.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.yunli.www.heheda.R;
import com.yunli.www.heheda.model.bean.PhoneLoginBean;
import com.yunli.www.heheda.view.iview.IBackDataview;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements IBackDataview<PhoneLoginBean>{

    private EditText edit;
    private Button btn;
    private String str="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edit = (EditText) findViewById(R.id.edit);
        btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it= new Intent(MainActivity.this,Second.class);
                it.putExtra("edit",edit.getText().toString()+str);
                startActivityForResult(it,0);
            }
        });
    }

    @Override
    protected void onPause() {
        str="onpause";
        super.onPause();
    }

    @Override
    public void onDataBack(PhoneLoginBean phoneLoginBean) {
        Log.e("data",phoneLoginBean.toString() );
    }

    @Override
    public void onError(Throwable throwable) {

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        String e = data.getStringExtra("edit");
        edit.setText(e);
    }
}
