package com.yeongsik.kotlinseminar.week1

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.yeongsik.kotlinseminar.R
import kotlinx.android.synthetic.main.activity_chapter0.*

class Chapter0Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chapter0)

        /*
         * Kotlin 이란?
         *
         * 1. InteliJ IDEA 로 유명한 JetBrain 에서 만든 언어
         * 2. 2011년 최초 공개
         * 3. 2016년 1.0 정식 버전 출시
         * 4. 구글 I/O 2017에서 안드로이드 공식 언어 채택 => 서드파티 언어 탈피
         * 5. Android Studio (InteliJ) 에서 사용 편리
         * 6. Null 안정성, 간결한 문법등 높은 생산성을 목표로 제작
         *
         * 코틀린 vs 스칼라    =>   http://gorakgarak.tistory.com/971
         * 코틀린 vs 스위프트  =>   http://www.moreagile.net/2015/06/swift-kotlin.html
         */

        btn1.setOnClickListener({
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://gorakgarak.tistory.com/971"))
            startActivity(intent)
        })

        btn2.setOnClickListener({
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.moreagile.net/2015/06/swift-kotlin.html"))
            startActivity(intent)
        })
    }
}
