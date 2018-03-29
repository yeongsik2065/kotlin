package com.yeongsik.kotlinseminar.week3

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.yeongsik.kotlinseminar.R
import kotlinx.android.synthetic.main.activity_chapter1.*

class Chapter13Activity : AppCompatActivity() {

    //키워드가 없으면 정적 중첩 클래스로 판단.
    //java의 static class StaticNested { } 와 같음
    class StaticNested {
        val name : String = ""
    }

    //inner 키워드가 있으면 비 정적 중첩 클래스로 판단.
    //java의 class NonStaticNested { } 와 같음
    inner class NonStaticNested {
        val name : String = ""
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.title = "중첩 클래스"
        setContentView(R.layout.activity_chapter1)
        image.setImageResource(R.drawable.chapter13)

        //중첩 클래스는 바로 사용가능
        var nestedClass = StaticNested()

        //비 중첩 클래스는 Outter class 의 instance 가 있어야지 선언가능.
        var nonNestedClass = Chapter13Activity().NonStaticNested()
    }
}
