package com.example.petimageapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    lateinit var text1 : TextView
    lateinit var text2 : TextView
    lateinit var chkAgree : CheckBox
    lateinit var rGroup1 : RadioGroup
    lateinit var rdoDog : RadioButton
    lateinit var rdoCat : RadioButton
    lateinit var rdoRabbit : RadioButton
    lateinit var btnOK : Button
    lateinit var imgPet : ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "애완동물 사진 보기"

        text1 = findViewById(R.id.text1)
        chkAgree = findViewById(R.id.chkAgree)

        text2 = findViewById(R.id.text2)
        rGroup1 = findViewById(R.id.Rgroup1)
        rdoDog = findViewById(R.id.RdoDog)
        rdoCat = findViewById(R.id.RdoCat)
        rdoRabbit = findViewById(R.id.RdoRabbit)

        btnOK = findViewById(R.id.BtnOK)
        imgPet = findViewById(R.id.ImgPet)

        // 위젯에 대응할 변수와 위젯 대응 완료
        // 시작함이 체크가 되었을 때 체크가 되면 보이고 안되면 보이지 않는 코드 작성

        // 체크박스가 선택의 변화가 있는지 확인
        chkAgree.setOnCheckedChangeListener { compoundButton, isChecked ->
            if (chkAgree.isChecked == true) {
                text2.visibility = android.view.View.VISIBLE
                rGroup1.visibility = android.view.View.VISIBLE
                btnOK.visibility = android.view.View.VISIBLE
                imgPet.visibility = android.view.View.VISIBLE

            }else{
                text2.visibility = android.view.View.INVISIBLE
                rGroup1.visibility = android.view.View.INVISIBLE
                btnOK.visibility = android.view.View.INVISIBLE
                imgPet.visibility = android.view.View.INVISIBLE
            }
        }

        // 선택 완료 버튼이 클릭되면 클릭된 버튼에 따라서 이미지가 보여진다.
        btnOK.setOnClickListener {
            // 라디오그룹에 체크되어있는 버튼의 아이디를 가져온다.
            when(rGroup1.checkedRadioButtonId) {
                // 아이디에 맞는 이미지를 이미지뷰에 셋
                R.id.RdoDog -> imgPet.setImageResource(R.drawable.dog)
                R.id.RdoCat -> imgPet.setImageResource(R.drawable.cat)
                R.id.RdoRabbit -> imgPet.setImageResource(R.drawable.rabbit)
                else -> Toast.makeText(applicationContext, "동물 먼저 선택하시오", Toast.LENGTH_SHORT)

            }
        }

    }
}