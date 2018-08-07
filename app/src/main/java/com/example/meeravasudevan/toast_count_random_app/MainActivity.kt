package com.example.meeravasudevan.toast_count_random_app

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
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
//        get text view reference
        val textViewById = findViewById(R.id.number_text_view) as TextView

//        get the value of that text view and convert to Int
        var convertTextViewValueToInt = textViewById.text.toString().toInt()

//        increment the int value
        convertTextViewValueToInt++

//        display the new value in the text view
        textViewById.text = convertTextViewValueToInt.toString()
    }
}
