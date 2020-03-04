package com.example.assignmentone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        plusbutton.setOnClickListener {
            if(numOne.text.isEmpty()||numTwo.text.isEmpty()){
                Toast.makeText(applicationContext, "Please enter the numbers",Toast.LENGTH_LONG ).show()}
            else{
                var a:Double=numOne.text.toString().toDouble()
                var b: Double=numTwo.text.toString().toDouble()
                var c: Double
                c=a+b
                result.text=c.toString()
            }
        }
        minusButton.setOnClickListener {
            if(numOne.text.isEmpty()||numTwo.text.isEmpty()){
                Toast.makeText(applicationContext, "Please enter the numbers",Toast.LENGTH_LONG ).show()}
            else{
                var a:Double=numOne.text.toString().toDouble()
                var b: Double=numTwo.text.toString().toDouble()
                var c: Double
                c=a-b
                result.text=c.toString()
            }
        }
        multiply.setOnClickListener {
            if(numOne.text.isEmpty()||numTwo.text.isEmpty()){
                Toast.makeText(applicationContext, "Please enter the numbers",Toast.LENGTH_LONG ).show()}
            else{
                var a:Double=numOne.text.toString().toDouble()
                var b: Double=numTwo.text.toString().toDouble()
                var c: Double
                c=a*b
                result.text=c.toString()
            }
        }
        division.setOnClickListener {
            if(numOne.text.isEmpty()||numTwo.text.isEmpty()){
                Toast.makeText(applicationContext, "Please enter the numbers",Toast.LENGTH_LONG ).show()}
            else{
                var a:Double=numOne.text.toString().toDouble()
                var b: Double=numTwo.text.toString().toDouble()
                var c: Double
                c=a/b
                result.text=c.toString()
            }
        }
        clear.setOnClickListener {
            numOne.setText("")
            numTwo.setText("")

        }

    }
    }

