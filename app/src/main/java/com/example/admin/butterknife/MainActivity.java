package com.example.admin.butterknife;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tv1)
    TextView tv1;

    @BindView(R.id.tv2)
    TextView tv2;

    @BindView(R.id.btn_back)
    Button btnBack;

    @BindView(R.id.btn_next)
    Button btnNext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        tv1.setText("Butter Knife Practiced for Head Text");
        tv2.setText("Butter Knife Practiced for Sub Text");

    }

    @OnClick({R.id.btn_back, R.id.btn_next})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_back:
                Toast.makeText(getApplicationContext(), "Back Button is Clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_next:
                Toast.makeText(getApplicationContext(), "Next Button is Clicked", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
