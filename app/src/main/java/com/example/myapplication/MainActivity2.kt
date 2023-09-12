package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {

    private lateinit var logginButton: Button
    private lateinit var p2Button: Button
    private lateinit var p3Button: Button
    private lateinit var p4Button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        logginButton = findViewById(R.id.btn_2logOut)
        p2Button = findViewById(R.id.btn_p22)
        p3Button = findViewById(R.id.btn_p23)
        p4Button = findViewById(R.id.btn_p24)

        logginButton.setOnClickListener{
            val intent: Intent = Intent(this, MainActivity:: class.java)
            startActivity(intent)
        }
        p2Button.setOnClickListener{
            val intent: Intent = Intent(this, MainActivity3:: class.java)
            startActivity(intent)
        }
        p3Button.setOnClickListener{
            val intent: Intent = Intent(this, MainActivity4:: class.java)
            startActivity(intent)
        }
        p4Button.setOnClickListener{
            val intent: Intent = Intent(this, MainActivity5:: class.java)
            startActivity(intent)
        }

    }




}