package com.example.mypokedex

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = this.findViewById<Button>(R.id.button);
        val text = this.findViewById<EditText>(R.id.editTextTextPersonName);

        button.setOnClickListener {
            val textValue = text.text

            if(textValue.isNotBlank()){
                val intentView = Intent(this, View::class.java)
                intentView.putExtra("nombre", textValue.toString())

                startActivity(intentView)
            }
        }
    }
}