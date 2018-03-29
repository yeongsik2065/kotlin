package com.yeongsik.kotlinseminar.week3

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.yeongsik.kotlinseminar.R
import kotlinx.android.synthetic.main.activity_chapter1.*

class Chapter15Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.title = "for / range"
        setContentView(R.layout.activity_chapter1)
        image.setImageResource(R.drawable.chapter15)
    }

    fun test() {
        //for 문
        //코틀린에서는 for-each 만 지원

        val names : List<String> = ArrayList()

        // ':' 연산자 => 'in' 로 변경
        // 타입 명시 필요 없음.
        for(name in names) {
            //...
        }

        //for 문에서 index 로 접근하기 (indices 프로퍼티 사용)
        for(i in names.indices) {
            names[i].length //코틀린에서는 List 일경우 [index] 의 배열 형태처럼 사용가능
        }

        //범위
        var range = 1..5
        var range2 = 1 until 6 // .. 과 비슷하지만 마지막 6을 세지 않음
        var reverseRange = 5 downTo 1 // 5부터 1까지 감소
        var isContain5 = 5 in range // in 키워드를 사용해서 range 안에 5 가 포함되어 있는지 확인 가능
        var stepRange = 10 downTo 1 step 2 // 10 8 6 4 2 반환.

        for(i in range) { // for(i in 1..5) 도 가능
            //...
        }
    }
}
