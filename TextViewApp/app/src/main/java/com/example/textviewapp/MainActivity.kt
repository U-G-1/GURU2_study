package com.example.textviewapp

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tv1 : TextView
        var tv2 : TextView
        var tv3 : TextView

        tv1 = findViewById(R.id.textView1)
        tv2 = findViewById(R.id.textView2)
        tv3 = findViewById(R.id.textView3)

        tv1.setText("안녕하세요") // 텍스트 변경
        tv1.setTextColor(Color.RED) // 색 변경
        tv2.setTextSize(30.0f) // 크기 지정
        tv2.setTypeface(Typeface.SERIF, Typeface.BOLD_ITALIC) // 글꼴 지정
        tv3.text = "가나다라마바사아자차카타파하가나다라마바사아자차카타파하가나다라마바사아자차카타파하가나다라마바사아자차카타파하" //setText 사용 없이 원하는 값 전달
        tv3.setSingleLine()


    }
}