package com.example.mavee.easycabbeta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView socialLink;
    private Button  sendCode;
    private EditText askPhone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        askPhone=(EditText)findViewById(R.id.ask_phone);
        sendCode=(Button) findViewById(R.id.btn_send_code);
        socialLink = (TextView ) findViewById(R.id.social_link);

        socialLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,LoginActivity.class);
                startActivity(i);
            }
        });

        sendCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String mobile = askPhone.getText().toString().trim();

                if(mobile.isEmpty() || mobile.length() < 10){
                    askPhone.setError("Enter a valid mobile");
                    askPhone.requestFocus();
                    return;
                }

                Intent i = new Intent(MainActivity.this,VerificationActivity.class);
                i.putExtra("mobile",mobile);
                startActivity(i);
            }
        });
    }


}
