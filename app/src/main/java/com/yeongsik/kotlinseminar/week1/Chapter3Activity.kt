package com.yeongsik.kotlinseminar.week1

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.yeongsik.kotlinseminar.R
import kotlinx.android.synthetic.main.activity_chapter1.*
import org.jetbrains.anko.alert

class Chapter3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chapter1)
        image.setImageResource(R.drawable.chapter3)
        supportActionBar!!.title = "Kotlin 특징 phrase 3"

        /*
     * 7. 중위 표기법 - unit성 method 만들때 용이
     *      => 기존 Java 에서는 Util 성 class 를 생성
     *      => static 이 아닌 실제 객체의 method 로 선언 가능
     */
        fun Int.max(x: Int): Int {
            return if (this > x) this else x
        }

        fun Int.max2(x: Int) = if (this > x) this else x // return type 생략 가능

        /*
         * 8. infix 키워드
         *      => parameter 1개 일때만 사용가능
         */
        infix fun Int.max3(x: Int) = if (this > x) this else x

        2.max(10)
        2.max2(10)
        2 max3 10

        /*
         * 9. Null 안전성
         *      => [ ? ] 키워드를 사용하여 Nullable 가능성을 표시
         *      => [ ?. ] 키워드는 null 이 아닐경우만 값을 리턴하고 나며지는 null 로 리턴
         *      => [ ?: ] 키워드는 null 이 아닐경우만 값을 리턴하고 나며지는 default 값 설정 가능
         */
        fun nullTest() {
            var a: Int = 123;
            //a = null <- Error
            var b: Int? = 123 // ? 물음표 추가 => Null 가능
            b = null

            var result = (b?.div(2)) ?: -1

            result = b ?: -1
            result = b!!.div(2)
        }

        btn.setOnClickListener { (alert("invalid").show()) }
    }
}
