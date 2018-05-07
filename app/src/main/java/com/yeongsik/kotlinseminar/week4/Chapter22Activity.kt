package com.yeongsik.kotlinseminar.week4

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.yeongsik.kotlinseminar.R
import kotlinx.android.synthetic.main.activity_chapter1.*

class Chapter22Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.title = "함수1"
        setContentView(R.layout.activity_chapter1)
        image.setImageResource(R.drawable.chapter22)
    }

    //명명된 인자
    fun drawCircle(x: Int, y: Int, radius: Int) {
    }

    fun test() {
        //아래 처럼 인자를 표기해 줄 수 있음
        //대입된 값이 어떤 값인지 이해하기 어려울때 많이 사용
        drawCircle(x = 1, y = 1, radius = 10)
        //선택적으로 사용가능
        drawCircle(1, 1, radius = 10)
    }

    //기본 매개변수
    fun drawCircle2(x: Int, y: Int, radius: Int = 25) { //radius 는 기본값 25로 지정
    }

    fun test2() {
        //아래 처럼 인자를 표기해 줄 수 있음
        //대입된 값이 어떤 값인지 이해하기 어려울때 많이 사용
        drawCircle2(x = 1, y = 1, radius = 10)
        drawCircle2(x = 1, y = 1)
    }

    //단일 표현식
    fun test3(x : Int) : Int {
        return 21 * x
    }
    fun test4(x : Int) : Int = 21 * x
    fun test5(x : Int) = 21 * x

    //확장 함수 : 이미 정의되어 있는 class 를 한정적으로 Util method 만들기 편함.
    fun String.attachPrefix(prefix : String) : String = "$prefix$this"
    fun test6() {
        val name = "name"
        name.attachPrefix("prefix")
        name.attachPrefixForPackage("prefix")
    }
}
//class 밖에 선언시, package 수준으로 선언이 가능.
fun String.attachPrefixForPackage(prefix : String) : String = "$prefix$this"
