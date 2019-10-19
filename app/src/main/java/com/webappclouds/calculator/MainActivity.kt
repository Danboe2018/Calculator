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
        if(isNewOp == true){
            etShowValue.setText("")
        }
        isNewOp = false
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

    var op = "*"
    var oldNumber = ""
    var isNewOp = true

    fun butOpEvent(view: View){

        val butSelect = view as Button
        var butClickValue:String=etShowValue.text.toString()
        when(butSelect.id){
            butMultiply.id -> {
                op = "*"
            }
            butDivide.id ->{
                op = "/"
            }
            butPlus.id -> {
                op = "+"
            }
            butMinus.id -> {
                op = "-"
            }
        }
        oldNumber = etShowValue.text.toString()
        isNewOp = true
    }

    fun butEqualEvent(view: View){
        val newNumber = etShowValue.text.toString()
        var finalNumber: Double?= null
        when(op){
            "*"->{
                finalNumber = oldNumber.toDouble() * newNumber.toDouble()
            }
            "/"->{
                finalNumber = oldNumber.toDouble() / newNumber.toDouble()
            }
            "-"->{
                finalNumber = oldNumber.toDouble() - newNumber.toDouble()
            }
            "+"->{
                finalNumber = oldNumber.toDouble() + newNumber.toDouble()
            }
        }
        etShowValue.setText(finalNumber.toString())
        isNewOp = true
    }

    fun butPercent(view:View){
        val number = etShowValue.text.toString().toDouble()

        etShowValue.setText((number / 100).toString())
        isNewOp = true
    }

    fun butClean(view:View){
        etShowValue.setText("0")
        isNewOp = true
    }

}
