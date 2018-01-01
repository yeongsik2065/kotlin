package com.yeongsik.kotlinseminar.week1

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.yeongsik.kotlinseminar.R
import kotlinx.android.synthetic.main.activity_chapter1.*
import org.jetbrains.anko.alert

class Chapter6Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.title = "Kotlin 특징 phrase 6"
        setContentView(R.layout.activity_chapter1)
        image.setImageResource(R.drawable.chapter6)

        /*
     * 14. stream API
     * filter, map, flatMap 등을 통해서 리스트를 편하게 관리
     */
        fun streamTest() {
            val list = ArrayList<Int>();
            //기본 for 문
            for (i: Int in list) {
                if (i > 5) {
                    Log.d("tag", "index $i")
                }
            }

            //stream api 사용. filter => if 문 역할, map 은 action 및 data 변환 담당
            list.filter { it > 5 }.map { Log.d("tag", "index $it") }

            //map 을 이용하서 <Int, Boolean> 같이 input, output 형을 정의 할 수 있다.
            list.filter { it > 5 }.map<Int, Boolean> { Log.d("tag", "index $it"); true }

            //flatMap 은 리스트를 가진 리스트를 관리하기 편하다.
            var list2 = ArrayList<ArrayList<String>>()
            list2.flatMap { it }.filter { it.length > 10 }.map { it.get(0) }
        }

        btn.setOnClickListener { (alert("invalid").show()) }
    }
}
