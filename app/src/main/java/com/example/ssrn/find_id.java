package com.example.ssrn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class find_id extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_id);

        //텍스트 화면에 출력
        TextView text_find = (TextView) findViewById(R.id.find_id);
        text_find.setText("아이디 혹은 비밀번호를\n잊으셨나요?");

        TextView title_bar = (TextView) findViewById((R.id.title_bar));
        title_bar.setText("아이디/비밀번호 찾기");

        TextView find_email = (TextView) findViewById((R.id.find_email));
        find_email.setHint("가입 당시 이메일 입력");

        TextView text_check = (TextView) findViewById(R.id.btn_mail);
        text_check.setText("메일 발송");
    }


}