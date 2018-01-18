package com.yeongsik.kotlinseminar.week2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.yeongsik.kotlinseminar.R
import kotlinx.android.synthetic.main.activity_chapter1.*

class Chapter8Activity : AppCompatActivity() {

    //setter & getter
    //kotlin은 setter/getter method 호출하지 않고, 직접 property 호출 권장
    private var name : String? = ""
        get() = field
        set(value) {
            field = value
        }
    //=> 위 코드는 단순 set,get 이라서 의미가 없음(그냥 property 로 get,set 권장) or *로직 추가*
    //=> 위 코드는 어짜피 name 이 private 이므로 set/get 접근 불가. => class 내에서는 사용가능

    //only getter
    var name2 : String? = ""
        private set(value) {
            field = value
        }
    //=> set/get 관련 private 을 설정 할때는,
    //public 으로 선언 후, set/get 만 따로 접근 제한자 설정.

    //초기화 없이 사용하고 싶을땐 lateinit 키워드 사용
    //책에는 String? 허용, 실제로는 불허 only nonNull
    //만약 초기화가 되지 않고 사용되는 곳이 있다면, UninitializedPropertyAccessException 발생
    lateinit var lateinitName : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.title = "setter/getter"
        setContentView(R.layout.activity_chapter1)
        image.setImageResource(R.drawable.chapter8)
    }
}

/*
fun main(args: Array<String>) {

    class Name {
    	var name : String = ""
        get() {
            println("out")
          	return field+""
        }
        set(value) {
            println("in");
            if(value==null || value.length == 0) {
                "non"
            }else {
                value
            }
        }
    }

    Name().name = ""
    Name().name = "asdf"

    Name().name

    println("Hello, world!")
}

https://try.kotlinlang.org/
에서 온라인으로 테스트 가능.
 */