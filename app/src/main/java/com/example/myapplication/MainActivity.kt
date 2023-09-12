package com.example.myapplication
import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var usernameEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var logginButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        usernameEditText = findViewById(R.id.userTxt)
        passwordEditText = findViewById(R.id.passTxt)
        logginButton = findViewById(R.id.logginBtn)

        logginButton.setOnClickListener{
            validarUsuario()
        }

    }
    private fun validarUsuario(){
        val usuario =usernameEditText.text.toString()
        val clave = passwordEditText.text.toString()

        if(usuario == "profe" && clave == "123456"){
            Toast.makeText(this,"Usuario correcto", Toast.LENGTH_SHORT).show()
            val intent: Intent = Intent(this, MainActivity2:: class.java)
            startActivity(intent)
        }
        else{
            Toast.makeText(this,"Este usuario no existe :c", Toast.LENGTH_SHORT).show()
        }
    }
}