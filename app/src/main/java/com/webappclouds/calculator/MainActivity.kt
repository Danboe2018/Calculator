package com.webappclouds.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun butNumberEvent(view: View) {

        val butSelect = view as Button
        var butClickValue: String = etShowValue.text.toString()
        when (butSelect.id) {
            but0.id -> {
                butClickValue += "0"
            }
            but1.id -> {
                butClickValue += "1"
            }
            but2.id -> {
                butClickValue += "2"
            }
            but3.id -> {
                butClickValue += "3"
            }
            but4.id -> {
                butClickValue += "4"
            }
            but5.id -> {
                butClickValue += "5"
            }
            but6.id -> {
                butClickValue += "6"
            }
            but7.id -> {
                butClickValue += "7"
            }
            but8.id -> {
                butClickValue += "8"
            }
            but9.id -> {
                butClickValue += "9"
            }
            butDot.id -> {
                butClickValue += "."
            }
            butPlusMinus.id -> {
                butClickValue = "-$butClickValue"
            }
        }
        
        etShowValue.setText(butClickValue)
    }
}
