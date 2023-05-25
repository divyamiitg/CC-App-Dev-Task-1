package com.example.introductionapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val github:ImageView = findViewById(R.id.imageView3)
        val instagram :ImageView = findViewById(R.id.imageView4)
        val linkedin :ImageView = findViewById(R.id.imageView5)

        github.setOnClickListener(View.OnClickListener {
            val githubUrl :Uri =Uri.parse("https://github.com/divyamiitg")
            val intent =Intent(Intent.ACTION_VIEW,githubUrl)
            startActivity(intent)
        })

        instagram.setOnClickListener(View.OnClickListener {
            val instagramUrl :Uri =Uri.parse("https://www.instagram.com/divyam_jain_04/")
            val intent =Intent(Intent.ACTION_VIEW,instagramUrl)
            startActivity(intent)
        })

        linkedin.setOnClickListener(View.OnClickListener {
            val linkedinUrl:Uri=Uri.parse("https://www.linkedin.com/in/divyam-jain-286a74222/")
            val intent = Intent(Intent.ACTION_VIEW,linkedinUrl)
            startActivity(intent)
        })
    }
}