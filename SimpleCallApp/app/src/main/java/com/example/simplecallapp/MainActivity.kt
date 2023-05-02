package com.example.simplecallapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // 전역변수 선언
    // lateinit : 나중에 초기화를 선언
    lateinit var edit1 : EditText
    lateinit var edit2 : EditText
    lateinit var btnAdd : Button
    lateinit var btnSub : Button
    lateinit var btnMul : Button
    lateinit var btnDiv : Button
    lateinit var textResult : TextView // 계산 결과 저장

    lateinit var num1 : String
    lateinit var num2 : String
    var result : Int? = null // 결과 저장할 정수 변수

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "초간단 계산기" // 제목 지정

        // 변수 대입
        edit1 = findViewById(R.id.Edit1)
        edit2 = findViewById(R.id.Edit2)

        btnAdd = findViewById(R.id.BtnAdd)
        btnSub = findViewById(R.id.BtnSub)
        btnMul = findViewById(R.id.BtnMul)
        btnDiv = findViewById(R.id.BtnDiv)

        textResult = findViewById(R.id.TextResult)


        // 버튼이 눌렸을 때
        btnAdd.setOnTouchListener { v, event ->
            num1 = edit1.text.toString() // edit1,2 의 text 값을 가져와 string 타입으로 변환후 num1,2 에 저장
            num2 = edit2.text.toString()

            result = Integer.parseInt(num1) + Integer.parseInt(num2) // 다시 int 타입으로 변환 하고 결과 계산
            textResult.text = "계산 결과: " + result.toString() // 결과 String 타입으로 변환
            false

        }

        btnSub.setOnTouchListener { v, event ->
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()

            result = Integer.parseInt(num1) - Integer.parseInt(num2)
            textResult.text = "계산 결과: " + result.toString()
            false

        }

        btnMul.setOnTouchListener { v, event ->
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()

            result = Integer.parseInt(num1) * Integer.parseInt(num2)
            textResult.text = "계산 결과: " + result.toString()
            false

        }

        btnDiv.setOnTouchListener { v, event ->
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()

            result = Integer.parseInt(num1) / Integer.parseInt(num2)
            textResult.text = "계산 결과: " + result.toString()
            false

        }


    }
}