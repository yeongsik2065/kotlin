package com.yeongsik.kotlinseminar.week1

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Button
import com.yeongsik.kotlinseminar.R
import kotlinx.android.synthetic.main.activity_chapter1.*
import org.jetbrains.anko.alert

class Chapter5Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.title = "Kotlin 특징 phrase 5"
        setContentView(R.layout.activity_chapter1)
        image.setImageResource(R.drawable.chapter5)

        /*
     * 12. for 문
     *      => 기본 for each 문 사용
     *      => [ .. ] 키워드로 구간 단위 반복 지정 가능
     *      => step 키워드로 증/감 폭을 설정 가능
     */
        fun testArrayList() {
            val arrayList = ArrayList<String>()
            for (s in arrayList) { // in == :
                Log.d("tag", "string : " + s)
            }

            for (x in 1..5) { // .. 사용.
                Log.d("tag", "num : " + x)
            }

            val range = 5 downTo 1 step 2
            for (x in range) Log.d("tag", "num : " + x)
        }


        /*
         * 13. Lambdas 식
         */
        fun lambdaTest() {
            val button = findViewById<Button>(R.id.btn)

            button.setOnClickListener { view ->
                view.alpha = 0.5f
            }
            button.setOnClickListener {
                it.alpha = 0.5f // parameter가 1개일때만 it 변수 사용가능.
            }
        }

        btn.setOnClickListener { (alert("invalid").show()) }
    }
}
