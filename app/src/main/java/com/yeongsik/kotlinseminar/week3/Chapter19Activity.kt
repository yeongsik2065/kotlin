package com.yeongsik.kotlinseminar.week3

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.yeongsik.kotlinseminar.R
import kotlinx.android.synthetic.main.activity_chapter1.*

class Chapter19Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.title = "널처리 복습3"
        setContentView(R.layout.activity_chapter1)
        image.setImageResource(R.drawable.chapter19)
    }

    //lateinit 키워드
    //dependency injection 을 사용하거나 설계상의 이유로 나중에 초기화를 수행해야 하는경우 사용.
    //하지만 null 포인터의 위험성을 항상 가지게 됨
    fun fun1() {
        lateinit var name : String
    }

    //자바로 작성된 클래스의 널 처리 (중요)
    //자바로 작성된 코드는 어노테이션을 사용하지 않는 이상 무조건 Null 이 가능.
    //그래서 코틀린에서 자바의 클래스를 사용할때는 Person! 같은 ! 가 붙은 타입으로 변환됩니다. (플랫폼 타입 이라고 부름)
    fun fun2() {
        val person = Person()

        val name : String = person.name
        val name2 : String? = person.name

        //위와 같이 nullable, nonNullable 둘다 사용가능.
        //때문에 플랫폼 타입을 사용하는 경우에는 앞에 항상 널값 여부를 확인해줘야 함.
        //그렇지 않으면 NullPointerException 발생.
    }

    //자바 파일에서 어노테이션을 사용한다면 사전에 이런 현상을 막을 수 있음.
    fun fun3() {
        val person = Person()

        //val address : String = person.address //에러 발생 => 자바 파일에서 @Nullable 로 선언했기 때문
        val address2 : String? = person.address

        //위와 같이 nullable, nonNullable 둘다 사용가능.
        //때문에 플랫폼 타입을 사용하는 경우에는 앞에 항상 널값 여부를 확인해줘야 함.
        //그렇지 않으면 NullPointerException 발생.
    }
}
