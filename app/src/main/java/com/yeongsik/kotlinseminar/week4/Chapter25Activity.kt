package com.yeongsik.kotlinseminar.week4

import android.app.AlertDialog
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import com.yeongsik.kotlinseminar.R
import kotlinx.android.synthetic.main.activity_chapter1.*

class Chapter25Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.title = "함수4"
        setContentView(R.layout.activity_chapter1)
        image.setImageResource(R.drawable.chapter25)
    }

    //람다 표현식
    //이미 약속된 식이 존재할 경우 -> 키워드를 사용해서 간략하게 표한가능
    //기존 자바8 과의 람다식 표기법 차이
    //java   > x : Int, y : Int -> x + y
    //kotlin > { x : Int, y : Int -> x + y }  <= 괄호가 있음

    fun doSomething(v: View) {}

    fun test4() {
        var button = Button(this)
        button.setOnClickListener({ v -> doSomething(v) })
        //아래와 같이 선언이 가능하다.
        button.setOnClickListener({ doSomething(v = it) })
        //아래와 같이 선언이 가능하다2.
        button.setOnClickListener(::doSomething)
    }

    fun Chapter23Activity.MyNumber.setOnClickListener(index: Int, body: (num: Int, num2: Int) -> Unit) {}

    fun Chapter23Activity.MyNumber.setOnClickListener2(body: (num: Int, num2: Int) -> Unit, index: Int) {}

    fun test5() {
        //함수 인자가 마지막에 있을 경우에는 따로 분리가 가능하다.
        Chapter23Activity.MyNumber(1).setOnClickListener(index = 1) { num, num2 -> }
        Chapter23Activity.MyNumber(1).setOnClickListener2(body = { num, num2 -> }, index = 1)
    }

    //멤버 참조
    class Person(val name: String, val age: Int) {
        val adult = age > 19
    }

    fun printAdults(people: List<Person>) {

        //일반적으로 filter를 사용하여 name 출력하는 경우
        people.filter({ person -> person.adult })
                .forEach { println("Name=${it.name}") }

        //adult 멤버 변수를 직접 사용하는경우
        people.filter(Person::adult)
                .forEach({ println("Name=${it.name}") })

        //함수 인자가 하나인 경우에는 () 생략이 가능하다.
        people.filter(Person::adult)
                .forEach { println("Name=${it.name}") }
    }

    //함수 인자가 하나인 경우 복습
    fun test6() {
        //원래는 button.setOnClickListener ({ v -> doSomething(v) }) 이지만
        //setOnClickListener 는 함수인자 하나만 받는 함수임으로 아래와 같이 표현이 가능하다.
        Button(this).setOnClickListener { doSomething(it) }
    }

    fun test7() {
        //함수인자가 마지막에 온 경우 복습
        val dialog = AlertDialog.Builder(this)
                .setPositiveButton("OK") { dialog, which -> println("click! - position : $which") }
                //사용하지 않는 인자는 '_' 로 대체 표현 가능하다.(굳이 알 필요 없는 인자)
                .setNegativeButton("Close") { _, which -> println("click! - position : $which") }
    }
}
