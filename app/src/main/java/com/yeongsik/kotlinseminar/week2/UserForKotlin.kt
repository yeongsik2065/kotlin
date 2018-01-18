package com.yeongsik.kotlinseminar.week2

import android.content.Context
import android.util.Log
import android.view.View

class UserForKotlin {
/*
    //접근 제한자
    private var privateName: String? = null //기본 초기화 필요.

    internal var internalName: String? = null //module 단위 허용

    protected var protectedName: String? = null

    var publicName: String? = null //미표기시 기본 public

    private val finalPrivateName: String? = null //val => final 개념 초기화 후 변경 불가.

    internal val finalInternalName: String? = null

    //class 에 아무것도 붙지 않으면 기본 final class -> 상속 불가 -> protected 소용 없음 -> private 으로 변경가능
    //open class 선언시 상속 가능
    protected val finalProtectedName: String? = null

    val finalPublicName: String? = null






    //setter & getter
    //kotlin은 setter/getter method 호출하지 않고, 직접 property 호출 권장
    private var privateName2: String? = ""
        get() = field
        set(value) {
                field = value
        }
    //=> 위 코드는 단순 set,get 이라서 의미가 없음(그냥 property 로 get,set 권장) or 로직 추가
    //=> 위 코드는 어짜피 privateName2 가 private 이므로 set/get 접근 불가.

    //only getter
    var privateName3: String? = ""
    private set(value) {
        field = value
    }
    //=> set/get 관련 private 을 설정 할때는,
    //public 으로 선언 후, set/get 만 따로 접근 제한자 설정.

    //초기화 없이 사용하고 싶을땐 lateinit 키워드 사용
    //책에는 String? 허용, 실제로는 불허 only nonNull
    //만약 초기화가 되지 않고 사용되는 곳이 있다면, UninitializedPropertyAccessException 발생
    lateinit var lateinitName : String



    //#생성자
    //주생성자 -> 클래스 생성시 만드는 생성자
    //val, var 선언 가능, 접근제어자 선언 가능 => 실제 property
    class LocalName(private val name : String,  val age : Int) {

        lateinit private var address : String

        //기본생성자에서 처리했던 일들 처리가능
        init {
            //주 생성자의 val,var 값 사용 가능.
            Log.d("", "$name and $age")
            //Log.d("", "$address") <- 에러 : 주생성자의 값만 사용가능
        }

        //추가 생성자는 반드시 this() 호출
        //접근 제어자 선언 가능
        private constructor(name : String) : this(name, 0) {
            //do else, 생략 가능
        }

        //추가 생성자는 반드시 this() 호출
        constructor() : this("", 0) {
            //do else , 생략 가능
        }

        //주생성자 외에 추가하고 싶은 필드가 있으면 아래와 같이 선언 가능
        constructor(name : String, age : Int, address : String) : this(name, age) {
            this.address = address
        }
    }

    //주생성자 안쓰면 자바와 비슷하게 처리 가능
    //open 키워드 붙이면 상속 가능(open 안붙이면 final class)
    open class LocalName2 {

        lateinit private var name : String
        //lateinit private var age : Int = 0  <- error, lateinit 은 primitive 타입에는 사용할 수 없다.
        private var age : Int = 0

        constructor(name : String, age : Int) {
            this.name = name
            this.age = age
        }

        constructor(name : String) : this(name, 0)

        constructor() : this("", 0)
    }

    //상속 (주생성자 x , 상속 클래스 생성자 x)
    //자바 처럼 여러 super 생성자 호출로 초기화 가능
    class ObjectExtendsLocalName : LocalName2 {
        constructor(name : String) : super(name)
        constructor(name : String, age : Int) : super(name, age)
    }

    //상속 (주생성자 o , 상속 클래스 생성자 o)
    //super 생성자 고정,
    class ObjectExtendsLocalName2() : LocalName2() {
        constructor(name : String) : this()
    }

    //상속 (주생성자 x , 상속 클래스 생성자 o)
    class ObjectExtendsLocalName3 : LocalName2() {
        //constructor 만들 수 없음.
        //super 의 생성자를 초기에 셋팅하려면 상속 받는 class 의 주 생성자가 불려야 한다.
        //때문에 주생성자 없이는 super 생성자를 초기에 쓸 수 없다.
        //하지만 위에 보면 선언은 가능. => 오직 ObjectExtendsLocalName3() 로만 인스턴스 생성가능
        //ex - Chapter0Activity : AppCompatActivity()

        //override 어노테이션(선택)이 사라지고, override keyword 를 꼭 사용해줘야함(강제)
        override fun toString(): String {
            return super.toString() + "2"
        }
    }

    //this 키워드
    class ThisTestClass {
        //goto Chatper7Activity
    }

    //싱글톤
    //코틀린에서는 오브젝트를 이용하여 간편하게 싱글톤 작성 가능
    object SingleTonClass {

        var name : String?

        //constructor() <- error : SingleTon 객체는 constructor 가 필요없다.
        //어느곳이서든 접근이 가능하고(static), 단 하나의 객체만 가진다는 확신만 있으면 됨.
        init {
            //init 은 가능하다.
            name = printName()
            //printName() 을 사용하겠다는 것은 String? 을 꼭 넣겠다는 보장이 있다.
            name = ""
            // 그냥 ""을 대입하는 것은 개발자가 언제든 값을 잘못 넣을 수 있는
        }

        private fun printName() : String? = if(true) "init" else "nonInit"
    }*/
}