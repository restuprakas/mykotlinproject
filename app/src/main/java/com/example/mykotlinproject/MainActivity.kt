package com.example.mykotlinproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val namaed=findViewById<EditText>(R.id.namaed)
        val nimed=findViewById<EditText>(R.id.nimed)
        val nilaied=findViewById<EditText>(R.id.nilaied)

        val btn_simpan=findViewById<Button>(R.id.btn_simpan)

        btn_simpan.setOnClickListener {
            val nama=namaed.text.toString()
            val nim=nimed.text.toString()
            val nilai=nilaied.text.toString()

            val intent= Intent(this@MainActivity,hasilnya::class.java)

            intent.putExtra("Nama", nama)
            intent.putExtra("Nim", nim)
            intent.putExtra("Nilai", nilai)

            startActivity(intent)
        }
    }
}
