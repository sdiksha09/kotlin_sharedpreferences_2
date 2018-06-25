package com.example.shipra.sharedpreferences_kotlin_example

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mypreference=myPreferences(this)
        var logincount= mypreference.getLoginCount()
        logincount++

        mypreference.setLoginCount(logincount)
        tv_count.text=logincount.toString()
    }
}
