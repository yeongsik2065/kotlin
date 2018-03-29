package com.yeongsik.kotlinseminar.week3

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.yeongsik.kotlinseminar.R
import kotlinx.android.synthetic.main.activity_chapter1.*

class Chapter17Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.title = "널안전성 복습"
        setContentView(R.layout.activity_chapter1)
        image.setImageResource(R.drawable.chapter17)
    }

    //코틀린은 기본적으로 null 이 될 수 있는지 아닌지,
    //값이 변할수 있는 값인지 아닌지를 변수로 표현이 가능하다 (compiler 단에서 오류검출 가능하다)
    fun test() {
        // ? 키워드
        val name : String = ""     // null 불가능
        val address : String? = null // null 가능

        //parameter 도 같은 형태로 선언
        fun fun0 (name : String, address : String?) {}
        fun0(name, address)


        //널값을 대신하는 엘비스 (?:) 연산자
        // ?: 연산자를 사용하면, 무조건 null 이 아닌 값이 오게끔 validate 할 수 있다.
        var obj : String? = null
        var result : String = obj?: "name" //obj 가 null 이 아니면 obj 를 그대로 반환, null 이면 "name" 을 반환 => (obj != null)? obj : "name"

        //다양한 형태로 ?: 연산자를 사용할 수 있음
        fun fun1() : String? {
            var name : String? = null
            //... (생략)
            val name2 = name ?: return null //바로 return 가능
            return name2
        }
        fun fun2() : String? {
            var name : String? = null
            //... (생략)
            val name2 = name ?: throw IllegalArgumentException() //바로 throw 가능
            return name2
        }

        //널값 확인과 처리를 한번에: 안전한 호출(?.) 연산자 (safe call)
        fun fun3() : Int? {
            var name : String? = null
            return name?.length //name 이 null 이면 null 리턴, 아니면 name.length 리턴

            //아래는 자바코드로 표현한 경우
            //if(name == null){
            //    return name.length;
            //} else {
            //    return name;
            //}
        }
        fun fun4() : Int? {
            var name : String? = null
            return name?.codePointAt(1)?.div(1)?.dec() //null able 한 상황에서 연속으로 사용하여 사용성 극대화.
        }
    }
}
