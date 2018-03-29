package com.yeongsik.kotlinseminar.week3

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.yeongsik.kotlinseminar.R
import kotlinx.android.synthetic.main.activity_chapter1.*

class Chapter16Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.title = "예외"
        setContentView(R.layout.activity_chapter1)
        image.setImageResource(R.drawable.chapter16)
    }

    //java 와 동일, new 키워드 제외
    fun checkAge(age: Int) {
        if (age < 0) {
            throw IllegalArgumentException("Invalid age : $age")
        }
    }

    fun test() {
        //try-catch , finally 사용 가능
        //if 문 처럼 값 반환 가능
        val valid : Boolean = try {
            true
        } catch (e: Exception) {
            false
        } finally {
            //예외 상관없이 수행되야 함. 값 반환 X
        }
    }

    //코틀린에서는 try-catch 를 사용할 수 있으나, java 처럼 필수로 try-catch 가 필요한 곳이 없습니다.
    //때문에 개발자가 필요한 곳에 선택적으로 넣어주시면 됩니다.
}
