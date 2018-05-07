package com.yeongsik.kotlinseminar

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.yeongsik.kotlinseminar.week4.*
import com.yeongsik.kotlinseminar.week4.Chapter22Activity
import kotlinx.android.synthetic.main.activity_week4.*

class Week4Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.title = "WEEK 4"
        setContentView(R.layout.activity_week4)

        btn_chapter22.setOnClickListener({
            startActivity(Intent(this, Chapter22Activity::class.java))
        })

        btn_chapter23.setOnClickListener({
            startActivity(Intent(this, Chapter23Activity::class.java))
        })

        btn_chapter24.setOnClickListener({
            startActivity(Intent(this, Chapter24Activity::class.java))
        })

        btn_chapter25.setOnClickListener({
            startActivity(Intent(this, Chapter25Activity::class.java))
        })

        btn_chapter26.setOnClickListener({
            startActivity(Intent(this, Chapter26Activity::class.java))
        })

        btn_chapter27.setOnClickListener({
            startActivity(Intent(this, Chapter27Activity::class.java))
        })

        btn_chapter28.setOnClickListener({
            startActivity(Intent(this, Chapter28Activity::class.java))
        })

        btn_chapter29.setOnClickListener({
            startActivity(Intent(this, Chapter29Activity::class.java))
        })

        btn_chapter30.setOnClickListener({
            startActivity(Intent(this, Chapter30Activity::class.java))
        })
    }
}
