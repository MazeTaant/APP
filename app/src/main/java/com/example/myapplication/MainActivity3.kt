package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity3 : AppCompatActivity(){

private lateinit var logginButton: Button
private lateinit var p1Button: Button
private lateinit var p3Button: Button
private lateinit var p4Button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        logginButton = findViewById(R.id.btn_3logOut);
        p1Button = findViewById(R.id.btn_p31);
        p3Button = findViewById(R.id.btn_p33);
        p4Button = findViewById(R.id.btn_p34);

        logginButton.setOnClickListener{
            val intent: Intent = Intent(this, MainActivity:: class.java)
            startActivity(intent)
        }
        p1Button.setOnClickListener{
            val intent: Intent = Intent(this, MainActivity2:: class.java)
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