package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity4 : AppCompatActivity() {

    private lateinit var logginButton: Button
    private lateinit var p1Button: Button
    private lateinit var p2Button: Button
    private lateinit var p4Button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        logginButton = findViewById(R.id.btn_4logOut);
        p1Button = findViewById(R.id.btn_p41);
        p2Button = findViewById(R.id.btn_p42);
        p4Button = findViewById(R.id.btn_p44);

        logginButton.setOnClickListener{
            val intent: Intent = Intent(this, MainActivity:: class.java)
            startActivity(intent)
        }
        p1Button.setOnClickListener{
            val intent: Intent = Intent(this, MainActivity2:: class.java)
            startActivity(intent)
        }
        p2Button.setOnClickListener{
            val intent: Intent = Intent(this, MainActivity3:: class.java)
            startActivity(intent)
        }
        p4Button.setOnClickListener{
            val intent: Intent = Intent(this, MainActivity5:: class.java)
            startActivity(intent)
        }

    }
}