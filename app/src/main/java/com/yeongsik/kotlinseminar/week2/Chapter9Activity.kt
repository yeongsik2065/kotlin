package com.yeongsik.kotlinseminar.week2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.yeongsik.kotlinseminar.R
import kotlinx.android.synthetic.main.activity_chapter1.*

class Chapter9Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.title = "생성자"
        setContentView(R.layout.activity_chapter1)
        image.setImageResource(R.drawable.chapter9)
    }

    //#생성자
    //주생성자 -> 클래스 생성시 만드는 생성자
    //val, var 선언 가능, 접근제어자 선언 가능 => 실제 property
    class LocalName(private val name : String,  val age : Int) {

        lateinit private var address : String

        //기본생성자에서 처리했던 일들 처리가능
        init {
            //주 생성자의 val,var 값 사용 가능.
            Log.d("", "$name and $age")
            //Log.d("", "$address") <- 에러 : 주생성자의 값만 사용가능
        }

        //주생성자가 있을경우, 추가 생성자는 반드시 this() 호출
        //접근 제어자 선언 가능
        private constructor(name : String) : this(name, 0) {
            //do else, 생략 가능
        }

        //추가 생성자는 반드시 this() 호출
        constructor() : this("") {
            //do else , 생략 가능
        }

        //주생성자 외에 추가하고 싶은 필드가 있으면 아래와 같이 선언 가능
        constructor(name : String, age : Int, address : String) : this(name, age) {
            this.address = address
        }
    }

    //주생성자 안쓰면 자바와 비슷하게 처리 가능
    //open 키워드 붙이면 상속 가능(open 안붙이면 final class)
    open class LocalName2 {

        lateinit private var address : String

        lateinit private var name : String
        //lateinit private var age : Int = 0  <- error, lateinit 은 primitive 타입에는 사용할 수 없다.
        private var age : Int = 0

        constructor(name : String, age : Int) {
            this.name = name
            this.age = age
        }

        constructor(name : String) : this(name, 0)

        constructor() : this("", 0)

        //주생성자가 없으면 this() 없는 추가 생성자 가능.
        constructor(name : String, age : Int, address : String) {
            this.name = name
            this.age = age
            this.address = address
        }
    }
}
