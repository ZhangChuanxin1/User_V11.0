package com.example.foolishfan.user_v10;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class User extends Activity {
    private Button mReturnButton;
    private TextView mChangepwdText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user);
        mReturnButton = (Button)findViewById(R.id.returnback);
        mChangepwdText = (TextView) findViewById(R.id.login_text_change_pwd);

        mChangepwdText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_Login_to_reset = new Intent(User.this,Resetpwd.class) ;
                startActivity(intent_Login_to_reset);
                finish();
            }
        });

    }
    public void back_to_login(View view) {
        //setContentView(R.layout.login);
        Intent intent3 = new Intent(User.this,Login.class) ;
        startActivity(intent3);
        finish();

    }
}
