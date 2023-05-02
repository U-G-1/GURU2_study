package com.example.checkboxapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.CompoundButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var checkApple : CheckBox
    lateinit var checkOrange : CheckBox
    lateinit var checkBanana : CheckBox

    // 리스너를 생성해서 통합
    // 변수 선언
    var listner = CompoundButton.OnCheckedChangeListener { buttonView, isChecked ->
        if (isChecked){
            // 어떤 아이디인지 확인
            when(buttonView.id){
                R.id.checkApple -> Toast.makeText(applicationContext, "사과", Toast.LENGTH_SHORT).show()
                R.id.checkOrange -> Toast.makeText(applicationContext, "오랜지", Toast.LENGTH_SHORT).show()
                R.id.checkBanana -> Toast.makeText(applicationContext, "바나나", Toast.LENGTH_SHORT).show()

            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        checkApple = findViewById(R.id.checkApple)
        checkOrange = findViewById(R.id.checkOrange)
        checkBanana = findViewById(R.id.checkBanana)


        checkApple.setOnCheckedChangeListener (listner)

        checkOrange.setOnCheckedChangeListener (listner)

        checkBanana.setOnCheckedChangeListener (listner)
    }
}