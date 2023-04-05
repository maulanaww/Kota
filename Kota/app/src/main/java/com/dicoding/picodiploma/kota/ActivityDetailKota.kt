package com.dicoding.picodiploma.kota

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class ActivityDetailKota : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_kota)

        val actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)

        val image = intent.getParcelableExtra<Kota>(MainActivity.INTENT_PARCELABLE)

        val imgSrc = findViewById<ImageView>(R.id.gambarDetail)
        val imgTitle = findViewById<TextView>(R.id.titleGambar)
        val imgDesc = findViewById<TextView>(R.id.deskripsiGambar)

        if (image != null) {
            imgSrc.setImageResource(image.gambarSrc)
            imgTitle.text = image.titleGambar
            imgDesc.text = image.deskripsiGambar
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}