package com.yeongsik.kotlinseminar.week2

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import com.yeongsik.kotlinseminar.R
import kotlinx.android.synthetic.main.activity_chapter1.*

class Chapter7Activity : AppCompatActivity(){

    //접근 제한자
    private var privateName: String? = null //기본 초기화 필요.
    //private String privateName;           //멤버 변수 자동 초기화

    internal var internalName: String? = null //module 단위 허용
    //String packageName;                     //package 단위 허용 => 다른 모듈에서 접근 가능 위험성

    protected var protectedName: String? = null
    //protected String protectedName; //상속 관련

    var publicName: String? = null //미표기시 기본 public
    //public String publicName;

    private val finalPrivateName: String? = null //val => final 개념 초기화 후 변경 불가.
    //final private String finalPrivateName = null;

    internal val finalInternalName: String? = null
    //final String finalPackageName = null;

    //class 에 아무것도 붙지 않으면 기본 final class -> 상속 불가 -> protected 소용 없음 -> private 으로 변경가능
    //open class 선언시 상속 가능
    protected val finalProtectedName: String? = null
    //final protected String finalProtectedName = null;

    val finalPublicName: String? = null
    //final public String finalPublicName = null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.title = "접근 제한자"
        setContentView(R.layout.activity_chapter1)
        image.setImageResource(R.drawable.chapter7)
    }
}