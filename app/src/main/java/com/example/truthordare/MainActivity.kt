package com.example.truthordare

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        StartButton.setOnClickListener{
            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }

    }
    fun toastMe(view: View){
        val myToast = Toast.makeText(this, "Привет мой друг, меня зовут Андрей Колосов и это моё новое приложение!", Toast.LENGTH_LONG)
        myToast.show()
    }
}
