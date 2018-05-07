package com.yeongsik.kotlinseminar.week4

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.yeongsik.kotlinseminar.R
import kotlinx.android.synthetic.main.activity_chapter1.*

class Chapter29Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.title = "컬랙션 생성 함수"
        setContentView(R.layout.activity_chapter1)
        image.setImageResource(R.drawable.chapter29)
    }
    //컬랙션 생성 함수
    fun test4() {
        //배열 - 모든 배열은 크기가 존재해야 함. ArrayIndexOutOfBoundsException 을 신경써야한다.
        val array = arrayOf(1,2,3,4)
        val array2 = arrayOf("1","2","3","4")
        val array3 = emptyArray<String>()
        val array4 = arrayOfNulls<String>(3)

        //자바 원시타입의 배열사용
        val array5 = booleanArrayOf(true, false)
        val array6 = charArrayOf('a','b')
        val array7 = doubleArrayOf(1.0, 2.0)
        val array8 = floatArrayOf(1f,2f)
        val array9 = intArrayOf(1,2)
        val array10 = longArrayOf(1,2)
        val array11 = shortArrayOf(1,2)

        //리스트
        val list = listOf<String>()
        val list2 = listOf(1,2,3,4)
        val list3 = listOf(1)

        val list4 = listOfNotNull<String>()
        val list5 = listOfNotNull(1,2,3,4)

        //mutable 을 제외한 List,Map 들은 읽기전용
        val list6 = mutableListOf<String>()
        val list7 = mutableListOf(1,2,3,4)
        val list8 = mutableListOf(1)

        val list9 = arrayListOf<String>()
        val list10 = arrayListOf(1,2,3,4)

        //맵
        val map = mapOf<String, String>()
        val map2 = mapOf(Pair("1","a"), Pair("2","b"), Pair("3","c"))
        val map3 = mapOf("1" to "a", "2" to "b", "3" to "c")

        val map4 = mutableMapOf<String, String>()
        val map5 = mutableMapOf(Pair("1","a"), Pair("2","b"), Pair("3","c"))
        val map6 = mutableMapOf("1" to "a", "2" to "b", "3" to "c")

        val map7 = hashMapOf<String, String>()
        val map8 = linkedMapOf(Pair("1","a"), Pair("2","b"), Pair("3","c"))
        val map9 = sortedMapOf("1" to "a", "2" to "b", "3" to "c")

        map.keys //Set<String>
        map8.keys//MutableSet<String>

        //집합 : 중복되지 않은 요소들로만 구성된 list
        val set = setOf<String>()
        val set2 = setOf("1","1","2","3")

        val set3 = mutableSetOf<String>()
        val set4 = mutableSetOf("1","1","2","3")

        val set5 = hashSetOf<String>()
        val set6 = linkedSetOf("1","1","2","3")
        val set7 = sortedSetOf("1","1","2","3")
    }
}
