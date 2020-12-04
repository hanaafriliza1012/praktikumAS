package com.example.smslistenerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SmsReceiverActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView tvSmsForm;
    private TextView tvSmsMesage;
    private Button btnClose;
    public static final String EXTRA_SMS_NO="extra_sms_no";
    public static final String EXTRA_SMS_MESSAGE="extra_sms_message";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms_receiver);
        tvSmsForm=(TextView)findViewById(R.id.tv_no);
        tvSmsMesage=(TextView)findViewById(R.id.tv_message);
        btnClose=(Button)findViewById(R.id.btn_close);
        btnClose.setOnClickListener(this);
        String senderNo = getIntent().getStringExtra(EXTRA_SMS_NO);
        String senderMeessage=getIntent().getStringExtra(EXTRA_SMS_MESSAGE);
        tvSmsForm.setText("from :"+senderNo);
        tvSmsMesage.setText(senderMeessage);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.btn_close){
            finish();
        }
    }
}