package com.yeongsik.kotlinseminar.week3

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.yeongsik.kotlinseminar.R
import kotlinx.android.synthetic.main.activity_chapter1.*

class Chapter21Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.title = "프로퍼티 setter/getter"
        setContentView(R.layout.activity_chapter1)
        image.setImageResource(R.drawable.chapter21)
    }

    //프로퍼티 set/get 을 잘 이용하면 효율적인 코드 설계가 가능하다.
    //아래 예시

    class Person(val age : Int, val name :String){
        val adult: Boolean
            get() = age >= 19  // 19세 이상인지 아닌지 선언시에 판단 가능, val 임으로 set 은 불가능

        var address : String =""
            set(value) {
                field = value.substring(0..9) //field
            }
    }

    fun fun1() {
        val yeongsik = Person(19, "yeongsik")
        println(yeongsik.age) //19
        println(yeongsik.adult) //true
        yeongsik.address = "abcdefghijklmnopqrstuvwxyz"
        println(yeongsik.address) // abcdefghij
    }
}
