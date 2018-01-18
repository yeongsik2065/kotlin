package com.yeongsik.kotlinseminar.week2

import com.yeongsik.kotlinseminar.week1.User

//자바에서 Kotlin 객체를 static 처럼 사용하기 위한 3가지 장치
//const, @JvmField , @JvmStatic

val staticValue = 1
var user : User = User()
fun staticMethod() {}
//위 3개의 field 및 method 는 package 단위에서 밖에 사용못함.
//Java 에서는 static 처럼 사용하지 못합니다.

class StaticValueMethod {

    //companion object(동반객체)는 java 의 static 처럼 어디서든 사용할 수 있습니다.
    //(접근 제어자 설정 가능)
//    companion object {
//        val staticValue = 1
//        var user : User = User()
//        fun staticMethod() {}
//    }

    //하지만 위처럼 설정하면 Kotlin 에서 밖에 사용하지 못한다.
    //const, @JvmField , @JvmStatic 를 사용하면 Java 코드에서도 사용 가능하다.
    companion object {
        const val staticValue = 1 //const 는 primitive and String 만 사용가능
        @JvmField var user : User = User() //그 외의 객체는 @JvmField 로 대체
        @JvmStatic fun staticMethod() {} //method 의 경우는 @JvmStatic 사용
    }
}