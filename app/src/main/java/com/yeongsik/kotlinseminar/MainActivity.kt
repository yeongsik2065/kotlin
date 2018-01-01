package com.yeongsik.kotlinseminar

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_week_1.setOnClickListener {
            startActivity(Intent(this, Week1Activity::class.java)) }

        btn_week_2.setOnClickListener {
            startActivity(Intent(this, Week2Activity::class.java)) }
    }
}
