package com.example.workify;

import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SignUpActivity extends AppCompatActivity {
            private  TextView mtextview_sign_up;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);


        mtextview_sign_up = findViewById(R.id.tv_have_account);
        mtextview_sign_up.setPaintFlags(mtextview_sign_up.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);

    }

    public void have_account_sing_in(View view) {
        Intent intent = new Intent(SignUpActivity.this,SignInActivity.class);
        startActivity(intent);
        finish();
    }

    public void btn_signup(View view) {

    }
}
