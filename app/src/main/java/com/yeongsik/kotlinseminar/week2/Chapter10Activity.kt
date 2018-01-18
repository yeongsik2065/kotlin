package com.yeongsik.kotlinseminar.week2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.yeongsik.kotlinseminar.R
import kotlinx.android.synthetic.main.activity_chapter1.*

class Chapter10Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.title = "상속"
        setContentView(R.layout.activity_chapter1)
        image.setImageResource(R.drawable.chapter10)
    }

    //상속 (주생성자 x , 상속 클래스 생성자 x)
    //자바 처럼 여러 super 생성자 호출로 초기화 가능
    class ObjectExtendsLocalName : Chapter9Activity.LocalName2 {
        constructor(name : String) : super(name)
        constructor(name : String, age : Int) : super(name, age)
    }

    //상속 (주생성자 o , 상속 클래스 생성자 o)
    //super class 의 생성자에 넣고 싶은 인자가 있으면, 정적인 값이나, 주생성자에 넣어서 넘겨줘야함.
    //super 생성자 고정,
    class ObjectExtendsLocalName2(val name : String) : Chapter9Activity.LocalName2(name) {
        lateinit var address : String
        //lateinit var age : Int //error : lateinit 을 primitive 타입에 사용 불가.
        var age : Int = 0
        constructor(name : String, age : Int, address : String) : this("") {
            this.address = address
            this.age = age
        }
    }

    //상속 (주생성자 x , 상속 클래스 생성자 o)
    class ObjectExtendsLocalName3 : Chapter9Activity.LocalName2() {
        //constructor 만들 수 없음.
        //super 의 생성자를 초기에 셋팅하려면 상속 받는 class 의 주 생성자가 불려야 한다.
        //때문에 주생성자 없이는 super 생성자를 초기에 쓸 수 없다.
        //하지만 위에 보면 선언은 가능. => 오직 ObjectExtendsLocalName3() 로만 인스턴스 생성가능
        //constructor 가 필요 없는 class 에 사용 가능 (ex - Chapter0Activity : AppCompatActivity())

        //override 어노테이션(선택)이 사라지고, override keyword 를 꼭 사용해줘야함(강제)
        override fun toString(): String {
            return super.toString() + "2"
        }
    }

    //this 키워드
    var thisName : String = ""
    fun test() {
        var thread = Thread()
        thread.run {
            //this.name2 // this 는  runnable 객체.

            this@Chapter10Activity.thisName
            //자바의 Chapter10Activity.this.thisName 와 같음.
        }
    }
}
