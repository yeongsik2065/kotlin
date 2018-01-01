package com.yeongsik.kotlinseminar

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.yeongsik.kotlinseminar.week1.*
import kotlinx.android.synthetic.main.activity_week1.*

class Week1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.title = "WEEK 1"
        setContentView(R.layout.activity_week1)

        btn_chapter0.setOnClickListener({
            startActivity(Intent(this, Chapter0Activity::class.java))
        })

        btn_chapter1.setOnClickListener({
            startActivity(Intent(this, Chapter1Activity::class.java))
        })

        btn_chapter2.setOnClickListener({
            startActivity(Intent(this, Chapter2Activity::class.java))
        })

        btn_chapter3.setOnClickListener({
            startActivity(Intent(this, Chapter3Activity::class.java))
        })

        btn_chapter4.setOnClickListener({
            startActivity(Intent(this, Chapter4Activity::class.java))
        })

        btn_chapter5.setOnClickListener({
            startActivity(Intent(this, Chapter5Activity::class.java))
        })

        btn_chapter6.setOnClickListener({
            startActivity(Intent(this, Chapter6Activity::class.java))
        })
    }
}
