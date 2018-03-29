package com.yeongsik.kotlinseminar

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.yeongsik.kotlinseminar.week3.*
import kotlinx.android.synthetic.main.activity_week3.*

class Week3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.title = "WEEK 3"
        setContentView(R.layout.activity_week3)

        btn_chapter13.setOnClickListener({
            startActivity(Intent(this, Chapter13Activity::class.java))
        })

        btn_chapter14.setOnClickListener({
            startActivity(Intent(this, Chapter14Activity::class.java))
        })

        btn_chapter15.setOnClickListener({
            startActivity(Intent(this, Chapter15Activity::class.java))
        })

        btn_chapter16.setOnClickListener({
            startActivity(Intent(this, Chapter16Activity::class.java))
        })

        btn_chapter17.setOnClickListener({
            startActivity(Intent(this, Chapter17Activity::class.java))
        })

        btn_chapter18.setOnClickListener({
            startActivity(Intent(this, Chapter18Activity::class.java))
        })

        btn_chapter19.setOnClickListener({
            startActivity(Intent(this, Chapter19Activity::class.java))
        })

        btn_chapter20.setOnClickListener({
            startActivity(Intent(this, Chapter20Activity::class.java))
        })

        btn_chapter21.setOnClickListener({
            startActivity(Intent(this, Chapter21Activity::class.java))
        })
    }
}
