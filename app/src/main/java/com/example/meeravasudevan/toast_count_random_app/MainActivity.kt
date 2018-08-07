package com.example.meeravasudevan.toast_count_random_app

import android.content.Intent
import kotlinx.android.synthetic.main.activity_main.number_text_view
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onToastClick(view: View) {
        val someText = "Yowza"
        val someDuration = Toast.LENGTH_SHORT

        Toast.makeText(this, someText, someDuration).show()
    }

    fun onCountClick(view: View) {
//        get the value of that text view and convert to Int
        var convertTextViewValueToInt = number_text_view.text.toString().toInt()

//        increment the int value
        convertTextViewValueToInt++

//        display the new value in the text view
        number_text_view.text = convertTextViewValueToInt.toString()
    }

    fun onRandomClick(view: View) {
//        create an intent to start the second activity
        val executeRandomActivityIntent = Intent(this, SecondActivity::class.java)

//        TO SEND THE CURRENT COUNT TO THE SECOND ACT
//        1. get the value of the count
        val countValue = number_text_view.text.toString().toInt()
//        2. put extra information when calling the intent
        executeRandomActivityIntent.putExtra(SecondActivity.TOTAL_COUNT, countValue)

//        start the new second activity
        startActivity(executeRandomActivityIntent)
    }
}
