package com.yeongsik.kotlinseminar.week4

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.yeongsik.kotlinseminar.R
import kotlinx.android.synthetic.main.activity_chapter1.*

class Chapter30Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.title = "스트림 함수1"
        setContentView(R.layout.activity_chapter1)
        image.setImageResource(R.drawable.chapter30)
    }

    //스트림 함수
    //map : list 에서 다른 타입의 list 로 변환이 가능하다
    //mapIndexed : index 까지 포함한 list 를 사용하고 싶을때
    //mapNotNull : 변환 값이 null 일경우 제외시킴
    fun test() {
        //String list 에서 String length list 로 바꿔서 출력하는 예제
        val stringList = listOf("hahm", "yeong", "sik")
        stringList.map { it.length }
                .forEach { println("length : $it") }

        stringList.map { it.length }
                .mapIndexed { index, lenght -> println("$index 's lenght : $lenght") }

        stringList.mapNotNull { if (it.length < 3) it.length else null }
                .forEach { println("length : $it") }
    }

    //flatMap : map 과 비슷하나 map 은 타입만 변환된 list 를 하나만 리턴해주지만
    //flatMap 은 각 인자당 하나의 list 를 만들어서 기존 list 의 인자수 만큼 iterable 을 반환한다.
    //List 를 가지는 List, List 를 가지는 Map 등을 꺼내서 구현할 때 좋음
    fun test2() {
        val list = listOf("1", "2", "3")
        val list2 = listOf("4", "5", "6")
        val listOfList = listOf(list, list2)

        listOfList.flatMap { it.asIterable() }
                .forEachIndexed { index, text -> println("$index : $text") }
//    == 출력 결과 ==
//        0 : 1
//        1 : 2
//        2 : 3
//        3 : 4
//        4 : 5
//        5 : 6

        listOfList.forEach { it.forEachIndexed { index, text -> println("$index : $text") } }
//    == 출력 결과 ==
//        0 : 1
//        1 : 2
//        2 : 3
//        0 : 4
//        1 : 5
//        2 : 6

        var index = 0
        listOfList.forEach { it.forEach { text -> println("${index++} : $text") } }
//    == 출력 결과 ==
//        0 : 1
//        1 : 2
//        2 : 3
//        3 : 4
//        4 : 5
//        5 : 6
    }

    //groupBy
    fun test3() {
        val cities = listOf("Se", "Tokyo", "Mountain View")
        cities.groupBy { city ->
            if (city.length >= 7) {
                "A"
            } else if (city.length >= 4) {
                "B"
            } else {
                "C"
            }
        }.forEach { key, cityList -> println("key=$key cityList=$cityList") }
//         == 출력 결과 ==
//        key=C cityList=[Se]
//        key=B cityList=[Tokyo]
//        key=A cityList=[Mountain View]
    }

    //filter
    fun test4() {
        val cities = listOf("Seoul", "Tokyo", "Mountain View")
        cities.filter { city -> city.length >=5 }
                .forEach { println(it) }
    }

    //take
    //takeWhile
    //takeLast
    //takeLastWhile
    //drop()
    //dropWhile
    //dropLast
    //dropLastWhile
    //first
    //last
    //firstOrNull
    //distinct()
    //distinctBy()
}
