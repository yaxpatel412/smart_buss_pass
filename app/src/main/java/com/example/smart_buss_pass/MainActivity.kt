package com.example.smart_buss_pass

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val first =findViewById<Button>(R.id.first)
            first.setOnClickListener {
              val intent = Intent(this,Loginactivity::class.java)
              startActivity(intent)
          }
        val second =findViewById<Button>(R.id.second)
            second.setOnClickListener {
                val intent = Intent(this,Registeractivity::class.java)
                startActivity(intent)
            }

    }
}
