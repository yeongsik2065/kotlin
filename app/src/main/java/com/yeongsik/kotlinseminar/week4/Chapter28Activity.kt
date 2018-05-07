package com.yeongsik.kotlinseminar.week4

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.yeongsik.kotlinseminar.R
import kotlinx.android.synthetic.main.activity_chapter1.*

class Chapter28Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.title = "조건 확인 함수"
        setContentView(R.layout.activity_chapter1)
        image.setImageResource(R.drawable.chapter28)
    }
    //조건 확인 함수
    //1.check   : false 시, IllegalStateException 발생
    //2.require : false 시, IllegalArgumentException 발생
    //따로 exception 을 선언하지 않아도 된다.

    fun test() {
        check(true) //통과
        check(false)//IllegalStateException 발생
        check(false, { println("error!") })//IllegalStateException 발생시 함수실행

        require(true)//통과
        require(false)//IllegalArgumentException 발생
        require(false, { println("error!") })//IllegalArgumentException 발생시 함수실행
    }

    //3.checkNotNull   : null 시, IllegalStateException 발생
    //4.requireNotNull : null 시, IllegalArgumentException 발생
    //따로 exception 을 선언하지 않아도 된다.

    fun test2() {
        checkNotNull("nonNull") //통과
        checkNotNull(null)//IllegalStateException 발생
        checkNotNull(null, { println("error!") })//IllegalStateException 발생시 함수실행

        requireNotNull("nonNull")//통과
        requireNotNull(null)//IllegalArgumentException 발생
        requireNotNull(null, { println("error!") })//IllegalArgumentException 발생시 함수실행
    }

    //5.error   : error 발생시 선언, IllegalStateException 발생
    //6.TODO : 미구현시 선언, NotImplementedError 발생
    //따로 exception 을 선언하지 않아도 된다.

    fun test3() {
        error("error")
        TODO()
        TODO("not implement")
    }
}
