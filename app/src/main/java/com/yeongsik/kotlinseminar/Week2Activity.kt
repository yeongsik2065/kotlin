package com.yeongsik.kotlinseminar

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.yeongsik.kotlinseminar.week1.*
import com.yeongsik.kotlinseminar.week2.*
import kotlinx.android.synthetic.main.activity_week2.*

class Week2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.title = "WEEK 2"
        setContentView(R.layout.activity_week2)

        btn_chapter7.setOnClickListener({
            startActivity(Intent(this, Chapter7Activity::class.java))
        })

        btn_chapter8.setOnClickListener({
            startActivity(Intent(this, Chapter8Activity::class.java))
        })

        btn_chapter9.setOnClickListener({
            startActivity(Intent(this, Chapter9Activity::class.java))
        })

        btn_chapter10.setOnClickListener({
            startActivity(Intent(this, Chapter10Activity::class.java))
        })

        btn_chapter11.setOnClickListener({
            startActivity(Intent(this, Chapter11Activity::class.java))
        })

        btn_chapter12.setOnClickListener({
            startActivity(Intent(this, Chapter12Activity::class.java))
        })
    }
}
