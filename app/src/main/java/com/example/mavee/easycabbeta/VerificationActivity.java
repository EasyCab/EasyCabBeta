package com.example.mavee.easycabbeta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VerificationActivity extends AppCompatActivity {


    private Button btn_verify;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification);


        String phonenumber = getIntent().getStringExtra("mobile");
    btn_verify=(Button) findViewById(R.id.btn_verify);

    btn_verify.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent i = new Intent(VerificationActivity.this,EditProfileActivity.class);
            startActivity(i);
        }
    });

    }
}
