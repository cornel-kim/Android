package com.modcom.mybanks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //set on click listener
        btnEquity.setOnClickListener {
            val i = Intent(this, EquityBank::class.java )
            startActivity(i)

        }
        btnKCB.setOnClickListener {
            val intent = Intent(this, KCBBank::class.java)
            startActivity(intent)
        }
        btnABSA.setOnClickListener {
            val i = Intent(this, ABSABank::class.java)
            startActivity(i)
        }
    }
}