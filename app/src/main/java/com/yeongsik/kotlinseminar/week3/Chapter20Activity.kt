package com.yeongsik.kotlinseminar.week3

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.yeongsik.kotlinseminar.R
import kotlinx.android.synthetic.main.activity_chapter1.*

class Chapter20Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.title = "데이터 클래스 / 한정 클래스"
        setContentView(R.layout.activity_chapter1)
        image.setImageResource(R.drawable.chapter20)
    }

    //데이터 클래스는 기존 자바의 set/get method 를 포함하고 equals, hashCode, toString method 또한 자동 생성.
    data class Person(val name : String, var address : String)

    fun fun1() {
        val yeongsik = Person("yeongsik", "korea")
        val yeongsik2 = Person("yeongsik", "korea")
        val hyomook = Person("hyomook", "korea")

        System.out.println(yeongsik == yeongsik2) // true
        System.out.println(yeongsik == hyomook) //false

        System.out.println(yeongsik.hashCode())

        System.out.println(yeongsik) // "Person(name=yoengsik, address=korea)"
    }

    //한정(sealed) 클래스 (enum class 와 비슷)
    //인스턴스를 여러개 생성할 수 있고, 이를 상속하는 클래스는 한정 클래스로 정의되는 여러 종류 중 하나로 취급 됨.
    sealed class MobileApp (val os: String) {
        class Android(os: String, val packageName: String) : MobileApp(os)
        class IOS(os: String, val bundleName: String) : MobileApp(os)
    }

    fun fun2(app : MobileApp) {
        when(app) {
            is MobileApp.Android -> println(app.packageName)
            is MobileApp.IOS -> println(app.bundleName) // 스마트 캐스팅
            else -> println() //필요 없다고 안내해줌
        }
    }

    //책이랑 다른점
    //상속한 클래스들을 다 처리하지 않으면 컴파일에러 남 => 실제로 나지 않음

    fun fun3(app : MobileApp) {
        when(app) {
            is MobileApp.Android -> println(app.packageName)
            //책에서는 이때 컴파일 에러가 난다고 되어 있음.
        }
    }
}
