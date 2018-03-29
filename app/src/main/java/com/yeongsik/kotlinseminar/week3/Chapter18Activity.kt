package com.yeongsik.kotlinseminar.week3

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.yeongsik.kotlinseminar.R
import kotlinx.android.synthetic.main.activity_chapter1.*
import org.jetbrains.annotations.Contract

class Chapter18Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.title = "널처리 복습2"
        setContentView(R.layout.activity_chapter1)
        image.setImageResource(R.drawable.chapter18)
    }

    //엘비스(?:) 연산자와 함께 사용하면 널 값을 반환할 때, 대신 사용할 값을 지정가능.
    //아래 로직을 java 로 짜보면 얼마나 if 문이 줄어 드는지 확인 가능.
    fun fun1() {
        data class Address(var line1: String, var line2: String?)
        data class Contact(var name: String, var address: Address?)

        val contact = Contact("", null)

        val line: String = contact.address?.line2 ?: "No address"
    }

    //안전한 자료형 반환 (as?) 키워드
    //캐스팅시에 예외 대신 null 을 리턴하고 싶을때 사용
    fun fun2(): Int? {
        val data: Any = "data"
        return data as? Int
    }

    //널값이 아님을 명시하기 (!!) 키워드
    class Person(val name: String, val address: String?)
    fun fun3(person : Person) : String {
        val name = person.name
        val address = person.address!! // 만약 person.address가 null 이라면 exception 발생.
        return address
    }

    //아래와 같이 !! 를 중첩해서 쓰지말자. 어디 부분에서 틀렸는지 디버깅이 힘들어 진다.
    class Address(var line1: String, var line2: String?)
    class Contact(var name: String, var address: Address?)
    fun fun4(contact : Contact) {
        val line = contact.address!!.line2!! //exception 발생시 address 와 line2 중 어디에서 문제가 있는지 알기 힘들다.
    }
}
