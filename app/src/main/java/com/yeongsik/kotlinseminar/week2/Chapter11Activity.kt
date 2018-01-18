package com.yeongsik.kotlinseminar.week2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.yeongsik.kotlinseminar.R
import com.yeongsik.kotlinseminar.week1.User
import kotlinx.android.synthetic.main.activity_chapter1.*

class Chapter11Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.title = "싱글톤"
        setContentView(R.layout.activity_chapter1)
        image.setImageResource(R.drawable.chapter11)
    }

    //싱글톤
    //코틀린에서는 오브젝트를 이용하여 간편하게 싱글톤 작성 가능
    object SingleTonClass {

        var name : String?
        var User : User

        //constructor() <- error : SingleTon 객체는 constructor 가 필요없다.
        //어느곳이서든 접근이 가능하고(static), 단 하나의 객체만 가진다는 확신만 있으면 됨.
        init {
            //init 은 가능하다.
            name = printName() // "adf" 처럼 값 대입시 경고. ( primitive , String ) 처럼 대입 가능한 값
            User = User()
            //printName() 을 사용하겠다는 것은 String? 을 꼭 넣겠다는 보장이 있다.
        }

        private fun printName() : String? = if(true) "init" else "nonInit"
    }
}
