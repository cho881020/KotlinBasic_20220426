package kr.nepp.kotlinbasic_20220426

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLog.setOnClickListener {

            Log.d("메인화면",  "로그 버튼 눌림!")
            Log.e("메인화면", "에러 로그 테스트")

        }

        btnToast.setOnClickListener {

            Toast.makeText(this, "토스트 띄우기", Toast.LENGTH_SHORT).show()


        }

        btnVariableTest.setOnClickListener {

//            변수 문법 연습 코드

//            강사 신상 정보 변수에 저장

//            var myName : String  // variable : 변수 => 다른 값 변경 가능
//            val myBirthYear : Int // value : 상수 => 한번 대입하면 변경 불가.
//
//            myName = "조경진"
//            myBirthYear = 1988
//
//            myName = "이경진"
//            myBirthYear = 1977

            val myName = "조경진" // 자료형 자동 유추 설정.
            val myBirthYear = 1988 // Int로 자동 설정
            val myHeight : Double = 185.5 // Double 수동 설정 예시


        }


        btnConditionTest.setOnClickListener {

            val age = 25

            when (age) {

                10 -> {
                    Toast.makeText(this, "10살입니다.", Toast.LENGTH_SHORT).show()
                }
                20, 30, 40 -> {

//                    세 가지 경우 동시 대응

                    Toast.makeText(this, "20 or 30 or 40살 입니다.", Toast.LENGTH_SHORT).show()
                }
                in 41..50 -> {
//                    41 ~50 사이의 값

                }
                else -> {
//                    그 외의 모든 경우
                }
            }

        }

        btnCopy.setOnClickListener {

//            EditText에 입력된 문구 (text 속성의 값) 를 변수에 저장 (getter 함수 자동 호출)

            val inputMessage = edtMessage.text.toString()

//            TextView의 문구 (text 값)에 대입 (setter 함수 자동 호출)

            txtMessage.text = inputMessage

        }

    }

}
