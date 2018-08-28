package com.yeongsik.kotlinseminar.week4

import android.app.AlertDialog
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import com.yeongsik.kotlinseminar.R
import kotlinx.android.synthetic.main.activity_chapter1.*

class Chapter23Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.title = "함수2"
        setContentView(R.layout.activity_chapter1)
        image.setImageResource(R.drawable.chapter23)
    }

    fun test() {
        //연산자 오버로딩
        //자바에 없는 연산자 오버로딩 기능이 추가됨
        //기존 연산자 오버로딩이 가능한 언어처럼 비슷하게 선언하여 사용가능

        //새로 만드는 class 에 사용도 가능하고, 기존 class 에 확장 함수로도 사용 가능하다.

        var number = MyNumber(1)
        var number2 = MyNumber(2)
        number = number + number2
        //number += number2 // => error : +연산자와 += 연산자 두개다 포함되는 상황이라 사용 불가
        //+ 와 += 을 동시에 오버로딩 하고 싶으면 복합할당연산자의 인자 타입을 자기 자신의 타입이나
        //Any 타입으로 지정하면 안된다.
    }

    class MyNumber(var number: Int, var isEditable: Boolean = true) {

        //단항 연산자('+','-','++','--','!')
        operator fun unaryPlus(): MyNumber {
            return this
        }

        operator fun unaryMinus(): MyNumber {
            this.number = -this.number
            return this
        }

        operator fun inc(): MyNumber {
                this.number += 1
            return this
        }

        operator fun dec(): MyNumber {
            this.number -= 1
            return this
        }

        operator fun not(): MyNumber {
            this.isEditable = !this.isEditable
            return this
        }

        //이항 연산자('+','-','*','/','%')
        operator fun plus(other: MyNumber) = MyNumber(this.number + other.number, isEditable)

        operator fun minus(other: MyNumber) = MyNumber(this.number - other.number, isEditable)

        operator fun times(other: MyNumber) = MyNumber(this.number * other.number, isEditable)

        operator fun div(other: MyNumber) = MyNumber(this.number / other.number, isEditable)

        operator fun rem(other: MyNumber) = MyNumber(this.number % other.number, isEditable)

        //복합 할당 연산자('+=','-=','*=','/=')
        operator fun plusAssign(other: Any) {
            when (other) {
                is MyNumber -> this.number += other.number
                is Int -> this.number += other
                is Double -> this.number.plus(other)
            }
        }

        operator fun minusAssign(other: Any) {
            when (other) {
                is MyNumber -> this.number -= other.number
                is Int -> this.number -= other
                is Double -> this.number.minus(other)
            }
        }

        operator fun timesAssign(other: Any) {
            when (other) {
                is MyNumber -> this.number *= other.number
                is Int -> this.number *= other
                is Double -> this.number.times(other)
            }
        }

        operator fun divAssign(other: Any) {
            when (other) {
                is MyNumber -> this.number /= other.number
                is Int -> this.number /= other
                is Double -> this.number.div(other)
            }
        }

        operator fun remAssign(other: Any) {
            when (other) {
                is MyNumber -> this.number %= other.number
                is Int -> this.number %= other
                is Double -> this.number.rem(other)
            }
        }

        //비교 연산자
        operator fun compareTo(other: MyNumber): Int {
            return this.number - other.number
        }
    }
}