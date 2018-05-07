package com.yeongsik.kotlinseminar.week4

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.yeongsik.kotlinseminar.R
import kotlinx.android.synthetic.main.activity_chapter1.*

class Chapter24Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.title = "함수3"
        setContentView(R.layout.activity_chapter1)
        image.setImageResource(R.drawable.chapter24)
    }

    //인덱스 접근 연산자
    //배열처럼 [] 를 사용해서 set,get 할 수 있는 기능을 추가할 때 사용
    class Names(var name1: String, var name2: String, var name3: String)

    //아래 처럼 모든 연산자 오버로딩은 확장 함수로 표현이 가능하다.
    operator fun Names.get(index: Int) = when (index) {
        0 -> this.name1
        1 -> this.name2
        2 -> this.name3
        else -> IllegalArgumentException()
    }

    operator fun Names.set(index: Int, value: String) {
        when (index) {
            0 -> this.name1 = value
            1 -> this.name2 = value
            2 -> this.name3 = value
            else -> IllegalArgumentException()
        }
    }

    //중위 표기법(infix) 지원
    //함수선언에 infix 키워드 표기
    //확장함수 혹은 멤버 함수이면서, 매개변수가 1개
    infix fun Names.getItem(index: Int) = this[index]

    fun test3() {
        val name = Names("1", "2", "3") getItem 1
    }
}
