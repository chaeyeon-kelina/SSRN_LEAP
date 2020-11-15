package com.example.ssrn;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.UnderlineSpan;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_login = findViewById(R.id.btn_login);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //login 으로 가는 인텐트 생성
                Intent intent = new Intent(MainActivity.this, login.class);
                startActivity(intent);
            }
        });

        TextView text_check = (TextView) findViewById(R.id.text_check);
        text_check.setText("자동로그인");

        TextView text_find_id = (TextView) findViewById(R.id.text_find_id);
        text_find_id.setText("아이디 / 비밀번호 찾기 >");

        EditText login_id = (EditText) findViewById(R.id.login_id);
        login_id.setHint("아이디");

        EditText login_pw = (EditText) findViewById(R.id.login_pw);
        login_pw.setHint("비밀번호");
    }

}