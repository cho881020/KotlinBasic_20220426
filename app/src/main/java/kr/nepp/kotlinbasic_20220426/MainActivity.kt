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

    }

}
