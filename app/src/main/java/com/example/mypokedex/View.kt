package com.example.mypokedex

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class View : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view)

        val nombre = intent.getStringExtra("nombre")

        val text = this.findViewById<TextView>(R.id.textView)
        text.setText(nombre)

        val imageView = findViewById<ImageView>(R.id.imageView)
        imageView.setImageResource(R.drawable.bulbasaur)
    }

}