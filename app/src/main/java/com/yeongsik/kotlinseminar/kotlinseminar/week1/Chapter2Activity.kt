package com.yeongsik.kotlinseminar.kotlinseminar.week1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.yeongsik.kotlinseminar.kotlinseminar.R
import kotlinx.android.synthetic.main.activity_chapter2.*
import org.jetbrains.anko.alert

class Chapter2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chapter2)
        supportActionBar!!.title = "Null 안정성"

        btn.setOnClickListener { ( alert( test()?: "invalid" ).show()) }
    }

    private fun test() : String? {
        val stringBuilder = StringBuilder()
        val nullableString  : String?
        val nonNullableString : String = "string" //기본 nonNull, 생략 가능 "string"으로 이미 타입 추론가능

        nullableString = null
        //nonNullableString = null <= error

        stringBuilder.append("1. nullableString $nullableString, nonNullableString : $nonNullableString")

        //로컬 method
        fun returnNullable(nonNullString : String) : String? { //반환 타입에도 똑같이 적용
            return if(nonNullString == "nonNull") nonNullableString else null //if else 문
        }

        stringBuilder.append("2. ${returnNullable("nonNull")}")
        stringBuilder.append("3. ${returnNullable("null")}")

        /**
         * if(obj == null) {} else {} 를 대신하는 연산자 ?:
         */
        stringBuilder.append("4. ${returnNullable("null")?: "null"}") //원하는 값이 null 일 경우, 따로 처리 가능

        fun returnNullable2(nonNullString : String) : String? { //반환 타입에도 똑같이 적용
            var result = returnNullable(nonNullString)?: return null //return 을 사용해서 중간에 결과값 반환까지 가능, throw Exception() 가능.
            result += "2"
            return result
        }
        stringBuilder.append("5. ${returnNullable2("nonNull")}")

        return stringBuilder.toString()
    }
}
