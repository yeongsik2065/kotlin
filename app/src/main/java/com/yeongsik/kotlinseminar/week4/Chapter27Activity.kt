package com.yeongsik.kotlinseminar.week4

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.yeongsik.kotlinseminar.R
import kotlinx.android.synthetic.main.activity_chapter1.*
import org.jetbrains.annotations.Contract

class Chapter27Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.title = "분해선언"
        setContentView(R.layout.activity_chapter1)
        image.setImageResource(R.drawable.chapter27)
    }

    //분해선언
    data class Person(val age : Int, val name : String)

    fun test() {
        val person : Person = Person(1, "ys")
        //분해선언
        //data class 는 기본적으로 분해선언 함수를 가지고 있음
        val (age, name) = person
        //아래와 같이 컴파일됨
        //val age = person.component1()
        //val name = person.component2()
    }

    class DetailPerson(val age : Int, val name : String, val address : String, val hasCar : Boolean) {
        operator fun component1() = age
        operator fun component2() = name
        operator fun component3() = address
        operator fun component4() = hasCar
    }

    fun test2() {
        val detailPerson = DetailPerson(1, "ys", "korea", true)
        val (age, name) = detailPerson
        val (age2, name2, address2) = detailPerson
        val (age3, name3, address3, hascar3) = detailPerson
        //'_' 를 사용하여 아래와 같이 필요한 부분만 사용할 수도 있음
        val (age4, _, address4, _) = detailPerson
    }
}


