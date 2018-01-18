package com.yeongsik.kotlinseminar.week2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.yeongsik.kotlinseminar.R
import kotlinx.android.synthetic.main.activity_chapter1.*

class Chapter12Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.title = "동반객체"
        setContentView(R.layout.activity_chapter1)
        image.setImageResource(R.drawable.chapter12)
    }
}
