package com.example.ivanov_pr12

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
    }
    fun onClickStepsActivity(view: View){
        val intent = Intent(this, MainActivity5::class.java)
        startActivity(intent)
    }
    fun onClickStepsActivity1(view: View){
        val intent = Intent(this, MainActivity8::class.java)
        startActivity(intent)
    }
}