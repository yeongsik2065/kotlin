package com.yeongsik.kotlinseminar.kotlinseminar.week1

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.yeongsik.kotlinseminar.kotlinseminar.R
import kotlinx.android.synthetic.main.activity_chapter1.*
import org.jetbrains.anko.alert

class Chapter1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.title = "사라진 키워드 [;][new]"
        setContentView(R.layout.activity_chapter1)

        btn.setOnClickListener { ( alert(test() ).show()) }

    }

    private fun test(): String {
        // ; 키워드는 안붙여도 된다. 단, 한줄에 두개 이상의 명령을 선언할 때는 ; 로 구분할 수 있다.
        var num = 3

        // new 키워드를 붙이지 않고 instance 화 할 수 있다.
        var array = ArrayList<String>()

        return "num is $num , array size is ${array.size}"
    }

    fun test2(): Unit {

    }
//    private fun User(name: String = "", age: Int = 1) {
//
//    }

    class User2 {
        private val name: String //기본적으로 접근제어자 선언 안하면, public => 자바에서는 package
        private val age: Int

        constructor(name: String, age: Int) { //second constructor 는 var,val 선언 불가능/ member 변수 선언 후 대입
            this.name = name
            this.age = age
        }

        constructor(name: String) : this(name, 0)
    }

    class User3 {
        private var name: String
        private var age: Int

        init {
            name = ""
            age = 0
        }

        constructor()

        constructor(name: String, age: Int) { //second constructor 는 var,val 선언 불가능/ member 변수 선언 후 대입
            this.name = name
            this.age = age
        }
    }

    private fun run(): String {
        //data class User(val name: String, val age: Int)
        val builder = StringBuilder()

        builder.append(User("함영식"))
                .append(User2("함영식2"))
                .append(User3())
        return builder.toString()
    }
}
