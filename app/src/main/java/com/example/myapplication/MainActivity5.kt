package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.os.IResultReceiver._Parcel
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.ProgressBar
import android.widget.RadioButton
import android.widget.RatingBar
import android.widget.Toast

class MainActivity5 : AppCompatActivity() {

    private lateinit var logginButton: Button
    private lateinit var p2Button: Button
    private lateinit var p3Button: Button
    private lateinit var p1Button: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        logginButton = findViewById(R.id.btn_5logOut)
        p2Button = findViewById(R.id.btn_p52)
        p3Button = findViewById(R.id.btn_p53)
        p1Button = findViewById(R.id.btn_p51)

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
        p1Button.setOnClickListener{
            val intent: Intent = Intent(this, MainActivity2:: class.java)
            startActivity(intent)
        }

        val ratingBar: RatingBar = findViewById(R.id.Rtb)
        val progressBar: ProgressBar = findViewById(R.id.progressBar)
        val radioButton1: RadioButton = findViewById(R.id.radioButton1)
        val radioButton2: RadioButton = findViewById(R.id.radioButton2)
        val checkBox: CheckBox = findViewById(R.id.checkBox)

        //progress bar
        progressBar.progress = 20
        progressBar.visibility = View.INVISIBLE

        val rating = ratingBar.rating
        ratingBar.numStars = 5
        ratingBar.setOnRatingBarChangeListener{_,rating, _ ->
            Toast.makeText(this,"Calificacion: $rating", Toast.LENGTH_SHORT).show()
            progressBar.visibility = View.VISIBLE}

        radioButton1.setOnClickListener{ Toast.makeText(this,"Opcion 1 - seleccionada",Toast.LENGTH_SHORT).show()
            progressBar.visibility = View.VISIBLE
        }
        radioButton2.setOnClickListener{ Toast.makeText(this,"Opcion 2 - seleccionada",Toast.LENGTH_SHORT).show()
            progressBar.visibility = View.VISIBLE
        }

        checkBox.setOnCheckedChangeListener{buttonView, ischecked ->
            if(ischecked){
                Toast.makeText(this, "Marcado", Toast.LENGTH_SHORT).show()
                progressBar.visibility = View.VISIBLE
            }
            else{
                Toast.makeText(this, "Desmarcado", Toast.LENGTH_SHORT).show()
                progressBar.visibility = View.INVISIBLE
            }
        }
    }
}