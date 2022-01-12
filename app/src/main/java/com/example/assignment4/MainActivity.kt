package com.example.assignment4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            var a = num1.text.toString()
            var b = num2.text.toString()
            if(a.isEmpty() || b.isEmpty() )
                return@setOnClickListener Toast.makeText(this@MainActivity,"Plase Input Num1 and Num2", Toast.LENGTH_SHORT).show()
            text4.text = "+"
            text6.text = (a.toDouble() + b.toDouble()).toString()
        }
        button2.setOnClickListener {
            var a = num1.text.toString()
            var b = num2.text.toString()
            if(a.isEmpty() || b.isEmpty() )
                return@setOnClickListener Toast.makeText(this@MainActivity,"Plase Input Num1 and Num2", Toast.LENGTH_SHORT).show()
            text4.text = "-"
            text6.text = (a.toDouble() - b.toDouble()).toString()
        }
        button3.setOnClickListener {
            var a = num1.text.toString()
            var b = num2.text.toString()
            if(a.isEmpty() || b.isEmpty() )
                return@setOnClickListener Toast.makeText(this@MainActivity,"Plase Input Num1 and Num2", Toast.LENGTH_SHORT).show()
            text4.text = "*"
            text6.text = (a.toDouble() * b.toDouble()).toString()
        }
        button4.setOnClickListener {
            var a = num1.text.toString()
            var b = num2.text.toString()
            if(a.isEmpty() || b.isEmpty() )
                return@setOnClickListener Toast.makeText(this@MainActivity,"Plase Input Num1 and Num2", Toast.LENGTH_SHORT).show()
            text4.text = "/"
            text6.text = (a.toDouble() / b.toDouble()).toString()
        }
        button5.setOnClickListener {
            var a = num1.text.toString()
            var b = num2.text.toString()
            if(a.isEmpty() || b.isEmpty() )
                return@setOnClickListener Toast.makeText(this@MainActivity,"Plase Input Num1 and Num2", Toast.LENGTH_SHORT).show()
            text4.text = "%"
            text6.text = (a.toDouble() % b.toDouble()).toString()
        }
        button6.setOnClickListener {
            num1.text.clear()
            num2.text.clear()
            text4.text = " "
            text6.text = " "
        }
    }
}