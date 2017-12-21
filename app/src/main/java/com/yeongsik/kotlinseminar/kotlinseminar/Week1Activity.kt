package com.yeongsik.kotlinseminar.kotlinseminar

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.yeongsik.kotlinseminar.kotlinseminar.R
import com.yeongsik.kotlinseminar.kotlinseminar.week1.Chapter1Activity
import kotlinx.android.synthetic.main.activity_week1.*

class Week1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_week1)

        btn_chapter1.setOnClickListener({
            startActivity(Intent(this, Chapter1Activity::class.java))
        })

        btn_chapter2.setOnClickListener({
            startActivity(Intent(this, Chapter1Activity::class.java))
        })

        btn_chapter3.setOnClickListener({
            startActivity(Intent(this, Chapter1Activity::class.java))
        })

        btn_chapter4.setOnClickListener({
            startActivity(Intent(this, Chapter1Activity::class.java))
        })

        btn_chapter5.setOnClickListener({
            startActivity(Intent(this, Chapter1Activity::class.java))
        })

        btn_chapter6.setOnClickListener({
            startActivity(Intent(this, Chapter1Activity::class.java))
        })

        btn_chapter7.setOnClickListener({
            startActivity(Intent(this, Chapter1Activity::class.java))
        })

        btn_chapter8.setOnClickListener({
            startActivity(Intent(this, Chapter1Activity::class.java))
        })

        btn_chapter9.setOnClickListener({
            startActivity(Intent(this, Chapter1Activity::class.java))
        })
    }
}
