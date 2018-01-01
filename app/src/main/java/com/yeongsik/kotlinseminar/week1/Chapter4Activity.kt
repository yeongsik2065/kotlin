package com.yeongsik.kotlinseminar.week1

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.yeongsik.kotlinseminar.R
import kotlinx.android.synthetic.main.activity_chapter1.*
import org.jetbrains.anko.alert

class Chapter4Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.title = "Kotlin 특징 phrase 4"
        setContentView(R.layout.activity_chapter1)
        image.setImageResource(R.drawable.chapter4)

        /*
     * 10. String templates
     *      => [ $ ] 기호를 이용하여 format 형식의 string 이 지원 가능해짐
     */
        fun stringTemplates() {
            val name = "yeongsik"
            val age = 10
            val query = "Name $name and Age $age"
            val query2 = "Name's length ${name.length} and Age $age"// . 붙여서 사용가능
            val query3 = "Name's length $name.length and Age $age"//{ }를 안붙이면 인식 안됨.
            Log.d("tag", query);
            Log.d("tag", query2);
            Log.d("tag", query3);
        }

        /*
         * 11. Any keyword
         *      => Java 의 Object 와 같은 원리
         *      => Any 의 값을 분기나눌 경우에는 when( ) 을 사용
         */

        fun equals(other: Any?): Boolean {
            if (other is String) { // is == instanceof , 자동 업캐스팅
                return other.length == "this".length
            }
            return false
        }

        fun cases(obj: Any) { //Any 의 값을 분기나눌 경우
            when (obj) {
                1 -> Log.d("tag", "One")
                "Hello" -> Log.d("tag", "Greeting")
                is Long -> Log.d("tag", "Long")
                !is String -> Log.d("tag", "Not a string")
                else -> Log.d("tag", "Unknown")
            }
        }

        btn.setOnClickListener { (alert("invalid").show()) }
    }
}
