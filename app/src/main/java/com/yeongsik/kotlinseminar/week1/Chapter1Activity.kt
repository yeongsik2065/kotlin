package com.yeongsik.kotlinseminar.week1

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.yeongsik.kotlinseminar.R
import kotlinx.android.synthetic.main.activity_chapter1.*
import org.jetbrains.anko.alert

class Chapter1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.title = "Kotlin 특징 phrase 1"
        setContentView(R.layout.activity_chapter1)

        image.setImageResource(R.drawable.chapter1)

        /*
         * Kotlin 특징
         *
         * 1. 낮은 러닝커브
         *      => C/Java 를 다뤄본 개발자라면, 쉽게 익숙해질 수 있음.
         * 2. 기존 자바코드 100% 호환
         *      => 기존 java 코드를 kotlin 으로 변환 가능
         *      => 기존 java project 를 점차 kotlin 으로 변경 가능
         *      => Kotlin <-> Java 간 사용을 위해서는 약간의 추가 코드 사용 (@JavaFiled, @JvmStatic)
         */

        /*
         * 3. 사라진 primitive type
         *      => Java 의 wrapper class 처럼 Int, Double, Long 등 으로 사용.
         *      => 하지만 실제 내부에서 원시타입처럼 대입되는 상황이면, 컴파일시 원시타입으로 바뀜
         */

        var int: Int
        var double: Double
        var float: Float
        var long: Long
        var string: String
        var short: Short
        var byte: Byte

        //type 유추
        var int2: Int = 1
        var int3 = 1 // <- 위 구문과 같은 효과

        var long2: Long = 1
        var long3 = 1 // <- 위 구문과 다르게 long3 은 int 타입.
        var long4 = 1L // <- Long type 으로 들어감.

        btn.setOnClickListener { (alert(test()).show()) }
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
