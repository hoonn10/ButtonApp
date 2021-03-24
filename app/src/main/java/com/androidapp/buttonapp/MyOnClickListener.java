package com.androidapp.buttonapp;

import android.view.View;

public class MyOnClickListener implements View.OnClickListener {    //주의할점: 같은 패키지 않에 들어가있어야
    MainActivity mainActivity;
    public MyOnClickListener(MainActivity mainActivity) {   //생성자 함수
        this.mainActivity = mainActivity;
    }

    @Override
    public void onClick(View v) {
        //버튼 클릭 시 여기로 오게 됨
        mainActivity.mtextView1.setText("You clicked 한창훈의 button");
        //텍스트뷰가 여러개이면 지정 해줘야한다. mTextView1.setText("")이런 식
    }
}
