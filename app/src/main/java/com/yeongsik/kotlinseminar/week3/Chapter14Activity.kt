package com.yeongsik.kotlinseminar.week3

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.yeongsik.kotlinseminar.R
import com.yeongsik.kotlinseminar.week1.User
import kotlinx.android.synthetic.main.activity_chapter1.*

class Chapter14Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.title = "자료형 동일확인/흐름제어"
        setContentView(R.layout.activity_chapter1)
        image.setImageResource(R.drawable.chapter14)
    }

    private fun test() {
        //'==' vs '==='
        var name1 = ""
        var name2 = ""

        var result = (name1 == name2) // java의 eqauls() 와 같음.
        var result2 = (name1 === name2) // java의 == 와 같음.


        // is 연산자 (java의 insteadof 기능 + 스마트 캐스팅)
        var a = ArrayList<String>()
        a.add("")
        var b : List<String> = a
        //b.add("")  <- error b는 add 가 불가능한 list 임. (List / MutableList) 각 각 존재
        if(b is ArrayList<String>) {
            b.add("") //<- add() 가능. b 가 자동으로 ArrayList 로 캐스팅됨
        }

        //if - else
        //java 와의 차이점 : 값 반환 가능.
        //java 의 3항 연산자 (조건)? a : b 대체 가능.
        var num = 20
        var result3 = if(num > 10) {
            "large"
        } else if(num > 5) {
            "medium"
        } else {
            "small"
        }

        //when
        //java 의 switch case 문 대체
        var obj : Any = ""

        when(obj) {
            is String -> {  } // 스마트 캐스팅
            1 -> {  }
            is User -> {  }
        }
    }
}
