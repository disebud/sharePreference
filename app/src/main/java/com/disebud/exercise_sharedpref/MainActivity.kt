package com.disebud.exercise_sharedpref

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun  submit(){
        val sharedPreferences : SharedPreferences = getSharedPreferences("USER_NAME", Context.MODE_PRIVATE)
    }
}