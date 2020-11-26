package com.example.ssrn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Register_favorite_store extends AppCompatActivity {

    static final String[] LIST_MENU = {"LIST1", "LIST2", "LIST3"} ;
    ArrayList<favorite_store_data> DataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_favorite_store);

        //텍스트 화면에 출력
        TextView title_bar = (TextView)findViewById(R.id.title_bar);
        title_bar.setText("자주 가는 생협 등록");

        TextView store_text1 = (TextView) findViewById(R.id.store_text1);
        store_text1.setText("학문관");
        TextView store_text2 = (TextView) findViewById(R.id.store_text2);
        store_text2.setText("ECC 기념품점");
        TextView store_text3 = (TextView) findViewById(R.id.store_text3);
        store_text3.setText("학문관 제과점");
        TextView store_text4 = (TextView) findViewById(R.id.store_text4);
        store_text4.setText("교육관");
        TextView store_text5 = (TextView) findViewById(R.id.store_text5);
        store_text5.setText("산학협력관");
        TextView store_text6 = (TextView) findViewById(R.id.store_text6);
        store_text6.setText("공학관");
        TextView store_text7 = (TextView) findViewById(R.id.store_text7);
        store_text7.setText("과학관");
        TextView store_text8 = (TextView) findViewById(R.id.store_text8);
        store_text8.setText("법학관");




    }

}