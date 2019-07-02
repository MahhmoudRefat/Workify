package com.example.workify;

import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SignInActivity extends AppCompatActivity {

    private TextView mtv_forget_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        mtv_forget_password = findViewById(R.id.tv_forget);
        mtv_forget_password.setPaintFlags(mtv_forget_password.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);

    }

    public void sign_up(View view) {
        Intent intent = new Intent(SignInActivity.this,SignUpActivity.class);
        startActivity(intent);
        finish();
    }

    public void btn_signIn(View view) {
        Intent intent = new Intent(SignInActivity.this,MainActivity.class);
        startActivity(intent);
    }
}
