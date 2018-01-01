package com.yeongsik.kotlinseminar.week1

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.yeongsik.kotlinseminar.R
import kotlinx.android.synthetic.main.activity_chapter1.*
import org.jetbrains.anko.alert

class Chapter2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chapter1)
        image.setImageResource(R.drawable.chapter2)
        supportActionBar!!.title = "Kotlin 특징 phrase 2"

        /*
         * 4. 사라진 키워드
         *      => [;] , [new], [static] 등 기존 자바에서 사용하던 키워드들이 삭제됨
         *      static -> companion Object{ } 선언으로 해결
         */
        val builder = StringBuilder()
        builder.appendln("")

        /*
         * 5. method 선언 및 반환 타입
         *      => Unit == void , 생략가능
         *      => { } 안에서 단일 문인 경우 간단한 식으로 표현 가능
         */

        fun function(): Unit { //
            return
        }

        fun function2(parameter: Int): Int {
            return parameter + 1
        }

        fun function3(parameter: Int): Int = parameter + 1
        fun function4(parameter: Int) = parameter + 1

        /*
         * 6. method 내 method 선언
         *      => 한 method 내에서만 사용하는 중복된 코드가 있을때 유용
         */
        fun localFunction(parameter: String): String {
            fun addString(parameter: String) = parameter + "add string"
            return addString(parameter)
        }

        btn.setOnClickListener { (alert("invalid").show()) }
    }
}
