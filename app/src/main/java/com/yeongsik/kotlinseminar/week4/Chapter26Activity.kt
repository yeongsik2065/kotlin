package com.yeongsik.kotlinseminar.week4

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.yeongsik.kotlinseminar.R
import kotlinx.android.synthetic.main.activity_chapter1.*

class Chapter26Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.title = "함수5"
        setContentView(R.layout.activity_chapter1)
        image.setImageResource(R.drawable.chapter26)
    }

    //인라인 함수
    //람다 표현식을 사용하면, 함수를 인자로 넘길 수 있는 고차함수에 들어갈 함수형 인자를 쉽게표현가능
    //단점 -> 컴파일 과정에서 익명 클래스로 변환되므로, 코드 호출시 매번 새로운 객체가 생성되어
    //성능에 영향을 미치게 됨.
    //인라인 함수를 사용하면 매개변수로 받는 함수형 인자의 본체를 해당 인자가 사용되는 부분에 그대로 대입
    //-> 성능 하락 방지 가능
    inline fun doSomething(body : () -> Unit) {
        println("onPreExecute()")
        body()
        println("onPostExecute()")
    }

    fun test7() {
        //아래와 같이 사용하면 실제 컴파일시 doSomething()  은 함수 호출 스택에 쌓이지 않고, 문자열 치환이 됨.
        doSomething { println("do Something") }
        //println("onPreExecute()")
        //println("do Something")
        //println("onPostExecute()")
    }

    //이처럼 inline 으로 선언된 함수의 인자는 직접 inline 으로 들어가는데,
    //만약 인자가 여러개이고, 부분적으로면 inline 으로 사용하고 싶다면 noinline 키워드로 아래와 같이 사용가능하다.
    inline fun doSomething2(body : () -> Unit, noinline body2 : () -> Unit ) {
        println("onPreExecute()")
        body()
        body2()
        println("onPostExecute()")
    }

    fun test8() {
        //아래와 같이 사용하면 실제 컴파일시 doSomething() 은 문자열 치환이 됨.
        doSomething2 (body = { println("do Something") }, body2 = { println("do Something2") })
        //println("onPreExecute()")
        //println("do Something")
        //body2()
        //println("onPostExecute()")
    }

    //코틀린 여타 특징

    //타입 별칭 : 특정 타입을 내가 원하는 이름으로 변경이 가능 => 가독성 높임
    fun printPersonName(peopleList: PeopleList) {
        peopleList.forEach { println("name = ${it.name}") }
    }
    fun printPersonName(peopleList: PeopleInTags) {
        peopleList.forEach { println("name = ${it.value.name}") }
    }
    //아래와 같이 사용할 수 있지만, 인자 타입 중복으로 컴파일 에러 발생
    //fun printPersonName(peopleList: GenericInTags<Person>) {
    //    peopleList.forEach { println("name = ${it.value.name}") }
    //}

    //함수형 타입도 타입별칭 지정 가능하다.
    fun executeByPersonFilter(peopleList : PeopleList, body : PersonFilter) {
        peopleList.filter(body)
                .forEach { println("execute") }
    }
}
//한번 선언하면 다른 클래스에서 선언 불가.
//때문에 타입별칭을 정의한 클래스가 따로 존재하는게 나을 듯.
typealias PeopleList = List<Chapter25Activity.Person>
typealias PeopleInTags = Map<String,Chapter25Activity.Person>
typealias GenericInTags<T> = Map<String,T>

typealias PersonFilter = (Chapter25Activity.Person) -> Boolean
