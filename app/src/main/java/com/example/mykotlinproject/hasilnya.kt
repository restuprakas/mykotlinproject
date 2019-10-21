package com.example.mykotlinproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class hasilnya : AppCompatActivity() {

    lateinit var hasilnya: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hasilnya)

        var intent=intent
        val nama=intent.getStringExtra("Nama")
        val nim=intent.getStringExtra("Nim")
        val nilai=intent.getStringExtra("Nilai")

        if (nilai.toInt()>=80) {
            hasilnya="A"
        }
        if (nilai.toInt()<80 && nilai.toInt()>=60) {
            hasilnya="B"
        }
        if (nilai.toInt()<60 && nilai.toInt()>=40) {
            hasilnya="C"
        }
        if (nilai.toInt()<40 && nilai.toInt()>0) {
            hasilnya="D"
        }
        if (nilai.toInt()==0) {
            hasilnya="E"
        }

        val result =findViewById<TextView>(R.id.result)

        result.text="Nama : "+nama+"\nNim : "+nim+"\nNilai : "+nilai+"\nKeterangan : "+hasilnya


    }
}
