package com.example.multiscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    companion object{
        const val KEY = "com.example.multiscreen.MainActivity.KEY"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val o1 = findViewById<EditText>(R.id.ED1)
        val o2 = findViewById<EditText>(R.id.ED2)
        val o3 = findViewById<EditText>(R.id.ED3)
        val btn = findViewById<Button>(R.id.btn)

        btn.setOnClickListener {
            val orderPlaced =
                "1 : : " + o1.text.toString() + " 2 : " + o2.text.toString() + "  3 :    " + o3.text.toString()

            intent = Intent(this, Order::class.java)
            intent.putExtra(KEY, orderPlaced)
            startActivity(intent)
        }
    }
}