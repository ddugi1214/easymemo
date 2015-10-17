package com.ddugi1214.easymemo;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
/*
  처음으로 자바파일 처음부터 끝까지 작성해봄..
  살려줘
 */
public class new_memo extends Activity{

    @Override
    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.new_memo);

        requestWindowFeature(Window.FEATURE_NO_TITLE);

        Button btn = (Button)findViewById(R.id.savebtn);
        btn.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                EditText title = (EditText)findViewById(R.id.titleedit);
                EditText content = (EditText)findViewById(R.id.contentedit);
                String tistr = title.getText().toString();
                String costr = content.getText().toString();
//TODO 타이틀 컨텐츠 텍스트형식으로 저장
            }
        });
    }
}
