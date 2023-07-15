package com.example.multiscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Order : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        val TVorder = findViewById<TextView>(R.id.tvOrder)
        val orderofcustomer =intent.getStringExtra(MainActivity.KEY)

        TVorder.text = orderofcustomer.toString()

    }
}