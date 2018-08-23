package com.example.kamil.helloandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    public static final String LOGACTIVITY = "ANDROID ACTIVITY";
    @BindView(R.id.button)
    Button button;
    @BindView(R.id.textView)
    TextView tv;
    @BindView(R.id.switch1)
    Switch switch1;
    @BindView(R.id.checkBox)
    CheckBox cb;
    @BindView(R.id.radioButton)
    RadioButton radioButton;
    @BindView(R.id.radioButton2)
    RadioButton radioButton2;
    @BindView(R.id.radioButton3)
    RadioButton radioButton3;
    @BindView(R.id.editText)
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        Log.d(LOGACTIVITY, "onCreate");
    }

    @OnClick(R.id.button)
    void onClick() {
        Toast.makeText(this, "button clicked test", Toast.LENGTH_LONG).show();
        radioButton2.setChecked(true);
        tv.setText("tester");
        cb.setVisibility(View.GONE);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LOGACTIVITY, "onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LOGACTIVITY, "onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LOGACTIVITY, "onResume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LOGACTIVITY, "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(LOGACTIVITY, "onRestart");
    }


}
